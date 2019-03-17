class Pair[T:Ordering](val first:T,val second:T){
    def smaller(implicit  ord:Ordering[T])={
        println(ord)
        if(ord.compare(first,second)<0)first else second
    }

    override def toString: String = "(" + first + "," + second + ")"
}
//Predef 类中有对应的隐式参数
val p = new Pair(4,2)
p.smaller

val q = new Pair("fred","Brooks")
q.smaller