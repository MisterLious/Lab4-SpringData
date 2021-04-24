package pwr.ib.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import pwr.ib.springdata.repository.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer,Long> {
}
