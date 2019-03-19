/*2.6 option 类型
Scala 为单个值提供了对象的包装器，表示为那种可能存在也可能不存在
的值。他只有两个有效的子类对象，一个是 Some，表示某个值，另外一个是
None，表示为空，通过 Option 的使用，避免了使用 null、空字符串等方式来
表示缺少某个值的做法。
*/
val scores = Map("Jim"->11,"lucy"->22)
scores.get("Jim") match {
    case Some(score)=>println(score)
    case None =>println("No Score")
}

val jimScore = scores.get("Jim")
if(jimScore.isEmpty){
    println("No empty")
}else{
    println(jimScore.get)
}

println(jimScore.getOrElse("No Score"))

println(scores.getOrElse("Jim","No Score"))

for(score <- scores.get("Jim"))println(score)

scores.get("Jim").foreach(println _)