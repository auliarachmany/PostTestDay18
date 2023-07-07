package com.test18;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.test18.drivers.DriverSingleton;
import com.test18.utils.Constants;
import com.test18.utils.TestScenarios;
import com.test18.utils.Utils;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {

    static WebDriver driver;
    static ExtentTest extentTest;
    static ExtentReports reports = new ExtentReports("target/extent-report.html");

    @Before
    public static void setUp(){
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        TestScenarios[] test = TestScenarios.values();
        extentTest = reports.startTest(test[Utils.testCount].getTestCaseName());
        Utils.testCount++;
    }

    @AfterStep


    public void getResultStatus(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            String screeshotPath = Utils.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            extentTest.log(LogStatus.FAIL, scenario.getName() + "\n"
                    + extentTest.addScreenCapture(screeshotPath));
        }

    }
    @After
    public void endTestCase(){
        reports.endTest(extentTest);
        reports.flush();
    }

    @AfterAll
    public static void closeBrowser(){
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
