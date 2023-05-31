package StepObject;

import PageObject.confirmatioIncomepage_data_Element;

import static com.codeborne.selenide.Selenide.switchTo;

public class confirmatioIncomepage_Steps extends confirmatioIncomepage_data_Element {

    public confirmatioIncomepage_Steps submit_income_next_btn() {
        submit_income_next_btn.click();
        return this;
    }

    public confirmatioIncomepage_Steps send_consideration_btn() {
        send_consideration_btn.click(); //oqmis gagzavna komiteteze
        return this;
    }
   /* public confirmatioIncomepage_Steps switchtab() {
        switchTo().window(0);
        return this;
    }
    public confirmatioIncomepage_Steps logout_btn() {
        logoutbtn.click(); //gamosvla
        return this;
    }*/
}
