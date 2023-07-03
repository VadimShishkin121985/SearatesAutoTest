package pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class SignUpPage extends UtilsForProject {
    SelenideElement firstName () {return $x("//input[@name='f_name']");}
    SelenideElement lastName () {return $x("//input[@name='l_name']");}
    SelenideElement email () {return $x("//input[@name='email']");}
    SelenideElement countrySelector () {return $x("//select//option[@data-tel='380']");}
    SelenideElement phone () {return $x("//input[@name='phone']");}
    SelenideElement companyName () {return $x("//input[@name='company_name']");}
    SelenideElement password () {return $x("//input[@name='password']");}
    SelenideElement submitButton() {return $x("//button[@type='submit']");}

    private final String FIRSTNAME = "Test";
    private final String LASTNAME = "Test";
    private final String PHONE = "+380677821582";
    private final String COMPANYNAME = "Test";
    private final String PASSWORD = "Acpt!123";
    private final String EMAIL = "121985ops+12345@gmail.com";



    public void submitSignUp(){
        firstName().sendKeys(FIRSTNAME);
        lastName().sendKeys(LASTNAME);
        email().sendKeys(EMAIL);
        countrySelector().click();
        phone().sendKeys(PHONE);
        companyName().sendKeys(COMPANYNAME);
        password().sendKeys(PASSWORD);
        submitButton().click();
        pause(3000);


    }


}
