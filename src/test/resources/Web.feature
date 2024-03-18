@web
Feature: Test Automation Web

  @web
  Scenario: Test login web normal
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    Then user will see icon cart in homepage

  @web
  Scenario: test login web with lock user
    Given open web login page
    And user input username "locked_out_user"
    And user input password "secret_sauce"
    And user click login button
    Then user will see error message "user has been locked out"

  @web
  Scenario: test login web with username and password invalid
    Given open web login page
    And user input username "standarduser"
    And user input password "secretsauce"
    And user click login button
    Then user will see error message "Username and password do not match"

  @web
  Scenario: test login web add to cart
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    And user add item to cart
    Then verify cart item is match "3"

  @web
  Scenario: test login web remove to cart
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    And user add item to cart
    And user add item to cart
    Then verify cart item is match "4"
    And user remove item to cart
    And user remove item to cart
    Then verify cart item is match "2"


