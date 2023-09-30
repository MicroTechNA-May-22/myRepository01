package step_definitions.customer;

import base.Base;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MicrotechHomePage_Page;


public class StepDefs_MicrotechNa_HomePage_Verification extends Base {
    @Then("I verify MicrotechNa logo")
    public void i_verify_MicrotechNa_logo() {
        String logo = getElementText(MicrotechHomePage_Page.logoText);
        Assert.assertEquals(logo,"MicroTech NA");
        System.out.println("Logo verificatin passed");
    }

    @Then("I also verify welcome message")
    public void i_also_verify_welcome_message() {
        String msg = getElementText(MicrotechHomePage_Page.welcomeMsg);
        Assert.assertEquals(msg, "Welcome to MicroTech NA.");
        System.out.println("Welcome message passed");
    }
}
