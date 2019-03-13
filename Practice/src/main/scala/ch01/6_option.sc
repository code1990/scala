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