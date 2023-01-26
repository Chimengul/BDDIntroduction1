Feature: user login
  #Scenario: login to the application with valid credential
   # Given  I am on the login page
    #When  I login using "Admin" and "admin123"
    #And  click on login button
    #Then I should be able to login

  @smoke
  Scenario: login to the application as admin
    Given  I am on the login page
    When  I use use following admin credential
    |username|password|
      |Admin|admin123|
   And  click on login button
    Then I should be able to login