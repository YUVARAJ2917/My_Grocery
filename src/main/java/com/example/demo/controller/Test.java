package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.repositort.DeliveryBoyRepository;
import com.example.demo.service.ICustomerService;
import com.example.demo.service.IOrdersService;
import com.example.demo.service.IProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

import static javax.servlet.http.HttpServletResponse.*;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@Api(value = "Client backend Sample Authentication", description = "Service to authenticate iOS and Android App users.")
public class Test {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    @Autowired
    private IProductService iProductService;

    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private IOrdersService iOrdersService;

    @Autowired
    private DeliveryBoyRepository deliveryBoyRepository;

    @ApiOperation(
            produces = APPLICATION_JSON_VALUE,
            value = "Handles User Login Requests")
    @ApiResponses({
            @ApiResponse(code = SC_OK, message = "Ok"),
            @ApiResponse(code = SC_UNAUTHORIZED, message = "Invalid Credentials"),
            @ApiResponse(code = SC_INTERNAL_SERVER_ERROR, message = "Internal Server Error")
    })

    @GetMapping(produces = APPLICATION_JSON_VALUE,path = "/productList")
    //@RequestMapping(method = RequestMethod.GET, path =  "/productList", produces = APPLICATION_JSON_VALUE)
    public String authenticateUser() {

        Address address = new Address();
        address.setApartmentName("s");
        address.setCity("s");
        address.setLandmark("g");
        address.setPlotNo("f");
        address.setSecondaryPhoneNumber("f");
        address.setStreetName("f");

        Address address1 = new Address();
        address1.setApartmentName("s");
        address1.setCity("s");
        address1.setLandmark("g");
        address1.setPlotNo("f");
        address1.setSecondaryPhoneNumber("f");
        address1.setStreetName("f");

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(address);
        arrayList1.add(address1);

        Customer customer = new Customer();
        customer.setAddress(arrayList1);
        customer.setFirstName("d");
        customer.setLastName("sd");
        customer.setPassword("gd");
        customer.setUserName("ff");

        Customer customer1 = new Customer();
        customer1.setAddress(arrayList1);
        customer1.setFirstName("raja");
        customer1.setLastName("sd");
        customer1.setPassword("gd");
        customer1.setUserName("ff");

       iCustomerService.addCustomer(customer1);
       iCustomerService.addCustomer(customer1);

        String empName;

        customer.setUserName("Success");

        iCustomerService.updateCustomer(customer);

        iCustomerService.getCustomer("ff","gd");

        SubCategory subCategory = new SubCategory();
        subCategory.setPrice(12);
        subCategory.setQuantity(2);
        subCategory.setWight(2);

        SubCategory subCategory1 = new SubCategory();
        subCategory1.setPrice(12);
        subCategory1.setQuantity(2);
        subCategory1.setWight(2);

        ArrayList arrayList = new ArrayList<>();
        arrayList.add(subCategory);
        arrayList.add(subCategory1);

        Product product = new Product();
        product.setAliasName("Alias");
        product.setSubCategoryList(arrayList);
        product.setImageId("imgid");
        product.setInStock(true);
        product.setOfferPercentage(4);
        product.setOfferPrice(100);
        product.setProductName("successs");
        iProductService.addProduct(product);

        product.setProductName("Success");

        iProductService.updateProduct(product);
        iProductService.deleteProduct(product);
        iProductService.getAllProducts();

        DeliveryBoy deliveryBoy = new DeliveryBoy();
        deliveryBoy.setName("rrr");
        deliveryBoy.setPhoneNumber("232223");

        deliveryBoyRepository.save(deliveryBoy);

        Vendor vendor = new Vendor();
        vendor.setName("ven");
        vendor.setAddress(address1);

        OrderLine  orderLine = new OrderLine();
        orderLine.setPrice(233);
        orderLine.setProductImgId("sdfdfdf");
        orderLine.setProductName("rddd");
        orderLine.setQuantity(12);
        orderLine.setSubcategoryName("sdsdf");
        orderLine.setWeight(23);

        ArrayList<OrderLine> orderLineList = new ArrayList();
        orderLineList.add(orderLine);

        Orders orders = new Orders();
        orders.setOrderStatus(OrderStatus.DELIVERED);
        orders.setDeliveryTime(new Date());
        orders.setAddressId(address);
        orders.setComment("Comment");
        orders.setCustomerId(customer);
        orders.setDeliveryBoyId(deliveryBoy);
        orders.setVendorId(vendor);
        orders.setOrderLineId(orderLineList);
        orders.setOrderDate(new Date());


        Orders orders1 = iOrdersService.createOrder(orders);

        orders1.setComment("sddf");

        iOrdersService.updateOrder(orders1);

        iOrdersService.getAllOrdersByCustomer(orders1.getCustomerId(), new Date());
        iOrdersService.getAllOrdersByDeliveryBoy(orders1.getDeliveryBoyId(), new Date());
        iOrdersService.getAllOrdersByVendor(orders1.getVendorId(), new Date());


        return null;
    }
}