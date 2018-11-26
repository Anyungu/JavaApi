package com.anyunguc.apot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anyunguc.apot.entities.Apottest;
import com.anyunguc.apot.services.ApottestServices;


@RestController
public class ApottestController {

    @Autowired
    private ApottestServices apottestServices;

    @RequestMapping(value="/clientDetails", method = RequestMethod.GET)
    public Optional getClient(@RequestParam("id") Long id) {
        return apottestServices.findParticularClient(id);

    }

    @RequestMapping(value="/clients", method= RequestMethod.GET)
    public List getAllClients() {
        return apottestServices.getAllClients();
    }

    @RequestMapping(value="/clientCreate", method = RequestMethod.POST)
    public void createClient(@RequestBody Apottest client) {
    	apottestServices.createClient(client);
    }

    @RequestMapping(value="/clientDelete", method = RequestMethod.DELETE)
    public void deleteClient(@RequestParam("id") Long id) {
    	apottestServices.deleteClientRecord(id);
    }

    @RequestMapping(value="/clientUpdate", method = RequestMethod.PUT)
    public void updateClient(@RequestBody Apottest client, @RequestParam("id") Long clientId) {
    	apottestServices.updateClientRecord(client, clientId);
    }

}
