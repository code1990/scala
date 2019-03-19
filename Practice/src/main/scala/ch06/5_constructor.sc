/*7.5 构造器
Scala 的类构造器分为主构造器和辅助构造器。
1) 主构造器的参数直接放置在类名之后：
2) 主构造器会执行类定义中的所有语句：
3) 通过 private 设置主构造器的私有属性：
4) 如果参数至少被一个方法使用，该参数将自动升格为字段，否则，该参数将不被保存为字段：
5) 辅助构造器名称为 this，通过不同参数进行区分，每一个辅助构造器都必须以主构造器或者已经定义的辅助构造器的调用开始：

*/
import java.io.FileReader
import java.util.Properties

class Person(val name:String ="",val age:Int=0){
    println("Just constructed other person")
    def description = name + "is"+ age + "years old"
}
val p1 = new Person()
val p2 = new Person("Fred")
val p3 = new Person("Fred",20)

p1.description
p2.description
p3.description

class MyPro {
    private val props = new Properties
    props.load(new FileReader("mypro.properties"))
}

class Person2(val name:String,private var age:Int){
    def description =name + "is"+age+"years old"
    def birthday(){age+=1}
}

val p = new Person2("Fred",42)
p.name
//p.age
p.birthday()
p.description

class Person3{
    private var name = ""
    private var age = 0
    def this(name:String){
        this()
        this.name = name
    }
    def this(name:String,age:Int){
        this(name)
        this.age = age
    }
    def dscription = name + "is"+age+"years old"
}
val p11 = new Person3()
val p22 = new Person3("Fred")
val p33 = new Person3("Fred",22)
p11.dscription
p22.dscription
p33.dscription
