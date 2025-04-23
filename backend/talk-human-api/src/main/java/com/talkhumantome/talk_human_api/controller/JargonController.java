package com.talkhumantome.talk_human_api.controller;

import com.talkhumantome.talk_human_api.model.Jargon;
import com.talkhumantome.talk_human_api.service.JargonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jargon")
public class JargonController {

    private final JargonService jargonService;

    @Autowired
    public JargonController(JargonService jargonService) {
        this.jargonService = jargonService;
    }

    @GetMapping
    public ResponseEntity<List<Jargon>> getAllJargons() {
        List<Jargon> jargons = jargonService.getAllJargons();
        return new ResponseEntity<>(jargons, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jargon> getJargonById(@PathVariable int id) {
        Jargon jargon = jargonService.getJargonById(id);
        if (jargon == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(jargon, HttpStatus.OK);
    }
}
