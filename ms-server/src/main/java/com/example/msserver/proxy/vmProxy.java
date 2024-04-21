package com.example.msserver.proxy;

import com.example.msserver.model.virtual_machine;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="ms-user")
@LoadBalancerClient(name="ms-user")
public interface vmProxy {
@GetMapping("api/findById_server")
    public List<Object[]> getVms(@RequestParam("ids") Long ids);

}
