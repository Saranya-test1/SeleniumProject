Feature: Automate Demoblaze Website

  Scenario: Login and add a product to cart
    Given User launches the Demoblaze website
    When User logs in with "Saranya.S" and "xyz"
    And User should be logged in successfully
    And User adds "Samsung galaxy s6" to the cart
   	Then The product should be added to the cart
    #And The discount should be displalayed correctly