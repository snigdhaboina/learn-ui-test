package StepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import static helpers.utilClasses.BrowserUtil.theUrl;
import static helpers.utilClasses.BrowserUtil.whenUrlIsLaunched;

public class pdfUtil {

    PDDocument pdf;

    @Given("^the user launch the url$")
    public void theUserLaunchTheUrl(DataTable aDataTable) {
        List<String> myDataList = aDataTable.asList(String.class);
        theUrl = myDataList.get(0);
        whenUrlIsLaunched(theUrl);
    }

    @When("^the pdf is downloaded$")
    public void thePdfIsDownloaded() throws IOException {
        URL myUrl = new URL(theUrl);
        InputStream in = myUrl.openStream();
        BufferedInputStream bf = new BufferedInputStream(in);
        pdf = PDDocument.load(bf);
    }

    @Then("^pdf data is verified$")
    public void pdfDataIsVerified() throws IOException {
        String myPdfContent = new PDFTextStripper().getText(pdf);
        System.out.println(myPdfContent.length());

    }
}
