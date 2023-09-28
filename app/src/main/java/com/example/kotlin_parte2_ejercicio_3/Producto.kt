package com.example.kotlin_parte2_ejercicio_3

open class Producto(val fechaCaducidad: String,val numeroLote: String) {


    open fun mostrarInformacion() {
        println("Fecha de Caducidad: $fechaCaducidad")
        println("Número de Lote: $numeroLote")
    }
}