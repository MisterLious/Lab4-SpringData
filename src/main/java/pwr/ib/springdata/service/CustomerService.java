package pwr.ib.springdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pwr.ib.springdata.repository.CustomerRepo;
import pwr.ib.springdata.repository.entity.Customer;

import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }

    public Optional<Customer> findById(Long id){
        return customerRepo.findById(id);
    }

    public Iterable<Customer> findAll(){
        return customerRepo.findAll();
    }

    public Customer save(Customer customer){
        return customerRepo.save(customer);
    }

    public void deleteById(Long id){
        customerRepo.deleteById(id);
    }

    @EventListener (ApplicationReadyEvent.class)
    public void fillDB() {
    }
}
