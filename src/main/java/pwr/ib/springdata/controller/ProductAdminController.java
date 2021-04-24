package pwr.ib.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pwr.ib.springdata.repository.entity.Product;
import pwr.ib.springdata.service.ProductService;

@RestController
@RequestMapping("/api/admin/product/")
public class ProductAdminController {

    private ProductService productService;


    @Autowired
    public ProductAdminController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("")
    public Product add(@RequestBody Product product){
        return productService.save(product);
    }

    @PutMapping("")
    public Product update(@RequestBody Product product){
        return productService.save(product);
    }

    @PatchMapping("")
    public void delete(@RequestParam Long index){
        productService.deleteById(index);
    }
}

