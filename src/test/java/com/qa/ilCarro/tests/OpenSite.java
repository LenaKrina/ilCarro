package com.qa.ilCarro.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenSite extends TestBase {

    @Test
    public void isSiteOpenedOnSearchPage(){
       String currentURL =  app.getSession().getURL();
        Assert.assertEquals(currentURL, "https://ilcarro-1578153671498.web.app/search");

    }
}