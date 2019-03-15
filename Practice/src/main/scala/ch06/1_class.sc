// class定义类，和java类似，不用声明public
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
