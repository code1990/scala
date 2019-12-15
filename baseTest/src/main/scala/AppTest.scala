import org.scalatest.FunSuite

class AppTest extends FunSuite{

  test(""){
    var index:Int=18
    for (i <- 1 to index) {
      var str: String = i.toString
      if (i < 10) {
        str = "0" + i
      }
      println("test(\"core" + str + "\"){\n    \n  }")
    }
  }
}
