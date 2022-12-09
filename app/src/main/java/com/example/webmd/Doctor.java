package com.example.webmd;

public class Doctor {

    private int Image;
    private String Name;
    private String Special;
    private int Stars;
    private String Address;
    private String Number;

    public Doctor(int image, String name, String special, int stars, String address, String number) {
        Image = image;
        Name = name;
        Special = special;
        Stars = stars;
        Address = address;
        Number = number;
    }

    public int getImage(){
        return Image;
    }

    public String getName() {
        return Name;
    }

    public String getSpecial() {
        return Special;
    }

    public int getStars() {
        return Stars;
    }

    public String getAddress() {
        return Address;
    }

    public String getNumber(){
        return Number;
    }
}
