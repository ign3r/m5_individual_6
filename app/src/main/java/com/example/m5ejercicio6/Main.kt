package com.example.m5ejercicio6

fun main() {
    // Crear tres cuentas bancarias
    val cuenta1 = CuentaBancaria("Cuenta Cubillos", 5000000.0)
    val cuenta2 = CuentaBancaria("Cuenta Hermosilla", 1000000.0)
    val cuenta3 = CuentaBancaria("Cuenta Chadwick", 2000000.0)

    // Realizar transacciones en la cuenta de Cubillos
    cuenta1.deposito(1500000.0)
    cuenta1.retiro(1000000.0)
    cuenta1.retiro(6000000.0) // Retiro fallido, saldo insuficiente
    cuenta1.deposito(2000000.0)
    cuenta1.retiro(200000.0)

    // Realizar transacciones en la cuenta de Hermosilla
    cuenta2.deposito(3000000.0)
    cuenta2.retiro(1500000.0)
    cuenta2.deposito(5000000.0)
    cuenta2.retiro(8000000.0) // Retiro fallido, saldo insuficiente
    cuenta2.deposito(100000.0)

    // Realizar transacciones en la cuenta de Chadwick
    cuenta3.retiro(500000.0)
    cuenta3.deposito(300000.0)
    cuenta3.retiro(200000.0)
    cuenta3.retiro(4000000.0) // Retiro fallido, saldo insuficiente
    cuenta3.deposito(100000.0)

    // Mostrar historial de cada cuenta
    cuenta1.mostrarHistorial()
    cuenta2.mostrarHistorial()
    cuenta3.mostrarHistorial()

    // Mostrar saldo final de cada cuenta
    cuenta1.mostrarSaldo()
    cuenta2.mostrarSaldo()
    cuenta3.mostrarSaldo()
}