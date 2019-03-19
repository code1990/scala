/*5.4 类型模式
你可以对表达式的类型进行匹配，例如：
*/
for(obj <-Array(42,"42",BigInt(42),BigInt,42.0)){
    val result = obj match {
        case x:Int =>x
        case s:String => s.toInt
        case _:BigInt=>Int.MaxValue
        case BigInt=> -1
        case _ =>0
    }
    println(result)
}
// Map(42 -> "Fred")也映射到Map[String, Int]，显然不对，运行期已经没有类型信息
for(obj <-Array(Map("Fred"->42),Map(42->"Fred"),Array(42),Array("Fred"))){
    val result = obj match {
        case m: Map[String, Int] => "It's a Map[String, Int]"
        // Warning: Won't work because of type erasure
        case m: Map[_, _] => "It's a map"
//        case a: Array[Int] => "It's an Array[Int]"
        case a: Array[_] => "It's an array of something other than Int"
    }

    println(result)
}
/*通过这种方式，obj 被当做 Int 类型绑定到了 x 变量，或者当做 String 类
型绑定到了 s 变量，避免了使用 isInstanceOf 和 asInstanceOf 方法。
在匹配类型的时候，必须要设置一个变量名。
匹配操作发生在运行期，所以不能比对一个泛型类型，但是可以使用通
配符。但是对于数组来说，类型信息保存完好，你完全可以匹配 Array[Int]
*/