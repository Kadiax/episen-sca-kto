package com.kadiax.episenscaktofrontend.services;

import com.kadiax.episenscaktofrontend.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    private RestTemplate restTemplate = new RestTemplate();

    public Order create(Order order){
        ResponseEntity<Order> response =
                restTemplate.postForEntity(
                        "http://orders-back:8080/add/order",
                        order, Order.class);
        return response.getBody();
    }
}
