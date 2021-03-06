package pwr.ib.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pwr.ib.springdata.repository.entity.Order;
import pwr.ib.springdata.service.OrderService;

@RestController
@RequestMapping("/api/admin/order/")
public class OrderAdminController {

    private OrderService orderService;

    @Autowired
    public OrderAdminController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("")
    public Order add(@RequestBody Order order){
        return orderService.save(order);
    }

    @PutMapping("")
    public Order update(@RequestBody Order order){
        return orderService.save(order);
    }

    @PatchMapping("")
    public void delete(@RequestParam Long index){
        orderService.deleteById(index);
    }
}

