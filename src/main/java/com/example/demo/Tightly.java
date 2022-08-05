package com.example.demo;

public class Tightly {

    public static void main(String args){
        Employe e =new Employe();
        e.getAddress();
    }
}
class Employe {
    Addres address;

    public Addres getAddress(){
        address = new Addres();
        address.area = "thiruverkadu";
        address.building="krita";
        address.flatname="s8";
        address.pincode=600126;
        return address;
    }
}

class Addres{
    String flatname;
    String building;
    String area;
    int pincode;
}