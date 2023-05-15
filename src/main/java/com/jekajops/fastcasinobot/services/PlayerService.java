package com.jekajops.fastcasinobot.services;

import com.jekajops.fastcasinobot.models.Player;
import com.jekajops.fastcasinobot.services.CrudService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
public interface PlayerService extends CrudService<Player> {
    boolean updatePlayerBalance(BigDecimal amount, UUID playerUUID);

    boolean updateName(String name, UUID playerUUID);

    List<Player> findPlayersByRoom(UUID roomUUID);
}
