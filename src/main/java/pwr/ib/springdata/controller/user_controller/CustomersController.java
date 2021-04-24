package pwr.ib.springdata.controller.user_controller;

import org.springframework.web.bind.annotation.*;
import pwr.ib.springdata.repository.entity.Customer;
import pwr.ib.springdata.service.CustomerService;

import java.util.Optional;

@RestController
@RequestMapping("/api/customer/")
public class CustomersController {


    private CustomerService customerService;

    @GetMapping("/all")
    public Iterable<Customer> getAll(){
        return customerService.findAll();
    }

    @GetMapping()
    public Optional<Customer> getById(@RequestParam Long index){
        return customerService.findById(index);
    }

}
