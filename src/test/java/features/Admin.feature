Feature: Filter  functionality
  I want to use this template for my feature file

  @Admin
  Scenario Outline: verify home page
    Given I am in home page and enter  username "<username>" and password "<password>"
    When I  click on Admin tab
    Then I enter username for testadmin "<username1>"
    When I select user role "<selectrole>"
    Then I enter EmployeeName "<EmployeeName>"
    Then I select Status "<Status>"
    When I click on search button

    Examples: 
      | username | password | username1 | selectrole | EmployeeName | Status  |
      | Admin    | admin123 | admin     | Admin      | admin        | Enabled |
