Feature: asd
  asd
  asd
Background:
  Given UI-User creates user account with random email
  And UI-User logs out from system

  Scenario: second scenario(UI)
    Given UI-User opens Sign In page
    When UI-User logs in
    Then UI-User is logged in
