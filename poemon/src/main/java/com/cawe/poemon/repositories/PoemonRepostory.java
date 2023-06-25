package com.cawe.poemon.repositories;

import com.cawe.poemon.model.Poemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PoemonRepostory extends JpaRepository<Poemon, UUID> {

}
