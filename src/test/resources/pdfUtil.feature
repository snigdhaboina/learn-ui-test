Feature: Verify the content of the pdf file.

  Scenario: Verify the content of the pdf file.
    Given the user provides the pdf url to download
    When the pdf is downloaded
    Then pdf data is verified

