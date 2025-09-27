fun main() {
    // Variable declaration and printing
    val data = "Welcome"
    println(data)

    var data1 = "9 AM changeable"
    println(data1)

    var data2: Int = 25
    println(data2)

    // 'when' expression example
    val a = 5
    val result = when (a) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "Wrong Number."
    }
    println(result)

    // Array access
    val arr = arrayOf(1, 2, 3, 4)
    println(arr[1])

    // Loops: 'for' with ranges
    for (i in 1..7) {
        print(i)
    }
    println()

    for (i in 1 until 5) {
        print(i)
    }
    println()

    // Prime number check
    val num = 5
    var isPrime = true

    if (num <= 1) {
        isPrime = false
    } else {
        for (i in 2 until num) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
    }

    if (isPrime) {
        println("Number is prime")
    } else {
        println("Number is not prime")
    }

    // Single-expression function
    fun add(a: Int, b: Int) = a + b
    val r = add(2, 5)
    println("The sum is $r") // Corrected print statement

    // Overloaded functions
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    val r1 = sum(50, 60)
    val r2 = sum(100, 200, 300)
    println(r1)
    println(r2)
}