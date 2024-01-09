package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Utility;


public class TestRightClick extends Utility {
    String baseUrl = "http://swisnl.github.io/jQuery-contextMenu/demo.html";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void rightClickExample(){
        Actions actions = new Actions(driver);
        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
        //RightClick on the Button
        actions.contextClick(button).build().perform();
        //Select a copy option
        clickOnElement(By.xpath("//body[1]/ul[1]/li[3]/span[1]"));
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();//accept the alert


    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
