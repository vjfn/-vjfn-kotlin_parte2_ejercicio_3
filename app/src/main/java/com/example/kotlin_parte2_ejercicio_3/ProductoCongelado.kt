package com.example.kotlin_parte2_ejercicio_3

class ProductoCongelado(fechaCaducidad: String,numeroLote: String,val temperaturaCongelacion: Double) : Producto(fechaCaducidad, numeroLote) {

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Temperatura de Congelación Recomendada: $temperaturaCongelacion °C")
    }
}