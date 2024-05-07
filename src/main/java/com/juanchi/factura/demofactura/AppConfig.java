package com.juanchi.factura.demofactura;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.juanchi.factura.demofactura.models.Item;
import com.juanchi.factura.demofactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean
    List<Item> items() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(new Product("Coca Cola", 1000), 2));
        items.add(new Item(new Product("Papas", 2000), 3));
        items.add(new Item(new Product("Chocolatina Jet", 500), 5));
        return items;
    }

}
