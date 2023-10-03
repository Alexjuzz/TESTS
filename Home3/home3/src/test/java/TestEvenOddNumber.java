import org.example.EvenOddNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestEvenOddNumber {
    EvenOddNumber en;
    @BeforeEach
    void testInit(){
     en = new EvenOddNumber();
    }
    @ParameterizedTest
    @ValueSource(ints = {2,6,8,244})
    void testEvenOddNumberTrue(int i){
      assertTrue(en.evenOddNumber(i));
    }
    @ParameterizedTest
    @ValueSource(ints = {1,5,7,255})
    void testEvenOddNumberFalse(int i){
        assertFalse(en.evenOddNumber(i));
    }
}
