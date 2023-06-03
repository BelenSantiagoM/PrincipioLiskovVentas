package com.example.principioliskov_ventas

// Clase abstracta que representa una venta y es la clase Abuelo, ya que tiene otras clases que heradan de ella
abstract class AbstractSale {
    // Es la clase base para todas las ventas. Tiene dos métodos abstractos: generate() y xml().
    // Estos métodos deben ser implementados por las clases hijas.
    abstract fun generate()
    abstract fun xml()
}