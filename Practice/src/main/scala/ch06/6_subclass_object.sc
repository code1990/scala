import scala.collection.mutable.ArrayBuffer

class Network{
    private val members = new ArrayBuffer[Network.Member]
    def join(name:String)={
        val m = new Network.Member(name)
        members +=m
        m
    }
    def description = "a with members "+
            (for (m<-members)yield m.name).mkString(" ")
}
object Network{
    class Member(val name:String){
        val contacts = new ArrayBuffer[Member]()
        def description = name +" with contacts "+
                (for (c<-contacts)yield c.name).mkString(" ")
    }
}

val chatter = new Network
val myFace = new Network

val fred = chatter.join("Fred")
val ww = chatter.join("ww")
fred.contacts += ww
val barney = myFace.join("Barney")
fred.contacts += barney // Also OK
println("chatter is " + chatter.description)
println("myFace is " + myFace.description)