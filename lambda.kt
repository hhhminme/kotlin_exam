fun addNumber (n1 : Int, n2 : Int) : Int{
    return n1 + n2
}
fun main() {
    println(addNumber(1,2))
    var addNumber = {n1:Int,n2:Int -> n1 + n2}
    println(addNumber(2,3))

}
