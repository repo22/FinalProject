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

  Scenario: #5. Select "Read More - Hybrid"
    Given I am on the main page
    When I select the read more button - Hybrid
    Then Hybrid page opens

  Scenario: #6. Select "Read More - InPerson"
    Given I am on the main page
    When I select the read more button - InPerson
    Then InPerson page opens

  Scenario: #7. Navigate to "What You'll Learn"
    Given I am on the main page
    When I click on the What You'll Learn button
    Then Page navigates to Learn The Fundamentals

  Scenario: #8. Navigate to "Frequently Asked Questions"
    Given I am on the main page
    When I click on the Questions button
    Then Page navigates to Faq

  Scenario: #9. Navigate to "Instructors"
    Given I am on the main page
    When I click on the Instructors button
    Then Page navigates to Our Instructors

  Scenario: #10. Select "Read More - Learn The Fundamentals"
    Given I am on the main page
    And Page scrolls to Learn The Fundamentals
    When I select the read more button - Fundamentals
    Then Fundamentals page opens

  Scenario: #11. Select "Start The Enrollment"
    Given I am on the main page
    When I select Start The Enrollment button
    Then Enrollment page opens

  Scenario: #12. Enrollment flow 1/5: Personal information
    Given I am on the Enrollment page
    When I write the first name "John"
    And I write the last name "Doe"
    And I write the username "jdow"
    And I write the password "JohnsP@ss"
    And I write the same password "JohnsP@ss" for confirmation
    And I click the next button
    Then Contact information page opens

  Scenario: #13. Enrollment flow 2/5: Contact information
    Given I am on the contact information page
    When I write the email "jdoe@yahoo.com"
    And I write the phone "+40744311223"
    #And I write the Country "Sweden"
    #And I write the password "JohnsP@ss"
    #And I write the same password "JohnsP@ss" for confirmation


