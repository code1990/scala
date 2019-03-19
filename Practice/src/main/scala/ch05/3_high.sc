/*6.3 高阶函数
能接受函数作为参数的函数 叫做 高阶函数。
*/
import scala.math._

def valueAtOneQuarter(f:(Double)=>Double)=f(0.25)

valueAtOneQuarter(ceil _)
valueAtOneQuarter(sqrt _)

//产出函数
def mulBy(factor:Double)=(x:Double)=>factor*x

val quintuple = mulBy(5)

quintuple(20)

