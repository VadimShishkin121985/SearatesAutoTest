package pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    SelenideElement signInMainPage(){
        return $x("//a[@class='navbar__link navbar__link_signIn | js-nav-item']");
    }
    public SignInPage clickToSingin (){
        signInMainPage().click();
        return new SignInPage();

    }
}
