import scala.beans.BeanProperty

class Person{
    @BeanProperty var name:String =_
}
val fred = new Person
fred.setName("Fred")
fred.getName