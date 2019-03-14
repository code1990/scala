for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0))) {
    val result = arr match {
        case Array(0)=>"0"
        case Array(x,y)=>x+"_"+y
        case Array(0,_*)=>"0..."
        case _ =>"Something else"
    }
    println(result)
}

//匹配列表
for (lst <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))) {

}