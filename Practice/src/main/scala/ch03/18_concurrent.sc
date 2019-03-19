/*通过 par 关键字将集合转换为一个并行集合，并行集合的类型为扩展自
ParSeq、ParSet、ParMap 特质的类型，所有特质都是 ParIterable 的子类型，
但并不是 Iterable 的子类型，所以不能将并行集合传递为预期的 Iterable、
Seq、Set 或 Map 的方法。你可以通过 ser 方法将并行集合转换回串行集合。
*/
(1 to 5).par.foreach{it =>println(Thread.currentThread());print("^"+it)}

(1 to 5).map(_ + 100).seq

/*4.20 操作符概述
1、如果想在变量名、类名等定义中用保留字，可以用反引号：
val `val` = 42
2、 这种形式叫中置操作符，A 操作符 B 等同于 A.操作符(B)
3、 后置操作符， A 操作符 等同于 A.操作符 ，如果操作符定义的时候不
带() 则调用时不能加（）
4、 前置操作符，+、-、！、~等 操作符 A 等同于 A.unary_操作符
5、 赋值操作符， A 操作符= B 等同于 A=A 操作符 B
*/