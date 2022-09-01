package lecture_1;

import java.util.TreeMap;

public class RomanNumeralsConverter {
    private static TreeMap<Integer, String> map = new TreeMap<Integer, String>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public static String convertToRomanNumerals(int number) {
        if(number <= 0)
            return "";

        var result = "";
        var finished = false;
        var remainingNum = number;
        var keys = map.keySet().stream().sorted().toList();

        while(!finished) {
            for(int i = keys.size() - 1; i >= 0; i--) {
                var currentKey = keys.get(i);

                if(remainingNum >= currentKey) {
                    result += map.get(currentKey);
                    remainingNum -= currentKey;
                    break;
                }
            }

            finished = remainingNum == 0;
        }

        return result;
    }
}
