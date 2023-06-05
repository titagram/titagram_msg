package it.tita.titagram.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity //questa è una classe di entità che deve essere mappata su una tabella del database.
@Data //fornisce getter, setter, costruttori, toString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;

    // getters and setters con Lombok ..
}
