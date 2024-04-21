package com.example.msserver.api_controller;

import com.example.msserver.entities.server;
import com.example.msserver.model.virtual_machine;
import com.example.msserver.proxy.vmProxy;
import com.example.msserver.repositories.svRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class api {
    @Autowired
    private svRepository serverRepository;
    @Autowired
    private vmProxy vmp;

    @GetMapping("/findById")
    public Optional<server> findById(@RequestParam("ids") Long ids) {
        return serverRepository.findById(ids);
    }

    @GetMapping("/srv/{ids}")
    public List<Object[]>  getServer(@PathVariable("ids") Long ids){
        List<Object[]> s=vmp.getVms(ids);
        return s;
    }
}
