package vn.edu.iuh.fit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import vn.edu.iuh.fit.entity.Product;
import vn.edu.iuh.fit.entity.ProductOrder;
import vn.edu.iuh.fit.services.ProductOrderService;
import vn.edu.iuh.fit.services.ProductService;

import java.util.Optional;

@Controller
public class ProductOrderController {
    @Autowired
    private ProductService productService;

    private ProductOrderService productOrderService;

    @PostMapping("/placeOders")
    public ResponseEntity<String> placeOrder(@RequestBody ProductOrder productOrder){
        return null;
    }
}
