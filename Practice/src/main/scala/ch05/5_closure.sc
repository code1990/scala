/*6.5 闭包
闭包就是一个函数把外部的那些不属于自己的对象也包含(闭合)进来
了。
*/
def mulBy(factor:Double)=(x:Double)=>factor*x

val triple = mulBy(3)
val half = mulBy(0.5)
println(triple(14)+" "+half(14))

