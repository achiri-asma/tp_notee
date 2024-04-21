package com.example.msuser.proxy;

import com.example.msuser.model.server;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="ms-server")
@LoadBalancerClient(name="ms-server")
public interface serverProxy {
@GetMapping("api/findById")
public server getServer(@RequestParam("ids") Long ids);

}
