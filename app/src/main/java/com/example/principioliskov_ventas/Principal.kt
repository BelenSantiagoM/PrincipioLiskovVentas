package com.example.principioliskov_ventas

import java.math.BigDecimal

// En la función main(), se crean instancias de las clases LocalSale, SaleInvoice y ForeignSale.
// Se las asigna a variables de tipo SaleWithTaxes y AbstractSale.
// Luego, se llaman a los métodos calculateTaxes(), generate() y xml() en las instancias creadas.
fun main() {
    // Creación de una instancia de LocalSale y uso de los métodos heredados
    var sale: SaleWithTaxes = LocalSale(BigDecimal(100), "Hector", BigDecimal(0.16))
    sale.calculateTaxes()
    sale.generate()

    // Asignación de una instancia de SaleInvoice a una variable de tipo SaleWithTaxes
    sale = SaleInvoice(BigDecimal(100), "HectorD", BigDecimal(0.16))
    sale.calculateTaxes()
    sale.generate()
    sale.xml()

    // Creación de una instancia de ForeignSale y uso del método heredado
    val sale2: AbstractSale = ForeignSale(BigDecimal(200), "Pepe")
    sale2.generate()

    //Finalmente, se imprime la salida correspondiente a cada llamada a los métodos, que son mensajes simples indicando qué acción se está realizando.
}