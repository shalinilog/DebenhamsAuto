package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionalLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps extends CommonFunctions {


    @Given("^I am on the login page \"([^\"]*)\"$")
    public void i_am_on_the_login_page(String loginPage)  {

        driver.get(loginPage);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    @When("^I enter valid email address \"([^\"]*)\"$")
    public void i_enter_valid_email_address() {

        driver.findElement(By.xpath("//*[@id=\"field-1\"]")).getText();
    }

    @When("^I enter vaild password \"([^\"]*)\"$")
    public void i_enter_vaild_password(String passWord)  {
        driver.findElement(By.name("logonPassword")).sendKeys(passWord);
    }


    @When("^I click on sign in button$")
     public void i_click_on_sign_in_button()
    {
       driver.findElement(By.xpath("//*[@id=\"app-main\"]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div/form/fieldset/div[5]/button/div")).click();
    }

    @Then("^I should be able to view My Account page$")
    public void i_should_be_able_to_view_My_Account_page()
    {
        String expectedDescription = "My Account";
        String actualDescription=driver.findElement(By.xpath("//*[@id=\"app-header\"]/header/div[1]/div/ul/li[4]/a[2]")).getText();
        Assert.assertEquals(expectedDescription,actualDescription);
    }


    
}