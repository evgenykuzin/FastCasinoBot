package com.jekajops.fastcasinobot.services.impl;

import com.jekajops.fastcasinobot.models.Bet;
import com.jekajops.fastcasinobot.services.BetService;
import com.jekajops.fastcasinobot.services.GameService;
import com.jekajops.fastcasinobot.services.PlayerService;
import com.jekajops.fastcasinobot.services.RoomService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class SimpleGameServiceImpl extends GameService {
    private final Random random = new Random();

    public SimpleGameServiceImpl(RoomService roomService, PlayerService playerService, BetService betService) {
        super(roomService, playerService, betService);
    }

    @Override
    public boolean startGame(UUID roomUUID) {

        return false;
    }

    @Override
    protected BigDecimal getCommissionPercent() {
        return BigDecimal.valueOf(5);
    }

    @Override
    protected BigDecimal calculateGainWithCommissionPercent(BigDecimal amount, BigDecimal commissionPercent) {
        return amount.add(amount.divide(BigDecimal.valueOf(100), RoundingMode.DOWN)
                .multiply(commissionPercent)
                .multiply(BigDecimal.valueOf(-1)));
    }

    @Override
    protected Bet chooseWinnerBet(List<Bet> bets) {
        return bets.get(random.nextInt(bets.size()));
    }
}
