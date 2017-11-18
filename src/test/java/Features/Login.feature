Feature: Login feature
  As a user I will ensure if it is possible

  Scenario: Login with correct credentials
    Given I navigate to login page
    And I enter the following for login
      | Username | Password      |
      | admin   | adminpassword |

    When I click login
    Then I get message that login successfully