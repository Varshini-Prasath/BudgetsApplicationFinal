@CreatCat
Feature: Add new category check

  Background: Get into category session.
    Given check for backGround scenario

  Scenario Outline: Add new Category
    Given user clicks the addIcon and selects Category
    Then check for category popUp
    When user enters the category option <CategoryName> <Amount> <Description>
    Then check for options in transcationType
      | expense |
      | Income  |
    And click add button

    Examples: 
      | CategoryName    | Amount | Description    |
      | "Test_Category" |     25 | "New Category" |
