package com.jekajops.fastcasinobot.bot.scenarios;

import com.jekajops.fastcasinobot.bot.answer.Answer;
import com.jekajops.fastcasinobot.bot.answer.SimpleTextAnswerImpl;
import com.jekajops.fastcasinobot.models.Room;
import com.jekajops.fastcasinobot.services.RoomService;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;

@Component
public class CreateRoomScenario implements Scenario<String> {

    @Autowired
    private final RoomService roomService;
    private final Room room;

    public CreateRoomScenario(RoomService roomService) {
        this.roomService = roomService;
        this.room = new Room();
    }

    @Override
    public Step getStep() {
        return FillStep.builder()
                .dataSetter(Room::setName)
                .nextStep(FillStep.builder()
                        .dataSetter(Room::setDescription)
                        .nextStep(new CreateRoomStep())
                        .build())
                .build();
    }

    public class FillStep implements Step {
        private final UUID stepUUID;
        private final Step nextStep;
        private final BiConsumer<Room, String> dataSetter;

        @Builder
        private FillStep(BiConsumer<Room, String> dataSetter, Step nextStep) {
            this.stepUUID = UUID.randomUUID();
            this.dataSetter = dataSetter;
            this.nextStep = nextStep;
        }

        @Override
        public UUID stepUUID() {
            return stepUUID;
        }

        @Override
        public <S> Answer execute(S o) {
            dataSetter.accept(room, (String) o);
            return new SimpleTextAnswerImpl("data saved");
        }

        @Override
        public Optional<Step> nextStep() {
            return Optional.ofNullable(nextStep);
        }
    }

    public class CreateRoomStep implements Step {
        private final UUID stepUUID;

        @Builder
        private CreateRoomStep() {
            this.stepUUID = UUID.randomUUID();
        }

        @Override
        public UUID stepUUID() {
            return stepUUID;
        }

        @Override
        public <S> Answer execute(S o) {
            roomService.create(room);
            return new SimpleTextAnswerImpl("room created");
        }

        @Override
        public Optional<Step> nextStep() {
            return Optional.empty();
        }
    }
}
