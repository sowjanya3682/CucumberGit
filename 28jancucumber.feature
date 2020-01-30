Feature: pixel store pos

Background:
       Given sales executive logged into the machine

@RegressionTest
Scenario: Executive signUp
Given executive is at signup registration
When executive provides "admin" and "admin"
Then signup successful

@Smoke @RegressionTest
Scenario: Shopping cart
Given executive added the items to cart
When items price is calculated
Then bill is generated with final amount

@FunctionalTest
Scenario Outline: Sales executive signIn
When Sales executive "<user>" and "<password>" as credentials
Then Login is success

Examples:
   |user|password|
   |Lalitha|Password123|
   |John|Ravi1234|

   @datadriven
   Scenario: Search a product
   When Larry searches for products in the search field
   |Head|
   |Hand|
   |Lap|
   Then Larry verifies
   