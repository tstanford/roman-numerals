import org.example.Main;
import org.example.controllers.NumeralsController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes = Main.class)
public class NumeralControllerITest {

    @Autowired
    NumeralsController controller;

    @Test
    public void shouldGetCorrectValueForNumeral(){
        String result = controller.getNumeral(10);

        assertThat(result).isEqualTo("X");
    }

}
