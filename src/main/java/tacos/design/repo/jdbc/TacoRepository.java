package tacos.design.repo.jdbc;

import tacos.design.model.Taco;

public interface TacoRepository {

    Taco save(Taco taco);
}
