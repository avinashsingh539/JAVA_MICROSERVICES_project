package com.example.sales.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "gift-service", url = "http://localhost:8082")
public interface GiftClient {

    
    @GetMapping("/gift/{price}")
    String getGift(@PathVariable("price") double price);
}
