package vn.edu.iuh.fit.services;

import vn.edu.iuh.fit.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> getAllProducts();

    public Optional<Product> getProductById(Long productId);

    public boolean placeOrder(Long productId, int quantity);
}
