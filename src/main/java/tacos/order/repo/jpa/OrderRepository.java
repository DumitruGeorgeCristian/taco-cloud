package tacos.order.repo.jpa;

import org.springframework.data.repository.CrudRepository;
import tacos.order.model.Order;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByZip(String zip);

    List<Order> findByZipAndPlacedAtBetween(String zip, Date startDate, Date endDate);
}
