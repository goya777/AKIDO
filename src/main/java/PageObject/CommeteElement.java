package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SetValueOptions;
import com.codeborne.selenide.selector.ByTagAndText;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static DataObject.ClientAuthorizationData.personid;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class CommeteElement {

        public SelenideElement

         user = $("#username_input"),
         password= $("#password_input"),
         submitbtn = $(By.id("submit_btn")),
         profilecheck = $(byText("მომხმარებლის პროფაილი: g.sharashenidze@crystal.ge")),
         ganacxadebi = $(byText("განაცხადები")),
         ganacxadis_detalebi = $(byClassName("uk-icon-file-text-o"),0),
         statusi = $(byText("ელოდება კომიტეტს")),

         komitetibtn =$(new ByText("კომიტეტი")),

         searchId = $(byName("pid")),
         filtribtn= $(byXpath("//*[@id=\"admin-body\"]/div[2]/div/div[2]/div/form[1]/div/p[5]/button")),


        commettee_detalebi = $(byClassName("uk-icon-file-text-o"),0),

        gankhilvabtn = $(byXpath("//*[@id=\"vue_app\"]/div[1]/div[3]/div/button")),

        Areyousure = $(byXpath("/html/body/div[7]/div/div/div[2]/button[2]")),

        damtkicebabtn = $(byText("დამტკიცება"),0),

        damtkicebackeck =$(byText("approve_application")),
        damtkicebacomment = $("#approve_comment"),
        damtkicebisbtn = $("#approve_button");


}
