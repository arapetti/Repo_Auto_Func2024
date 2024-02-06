package org.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;;

public class Funcionalidades {
    WebDriver driver;
    String baseUrl;

    //************ CONSTRUCTOR ****************************************************************//
    public Funcionalidades(String base)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Auotmatizacion2024\\Proyecto02\\Proyecto2\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl=base;
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    //****************************************************************************//

    public void close()
    {
        driver.close();
    }
    //****************************************************************************//
    public void crear_cuenta ()
    {
        driver.get(baseUrl);
        driver.manage().window().setSize(new Dimension(1050, 840));
        driver.findElement(By.cssSelector(".mus-header-user .mus-link1")).click();
        driver.findElement(By.id("register.firstName")).click();
        driver.findElement(By.id("register.firstName")).sendKeys("karina");
        driver.findElement(By.id("register.lastName")).sendKeys("rapetti");
        driver.findElement(By.id("register.zipCode")).sendKeys("1425");
        driver.findElement(By.id("register.email")).sendKeys("karinarapetti+4@gmail.com");
        driver.findElement(By.id("register.pwd")).sendKeys("Antel.1234");
        driver.findElement(By.id("register.checkPwd")).sendKeys("Antel.1234");
        driver.findElement(By.name("registerButton")).click();
        assertEquals(driver.getTitle(), "texto");
    }
    //****************************************************************

    public void buscar_tel (){
        driver.get(baseUrl);
        driver.manage().window().setSize(new Dimension(1050, 840));
        driver.findElement(By.cssSelector("#icono_tienda > span")).click();
        driver.findElement(By.cssSelector("#\\31 271 .img-responsive")).click();
        driver.findElement(By.id("form:j_idt324")).click();
        driver.findElement(By.id("formHeader:j_idt66")).click();
        assertEquals(driver.findElement(By.cssSelector(".wizard-register__btn-holder:nth-child(1) > .wizard-register__btn-title")).getText(), "Ya estoy registrado en TuID");

    }

}
