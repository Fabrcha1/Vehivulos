package Vehiculos

// Clase abstracta Vehiculo
abstract class Vehiculo {
    abstract val tipo: String
}

// Interfaz AccionVehiculo
interface AccionVehiculo {
    fun conducir()
}

// Clase Coche que hereda de Vehiculo e implementa AccionVehiculo
class Coche : Vehiculo(), AccionVehiculo {
    override val tipo: String = "Coche"

    override fun conducir() {
        println("El coche está siendo conducido por la carretera.")
    }
}

// Clase Moto que hereda de Vehiculo e implementa AccionVehiculo
class Moto : Vehiculo(), AccionVehiculo {
    override val tipo: String = "Moto"

    override fun conducir() {
        println("La moto está siendo conducida por la autopista.")
    }
}
