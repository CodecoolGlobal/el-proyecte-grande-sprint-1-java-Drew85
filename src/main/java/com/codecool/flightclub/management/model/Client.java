package com.codecool.flightclub.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private String name;
    @Id
    private Integer id;
    @ManyToOne
    private Club club;

    public Client(String name, int id, Club club) {
        this.name = name;
        this.id = id;
        this.club = club;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Club getClub() {
        return club;
    }

    public void setId(int id) {
        this.id = id;
    }
}
