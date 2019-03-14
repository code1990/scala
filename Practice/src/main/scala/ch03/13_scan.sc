//部分简化操作
List(1,3,4,7).reduceLeft(_ - _)

List(1,3,4,7).reduceRight(_ - _)

//折叠操作
List(1,3,4,7).foldLeft(0)(_ - _)

//可以使用如下方式来表示foldLeft
(0/:List(1,3,4,7))(_ - _)

val freq = scala.collection.mutable.Map[Char,Int]()

for(c <- "Miss") freq(c)= freq.getOrElse(c,0)+1

(Map[Char,Int]()/:"Miss"){
    (m,c)=>m +(c->(m.getOrElse(c,0)+1))
}

//扫描操作
(1 to 10).scanLeft(0)(_ + _)




















