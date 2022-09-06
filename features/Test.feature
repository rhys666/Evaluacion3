Feature: Caso de Prueba Login
  Scenario: Ingresar nombre de usuario y contrase�a correctos
    Given Abrir Chrome
    When Ingresa username "rhys666" y password "123456"
    Then Inicia Sesion
  Scenario: Ingresar nombre de usuario y contrase�a incorrecto
    Given Abrir Chrome
    When Ingresa username "rhys666" y password "654321"
    Then Inicia Sesion
  Scenario: Ingresar valores vac�os
    Given Abrir Chrome
    When Ingresa username "" y password ""
    Then Inicia Sesion