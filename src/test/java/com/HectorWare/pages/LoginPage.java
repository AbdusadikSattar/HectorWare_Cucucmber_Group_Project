package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class LoginPage extends  BasePage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "password")
    public WebElement userPass;

    @FindBy(id = "user")
    public WebElement userLoginName;

    @FindBy(id = "submit-form")
    public WebElement SigninBtn;

    public void login(String userNameStr, String PassWordStr) {
        userLoginName.sendKeys(userNameStr);
        userPass.sendKeys(PassWordStr);
        SigninBtn.click();


    }

}


