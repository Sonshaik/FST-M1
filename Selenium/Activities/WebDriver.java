import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class WebDriver implements org.openqa.selenium.WebDriver {
    public void get(String s) {
    }

    @Override
    public String getCurrentUrl() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public WebElement findElement(By xpath) {
        return null;
    }

    @Override
    public String getPageSource() {
        return null;
    }

    public void close() {
    }

    @Override
    public void quit() {

    }

    @Override
    public Set<String> getWindowHandles() {
        return null;
    }

    @Override
    public String getWindowHandle() {
        return null;
    }

    @Override
    public TargetLocator switchTo() {
        return null;
    }

    @Override
    public Navigation navigate() {
        return null;
    }

    @Override
    public Options manage() {
        return null;
    }

    public List<WebElement> findElements(By xpath) {
        return null;
    }
}