package com.movie.ticket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Entity
public class Ticket {

    @Id
    private int id;
    private String movieName;
    private String theatre;
    private int numTickets;
    private List<String> seatNum;

    public int getId() {
        return id;
    }
    public String getMovieName() {
        return movieName;
    }

    public String getTheatre() {
        return theatre;
    }

    public int getNumTickets() {
        return numTickets;
    }

    public List<String> getSeatNum() {
        return seatNum;
    }

    public Ticket() {
    }

    public Ticket(int id, String movieName, String theatre, int numTickets, List<String> seatNum) {
        this.id=id;
        this.movieName = movieName;
        this.theatre = theatre;
        this.numTickets = numTickets;
        this.seatNum = seatNum;
    }
}
