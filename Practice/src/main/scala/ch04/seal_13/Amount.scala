package ch04.seal_13
//sealed 密封
/*5.13 密封类
如果想让 case 类的所有子类都必须在申明该类的相同的文件中定义，可
以将样例类的通用超类声明为 sealed，叫做密封类，密封就是外部用户不能在
其他文件中定义子类。
*/
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