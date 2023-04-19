Feature: Software testing course webpage

  Scenario: #1. Successfull subscription
    Given I am on the main page
    When I write the email address of "test@tester.com"
    When I click the submit button
    Then The confirmation pop-up appears

  Scenario: #2. Failed subscription - negative (1/3)
    Given I am on the main page
    When I write the email address of "22@222. ro"
    When I click the submit button
    Then Subscription fails and the email field gets red margins

  Scenario: #3. Failed subscription - negative (2/3)
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
    And I write the country "Sweden"
    And I write the city "Malmo"
    And I write the post code "500168"
    And I click the second next button
    Then Course options page opens

  Scenario: #14. Enrollment flow 3/5: Course options
    Given I am on the course options page
    When I select "Software Testing - Automation & Manual tester certificate"
    And I select "Software Testing - Security tester certificate"
    And I click the third next button
    Then Payment information page opens

  Scenario: #15. Enrollment flow 4/5: Payment information
    Given I am on the Payment information page
    When I write the card holder name "John Doe"
    And I write the card number "4597-6591-0229-3771"
    And I write the CVC "618"
    And I click Month
    And I select "September"
    And I click Year
    And I select "2024"
    And I click the forth next button
    Then Registration is completed with success
    Then I select "Return to homepage" button

  Scenario: #16. Select "Read More - Selenium" - bug(1/2) opens wrong page Fundamentals page
    Given I am on the main page
    And Page scrolls to Learn Selenium
    When I select the read more button - Selenium
    Then Selenium page opens

  Scenario: #17. Enrollment flow - bug(2/2) on second step wrong data is inserted
    Given I am on the contact information page
    When I write a wrong email "jdoe yahoo com"
    And I write a wrong phone "Malmo"
    And I write the country "Sweden"
    And I write the city "Malmo"
    And I write a wrong post code "5"
    And I click the second next button
    Then Enrollment step should show error

  Scenario: #18. Enrollment flow 4/5: Payment information - negative (3/3)
    Given I am on the course options page
    When I select "Software Testing - Automation & Manual tester certificate"
    And I select "Software Testing - Security tester certificate"
    And I click the third next button
    And Payment information page opens
    And I click the forth next button
    Then Registration fails