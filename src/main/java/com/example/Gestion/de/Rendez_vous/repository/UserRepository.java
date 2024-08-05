package com.example.Gestion.de.Rendez_vous.repository;

import com.example.Gestion.de.Rendez_vous.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
