package com.example.curso.springboot.di.factura.springboot_difactura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso.springboot.di.factura.springboot_difactura.models.Client;
import com.example.curso.springboot.di.factura.springboot_difactura.models.Invoice;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("invoices")
public class invoiceController {

    @Autowired
    private Invoice invoice;


    @GetMapping("/show")
    public Invoice show(){

        Invoice i = new Invoice();
        Client c = new Client();

        c.setLastname(invoice.getClient().getLastname());
        c.setName(invoice.getClient().getName());

        i.setClient(c);
        i.setDescritption(invoice.getDescritption());
        i.setItems(invoice.getItems());

        return i;
    }
}
