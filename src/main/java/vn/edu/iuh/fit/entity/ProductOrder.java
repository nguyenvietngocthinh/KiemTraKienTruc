package vn.edu.iuh.fit.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "product_orders")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private int quantity;
    private LocalDateTime orderDate;
}
