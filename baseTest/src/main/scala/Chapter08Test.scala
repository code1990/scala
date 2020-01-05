import org.scalatest.FunSuite

class Chapter08Test extends FunSuite {

  test("core01") {
    //定义一个包
  }
  test("core02") {
    //包的作用域
    //如果遇到引用的类和scala内部类的有冲突，可以使用绝对包名（以root_开始）
    val subordinates = new _root_.scala.collection.mutable.ArrayBuffer[Double]
  }
  test("core03") {
    //包对象
    //包可以包含类、对象、特质
  }
  test("core04") {
    //    可以通过设定private设置包的可见性
  }
  test("core05") {
    //    通过import进行包的引入，_类似于java中的*
    import scala.math._
    println(sqrt(4))
  }
  test("core06") {
    //如下所示 有选择的导入
    import java.util.{HashSet => _, _}
    import java.util.{HashMap => JavaHashMap}
    import java.awt.{Color, Font}
  }

}

//包
package net {
  package bigjava {

    class Counter {
      private var value = 0

      def increment() {
        value += 1
      }

      def description = "A counter with value " + value
    }

  }

}

//包对象
package object people {
  val defaultName = "John Q. Public"
}

//包可见性
package people {

  private class Person {
    var name = defaultName // A constant from the package
  }

}