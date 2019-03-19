/*7.4 Bean 属性
JavaBeans 规范定义了 Java 的属性是像 getXXX（）和 setXXX（）的方
法。许多 Java 工具都依赖这个命名习惯。为了 Java 的互操作性。将 Scala 字
段加@BeanProperty 时，这样的方法会自动生成。
*/
import scala.beans.BeanProperty

class Person{
    @BeanProperty var name:String =_
}
val fred = new Person
fred.setName("Fred")
fred.getName