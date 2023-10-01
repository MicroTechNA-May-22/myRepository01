package step_definitions.employee;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EmployeeHompePage_Page;

public class StepDefs_Employee_Login_Functionality extends Base {
    @When("I Click in Customer Login Menu")
    public void i_Click_in_Customer_Login_Menu() {
        click(EmployeeHompePage_Page.empMenu);
    }

    @Then("I enter employee user id as {string}")
    public void i_enter_employee_user_id_as(String string) {
       sendkeys(EmployeeHompePage_Page.empUserId,"testpilot@gmail.com");
    }

    @Then("I enter employee password as {string}")
    public void i_enter_employee_password_as(String string) {
        sendkeys(EmployeeHompePage_Page.empPassword,"1234");
    }

    @Then("I verify I am in employee home page")
    public void i_verify_I_am_in_employee_home_page() {
        String empHomePageText = getElementText(EmployeeHompePage_Page.empText);
        Assert.assertEquals(empHomePageText,"Welcome Test");
        System.out.println("Employee login page verification passed");
    }
}
