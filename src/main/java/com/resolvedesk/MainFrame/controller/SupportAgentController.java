package com.resolvedesk.MainFrame.controller;

import com.resolvedesk.MainFrame.model.SupportAgent;
import com.resolvedesk.MainFrame.service.SupportAgentService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class SupportAgentController {

    @Autowired
    private SupportAgentService supportAgentService;

    @PostMapping("/agents")
    public ResponseEntity<SupportAgent> createSupportAgent(@RequestBody SupportAgent supportAgent){
        try {
            SupportAgent createdAgent = supportAgentService.createSupportAgent(supportAgent);
            return ResponseEntity.ok(createdAgent);
        }catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/agents/{id}")
    public ResponseEntity<SupportAgent> getSupportAgent(@PathVariable UUID id){
        SupportAgent agent = supportAgentService.getSupportAgentById(id);
        if (agent != null) {
            return ResponseEntity.ok(agent);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/agents/{id}")
    public ResponseEntity<SupportAgent> updateSupportAgent(@PathVariable UUID id, @RequestBody SupportAgent supportAgent){
        SupportAgent updateAgent = supportAgentService.updateSupportAgent(id, supportAgent);
        if (updateAgent != null) {
            return ResponseEntity.ok(updateAgent);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/agents/{id}")
    public ResponseEntity<Void> deleteSupportAgent(@PathVariable UUID id){
        supportAgentService.deleteSupportAgent(id);
        return ResponseEntity.noContent().build();
    }

}
