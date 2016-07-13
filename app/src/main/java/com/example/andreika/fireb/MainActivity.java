package com.example.andreika.fireb;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


import com.example.andreika.fireb.POJO.Options;
import com.example.andreika.fireb.POJO.Schedule.Schedule;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;


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

        ref.child("options").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
//

//                Gorod_it gorod_it = dataSnapshot.getValue(Gorod_it.class);


                  Options opt = dataSnapshot.getValue(Options.class);


             //   System.out.println(dataSnapshot.getValue());


                // Schedule msg = dataSnapshot.getValue(Schedule.class);
//                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
//                    // PartnerAndSponsor partnerAndSponsor = postSnapshot.getValue(PartnerAndSponsor.class);
//                    Schedule schedule = postSnapshot.getValue(Schedule.class);
//
//                    System.out.println(schedule.getHall().getName());
//
//                    //Speaker speaker = postSnapshot.getValue(Speaker.class);
//
////                    System.out.println(speaker.getCompany());
//                }

                // Gorod_it msg =dataSnapshot.getValue(Gorod_it.class);
                //  System.out.println(msg.getEmail());  //prints "Do you have data? You'll love Firebase."
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }


        });


    }
}

