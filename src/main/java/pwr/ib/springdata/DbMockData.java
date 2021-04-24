package pwr.ib.springdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pwr.ib.springdata.repository.CustomerRepo;
import pwr.ib.springdata.repository.OrderRepo;
import pwr.ib.springdata.repository.ProductRepo;
import pwr.ib.springdata.repository.entity.Customer;
import pwr.ib.springdata.repository.entity.Order;
import pwr.ib.springdata.repository.entity.Product;


import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Component
public class DbMockData {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;
    private CustomerRepo customerRepo;

    @Autowired
    public DbMockData(ProductRepo productRepository, OrderRepo orderRepository, CustomerRepo customerRepository) {
        this.productRepo = productRepository;
        this.orderRepo = orderRepository;
        this.customerRepo = customerRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fill() {
        Product product = new Product("Korek", 2.55f, true);
        Product product1 = new Product("Rura", 5f, true);
        Customer customer1 = new Customer("Jak Kowalski", "Wrocław");
        Customer customer2 = new Customer("Joanna Kowalska", "Wrocław");
        Set<Product> products = new HashSet<>() {
            {
                add(product);
                add(product1);
            }};
        Order order = new Order(customer1, products, LocalDateTime.now(), "in progress");

        productRepo.save(product);
        productRepo.save(product1);
        customerRepo.save(customer1);
        customerRepo.save(customer2);
        orderRepo.save(order);
    }
}