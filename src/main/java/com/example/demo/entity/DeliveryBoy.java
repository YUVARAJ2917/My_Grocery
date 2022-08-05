package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author rmuruganantham 2018-05-05
 */
@Entity
@Table(name = "DELIVERY_BOY")
public class DeliveryBoy implements Serializable{

    private static final long serialVersionUID = 1539342689423231861L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "delivery_Boy_Id")
    private long deliveryBoyId;

    @Column(name = "phone_Number")
    private String phoneNumber;

    @Column(name = "name")
    private String name;

    public long getDeliveryBoyId() {
        return deliveryBoyId;
    }

    public void setDeliveryBoyId(long deliveryBoyId) {
        this.deliveryBoyId = deliveryBoyId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
