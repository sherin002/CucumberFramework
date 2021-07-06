Feature: BackGround feature

  Background: Login Functionality
    Given User is on login page
    Then User enter username "<username>"
    Then User enter password "<password>"
    Then User click on submit button

  @Login
  Scenario Outline: Verify Login feature
    And Verify title of the Home page

  #@Admin
  Scenario Outline: verify home page
    When User  click on Admin tab
    Then User enter username "<user>"
    When User select user role "<selectrole>"
    Then User enter EmployeeName "<EmployeeName>"
    Then User select Status "<Status>"
    Then User clicked on search button

    Examples: 
      | username | password | user  | selectrole | EmployeeName | Status  |
      | Admin    | admin123 | Admin | admin      | admin        | Enabled |
