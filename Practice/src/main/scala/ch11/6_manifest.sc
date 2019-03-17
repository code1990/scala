def foo[T](x:List[T])(implicit m:Manifest[T])={
    println(m)
    if(m<:<manifest[String])
        println("hey this is full string")
    else
        println("No string list")
}

foo(List("noe","two"))

foo(List(1,2))

import scala.reflect._

def makePair[T:ClassTag](first:T,second:T)={
    val r = new Array[T](2);r(0)=first;r(1)=second;r
}

val a = makePair(4,2)
a.getClass

val b = makePair("Fred","Brooks")
b.getClass

