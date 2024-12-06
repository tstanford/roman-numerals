import org.example.RomanNumeralsConverter;
import org.example.controllers.NumeralsController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NumeralControllerTest {

    private RomanNumeralsConverter converter;
    private NumeralsController controller;

    @BeforeEach
    public void setup(){
        converter = mock(RomanNumeralsConverter.class);
        controller = new NumeralsController(converter);
    }

    @Test
    public void shouldCallGetNumerals(){
        when(converter.convertToRoman(1)).thenReturn("I");

        String result = controller.getNumeral(1);

        assertThat(result).isEqualTo("I");
    }

}
