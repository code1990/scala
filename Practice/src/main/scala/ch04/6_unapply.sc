val arr = Array(0,1)
val Array(x,y)=arr
val Array(z,_*)=arr
arr match {
    case Array(0,x)=>x
}

Array.unapplySeq(arr)

//正则表达式对象
val pattern = "([0-9]+) ([a-z]+)".r

"99 bottles" match {
    case pattern(num,item)=>(num.toInt,item)
}
//直接unapplySeq
pattern.unapplySeq("99 bottles")

//unapply提取值
object Name{
    def unapply(input: String): Option[(String,String)] ={
        val pos = input.indexOf(" ")
        if(pos==1)None
        else Some((input.substring(0,pos),input.substring(pos+1)))
    }
}

val author = "Cay Handsome"

val Name(first,last)=author

first
last

//匹配上了
Name.unapply(author)
//没有匹配上
Name.unapply("Any")

//单个提取
object Number{
    def unapply(input: String): Option[Int] ={
        try{
            Some(input.trim.toInt)
        }catch {
            case ex:NullPointerException=>None
        }
    }
}

val Number(n)="1729"

//boolean测试 判断
object isCompound{
    def unapply(input: String)= {
        println(input); !input.contains(" ")
    }
}

author match{
    case Name(first,isCompound())=>println("compound")
    case Name(first,last)=>println("sample")
}

object NameSeq{
    def unapplySeq(input: String): Option[Seq[String]] =
        if(input.trim=="")None else Some(input.trim.split("\\st"))
}
val authorseq = "Peter van der Linden"
authorseq match {
    case NameSeq(first,last)=>authorseq
    case NameSeq(first,middle,last)=>first+"_"+last
    case NameSeq(first, "van", "der", last) => "Hello Peter!"
}