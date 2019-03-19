class Person{
    var age =0
}
val fred = new Person
//setter
fred.age =21
println(fred.age)

fred.age_=(25)
//getter
println(fred.age)
/*7.2 Getter、Setter 方法
对于 scala 类中的每一个属性，编译后，会有一个私有的字段和相应的
getter、setter 方法生成，比如：
如果属性为 age，那么 getter 方法名叫 age， setter 方法名为 age_=
你也可以重定义 getter、setter 方法

注意：1、如果字段是私有的，则 getter和 setter方法也是私有的。
2、如果字段是 val，则只有 getter方法被生成。
3、如果你不需要任何 getter或 setter，可以将字段声明为
private[this].


*/
class Person2{
    private var privateAge =0
    def age = privateAge
    def age_=(newValue:Int){
        if(newValue>privateAge)privateAge = newValue
    }
}

val fred1 = new Person2
fred1.age = 30
fred1.age = 21
println(fred1.age)

