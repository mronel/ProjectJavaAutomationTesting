Feature: Fill the inputs Tricent - Vehicle Insurance Application
  		 This is a sample application, Version 1.0.1

  Scenario Outline: Fill the inputs of the Vehicle Insurance Application
    Given I am on the Enter Vehicle Data screen
    And the Enter Vehicle Data is selected
    When I select the value "<make>" on Make field
    And I select the value "<model>" on Model field
    And I fill the input Cylinder Capacity with value "<cylinder>"
    And I fill the input Engine Performance with value "<engine>"
    And I fill the input Date of Manufacture with currenty date
    And I select the value "<seats>" on Number of Seats field
    And I check a value "<righthanddriver>" on Right Hand Drive field
    And I select the value "<seatsmotorcycle>" on Number of Seats Motorcycle field
    And I fill the input Fuel Type with value "<fuel>"
    And I fill the input Payload with value "<payload>"
    And I fill the input Total Weight with value "<totalweight>"
    And I fill the input List Price with value "<listprice>"
    And I fill the input License Plate Number with value "<license>"
    And I fill the input Annual Mileage with value "<annualmileage>"
    Then I press the Next button
    When I am on the Enter Insurance Data screen
    And I fill the input first name with the value "<firstname>"
    And I fill the input last name with the value "<lastname>"
    And I fill the input date of birth with the value "<dateofbirth>"
    And I select the value "<gender>" on Gender field
    And I fill the input street address with the value "<address>"
    And I select the value "<country>" on Country field
    And I fill the input zip code with the value "<zipcode>"
    And I fill the input city with the value "<city>"
    And I fill the input occupation with the value "<occupation>"
    And I select the some options on the Hobbies field
    And I fill the input website with value "<website>"
    And I upload in the input picture the "<image>"
    Then I press the Next button to Product Data 
    
    

    Examples: 
      | make | model   | cylinder | engine | seats | righthanddriver| seatsmotorcycle | fuel   | payload | totalweight | listprice | license | annualmileage | firstname | lastname | dateofbirth | gender | address   | country | zipcode | city     | occupation | website        | image     |   
      | Audi | Scooter |      300 |    300 |     5 | No             |  2              | Petrol |    1000 |        1000 |      1000 |   12345 |          1000 | Automation| Testing  | 10/12/1999  | Male   | 4th Avenue| Brazil  | 13500000| São Paulo| Employee   | www.test.com.br| image.jfif|     
