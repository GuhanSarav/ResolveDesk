package com.resolvedesk.MainFrame.Repository;

import com.resolvedesk.MainFrame.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {
}
