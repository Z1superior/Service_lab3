package com.example.feign;

import com.example.entity.CommonResult;
import com.example.entity.User;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("provider-server")
public interface ServiceProviderService {
    @GetMapping("/user/getUserById/{userId}")
    CommonResult<User> getUserById(@PathVariable("userId") Integer userId);
    @GetMapping("/user/getUserByName/{username}")
    CommonResult<User> getUserByName(@PathVariable("username") String userName);
}
