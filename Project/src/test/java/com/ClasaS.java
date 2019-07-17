package com;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ClasaS {

    @Test
    public void sth()
    {
        System.setProperty("webdriver.chrome.driver", "c://Users//dianaioanagiurgiu//IdeaProjects//Project//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa2.dev.evozon.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        WebElement elementLogo=driver.findElement(By.className("logo"));
        elementLogo.click();
       // System.out.println(elementLogo.toString());
        driver.navigate().to("http://qa2.dev.evozon.com/accessories/eyewear.html");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }

    @Test
    public void account()
    {
        System.setProperty("webdriver.chrome.driver", "c://Users//dianaioanagiurgiu//IdeaProjects//Project//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa2.dev.evozon.com/");
        WebElement elementLogo=driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a"));
        elementLogo.click();
        //elementLogo.findElement(By.partialLinkText("Log In")).click();
        //elementLogo.findElement(By.className("last")).click();
        WebElement el= driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        el.click();
      //  WebElement elm= driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).findElement(By.linkText("Log In"));
        //elm.click();
        driver.quit();

    }

    @Test
    public void language()
    {
        System.setProperty("webdriver.chrome.driver", "c://Users//dianaioanagiurgiu//IdeaProjects//Project//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa2.dev.evozon.com/");
        WebElement el= driver.findElement(By.id("select-language"));
        Select sel= new Select(el);
        //sel.selectByVisibleText("French").click();
        List<WebElement> ele= driver.findElements(By.cssSelector("#select-language option"));
        System.out.println(ele.size());
        for(WebElement ww: ele)
        {
            System.out.println(ww.getText());
        }
        sel.selectByIndex(1);
      //  driver.findElements(By.cssSelector("#select-language option"))
        driver.quit();


    }
    @Test
    public void search()
    {
        System.setProperty("webdriver.chrome.driver", "c://Users//dianaioanagiurgiu//IdeaProjects//Project//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa2.dev.evozon.com/");
        WebElement elem=driver.findElement(By.id("search"));
        elem.clear();
        elem.sendKeys("woman");
        elem.submit();
        driver.quit();

    }
    @Test
    public void newProductList()
    {
        System.setProperty("webdriver.chrome.driver", "c://Users//dianaioanagiurgiu//IdeaProjects//Project//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa2.dev.evozon.com/");
      //  WebElement el= driver.findElement(By.className("products-grid products-grid--max-5-col-widget"));
        List<WebElement>elements= driver.findElements(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li"));
        System.out.println(elements.size());
        for(WebElement ww: elements)
        {
            System.out.println(ww.getText());
        }
        driver.quit();
    }

    @Test
    public void navigation()
    {
        System.setProperty("webdriver.chrome.driver", "c://Users//dianaioanagiurgiu//IdeaProjects//Project//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa2.dev.evozon.com/");
        WebElement el=driver.findElement(By.id("nav"));
        List<WebElement>headline=driver.findElements(By.cssSelector("#nav > ol>li"));
        for(WebElement ww: headline)
        {
            System.out.println(ww.getText());
          //  ww.click();
        }
        WebElement ww=headline.get(4);
        ww.click();
        WebElement eAl= driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > div.actions > button"));
        //System.out.println(eAl.getText());
        eAl.click();
        WebElement elem=driver.findElement(By.id("search"));
        elem.clear();
        elem.sendKeys("pillow");
        elem.submit();
        WebElement eAl2= driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > div.actions > button"));
        eAl2.click();
        WebElement cart= driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.cart.display-single-price > div.cart-totals-wrapper > div > ul > li > button"));
        cart.click();
        WebElement register= driver.findElement(By.cssSelector("#onepage-guest-register-button"));
        register.click();
        WebElement firstName= driver.findElement(By.cssSelector("#billing\\:firstname"));
        firstName.sendKeys("Numele");
        WebElement lastName= driver.findElement(By.cssSelector("#billing\\:lastname"));
        lastName.sendKeys("Numele");

        WebElement email= driver.findElement(By.cssSelector("#billing\\:email"));
        email.sendKeys("Numele");


        WebElement address= driver.findElement(By.cssSelector("#billing\\:street1"));
        address.sendKeys("Numele");




    }

}
