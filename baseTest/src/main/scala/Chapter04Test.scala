import org.scalatest.FunSuite

class Chapter04Test extends FunSuite {

  test("core01") {
    //模式匹配
    var sign = 0
    for (ch <- "+-!") {
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ => sign = 0
      }
      println(sign)
    }
  }
  test("core02") {
    //匹配模式添加条件判断 守卫模式
    for (ch <- "+-!3") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = 11
        //条件判断
        case _ if Character.isDigit(ch) => digit = Character.digit(ch, 10)
        case _ => sign = 13
      }
      println(ch + " " + sign + " " + digit)
    }
  }
  test("core03") {
    //变量匹配
    var str = "+!-3"
    for (i <- str.indices) {
      var sign = 0
      str(i) match {
        case '+' => sign = 1
        case '-' => sign = 11
        case _ => sign = 12
      }
      println(str(i) + "\t" + sign)
    }
    import scala.math._
    val x = math.random
    x match {
      case Pi => "it is PI"
      case _ => "it is not PI"
    }
  }
  test("core04") {
    //匹配类型
    for (obj <- Array(42, "42", BigInt(42), BigInt, 42.0)) {
      val result = obj match {
        case x: Int => x
        case s: String => s.toInt
        case _: BigInt => Int.MaxValue
        case BigInt => 11
        case _ => 0
      }
      println(result)
    }
  }
  test("core05") {
    //匹配数组
    for (arr <- Array(Array(0), Array(1, 0), Array(0, 0, 1))) {
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => x + "_" + y
        case Array(0, _*) => "0....."
        case _ => "something"
      }
      println(result)
    }
    //匹配列表
    for (lst <- Array(List(0), List(1, 0), List(0, 0, 0))) {
      val result = lst match {
        case 0 :: Nil => "0"
        case x :: y :: Nil => x + " " + y
        case 0 :: tail => "0>>>>"
        case _ => "something"
      }
      println(result)
    }
    //匹配元祖
    for (pair <- Array((0, 1), (1, 0), (0, 0))) {
      val result = pair match {
        case (0, _) => "0>>>"
        case (y, 0) => y + "0"
        case _ => "neither is 0"
      }
      println(result)
    }
  }
  test("core06") {
    //    apply方法接受构造参数，生成对象；
    //    unapply方法接受对象，提取值，是一个反向操作。
    val arr = Array(0, 1)
    arr match {
      case Array(0, x) => x
    }
    //提取序列
    Array.unapplySeq(arr)
  }

  test("core07") {
    //在变量声明中使用模式
    val (x, y) = (1, 2)
    val Array(first, second, _*) = Array(1, 2, 3, 4)
  }
  test("core08") {
    //for循环匹配
    import scala.collection.JavaConverters._
    for ((k, v) <- System.getProperties.asScala) {
      print(k + "_" + v)
    }
    //守卫模式
    for ((k, v) <- System.getProperties.asScala if v == "") {
      print(k + "_" + v)
    }
  }
  test("core09") {
    //样例类匹配
    for (amt <- Array(Dollar(10.0), Curreny(1000, "EU"))) {
      val result = amt match {
        case Dollar(v) => "$" + v
        case Curreny(_, u) => u
        case _ => ""
      }
      print(result)
    }
  }
  test("core10") {
    //    方法和带名参数copy创建一个与现有对象值相同的新对象，并可以通过带名参数来修改某些属性。
    val amt = Curreny(29.95, "EU")
    val price = amt.copy(value = 19.95)
    print(price)

  }
  test("core11") {
    //匹配中置表达式
    val amt = Curreny(1000.0, "EU")
    //中置表达式
    amt match {
      case a Curreny u => a + " " + u
    }
    val list = List(1, 2, 3)
    list match {
      case h :: t => h + t.length
      case _ => 0
    }

  }
  test("core12") {
    //    样例类经常被用于嵌套结构。


  }
  test("core13") {
    //    如果想让case类的所有子类都必须在申明该类的相同的文件中定义，可以将样例类的通用超类声明为sealed，叫做密封类，
    //    密封就是外部用户不能在其他文件中定义子类。

  }
  test("core14") {
    //    样例类可以模拟出枚举类型
    for (color <- Array(Red, Yellow, Green)) {
      println(
        color match {
          case Red => "stop"
          case Yellow => "hurry up"
          case Green => "go"
        }
      )
    }

  }
  test("core15") {
    //    偏函数之所以“偏”，原因在于它们并不处理所有可能的输入，而只处理那些能与至少一个case语句匹配的输入。
    //    在偏函数中只能使用case 语句，而整个函数必须用花括号包围。
    val f: PartialFunction[Char, Int] = {
      case '+' => 1
      case '-' => 11
    }
    f('-')
  }

}

case class Dollar(value: Double)

case class Curreny(value: Double, unit: String)

//密封类
sealed abstract class TrafficLightColor

case object Red extends TrafficLightColor

case object Yellow extends TrafficLightColor

case object Green extends TrafficLightColor