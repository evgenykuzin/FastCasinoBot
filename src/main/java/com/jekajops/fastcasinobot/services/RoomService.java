package com.jekajops.fastcasinobot.services;

import com.jekajops.fastcasinobot.models.Bet;
import com.jekajops.fastcasinobot.models.Player;
import com.jekajops.fastcasinobot.models.Room;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public interface RoomService extends CrudService<Room> {
    default List<Player> findPlayersOfRoom(UUID roomUUID) {
        return find(roomUUID)
                .getBets()
                .stream()
                .map(Bet::getPlayer)
                .collect(Collectors.toList());
    }

    boolean updateBankBalanceOfRoom(BigDecimal amount, UUID roomUUID);

    boolean addBetToRoom(Bet bet, UUID roomUUID);

    boolean addAllBetsToRoom(Collection<Bet> bets, UUID roomUUID);

    boolean setState(State state, UUID roomUUID);

    enum State {
        CREATED,
        READY,
        STARTED,
        DONE
    }
}
