package Practice

// 5.5
class Library {
    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val libraryMap = mapOf("William Shakespeare" to allBooks)

    val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")

    fun hasBook(bookTitle: String): Boolean {
        return libraryMap.any { it.value.contains(bookTitle) }
    }

    fun findOrAddBook(title: String, defaultAuthor: String): String? {
        return moreBooks.getOrPut(title) { defaultAuthor }
    }
}

fun main() {
    val myLibrary = Library()

    println("¿Tiene Hamlet?: ${myLibrary.hasBook("Hamlet")}")

    myLibrary.findOrAddBook("Jungle Book", "Kipling")
    myLibrary.findOrAddBook("Wilhelm Tell", "Desconocido")

    println("\nInventario de moreBooks:")
    println(myLibrary.moreBooks)
}
