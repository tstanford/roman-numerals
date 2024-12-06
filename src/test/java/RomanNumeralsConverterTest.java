import org.example.RomanNumeralsConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RomanNumeralsConverterTest {

    @Test
    public void shouldConvert10toX(){}{
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        String result = converter.convertToRoman(10);
        Assertions.assertEquals("X", result);
    }

    @Test
    public void shouldConvert11toXI(){}{
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        String result = converter.convertToRoman(11);
        Assertions.assertEquals("XI", result);
    }

    @Test
    public void shouldConvert100toC(){}{
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        String result = converter.convertToRoman(100);
        Assertions.assertEquals("C", result);
    }

    @Test
    public void shouldConvert4toIV(){}{
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        String result = converter.convertToRoman(4);
        Assertions.assertEquals("IV", result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "testdata.csv")
    public void shouldConvert1To100(Integer integerValue, String expectedRomanNumerals){
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        String result = converter.convertToRoman(integerValue);
        Assertions.assertEquals(expectedRomanNumerals, result);
    }


}
