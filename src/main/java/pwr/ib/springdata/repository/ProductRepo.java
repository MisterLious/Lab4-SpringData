package pwr.ib.springdata.repository;


import org.springframework.data.repository.CrudRepository;
import pwr.ib.springdata.repository.entity.Product;

public interface ProductRepo extends CrudRepository<Product,Long> {
}
