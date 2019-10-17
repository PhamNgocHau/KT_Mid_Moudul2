package vn.codegym.controller.reponsitory;

import vn.codegym.controller.model.Product;

public interface ProductRepository extends GeneralReponsitory<Product> {
    void add(Product product);

    void edit(int id , Product product);

    void remote(int id);

    Product search(String name);

    void sortDescending();

    void sortAscending();
}
