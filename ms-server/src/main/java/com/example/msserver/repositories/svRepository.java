package com.example.msserver.repositories;

import com.example.msserver.entities.server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;


@RepositoryRestResource
public interface svRepository extends JpaRepository<server,Long> {
  Optional<server> findById(Long ids);

}
