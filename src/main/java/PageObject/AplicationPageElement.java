package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class AplicationPageElement {
    public SelenideElement
    loan_product_id =  $("#loan_product"),
    loan_class = $(byAttribute("class","customSelectOptionItem ng-star-inserted"),6),

    loan_product = $("#loan_product"),
    loan_type = $(new ByText(" ბიზნეს სესხი ")),
    loan_amount= $(By.id("loan_amount")),
    loan_term = $(By.id("loan_term")),
    paymentdata = $(By.id("first_payment_date")),

    insurance_company = $(By.id("loan_insurance_company")),
    loan_insurance_class = $(byText("BB დაზღვევა")),

    /*loan_insurance_class = $(byAttribute("class","customSelectOptionItem ng-star-inserted"),11),*/

    insurance_product = $(By.id("loan_insurance_product")),

    insurance_product1 = $(byXpath("//*[@id=\"loan_insurance_product\"]/div[2]/div/div[2]")),


    loan_issuance_type = $("#loan_issuance_type"),

    loan_issuance_type1 = $(byXpath("//*[@id=\"loan_issuance_type\"]/div[2]/div/div[2]")),

    interest_and_schedule_btn = $("#interest_and_schedule_btn"),

    real_interest = $("#real_interest"),
    purpose_sector= $("#purpose_sector"),
    purpose_sector1= $(byXpath("//*[@id=\"purpose_sector\"]/div[2]/div/div[2]")),
    purpose_subsector = $("#purpose_subsector"),
    purpose_subsector1 = $(byXpath("//*[@id=\"purpose_subsector\"]/div[2]/div[2]/div[2]")),

    purpose_subsector_detail = $("#purpose_subsector_detail"),
    purpose_subsector_detail1 = $(byXpath("//*[@id=\"purpose_subsector_detail\"]/div[2]/div[2]/div[2]")),

    loan_purpose = $("#loan_purpose"),
    loan_purpose1 = $(byXpath("//*[@id=\"loan_purpose\"]/div[2]/div/div[3]")),

    loan_purpose_amount = $("#loan_purpose_amount"),
    loan_purpose_comment =$("#loan_purpose_comment"),
    submit_loan_application_btn = $("#submit_loan_application_btn"),
    ganacxadebi = $(byText("განაცხადები"));



 };

