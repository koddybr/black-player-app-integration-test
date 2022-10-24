Feature: BlackPlayer Equalizer
  Scenario: Check equalizer options
    Given I open the app and go to equalizer
    When I activate equalizer
    And I modify equalizer progressBar
    Then Equalizer text should appear
    And after click on sound effects
    And should appear REVERB option