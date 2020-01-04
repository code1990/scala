import java.awt.Font

import org.scalatest.FunSuite

class Chapter03CoreTest extends FunSuite {

  test("core01") {
    //定长数组
    val s = Array("Hello", "World")
    println(s.mkString(","))
    s(1) = "scala"
    //变长数组
    import scala.collection.mutable.ArrayBuffer
    var arrayBuffer = new ArrayBuffer[Int]()
    //元素追加
    arrayBuffer += 1
    arrayBuffer += (2, 3, 4, 5)
    arrayBuffer ++= Array(8, 13, 21)
    println(arrayBuffer.mkString(","))
    //元素移除
    arrayBuffer.trimEnd(2)
    //元素插入
    arrayBuffer.insert(2, 6)
    println(arrayBuffer.mkString(","))

    //变长数组语定长数组之间的互转
    val array1 = arrayBuffer.toArray
    val buffer1 = s.toBuffer
    //数组的遍历
    for (i <- 0 to arrayBuffer.size - 1) println(arrayBuffer(i))
    // 数组通过下标访问
    for (i <- 0 until array1.length)
      println(i + ": " + array1(i))
    //产生一个Range序列
    val range1 = 0 until(4, 1)
    println(range1.reverse)
    // a 遍历
    for (elem <- array1)
      println(elem)

    // a 索引
    for (i <- array1.indices)
      println(i + ": " + array1(i))

  }

  test("core02") {
    // 产生新的数组
    val a = Array(2, 3, 4, 5)
    val result = for (i <- a) yield 2 * i
    //数组转字符串
    println(result.mkString(","))
    //数组排序
    result.sorted
    //快速排序
    scala.util.Sorting.quickSort(result)
    println(result.mkString(","))
    println(result.toString)
    //统计大于0的个数
    println(result.count(_ > 0))
    import scala.collection.mutable.ArrayBuffer
    var buffer = ArrayBuffer(1, 2, 3)
    //追加
    buffer.append(1)
    //追加数组
    buffer.appendAll(ArrayBuffer(1, 2, 3))
    val result2 = Array(1)
    //    result2.copyToArray(result)
    //添加20项 使用-1填充
    result2.padTo(20, -1)
  }
  test("core03") {
    //多维数组 矩阵 3行四列
    val matrix = Array.ofDim[Double](3, 4)
    val row = 0
    val column = 2
    //赋值
    matrix(0)(2) = 18.99
    println(matrix.length)
    println(matrix(row).length)

  }
  test("core04") {
    // scala 和Java的相互操作
    import scala.collection.JavaConversions._
    import scala.collection.mutable
    import scala.collection.mutable.ArrayBuffer

    val command = ArrayBuffer("ls", "-al", "/")
    //    val pb = new ProcessBuilder(command.asJava)
    //    val cmd:mutable.Buffer[String] = pd.command().asScala
    //    assert(cmd == command)
  }
  test("core05") {
    //不可变的map "Jim" -> 10称为对偶
    val map1 = Map("Jim" -> 10, "Bob" -> 3, "lucy" -> 8)
    //可变的map
    val map2 = scala.collection.mutable.Map("Jim" -> 10, "Bob" -> 3, "lucy" -> 8)
    // 空映射
    val scores = new scala.collection.mutable.HashMap[String, Int]
    //对偶元组
    val map3 = Map(("Alice1", 11), ("Alice2", 11), ("Alice3", 11))
    //取值
    println(map1.get("Jim"))
    println(map1.getOrElse("Jim", "0"))
    // contains检测
    val fredsScore = if (scores.contains("Fred")) scores("Fred") else 0
    //设置参数值
//    map1("Jim") = 100
    //    map1("Bob")=11
    //遍历map
    for ((k, v) <- map1) println(k + "is mapped to" + v)
    //keyset集合
    val set = map1.keySet
    //遍历所有的value
    for (v <- map1.values) println(v)
    //产生新的Map
    for ((k, v) <- map1) yield (v, k)
    //排序的map
    val map4 = scala.collection.immutable.SortedMap("Alice" -> 10, "Fred" -> 11)
    //双向链表HashMap
    val months = scala.collection.mutable.LinkedHashMap("Jan" -> 1)


  }
  test("core06") {
    //map和Java的相互转换
    import scala.collection.JavaConverters._
    val ids = java.time.ZoneId.SHORT_IDS.asScala

    val props = System.getProperties.asScala
    import java.awt.font.TextAttribute._
    val attrs = Map(FAMILY -> "Serif", SIZE -> 12)
    val front = new Font(attrs.asJava)
  }
  test("core07") {
    //元祖
    val tuple = (1, 2, 3, "Fred")
    //元祖访问
    val second = tuple._2
    //元祖访问
    val first = tuple._1

    //拉链操作
    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    //zip 拉链操作
    val pairs = symbols.zip(counts)
    //遍历
    for ((s, n) <- pairs) println(s * n)
    //拉链操作 转Map
    symbols.zip(counts).toMap
  }
  test("core08") {
    import scala.collection.mutable
    //声明一个队列
    val q1 = new mutable.Queue[Int]()
    //队列追加元素
    q1 += 2
    q1 += 1
    //追加多个元素并返回队列
    q1 ++= List(2, 3)
    //返回并从队列删除第一个元素
    q1.dequeue()
    //追加多个元素 返回Unit
    q1.enqueue(5, 3, 6)
    //头
    print(q1.head)
    //尾
    print(q1.tail)

  }
  test("core09") {

    import scala.collection.mutable
    //声明一个栈
    val s = new mutable.Stack[Int]()
    //入栈
    s.push(1)
    s.push(1, 2)
    //出栈
    s.pop()
    s.push(3)
    //获取栈顶元素
    s.top
  }
  test("core10") {
    //列表
    val digists = List(4, 2)
    //右边结合操作符
    9 :: List(4, 2)

    //NIL表示空列表
    9 :: 4 :: 2 :: Nil

    //    9 :: (4 :: (2 :: Nil))
    sum(List(1, 2, 3))
    sum2(List(1, 2, 3))
    //sum求和
    List(1, 2, 3).sum
  }

