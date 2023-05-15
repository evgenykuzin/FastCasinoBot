package com.jekajops.fastcasinobot.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Table(name = "bets")
@Entity(name = "bets")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    UUID uuid;

    @ManyToOne
    Player player;

    @ManyToOne
    Room room;

    BigDecimal betValue;
}
