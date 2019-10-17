package com.codegym.views;

import vn.codegym.controller.ProductController;
import vn.codegym.controller.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình quản lý sản phẩm");
        ProductController productController = new ProductController();
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    List<Product> productList = productController.getProducts();
                    for (Product product : productList) {
                        System.out.println("ID: " + product.getId() +
                                " NAME: " + product.getName() +
                                " PRICE: " + product.getPrice() +
                                " STATUS: " + product.getStatus() +
                                " DESCRIPTION: " + product.getDescription()
                        );
                    }
                    break;
                }
                case 2: {
                    System.out.println("Thêm mới sản phẩm");
                    Product productObject = inputProduct();
                    productController.addProduct(productObject);
                    break;

                }

                case 3: {
                    System.out.println("Sửa sản phẩm có ID = :  ");
                    int idInput = scanner.nextInt();
                    Product productObject = inputProduct();
                    productController.editProduct(idInput, productObject);
                    break;
                }
                case 4: {
                    System.out.println("Xóa sản phẩm có ID = : ");
                    int idInput = scanner.nextInt();
                    productController.deleteProduct(idInput);
                    break;
                }
                case 5: {
                    System.out.println("Tìm kiếm sản phẩm theo tên là: ");
                    scanner.nextLine();
                    String nameInput = scanner.nextLine();
                    Product nameProduct = productController.searchByName(nameInput);
                    if (nameProduct == null) {
                        System.out.println("Không tìm thấy sản phẩm!" + nameInput);
                    } else {
                        System.out.println("Sản phẩm cần tìm là: " + nameProduct);
                    }
                    break;
                }
                case 6: {
                    System.out.println("Sắp xếp tăng dần theo price");
                    productController.sortDescending();
                    break;
                }
                case 7: {
                    System.out.println("Sắp xếp giảm dần theo price");
                    productController.sortAscending();
                    break;
                }
            }

        } while (choice != 0);
    }

    private static void menu() {
        System.out.println("1. Hiển thị danh sách sản phẩm");
        System.out.println("2. Thêm mới sản phẩm");
        System.out.println("3. Sửa sản phẩm");
        System.out.println("4. Xóa sản phẩm");
        System.out.println("5. Tìm kiếm theo tên sản phẩm");
        System.out.println("6. Sắp xếp tăng dần theo price.");
        System.out.println("7. Sắp xếp giảm dần theo price.");
        System.out.println("0. Thoát");
        System.out.println("Mời Bạn chọn chức năng:");
    }

    private static Product inputProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ID:");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Nhập NAME:");
        String name = input.nextLine();
        System.out.println("Nhập PRICE:");
        float price = input.nextFloat();
        input.nextLine();
        System.out.println("Nhập STATUS:");
        String status = input.nextLine();
        System.out.println("Nhập DESCRIPTION:");
        String description = input.nextLine();

        Product product = new Product(id, name, price, status, description);
        return product;
    }
}
