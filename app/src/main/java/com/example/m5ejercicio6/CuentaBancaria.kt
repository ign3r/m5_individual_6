package com.example.m5ejercicio6

class CuentaBancaria(
    val nombreCuenta: String,
    var saldoDisponible: Double
) {
    // Lista para almacenar el historial de transacciones
    private val historialTransacciones = mutableListOf<String>()

    // Función para realizar un depósito
    fun deposito(monto: Double) {
        if (monto > 0) {
            saldoDisponible += monto
            historialTransacciones.add("Depósito de $$monto. Saldo actual: $$saldoDisponible")
            println("*Depósito realizado correctamente en la cuenta $nombreCuenta")
        } else {
            println("No se puede depositar un monto negativo o cero.")
        }
    }

    // Función para realizar un retiro
    fun retiro(monto: Double) {
        if (monto > 0 && saldoDisponible >= monto) {
            saldoDisponible -= monto
            historialTransacciones.add("Retiro de $$monto. Saldo actual: $$saldoDisponible")
            println("*Retiro realizado correctamente en la cuenta $nombreCuenta")
        } else if (monto <= 0) {
            println("El monto de retiro debe ser mayor que cero.")
        } else {
            historialTransacciones.add("Intento de retiro fallido de $$monto. Saldo insuficiente.")
            println("*Retiro fallido: saldo insuficiente en la cuenta $nombreCuenta.")
        }
    }

    // Función para mostrar el saldo disponible
    fun mostrarSaldo() {
        println("")
        println("El saldo disponible en la $nombreCuenta es: $$saldoDisponible")
    }

    // Función para mostrar el historial de transacciones
    fun mostrarHistorial() {
        println("")
        println("---------------------------------------------------------------------")
        println("Historial de transacciones - $nombreCuenta")
        println("---------------------------------------------------------------------")
        if (historialTransacciones.isEmpty()) {
            println("No hay transacciones registradas.")
        } else {
            historialTransacciones.forEach { println(it) }
        }
    }
}