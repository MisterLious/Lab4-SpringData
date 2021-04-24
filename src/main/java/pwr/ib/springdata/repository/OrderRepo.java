package pwr.ib.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import pwr.ib.springdata.repository.entity.Order;

public interface OrderRepo  extends CrudRepository<Order,Long> {
}
