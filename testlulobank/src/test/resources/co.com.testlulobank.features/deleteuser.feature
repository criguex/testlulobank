Feature: i need to delete one user in the sistem

  Scenario Outline: i delete users with request info
    Given the Qa wants do testing
    When I delete the information of the user
      | <id> |
    Then response status code10 is
      | <STATUS_CODE> |
    And valid in response information3
      | <id> | <status> |<MESSAGE> |
    Examples:
      | id     | status  | MESSAGE                               |STATUS_CODE|
      | 3     | success  | Successfully! Record has been deleted |200|
