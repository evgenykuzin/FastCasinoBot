package com.jekajops.fastcasinobot.services.impl;

import com.jekajops.fastcasinobot.models.Player;
import com.jekajops.fastcasinobot.repositories.buisnes.PlayerRepository;
import com.jekajops.fastcasinobot.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

@Service
public class PlayerServiceImpl implements PlayerService {

   private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public boolean create(Player player) {
        return false;
    }

    @Override
    public Player softDelete(UUID uuid) {
        return null;
    }

    @Override
    public Player find(UUID uuid) {
        return null;
    }

    @Override
    public List<Player> findBy(Predicate<Player> matcher) {
        return null;
    }

    @Override
    public List<Player> findAll() {
        return null;
    }

    @Override
    public boolean updatePlayerBalance(BigDecimal amount, UUID playerUUID) {
        return false;
    }

    @Override
    public boolean updateName(String name, UUID playerUUID) {
        return false;
    }

    @Override
    public List<Player> findPlayersByRoom(UUID roomUUID) {
        return null;
    }
}
