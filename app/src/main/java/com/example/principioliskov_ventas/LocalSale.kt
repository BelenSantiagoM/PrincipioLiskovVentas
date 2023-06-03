package com.example.principioliskov_ventas

import java.math.BigDecimal

// Clase que representa una venta local y es una clase hija que hereda de SaleWithTaxes


// Se definen tres clases concretas: LocalSale, ForeignSale y SaleInvoice, todas heredan de SaleWithTaxes así que son consideradas clases hijas.

//La clase LocalSale representa una venta local y tiene tres propiedades: amount (monto), customer (cliente) y taxes (impuestos).
//Implementa los métodos generate(), calculateTaxes() y xml(), que simplemente imprimen mensajes en la consola.
class LocalSale(private val amount: BigDecimal, private val customer: String, private val taxes: BigDecimal) :
    SaleWithTaxes() {

    // Implementación del método generate de la clase AbstractSale
    override fun generate() {
        println("Se genera la venta")
    }
    // Implementación del método calculateTaxes de la clase SaleWithTaxes
    override fun calculateTaxes() {
        println("Se calculan los impuestos")
    }
    // Implementación del método xml de la clase AbstractSale
    override fun xml() {
        println("Se genera el XML de la Factura")
    }
}