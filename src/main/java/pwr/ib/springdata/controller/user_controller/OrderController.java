package pwr.ib.springdata.controller.user_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pwr.ib.springdata.repository.entity.Order;
import pwr.ib.springdata.service.OrderService;

import java.util.Optional;


@RestController
@RequestMapping("/api/order/")
public class OrderController {

    private OrderService orderService;

    @GetMapping("/all")
    public Iterable<Order> getAll(){
        return orderService.findAll();
    }

    @GetMapping()
    public Optional<Order> getById(@RequestParam Long index){
        return orderService.findById(index);
    }


}
