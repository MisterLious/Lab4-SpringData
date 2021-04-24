package pwr.ib.springdata.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pwr.ib.springdata.repository.entity.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product,Long> {
}
