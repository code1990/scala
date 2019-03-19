// 隐式转换为RichInt类型
/*2.2 常用类型
Scala 有 8 种数据类型：Byte、Char、Short、Int、Long、Float、Double
以及 Boolean。
• Boolean: true 或者 false
• Byte: 8 位, 有符号
• Short: 16 位, 有符号
• Int: 32 位, 有符号
• Long: 64 位, 有符号
• Char: 16 位, 无符号
• Float: 32 位, 单精度浮点数
• Double: 64 位, 双精度浮点数
跟 java 中的数据类型不同，Scala 并不区分基本类型和引用类型，所以这
些类型都是对象，可以调用相对应的方法。String 直接使用的是
java.lang.String. 不过，由于 String 实际是一系列 Char 的不可变的集合，
Scala 中大部分针对集合的操作，都可以用于 String，具体来说，String 的这
些方法存在于类 scala.collection.immutable.StringOps 中。 由于 String 在需要
时能隐式转换为 StringOps，因此不需要任何额外的转换，String 就可以使用
这些方法。
每一种数据类型都有对应的 Rich* 类型，如 RichInt、RichChar 等，为基
本类型提供了更多的有用操作。
由定义在 Predef 中的隐式转换完成将相应类型转换成 Rich*，然后调用
Rich*的相对应方法。【隐式转换后面会讲】
在 Scala 中通过方法进行类型转换，不像 Java 的强制类型转换。
注：Scala中没有强制转化，需要通过方法进行类型的转化。
Scala 中，所有的值都是类对象，而所有的类，包括值类型，都最终继承
自一个统一的根类型 Any。统一类型，是 Scala 的又一大特点。更特别的是，
Scala 中还定义了几个底层类（Bottom Class），比如 Null 和 Nothing。
1) Null 是所有引用类型的子类型，而 Nothing 是所有类型的子类型。Null 类
只有一个实例对象，null，类似于 Java 中的 null 引用。null 可以赋值给任
意引用类型，但是不能赋值给值类型。
2) Nothing，可以作为没有正常返回值的方法的返回类型，非常直观的告诉你
这个方法不会正常返回，而且由于 Nothing 是其他任意类型的子类，他还
能跟要求返回值的方法兼容。
3) Unit 类型用来标识过程，也就是没有明确返回值的函数。 由此可见，Unit
类似于 Java 里的 void。Unit 只有一个实例，()，这个实例也没有实质的意
义。
*/
1.toString

1.to(10)

//String隐式转换为StringOps
"Hello".intersect("World")

//类型之间的转换需要通过方法进行 没有强制转换
99.04.toInt

val i = null

