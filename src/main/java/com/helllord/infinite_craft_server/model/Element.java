package com.helllord.infinite_craft_server.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Entity
public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    public final Integer id;

    @Column(unique = true, nullable = false)
    public final String text;

    @Column(nullable = false)
    public final String emoji;
}
