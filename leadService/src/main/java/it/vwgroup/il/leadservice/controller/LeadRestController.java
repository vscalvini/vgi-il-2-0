package it.vwgroup.il.leadservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import it.vwgroup.il.leadservice.service.LeadService;

@RestController
public class LeadRestController {

	private final LeadService leadService;

    public LeadRestController(LeadService leadService) {
        this.leadService = leadService;
    }

    @PostMapping("/sendLead")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Boolean sendLead(@RequestBody String message) {
        System.out.println(message);
        leadService.sendLead(System.currentTimeMillis() + ": " + message);

        return true;
    }
}
