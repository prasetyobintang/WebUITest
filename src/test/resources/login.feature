@login
Feature: Login

  @valid-login
  @positive
  Scenario Outline: Login using valid username and password
    Given user is on login page
    And user input username with <username>
    And user input password with <password>
    When user click login button
    Then user is on homepage
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | visual_user   | secret_sauce |

  @invalid-login
  @negative
  Scenario Outline: Login using valid username and invalid password
    Given user is on login page
    And user input username with <username>
    And user input password with <password>
    When user click login button
    Then appear error message "Epic sadface: Username and password do not match any user in this service"
    Examples:
      | username     | password      |
      | stadard_user | secret_sauces |
      | stadard_user | s3cret_sauce  |