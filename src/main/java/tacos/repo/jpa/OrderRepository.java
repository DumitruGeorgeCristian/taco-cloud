package tacos.repo.jpa;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import tacos.model.Order;
import tacos.model.User;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByZip(String zip);

    List<Order> findByZipAndPlacedAtBetween(String zip, Date startDate, Date endDate);

    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}
