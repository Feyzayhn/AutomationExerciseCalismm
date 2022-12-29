package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutoExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class T6_ContantUsForm {


    AutoExercisePage page = new AutoExercisePage();

    @Then("User Click on Contact Us button")
    public void userClickOnContactUsButton() {

        page.contactUs.click();

    }

    @Then("User Verify GET IN TOUCH is visible")
    public void userVerifyGETINTOUCHIsVisible() {

        Assert.assertTrue(page.getInTouchTitle.isDisplayed());
    }

    @Then("User Enter name, email, subject and message")
    public void userEnterNameEmailSubjectAndMessage() {

        page.nameBoxContact.sendKeys(Faker.instance().name().firstName());
        page.emailBoxContact.sendKeys(Faker.instance().internet().emailAddress());
        page.subjectBoxContact.sendKeys(Faker.instance().toString());
        page.messageBoxContact.sendKeys(Faker.instance().toString());
    }

    @Then("User Upload file")
    public void userUploadFile() {

        String fis = "C:\\Users\\feyza2\\IdeaProjects\\AutomationExerciseCalismam\\src\\resources\\car-2.jpg";
        page.uploadFile.sendKeys(fis);
    }

    @Then("User Click Submit button")
    public void userClickSubmitButton() {

        ReusableMethods.jsScrollClick(page.submitContact);
    }

    @Then("User Click OK button")
    public void userClickOKButton() {

        ReusableMethods.waitFor(3);
        Driver.getDriver().switchTo().alert().accept();
    }



    @Then("User Verify success message Success! Your details have been submitted successfully. is visible")
    public void userVerifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {

        assertTrue(page.successMessage.isDisplayed());
    }



    
    @And("User Click Home button and verify that landed to home page successfully")
    public void userClickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {

        page.homeButtonContact.click();

        String expectedData = "https://www.automationexercise.com/";
        String actualData = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedData,actualData);

    }
}
