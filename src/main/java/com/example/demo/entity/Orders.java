package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author rmuruganantham 2018-05-05
 */
@Entity
@Table(name = "ORDERS")
/*@NamedQueries({
        @NamedQuery(name = "findOrdersByCustomerIdAndStartDateAndEndDate",
                query = "SELECT o FROM Orders o " +
                        "WHERE o.customerId = :customerId " +
                        "AND o.orderDate >= :startDate " +
                        "AND o.orderDate <= :endDate "),
        @NamedQuery(name = "findOrdersByVendorIdStartDateAndEndDate",
                query = "SELECT o FROM Orders o " +
                        "WHERE o.vendor_id = :vendorId " +
                        "AND c.order_Date >= :startDate " +
                        "AND c.order_Date <= :endDate "),
        @NamedQuery(name = "findOrdersByDeliveryBoyIdStartDateAndEndDate",
                query = "SELECT o FROM Orders o " +
                        "WHERE o.delivery_Boy_Id = :deliveryBoyId " +
                        "AND o.order_Date >= :startDate " +
                        "AND c.order_Date <= :endDate ")
})*/
public class Orders implements Serializable {

    private static final long serialVersionUID = 6636848751376270379L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Order_id")
    private long orderId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private List<OrderLine> orderLineId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_Boy_Id", referencedColumnName = "delivery_Boy_Id")
    private DeliveryBoy deliveryBoyId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vendor_Id", referencedColumnName = "vendor_Id")
    private Vendor vendorId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customerId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address addressId;

    @Column(name = "comment")
    private String comment;

    @Column(name = "order_status")
    private OrderStatus orderStatus;

    @Column(name = "order_Date")
    private Date orderDate;

    @Column(name = "delivery_time")
    private Date deliveryTime;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public List<OrderLine> getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(List<OrderLine> orderLineId) {
        this.orderLineId = orderLineId;
    }

    public DeliveryBoy getDeliveryBoyId() {
        return deliveryBoyId;
    }

    public void setDeliveryBoyId(DeliveryBoy deliveryBoyId) {
        this.deliveryBoyId = deliveryBoyId;
    }

    public Vendor getVendorId() {
        return vendorId;
    }

    public void setVendorId(Vendor vendorId) {
        this.vendorId = vendorId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
