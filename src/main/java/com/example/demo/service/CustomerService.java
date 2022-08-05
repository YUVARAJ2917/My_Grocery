package com.example.demo.service;

import com.example.demo.entity.Address;
import com.example.demo.entity.Customer;
import com.example.demo.repositort.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rmuruganantham 2018-05-04
 */
@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer customer) {
        if (getCustomer(customer.getUserName(), customer.getEmail()).isEmpty()) {
            return customerRepository.save(customer);
        }
        return null;
    }

    @Override
    public List<Customer> getCustomer(String username, String password) {
        return customerRepository.findByUserNameAndPassword(username, password);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        List<Customer> customerList = customerRepository.findByUserNameAndEmail(customer.getUserName(), customer.getEmail());

        Customer existingCustomer = customerList.get(0);
        if (customer.getLastName() != null && !customer.getLastName().isEmpty())
            existingCustomer.setLastName(customer.getLastName());

        if (customer.getFirstName() != null && !customer.getFirstName().isEmpty())
            existingCustomer.setFirstName(customer.getFirstName());

        List<Address> addresses =  existingCustomer.getAddress();
        if(addresses != null && !addresses.isEmpty()){
            Address address = addresses.get(0);
            address.setStreetName(customer.getAddress().get(0).getStreetName());
            address.setSecondaryPhoneNumber(customer.getAddress().get(0).getSecondaryPhoneNumber());
            address.setPlotNo(customer.getAddress().get(0).getPlotNo());
            address.setLandmark(customer.getAddress().get(0).getLandmark());
            address.setAddressType(customer.getAddress().get(0).getAddressType());
            address.setApartmentName(customer.getAddress().get(0).getApartmentName());
            address.setCity(customer.getAddress().get(0).getCity());
            address.setPhoneNumber(customer.getAddress().get(0).getPhoneNumber());
        }

        return customerRepository.save(existingCustomer);
    }
}