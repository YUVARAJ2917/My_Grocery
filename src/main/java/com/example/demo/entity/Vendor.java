package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author rmuruganantham 2018-05-05
 */
@Entity
@Table(name = "VENDOR")
public class Vendor implements Serializable {
    private static final long serialVersionUID = -3838986853180655677L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vendor_id")
    private long vendorId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;

    @Column(name = "name")
    private String name;

    public long getVendorId() {
        return vendorId;
    }

    public void setVendorId(long vendorId) {
        this.vendorId = vendorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}