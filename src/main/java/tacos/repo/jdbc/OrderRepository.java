package tacos.repo.jdbc;

import tacos.model.Order;

public interface OrderRepository {

    Order save(Order order);
}
