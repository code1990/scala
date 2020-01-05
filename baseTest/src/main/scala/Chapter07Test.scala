import org.scalatest.FunSuite

class Chapter07Test extends FunSuite {

  test("core01") {
    //Scala中没有静态方法和静态字段，你可以用object

  }
  test("core02") {
    //伴生对象
  }
  test("core03") {
    //Apply方法
  }
  test("core04") {
    //应用程序对象
    //继承app特质
  }
  test("core05") {
    //Scala中没有枚举类型，定义一个扩展Enumeration类的对象，并以value调用初始化枚举中的所有可能值。
  }

}

//Java中会有类既有实例方法又有静态方法的类。Scala中可以通过伴生对象进行实现。
//类和它的伴生对象可以相互访问私有特性，他们必须存在同一个源文件中。必须同名
object Chapter07Test {
  //单例对象
  private var lastName = "jim"
  val abc = "green"

  //  Apply方法一般都声明在伴生对象中
  def apply() = new Chapter07Test {}
}

//扩展一个App特质
object Hello extends App {
  println("HelloWorld")
}
