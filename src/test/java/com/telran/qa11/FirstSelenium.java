package com.telran.qa11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


//after -tearDown(){}
public class FirstSelenium {

    WebDriver wd;
 // before -SetUp(){}
    @BeforeMethod
    public void SetUp(){
        wd= new ChromeDriver();
       // wd = new FirefoxDriver();

       // wd= new EdgeDriver();
        wd.get("https://www.interfax.ru/");
        //wd.get("https://www.interfax.ru/");
       // wd.get("https://www.google.de/");

    }
//Test
    @Test
    public void openGoogleDrive (){
        System.out.println("site is opened");

    }

}
