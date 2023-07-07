package com.test18.pages;

import com.test18.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;
    public Login(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(name = "login")
    WebElement buttonlogin;

    @FindBy(xpath = "/html/body/div[1]/div[2]/main/article/div/div/div/p[1]/strong[1]")
    WebElement txtaul;

    public void Btnlogin() {
        buttonlogin.click();
    }

    public void Username(String username) {
        this.username.sendKeys(username);
    }

    public void Password(String password) {
        this.password.sendKeys(password);
    }

    public String getTxtaul(){
        return txtaul.getText();
    }
}
