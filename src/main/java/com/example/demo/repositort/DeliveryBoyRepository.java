package com.example.demo.repositort;

import com.example.demo.entity.DeliveryBoy;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author rmuruganantham 2018-05-05
 */
public interface DeliveryBoyRepository extends CrudRepository<DeliveryBoy, Long>{

    List<DeliveryBoy> findByName(String name);
}
