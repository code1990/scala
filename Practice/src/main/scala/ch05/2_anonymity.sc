/*6.2 匿名函数
可以通过函数表达式设置匿名函数：
*/
//函数表达式
(x:Double)=>3*x
//函数
val triple = (x:Double)=>3*x
Array(3.14,1.42,2.0).map(triple)
//包含在（）中
Array(3.14,1.42,2.0).map((x:Double)=>3*x)
//包含在{}中
Array(3.14,1.42,2.0).map{(x:Double)=>3*x}

def triple(x:Double)=3*x


