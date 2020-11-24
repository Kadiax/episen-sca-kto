package com.kadiax.episen.controller;

import com.kadiax.episen.dao.OrderDao;
import com.kadiax.episen.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
public class OrderController {

    @Autowired
    private OrderDao orderDao;



    //ajouter un produit
    @PostMapping(value = "/add/order")
    public Order add_order(@RequestBody  Order order) {
        return  orderDao.saveWithLogger(order);
    }

}
