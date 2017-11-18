Feature: As a user i verify I am able to search for an item in amazon website

  Scenario: Search bar

    Given I navigate to amazon uk website
    And I choose "Books" from dropdown menu
    And I enter the book name "Diary of a wimpy kid"
    Then The books in that series is displayed