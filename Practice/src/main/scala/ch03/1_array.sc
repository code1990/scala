val nums = new Array[Int](10)

val s= Array("Hello","World")

s(0)="GoodBye"

s
//变长数组缓冲
import scala.collection.mutable.ArrayBuffer

val b = ArrayBuffer[Int]()

val b2 = new ArrayBuffer[Int]()

b+=1
b+=(1,2,3,4)
b++=Array(8,9,10)

//删除最后5个元素
b.trimEnd(5)

b

//在第三个位置插入6
b.insert(2,6)
//在第三个位置插入 7,8,9
b.insert(2,7,8,9)
//删除第三个元素
b.remove(2)
b
//删除从第三个位置开始的3个元素
b.remove(2,3)

//变长数组和不变数组之间的转换
val a1 = b.toArray
a1.toBuffer

//数组遍历
val a = Array(1,2,3,4,5,6)
//下标访问
for(i<-0until a.length)println(i+":"+a(i))

//产生一个range
0 until a.length

//产生一个Range 以2位间隔
0 until (a.length,2)

//range 倒转
(0 until a.length).reverse

//a遍历
for(elem <- a)println(elem)

//a3
for(i<-a.indices)  println(i + ": " + a(i))
