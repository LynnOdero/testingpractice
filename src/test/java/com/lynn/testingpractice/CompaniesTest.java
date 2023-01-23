package com.lynn.testingpractice;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class CompaniesTest {
    CompaniesPage companiespage = new CompaniesPage();
    LoginPage loginPage = new LoginPage();

    @BeforeAll
    public static void setup(){
        Configuration.headless = false;
        SelenideLogger.addListener("allure", new AllureSelenide());

        }
    @BeforeEach
        public void setUp() {
        open("https://powertofly.com/entry/login");

    }
    @Test
    public void searchCompanies(){
        loginPage.login();
        companiespage.Companies.click();
        companiespage.CompaniesSearch.sendKeys("Nokia");
        companiespage.SearchButton.click();
    }
}
