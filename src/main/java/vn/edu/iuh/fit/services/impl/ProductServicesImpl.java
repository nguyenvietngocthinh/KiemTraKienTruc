package vn.edu.iuh.fit.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entity.Product;
import vn.edu.iuh.fit.repository.ProductRepository;
import vn.edu.iuh.fit.services.ProductOrderService;
import vn.edu.iuh.fit.services.ProductService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServicesImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductOrderService productOrderService;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(Long productId) {
        return productRepository.findById(productId);
    }

    @Override
    public boolean placeOrder(Long productId, int quantity) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            if (product.getQuantity() >= quantity) {
                // Đủ số lượng để đặt hàng
                product.setQuantity(product.getQuantity() - quantity);
                productRepository.save(product);
                productOrderService.createProductOrder(productId, quantity);
                return true;
            }
        }
        return false;
    }
}
