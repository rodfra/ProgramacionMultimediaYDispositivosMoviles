import java.util.*

//Francisco Rodríguez - 2ºDAM Semipresencial

/**
 * 0104 - Tabla de multiplicar
 * Escribe la tabla de multiplicar de un número introducido por el usuario,
 * utiliza el bucle for.
 */

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    print("Tabla de multiplicar del: ")
    val num : Int =  scanner.nextInt()
    scanner.close()

    for (i in 1..10) {
        println("num * $i = " + (num * i))
    }
}
