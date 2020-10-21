package com.kadiax.episenscaktofrontend.controller;

import com.kadiax.episenscaktofrontend.model.Order;
import com.kadiax.episenscaktofrontend.services.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String showNewOrderPage(Model model) {
        Order order = new Order();
        model.addAttribute("order", order);

        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("order") Order order) {

        orderService.create(order);

        return "redirect:/";
    }
}
