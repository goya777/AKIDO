package StepObject;
import com.codeborne.selenide.Condition;

import PageObject.ClientAuthorizationElement;

import static DataObject.ClientAuthorizationData.docnum;
import static com.codeborne.selenide.Selenide.switchTo;

public class ClientAuthorizationSteps extends ClientAuthorizationElement {

    public ClientAuthorizationSteps Loanbtnclick() {
        loan_product_btn.click();
        return this;
    }

    public ClientAuthorizationSteps switchtab() {
        switchTo().window(1);
        return this;
    }

    public ClientAuthorizationSteps coockyclick() {
        coocky.click();
        return this;
    }

    public ClientAuthorizationSteps calcbtnclick() {
        calcbtn.click();
        return this;
    }

    public ClientAuthorizationSteps clientid(String personid) {
        personalId.setValue(personid);
        return this;
    }

    public ClientAuthorizationSteps clientdocumentid(String docnum) {
        documentid.setValue(docnum);
        return this;
    }

    public ClientAuthorizationSteps clientcheckbox () {
        checkbox.doubleClick();
        return this;
    }
    public ClientAuthorizationSteps btnclick() {
        loanchechbtn.click();
        return this;
    }
}