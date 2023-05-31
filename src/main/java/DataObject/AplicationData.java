package DataObject;

import com.github.javafaker.Faker;

import java.util.Random;

public interface AplicationData {
    Faker faker = new Faker();
    public String
            amount = "1" + faker.number().digits(3),
            loan_product =" ბიზნეს სესხი ",
            /*amount = "1101",*/
            term = "12",
            payment_data = "01-07-2023",
            miznobriobis_coment = "test";
}
