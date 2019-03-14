package ch04.seal_13
//sealed 密封
sealed abstract class Amount

case class Dollar(value:Double)extends Amount
case class Currency(value:Double,unit:String)extends Amount

object Main extends App{
    def show(amt:Amount): Unit ={
        amt match {
            case Currency(v,u)=>"I have " + v + " " + u
        }
    }
    println(show(Currency(1000,"JPY")))
}