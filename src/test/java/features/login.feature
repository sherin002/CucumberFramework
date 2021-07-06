Feature: Login Functionality

  @Login
  Scenario Outline: Verify Login feature
    Given I am login page
    Then I enter username "<username>"
    Then I enter password "<password>"
    Then I click on submit button
    And Verify title of the page

    Examples: 
      | username | password |
      | Admin    | admin123 |
