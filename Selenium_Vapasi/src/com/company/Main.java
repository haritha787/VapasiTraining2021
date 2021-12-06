package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" ,"./Driver/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/signup");
        driver.manage().window().maximize();
//        String str=driver.getTitle();
//      String str=driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#signup [href=\"/login\"]")).click();

        driver.findElement(By.cssSelector("input#spree_user_email")).sendKeys("test197859@test.com");
        //driver.findElement(By.id("spree_user_email")).sendKeys("test10968@test.com");
        driver.findElement(By.name("spree_user[password]")).sendKeys("123456901");
        driver.findElement(By.cssSelector("input[value='Login']")).click();
        String loginMessage=driver.findElement(By.cssSelector("div[class='alert alert-success']")).getText();
        if(loginMessage=="Logged in successfully");
        System.out.println(loginMessage);
        //driver.findElement(By.cssSelector("input[name='spree_user[password_confirmation]']")).sendKeys("123456901");
        //driver.findElement(By.cssSelector("input[data-disable-with='Create']")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
         WebElement dropDown=driver.findElement(By.id("taxon"));
        Select select =new Select(dropDown);
        select.selectByValue("1");
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        driver.findElement(By.id("keywords")).sendKeys("rails");
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
         List<WebElement> catchElementsList=driver.findElements(By.cssSelector("div[id='products'] a"));
         int numberOfElements=catchElementsList.size();
        System.out.println("Number of elements: "+numberOfElements);
        for(int i=0;i<numberOfElements;i++)
        {
            String productTitle=catchElementsList.get(i).getText();
            System.out.println("Product Title: "+productTitle);
        }
//        driver.findElement(By.cssSelector("span[title='Ruby on Rails Mug']")).click();
//        driver.findElement(By.cssSelector("input[id='quantity']")).clear();
//        driver.findElement(By.cssSelector("input[id='quantity']")).sendKeys("2");
//        driver.findElement(By.id("add-to-cart-button")).click();
//        Thread.sleep(2000);
//        String total=driver.findElement(By.cssSelector("td[class='lead']")).getText();
//        System.out.println(total);
//        driver.findElement(By.id("checkout-link")).click();
//        String totalcheckout=driver.findElement(By.cssSelector("span[id=\"summary-order-total\"]")).getText();
//        System.out.println(totalcheckout);
        //driver.quit();
    }
}
