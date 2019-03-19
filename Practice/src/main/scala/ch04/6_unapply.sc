/*模式如何匹配数组、列表和元组的，这个背后的机制叫做提取器，一个
对象如果带有从对象中提取值的 unapply 和 unapplySeq 方法，apply 方法接受
构造参数，生成对象；而 unapply 方法接受对象，提取值，是一个反向操作。
到底什么时候用 unapply 什么时候用 unapplySeq，要看参数个数。
注意：如果要提取单个值，则应该返回一个目标类型的 Option，例如
Option[Int]，而不是 Option[(Int)];无参数的提取器可以用于 boolean检查。

*/
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