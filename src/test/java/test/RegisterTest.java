package test;

import models.User;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.RegisterSteps;

@RunWith(SerenityRunner.class)
public class RegisterTest extends BaseTest {

    @Steps
    RegisterSteps registerSteps;

    @Test
    public void registerTest(){

        User user = new User();
        user.setFirstName("S");
        user.setLastName("Maya");
        user.setEmail("maya@yahoo.com");
        user.setPass("dummyy");
        user.setConfirmPass("dummyy");

        registerSteps.navigateToRegisterPage();
        registerSteps.registerUser(user);
        registerSteps.verifyUserIsRegistered("S", "Maya");
    }
}
