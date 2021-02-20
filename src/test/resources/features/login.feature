Feature: Library app login feature
  As a user, I should be able to login to the library app.
  verify both Students and librarians can login

  Background: User is already on the login page
    Given user is on the login page

  @student
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see books in url


  @librarian
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard in url