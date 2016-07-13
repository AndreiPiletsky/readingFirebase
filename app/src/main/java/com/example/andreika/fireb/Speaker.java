package com.example.andreika.fireb;

/**
 * Created by andreika on 13.07.2016.
 */
public class Speaker {
    String about;
    String city;
    String company;
    int id;
    String name;
    String photo;
    String position;

    public Speaker() {
    }

    public Speaker(String about, String city, String company, int id, String photo, String position, String name) {
        this.about = about;
        this.city = city;
        this.company = company;
        this.id = id;
        this.photo = photo;
        this.position = position;
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
