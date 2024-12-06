package org.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Component
public class RomanNumeralsConverter {

    private List<RomanNumeral> numerals;

    public RomanNumeralsConverter() {
        this.numerals = Arrays.stream(RomanNumeral.values())
                .sorted(Comparator.comparing(RomanNumeral::getValue).reversed()).toList();
    }

    public String convertToRoman(Integer i) {

        Integer remaining = Integer.valueOf(i);
        String romanNumerals = "";

        for(RomanNumeral numeral : numerals) {
            var division = numeral.getValue();
            var multiplier = remaining / division;
            if(multiplier>0){
                remaining -= multiplier * division;
                romanNumerals += numeral.name().repeat(multiplier);
            }
        }
        return romanNumerals;
    }
}
