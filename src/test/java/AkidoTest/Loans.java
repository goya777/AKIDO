package AkidoTest;

import ChromRunner.Chrome;
import StepObject.*;
import org.testng.annotations.Test;
import static DataObject.AplicationData.*;
import static DataObject.AutorizationaData.*;
import static DataObject.ClientAuthorizationData.*;
import static DataObject.CommeteeData.*;
import static DataObject.DisbursmentData.passwordlika;
import static DataObject.DisbursmentData.userlika;
import static DataObject.Income_expensesPage.*;
import static com.codeborne.selenide.Selenide.*;

public class Loans extends Chrome {

    StepObject.AutorizacionPageSteps AutorizacionPageSteps = new AutorizacionPageSteps();
    StepObject.ClientAuthorizationSteps ClientAuthorizationSteps = new ClientAuthorizationSteps();
    StepObject.ClientdetailsStep ClientdetailsStep = new ClientdetailsStep();
    StepObject.Income_expensesPageSteps Income_expensesPageSteps = new Income_expensesPageSteps();
    StepObject.AplicationaPageSteps AplicationaPageSteps = new AplicationaPageSteps();
    StepObject.confirmatioIncomepage_Steps confirmatioIncomepage_Steps = new confirmatioIncomepage_Steps();
    StepObject.CommeteSteps CommeteSteps = new CommeteSteps();

    StepObject.DisbursmentSteps DisbursmentSteps = new DisbursmentSteps ();

    @Test(priority = 1)
    public void creatloan() {
        AutorizacionPageSteps
                .usernameset(username)
                .passwordvalue(password)
                .loginclick()
                .profilecheck();
        ClientAuthorizationSteps
                .Loanbtnclick()
                .switchtab()
                .coockyclick()
                .calcbtnclick()
                .clientid(personid)
                .clientdocumentid(docnum)
                .clientcheckbox()
                .btnclick();
        ClientdetailsStep
                .aqtiuribalansi()
                .loan_next_chechbtn();
        Income_expensesPageSteps
                .incomeamount(income)
                .commentari(comentari);
        sleep(3000);
        Income_expensesPageSteps.contractpers(cont_name)
                .contractlastname(cont_lastname)
                .contactperphone(cont_phone)
                .contactpersconect(cont_conetcion)
                .income_statement_btn();
        AplicationaPageSteps
                .loan_product_id()
                .loan_class()
                .loan_amount(amount)
                .loan_term(term)
                .first_payment_data(payment_data)
                .insurance_compania()
                .loan_insurance_class()
                .insurance_product()
                .insurance_product1()
                .loan_issuance_type()
                .loan_issuance_type1()
                .interest_and_schedule_btn()
                .real_interest()
                .purpose_sector()
                .purpose_sector1()
                .purpose_subsector()
                .purpose_subsector1()
                .purpose_subsector_detail()
                .purpose_subsector_detail1()
                .loan_purpose()
                .loan_purpose1()
                .loan_purpose_amount(amount)
                .loan_purpose_comment(miznobriobis_coment)
                .submit_loan_application_btn();
        confirmatioIncomepage_Steps
                .submit_income_next_btn()
                .send_consideration_btn();
    }

    @Test(priority = 2)
    public void commetee(){
        CommeteSteps
                .commeteeuser(commituser)
                .passwordinput(passw)
                .submitbtn()
                .profilecheck()
                .ganacxadebi()
                .ganacxadis_detalebi()
                .statusi()
                .komitetibtn()
                .searchId(personid)
                .filtribtn()
                .commettee_detalebi()
                .gankhilvabtn()
                .Areyousure()
                .damtkicebabtn()
                .damtkicebacomment(commetcomment)
                .damtkicebisbtn()
                .alarteccept();
    }

    @Test(priority = 3)
    public void loanfinish(){
        DisbursmentSteps
                .usernameinput1(userlika)
                .passwordinput2(passwordlika)
                .submitbtn3()
                .profilecheck4()
                .aplicationbtn()
                .searchid()
                .filterbtn()
                .appditails()
                .ContractPrep()
                .acceptbtnclick()
                .contraktprintview()
                .contraktprintaid()
                .grafikprint()
                .isbursedbutton()
                .btnclick();

    }

}
