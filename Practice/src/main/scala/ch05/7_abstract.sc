def runInThread(block:()=>Unit): Unit ={
    new Thread{
        override def run(){block()}
    }.start()
}
//传入函数
runInThread { () => println("Hi") ; Thread.sleep(10000); println("Bye") }

def runInThread(block: =>Unit){
    new Thread{
        override def run(){block}
    }.start()
}
//优雅的传入
runInThread { println("Hi") ; Thread.sleep(1000); println("Bye") }

//定义类的while的until方法
def until(condition: =>Boolean)(block: =>Unit): Unit ={
    if(!condition){
        block
        until(condition)(block)
    }
}

var x = 10
until (x==0){
    x-=1
    println(x)
}
Thread.sleep(1000)