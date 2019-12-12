import org.scalatest.FunSuite

class ScalaJunitTest extends FunSuite {

  //差集
  test("Test difference") {
    val a = Set("a", "b", "a", "c")
    val b = Set("b", "d")
    println(1111111)
    assert(a -- b === Set("a", "c"))
  }

  //交集
  test("Test intersection") {
    val a = Set("a", "b", "a", "c")
    val b = Set("b", "d")
    println(222222)
    assert(a.intersect(b) === Set("b"))
  }

  //并集
  test("Test union") {
    val a = Set("a", "b", "a", "c")
    val b = Set("b", "d")
    println(333333)
    assert(a ++ b === Set("a", "b", "c", "d"))
  }

  test("Test difference1111") {
    val a = Set("a", "b", "a", "c")
    val b = Set("b", "d")
    //应该等于Set("a","b")
    println(444444)
    assert(a -- b === Set("b", "c"))
  }
  test("test123"){
    val a =1;
    val b =3;
    println(12345)
    assert(a==b)
  }
}
