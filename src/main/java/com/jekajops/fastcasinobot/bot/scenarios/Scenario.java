package com.jekajops.fastcasinobot.bot.scenarios;

import java.util.UUID;

public interface Scenario<T> {
    Step getStep();

    default Step findStep(UUID stepUUID) {
        Step step = getStep();
        return find(step, stepUUID);
    }

    private Step find(Step step, UUID stepUUID) {
        if (!stepUUID.equals(step.stepUUID()) && step.nextStep().isPresent()) {
            return find(step.nextStep().get(), stepUUID);
        } else {
            return step;
        }
    }
}
