package pwr.ib.springdata.controller.admin_controller;

import org.springframework.web.bind.annotation.*;
import pwr.ib.springdata.repository.entity.Product;
import pwr.ib.springdata.service.ProductService;

@RestController
@RequestMapping("/api/admin/product/")
public class ProductAdminController {

    private ProductService productService;

    @PostMapping("/product")
    public Product add(@RequestBody Product product){
        return productService.save(product);
    }

    @PutMapping("/product")
    public Product update(@RequestBody Product product){
        return productService.save(product);
    }

    @PatchMapping("/product")
    public void delete(@RequestParam Long index){
        productService.deleteById(index);
    }
}

