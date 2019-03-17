class Pair[T](val first:T,val second:T){
//    def smaller = if(first.c)
}

class Pair1[T<:Comparable[T]](val first:T,val second:T){
    def smaller = if(first.compareTo(second)<0)first else second
}

val p = new Pair1("Fred","Brooks")
println(p.smaller)

val p2 = new Pair("Fred","Brooks")

class Pair2[T](val first:T,val second:T){
    def replaceFirst[R>:T](newFirst:R)= new Pair(newFirst,second)

    override def toString: String = "(" + first + "," + second + ")"
}

class Person1(name:String){
    override def toString: String = getClass.getName+" "+name
}
class Student1(name:String) extends Person1(name)

val fred = new Student1("Fred")
val ww = new Student1("ww")
val barney = new Person1("Barney")

val p1 = new Pair2(fred,ww)
p1.replaceFirst(barney)


class Pair3[T](val first: T, val second: T) {
    def replaceFirst[R](newFirst: R) = new Pair(newFirst, second)
    override def toString = "(" + first + "," + second + ")"
}

val p3 = new Pair3(fred,ww)
p3.replaceFirst(barney)

