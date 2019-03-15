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

