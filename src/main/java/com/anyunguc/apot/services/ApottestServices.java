package com.anyunguc.apot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anyunguc.apot.entities.Apottest;
import com.anyunguc.apot.repos.ApottestRepository;

@Service
public class ApottestServices {
	
	
	
	@Autowired
    private ApottestRepository appottestRepository;



    public List<Apottest> getAllClients() {

        List<Apottest> Clients = new ArrayList<>();
        appottestRepository.findAll().forEach(Clients::add);
        return Clients;

    }

    public Optional<Apottest> findParticularClient(Long id) {

        return appottestRepository.findById(id);

    }

    public Boolean createClient(Apottest client){
        try{
        	appottestRepository.save(client);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }


    public boolean deleteClientRecord(Long id){
        try{
        	appottestRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }


    public boolean updateClientRecord(Apottest client, Long clientId){
        try{
        	appottestRepository.save(client);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }




}
