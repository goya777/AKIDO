package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class DisbursmentElement {

    public SelenideElement
      // მომხმარებლის ავტორიზაცია
            usernameinput1 = $("#username_input"),
            passwordinput2 = $("#password_input"),
            submitbtn3     = $(By.id("submit_btn")),
            profilecheck4  = $(byText("მომხმარებლის პროფაილი: l.meparishvili@crystal.ge")),

    //განაცხადებში შესვლა

             aplicationbtn = $(By.linkText("განაცხადები")),
             searchid = $(By.name("pid")),
             filterbtn = $(By.name("filter")),

             //ganacxadis detalebSi Sesvlis Rilaki
             appditails = $(By.xpath("//*[@id=\"admin-body\"]/div[2]/div[1]/div[2]/form/table/tbody/tr[1]/td[8]/a/i")),

            //ხელშ.მომზადების ღილაკი/
             ContractPrep = $(By.name("contract_prepare")),

             acceptbtn = $(byAttribute("class", "uk-button uk-button-primary js-modal-confirm")),


             altaid = $(By.xpath("//*[@id=\"vue_app\"]/div/div[2]/div[1]")),
    //კონტრაქტის ბეჭდვა

              contraktprint = $(byText("კონტრაქტის ბეჭდვა")),
              grafikprint = $(By.partialLinkText("გრაფიკის ბეჭდ")),
    ecceptbtn = $(byAttribute("class","uk-button uk-button-primary js-modal-confirm")),

              isbursedbutton = $("#disbursed_button");
}
