import org.junit.{Assert, Test}
@Test
class ScalaClassTest {
  @Test
  def hel:Unit = {
    //scala整合junit进行单元测试 注意必须是class
    //oject 报错
    val someValue = true
    print(111)
    assert(someValue == true)
  }
}
