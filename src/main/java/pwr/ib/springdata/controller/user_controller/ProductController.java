package pwr.ib.springdata.controller.user_controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pwr.ib.springdata.repository.entity.Product;
import pwr.ib.springdata.service.ProductService;

import java.util.Optional;

@RestController
@RequestMapping("/api/product/")
public class ProductController {


    private ProductService productService;

    @GetMapping("/all")
    public Iterable<Product> getAll(){
        return productService.findAll();
    }

    @GetMapping()
    public Optional<Product> getById(@RequestParam Long index){
        return productService.findById(index);
    }

}
