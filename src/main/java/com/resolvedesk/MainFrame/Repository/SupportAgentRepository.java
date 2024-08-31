package com.resolvedesk.MainFrame.Repository;

import com.resolvedesk.MainFrame.model.SupportAgent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SupportAgentRepository extends JpaRepository<SupportAgent, UUID> {
}
