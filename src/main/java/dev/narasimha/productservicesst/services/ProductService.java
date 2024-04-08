package dev.narasimha.productservicesst.services;

import dev.narasimha.productservicesst.models.Product;
import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getSingleProduct(Long id);

    Product createProduct(Product product);
}
