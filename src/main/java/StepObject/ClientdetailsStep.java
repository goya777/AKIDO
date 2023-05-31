package StepObject;

import PageObject.ClientDetailsElement;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class ClientdetailsStep extends ClientDetailsElement {
    public ClientdetailsStep aqtiuribalansi () {
        activeBalance.shouldNotBe(Condition.empty, Duration.ofMillis(15000));
        return this;
    }
    public ClientdetailsStep loan_next_chechbtn() {
        loan_next_chechbtn.click();
        return this;
    }

}
