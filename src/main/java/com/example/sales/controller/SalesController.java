package com.example.sales.controller;

import com.example.sales.model.Sale;
import com.example.sales.service.SalesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sales")
public class SalesController {

    private final SalesService salesService;

 
    public SalesController(SalesService salesService) {
        this.salesService = salesService;
    }

   
    @GetMapping
    public List<Sale> getAllSales() {
        return salesService.getAllSales();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getSaleById(@PathVariable int id) {
        Optional<Sale> sale = salesService.getSaleById(id);

        if (sale.isPresent()) {
            return ResponseEntity.ok(sale.get());
        } else {
            return ResponseEntity.status(404).body("Sale not found");
        }
    }

    @GetMapping("/{id}/gift")
    public ResponseEntity<String> getGiftForSale(@PathVariable int id) {
        Optional<Sale> sale = salesService.getSaleById(id);

        if (sale.isEmpty()) {
            return ResponseEntity.status(404).body("Sale not found");
        }

        String gift = salesService.getGiftForSale(id);
        return ResponseEntity.ok(gift);
    }
}
