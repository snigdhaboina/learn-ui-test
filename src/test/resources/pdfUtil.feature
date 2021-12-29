Feature: Verify the content of the pdf file.

  Scenario Outline: Verify the content of the pdf file.
    Given the user launch the url
        |<Url>|
    When the pdf is downloaded
    Then pdf data is verified

    Examples:
    |Url|
    |http://www.pdf995.com/samples/pdf.pdf|

