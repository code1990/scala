//view limit
class PairSec04[T<%Comparable[T]](val first:T,val second:T){
    def smaller = if(first.compareTo(second)<0)first else second

    override def toString: String = "(" + first + "," + second + ")"
}

val p = new PairSec04(4,2)
p.smaller

