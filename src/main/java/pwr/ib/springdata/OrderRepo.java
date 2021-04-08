package pwr.ib.springdata;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepo  extends CrudRepository<Order,Long> {
}
