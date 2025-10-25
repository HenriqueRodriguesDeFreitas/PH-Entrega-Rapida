package com.vortex.EntregaRapida.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "transportadora")
public class Transportadora {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
}
