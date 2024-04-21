package com.example.msserver;

import com.example.msserver.entities.configuration;
import com.example.msserver.entities.server;
import com.example.msserver.repositories.svRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsServerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MsServerApplication.class, args);
    }
    @Autowired
    private svRepository sv;

    @Override
    public void run(String... args) throws Exception {
        configuration c1=new configuration(8L,16L,256L);
        configuration c2=new configuration(9L,16L,256L);

        server s1=new server(null,c1,"datacenter01",null);
        server s2=new server(null,c2,"datacenter00",null);

        sv.save(s1);
        sv.save(s2);
    }
}
