package StepObject;

import PageObject.AplicationPageElement;
import com.codeborne.selenide.Condition;
import java.time.Duration;
import java.util.Random;

public class AplicationaPageSteps extends AplicationPageElement {


    public AplicationaPageSteps loan_product_id() {
        loan_product_id.click();
        return this;
    }

    public AplicationaPageSteps loan_class() {
        loan_class.click();
        return this;
    }


    public AplicationaPageSteps loan_amount(String amount) {
        /*Random r = new Random();
        String randomNumber = String.format("%04d", r.nextInt(1001));
        System.out.println(randomNumber);*/
        loan_amount.setValue(amount);
        return this;
    }

    public AplicationaPageSteps loan_term(String term) {
        loan_term.setValue(term);
        return this;
    }

    public AplicationaPageSteps first_payment_data(String payment_data) {
        paymentdata.setValue(payment_data);
        return this;
    }

    public AplicationaPageSteps insurance_compania() {
        insurance_company.click();
        return this;
    }

    public AplicationaPageSteps loan_insurance_class() {
        loan_insurance_class.click();
        return this;
    }
    public AplicationaPageSteps insurance_product() {
        insurance_product.click();
        return this;
    }


   public AplicationaPageSteps insurance_product1() {
        insurance_product1.click();
        return this;
    }

    public AplicationaPageSteps loan_issuance_type() {
        loan_issuance_type.click();
        return this;
    }

    public AplicationaPageSteps loan_issuance_type1() {
        loan_issuance_type1.click();
        return this;
    }

    public AplicationaPageSteps interest_and_schedule_btn() {
        interest_and_schedule_btn.click();
        return this;
    }
    public AplicationaPageSteps real_interest() {
        real_interest.shouldNotBe(Condition.empty, Duration.ofMillis(15000));
        return this;
    }
    public AplicationaPageSteps purpose_sector() {
        purpose_sector.click();
        return this;
    }
    public AplicationaPageSteps purpose_sector1() {
        purpose_sector1.click();
        return this;
    }
    public AplicationaPageSteps purpose_subsector() {
        purpose_subsector.click();
        return this;
    }
    public AplicationaPageSteps purpose_subsector1() {
        purpose_subsector1.click();
        return this;
    }

    public AplicationaPageSteps purpose_subsector_detail() {
        purpose_subsector_detail.click();
        return this;
    }

    public AplicationaPageSteps purpose_subsector_detail1() {
        purpose_subsector_detail1.click();
        return this;
    }
    public AplicationaPageSteps loan_purpose() {
        loan_purpose.click();
        return this;
    }
    public AplicationaPageSteps loan_purpose1() {
        loan_purpose1.click();
        return this;
    }
    public AplicationaPageSteps loan_purpose_amount(String amount) {
        loan_purpose_amount.setValue(amount);
        return this;
    }
    public AplicationaPageSteps loan_purpose_comment(String miznobriobis_coment) {
        loan_purpose_comment.setValue(miznobriobis_coment);
        return this;
    }

    public AplicationaPageSteps submit_loan_application_btn() {
        submit_loan_application_btn.click();
        return this;
    }


}
