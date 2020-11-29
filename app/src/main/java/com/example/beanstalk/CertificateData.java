package com.example.beanstalk;

public class CertificateData {
    private String name;
    private String agency;
    private int write_price;
    private int practical_price;

    public CertificateData(String name, String agency, int write_price, int practical_price){
        this.name = name;
        this.agency = agency;
        this.write_price = write_price;
        this.practical_price = practical_price;
    }

    public String getName() {
        return this.name;
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