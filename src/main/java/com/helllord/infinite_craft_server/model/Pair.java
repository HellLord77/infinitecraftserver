package com.helllord.infinite_craft_server.model;

import com.helllord.infinite_craft_server.util.PairID;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Entity
public class Pair {
    @EmbeddedId
    public final PairID id;

    @ManyToOne
    @MapsId("firstId")
    @JoinColumn(name = "first_id", nullable = false)
    public final Element first;

    @ManyToOne
    @MapsId("secondId")
    @JoinColumn(name = "second_id", nullable = false)
    public final Element second;

    @ManyToOne
    @JoinColumn(name = "result_id", nullable = false)
    public final Element result;
}
