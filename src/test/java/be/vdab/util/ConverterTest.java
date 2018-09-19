package be.vdab.util;

import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void eenInchIs2Punt45Centimeters(){
        Converter converter = new Converter();
        assertEquals(0, BigDecimal.valueOf(2.54).compareTo(converter.inchesNaarCentimeters(BigDecimal.ONE)));
    }
    
    @Test
    public void tweehonderdInchesIsVijfhonderdenachtCentimeters(){
        Converter converter = new Converter();
        assertEquals(0, BigDecimal.valueOf(508).compareTo(converter.inchesNaarCentimeters(BigDecimal.valueOf(200))));
    }
}