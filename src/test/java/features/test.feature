@funtional

Feature: Catalogo de Productos y Planes
  Como usuario quiero visualizar los productos y planes para contratar un servicio.

  @browser
  Scenario: Scenario1: Ingresar al catologo de productos en la página Gestión Corredor
    Given El usuario se encuentra en la página de Gestión Corredor
    When Hace click sobre el botón Productos Marketing
         And Se debe redireccionar a la página productos
         And Hace click sobre la tarjeta del producto a contratar
         And Visualiza la información del producto seleccionado
         And Hacer click al botón Comprar
    Then Se debe redireccionar a la página de login


  @login
  Scenario: Scenario2: El usuario corredor sea válido
    Given Hay un usuario corredor que quiere logiarse con el fin de contratar un producto
          And Ingresa el nombre del email del usuario corredor
          And Ingresa la contraseña
    When Cuando el usuario ingrese la información requerida válida
    Then Se debe redireccionar a la página para ingresar los datos del contrato


  @product
  Scenario: Scenario3: El usuario corredor completa los datos del contrato
    Given Se llena el primer formulario con los campos solicitados
          And Se llena el segundo formulario con los datos solicitados
          And Tilda el checkbox Declaro conocer y aceptar los Términos y condiciones de TOCTOC
          And Tilda el checkbox Actualizar la información ingresada
    When Cuando el usuario corredor rellena todos los datos solicitados
          And Hace click al botón Enviar
     Then Se debe redireccionar a la página Detalle del contrato

  #@pago
 # Scenario: Scenario4: El usuario corredor procesa el pago del Producto Marketing seleccionado
  #  Given El usuario se encuentra en la página Detalle de Pago de Producto Marketing
  #        And Selecciona el medio de pago Producto Marketing
 #         And Se llena los datos según la forma de pago seleccionada de Producto Marketing
 #   When Cuando el usuario corredor completa todos los datos de pago de Producto Marketing
 #        And Hace click al botón pagar Producto Marketing
 #   Then Se debe redireccionar a la página Pago exitoso del Producto Marketing contratado



 # @browser
 #  Scenario: Scenario5: Ingresar al catologo de planes en la página Gestion Corredor
 #    Given El usuario se encuentra en la página de Gestion Corredor
  #      And Hace click sobre el botón Ver Planes
  #      And Visualiza la información del plan seleccionado
  #      And Darle click al botón Contratar
  #      And Registrar Usuario
  #      And Llena el primer formulario con los campos solicitados
  #      And Llena el segundo formulario con los campos solicitados
  #      And Tilda el checkbox Declaro conocer y aceptar los Términos y condiciones de TOCTOC del Plan
  #   When Cuando el usuario rellena todos los datos e imagen solicitados
  #      And Darle click al boton Enviar
  #   Then Se debe redireccionar a la página Detalle del contrato del plan a contratar
