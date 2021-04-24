package pwr.ib.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pwr.ib.springdata.repository.entity.Customer;
import pwr.ib.springdata.service.CustomerService;

import java.util.Optional;

@RestController
@RequestMapping("/api/customer/")
public class CustomerController {


    private CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService= customerService;
    }

    @GetMapping("/all")
    public Iterable<Customer> getAll(){
        System.out.println("works");
        return customerService.findAll();
    }

    @GetMapping()
    public Optional<Customer> getById(@RequestParam Long index){
        return customerService.findById(index);
    }

}
