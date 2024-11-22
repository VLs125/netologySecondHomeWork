package org.netology_exceptions

fun main() {
    likesCount(5)
    likesCount(20)
    likesCount(21)
    likesCount(43)
    likesCount(53)
    likesCount(1927313)
    likesCount(101)
    likesCount(201)
    likesCount(1001)

}

fun likesCount(likes: Int) {
    var likes = likes

    if (likes in (2..20) || ((likes % 2 == 0) || (likes.toString().toCharArray().size >= 2 && likes.toString()
            .toCharArray()[likes.toString().length - 1].digitToInt() != 1))
    ) {
        println("Понравилось $likes людям")
    } else println("Понравилось $likes человеку")
}