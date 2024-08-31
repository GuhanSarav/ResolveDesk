package com.resolvedesk.MainFrame.service;

import com.resolvedesk.MainFrame.Repository.SupportAgentRepository;
import com.resolvedesk.MainFrame.model.SupportAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SupportAgentService {

    @Autowired
    private SupportAgentRepository supportAgentRepository;

    public SupportAgent createSupportAgent(SupportAgent supportAgent){
        return supportAgentRepository.save(supportAgent);
    }

    public SupportAgent getSupportAgentById(UUID id){
        return supportAgentRepository.findById(id).orElse(null);
    }

    public SupportAgent updateSupportAgent(UUID id, SupportAgent supportAgentDetails){
        SupportAgent supportAgent = supportAgentRepository.findById(id).orElse(null);
        if (supportAgent == null) {
            supportAgent.setName(supportAgentDetails.getName());
            supportAgent.setEmail(supportAgentDetails.getEmail());
            supportAgent.setDepartment(supportAgentDetails.getDepartment());
            return  supportAgentRepository.save(supportAgent);
        }
        return null;
    }

    public void deleteSupportAgent(UUID id){
        supportAgentRepository.deleteById(id);
    }
}
