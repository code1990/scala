import scala.collection.mutable.ArrayBuffer

class Network{
    class Member(val name:String){
        val contacts = new ArrayBuffer[Member]()
    }
    private val members =new ArrayBuffer[Member]()

    def join(name:String)={
        val m = new Member(name)
        members+=m
        m
    }
}

val chatter = new Network
val myFace = new Network

val fred = chatter.join("Fred")
val wlima = chatter.join("Wlima")
fred.contacts += wlima

val barney = myFace.join("Barney")
//fred.contacts += barney

/*7.6 嵌套类
在 Scala 中，你几乎可以在任何语法结构中嵌套任何语法结构，在函数
中定义函数，在类中定义类。Java 中的内部类从属于外部类。Scala 中每一个
实例都有一个内部类，内部类从属于实例。
*/
class Network1{
    class Member(val name:String){
        val contacts = new ArrayBuffer[Network1#Member]()
    }
    private val members = new ArrayBuffer[Member]()

    def join(name:String)={
        val m = new Member(name)
        members+= m
        m
    }
}

val chatter1 = new Network1
val myFace1 = new Network1

val fred1 = chatter1.join("Fred")
val ww = chatter1.join("Wlima")
fred1.contacts += ww // OK
val barney1 = myFace1.join("Barney")
fred1.contacts += barney1 // Also OK