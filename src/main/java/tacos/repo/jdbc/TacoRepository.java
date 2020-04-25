package tacos.repo.jdbc;

import tacos.model.Taco;

public interface TacoRepository {

    Taco save(Taco taco);
}
