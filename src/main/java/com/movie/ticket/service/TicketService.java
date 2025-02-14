package com.movie.ticket.service;

import com.movie.ticket.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TicketService {

    List<Ticket> tickets = new ArrayList<>(Arrays.asList(
            new Ticket(1,"GunturKaram", "AMB", 1,Arrays.asList("M18")),
            new Ticket(2,"Devara","Miraj",2,Arrays.asList("H24","H25")),
            new Ticket(3,"Pushpa2","PVR",3,Arrays.asList("I11","I12","I13"))));

    public List<Ticket> getTickets(){
        return tickets;
    }

    public Ticket getTicket(int ticketId) {
        return tickets.stream().filter(p->p.getId()==ticketId).
                findFirst().orElse(new Ticket(ticketId,"NA","NA",0,Arrays.asList("")));
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void updateTicket(Ticket ticket) {
        int index=-1;
        for(int i=0;i< tickets.size();i++)
            if(tickets.get(i).getId()== ticket.getId())
                index=i;
        tickets.add(index,ticket);
    }

    public void deleteTicket(int ticketId) {
        int index=-1;
        for(int i=0;i< tickets.size();i++)
            if(tickets.get(i).getId()== ticketId)
                index=i;
        tickets.remove(index);
    }
}
