// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Lab2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void lab2() {
    driver.get("https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers");
    driver.manage().window().setSize(new Dimension(1200, 680));
    {
      WebElement element = driver.findElement(By.linkText("Best Sellers"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector("li:nth-child(2) > .\\_p13n-zg-nav-tab-all_style_zg-tabs-li-div__1YdPR > a")).click();
    {
      WebElement element = driver.findElement(By.linkText("Amazon Basics"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.linkText("Amazon Basics")).click();
    js.executeScript("window.scrollTo(0,6)");
    driver.findElement(By.cssSelector(".Navigation__hasChildren__jSUsH:nth-child(2) > a")).click();
    driver.findElement(By.linkText("Fall Favorites")).click();
    driver.findElement(By.cssSelector(".Navigation__navList__HrEra > .Navigation__navItem__bakjf:nth-child(5) > a")).click();
  }
}
