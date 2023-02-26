package ma.enset.tp_javaFx_orm.service;

import ma.enset.tp_javaFx_orm.dao.CategoryDaoImpl;
import ma.enset.tp_javaFx_orm.dao.ProductDaoImpl;
import ma.enset.tp_javaFx_orm.dao.entities.Category;
import ma.enset.tp_javaFx_orm.dao.entities.Product;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        CatalogueService catalogueService = new CatalogueServiceImpl(new ProductDaoImpl(), new CategoryDaoImpl());
        Category c1 = new Category();
        c1.setName("Gaming");
        c1.setId(1);

        Product p1 = new Product();
        p1.setName("MSI");
        p1.setReference("REF002");
        p1.setPrice(23000);
        p1.setCategory(c1);
        //catalogueService.addProduct(p1);

        List<Product> products = catalogueService.getAllProducts();
        for (Product p : products){
            System.out.println("ID : " + p.getId() +
                    "Nom : " + p.getName());
        }
    }
}
