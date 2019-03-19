/*3.7 异常
当碰到异常情况时，方法抛出一个异常，终止方法本身的执行，异常传
递到其调用者，调用者可以处理该异常，也可以升级到它的调用者。运行系
统会一直这样升级异常，直到有调用者能处理它。 如果一直没有处理，则终
止整个程序。
Scala 的异常的工作机制和 Java 一样，但是 Scala 没有“受检”异常，你
不需要声明说函数或者方法可能会抛出某种异常。受检异常在编译器被检
查，java 必须声明方法所会抛出的异常类型。
*/
import java.io.IOException

import scala.math._
//异常的为Nothing
def root(x:Double)=
    if(x>=0){sqrt(x)}
    else throw  new IllegalArgumentException("x shoud not be negative")

try{
    println(root(4))
    println(root(-4))
}catch {
    case e:Exception =>println(e)
}finally {
    println("finally----")
}


