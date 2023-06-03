package com.example.principioliskov_ventas

import java.math.BigDecimal

// La clase ForeignSale representa una venta internacional y tiene dos propiedades: amount y customer. Al igual que LocalSale.
// Implementa los mismos metodos que LocalSale
class ForeignSale(private val amount: BigDecimal, private val customer: String) : SaleWithTaxes() {

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