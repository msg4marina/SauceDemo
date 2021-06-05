package tests.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    //TODO create test run usingAPI (add testcases too)
    public void onStart(ITestContext context) {
    }

    //ITestListener позволяет следить за выполнением теста
    public void onTestStart(ITestResult result) {
        System.out.println(String.format("Test started: %s", result.getName()));
    }

    //TODO API request to set status of test case
    public void onTestFailure(ITestResult result) {
        //вызов драйвера для создания скриншота
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
        ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        System.out.println(String.format("Test failed: %s", result.getName()));
    }
}
