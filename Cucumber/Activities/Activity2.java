
import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");
        System.out.println("page title is : "+driver.getTitle());
        driver.findElement(By.id("about-link")).click();

        System.out.println("page title is : "+driver.getTitle());
        driver.close();
    }
}


