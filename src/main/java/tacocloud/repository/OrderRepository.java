package tacocloud.repository;

import tacocloud.model.TacoOrder;


public interface OrderRepository {
    TacoOrder save(TacoOrder tacoOrder);

}