Feature: As user I wants to login to my account in www.kmail.com
  Scenario: User should be logged in with valid credentials
    Given user is on the login page
    When user type username as "harshpatel"
    And user type password as "name12345"
    And user click on login button
    Then user should be logged in
    And user should see welcome message

  Scenario: User should not be logged in with valid username and invalid password
    Given user is on the login page
    When user type username as "harshpatel"
    And user type password as "hpatel23"
    And user click on login button
    Then user should not be logged in
    And user should see error message as "username or password is invalid"

  Scenario: User should not be logged in with invalid username and password
    Given user is on login page
    When user type username as "hpatel"
    And user type password as "name12345"
    And user click on login button
    Then user should not be logged in
    And user should see error message as "username or password is invalid"

  Scenario: user should not be logged in with invalid username and invalid password
    Given user is on login page
    When user type username as "hpatel"
    And user type password as "hpatel123"
    And user click on login button
    Then user should not be logged in
    And user should see error message as "username or password is invalid"

  Scenario: user should not be logged in with valid username and empty password field
    Given user is on login page
    When user type username as "harshpatel"
    And user left password field empty
    And user click on login button
    Then user should not be logged in
    And user should see error message as "Please enter password"

  Scenario: user should not be logged in with empty username field and valid password
    Given user is on login page
    When user left username firld empty
    And user type password as "name12345"
    And user click on login button
    Then user should not be logged in
    And user should see error message as "Please enter username"

  Scenario: User should not be logged in with special character in username and valid password
    Given user is on login page
    When user type username as "harsh@patel
    And user type password as "name12345"
    And user click on login button
    Then user should not be logged in
    And user should see error message as "username or password is invalid"

  Scenario: User should not be logged in with empty username and empty password
    Given user is on login page
    When user left username firld empty
    And user left password field empty
    And user click on login button
    Then user should not be logged in
    And user should see error message as "username or password is invalid"