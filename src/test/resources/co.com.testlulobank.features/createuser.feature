Feature: i nee to create user in the system

  Scenario Outline:  i create user with request info
    Given the Qa wants do testing
    When the tester makes the request
      | <name> | <salary> | <age> |
    Then response status code is
      | <STATUS_CODE> |
    And the answer in the body is message Successfully
      | <status> | <MESSAGE> |
    Examples:
   | name    | salary  |age  | status  | MESSAGE                              | STATUS_CODE|
   | Cris    |  500    |23   | success | Successfully! Record has been added. |200         |
   | ''      |  ''     |''   | ''      | ''                                   |429         |


