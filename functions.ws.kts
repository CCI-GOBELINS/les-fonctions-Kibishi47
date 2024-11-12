// Even = Pair
fun getEvenNumbers(x: Int): List<Int> {
    val numbers = mutableListOf<Int>()
    for (i in 0..x*2-1 step 2) {
        numbers.add(i)
    }
    return numbers
}

// Odd = Impair
fun getOddNumbers(x: Int): List<Int> {
    val numbers = mutableListOf<Int>()
    for (i in 1..x*2-1 step 2) {
        numbers.add(i)
    }
    return numbers
}

fun getNumbers(x: Int, isEven: Boolean = true): List<Int> {
    if (x > 0) {
        if (isEven) {
            return getEvenNumbers(x)
        } else {
            return getOddNumbers(x)
        }
    } else {
        println("You can not get a number of amount of 0 or less")
        return listOf<Int>()
    }
}

println(getNumbers(10, isEven = true))
println(getNumbers(10, isEven = false))
