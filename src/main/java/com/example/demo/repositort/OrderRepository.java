package com.example.demo.repositort;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

/**
 * @author rmuruganantham 2018-05-05
 */
public interface OrderRepository extends CrudRepository<Orders, Long> {

 //   List<Orders> findOrdersByCustomerIdAndStartDateAndEndDate(Long customerId, Date startDate, Date endDate);

  //  List<Orders> findOrdersByVendorIdStartDateAndEndDate(Long vendorId, Date startDate, Date endDate);

   // List<Orders> findOrdersByDeliveryBoyIdStartDateAndEndDate(Long deliveryBoyId, Date startDate, Date endDate);

    List<Orders> findByDeliveryBoyId(long deliveryBoyID);

    List<Orders> findByVendorId(long vendorId);

    List<Orders> findByCustomerId(Customer customerId);
}
