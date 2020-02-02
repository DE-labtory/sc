package com.delabtory.sc.userupgradepolicy;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int login;

    @Column
    private int recommend;

    @Enumerated(EnumType.ORDINAL)
    private Level level;

    public User(String name) {
        this.name = name;
        this.login = 0;
        this.recommend = 0;
    }

    User(Long id, String name, Level level, int login, int recommend) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.login = login;
        this.recommend = recommend;
    }

    public void upgradeLevel() {
        Level nextLevel = this.level.nextLevel();
        if (nextLevel == null) {
            throw new IllegalStateException(this.level + " - This level cannot be upgraded");
        }
        this.level = nextLevel;
    }
}
