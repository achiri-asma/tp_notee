package com.example.msuser.repositories;

import com.example.msuser.entities.virtual_machine;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource
public interface vmRepository extends JpaRepository<virtual_machine,Long> {

    public interface VmRepository extends JpaRepository<virtual_machine, Long> {
        @GetMapping("/api/findById_server")
        @Query("SELECT v.id_vm, v.ram FROM vm v WHERE v.id_server = :ids")
        List<Object[]> findVirtual_machinesById_server(@RequestParam("ids") Long ids);
    }


}
