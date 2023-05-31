/*
package AkidoTest;
import ChromRunner.Chrome;
import StepObject.Homepagesteps;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import java.time.Duration;

import static DataObject.AutorizationaData.*;
import static DataObject.ClientAuthorizationData.*;
import static DataObject.Income_expensesPage.*;
import static com.codeborne.selenide.Selenide.*;

public class homepage<select> extends Chrome {

    @Test
    //avtorizacia//
    public void avtrz (){
        Homepagesteps Homepagesteps = new Homepagesteps();
        Homepagesteps.usernameinput.setValue(username);
        Homepagesteps.passwordinput.setValue(password).pressEnter();
        Homepagesteps.Loanbtn.click(); //სწრაფი სესხის ღილაკი//
        switchTo().window(1);
        Homepagesteps.coocky.click();
        Homepagesteps.calcbtn.click(); // სესხის კალკულატორის ღილაკი/
    //კლიენტის ავტორიზაცია//
        Homepagesteps.personalId.setValue(personid);
        Homepagesteps.documentid.setValue(docnum);
        Homepagesteps.checkbox.doubleClick();
        Homepagesteps.loanchechbtn.click();
        Homepagesteps.akidobalance.shouldNotBe(Condition.empty, Duration.ofMillis(20000));
        Homepagesteps.nextaplbtn.click();
    // შემოსავლები და ხარჯები//
        sleep(5000);
        Homepagesteps.incomeamount.setValue(income);
        Homepagesteps.comment.setValue(comentari);
        Homepagesteps.contactpers.setValue(cont_name);
        Homepagesteps.contractlastname.setValue(cont_lastname);
        Homepagesteps.contactperphone.setValue(cont_phone);
        Homepagesteps.contactpersconect.setValue(cont_conetcion);
        Homepagesteps.income_statement_btn.click();
    //ganacxadi//
sleep(5000);
        Homepagesteps.loan_product_id.click();
        Homepagesteps.loan_class.click();

        sleep(5000);
        */
/*Homepagesteps.loan_amount.setValue(loan_amount);
        Homepagesteps.term.setValue(term);
        Homepagesteps.first_payment_data.setValue(first_payment_data);
        Homepagesteps.loan_insurance.find(loan_insurance);
        Homepagesteps.insurance_product.find(loan_insurance_product);*//*


        sleep(5000);

        */
/*Homepagesteps.loan_product_id.setValue(loan_type).hover().click();*//*

        */
/*Homepagesteps.customer_select.click();*//*



        sleep(5000);
       */
/* Homepagesteps.customer_select.text().indexOf(2);*//*

        */
/*Homepagesteps.loan_product.hover().setValue(loan_product);*//*

       */
/* Homepagesteps.loan_product.click();*//*






    }
}


*/
