import org.scalatest.FunSuite

class Chapter09Test extends FunSuite {

  test("core01") {
    //继承类
  }
  test("core02") {
    //重写方法
  }
  test("core03") {
    //类型检查和转换
    val r = scala.math.random
    val p = if (r < 0.1) {
      new Array(1)
    } else {
      new scala.collection.mutable.ArrayBuffer[Int]()
    }
    //某个对象是否属于某个给定的类
    //    if (p.isInstanceOf[Array]) {
    //      //用asInstanceOf方法将引用转换为子类的引用
    //      val s = p.asInstanceOf[Array]
    //    }
    //classof获取对象的类名
    //    if (p.getClass == classOf[p.type]) {
    //      println(123)
    //    }
  }
  test("core04") {
    //protected
  }
  test("core05") {
    //超类的构造
    //只有主构造器才能调用超类的构造器，构造器的参数，传入了超类的构造函数。

  }
  test("core06") {
    //重写字段

  }
  test("core07") {
    //匿名子类

  }
  test("core08") {
    //    抽象类
  }
  test("core09") {
    //    构造顺序和提前定义
  }
  test("core10") {
    println(111)
  }

}

//继承
class Person {
  var name = ""

  //重写
  override def toString: String = getClass.getName
}

class Employee extends Person {
  val salary = 0.0

  override def toString: String = super.toString

  //protected声明字段和方法，子类可见，所属包不可见
  protected var empno = 0
}

//超类的构造举例
class Person1(val name: String, val age: Int) {
  override def toString = getClass.getName + "[name=" + name +
    ",age=" + age + "]"
}

class Employee1(name: String, age: Int, val salary: Double) extends
  Person1(name, age) {
  override def toString = super.toString + "[salary=" + salary + "]"
}

//子类重写父类的字段
abstract class Person2 {
  def id: Int
}

class Student(override val id: Int) extends Person2

//抽象类
abstract class AbstractPerson(val pname: String) {
  //抽象类的字段 方法
  val id: Int
  var name: String

  def idString: Int
}

// 提前定义
class Creature {
  val range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Bug extends {
  // 提前定义
  override val range = 3
} with Creature