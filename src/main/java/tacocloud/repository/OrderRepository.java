package tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import tacocloud.model.TacoOrder;

import java.util.Optional;


public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    TacoOrder save(TacoOrder tacoOrder);
    Optional<TacoOrder> findById(Long id);

}