package cz.uhk.fim.pro2.shopping.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Random;

public class DataGenerator {
    public static Date randomBirthdate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Random random = new Random();
        int day = random.nextInt(31) + 1;
        int month = random.nextInt(12) + 1;
        int age = random.nextInt(15) + 1;
        Date date = null;

        try {
            date = sdf.parse(
                    String.format("%s.%s.%s",
                            day < 10 ? "0" + day : String.valueOf(day),
                            month < 10 ? "0" + month : String.valueOf(month),
                            (Year.now().getValue() - age)
                    )
            );
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }
}
