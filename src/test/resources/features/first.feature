Feature: asd
  asd
  asd

  Scenario Outline: firstscenario
    Given I open Google page
    When I search '<search>'
    And I open first search result
    Then The title is '<search>'

    Examples:
      |search|
      |auto  |