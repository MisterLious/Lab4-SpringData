package pwr.ib.springdata.controller.admin_controller;

import org.springframework.web.bind.annotation.*;
import pwr.ib.springdata.repository.entity.Order;
import pwr.ib.springdata.service.OrderService;

@RestController
@RequestMapping("/api/admin/order/")
public class OrderAdminController {

    private OrderService orderService;

    @PostMapping("/order")
    public Order add(@RequestBody Order order){
        return orderService.save(order);
    }

    @PutMapping("/order")
    public Order update(@RequestBody Order order){
        return orderService.save(order);
    }

    @PatchMapping("/order")
    public void delete(@RequestParam Long index){
        orderService.deleteById(index);
    }
}

