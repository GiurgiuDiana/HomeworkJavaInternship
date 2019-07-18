package com;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JunitDay15 {
    WebDriver driver;

    @Before
    public void navigation() {
        System.setProperty("webdriver.chrome.driver", "c://Users//dianaioanagiurgiu//IdeaProjects//Project//drivers//chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://qa2.dev.evozon.com/");
    }

    @Test
    public void checkTitle() {
        assertTrue(driver.getTitle().contentEquals("Madison Island"));
        assertTrue(driver.getCurrentUrl().contentEquals("http://qa2.dev.evozon.com/"));
        WebElement elementLogo = driver.findElement(By.className("logo"));
        assertTrue(elementLogo.isDisplayed());
        elementLogo.click();
        assertTrue(driver.getCurrentUrl().contentEquals("http://qa2.dev.evozon.com/"));
        driver.navigate().to("http://qa2.dev.evozon.com/accessories/eyewear.html");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    @Test
    public void checkAccount()
    {
        WebElement account=driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a"));
        account.click();
        WebElement isVisibleAccount= driver.findElement(By.cssSelector("#header-account"));
        assertTrue(isVisibleAccount.getText().contains("Account"));
        assertTrue(isVisibleAccount.isDisplayed());
    }

    @Test
    public void checkLanguage()
    {
        WebElement elementLanguage= driver.findElement(By.id("select-language"));
        Select selectorLanguage= new Select(elementLanguage);
        List<WebElement> languageOption= driver.findElements(By.cssSelector("#select-language option"));
        for(WebElement ww: languageOption)
        {
            System.out.println(ww.getText());
        }
        assertEquals(3,languageOption.size());
       // sel.selectByIndex(1);
        selectorLanguage.selectByVisibleText("French");
        assertTrue(driver.findElement(By.cssSelector("#select-language > option:nth-child(2)")).getText().equals("French"));
    }

    @Test
    public void checkSearch()
    {
        WebElement elem=driver.findElement(By.id("search"));
        elem.clear();
        elem.sendKeys("woman");
        elem.submit();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement pageTitle = driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.page-title > h1"));
//        System.out.println(pageTitle.getText());
        assertTrue(pageTitle.getText().toLowerCase().contains("woman"));
    }

    @Test
    public void checkProducts()
    {
        List<WebElement>newProducts= driver.findElements(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li"));
        System.out.println(newProducts.size());
        for(WebElement ww: newProducts)
        {
            System.out.println(ww.getText());
        }
        assertEquals(5,newProducts.size());
    }

    @Test
    public void checkNavigation()
    {

        WebElement navigationHeadline=driver.findElement(By.id("nav"));
        List<WebElement>headline=driver.findElements(By.cssSelector("#nav > ol>li"));
        for(WebElement ww: headline)
        {
            //  ww.click();
            if(ww.getText().equalsIgnoreCase("Sale"))
            {
                ww.click();///ar trebui sa intram in sale
                break;
            }
        }
        ///deci intram in sale
        assertTrue(driver.getCurrentUrl().contentEquals("http://qa2.dev.evozon.com/sale.html"));
    }

    @Test
    public void productCart() throws InterruptedException {
       // WebElement el=driver.findElement(By.id("nav"));
        List<WebElement>headlineNavigation=driver.findElements(By.cssSelector("#nav > ol>li"));
        for(WebElement ww: headlineNavigation)
        {
            //  ww.click();
            if(ww.getText().equalsIgnoreCase("Sale"))
            {
                ww.click();///ar trebui sa intram in sale
                break;
            }
        }
        WebElement addFirstObjectCart= driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > div.actions > button"));
        String firstObjectName= driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > h2 > a")).getText();
        addFirstObjectCart.click();
        WebElement searchBar=driver.findElement(By.id("search"));
        searchBar.clear();
        searchBar.sendKeys("pillow");
        searchBar.submit();
        WebElement searchPageTitle = driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.page-title > h1"));
        assertTrue(searchPageTitle.getText().toLowerCase().contains("pillow"));
        WebElement addSecondObject= driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > div.actions > button"));
        String secondObjectName=driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > h2 > a")).getText();
        addSecondObject.click();
        assertTrue(driver.getCurrentUrl().contentEquals("http://qa2.dev.evozon.com/checkout/cart/"));///verif dacaa suntem in cart
        List<WebElement>productCart=driver.findElements(By.cssSelector("#shopping-cart-table > tbody "));
        for(WebElement ww: productCart)
        {
            System.out.println(ww.getText());////I need to see the products
            //  ww.click();
        }
        System.out.println("first"+firstObjectName);
        System.out.println("second"+secondObjectName);
        assertTrue(productCart.get(0).getText().contains(firstObjectName));
        assertTrue(productCart.get(0).getText().contains(secondObjectName));
        WebElement cart= driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.cart.display-single-price > div.cart-totals-wrapper > div > ul > li > button"));
        cart.click();
        WebElement proceedToCheckoutButton= driver.findElement(By.cssSelector("#onepage-guest-register-button"));
        proceedToCheckoutButton.click();
        WebElement inputBillingFirstName= driver.findElement(By.cssSelector("#billing\\:firstname"));
        inputBillingFirstName.sendKeys("Numele");
        WebElement inputBillingLastName= driver.findElement(By.cssSelector("#billing\\:lastname"));
        inputBillingLastName.sendKeys("Numele");
        WebElement inputBillingEmail= driver.findElement(By.cssSelector("#billing\\:email"));
        inputBillingEmail.sendKeys("Numele@provider.com");
        WebElement inputBillingAddress= driver.findElement(By.cssSelector("#billing\\:street1"));
        inputBillingAddress.sendKeys("Numele");
        WebElement inputBillingCity=driver.findElement(By.cssSelector("#billing\\:city"));
        inputBillingCity.sendKeys("Oras");
        WebElement inputBillingZip=driver.findElement(By.cssSelector("#billing\\:postcode"));
        inputBillingZip.sendKeys("452611");
        WebElement inputBillingTelephone= driver.findElement(By.cssSelector("#billing\\:telephone"));
        inputBillingTelephone.sendKeys("102456562");
        WebElement inputBillingProvince=driver.findElement(By.cssSelector("#billing\\:region_id"));
        Select selectProvince=new Select(inputBillingProvince);
        selectProvince.selectByVisibleText("Arizona");
        WebElement continueBilling=driver.findElement(By.cssSelector("#billing-buttons-container > button"));
        continueBilling.click();
        Thread.sleep(12000);
        WebElement edit= driver.findElement(By.cssSelector("#opc-shipping > div.step-title"));
        edit.click();
        /////part2
        WebElement inputShippingFirstName= driver.findElement(By.cssSelector("#shipping\\:firstname"));
        inputShippingFirstName.sendKeys("Nume");
        WebElement inputShippingLastName=driver.findElement(By.cssSelector("#shipping\\:lastname"));
        inputShippingLastName.sendKeys("Nume2");
        WebElement inputShippingAdress= driver.findElement(By.cssSelector("#shipping\\:street1"));
        inputShippingAdress.sendKeys("Adresa");
        WebElement inputShippingCity= driver.findElement(By.cssSelector("#shipping\\:city"));
        inputShippingCity.sendKeys("Oras");
        WebElement inputShippingProvince=driver.findElement(By.cssSelector("#shipping\\:region_id"));
        Select selectShippingProvince=new Select(inputShippingProvince);
        selectShippingProvince.selectByVisibleText("Arizona");
        WebElement inputShippingZIP=driver.findElement(By.cssSelector("#shipping\\:postcode"));
        inputShippingZIP.sendKeys("452362");
        WebElement inputShippingTelephone=driver.findElement(By.cssSelector("#shipping\\:telephone"));
        inputShippingTelephone.sendKeys("01325642102");
        WebElement continueShipping=driver.findElement(By.cssSelector("#shipping-buttons-container > button"));
        continueShipping.click();
        Thread.sleep(10000);
        WebElement checkFreeShippingMethod= driver.findElement(By.cssSelector("#checkout-shipping-method-load > dl > dd:nth-child(2) > ul > li > label"));
        checkFreeShippingMethod.click();
        WebElement continueShippingMethod= driver.findElement(By.cssSelector("#shipping-method-buttons-container > button"));
        continueShippingMethod.click();
        Thread.sleep(10000);
        WebElement continuePaymentInfo=driver.findElement(By.cssSelector("#payment-buttons-container > button"));
        continuePaymentInfo.click();
        Thread.sleep(10000);
        WebElement placeOrderButton=driver.findElement(By.cssSelector("#review-buttons-container > button"));
        placeOrderButton.click();
        Thread.sleep(10000);
        WebElement placeOrderMessage=driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.page-title"));
        System.out.println(placeOrderMessage.getText());
        assertTrue(placeOrderMessage.getText().contains("YOUR ORDER HAS BEEN RECEIVED."));
        WebElement orderConfirmationMessage=driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > p:nth-child(5)"));
        System.out.println(orderConfirmationMessage.getText());
        assertTrue(orderConfirmationMessage.getText().contains("order confirmation"));
        WebElement continueShoppingButton= driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.buttons-set > button"));
        continueShoppingButton.click();
        Thread.sleep(10000);
        WebElement newArrivalProduct=driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(2) > div > h3 > a"));
        newArrivalProduct.click();
        WebElement selectCollorProduct=driver.findElement(By.cssSelector("#option21"));
        selectCollorProduct.click();
        WebElement selectSizeProduct=driver.findElement(By.cssSelector("#swatch80"));
        selectSizeProduct.click();
        WebElement selectQuantityProduct=driver.findElement(By.cssSelector("#qty"));
        selectQuantityProduct.clear();
        selectQuantityProduct.sendKeys("5");
        selectQuantityProduct.submit();
        WebElement emptyCart=driver.findElement(By.cssSelector("#empty_cart_button"));
        emptyCart.click();
        Thread.sleep(5000);
    }

    @Test
    public void someDetails() throws InterruptedException {
        List<WebElement>headlineNavigation=driver.findElements(By.cssSelector("#nav > ol>li"));
        for(WebElement ww: headlineNavigation)
        {
            //  ww.click();
            if(ww.getText().equalsIgnoreCase("Home & Decor"))
            {
                ww.click();///ar trebui sa intram in home and decor
                break;
            }
        }
        WebElement selectSection=driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div.col-main > ul > li:nth-child(3) > a"));
        selectSection.click();
        assertTrue(driver.getCurrentUrl().contentEquals("http://qa2.dev.evozon.com/home-decor/electronics.html"));
        WebElement productView=driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > div.actions > a"));
        productView.click();
        WebElement productOptions=driver.findElement(By.cssSelector("#bundle-option-22"));
        Select selecting=new Select(productOptions);
        selecting.selectByIndex(1);
        WebElement selectQuantity=driver.findElement(By.cssSelector("#qty"));
        selectQuantity.clear();
        selectQuantity.sendKeys("2");
        selectQuantity.submit();
        /////proceed to checkout
        WebElement cart= driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.cart.display-single-price > div.cart-totals-wrapper > div > ul > li > button"));
        cart.click();
        WebElement proceedToCheckoutButton= driver.findElement(By.cssSelector("#onepage-guest-register-button"));
        proceedToCheckoutButton.click();
        WebElement inputBillingFirstName= driver.findElement(By.cssSelector("#billing\\:firstname"));
        inputBillingFirstName.sendKeys("Numele");
        WebElement inputBillingLastName= driver.findElement(By.cssSelector("#billing\\:lastname"));
        inputBillingLastName.sendKeys("Numele");
        WebElement inputBillingEmail= driver.findElement(By.cssSelector("#billing\\:email"));
        inputBillingEmail.sendKeys("Numele@provider.com");
        WebElement inputBillingAddress= driver.findElement(By.cssSelector("#billing\\:street1"));
        inputBillingAddress.sendKeys("Numele");
        WebElement inputBillingCity=driver.findElement(By.cssSelector("#billing\\:city"));
        inputBillingCity.sendKeys("Oras");
        WebElement inputBillingZip=driver.findElement(By.cssSelector("#billing\\:postcode"));
        inputBillingZip.sendKeys("452611");
        WebElement inputBillingTelephone= driver.findElement(By.cssSelector("#billing\\:telephone"));
        inputBillingTelephone.sendKeys("102456562");
        WebElement inputBillingProvince=driver.findElement(By.cssSelector("#billing\\:region_id"));
        Select selectProvince=new Select(inputBillingProvince);
        selectProvince.selectByVisibleText("Arizona");
        WebElement continueBilling=driver.findElement(By.cssSelector("#billing-buttons-container > button"));
        continueBilling.click();
        Thread.sleep(12000);
        WebElement edit= driver.findElement(By.cssSelector("#opc-shipping > div.step-title"));
        edit.click();
        /////part2
        WebElement inputShippingFirstName= driver.findElement(By.cssSelector("#shipping\\:firstname"));
        inputShippingFirstName.sendKeys("Nume");
        WebElement inputShippingLastName=driver.findElement(By.cssSelector("#shipping\\:lastname"));
        inputShippingLastName.sendKeys("Nume2");
        WebElement inputShippingAdress= driver.findElement(By.cssSelector("#shipping\\:street1"));
        inputShippingAdress.sendKeys("Adresa");
        WebElement inputShippingCity= driver.findElement(By.cssSelector("#shipping\\:city"));
        inputShippingCity.sendKeys("Oras");
        WebElement inputShippingProvince=driver.findElement(By.cssSelector("#shipping\\:region_id"));
        Select selectShippingProvince=new Select(inputShippingProvince);
        selectShippingProvince.selectByVisibleText("Arizona");
        WebElement inputShippingZIP=driver.findElement(By.cssSelector("#shipping\\:postcode"));
        inputShippingZIP.sendKeys("452362");
        WebElement inputShippingTelephone=driver.findElement(By.cssSelector("#shipping\\:telephone"));
        inputShippingTelephone.sendKeys("01325642102");
        WebElement continueShipping=driver.findElement(By.cssSelector("#shipping-buttons-container > button"));
        continueShipping.click();
        Thread.sleep(10000);
        WebElement checkFreeShippingMethod= driver.findElement(By.cssSelector("#checkout-shipping-method-load > dl > dd:nth-child(2) > ul > li > label"));
        checkFreeShippingMethod.click();
        WebElement continueShippingMethod= driver.findElement(By.cssSelector("#shipping-method-buttons-container > button"));
        continueShippingMethod.click();
        Thread.sleep(10000);
        WebElement continuePaymentInfo=driver.findElement(By.cssSelector("#payment-buttons-container > button"));
        continuePaymentInfo.click();
        Thread.sleep(10000);
        WebElement placeOrderButton=driver.findElement(By.cssSelector("#review-buttons-container > button"));
        placeOrderButton.click();
        Thread.sleep(10000);
        WebElement placeOrderMessage=driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.page-title"));
        System.out.println(placeOrderMessage.getText());
        assertTrue(placeOrderMessage.getText().contains("YOUR ORDER HAS BEEN RECEIVED."));
        WebElement orderConfirmationMessage=driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > p:nth-child(5)"));
        System.out.println(orderConfirmationMessage.getText());
        assertTrue(orderConfirmationMessage.getText().contains("order confirmation"));
    }


    @Test
    public void logIn()
    {
        WebElement account=driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a"));
        account.click();
        WebElement isVisibleAccount= driver.findElement(By.cssSelector("#header-account"));
        assertTrue(isVisibleAccount.getText().contains("Log"));
        assertTrue(isVisibleAccount.isDisplayed());
    }


    @After
    public void quitBrowser()
    {

        driver.quit();
    }
}
