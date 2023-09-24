import java.util.*

//Francisco Rodríguez - 2ºDAM Semipresencial

/**
 * 0102 - ¿Par?
 * Indica si un número es par o impar, usando la sintaxis de if como expresión,
 * en vez la sintaxis clásica.
 */

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    print("Indica un número: ")
    val num1 : Int =  scanner.nextInt()
    scanner.close()

    if (num1 % 2 == 0)
        println("Es par")
    else
        println("Es impar")
}
