import java.awt.Font

import org.scalatest.FunSuite

class Chapter03CoreTest extends FunSuite {

  test("core01") {
     val s= Array("Hello","World")
    println(s.mkString(","))
    s(1)="scala"
    import scala.collection.mutable.ArrayBuffer
    var arrayBuffer = new ArrayBuffer[Int]()
    arrayBuffer+=1
    arrayBuffer+=(2,3,4,5)
    println(arrayBuffer.mkString(","))
    arrayBuffer.trimEnd(2)
    arrayBuffer.insert(2,6)
    println(arrayBuffer.mkString(","))
    for(i<-0 to arrayBuffer.size-1)println(arrayBuffer(i))
    //互转
    val array1 = arrayBuffer.toArray
    val buffer1 = s.toBuffer

    val range1 = 0 until (4,1)
    println(range1.reverse)

  }

  test("core02") {
    val a= Array(2,3,4,5)
    val result = for (i<- a)yield 2*i
    println(result.mkString(","))
    result.sorted
    scala.util.Sorting.quickSort(result)
    println(result.mkString(","))
    println(result.toString)
    println(result.count(_ > 0))
    val result2= Array(1)
//    result2.copyToArray(result)
    //添加20项 使用-1填充
    result2.padTo(20,-1)
  }
  test("core03") {
    val matrix = Array.ofDim[Double](2,4)
    val row =0
    val column=2
    matrix(0)(2)=18.99
    println(matrix.length)
    println(matrix(row).length)

  }
  test("core04") {
    import scala.collection.JavaConversions._
    import scala.collection.mutable
    import scala.collection.mutable.ArrayBuffer

    val command = ArrayBuffer("ls","-al","/")
//    val pb = new ProcessBuilder(command.asJava)
//    val cmd:mutable.Buffer[String] = pd.command().asScala
//    assert(cmd == command)
  }
  test("core05") {
    val map1 = Map("Jim"->10,"Bob"->3,"lucy"->8)
    val map2= scala.collection.mutable.Map("Jim"->10,"Bob"->3,"lucy"->8)
    val map3 = Map(("Alice1",11),("Alice2",11),("Alice3",11))
    println(map1.get("Jim"))
    println(map1.getOrElse("Jim","0"))
//    map1("Bob")=11
    for((k,v)<-map1)println(k+"is mapped to"+ v)
    val set = map1.keySet
    for(v<-map1.values)println(v)
    for((k,v)<-map1)yield (v,k)
    val map4 = scala.collection.immutable.SortedMap("Alice"->10,"Fred"->11)
    val months = scala.collection.mutable.LinkedHashMap("Jan"->1)


  }
  test("core06") {
    import scala.collection.JavaConverters._
    val ids = java.time.ZoneId.SHORT_IDS.asScala

    val props =System.getProperties.asScala
    import  java.awt.font.TextAttribute._
    val attrs = Map(FAMILY->"Serif",SIZE->12)
    val front = new Font(attrs.asJava)
  }
  test("core07") {
    val tuple = (1,2,3,"Fred")
    val second = tuple._2
    val first = tuple._1

    //拉链操作
    val symbols = Array("<","-",">")
    val counts = Array(2,10,2)
    val pairs = symbols.zip(counts)
    for((s,n)<-pairs)println(s*n)
    symbols.zip(counts).toMap
  }
  test("core08") {
    import scala.collection.mutable
    val q1 = new mutable.Queue[Int]()
    q1+=2
    q1+=1
    //追加多个元素并返回队列
    q1 ++= List(2,3)
    //返回并从队列删除第一个元素
    q1.dequeue()
    //追加多个元素 返回Unit
    q1.enqueue(5,3,6)
    print(q1.head)
    print(q1.tail)

  }
  test("core09") {
    import scala.collection.mutable
    val s = new mutable.Stack[Int]()
    s.push(1)
    s.push(1,2)
    s.pop()
    s.push(3)
    s.top
  }
  test("core10") {
    val digists = List(4,2)
    //右边结合操作符
    9::List(4,2)

    //NIL表示空列表
    9::4::2::Nil

    9::(4::(2::Nil))
    sum(List(1,2,3))
    sum2(List(1,2,3))
    List(1,2,3).sum
  }
  def sum(lst:List[Int]):Int=if (lst==Nil) 0 else lst.head+sum(lst.tail)
  def sum2(lst:List[Int]):Int=lst match{
    case Nil=>0
    case h:: t=>h+sum(t)
  }
  test("core11") {
    var numberSet = Set(1,2,3)
    numberSet += 5
    println(numberSet.size)
    Set(1,2,3)-3
    Set(1,2,3)+1
    for(x<-Set(1,2,3))println(x)

  }
  test("core12") {
    val names = List("Peter","Paul","Mary")
    //map
    names.map(_.toLowerCase)
    for(n<-names)yield n.toUpperCase()

  }
  def ulcase(s:String)=Vector(s.toLowerCase(),s.toUpperCase)
  test("core13") {
    //部分简化操作
    List(1,2,3).reduceLeft(_ - _)
    List(1,2,3).reduceRight(_ - _)
    //折叠操作
    List(1,2,3,4).foldLeft(0)(_ - _)

    val freq = scala.collection.mutable.Map[Char,Int]()

    for(c<-"Miss")freq(c)=freq.getOrElse(c,0)+1

    //扫描操作
    (1 to 10).scanLeft(0)(_ + _)


  }
  test("core14") {
    val prices=List(1,2,3)
    val quantites = List(1,2,3)
    prices zip quantites
    //拉链后执行map操作
    (prices zip quantites) map {p=>p._1 * p._2}
    List(1,2,3) zip List(1,2,3)
    List(1,2,3).zipAll(List(10,2),0,2)
    "Scala".zipWithIndex
    "Scala".zipWithIndex.max
    "Scala".zipWithIndex.max._2
    //unzip函数可以将一个元素的列表转换成一个列表的元祖
    "scala".zipWithIndex.unzip
    "scala".zipWithIndex.unzip._1
    "scala".zipWithIndex.unzip._2
  }
  test("core15") {
    //切片操作返回一个迭代器
    val iterator = (1 to 10).sliding(3)
    while (iterator.hasNext)println(iterator.next())
    val iterable2 = (1 to 10).sliding(3)
    for (i<-iterable2)print(i)
    println(iterable2.length)
    println(iterable2.hasNext)
    println(iterable2.toArray)
  }
  def numsForm(n:BigInt):Stream[BigInt]=n #::numsForm(n+1)
  test("core16") {
    val tenOrMore = numsForm(10)
    tenOrMore.tail
    tenOrMore.head
    tenOrMore.tail.tail.tail
    val squares = numsForm(5).map(x=>x*x)
    squares.take(5).force
  }
  def sq(x:Int):Stream[Int]={println(x);x*x}#::sq(x+1)
  test("core17") {
    import scala.math._
    val p = (1 to 10).view.map(x=>{println(x);x*x})
    p.take(10).mkString(",")
    val p1= sq(0)
    p1(10)
    p1.take(10).last
  }
  test("core18") {
    (1 to 5).par.foreach{it=>println(Thread.currentThread().getName());print("^"+it)}
    val c=(1 to 5).map(_ + 100)
    println(c)
  }
}
