import org.scalatest.FunSuite

class Chapter05Test extends FunSuite {
  def valueAtOneQuarter(f: (Double) => Double) = f(0.25)

  def mulBy(factor: Double) = (x: Double) => factor * x

  def mulOneAtATime(x: Int) = (y: Int) => x * y

  // 这种叫控制抽象  函数
  def runInThread(block: => Unit) {
    new Thread {
      override def run() {
        block
      }
    }.start()
  }

  test("core01") {
    //作为参数的高阶函数
    import scala.math._
    val num = 3.14
    val fun = ceil _
    println(fun(num))
    Array(3.14, 2.13).map(fun)
  }
  test("core02") {
    //匿名表达式
    (x: Double) =>
      3 * x
      //匿名函数
      val tmp = (x: Double) => 3 * x
      //匿名函数作为参数传递
      Array(3.14, 2.13).map(tmp)
  }
  test("core03") {
    //高阶函数
    import scala.math._
    valueAtOneQuarter(ceil _)
    valueAtOneQuarter(sqrt _)
  }
  test("core04") {
    //参数推断
    //传入函数表达式
    valueAtOneQuarter((x: Double) => x * 3)
    //省去类型推断信息
    valueAtOneQuarter((x) => x * 3)
    //单个参数可以省去括号
    valueAtOneQuarter(x => 3 * x)
    // 如果变量旨在=>右边只出现一次，可以用_来代替
    valueAtOneQuarter(3 * _)

  }
  test("core05") {
    //      闭包就是一个函数把外部的那些不属于自己的对象也包含（闭合）进来了。
    //    闭包机制使用起来就像是一个函数样板。
    val triple = mulBy(3)
    val half = mulBy(0.5)
    println(triple)
    println(half)
  }
  test("core06") {
    //    函数编程中，接受多个参数的函数都可以转化为接受单个参数的函数，这个转化过程就叫柯里化，柯里化就是证明了函数只需要一个参数而已。
    mulOneAtATime(6)(7)

  }
  test("core07") {
    //    控制抽象是一类函数：1、参数是函数。2、函数参数没有输入值也没有返回值。
    // 优雅的传入
    runInThread {
      println("Hi");
      Thread.sleep(1000);
      println("Bye")
    }
  }

}

