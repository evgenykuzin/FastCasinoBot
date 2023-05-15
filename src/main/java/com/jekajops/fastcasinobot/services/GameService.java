package com.jekajops.fastcasinobot.services;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import com.jekajops.fastcasinobot.models.Bet;
import com.jekajops.fastcasinobot.models.Player;
import com.jekajops.fastcasinobot.models.Room;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
public abstract class GameService {
    protected final RoomService roomService;
    protected final PlayerService playerService;
    protected final BetService betService;

    public GameService(RoomService roomService, PlayerService playerService, BetService betService) {
        this.roomService = roomService;
        this.playerService = playerService;
        this.betService = betService;
    }

    public abstract boolean startGame(UUID roomUUID);

    public Winner chooseWinner(UUID roomUUID) {
        Room room = roomService.find(roomUUID);
        List<Bet> bets = room.getBets();
        BigDecimal bankBalance = room.getBankBalance();
        BigDecimal gain = calculateGainWithCommissionPercent(bankBalance, getCommissionPercent());
        Bet winnerBet = chooseWinnerBet(bets);
        return new Winner(winnerBet.getPlayer(), gain);
    }

    protected abstract BigDecimal getCommissionPercent();

    protected abstract BigDecimal calculateGainWithCommissionPercent(BigDecimal amount, BigDecimal commissionPercent);

    protected abstract Bet chooseWinnerBet(List<Bet> bets);

    @Getter
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
    public static class Winner {
        Player player;
        BigDecimal gainValue;
    }
}
