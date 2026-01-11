package tacocloud.repository;

import tacocloud.model.TacoOrder;

import java.util.Optional;


public interface OrderRepository {
    TacoOrder save(TacoOrder tacoOrder);
    Optional<TacoOrder> findById(Long id);

}