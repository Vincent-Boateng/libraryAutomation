package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Student_LandingPage {
public Student_LandingPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(xpath = "//*[@id=\"menu_item\"]/li[1]/a/span[1]")
    public WebElement booksModule;

@FindBy(xpath = "//*[@id=\"menu_item\"]/li[2]/a/span[1]")
    public WebElement borrowingBooksModule;

@FindBy(xpath = "//input[@type='search']")
    public WebElement studentSearchBox;

@FindBy(id = "book_categories")
    public WebElement bookCategoriesDropdown;

@FindBy(xpath = "//*[@id=\"tbl_books_length\"]/label/select")
    public WebElement tableBooksLengthDropdown;
}
