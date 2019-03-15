object TrafficLightColor extends Enumeration{
    val Red,Yellow,Green = Value
}
TrafficLightColor.Red
TrafficLightColor.Red.id

object TrafficLightColorSecond extends Enumeration{
    val Red = Value(0,"Stop")
    val Yellow = Value(10)
    val Green = Value("Go")
}
import  TrafficLightColorSecond._

Red
Yellow
Green
Green.id