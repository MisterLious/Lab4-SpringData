package pwr.ib.springdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import pwr.ib.springdata.repository.OrderRepo;
import pwr.ib.springdata.repository.entity.Order;

import java.util.Optional;

public class OrderService {

    private OrderRepo orderRepo;

    @Autowired
    public OrderService(OrderRepo orderRepo){
        this.orderRepo = orderRepo;
    }

    public Optional<Order> findById(Long id){
        return orderRepo.findById(id);
    }

    public Iterable<Order> findAll(){
        return orderRepo.findAll();
    }

    public Order save(Order order){
        return orderRepo.save(order);
    }

    public void deleteById(Long id){
        orderRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
    }
}
