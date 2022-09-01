import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTests {
    @Test
    public void everyFourthYearIsLeapYear() {
        assertTrue(LeapYearValidator.isLeapYear(2001));
    }
}
