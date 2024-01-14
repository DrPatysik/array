fun main(args:Array<String>){
    val reverseOrder = arrayOfNulls<Int>(901)
    var index = 0
    var number = 1000
    do{
        reverseOrder[index] = number
        index++
        number--
    }
    while (index <=900)

    for (index in reverseOrder.indices) {
        println(reverseOrder[index])
    }
}