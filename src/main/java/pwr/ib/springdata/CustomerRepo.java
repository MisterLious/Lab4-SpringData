package pwr.ib.springdata;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer,Long> {
}
