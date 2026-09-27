package com.example.sales.service;

import com.example.sales.client.GiftClient;
import com.example.sales.model.Sale;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@Service
public class SalesService {

    private final GiftClient giftClient;

    private final List<Sale> saleList;

    public SalesService(GiftClient giftClient) {
        this.giftClient = giftClient;
        this.saleList = createSampleSales();
    }


    public List<Sale> getAllSales() {
        return saleList;
    }

    public Optional<Sale> getSaleById(int id) {
        return saleList.stream()
                .filter(sale -> sale.getId() == id)
                .findFirst();
    }

    public String getGiftForSale(int id) {
        Optional<Sale> optionalSale = getSaleById(id);

        if (optionalSale.isEmpty()) {
            return "Sale not found for ID: " + id;
        }

        Sale sale = optionalSale.get();
        double price = sale.getPrice();

        return giftClient.getGift(price);
    }

 
    private List<Sale> createSampleSales() {
        List<Sale> sales = new ArrayList<>();
        sales.add(new Sale(1, "Avinash", "BMW",       2500000));   // 25 Lakhs  -> iPhone 16
        sales.add(new Sale(2, "Rahul",   "Mercedes",  4500000));   // 45 Lakhs  -> iPhone 17
        sales.add(new Sale(3, "Priya",   "Audi",      6500000));   // 65 Lakhs  -> iPhone 17 Pro Max
        return sales;
    }
}
