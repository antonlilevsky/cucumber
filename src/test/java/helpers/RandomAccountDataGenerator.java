package helpers;

import org.apache.commons.lang3.RandomStringUtils;

import static java.lang.String.format;

public class RandomAccountDataGenerator {
    public static String getRandomEmail(){
        String str = RandomStringUtils.random(7,true,true);
        return format("%s@test.com", str);
    }


}
