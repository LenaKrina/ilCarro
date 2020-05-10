package com.qa.ilCarro.fw;

import ch.qos.logback.core.pattern.color.BoldYellowCompositeConverter;
import com.qa.ilCarro.model.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase{
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void clickSignUpButton() {
        click(By.cssSelector("[href^='/registration']"));
    }

    public void fillRegistrationForm(UserData user) {
        type(By.cssSelector("#name"), user.getfName());
        type(By.cssSelector("#lastName"), user.getlName());
        type(By.cssSelector("#email"), user.getEmail());
        type(By.cssSelector("#password"), user.getPassword());

        click(By.cssSelector(".checkbox-container"));

    }

    public void confirmRegistration() {
        click(By.cssSelector("[type=submit]"));
    }
}
