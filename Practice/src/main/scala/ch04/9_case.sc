/*5.9 样例类
样例类首先是类，除此之外它是为模式匹配而优化的类，样例类用 case
关键字进行声明
*/
abstract class Amount
case class Dollar(value:Double) extends Amount
case class Currency(value:Double, unit: String) extends Amount

case object Nothing extends Amount

val dollar = Dollar(1000.0)

dollar.value

dollar.toString

for(amt <-Array(Dollar(1000.0),Currency(1000.0,"EUR"),Nothing)){
    val result = amt match{
        case Dollar(v)=>"$"+v
        case Currency(_,u)=>"I have got"+u
        case Nothing => ""
    }
    println(amt +" "+ result)
}