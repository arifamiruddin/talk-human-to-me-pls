package com.talkhumantome.talk_human_api.service;

import com.talkhumantome.talk_human_api.model.Jargon;
import com.talkhumantome.talk_human_api.repository.JargonRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class JargonService {

    private final JargonRepository jargonRepository;

    @Autowired
    public JargonService(JargonRepository jargonRepository) {
        this.jargonRepository = jargonRepository;
    }

    // Get all Jargons
    public List<Jargon> getAllJargons() {
        return jargonRepository.findAll();
    }

    // Get a Jargon by ID
    public Jargon getJargonById(int id) {
        Optional<Jargon> optionalJargon = jargonRepository.findById(id);
        return optionalJargon.orElse(null);
    }
}
