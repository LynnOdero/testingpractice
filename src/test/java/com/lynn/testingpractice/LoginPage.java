package com.lynn.testingpractice;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement email = $(By.id("form-email-field"));
    public SelenideElement password = $(By.id("form-password-field"));

    public SelenideElement logInButton = $(By.xpath("//button[@type='submit' and text()='Log In']"));
   public SelenideElement dashboard = $(By.xpath("//a[text()='Jobs']"));
   public SelenideElement search = $(By.xpath("//button[@type= 'submit']"));

   public void login(){
       email.sendKeys("oderolynn@gmail.com");
       password.sendKeys("123@Leona");
       logInButton.click();
   }

}

