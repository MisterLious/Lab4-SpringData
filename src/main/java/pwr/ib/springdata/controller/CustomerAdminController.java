package pwr.ib.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pwr.ib.springdata.repository.entity.Customer;
import pwr.ib.springdata.service.CustomerService;

@RestController
@RequestMapping("/api/admin/customer/")
public class CustomerAdminController {

        private CustomerService customerService;

    @Autowired
    public CustomerAdminController(CustomerService customerService){
        this.customerService= customerService;
    }
        @PostMapping()
        public Customer add(@RequestBody Customer customer){
            return customerService.save(customer);
        }

        @PutMapping()
        public Customer update(@RequestBody Customer customer){
            return customerService.save(customer);
        }

        @PatchMapping()
        public void delete(@RequestParam Long index){
            customerService.deleteById(index);
        }
}
