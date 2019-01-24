package cn.edu.gxust.jiweihuang.kotlin.study.crazy.ch6

fun max(x: Int, y: Int): Int {
    val z = if (x > y) x else y
    return z
}

fun max2(x: Int, y: Int): Int {
    return if (x > y) x else y
}

fun sayHi(name: String): String {
    println("=== Executing sayHi() function ====")
    return "$name,Hello!"
}

fun main(args: Array<String>) {
    var a = 6
    var b = 9
    var result = max(a, b)
    println("result:$result")
    println("result2:${max2(a, b)}")
    println(sayHi("Wukong Sun"))
}