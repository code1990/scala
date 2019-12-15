import org.scalatest.FunSuite
//继承函数套件FunSuite
class Chapter01Test extends FunSuite {

  test("ch0101"){

    var index:Int=1
    index = index+1
    println(index)
    val PI:Double=3.14
    println(PI)
  }

  test("ch0102"){
    var str:String=1.toString
    println(str)
    var money:Double=90.11.toInt
    println(money)
  }

  test("ch0103"){
    var count:Int=1
    count+=1
    println(count)
    var x:BigInt=123456
    println(x*x*x)
  }

  test("ch0104"){
    //函数的调用
    import scala.math._
    println(sqrt(4))
    //调用static方法
    BigInt.probablePrime(100,scala.util.Random)
    //调用对象的方法
    var str:String= "Hello World"
    println(str.toLowerCase)

  }

  test("ch0105"){
    var array=Array(1,2,3)
    var array2=Array.apply(1,2,3)
    array(0)=4
    array2.update(0,4)
    println(array.toString)
    println(array2.toString)
  }

  test("ch0106"){
    var scores = Map("jim"->1,"Green"->2)
     scores.get("jim") match {
       case Some(score)=>println(score)
       case None=>println("no score")
    }
  }


}
