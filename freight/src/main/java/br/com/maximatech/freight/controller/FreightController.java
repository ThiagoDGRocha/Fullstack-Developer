package br.com.maximatech.freight.controller;

import br.com.maximatech.freight.service.FreightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class FreightController {

    private FreightService service;
    
    @Autowired
    public FreightController (FreightService service) { this.service = service; }
    
    @GetMapping("/freight/{amount}")
    Double getFreight(@PathVariable Integer amount) {
        return service.getFreight(amount);
    }

}
