package seleniumwaits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;


public class TestExplicitlyWait extends Utility {
    String baseUrl = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void explicitlyWaitExample(){
        clickOnElement(By.xpath("//a[contains(text(),'Sign In')]"));

        //use explicit wait
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        WebElement username =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
//        username.sendKeys("babyboss@googly.com");
        waitUntilVisibilityOfElementLocated(By.id("email"),5).sendKeys("babybossy@googly.com");

    }


    @After
    public void tearDown() {
//        closeBrowser();
    }

}
