Feature: i need to consult user in the sistem

  Scenario Outline: i consult user with request info
    Given the Qa wants do testing
    When I consult the information by
      | <id> |
    Then response status code1 is 200
    And valid in response information
      | <id> |<employee_name> | <employee_salary> | <employee_age> |
    Examples:

      | id |employee_name | employee_salary | employee_age |
      | 5  |Airi Satou   |  162700          | 33          |