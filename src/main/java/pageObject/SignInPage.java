package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class SignInPage {
    private final String USERNAME = "testingmanager";
    private final String PASSWORD = "Testingmanager-123";

    SelenideElement userName (){return $x("//input[@class='input' and @type='text']");}
    SelenideElement passWord () {
        return $x("//input[@class='input' and @type='password']");
    }
    SelenideElement signInButton (){
        return $x("//button[@type='submit']");
    }
    SelenideElement signUpLink(){return $x("//a[@href='/auth/sign-up']");}


    public void loggIn (){
        userName().sendKeys(USERNAME);
        passWord().sendKeys(PASSWORD);
        signInButton().click();
        $x("//i[@class='far fa-unlock-alt']").should(Condition.exist);
    }
    public SignUpPage signUpButton (){
        signUpLink().click();
        return new SignUpPage();
    }




}
