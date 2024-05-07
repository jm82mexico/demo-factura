package com.juanchi.factura.demofactura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanchi.factura.demofactura.models.Invoice;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
    private Invoice invoice;

    @GetMapping("/show")
    public Invoice show() {
        return invoice;
    }
    
}
