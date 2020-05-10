package com.qa.ilCarro.tests;

import com.qa.ilCarro.model.UserData;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {
    @Test
    public void registrationFromHeader(){
        app.getUser().clickSignUpButton();
        app.getUser().fillRegistrationForm(new UserData().withfName("lena").withlName("krin").withEmail("kr@k.com").withPassword("12345678Aa"));
        app.getUser().confirmRegistration();

    }

}
