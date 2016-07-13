package com.example.andreika.fireb;

/**
 * Created by andreika on 13.07.2016.
 */
public class PartnerAndSponsor {
    String about;
    String company;
    int isPartner;
    String logo;
    String site;

    public PartnerAndSponsor() {
    }

    public PartnerAndSponsor(String about, String company, int isPartner, String logo, String site) {
        this.about = about;
        this.company = company;
        this.isPartner = isPartner;
        this.logo = logo;
        this.site = site;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getIsPartner() {
        return isPartner;
    }

    public void setIsPartner(int isPartner) {
        this.isPartner = isPartner;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
