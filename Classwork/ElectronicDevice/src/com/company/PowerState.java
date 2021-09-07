package com.company;

import java.time.OffsetDateTime;

public enum PowerState {
    ON("Power usage is high."),
    OFF("Power is off"),
    SUSPEND("Power usage is low");

    private String description;
    private PowerState(String d) {
        description = d;
    }
    public String getDescription() {
        return description;
    }
}
