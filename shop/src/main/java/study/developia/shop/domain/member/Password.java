package study.developia.shop.domain.member;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class Password {
    @Column(name = "password")
    private String value;

    @Builder
    public Password(String value) {
        this.value = value;
    }

    public boolean match(String password) {
        return this.value.equals(password);
    }
}
