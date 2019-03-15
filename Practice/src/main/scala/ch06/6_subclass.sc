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