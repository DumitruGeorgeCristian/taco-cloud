package tacos.design.repo.jpa;

import org.springframework.data.repository.CrudRepository;
import tacos.design.model.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
