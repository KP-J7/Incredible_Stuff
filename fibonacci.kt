/*This program prints first "i" Fibonacci numbers to the screen*/
fun fib(n: Int): Int {
    return if (n <= 1) n 
    else fib(n - 1) + fib(n - 2) //возвращает n -ое число Фибоначчи
}
fun main() {
    var t:Int;
    val i=readln().toInt()
    for (t in 1..i)
        println(fib(t))
}
