import org.example.NumberBetween25and100;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class TestNumberBetween25and100 {
    NumberBetween25and100 num;
    @BeforeEach
    void testInit(){
        num = new NumberBetween25and100();
    }
    @ParameterizedTest
    @ValueSource(ints = {27,62,41,29})
    void testNumbersTrue(int i){
        assertTrue(num.numberInInterval(i));
    }
    @ParameterizedTest
    @ValueSource(ints = {15,25,141,129})
    void testNumbersFalse(int i){
        assertFalse(num.numberInInterval(i));
    }

}
