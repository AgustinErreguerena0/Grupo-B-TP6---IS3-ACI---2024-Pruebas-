Feature: Pruebas de la Calculadora

  Scenario: Sumar dos números
    Given que tengo dos números 3 y 5
    When los sumo
    Then el resultado debe ser 8

  Scenario: Restar Numeros
    Given que tengo dos números 3 y 5
    When los resto
    Then el resultado debe ser -2
