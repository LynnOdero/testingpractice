package com.lynn.testingpractice;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchJobPage {
    public SelenideElement jobs = $(By.xpath("//a[text()='Jobs']"));
    public SelenideElement search = $(By.id("keywords"));
    public SelenideElement searchButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement jobsList = $(By.xpath("//div[@class= 'infinite-scroll-jobs-list']"));

}
