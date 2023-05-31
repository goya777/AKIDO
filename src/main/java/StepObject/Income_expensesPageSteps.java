package StepObject;

import PageObject.Income_expensesPage_Element;

public class Income_expensesPageSteps extends Income_expensesPage_Element {

    public Income_expensesPageSteps incomeamount(String income){
        incomeamount.setValue(income);
        return this;
    }
    public Income_expensesPageSteps commentari (String comentari){
        commentari.setValue(comentari);
        return this;
    }

    public Income_expensesPageSteps contractpers (String cont_name){
        contractpers.setValue(cont_name);
        return this;
    }

    public Income_expensesPageSteps contractlastname (String cont_lastname){
        contractlastname.setValue(cont_lastname);
        return this;
    }
    public Income_expensesPageSteps contactperphone (String cont_phone){
        contactperphone.setValue(cont_phone);
        return this;
    }
    public Income_expensesPageSteps contactpersconect (String cont_conetcion){
        contactpersconect.setValue(cont_conetcion);
        return this;
    }
    public Income_expensesPageSteps income_statement_btn (){
        income_statement_btn.click();
        return this;
    }
}
