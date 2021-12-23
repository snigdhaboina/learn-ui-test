package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class pdfUtil {

    public WebDriver driver;
    String url = "http://www.pdf995.com/samples/pdf.pdf";
    PDDocument pdf;

    @Given("^the user provides the pdf url to download$")
    public void theUserProvidesThePdfToDownload() {
        driver=new ChromeDriver();
        driver.get(url);
    }

    @When("^the pdf is downloaded$")
    public void thePdfIsDownloaded() throws IOException {
        URL myUrl = new URL(url);
        InputStream in = myUrl.openStream();
        BufferedInputStream bf = new BufferedInputStream(in);
        pdf = PDDocument.load(bf);
    }

    @Then("^pdf data is verified$")
    public void pdfDataIsVerified() throws IOException {
        String myPdfContent = new PDFTextStripper().getText(pdf);
        System.out.println(myPdfContent.length());
        driver.quit();
    }

}
