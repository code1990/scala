
/*3.6 懒值
当 val 被声明为 lazy 时，他的初始化将被推迟，直到我们首次对此取
值。
懒值使用注意：
1) 用于初始化开销比较大的语句。
2) 可以解决循环依赖问题。
3) 是开发懒数据结构的基础。
*/
def init():String={
    println("call init()")
    return ""
}

def noLazy(): Unit ={
    val property = init();//没有使用lazy修饰
    println("after init()")
    println(property)
}

def lazyd(): Unit ={
    lazy val property = init()
    println("after init()")
    println(property)
}

noLazy()

lazyd()

