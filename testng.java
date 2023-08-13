import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class FlipkartLinkTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the system property for the ChromeDriver (provide the path to your ChromeDriver executable)
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize Chrome browser
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @Test
    public void countLinksOnHomepage() {
        // Navigate to Flipkart homepage
        driver.get("https://www.flipkart.com/");

        // Find all the links on the page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // Print the count of links
        System.out.println("Number of links on the homepage: " + allLinks.size());
    }

    @Test
    public void printLinkTextAndURLs() {
        // Navigate to Flipkart homepage
        driver.get("https://www.flipkart.com/");

        // Find all the links on the page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // Print link text and URLs
        for (WebElement link : allLinks) {
            System.out.println("Link Text: " + link.getText());
            System.out.println("URL: " + link.getAttribute("href"));
        }
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
