package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import pages.AutoExercisePage;
import utilities.ConfigReader;

import static org.junit.Assert.assertTrue;

public class T5_RegisterUserWithExistingEmail {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {

        page.nameBoxSignup.sendKeys(Faker.instance().name().firstName());
        page.emailBoxSignup.sendKeys(ConfigReader.getProperty("email"));
    }




    @Then("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {

      assertTrue(page.emailAdressMessage.isDisplayed());
    }
}
