// class定义类，和java类似，不用声明public
/*7.1 简单类和无参方法
通过 class 进行类的定义。
*/
class Counter{
    private var value =0
    def increment(){value+=1}
    def current()=value
}
//new Counter()也可以
val myCounter = new Counter

myCounter.increment()
println(myCounter.current())

val myCounter2 = new Counter
myCounter2.current()

class Counter1{
    private var value =0
    def increment(){value+=1}
    def current = value
}
val myCounter1 = new Counter1
myCounter1.current
/*注：在 Scala中，类并不声明为 Public，一个 Scala源文件可以包含多个类。所有
这些类都具有公有可见性。调用无参方法时，可以加（），也可以不加；如果方法
定义中不带括号，那么调用时就不能带括号。
*/