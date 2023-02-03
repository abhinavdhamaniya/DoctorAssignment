Feature: Create doctor should work

  Scenario: Call backend to create doctor
    When the client calls endpoint to create doctor "/doctor/create"
    Then response status code is 200