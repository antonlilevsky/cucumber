package core;

import helpers.RandomAccountDataGenerator;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class UserAccount {
    @Getter
    private static String title = "Mr.";
    @Getter
    private static String firstName = "ant";
    @Getter
    private static String lastName = "lastName";
    @Getter
    private static String email = RandomAccountDataGenerator.getRandomEmail();
    @Getter
    private static String password = "123456";
    @Getter
    private static LocalDate dateOfBirth = LocalDate.parse("17.10.1989", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    @Getter
    private static String address = "asdasd";
    @Getter
    private static String city = "Vinnytsia";
    @Getter
    private static String state = "Alaska";
    @Getter
    private static String zipCode = "21001";
    @Getter
    private static String country = "United States";
    @Getter
    private static String mobilePhone = "123123123";


}
