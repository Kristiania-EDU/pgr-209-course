package lecture_1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.TreeMap;

import static lecture_1.RomanNumeralsConverter.convertToRomanNumerals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanNumeralsTests {

    @Test
    public void canConvertOneToRomanNumerals() {
        assertEquals("I", convertToRomanNumerals(1));
        assertEquals("MCMXCIX", convertToRomanNumerals(1999));
        assertEquals("MDCCLXVII", convertToRomanNumerals(1767));
    }
}
