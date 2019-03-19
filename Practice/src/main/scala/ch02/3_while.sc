/*3.2 while 表达式
do 至少执行一次
Scala 提供和 Java 一样的 while 和 do 循环，与 If 语句不同，While 语句
本身没有值，即整个 While 语句的结果是 Unit 类型的()。

注：scala并没有提供 break和 continue语句来退出循环，如果需要 break，可以
通过几种方法来做 1、使用 Boolean型的控制变量 2、使用嵌套函数，从函数中
return 3、使用 Breaks对象的 break方法。

*/
var r =1
var n =10
//while循环
while (n>0){
    r = r*n
    n -=1
    println(r)
}
r=1
n=10
//do while循环
do{
    r = r*n
    n-=1
    println(r)
}while(n>0)

import scala.util.control.Breaks._
//break
r=1
n=10
breakable{
    while (n >0){
        r = r*n
        n -=1
        println(r)
        if(r==720)break
    }
}