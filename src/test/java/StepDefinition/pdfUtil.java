package StepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import static helpers.utilClasses.BrowserUtil.theUrl;

public class pdfUtil {

    PDDocument pdf;

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
