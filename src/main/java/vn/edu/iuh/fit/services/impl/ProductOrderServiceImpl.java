package vn.edu.iuh.fit.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entity.ProductOrder;
import vn.edu.iuh.fit.repository.ProductOrderRepository;
import vn.edu.iuh.fit.services.ProductOrderService;

import java.time.LocalDateTime;

@Service
public class ProductOrderServiceImpl implements ProductOrderService {
    @Autowired
    private ProductOrderRepository productOrderRepository;

    @Override
    public void createProductOrder(Long productId, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setProductId(productId);
        productOrder.setQuantity(quantity);
        productOrder.setOrderDate(LocalDateTime.now());
        productOrderRepository.save(productOrder);
    }
}
