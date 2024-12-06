package org.example.controllers;

import org.example.RomanNumeralsConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/numerals")
public class NumeralsController {

    private final RomanNumeralsConverter romanNumeralsConverter;

    public NumeralsController(RomanNumeralsConverter romanNumeralsConverter) {
        this.romanNumeralsConverter = romanNumeralsConverter;
    }

    @GetMapping("{value}")
    public String getNumeral(@PathVariable int value){
        return romanNumeralsConverter.convertToRoman(value);
    }

}
