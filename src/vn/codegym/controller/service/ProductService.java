package vn.codegym.controller.service;

import vn.codegym.controller.model.Product;

public interface ProductService extends GeneralService<Product> {
    void add (Product product);

    void edit(int id, Product product);

    void remove(int id  );

    Product search(String name);

    void sortDescending();

    void sortAscending();
}
