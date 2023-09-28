package com.example.kotlin_parte2_ejercicio_3

fun main() {
    val productoFresco = ProductoFresco("2023-12-31", "Lote01", "2023-09-08", "España")
    val productoRefrigerado = ProductoRefrigerado("2023-11-21", "Lote072", "H7")
    val productoCongelado = ProductoCongelado("2023-07-11", "Lote045", -18.0)

    println("Información del Producto Fresco:")
    productoFresco.mostrarInformacion()

    println("\nInformación del Producto Refrigerado:")
    productoRefrigerado.mostrarInformacion()

    println("\nInformación del Producto Congelado:")
    productoCongelado.mostrarInformacion()
}