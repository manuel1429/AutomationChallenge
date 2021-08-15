# Automation Challenge

Challenge Instructions
-----------------------------------
Your challenge is to create a new automation project with the framework/language you feel more comfortable with. In the project, you’ll need to automate the following given scenarios for the sample page (https://www.saucedemo.com/) provided:
  1. Login with a valid user.
  Expected: Validate the user navigates to the products page when logged in.
  
  2. Login with an invalid user.
  Expected: Validate error message is displayed.

  3. Logout from the home page.
  Expected: Validate the user navigates to the login page.

  4. Sort products by Price (low to high).
  Expected: Validate the products have been sorted by price correctly

  5. Add multiple items to the shopping cart.
  Expected: Validate all the items that have been added to the shopping cart.

  6. Add the specific product ‘Sauce Labs Onesie’ to the shopping cart.
  Expected: Validate the correct product was added to the cart.

  7. Complete a purchase.
  Expected: Validate the user navigates to the order confirmation page.
  
Minimum Requirements
-----------------------------
- The project should be organized using Page Object Model (POM).

- All test cases must contain at least one assertion (Use Assertion Libraries).

- To have meaningful validations, for example: when validating text, use the text content, not the message container, when validating existing elements, make sure it’s unique in the page.

How to go Above & Beyond
---------------------------------
Here are some items that might be added to the automation but are not required:

- Data provider for the test data.
- Test data reporter.
- Multi-browser testing.
