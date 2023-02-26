package ma.enset.tp_javaFx_orm.dao;

import ma.enset.tp_javaFx_orm.dao.entities.Product;

import java.util.List;

public interface ProductDao extends Dao<Product>{
    List<Product> findByQuery(String query);
}
