Feature: Library app logout feature
  As a user, I should be able to logout from the library app.

  Background: User is already logged in
    Given user is on the landing page


  Scenario: Student logout
    When user clicks on Logout button
    Then user should be on the Login page

  Scenario: Librarian logout
    When user clicks on Logout button
    Then user should be on the Login page