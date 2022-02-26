
    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class Activity3 {
        public static void main(String[] args) {
            WebDriver driver = new FirefoxDriver();

            driver.get(" https://training-support.net/selenium/simple-form");
            WebElement firstName = driver.findElement(By.id("firstName"));
            firstName.sendKeys("Testing");

            WebElement lastName = driver.findElement(By.id("lastName"));
            lastName.sendKeys(" Selenium");

            WebElement email = driver.findElement(By.id("email"));
            email.sendKeys("test@gmail.com");

            WebElement number = driver.findElement(By.id("number"));
            number.sendKeys("9876787654");

            WebElement submitBtn = driver.findElement(By.xpath("//input[@class='ui green button' and @value='submit']"));
            submitBtn.click();

            driver.quit();

        }

}
