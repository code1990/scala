val prices = List(1,2,3)

val quantitles = List(1,2,3)

prices zip quantitles

//拉链后执行map操作
(prices zip quantitles) map { p =>p._1 * p._2}

((prices zip quantitles) map { p =>p._1 * p._2}) sum

List(1,2,3) zip List(1,2,3)

//如果一个元素比较少 则使用默认值代替
List(1,2,3).zipAll(List(10,2),0,1)

List(1).zipAll(List(10,2),0,1)

//和索引值相互操作
"Scala".zipWithIndex

"Scala".zipWithIndex.max

"Scala".zipWithIndex.max._2

//unzip函数可以将一个元素的列表转换成一个列表的元祖
"Scala".zipWithIndex.unzip

"Scala".zipWithIndex.unzip._1

"Scala".zipWithIndex.unzip._2














