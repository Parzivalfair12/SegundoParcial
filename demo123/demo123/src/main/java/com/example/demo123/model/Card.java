package com.example.demo123.model;

import lombok.Data;

@Data
public class Card {
    int id_card;
    String nombre;
    String numero;
    String tipo;
    int cvv;
    int status;
}
