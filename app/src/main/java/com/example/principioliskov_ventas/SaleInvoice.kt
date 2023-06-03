package com.example.principioliskov_ventas

import java.math.BigDecimal

// La clase SaleInvoice representa una factura de venta y tiene las mismas propiedades que LocalSale y ForeignSale. Implementa los mismos métodos
class SaleInvoice(private val amount: BigDecimal, private val customer: String, private val taxes: BigDecimal) :
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