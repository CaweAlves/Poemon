package com.cawe.poemon.service;

import com.cawe.poemon.model.Poemon;
import com.cawe.poemon.repositories.PoemonRepostory;
import org.springframework.stereotype.Service;

@Service
public class PoemonService {

    final PoemonRepostory poemonRepository;

    public PoemonService(PoemonRepostory poemonRepository) {
        this.poemonRepository = poemonRepository;
    }

    public Poemon save(Poemon poemon){
        return poemonRepository.save(poemon);
    }
}
