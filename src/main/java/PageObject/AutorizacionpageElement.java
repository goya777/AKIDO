package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AutorizacionpageElement {

    public SelenideElement
            //ავტორიზაცია//
            usernameinput = $("#username_input"),
            passwordinput = $("#password_input"),
            submitbtn = $(By.id("submit_btn")),
            profilecheck = $(byText("მომხმარებლის პროფაილი: l.meparishvili@crystal.ge"));

}
