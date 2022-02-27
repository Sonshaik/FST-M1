
package fst22package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;


public class LMS_Project {
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
            assertTrue(heading.contains("Learn from Industry Experts"));

            //  String Heading = driver.findElement(By.className("uagb-ifb-title")).getText();
            //Assert.assertTrue(Heading.contains("Learn from Industry Experts"));
        }

        @Test
        public void TitleFirst()
        {
            String TitleFirst = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div[1]/div[2]/div/div")).getText();
            System.out.println("TitleFirst is: " + TitleFirst);
            assertTrue(TitleFirst.contains("Actionable Training"));

            // String Heading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div[1]/div[2]/div/div")).getText();
            //Assert.assertTrue(TitleFirst.contains("Actionable Training"));
        }



        @Test
        public void Marketing()
        {
            String Marketing = driver.findElement(By.cssSelector("#post-71 > div.caption > h3")).getText();
            System.out.println("Marketing is: " + Marketing);
            assertTrue(Marketing.contains("Email Marketing Strategies"));

            // String Heading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div[1]/div[2]/div/div")).getText();
            //Assert.assertTrue(TitleFirst.contains("Actionable Training"));
        }


        @Test
        public void MyAccount()
        {
            //Find and click on My Accounts link
            WebElement myAccountLnk = driver.findElement(By.cssSelector("li#menu-item-1507"));
            myAccountLnk.click();
            // Find and validate page title
            String title = driver.getTitle();
            //Print the title
            System.out.println("Page title is: " + title);
            Assert.assertEquals("My Account – Alchemy LMS", title);

        }

        @Test
        public void Accountlogin() {

            WebElement myAccountLnk = driver.findElement(By.cssSelector("li#menu-item-1507"));
            myAccountLnk.click();
            // Validate page title
            String title = driver.getTitle();
            //Print the title
            System.out.println("Page title is: " + title);
            Assert.assertEquals("My Account – Alchemy LMS", title);
            // Click on login button
            driver.findElement(By.cssSelector("div.learndash-wrapper a.ld-login")).click();
            // Login with valid credentials
            driver.findElement(By.cssSelector("input#user_login")).sendKeys("root");
            driver.findElement(By.cssSelector("input#user_pass")).sendKeys("pa$$w0rd");
            driver.findElement(By.cssSelector("p.login-submit")).click();
            // Verify page title after login
            String newTitle = driver.getTitle();
            //Print the title of the page
            System.out.println("Page title is: " + newTitle);
            Assert.assertEquals("My Account – Alchemy LMS", newTitle);
            // Verify username on at the top after login
            String user = driver.findElement(By.cssSelector("a.ab-item span.display-name")).getText();
            Assert.assertEquals(user, "root");

        }

        @Test
        public void  AllCourses() {
            List<WebElement> menu = driver.findElements(By.cssSelector("ul#primary-menu li"));
            System.out.println("Total number of Menu Options available at Top Navigation bar are: " + menu.size() );    	int i = 0;
            for(WebElement e : menu) {
                if (e.getText().equals("All Courses")){
                    e.click();
                    break;
                }
            }
            String title = driver.getTitle();
            System.out.println("Page title is: " + title);
            Assert.assertEquals("All Courses – Alchemy LMS", title);
            List<WebElement> courses = driver.findElements(By.cssSelector("div.caption h3.entry-title"));
            System.out.println("Total number of Courses are: " + courses.size() );
        }


        @Test
        public void ContactUs()
        {
            //Click on contact menu option
            driver.findElement(By.cssSelector("li#menu-item-1506 a")).click();
            String title = driver.getTitle();
            System.out.println("Page title is: " + title);
            Assert.assertEquals("Contact – Alchemy LMS", title);
            driver.findElement(By.cssSelector("input#wpforms-8-field_0")).sendKeys("Vinaya");
            driver.findElement(By.cssSelector("input#wpforms-8-field_1")).sendKeys("vinaya.rasal1@ibm.com");
            driver.findElement(By.cssSelector("input#wpforms-8-field_3")).sendKeys("TestSubject");
            driver.findElement(By.cssSelector("textarea#wpforms-8-field_2")).sendKeys("Test Message");
            driver.findElement(By.cssSelector("button.wpforms-submit")).click();
            String message= driver.findElement(By.cssSelector("div#wpforms-confirmation-8 p")).getText();
            System.out.println(message);
            Assert.assertEquals("Thanks for contacting us! We will be in touch with you shortly.", message);
        }

        @Test
        public void Final() {
            driver.findElement(By.cssSelector("li#menu-item-1507")).click();
            driver.findElement(By.cssSelector("div.learndash-wrapper a.ld-login")).click();
            driver.findElement(By.cssSelector("input#user_login")).sendKeys("root");
            driver.findElement(By.cssSelector("input#user_pass")).sendKeys("pa$$w0rd");
            driver.findElement(By.cssSelector("p.login-submit")).click();
            driver.findElement(By.cssSelector("li#menu-item-1508 a")).click();
            String title = driver.getTitle();
            System.out.println("Page title is: " + title);
            Assert.assertEquals("All Courses – Alchemy LMS", title);
            List<WebElement> courses = driver.findElements(By.cssSelector("p.ld_course_grid_button a.btn-primary"));
            courses.get(1).click();
            driver.findElement(By.cssSelector("div.ld-item-title")).click();
            boolean isPresent = driver.findElements(By.cssSelector(" input.learndash_mark_complete_button")).size() > 0 ;
            if(isPresent)
            {
                driver.findElement(By.cssSelector(" input.learndash_mark_complete_button")).click();
            } else { System.out.println("Mark Complete button not available"); }

        }


        //h1[contains(@class,"uagb-ifb-title")] hpath
        @AfterTest
        public void afterMethod() {
            //Close the browser
            driver.quit();
        }

    }

