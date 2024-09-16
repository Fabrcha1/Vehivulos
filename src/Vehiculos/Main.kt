package Vehiculos

fun gestionarVehiculos() {
    val coche = Coche()
    val moto = Moto()

    // Imprimir el tipo y acción de los vehículos
    println("El tipo de vehículo es: ${coche.tipo}")
    coche.conducir()

    println("El tipo de vehículo es: ${moto.tipo}")
    moto.conducir()
}

fun main() {
    gestionarVehiculos()
}