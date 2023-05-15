package com.jekajops.fastcasinobot.services.impl;

import com.jekajops.fastcasinobot.models.Bet;
import com.jekajops.fastcasinobot.models.Player;
import com.jekajops.fastcasinobot.models.Room;
import com.jekajops.fastcasinobot.repositories.buisnes.BetRepository;
import com.jekajops.fastcasinobot.services.BetService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

@Service
public class BetServiceImpl implements BetService {

    private final BetRepository betRepository;

    public BetServiceImpl(BetRepository betRepository) {
        this.betRepository = betRepository;
    }

    @Override
    public Bet findBetByPlayer(Player player) {
        return null;
    }

    @Override
    public List<Bet> findAllBetsByPlayer(Player player) {
        return null;
    }

    @Override
    public List<Bet> findBetsOfRoom(Room room) {
        return null;
    }

    @Override
    public boolean create(Bet bet) {
        return false;
    }

    @Override
    public Bet softDelete(UUID uuid) {
        return null;
    }

    @Override
    public Bet find(UUID uuid) {
        return null;
    }

    @Override
    public List<Bet> findBy(Predicate<Bet> matcher) {
        return null;
    }

    @Override
    public List<Bet> findAll() {
        return null;
    }
}
