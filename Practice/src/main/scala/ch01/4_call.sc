import scala.math._
/*2.4 调用函数和方法
除了方法，Scala 还提供了函数，比如数学函数。
调用函数：
需要引入函数包 import 包名._ _是通配符，等同于 java 中的*
调用静态方法：
Scala 中没有静态方法，一般通过单例对象或者伴生对象进行实现。
调用对象方法：
对象实例调用方法
*/
//函数调用
sqrt(2)
pow(2,4)
min(2,3)
//方法调用
"Hello".distinct
//静态方法调用
BigInt.probablePrime(100,scala.util.Random
)