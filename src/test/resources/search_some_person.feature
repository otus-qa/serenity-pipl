Feature:
  Working with Search on http://pipl.com

  Scenario: Positive test: Use searching
    Given user opened the site
    And user clicks input
    When user search for 'Steve Jobs'
    And user clicks Search
    Then user sees list of results
    And 'Steve Jobs' should be contained