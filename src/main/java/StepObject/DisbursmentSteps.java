package StepObject;

import PageObject.DisbursmentElement;
import com.codeborne.selenide.Condition;

import java.time.Duration;

import static DataObject.ClientAuthorizationData.personid;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;

public class DisbursmentSteps extends DisbursmentElement {

    public DisbursmentSteps usernameinput1(String userlika) {
        usernameinput1.setValue(userlika);
        return this;
    }

    public DisbursmentSteps passwordinput2 (String passwordlika) {
        passwordinput2.setValue(passwordlika);
        return this;
    }
    public DisbursmentSteps submitbtn3() {
        submitbtn3.click();
        return this;
    }
    public DisbursmentSteps profilecheck4() {
        profilecheck4.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }

    public DisbursmentSteps aplicationbtn() {
        aplicationbtn.click();
        return this;
    }

    public DisbursmentSteps searchid() {
        searchid.setValue(personid);
        return this;
    }

    public DisbursmentSteps filterbtn() {
        filterbtn.click();
        return this;
    }
    public DisbursmentSteps appditails() {
        appditails.click();
        return this;
    }

    public DisbursmentSteps ContractPrep() {
        ContractPrep.click();
        return this;
    }
    public DisbursmentSteps acceptbtnclick() {
        acceptbtn.click();
        return this;
    }

   /* public DisbursmentSteps altaid() {
        altaid.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }*/

   /* public DisbursmentSteps switchtab() {
        switchTo().window(0);
        return this;
    }*/

  public DisbursmentSteps contraktprintview() {
      contraktprint.shouldBe(Condition.visible, Duration.ofMillis(15000));
        return this;
    }

    public DisbursmentSteps contraktprintaid() {
        contraktprint.click();
        sleep(3000);
        switchTo().window(0);
        return this;
    }
    public DisbursmentSteps grafikprint() {
        grafikprint.click();
        sleep(3000);
        switchTo().window(0);
        return this;
    }

    public DisbursmentSteps isbursedbutton() {
        isbursedbutton.click();
        return this;
    }
    public DisbursmentSteps btnclick() {
        ecceptbtn.click();
        return this;
    }
}
