package javascriptexecutor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class JavaScriptExecutorTest extends Utility {
    String baseUrl = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void executeJavaScriptFunction() throws InterruptedException {
        //accepting the cookies
        clickOnElement(By.id("accept-choices"));
        //Switch to the frame
        driver.switchTo().frame("iframeResult");
        Thread.sleep(2000);
        //Define the JavaScriptExecutor Object
        JavascriptExecutor js = (JavascriptExecutor) driver;  //Casting the driver for JScript
        //Execute the Function (On click function)
        js.executeScript("myFunction()");
        //Execute the Script (How to Highlight the element)
        js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.id("mySubmit")));
    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
