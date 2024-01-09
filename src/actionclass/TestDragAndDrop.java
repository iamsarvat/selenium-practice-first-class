package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Utility;


public class TestDragAndDrop extends Utility {

    String baseUrl = "https://jqueryui.com/resources/demos/droppable/default.html";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void dragAndDropExample() {
        Actions actions = new Actions(driver);
        //Find the element draggable
        WebElement draggable = driver.findElement(By.id("draggable"));
        //Find the droppable element
        WebElement droppable = driver.findElement(By.id("droppable"));
        //To drag and drop
        actions.dragAndDrop(draggable, droppable).build().perform();


    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
