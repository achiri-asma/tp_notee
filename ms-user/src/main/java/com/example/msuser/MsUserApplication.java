package com.example.msuser;

import com.example.msuser.entities.configuration;
import com.example.msuser.entities.user;
import com.example.msuser.entities.virtual_machine;
import com.example.msuser.repositories.usRepository;
import com.example.msuser.repositories.vmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsUserApplication implements CommandLineRunner {

    @Autowired
    private usRepository us;
    @Autowired
    private vmRepository vm;
    public static void main(String[] args) {
        SpringApplication.run(MsUserApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

        configuration c1=new configuration(7L,8L,256L);
        configuration c2=new configuration(10L,4L,512L);

        user u1=new user(null,"achiri asma","achiri.asma.oeb@gmail.com",null);
        user u2=new user(null,"achiri samya","achirisamya@yahoo.ca",null);

        us.save(u1);
        us.save(u2);

        virtual_machine v1=new virtual_machine(null,c1,1L,null,u1);
        virtual_machine v2=new virtual_machine(null,c1,1L,null,u2);
        virtual_machine v3=new virtual_machine(null,c2,2L,null,u1);
        virtual_machine v4=new virtual_machine(null,c2,2L,null,u2);

        vm.save(v1);
        vm.save(v2);
        vm.save(v3);
        vm.save(v4);

    }
}
