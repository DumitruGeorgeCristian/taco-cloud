package tacos.order.repo.jdbc;

import tacos.order.model.Order;

public interface OrderRepository {

    Order save(Order order);
}
