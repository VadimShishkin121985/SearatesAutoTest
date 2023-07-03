import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.MainPage;
import pageObject.SignInPage;
import pageObject.SignUpPage;

import static com.codeborne.selenide.Selenide.open;

;

public class Tests extends BaseClass{

    MainPage mainPage = new MainPage();
    SignInPage signInPage = new SignInPage();
    SignUpPage signUpPage = new SignUpPage();

    @BeforeClass
    public void beforeClass(){
        open("https://www.searates.com/");
        }


    @Test
    public void testLogin(){
        mainPage.clickToSingin()
                .loggIn();
    }

    @Test
    public void testSignUP(){
        mainPage.clickToSingin()
                .signUpButton()
                .submitSignUp();


    }



}
