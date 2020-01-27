@SearchResults
Feature: SearchResults
  This feature deals with the search functionality of the application

  Scenario: Search for a user in fsdr
    Given fsdr user is logged in
    And searches for a field worker
    Then field worker results will be displayed
    And a field worker can then be viewed