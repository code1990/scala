import org.scalatest.FunSuite

class Chapter02Test extends FunSuite {

  test("ch0201") {
    //传统的if else 判断
    var bol = if (1 + 1 == 2) true else false
    //if else 可以有返回值
    val x = if (bol) 1 else -1
    println(bol)
    //类型不一致时候 返回超类Any
    val y = if (x > 0) "false" else -1
    //没有返回值 返回Unit
    val z = if (x > 0) 1
    //一般不需要;分号
    var a = 1
    //多行代码写在一行 需要使用;分好 可以不使用大括号
    if (a > 0) {
      println(1);
      println(2)
    }
    //{} 代码块的值就是最后一个表达式的值
    if (a > 0) {
      a -= 1
    }

  }

  test("ch0202") {
    //占位符
    val name = "jim"
    val age = 42.22
    println(f"Hello, $name! You are $age%7.2f years old%n")

  }

  test("ch0203") {
    //while循环结构 以及break跳出循环
    import scala.util.control.Breaks._
    var index = 10
    while (index >= 0) {
      index = index - 1
      println(index)
      if (index == 5) {
        break
      }
    }
    //do while循环结构
    index = 10
    do {
      index = index - 1
      println(index)
    } while (index >= 0)

  }


  test("ch0204") {
    //for循环 1到10
    for (i <- 1 to 10) {
      println(i)
    }
    //for循环 多个变量
    for (i <- 1 to 9; j <- 1 to 9) {
      println(i * j)
    }
    //for循环 条件表达式 守卫模式（支持多个条件表达式）
    for (i <- 1 to 9; j <- 1 to 9; if i != j) {
      println(i * j)
    }
    //for循环引入变量
    for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ")
    //for循环推导式yield
    var result = for (i <- 1 to 10) yield i
    println(result)
  }

  //定义一个函数 函数的返回值可以自行推断
  def abs(n: Int) = {
    if (n < 0) {
      -n
    } else {
      n
    }
  }

  //定义一个递归函数必须指明类型
  //这是一个阶乘
  def fun(n: Int): Int =
    if (n <= 0) 1 else n * fun(n - 1)

  //没有返回值的函数 称为过程
  def printNumber(n: Int): Unit = {
    for (i <- 1 to 10) println(i)
  }

  // 变长参数
  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  test("ch0205") {
    println(abs(-1))
    printNumber(10)
  }

  //定义一个初始化的方法
  def init(): String = {
    "init"
  }

  //没有延迟加载的函数
  def noLazyFunction(): Unit = {
    var str = init()
    println(str)
  }

  //有延迟加载的函数
  def lazyFunction() = {
    lazy val str = init()
    println(str)
  }

  test("ch0206") {
    noLazyFunction()
    lazyFunction()
  }

  //异常的处理
  test("ch0207") {
    import scala.math._
    var index: Int = (-1)
    //异常的抛出
    if (index < 0) {
      //throw new IllegalArgumentException("x must bigger than zero")
    }
    //异常的捕获
    try {
      sqrt(-1)
    } catch {
      case e: Exception => println(e)
    } finally {
      println("finally")
    }
  }

}
