package com.example.demo;

public class Loosly {

    public static void main(String args){


        Address office = new Address();
        office.area = "mapedu";
        office.building="krita";
        office.flatname="s8";
        office.pincode=600126;

        Address hotel = new Address();
        office.area = "thiruverkadu";
        office.building="krita";
        office.flatname="s8";
        office.pincode=600126;

        //Constructor based
        Employee e = new Employee(office);

        //Getter setter based
        //Employee e =new Employee();
        //e.setAddress(office);

        e.getAddress();
    }
}
class Employee {
    private Address address;

    Employee(Address address){
        this.address = address;
    }

   public Address getAddress(){
       return address;
   }
   public void  setAddress(Address address){
        this.address = address;
    }
}


class Address{
    String flatname;
    String building;
    String area;
    int pincode;
}