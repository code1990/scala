/*copy 创建一个与现有对象值相同的新对象，并可以通过带名参数来修改某些属性。*/
abstract class Amount
case class Dollar(value:Double) extends Amount
case class Currency(value:Double,unit:String) extends Amount

case object Nothing extends Amount

val amt = Currency(20.0,"EUR")
val price = amt.copy(value=19.0)
println(price)

println(amt.copy(unit = "CHF"))