package com.jekajops.fastcasinobot.services.impl;

import com.jekajops.fastcasinobot.models.Bet;
import com.jekajops.fastcasinobot.models.Player;
import com.jekajops.fastcasinobot.models.Room;
import com.jekajops.fastcasinobot.repositories.buisnes.RoomRepository;
import com.jekajops.fastcasinobot.services.RoomService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public boolean create(Room room) {
        return false;
    }

    @Override
    public Room softDelete(UUID uuid) {
        return null;
    }

    @Override
    public Room find(UUID uuid) {
        return null;
    }

    @Override
    public List<Room> findBy(Predicate<Room> matcher) {
        return null;
    }

    @Override
    public List<Room> findAll() {
        return null;
    }

    @Override
    public List<Player> findPlayersOfRoom(UUID roomUUID) {
        return RoomService.super.findPlayersOfRoom(roomUUID);
    }

    @Override
    public boolean updateBankBalanceOfRoom(BigDecimal amount, UUID roomUUID) {
        return false;
    }

    @Override
    public boolean addBetToRoom(Bet bet, UUID roomUUID) {
        return false;
    }

    @Override
    public boolean addAllBetsToRoom(Collection<Bet> bets, UUID roomUUID) {
        return false;
    }

    @Override
    public boolean setState(State state, UUID roomUUID) {
        return false;
    }
}
