Feature: Get all doctors should work

  Scenario: Call backend to get all doctors
    When the client calls endpoint to get all doctors "/doctor/list"
    Then response status code is 200