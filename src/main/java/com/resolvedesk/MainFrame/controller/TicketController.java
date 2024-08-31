package com.resolvedesk.MainFrame.controller;

import com.resolvedesk.MainFrame.model.Ticket;
import com.resolvedesk.MainFrame.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @PostMapping("/tickets")
    public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket){
        Ticket createdTicket = ticketService.createTicket(ticket);
        return ResponseEntity.ok(createdTicket);
    }

    @GetMapping("/tickets/{id}")
    public ResponseEntity<Ticket> getTicket(@PathVariable UUID id){
        Ticket ticket = ticketService.getTicketById(id);
        return ResponseEntity.ok(ticket);
    }

    @GetMapping
    public ResponseEntity<List<Ticket>> getAllTicket(){
        List<Ticket> tickets = ticketService.getAllTickets();
        return ResponseEntity.ok(tickets);
    }

    @PutMapping("/tickets/{id}")
    public ResponseEntity<Ticket> updateTicket(@RequestBody Ticket ticket, @PathVariable UUID id){
        Ticket existingTicket = ticketService.getTicketById(id);
        if (existingTicket != null){
            ticket.setTicketId(id);
            Ticket updatedTicket = ticketService.updateTicket(ticket);
            return ResponseEntity.ok(updatedTicket);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/tickets/{id}")
    public ResponseEntity<Void> deleteTicket(@PathVariable UUID id){
        ticketService.deleteTicket(id);
        return ResponseEntity.noContent().build();
    }
}
