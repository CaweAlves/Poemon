package com.cawe.poemon.repositories;

import com.cawe.poemon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepostory extends JpaRepository<User, UUID> {
}
