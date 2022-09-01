package lecture_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTests {
    @Test
    public void everyFourthYearIsLeapYear() {
        Assertions.assertFalse(LeapYearValidator.isLeapYear(2100));
        Assertions.assertTrue(LeapYearValidator.isLeapYear(2000));
        Assertions.assertTrue(LeapYearValidator.isLeapYear(2004));
    }

    @Test
    public void everyFifthYearIsLeapYear() {
        Assertions.assertFalse((LeapYearValidator.isLeapYear(2102)));
        Assertions.assertFalse((LeapYearValidator.isLeapYear(2222)));
    }
}
