Feature:   User should search apple int the google searchbox

  Scenario: User can search apple in the google page
    When user goes to google homepage
    Then user search for "apple"
    Then user should verify the title