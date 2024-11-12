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

fun getFibonacciNumbers(x: Int): List<Int> {
    if (x > 0) {
        var numbers = mutableListOf<Int>()
        for (i in 0..x-1) {
            if (numbers.count() == 0) {
                numbers.add(0)
            } else if (numbers.count() == 1) {
                numbers.add(1)
            } else {
                numbers.add(numbers[i-2] + numbers[i-1])
            }
        }
        return numbers
    } else {
        println("You can not get a number of amount of 0 or less")
        return listOf<Int>()
    }
}

println(getFibonacciNumbers(10))

fun factorial(x: Int = 10): Int {
    var result = 1
    for (i in 1..x) {
        result *= i
    }
    return result
}

println(factorial(5))

fun isPrimeNumber(x: Int): Boolean {
    if (x > 1) {
        for (i in x - 1 downTo 2) {
            if (x % i == 0){
                return false
            }
        }
        return true
    }
    return false
}

fun getPrimeNumbers(x: Int): List<Int> {
    if (x > 0) {
        var numbers = mutableListOf<Int>()
        var i = 0
        while (numbers.count() < x) {
            if (isPrimeNumber(i)){
                numbers.add(i)
            }
            i++
        }
        return numbers
    } else {
        println("You can not get a number of amount of 0 or less")
        return listOf<Int>()
    }
}

println(getPrimeNumbers(10))