package com.resolvedesk.MainFrame.service;

import com.resolvedesk.MainFrame.Repository.TicketRepository;
import com.resolvedesk.MainFrame.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public Ticket createTicket(Ticket ticket){
        ticket.setDateSubmitted(LocalDateTime.now());
        ticket.setStatus("Open");
        return ticketRepository.save(ticket);
    }

    public Ticket getTicketById(UUID id){
        try {
            return ticketRepository.findById(id).orElseThrow(()-> new Exception("Ticket mot found"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Ticket> getAllTickets(){
        return ticketRepository.findAll();
    }

    public Ticket updateTicket(Ticket updatedTicket){
        return ticketRepository.save(updatedTicket);
    }

    public void deleteTicket(UUID id){
        ticketRepository.deleteById(id);
    }
}
