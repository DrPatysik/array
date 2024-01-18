fun main(args:Array<String>) {
    val thousand = arrayOfNulls<Int>(101)

    for(thousand in 0..100 step 10)
        println(thousand)
}