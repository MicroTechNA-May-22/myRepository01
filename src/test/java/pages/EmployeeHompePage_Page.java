package pages;

import org.openqa.selenium.By;

public class EmployeeHompePage_Page {
    public static By empMenu = By.xpath("//a[@href='elogin.php']");
    public static By empUserId = By.name("mailuid");
    public static By empPassword = By.name("pwd");
    public static By empText = By.xpath("//h2[text()='Welcome Test ']");

}
