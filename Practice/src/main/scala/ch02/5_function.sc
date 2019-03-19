/*3.4 函数
Scala 提供了很多函数，如果 math 函数，Java 中通常通过静态方法来模
拟。函数定义如下：
def 函数名（参数名：类型…）[: 返回类型] = 函数体


注：1、Scala可以通过=右边的表达式 推断出函数的返回类型。如果函数体需要
多个表达式，可以用代码块{}。
2、可以把 return 当做 函数版本的 break语句。
3、递归函数一定要指定返回类型。
4、变长参数通过* 来指定，所有参数会转化为一个 seq序列
5、_* 告诉编译器 Range当做参数序列化处理。
6、Head是获得首元素，tail是获取剩下元素的序列。

*/

/*3.5 过程
我们将不返回值得函数叫做过程，返回类型是 Unit，他是没有=号的
*/
//函数定义 返回类型可以自行推断
def abs(x:Double)=if(x>=0)x else -x

println(abs(3))
println(abs(-3))

def fac(n:Int)={
    var r =1
    for(i<- 1 to n) r =r*i
    r //{}大括号的最后一个返回值为函数返回值
}
println(fac(10))

//递归函数 必须指定返回值类型
def recursiveFac(n:Int):Int=
if(n<=0)1 else n *recursiveFac(n-1)

println(recursiveFac(10))

//设置默认参数
def decorate(str:String,left:String="[",right:String="]")
=left + str+ right
println(decorate("Hello"))

println(decorate("Hello", "<<<", ">>>"))

println(decorate("Hello", ">>>["))

println(decorate(left = "<<<", str = "Hello", right = ">>>"))

println(decorate("Hello", right = "]<<<"))

//变长参数
def sum(args:Int*)={
    var result = 0
    for(arg <- args)result +=arg
    result
}

val s = sum(1,2,3,4)

println(s)
//_*告诉编译器 1 to 5当做参数序列处理
val s2 = sum(1 to 5:_*)
println(s2)

//head是第一个元素。tail是剩下的元素的集合
def recursiveSum(args:Int*):Int={
    if(args.length==0)0
    else args.head + recursiveSum(args.tail:_*)
}

println(recursiveSum(1,2,3,4))

//过程定义
def box(s:String): Unit ={
    val border = "-"*s.length+"--\n"
    println("\n" + border + "|" + s + "|\n" + border)
}

box("Fred")

box("Wlima")

//或者如此定义
def box1(s:String):Unit={
    val border = "-"*s.length+"--\n"
    println("\n" + border + "|" + s + "|\n" + border)

}

box1("Fred")

box1("Wlima")


































