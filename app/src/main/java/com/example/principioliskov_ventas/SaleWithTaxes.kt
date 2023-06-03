package com.example.principioliskov_ventas

// Clase abstracta que representa una venta con impuestos y es la clase padre.
// Ya que tiene otras clases que heredan de esta, pero esta hereda de la clase AbstractSale.
abstract class SaleWithTaxes : AbstractSale() {
    // Hereda de AbstractSale. Esta clase también es abstracta y agrega otro método abstracto: calculateTaxes().
    // Las clases hijas de SaleWithTaxes deben proporcionar una implementación para este método.
    abstract fun calculateTaxes()
}