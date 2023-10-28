package labs.tender.two;

public class RomanNumeralUtils {
    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
}

    int romanToDecimal(String str)
    {

        int res = 0;

        for (int i = 0; i < str.length(); i++) {

            int s1 = value(str.charAt(i));

            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));

                if (s1 >= s2) {

                    res = res + s1;
                }
                else {

                    res = res + s2 - s1;
                    i++;
                }
            }
            else {
                res = res + s1;
            }
        }

        return res;
    }
        public static String printRoman(int num) {
        StringBuilder builder = new StringBuilder();
            if (num >= 1000) {
                builder.append("M");
                printRoman(num - 1000);
            } else if (num >= 900) {
                builder.append("CM");
                printRoman(num - 900);
            } else if (num >= 500) {
                builder.append("D");
                printRoman(num - 500);
            } else if (num >= 400) {
                builder.append("CD");
                printRoman(num - 400);
            } else if (num >= 100) {
                builder.append("C");
                printRoman(num - 100);
            } else if (num >= 90) {
                builder.append("XC");
                printRoman(num - 90);
            } else if (num >= 50) {
                builder.append("L");
                printRoman(num - 50);
            } else if (num >= 40) {
                builder.append("XL");
                printRoman(num - 40);
            } else if (num >= 10) {
                builder.append("X");
                printRoman(num - 10);
            } else if (num >= 9) {
                builder.append("IX");
                printRoman(num - 9);
            } else if (num >= 5) {
                builder.append("V");
                printRoman(num - 5);
            } else if (num >= 4) {
                builder.append("IV");
                printRoman(num - 4);
            } else if (num >= 1) {
                builder.append("I");
                printRoman(num - 1);
            }
            return builder.toString();
        }

}
