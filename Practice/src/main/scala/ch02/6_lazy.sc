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

