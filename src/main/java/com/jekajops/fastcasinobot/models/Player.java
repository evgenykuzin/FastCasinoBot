package com.jekajops.fastcasinobot.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Table(name = "players")
@Entity(name = "players")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    UUID uuid;

    String name;

    String tgNickname;

    BigDecimal balance;

    @OneToMany
    @ToString.Exclude
    List<Bet> playersBets;

    @OneToMany
    @ToString.Exclude
    List<Room> playersOwnedRooms;

    @OneToMany
    @ToString.Exclude
    List<Room> playersJoinedRooms;

    public void setPlayersJoinedRooms(List<Room> playersJoinedRooms) {
        this.playersJoinedRooms = playersJoinedRooms;
    }

    public List<Room> getPlayersJoinedRooms() {
        return playersJoinedRooms;
    }

    public void setPlayersOwnedRooms(List<Room> playersOwnedRooms) {
        this.playersOwnedRooms = playersOwnedRooms;
    }

    public List<Room> getPlayersOwnedRooms() {
        return playersOwnedRooms;
    }

    public void setPlayersBets(List<Bet> playersBets) {
        this.playersBets = playersBets;
    }

    public List<Bet> getPlayersBets() {
        return playersBets;
    }
}
