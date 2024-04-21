package com.example.msuser.api;

import com.example.msuser.entities.virtual_machine;
import com.example.msuser.model.server;
import com.example.msuser.proxy.serverProxy;
import com.example.msuser.repositories.usRepository;
import com.example.msuser.repositories.vmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api")
public class api_controller {

    @Autowired
    private usRepository us;
    @Autowired
    private vmRepository vm;

    @Autowired
    private serverProxy sv;

    @GetMapping("vm/{idv}/srv")
    public virtual_machine getVmwithServer (@PathVariable("idv") Long idv ){
        virtual_machine v=vm.findById(idv).get();
        long id=v.getId_server();
        System.out.println(id);
        server s=sv.getServer(id);
        System.out.println(s);
        v.setServer(s);
        return v;
    }
}
