package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class anket {
    private WebDriver driver;

    private final By ogrno= By.id("exampleFormControlInput1");


    public anket(WebDriver driver){
        this.driver=driver;


    }

    public void ogrnokatlm(String an){
        WebElement name=driver.findElement(ogrno);
        name.click();
        name.sendKeys(an);

    }
    public String gettru(){
        WebElement namespace= driver.findElement(ogrno);
        return namespace.getAttribute("value");
    }

    public String bosdeger(){
        WebElement namespace= driver.findElement(ogrno);
        return namespace.getAttribute("value");
    }
    public String getstring(){
        WebElement namespace= driver.findElement(ogrno);
        return namespace.getAttribute("value");
    }
    public String get_tew(){
        WebElement namespace= driver.findElement(ogrno);
        return namespace.getAttribute("value");

    }














}
