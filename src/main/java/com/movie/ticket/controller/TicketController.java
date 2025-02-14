package com.movie.ticket.controller;

import com.movie.ticket.model.Ticket;
import com.movie.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @RequestMapping("/tickets")
    public List<Ticket> getAll(){
        return ticketService.getTickets();
    }

    @GetMapping("/tickets/{ticketId}")
    public Ticket getTicket(@PathVariable int ticketId){
        return ticketService.getTicket(ticketId);
    }

    @PostMapping("/tickets")
    public void addTicket(@RequestBody Ticket ticket){
        ticketService.addTicket(ticket);
    }

    @PutMapping("/tickets")
    public void updateTicket(@RequestBody Ticket ticket){
        ticketService.updateTicket(ticket);
    }

    @DeleteMapping("/tickets/{ticketId}")
    public void deleteTicket(@PathVariable int ticketId){
        ticketService.deleteTicket(ticketId);
    }
}
