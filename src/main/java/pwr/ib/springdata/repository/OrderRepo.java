package pwr.ib.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pwr.ib.springdata.repository.entity.Order;

@Repository
public interface OrderRepo  extends CrudRepository<Order,Long> {
}
