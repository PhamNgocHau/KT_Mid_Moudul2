package vn.codegym.controller.service;

import vn.codegym.controller.model.Product;
import vn.codegym.controller.reponsitory.ProductReponsitoryImpl;
import vn.codegym.controller.reponsitory.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository = new ProductReponsitoryImpl();
    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void edit(int id, Product product) {
        productRepository.edit(id,product);
    }

    @Override
    public void remove(int id) {
        productRepository.remote(id);
    }

    @Override
    public Product search(String name) {
        return productRepository.search(name);
    }

    @Override
    public void sortDescending() {
        productRepository.sortDescending();
    }

    @Override
    public void sortAscending() {
        productRepository.sortAscending();
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
