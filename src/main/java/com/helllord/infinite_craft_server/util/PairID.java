package com.helllord.infinite_craft_server.util;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Embeddable
public class PairID implements Serializable {
    public final Integer firstId;
    public final Integer secondId;
}
