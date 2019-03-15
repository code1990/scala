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
