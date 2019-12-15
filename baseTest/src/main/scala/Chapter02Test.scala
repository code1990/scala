import org.scalatest.FunSuite

class Chapter02Test extends FunSuite {

  test("ch0201") {
    var bol: Boolean = false
    if (1 + 1 == 2) {
      bol = true
    } else {
      bol = false
    }
    println(bol)
  }

  test("ch0202") {
    import scala.util.control.Breaks._
    var index = 10
    while (index >= 0) {
      index = index - 1
      println(index)
      if (index == 5) {
        break
      }
    }
  }

  test("ch0203") {
    for (i <- 1 to 10) {
      println(i)
    }
    for (i <- 1 to 9; j <- 1 to 9) {
      println(i * j)
    }
    for (i <- 1 to 9; j <- 1 to 9; if i != j) {
      println(i * j)
    }
    var result = for (i <- 1 to 10) yield i
    println(result)
  }

  def abs(n: Int) = {
    if (n < 0) {
      -n
    } else {
      n
    }
  }

  test("ch0204") {
    println(abs(-1))
  }

  def printNumber(n: Int): Unit = {
    for (i <- 1 to 10) println(i)
  }

  test("ch0205") {
    printNumber(10)
  }

  def init(): String = {
    "init"
  }

  def noLazyFunction(): Unit = {
    var str = init()
    println(str)
  }

  def lazyFunction() = {
    lazy val str = init()
    println(str)
  }

  test("ch0206") {
    noLazyFunction()
    lazyFunction()
  }

  test("ch0207") {
    import scala.math._
    var index: Int = (-1)
    if (index < 0) {
      //throw new IllegalArgumentException("x must bigger than zero")
    }
    try {
      sqrt(-1)
    } catch {
      case e: Exception => println(e)
    } finally {
      println("finally")
    }
  }

}
