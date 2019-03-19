/*8.5 枚举
Scala 中没有枚举类型，定义一个扩展 Enumeration 类的对象，并以 value
调用初始化枚举中的所有可能值。
*/
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