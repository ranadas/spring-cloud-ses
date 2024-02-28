package com.stackabuse.springcloudawsses.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@RestController
public class HealthController {
    @GetMapping("/health")
    public String health() {

        Locale locale = new Locale("en", "IE");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String date = dateFormat.format(new Date());

        return String.format("Hello from Spring Cloud SES Application on : %s!", date);
    }
}