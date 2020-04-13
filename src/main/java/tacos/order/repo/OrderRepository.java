package tacos.order.repo;

import tacos.order.model.Order;

public interface OrderRepository {

    Order save(Order order);
}
