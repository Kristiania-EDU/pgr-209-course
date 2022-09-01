package lecture_1;

public class LeapYearValidator {
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 || year % 400 == 0;
    }
}
