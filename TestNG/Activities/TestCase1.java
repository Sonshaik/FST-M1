package fst22package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCase1 {
    WebDriver driver;

    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        // Get the title of the website.
        String title = driver.getTitle();

        //Open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }


    @Test
    public void Testcase() {
        //This test case will pass
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Alchemy LMS – An LMS Application");
    }
    @Test
           public void HeaderTest1()
    {
        String heading = driver.findElement(By.className("uagb-ifb-title")).getText();
        System.out.println("header is: " + heading);
        Assert.assertTrue(heading.contains("Learn from Industry Experts"));

      //  String Heading = driver.findElement(By.className("uagb-ifb-title")).getText();
       //Assert.assertTrue(Heading.contains("Learn from Industry Experts"));
    }

    @Test
    public void TitleFirst()
    {
       String TitleFirst = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div[1]/div[2]/div/div")).getText();
       System.out.println("TitleFirst is: " + TitleFirst);
       Assert.assertTrue(TitleFirst.contains("Actionable Training"));

        // String Heading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div[1]/div[2]/div/div")).getText();
        //Assert.assertTrue(TitleFirst.contains("Actionable Training"));
    }



    @Test
    public void Marketing()
    {
        String Marketing = driver.findElement(By.cssSelector("#post-71 > div.caption > h3")).getText();
        System.out.println("Marketing is: " + Marketing);
        Assert.assertTrue(Marketing.contains("Email Marketing Strategies"));

        // String Heading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div[1]/div[2]/div/div")).getText();
        //Assert.assertTrue(TitleFirst.contains("Actionable Training"));
    }

    @Test
    public void MyAccount()
    {
        String MyAccount = driver.findElement(By.cssSelector ("#menu-item-1507 > a")).getText();
        //Click Log in
        driver.findElement(By.cssSelector("#menu-item-1507 > a")).click();
        String heading = driver.findElement(By.className("uagb-ifb-title")).getText();
        System.out.println("header is: " + heading);
        Assert.assertTrue(heading.contains("Learn from Industry Experts"));
        System.out.println("header is: " + heading);


        // String Heading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div[1]/div[2]/div/div")).getText();
        //Assert.assertTrue(TitleFirst.contains("Actionable Training"));
    }
        //h1[contains(@class,"uagb-ifb-title")] hpath

    @AfterTest
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}

