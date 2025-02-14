package com.movie.ticket.service;

import com.movie.ticket.model.Ticket;
import com.movie.ticket.repository.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    TicketRepo ticketRepo;

    public List<Ticket> getTickets(){
        return ticketRepo.findAll();
    }

    public Ticket getTicket(int ticketId) {
        return ticketRepo.findById(ticketId).orElse(new Ticket());
    }

    public void addTicket(Ticket ticket) {
        ticketRepo.save(ticket);
    }

    public void updateTicket(Ticket ticket) {
        ticketRepo.save(ticket);
    }

    public void deleteTicket(int ticketId) {
        ticketRepo.deleteById(ticketId);
    }
}
