import java.util.*

//Francisco Rodríguez - 2ºDAM Semipresencial

/**
 * 0103 - Día de la semana
 * Muestra el nombre de un día de la semana a partir de su número (del 1 al 7),
 * usando "when". El sábado y el domingo deberán aparecer como "fin de semana"
 * y se deberá avisar si el número no es válido.
 */

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    print("Número de la semana: ")
    val num : Int =  scanner.nextInt()
    scanner.close()

    when (num) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6,
        7 -> println("Fin de semana")
        else -> println("Día incorrecto")
    }
}
