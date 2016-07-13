package com.example.andreika.fireb;

/**
 * Created by andreika on 13.07.2016.
 */
public class Gorod_it {

    String about, address, trolley, contact, mobile_phone, email,bus;

    public Gorod_it() {
    }

    public Gorod_it(String about, String address, String trolley, String contact, String mobile_phone, String email, String bus) {
        this.about = about;
        this.address = address;
        this.trolley = trolley;
        this.contact = contact;
        this.mobile_phone = mobile_phone;
        this.email = email;
        this.bus = bus;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTrolley() {
        return trolley;
    }

    public void setTrolley(String trolley) {
        this.trolley = trolley;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }
}
