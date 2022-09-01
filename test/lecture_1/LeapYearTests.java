package lecture_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTests {
    @Test
    public void everyFourthYearIsLeapYear() {
        Assertions.assertTrue(LeapYearValidator.isLeapYear(2001));
    }
}
