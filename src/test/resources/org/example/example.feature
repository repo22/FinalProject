Feature: Software testing course webpage

  Scenario: #1. Successfull subscription
    Given I am on the main page
    When I write the email address of "test@tester.com"
    When I click the submit button
    Then The confirmation pop-up appears

  Scenario: #2. Failed subscription
    Given I am on the main page
    When I write the email address of "22@222. ro"
    When I click the submit button
    Then Subscription fails and the email field gets red margins

  Scenario: #3. Failed subscription
    Given I am on the main page
    When I write the email address of "testsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestssss"
    When I click the submit button
    Then Subscription fails and the email field gets red margins

  Scenario: #4. Select "Read More - Virtual"
    Given I am on the main page
    When I select the read more button - Virtual
    Then Virtual page opens

  Scenario: #6. Select "Read More - Hybrid"
    Given I am on the main page
    When I select the read more button - Hybrid
    Then Hybrid page opens

  Scenario: #7. Select "Read More - InPerson"
    Given I am on the main page
    When I select the read more button - InPerson
    Then InPerson page opens

  Scenario: #8. Navigate to "What You'll Learn"
    Given I am on the main page
    When I click on the What You'll Learn button
    Then Page navigates to Learn The Fundamentals

  Scenario: #9. Navigate to "Frequently Asked Questions"
    Given I am on the main page
    When I click on the Questions button
    Then Page navigates to Faq

  Scenario: #10. Navigate to "Instructors"
    Given I am on the main page
    When I click on the Instructors button
    Then Page navigates to Our Instructors

  Scenario: #11. Select "Read More - What You'll Learn"
    Given I am on the main page
    When I select the read more button - What You'll Learn
    Then Fundamentals page opens
