import java.util.*

//Francisco Rodríguez - 2ºDAM Semipresencial

/**
 * 0106 - ¿Primo?
 * Crea una función que permita saber si un cierto número, que se le
 * pase como parámetro,
 * es primo. Úsala desde un programa.
 */

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    print("Introduce una número: ")
    val num : Int =  scanner.nextInt()
    scanner.close()

    if (esPrimo(num))
        println("El número $num es primo")
    else
        println("El número $num NO es primo")
}

fun esPrimo(num: Int): Boolean {
    var divisores: Int = 0;
    var primo: Boolean = false;

    for (i in 1..num) {
        if (num % i == 0)
            divisores++
    }

    if (divisores == 2)
        primo = true

    return primo
}