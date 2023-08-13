import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LinkTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the path to the Chrome driver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize the Chrome driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testCountAndPrintLinks() {
        // Navigate to "https://flipkart.com"
        driver.get("https://flipkart.com");

        // Find all the links on the page
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

        // Print the number of links on the page
        System.out.println("Number of links on the page: " + links.size());

        // Print link text and URLs
        for (WebElement link : links) {
            System.out.println("Link Text: " + link.getText());
            System.out.println("Link URL: " + link.getAttribute("href"));
            System.out.println("-------------------------");
        }
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
