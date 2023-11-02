package study.developia.shop.domain.member;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Embedded
    private Password password;

    private boolean blocked;


    @Builder
    public Member(String name, Password password, boolean blocked) {
        this.name = name;
        this.password = password;
        this.blocked = blocked;
    }
}
