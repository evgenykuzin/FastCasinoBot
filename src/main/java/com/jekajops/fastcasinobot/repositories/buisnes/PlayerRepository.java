package com.jekajops.fastcasinobot.repositories.buisnes;

import com.jekajops.fastcasinobot.models.Player;
import com.jekajops.fastcasinobot.repositories.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlayerRepository extends CrudRepository<UUID, Player> {
}
