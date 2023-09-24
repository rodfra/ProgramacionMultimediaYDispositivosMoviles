//Francisco Rodríguez - 2ºDAM Semipresencial

/**
 * 0110 - Clases II
 * Crea una clase libro (autor, título, año), con setters que dejen los
 * valores por defecto "Anónimo", "No indicado" y -1. Crea también un método
 * que devuelva los tres datos en una misma línea, comenzando por el título,
 * separados por espacios y guiones, como en "It – Stephen King – 1986".
 */

class Libro (autor: String, titulo: String, anyo: Int) {
    var autor: String = ""
        set(value) {
            field = if (value.isEmpty()) "Anónimo" else value
        }

    var titulo: String = ""
        set(value) {
            field = if (value.isEmpty()) "No indicado" else value

        }

    var anyo: Int = 0
        set(value) {
            field = if (value == 0) -1 else value
        }

    init {
        this.autor = autor
        this.titulo = titulo
        this.anyo = anyo
    }

    override fun toString(): String {
        return autor + " - " + titulo + " - " + anyo
    }
}

fun main(args: Array<String>) {
    val libro1 = Libro("It", "Stephen King", 1986)
    val libro2 = Libro("", "", 0)
    println(libro1.toString())
    println(libro2.toString())
}
