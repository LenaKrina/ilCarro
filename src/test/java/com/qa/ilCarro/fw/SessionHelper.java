package com.qa.ilCarro.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String email, String password) {
        initLogin();
        fillLoginForm(email, password);
        confirmLogin();
    }

    public void initLogin() {
        click(By.cssSelector("[href='/login']"));
    }

    public void confirmLogin() {
        waitForElementLocatedAndclick(By.cssSelector("#login"), 20);
    }

    public void fillLoginForm(String userEmail, String password) {
        waitForElementLocatedAndclick(By.name("user"), 20);
        type(By.cssSelector("#user"), userEmail);
        type(By.cssSelector("#password"), password);
    }


}
