package study.developia.shop.domain.order;

import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Order {
    @EmbeddedId
    private OrderNumber id;

    @Version
    private Long version;
}
