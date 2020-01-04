import org.scalatest.FunSuite

//继承函数套件FunSuite
class Chapter01Test extends FunSuite {

  test("ch0101") {
    //var 声明一个变量 变量可以被改变
    var index: Int = 1
    index = index + 1
    println(index)
    //val 声明一个常量 常量不能再次被赋值
    val PI: Double = 3.14
    println(PI)
    //同时声明多个变量
    var i, j = 0
    println(i + j)
    var str1, str2 = null
  }

  test("ch0102") {
    //隐式转换 整数转换为字符串
    var str: String = 1.toString
    println(str)
    //浮点类型之间的转换 不需要使用强制类型转换
    var money: Double = 90.11.toInt
    println(money)
    var hello: String = "hello"
    //string隐式转换为StringOps
    println(hello.intersect("world"))
  }

  test("ch0103") {
    //scala没有 ++ --操作
    var count: Int = 1
    count += 1
    println(count)
    //scala提供bigInt bigDecimal操作
    var x: BigInt = 123456
    println(x * x * x)
  }

  test("ch0104") {
    //函数的调用 先引入 然后作为一等公民直接调用
    import scala.math._
    println(sqrt(4))
    //调用static方法 通过类名类调用
    BigInt.probablePrime(100, scala.util.Random)
    //调用对象的方法 通过对象来调用
    var str: String = "Hello World"
    println(str.toLowerCase)

  }

  test("ch0105") {
    //声明一个数组
    var array = Array(1, 2, 3)
    //通过apply方法 构造获取元素 等价于上面的简写形式
    var array2 = Array.apply(1, 2, 3)
    //更新元素的方法
    array(0) = 4
    //通过update方法来更新元素
    array2.update(0, 4)
    //apply方法获取元素 update更新元素
    println(array.toString)
    println(array2.toString)
  }

  test("ch0106") {
    //对象包装器Option 存在2个选项 存在 some 不存在none
    //可以通过模式匹配的方式来获取
    var scores = Map("jim" -> 1, "Green" -> 2)
    scores.get("jim") match {
      case Some(score) => println(score)
      case None => println("no score")
    }
  }


}
