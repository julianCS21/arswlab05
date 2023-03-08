/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blueprints.controllers;

import java.awt.*;
import java.util.*;
import java.util.List;

import com.google.gson.Gson;
import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintsPersistence;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author hcadavid
 */
@RestController
public class BlueprintAPIController {


    @Autowired
    private BlueprintsServices bps;



    @GetMapping(path = "/blueprints", produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getBlueprints() throws BlueprintNotFoundException {
        Set<Blueprint> bp = bps.getAllBluePrints();
        return new ResponseEntity<>(new Gson().toJson(bp), HttpStatus.OK);
    }
    
    
    
    
    
}

