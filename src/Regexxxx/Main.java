package Regexxxx;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "0xFAC 125 0xAA 555 0xFF  RERE";    // задание 2 РТ-2 стр 13
        Pattern pattern = Pattern.compile("0x[A-G]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.print(matcher.group()+" ");
        }

        System.out.println(" ");
                                                           // задание 3 РТ-2 стр 14
        String str2 = "555 kkk adn <p id='p1'> fff 874  35ssss <p id='p36'> <p id='p15'>";
            System.out.println(str2.replaceAll("<p id\\S+>", "<p>"));


        Locale locale = new Locale("uk","UA");  // задание 4 РТ-2 стр 16
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(numberFormat.format(153.5));
    }
    }