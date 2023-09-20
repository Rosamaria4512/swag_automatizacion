Feature: Login

  Scenario: Login succesfully
    Given he user enter the website
    When he user enter with credentials
      | user          | password     |
      | standard_user | secret_sauce |
    Then he could succesfully