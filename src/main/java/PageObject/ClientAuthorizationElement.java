package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ClientAuthorizationElement {

    public SelenideElement
    loan_product_btn = $("#loan_product_btn"), //სწრაფი სესხის ღილაკი//
    coocky = $(By.className("cookie-policy--verify-btn")),
    calcbtn = $("#loan_next_btn"), //კალკულატორის ღილაკი//
    personalId = $("#personal_id"),
    documentid = $("#document_number"),

    checkbox = $("#application_going_with_live"),
    loanchechbtn = $("#loan_check_btn");
}
