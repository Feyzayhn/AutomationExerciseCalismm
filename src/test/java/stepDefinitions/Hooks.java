package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.AutoExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


import static utilities.ReusableMethods.*;
import static utilities.ReusableMethods.getActions;

public class Hooks {

    AutoExercisePage page = new AutoExercisePage();
    static String email;
    static String password;
    static String state;
    static String name;
    static String phoneNumber;
    static String zipCode;
    static String firstName;
    static String lastName;
    static String company;
    static String address1;
    static String address2;
    static String gender;
    static String country;

static String city;
    @After
    public void tearDown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot)
                Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        //Driver.closeDriver();
    }


    @Before(order = 1, value = "@Test02")
    public void registerUser() {

        email = Faker.instance().internet().emailAddress();
        password = Faker.instance().internet().password();

        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        jsScrollClick(page.signupLoginLink);
        page.nameBoxSignup.sendKeys(Faker.instance().name().name());
        page.emailBoxSignup.sendKeys(email);
        page.signupButton.click();
        page.genderList.get(0).click();
        page.passwordBoxNewSignup.sendKeys(password);

        selectDropDown(page.dayDDM);
        selectDropDown(page.monthDDM);
        selectDropDown(page.yearDDM);
        jsScrollClick(page.newsletter);
        jsScrollClick(page.partners);

        jsScroll(page.firstnameBoxNewSignup);
        waitFor(3);
        getActions()
                .click(page.firstnameBoxNewSignup)
                .sendKeys(Faker.instance().name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().company().name()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().streetAddress()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().fullAddress()).sendKeys(Keys.TAB).perform();

        selectDdmIndex(page.country);
        jsScroll(page.country);
        waitFor(3);

        getActions()
                .click(page.state)
                .sendKeys(Faker.instance().address().state()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().city()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().phoneNumber().cellPhone()).perform();
        jsScrollClick(page.createAccountButton);

        Driver.closeDriver();
    }

    public void registerUser1() {

        name = Faker.instance().name().firstName();
        email = Faker.instance().internet().emailAddress();
        password = Faker.instance().internet().password();
        state = Faker.instance().address().state();
        city = Faker.instance().address().city();
        zipCode= Faker.instance().address().zipCode();
        phoneNumber =Faker.instance().phoneNumber().cellPhone();
        firstName=Faker.instance().name().firstName();
        lastName=Faker.instance().name().lastName();
        company = Faker.instance().company().name();
        address1=Faker.instance().address().streetAddress();
        address2=  Faker.instance().address().fullAddress();


        page.nameBoxSignup.sendKeys(name);
        page.emailBoxSignup.sendKeys(email);
        page.signupButton.click();

        int index = ReusableMethods.random().nextInt(page.genderList.size());
        page.genderList.get(index).click();
        gender = page.genderList.get(index).getText();

        page.passwordBoxNewSignup.sendKeys(password);
        ReusableMethods.selectDropDown(page.dayDDM);
        ReusableMethods.selectDropDown(page.monthDDM);
        ReusableMethods.selectDropDown(page.yearDDM);
        ReusableMethods.jsScrollClick(page.newsletter);
        ReusableMethods.jsScrollClick(page.partners);

        jsScroll(page.firstnameBoxNewSignup);
        waitFor(3);
        getActions()
                .click(page.firstnameBoxNewSignup)
                .sendKeys(firstName).sendKeys(Keys.TAB)
                .sendKeys(lastName).sendKeys(Keys.TAB)
                .sendKeys(company).sendKeys(Keys.TAB)
                .sendKeys(address1).sendKeys(Keys.TAB)
                .sendKeys(address2).sendKeys(Keys.TAB).perform();

        selectDdmIndex(page.country);
        jsScroll(page.country);
        country = select(page.country).getFirstSelectedOption().getText();

        waitFor(3);

        getActions()
                .click(page.state)
                .sendKeys(state).sendKeys(Keys.TAB)
                .sendKeys(city).sendKeys(Keys.TAB)
                .sendKeys(zipCode).sendKeys(Keys.TAB)
                .sendKeys(phoneNumber).perform();
        jsScrollClick(page.createAccountButton);
    }
}
