package core;

import codility.domain.Product;
import codility.domain.ProductNew;

import java.util.Arrays;
import java.util.List;

public class Utils {

    public static List<Product> getProducts() {
        List<Product> productList = Arrays.asList(
                new Product(23, "potatoes", 100),
                new Product(23, "potatoes", 100),
                new Product(14, "orange", 150),
                new Product(13, "lemon", 200),
                new Product(23, "bread", 75),
                new Product(13, "sugar", 745));
        return  productList;
    }

    public static List<ProductNew> getNewProducts() {
        List<ProductNew> productList = Arrays.asList(
                new ProductNew(23, "potatoes", 100),
                new ProductNew(23, "potatoes", 100),
                new ProductNew(14, "orange", 150),
                new ProductNew(13, "lemon", 200),
                new ProductNew(23, "bread", 75),
                new ProductNew(13, "sugar", 745));
        return  productList;
    }
}