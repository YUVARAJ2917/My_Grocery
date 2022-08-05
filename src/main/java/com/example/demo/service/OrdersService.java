package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.DeliveryBoy;
import com.example.demo.entity.Orders;
import com.example.demo.entity.Vendor;
import com.example.demo.repositort.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * @author rmuruganantham 2018-05-05
 */
@Service
public class OrdersService implements IOrdersService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Orders> getAllOrdersByCustomer(Customer customerId, Date date) {
        return orderRepository.findByCustomerId(customerId);
    }

    @Override
    public List<Orders> getAllOrdersByVendor(Vendor vendorID, Date date) {
        return null;
    }

    @Override
    public List<Orders> getAllOrdersByDeliveryBoy(DeliveryBoy deliveryBoyId, Date date) {
        return null;
    }

    @Override
    public Orders createOrder(Orders orders) {
        return orderRepository.save(orders);
    }

    @Override
    public Orders updateOrder(Orders orders) {
        return orderRepository.save(orders);
    }

    @Override
    public boolean cancelOrder(Long orderId) {
        return false;
    }
}