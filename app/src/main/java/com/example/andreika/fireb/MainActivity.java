package com.example.andreika.fireb;


import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.andreika.fireb.Schedule.Schedule;
import com.example.andreika.fireb.Schedule.ScheduleSpeaker;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.database.DatabaseError;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button setButton = (Button) findViewById(R.id.sentButton);
        final EditText messageText = (EditText) findViewById(R.id.messageText);
        ListView messageList = (ListView) findViewById(R.id.messageList);

        Firebase.setAndroidContext(this);
        final Firebase ref = new Firebase("https://proekt-e870e.firebaseio.com/");
        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChatMessage chat = new ChatMessage("put", messageText.getText().toString());
                ref.child("mess").push().setValue(chat);
                messageText.setText("");

            }
        });

       ref.child("schedule").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
//                ChatMessage msg =dataSnapshot.getValue(ChatMessage.class);
//                System.out.println(msg.getMessage());  //prints "Do you have data? You'll love Firebase."

                for (DataSnapshot postSnapshot: dataSnapshot.getChildren()) {
                    Schedule  msg =dataSnapshot.getValue(Schedule.class);
                    System.out.println(msg.getHall().getId());  //prints "Do you have data? You'll love Firebase."
                }

                // Gorod_it msg =dataSnapshot.getValue(Gorod_it.class);
                //  System.out.println(msg.getEmail());  //prints "Do you have data? You'll love Firebase."
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }


        });


    }
}

