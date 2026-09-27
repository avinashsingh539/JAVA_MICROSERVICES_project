package com.example.gift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gift")
public class GiftController {

   
    private static final double TIER_1_MAX = 2000000;   // 20 Lakhs
    private static final double TIER_2_MAX = 4000000;   // 40 Lakhs
    private static final double TIER_3_MAX = 6000000;   // 60 Lakhs

    @GetMapping("/{price}")
    public String getGift(@PathVariable double price) {

        if (price < TIER_1_MAX) {
            return "No Gift";
        } else if (price < TIER_2_MAX) {
            return "iPhone 16";
        } else if (price < TIER_3_MAX) {
            return "iPhone 17";
        } else {
            return "iPhone 17 Pro Max";
        }
    }
}
