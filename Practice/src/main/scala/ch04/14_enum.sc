/*5.14 模拟枚举
样例类可以模拟出枚举类型，如下：
*/
sealed abstract class TrafficLightColor

case object Red extends TrafficLightColor
case object Yellow extends TrafficLightColor
case object  Green extends  TrafficLightColor

for(color<-Array(Red,Yellow,Green)){
    println(
        color match {
            case Red =>"stop"
            case Yellow => "hurry up"
            case Green=>"go"
        }
    )
}