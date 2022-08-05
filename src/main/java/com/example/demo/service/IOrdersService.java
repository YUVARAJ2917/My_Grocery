package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.DeliveryBoy;
import com.example.demo.entity.Orders;
import com.example.demo.entity.Vendor;

import java.util.Date;
import java.util.List;

/**
 * @author rmuruganantham 2018-05-05
 */
public interface IOrdersService {

    List<Orders> getAllOrdersByDeliveryBoy(DeliveryBoy deliveryBoyId, Date date);

    List<Orders> getAllOrdersByCustomer(Customer customerId, Date date);

    List<Orders> getAllOrdersByVendor(Vendor vendorID, Date date);

    Orders createOrder(Orders orders);

    Orders updateOrder(Orders orders);

    boolean cancelOrder(Long orderId);

}
