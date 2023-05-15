package com.jekajops.fastcasinobot.repositories.buisnes;

import com.jekajops.fastcasinobot.models.Room;
import com.jekajops.fastcasinobot.repositories.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoomRepository extends CrudRepository<UUID, Room> {
}
