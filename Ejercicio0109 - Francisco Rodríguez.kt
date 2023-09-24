//Francisco Rodríguez - 2ºDAM Semipresencial

/**
 * 0109 - Clases I
 * Crea una clase de datos "coche" con marca, modelo y año de
 * lanzamiento. Crea dos objetos de esa clase.
 */

class Coche (marca: String, modelo: String, anyo: Int) {
    var marca: String
    var modelo: String
    var anyo: Int

    init {
        this.marca = marca
        this.modelo = modelo
        this.anyo = anyo
    }
}

fun main(args: Array<String>) {
    val coche1 = Coche("Peugeot", "2008", 2020)
    val coche2 = Coche("Hyundai", "i20", 2016)

    println("Coche 1")
    println("   - Marca:" + coche1.marca)
    println("   - Módelo:" + coche1.modelo)
    println("   - Año de lanzamiento:" + coche1.anyo)

    println("\nCoche 2")
    println("   - Marca:" + coche2.marca)
    println("   - Módelo:" + coche2.modelo)
    println("   - Año de lanzamiento:" + coche2.anyo)
}
