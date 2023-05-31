package StepObject;

import PageObject.CommeteElement;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.proxy.SelenideProxyServer;

import java.time.Duration;

import static DataObject.ClientAuthorizationData.personid;
import static DataObject.CommeteeData.commituser;
import static com.codeborne.selenide.Selenide.*;


public class CommeteSteps extends CommeteElement {

    public CommeteSteps commeteeuser(String commituser) {
        user.setValue(commituser);
        return this;
    }

    public CommeteSteps passwordinput(String passw) {
        password.setValue(passw);
        return this;
    }

    public CommeteSteps submitbtn() {
        submitbtn.click();
        return this;
    }

    public CommeteSteps profilecheck() {
        profilecheck.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }

    public CommeteSteps ganacxadebi() {
        ganacxadebi.click();
        return this;
    }

    public CommeteSteps ganacxadis_detalebi() {
        ganacxadis_detalebi.click();
        return this;
    }
  /*  public CommeteSteps aplikaciisdetal(){
        if (klId == personid)
            System.out.println(klId);
        return this;
    }*/


    public CommeteSteps statusi() {
        do {
            refresh();
            sleep(5000);
        }
        while (statusi.is(Condition.hidden));
        return this;
    }

    public CommeteSteps komitetibtn() {
        komitetibtn.click();
        return this;
    }
    public CommeteSteps searchId(String personid) {
        searchId.setValue(personid);
        return this;
    }

    public CommeteSteps filtribtn() {
        filtribtn.click();
        return this;
    }

   public CommeteSteps commettee_detalebi() {
        commettee_detalebi.click();
        return this;
    }
    public CommeteSteps gankhilvabtn() {
        gankhilvabtn.click();
        return this;
    }
    public CommeteSteps Areyousure() {
        Areyousure.click();
        return this;
    }

    public CommeteSteps damtkicebabtn() {
        damtkicebabtn.shouldBe(Condition.visible,Duration.ofMillis(10000));
        damtkicebabtn.click();
        return this;
    }
    public CommeteSteps damtkicebacomment(String commetcomment) {
        damtkicebacomment.setValue(commetcomment);
        return this;
    }
    public CommeteSteps damtkicebisbtn() {
        damtkicebisbtn.click();
        return this;
    }
    public CommeteSteps alarteccept() {
        switchTo().alert().accept();
        return this;
    }
}

  /*  public CommeteSteps aplikaciisstatusi() {
        aplikaciisdetalebi.is(Condition.attribute(String.valueOf(statusi)));
        return this;
    }
    public CommeteSteps aplikaciisstatusi2() {
        aplikaciisdetalebi.is(Condition.attribute(String.valueOf(statusi2)));
        return this;
    }
    public CommeteSteps aplikaciisstatusi3() {
        aplikaciisdetalebi.is(Condition.attribute(String.valueOf(statusi3)));
        return this;

    }*/

/*    public CommeteSteps komiteti() {
        if (statusi3 == statusi3) {
            komiteti.click();
        } else {
            refresh();
        }
        return this;
    }*/


  /*  public CommeteSteps komiteti() {

        if (statusi3 == statusi2) {
            komiteti.click();
            return this;
        } else {
            refresh();
            return this;
        }

    }*/

 /*   public CommeteSteps statusi2() {
        do refresh();
        while (statusi2.is((Condition) statusi2));
        return this;
    }*/

 /*   public CommeteSteps statusi3() {
        do refresh();
        while (statusi3.is((Condition) statusi3));
        return this;

    }*/

/*
    public CommeteSteps komiteti() {
        komiteti.click();
        return this;
    }

    public CommeteSteps commitetbtn() {
        commitetbtn.click();
        return this;
    }
    public CommeteSteps ganxilvabtn() {
        ganxilvabtn.click();
        return this;
    }

    public CommeteSteps confirmbtn() {
        confirmbtn.click();
        return this;
    }
    public CommeteSteps commetdetailscheck() {
        commetdetailscheck.shouldBe(Condition.visible,Duration.ofMillis(5000));
        return this;
    }*/




