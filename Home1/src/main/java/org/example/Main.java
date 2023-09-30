package org.example;
import static org.assertj.core.api.Assertions.*;
public class Main {
    public static void main(String[] args) {
        Calc c = new Calc();
//        testMaxValue();
//        testDiscountValue();
          testDiscountValueLess0();
    }

    /***
     * Метод проверки на не допустимую границу Double
     */
    public static void testMaxValue(){
        Calc c = new Calc();
        assertThat(c.calculateDiscount(Double.MAX_VALUE,0)).isEqualTo(Double.MAX_VALUE);
    }
    public static void  testDiscountValue(){
        Calc c = new Calc();
        assertThat(c.calculateDiscount(100,101)).isEqualTo(0);
    }
    public static void testDiscountValueLess0(){
        Calc c = new Calc();
        assertThat(c.calculateDiscount(100,-1)).isEqualTo(-100);
    }

}