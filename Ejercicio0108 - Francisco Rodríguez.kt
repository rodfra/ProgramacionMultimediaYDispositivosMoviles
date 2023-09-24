import java.util.*

//Francisco Rodríguez - 2ºDAM Semipresencial

/**
 * 0108 - Listas
 * Crea un programa que permita al usuario introducir cadenas de texto y las
 * guarde en una lista, hasta terminar con "fin" (que no se almacenará). A
 * continuación, muestra la lista en orden inverso (del último dato al primero).
 * Finalmente, muéstrala en su orden normal usando ".forEach".
 */

fun main(args: Array<String>) {
    val cadenas = mutableListOf<String>()
    var cadena: String = ""
    val scanner = Scanner(System.`in`)

    do {
        print("Escribe una cadena (fin para terminar): ")
        cadena = scanner.nextLine()
        if (cadena != "fin")
            cadenas.add(cadena)

    } while (cadena != "fin")

    println("\nFor Inverso:")
    for (i in cadenas.size -1 downTo  0) {
        println(cadenas[i])
    }

    println("\nForEach:")
    cadenas.forEach {
        println(it)
    }
}
