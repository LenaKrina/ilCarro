package com.qa.ilCarro.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    SessionHelper session;
    UserHelper user;
    String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() throws InterruptedException {
        if(browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        } if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        }

        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.navigate().to("https://ilcarro-dev-v1.firebaseapp.com/");

        user = new UserHelper(wd);

        session = new SessionHelper(wd);
       // session.login("krinskaya@gmail.com", "Krina123");
        Thread.sleep(3000);

    }

    public void stop() {
        wd.quit();
    }

    public SessionHelper getSession() {
        return session;
    }

    public UserHelper getUser() {
        return user;
    }
}
