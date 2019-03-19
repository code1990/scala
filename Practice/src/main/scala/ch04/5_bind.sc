for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0))) {
    val result = arr match {
        case Array(0)=>"0"
        case Array(x,y)=>x+"_"+y
        case Array(0,_*)=>"0..."
        case _ =>"Something else"
    }
    println(result)
}
/*集合元素通过匹配绑定到变量，这样的操作叫做“析构”。*/
//匹配列表
for (lst <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))) {
    val result = lst match {
        case 0 ::Nil =>"0"
        case x::y::Nil => x+y
        case 0::tail =>"0_"
        case _=>"something"
    }
    println(result)
}

//匹配元祖
for (pair <- Array((0, 1), (1, 0), (1, 1))) {
    pair match {
        case (0,_)=>"0.."
        case (y,0)=>y+"0"
        case _ =>"nether is 0"
    }
    println(pair)
}