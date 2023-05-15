package com.jekajops.fastcasinobot.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Table(name = "rooms")
@Entity(name = "rooms")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    UUID uuid;

    @Column
    String name;

    @Column
    String description;

    @Column
    Integer playersCount;

    @Column
    BigDecimal bankBalance;

    @OneToMany
    @ToString.Exclude
    List<Bet> bets;

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    public List<Bet> getBets() {
        return bets;
    }
}
