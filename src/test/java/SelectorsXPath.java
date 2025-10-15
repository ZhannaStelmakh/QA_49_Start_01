import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;


    public class SelectorsXPath {
        WebDriver driver = new ChromeDriver();

        @Test
        public void phoneBookTest() {
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://telranedu.web.app/home");
            WebElement btnAbout = driver.findElement(
                    By.xpath("//a[@href='/about']"));
            btnAbout.click();
            //btnAbout.sendKeys();
            SelectorsCss.pause(3);
            System.out.println(btnAbout.getText());
            System.out.println(btnAbout.getTagName());
            System.out.println(btnAbout.isEnabled());
            System.out.println(btnAbout.isDisplayed());
            WebElement btnLoginHeader = driver.findElement(
                    By.xpath("//*[text() = 'LOGIN']"));
            btnLoginHeader.click();
            WebElement inputEmail = driver.findElement(
                    By.xpath("//form/input[contains(@name, 'em')]"));
            int i = new Random().nextInt(1000);    //0 - 999
            String email = "new_bobs_email" + i + "@mail.com";  //new_bobs_email123@mail.com
            inputEmail.sendKeys(email);
            WebElement inputPassword = driver.findElement(
                    By.xpath("//form/input[last()]"));
            inputPassword.sendKeys("Password123!");

            List<WebElement> buttons = driver.findElements(
                    By.xpath("//button"));
            System.out.println(buttons);
            System.out.println(buttons.get(0).getText());
            System.out.println(buttons.get(1).getText());
            SelectorsCss.pause(3);
            buttons.get(1).click();
            WebElement btnSignOut = driver.findElement(
                    By.xpath("//*[contains(text(),Out)]"));
            SelectorsCss.pause(3);
            btnSignOut.click();
            driver.close();  //close window
            //driver.quit(); //close  browser

        }

        @Test
        public void iLcarroTest() {
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://ilcarro.web.app/search");

            WebElement btnSearch = driver.findElement(
                    By.xpath("//a[@href='/search']"));
            SelectorsCss.pause(3);
            btnSearch.click();

            WebElement btnSignUp = driver.findElement(
                    By.xpath("//a[text()='Sign up']"));
            SelectorsCss.pause(3);
            btnSignUp.click();
            WebElement inputFirstName = driver.findElement(
                    By.xpath("//input[@formcontrolname='firstName']"));
            inputFirstName.sendKeys("Vishenka");
            WebElement inputLastName = driver.findElement(
                    By.xpath("//input[@formcontrolname='lastName']"));
            inputLastName.sendKeys("SSSStlmkh");
            WebElement inputEmailIlCarro = driver.findElement(
                    By.xpath("//input[@formcontrolname='email']"));
            inputEmailIlCarro.sendKeys("cherry@gmail.com");
            WebElement inputPasswordIlCarro = driver.findElement(
                    By.xpath("//input[@formcontrolname='password']"));
            inputPasswordIlCarro.sendKeys("Ch12345$");
            WebElement inputCheckBox = driver.findElement(
                    By.xpath("//input[@formcontrolname='termsOfUse']"));
            WebElement btnYalla = driver.findElement(
                    By.xpath("//*[text()='Y’alla!']"));
            btnYalla.click();


            WebElement btnLogIn = driver.findElement(
                    By.xpath("//a[text()='Log in']"));
            SelectorsCss.pause(3);
            btnLogIn.click();

            driver.close();

        }

}
