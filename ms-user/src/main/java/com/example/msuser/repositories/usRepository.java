package com.example.msuser.repositories;

import com.example.msuser.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;


public interface usRepository extends JpaRepository<user,Long> {
}
