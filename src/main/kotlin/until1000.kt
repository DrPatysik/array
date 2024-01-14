fun main(arrgs:Array<String>) {

    var sum = 0
    var index = 0

    val thousand = arrayOfNulls<Int>(101)
    do {
        thousand[index] = sum
            index++
        sum += 10
    } while (index <= 100)

    for (sum in thousand.indices) {
        println(thousand[sum])
    }
}