Feature: Caso de Prueba Login
  Scenario: Ingresar nombre de usuario y contraseña correctos
    Given Abrir Chrome
    When Ingresa username "rhys666" y password "123456"
    Then Inicia Sesion
  Scenario: Ingresar nombre de usuario y contraseña incorrecto
    Given Abrir Chrome
    When Ingresa username "rhys666" y password "654321"
    Then Inicia Sesion
  Scenario: Ingresar valores vacíos
    Given Abrir Chrome
    When Ingresa username "" y password ""
    Then Inicia Sesion