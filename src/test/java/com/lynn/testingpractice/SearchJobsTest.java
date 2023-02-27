package com.lynn.testingpractice;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SearchJobsTest {
    SearchJobPage searchJobPage = new SearchJobPage();
    LoginPage loginPage = new LoginPage();

    @BeforeAll
    public static void setLoginPage() {
        Configuration.headless = true;
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
    @BeforeEach
    public void setUp() {
        open("https://powertofly.com/entry/login");
    }
    @Test
    public void searchJobs(){
        loginPage.login();
        searchJobPage.jobs.click();
        searchJobPage.search.sendKeys("Quality Assurance ");
        searchJobPage.searchButton.click();
        searchJobPage.jobsList.shouldBe(Condition.visible);

    }

}

