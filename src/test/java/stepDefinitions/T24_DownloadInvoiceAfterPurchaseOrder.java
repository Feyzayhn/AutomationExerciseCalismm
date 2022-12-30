package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.AutoExercisePage;
import utilities.ReusableMethods;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class T24_DownloadInvoiceAfterPurchaseOrder {

    AutoExercisePage page=new AutoExercisePage();
    @Then("Click Download Invoice button and verify invoice is downloaded successfully.")
    public void clickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() {

        ReusableMethods.jsScrollClick(page.downloadInvoice);

        String filePath = "C:\\Users\\feyza2\\Downloads\\invoice.txt";
        assertTrue(Files.exists(Paths.get(filePath)));



    }
}
