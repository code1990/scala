import org.scalatest.FunSuite

import scala.beans.BeanProperty

// class定义类，和java类似，不用声明public
//1）主构造器的参数直接放置在类名之后
class Chapter06Test(val name11: String = "", val age11: Int = 1) extends FunSuite {
  var age = 0
  private var value = 0
  //private[this]定义对象私有的字段，不生成get、set方法。
  private[this] var val123 = 0
  //生成与java类似的set/get方法
  @BeanProperty var name: String = _

  def increment(): Unit = {
    value += 1
  }

  def current() = value


  test("core01") {
    //类的定义如上所示
  }
  test("core02") {
    //setter方法
    //    对于scala类中的每一个属性，编译后，会有一个私有的字段和相应的getter、setter方法生成，
    //    比如：    如果属性为age，
    //    那么getter方法名叫age，setter方法名为age_=
    val f = new Chapter16Test
    //setter方法
    //    f.age=21
    //getter方法
    //    println(f.age)
  }
  test("core03") {
    //    private[this]定义对象私有的字段，不生成get、set方法。
  }
  test("core04") {

  }
  test("core05") {
    //    1）主构造器的参数直接放置在类名之后
  }
  test("core06") {
    // 在Scala中，你几乎可以在任何语法结构中嵌套任何语法结构
  }

  //定义在一个类的内部称为嵌套类
  class Member(val name: String) {
    val contacts = Array(1, 2, 3)
  }

}
