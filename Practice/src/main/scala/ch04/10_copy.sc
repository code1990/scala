abstract class Amount
case class Dollar(value:Double) extends Amount
case class Currency(value:Double,unit:String) extends Amount

case object Nothing extends Amount

val amt = Currency(20.0,"EUR")
val price = amt.copy(value=19.0)
println(price)

println(amt.copy(unit = "CHF"))