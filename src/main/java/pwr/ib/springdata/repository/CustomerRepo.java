package pwr.ib.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pwr.ib.springdata.repository.entity.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer,Long> {
}
