Feature: Pruebas de la Calculadora

  Scenario: Sumar dos números
    Given que tengo dos números 3 y 5
    When los sumo
    Then el resultado debe ser 8
  
  Scenario: Multiplicar dos números
    Given tengo dos números 6 y 3
    When los multiplico
    Then el resultado es igual a 18