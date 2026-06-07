package Practice

import java.util.Random

const val MAX_NUMBER_BOOKS = 20

class BasicBook(val title: String, val author: String, val year: Int, var pages: Int) {

    fun getTitleAuthor(): Pair<String, String> = title to author
    fun getTitleAuthorYear(): Triple<String, String, Int> = Triple(title, author, year)
    fun canBorrow(hasBooks: Int): Boolean = hasBooks < MAX_NUMBER_BOOKS
    fun printUrl() = println(BASE_URL + title + ".html")

    companion object {
        const val BASE_URL = "http://turtlecare.net"
    }
}

fun BasicBook.weight(): Double {
    return pages * 1.5
}

fun BasicBook.tornPages(torn: Int) {
    if (pages >= torn) pages -= torn else pages = 0
}

class Puppy {
    fun playWithBook(book: BasicBook) {
        book.tornPages(Random().nextInt(12) + 1)
    }
}

fun main() {
    val puppy = Puppy()
    val book = BasicBook("Oliver Twist", "Charles Dickens", 1837, 540)

    println("--- ¡El cachorro empieza a jugar con el libro! (Peso inicial: ${book.weight()}g) ---\n")

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} pages left in ${book.title}")
    }

    println("\nSad puppy, no more pages in ${book.title}. (Peso final: ${book.weight()}g)")
}
