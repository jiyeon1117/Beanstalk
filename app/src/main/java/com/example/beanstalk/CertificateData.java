package com.example.beanstalk;

public class CertificateData {
    private String event;
    private String name;
    private String part;
    private String agency;
    private int write_price;
    private int practical_price;

    public CertificateData(String event, String name, String part, String agency, int write_price, int practical_price){
        this.event = event;
        this.name = name;
        this.part = part;
        this.agency = agency;
        this.write_price = write_price;
        this.practical_price = practical_price;
    }

    public String getEvent() {
        return this.event;
    }

    public String getName() {
        return this.name;
    }

    public String getPart() {
        return this.part;
    }

    public String getAgency() {
        return this.agency;
    }

    public int getWrite_price() {
        return this.write_price;
    }

    public int getPractical_price() {
        return this.practical_price;
    }
}