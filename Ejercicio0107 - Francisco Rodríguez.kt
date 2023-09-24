import java.util.*

//Francisco Rodríguez - 2ºDAM Semipresencial

/**
 * 0107 - Array
 * Prepara un array con los días de la semana. El usuario introducirá un número
 * del 1 al 7 y le mostrarás el día correspondiente. Si introduce un valor
 * incorrecto, le mostrarás los 7 valores aceptables ("1=lunes", etc).
 */

fun main(args: Array<String>) {
    val diasSemana = listOf("Lunes", "Martes", "Miércoles",
            "Jueves", "Viernes", "Sábado", "Domingo")
    val scanner = Scanner(System.`in`)
    var dias: Int = 1;

    print("Introduce una número: ")
    val num : Int =  scanner.nextInt() - 1
    scanner.close()

    if (num < 1 || num > 7) {
        diasSemana.forEach {
            println("$dias = " + it)
            dias++
        }
    }

    else
        println("Es el día "+ diasSemana[num])
}
