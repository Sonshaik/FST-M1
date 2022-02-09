import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Activity_13_1 {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        File file = new File("filepath");

        //Open browser
        driver.get("https://www.training-support.net/selenium/upload");

        //Find upload field
        WebElement uploadInput = driver.findElement(By.id("uploadFile"));
        uploadInput.sendKeys(file.getAbsolutePath());

        //Click button to upload
        driver.findElement(By.id("uploadButton")).click();

        //Read file name
        String fileName = driver.findElement(By.tagName("h4")).getText();
        System.out.println(fileName);

        //Close browser
        driver.close();
    }

    public void writeExcel(String filePath) {
    }

    public void readExcel(String filePath) {
    }
}
