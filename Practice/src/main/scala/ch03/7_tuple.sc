//元祖操作
(1,2.3,"Fred")
val t = (1,2.3,"Fred")
val second = t._2

val first = t._1
//变量赋值
val (first11, second22, third) = t
val (first1,second2,_)=t

//拉链操作
val symbols = Array("<","-",">")
val counts = Array(2,10,2)
val pairs = symbols.zip(counts)

for((s,n)<-pairs)print(s*n)

symbols.zip(counts).toMap

