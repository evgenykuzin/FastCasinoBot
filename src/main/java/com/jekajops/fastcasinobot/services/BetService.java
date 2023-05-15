package com.jekajops.fastcasinobot.services;

import com.jekajops.fastcasinobot.models.Bet;
import com.jekajops.fastcasinobot.models.Player;
import com.jekajops.fastcasinobot.models.Room;
import com.jekajops.fastcasinobot.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BetService extends CrudService<Bet> {
    Bet findBetByPlayer(Player player);

    List<Bet> findAllBetsByPlayer(Player player);

    List<Bet> findBetsOfRoom(Room room);
}
