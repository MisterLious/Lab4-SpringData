package pwr.ib.springdata.controller.admin_controller;

import org.springframework.web.bind.annotation.*;
import pwr.ib.springdata.repository.entity.Customer;
import pwr.ib.springdata.service.CustomerService;

@RestController
@RequestMapping("/api/admin/customer/")
public class CustomerAdminController {

        private CustomerService customerService;

        @PostMapping("/customer")
        public Customer add(@RequestBody Customer customer){
            return customerService.save(customer);
        }

        @PutMapping("/customer")
        public Customer update(@RequestBody Customer customer){
            return customerService.save(customer);
        }

        @PatchMapping("/customer")
        public void delete(@RequestParam Long index){
            customerService.deleteById(index);
        }
}
