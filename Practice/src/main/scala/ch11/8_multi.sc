class Pair[T](val first:T,val second:T){
    def smaller(implicit ev:T<:<Ordered[T])=
        if(first<second)first else second
}

import java.net.URL
val p = new Pair(new URL("http://scala-lang.org"),new URL("http://www.baidu.com"))

val friends = Map("Fred"->"Barney")
val friendOpt = friends.get("ww")
val friendOrNull = friendOpt.orNull

val scores = Map("Fred"->80)
val scoreOpt = scores.get("Fred")

//def firstLast[A,C<:Iterable[A]](it:C)=(it.head,it.last)



def firstLast[A, C](it: C)(implicit ev: C <:< Iterable[A]) =
    (it.head, it.last)

firstLast(List(1, 2, 3)) // OK

