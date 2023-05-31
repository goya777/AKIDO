package StepObject;

import PageObject.AutorizacionpageElement;
import com.codeborne.selenide.Condition;
import java.time.Duration;

public class AutorizacionPageSteps extends AutorizacionpageElement {
    public AutorizacionPageSteps usernameset (String username) {
        usernameinput.setValue(username);
        return this;
    }
    public AutorizacionPageSteps passwordvalue(String password) {
        passwordinput.setValue(password);
        return this;
    }
    public AutorizacionPageSteps loginclick() {
        submitbtn.click();
        return this;
    }
    public AutorizacionPageSteps profilecheck() {
        profilecheck.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
}