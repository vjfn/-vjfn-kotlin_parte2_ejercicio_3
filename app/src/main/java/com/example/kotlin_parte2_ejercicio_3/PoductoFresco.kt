package com.example.kotlin_parte2_ejercicio_3

class ProductoFresco(fechaCaducidad: String,numeroLote: String,val fechaEnvasado: String,val paisOrigen: String) : Producto(fechaCaducidad, numeroLote) {


    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Fecha de Envasado: $fechaEnvasado")
        println("País de Origen: $paisOrigen")
    }

}