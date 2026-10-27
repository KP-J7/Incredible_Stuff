fun  euq(a: Int, b: Int): Int {
    var n1 = a
    var n2 = b
    while (n2!=0){
        val temp=n2
        n2=n1%n2
        n1=temp
    }
    return n1
}
fun main() {
    print(euq(99,1545))
}
