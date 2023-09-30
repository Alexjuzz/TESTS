package org.example;
import static org.assertj.core.api.Assertions.*;
public class Main {
    public static void main(String[] args)
    {
//        testMaxValue();
//        testDiscountValue();
//          testDiscountValueLess0();
        System.out.println(100-(100*101/100));
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
        assertThat(c.calculateDiscount(100,101)).isEqualTo(-1);
    }
    public static void testDiscountValueLess0(){
        Calc c = new Calc();
        assertThat(c.calculateDiscount(100,-1)).isEqualTo(-100);
    }

}