package study.developia.shop.domain.order;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class OrderNumber implements Serializable {
    @Column(name = "order_number")
    private String number;

    public OrderNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderNumber that)) return false;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public static OrderNumber of(String number) {
        return new OrderNumber(number);
    }
}
