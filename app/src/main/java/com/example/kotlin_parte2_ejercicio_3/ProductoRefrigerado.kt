package com.example.kotlin_parte2_ejercicio_3

class ProductoRefrigerado(fechaCaducidad: String,numeroLote: String,val codigoSupervision: String) : Producto(fechaCaducidad, numeroLote) {

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Código de Supervisión: $codigoSupervision")
    }
}