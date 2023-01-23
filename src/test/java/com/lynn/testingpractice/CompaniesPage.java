package com.lynn.testingpractice;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CompaniesPage {
    public SelenideElement Companies = $(By.xpath("//a[text() = 'Companies']"));
    public SelenideElement CompaniesSearch = $(By.id("name"));
    public SelenideElement SearchButton = $(By.xpath("//button[@type = 'submit']"));



}
