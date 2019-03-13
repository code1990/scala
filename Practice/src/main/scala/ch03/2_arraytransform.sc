val a = Array(2,3,4,5)

//产生新的数组
val result = for(elem <- a)yield 2*elem

for(elem <- a if elem %2==0)yield  2*elem

a.filter(_ % 2==0).map(2 * _)

//常用方法
import scala.collection.mutable.ArrayBuffer

Array(1,2,3,4).sum

ArrayBuffer("Mray","had","a","little").max

val b = ArrayBuffer(1,2,3,4)
//排序
val bSorted = b.sorted

val a1= Array(1,2,3,4)

scala.util.Sorting.quickSort(a1)

a1

//形成String
a1.mkString("and")

a1.mkString("<",",",">")
a1.toString
b.toString

import scala.collection.mutable.ArrayBuffer
val a2 = Array(1,2,3,4)
val b2 = ArrayBuffer(1,2,3,4)

//统计大于0的个数
a2.count(_ > 0)

b2.append(1,2,3)

b2.appendAll(a2)

b2

b2 +=4 -=7

b2

//把b2中的数据copy到a2中 a2的空间为5
b2.copyToArray(a2)

val xs = Array(1,"Fred",2,3)

b2.copyToArray(xs)

b2

//添加20项 使用-1填充
b2.padTo(20,-1)

(1 to 10).padTo(20,-1)
