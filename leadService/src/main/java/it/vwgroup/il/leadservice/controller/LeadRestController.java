package it.vwgroup.il.leadservice.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.vwgroup.il.leadservice.service.LeadService;

@RestController
public class LeadRestController {

	private final LeadService leadService;

    public LeadRestController(LeadService leadService) {
        this.leadService = leadService;
    }

//    @PostMapping("/sendLead")
//    @ResponseStatus(HttpStatus.ACCEPTED)
    @PreAuthorize("#oauth2.hasScope('server')")
    @RequestMapping(value = "/sendLead", method = RequestMethod.POST)
    public Boolean sendLead(@RequestBody String message) {
        System.out.println(message);
        leadService.sendLead(System.currentTimeMillis() + ": " + message);

        return true;
    }

    @RequestMapping(value = "/prova", method = RequestMethod.POST)
    public void sendLead() {
       System.out.println("ciao");
	   leadService.sendLead(System.currentTimeMillis() + ": " + "ciao");

    }
}
