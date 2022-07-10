package br.com.aulaapi.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Telephone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tellid;

    private String number;

    @ManyToOne
    @JoinColumn
    private User userId;
}

