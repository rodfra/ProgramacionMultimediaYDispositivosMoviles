import java.util.*

//Francisco Rodríguez - 2ºDAM Semipresencial

/**
 * 0105 - Letras de una cadena
 * Escribe las letras de una cadena de texto, una a una, separadas por espacios,
 * usando for.
 */

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    print("Introduce una cadena: ")
    val cadena : String =  scanner.nextLine()
    scanner.close()

    for (i in 0..cadena.length - 1) {
        print(cadena[i] + " ")
    }
}
