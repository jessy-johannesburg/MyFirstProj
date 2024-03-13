Feature: Google search
   @login
  Scenario: search for QA jobs in johannesburg
    Given user launch browser
    When  user is on google page and verify the title
    When  user captures QA jobs in johannesburg
    Then  user should see the results