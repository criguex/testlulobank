Feature: i need to consult users in the sistem

  Scenario Outline: i consult users with request info
    Given the Qa wants do testing
    When I consult the information
    Then response status code2 is 200
    And valid in response information2
      | <status> | <MESSAGE> |
    Examples:

     | status  | MESSAGE |
     | success | Successfully! All records has been fetched. |