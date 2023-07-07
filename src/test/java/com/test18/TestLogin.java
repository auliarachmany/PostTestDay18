package com.test18;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.test18.pages.Login;
import com.test18.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    static WebDriver driver;
    static ExtentTest extentTest;
    static Login login = new Login();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Masuk Halaman Login")
    public void masuk_halaman_login(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "Masuk Halaman Login");
    }

    @And("input username")
    public void input_username(){
        login.Username("aul2");
        extentTest.log(LogStatus.PASS, "input username");
    }

    @And("Input password")
    public void input_password(){
        login.Password("@Aulia999_888");
        extentTest.log(LogStatus.PASS, "Input password");
    }

    @And("klik button login")
    public void klik_button_login(){
        login.Btnlogin();
        extentTest.log(LogStatus.PASS, "klik button login");
    }

    @Then("menampilkan dashboard")
    public void user_get_header_lembur(){
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(login.getTxtaul(),"aul2");
        extentTest.log(LogStatus.PASS,"menampilkan dashboard");
    }
}
