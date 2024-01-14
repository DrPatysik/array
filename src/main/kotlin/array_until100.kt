fun main(args: Array<String>) {
     val elements = arrayOfNulls<Int>(101)
    for ((el) in elements.withIndex()){
        elements[el] = el
    }
    println(elements.joinToString())
    hundred()
}
fun hundred(){
    val numbers = arrayOfNulls<Int>(101)
    var index = 0
    var number = 100
    do{
        numbers[index] = number
        index++
        number--
    }
     while (index <=100)

    for (index in numbers.indices) {
        println(numbers[index])
    }
}