  def sum(lst: List[Int]): Int = if (lst == Nil) 0 else lst.head + sum(lst.tail)

  def sum2(lst: List[Int]): Int = lst match {
    case Nil => 0
    case h :: t => h + sum(t)
  }

  test("core11") {
    //set不可重复集合
    var numberSet = Set(1, 2, 3)
    //set 追加元素
    numberSet += 5
    //set 大小
    println(numberSet.size)
    //set 减去元素
    Set(1, 2, 3) - 3
    //set 追加元素
    Set(1, 2, 3) + 1
    //遍历 set
    for (x <- Set(1, 2, 3)) println(x)

  }
  test("core12") {
    //map映射
    val names = List("Peter", "Paul", "Mary")
    //map
    names.map(_.toLowerCase) // List("PETER", "PAUL", "MARY")
    //等价于map操作
    for (n <- names) yield n.toUpperCase()
    //flatMap操作 打平
  }

  //  def ulcase(s: String) = Vector(s.toLowerCase(), s.toUpperCase)

  test("core13") {
    //部分简化操作
    List(1, 2, 3).reduceLeft(_ - _)
    List(1, 2, 3).reduceRight(_ - _)
    //折叠操作
    List(1, 2, 3, 4).foldLeft(0)(_ - _)

    val freq = scala.collection.mutable.Map[Char, Int]()

    for (c <- "Miss") freq(c) = freq.getOrElse(c, 0) + 1

    //扫描操作
    (1 to 10).scanLeft(0)(_ + _)


  }
  test("core14") {
    val prices = List(1, 2, 3)
    val quantites = List(1, 2, 3)
    prices zip quantites
    //拉链后执行map操作
    (prices zip quantites) map { p => p._1 * p._2 }
    List(1, 2, 3) zip List(1, 2, 3)
    List(1, 2, 3).zipAll(List(10, 2), 0, 2)
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
    while (iterator.hasNext) println(iterator.next())
    val iterable2 = (1 to 10).sliding(3)
    //遍历长度
    for (i <- iterable2) print(i)
    //获取长度
    println(iterable2.length)
    //iterable2 会移动指针
    println(iterable2.hasNext)
    //返回迭代器数组
    println(iterable2.toArray)
  }

  // #::返回一个流
  def numsForm(n: BigInt): Stream[BigInt] = n #:: numsForm(n + 1)

  test("core16") {
    val tenOrMore = numsForm(10)
    //尾部
    tenOrMore.tail
    //头部
    tenOrMore.head
    //最后一个元素
    tenOrMore.tail.tail.tail
    //对流执行求值运算
    val squares = numsForm(5).map(x => x * x)
    squares.take(5).force
  }

  def sq(x: Int): Stream[Int] = {
    println(x)
    x * x
  } #:: sq(x + 1)

  test("core17") {
    //view的懒执行 不是很好理解
    //view不会缓存数据，每次都要重新计算
    //    import scala.math._
    val p = (1 to 10).view.map(x => {
      println(x)
      x * x
    })
    p.take(10).mkString(",")
    val p1 = sq(0)
    p1(10)
    p1.take(10).last
  }
  test("core18") {
    //通过par关键字将集合转换为一个并行集合
    (1 to 5).par.foreach { it => println(Thread.currentThread().getName()); print("^" + it) }
    val c = (1 to 5).map(_ + 100)
    println(c)
  }
}
