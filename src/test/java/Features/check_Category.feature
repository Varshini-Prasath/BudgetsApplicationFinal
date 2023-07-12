@CheckCategory
Feature: check created category

  Scenario: check for added category
    Given check for the added category
      | CategoryName |
      | Test_Category |
    Then check for amount logic
    And verify whether empty space is getting displayed on clicking dropdown icon
