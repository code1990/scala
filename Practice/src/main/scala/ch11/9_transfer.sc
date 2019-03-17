//class Person(name:String){
//    override def toString: String = getClass.getName+" "+name
//}
//
//class Student(name:String) extends Person(name)

//class Pair[T](val first:T,val second:T){
//    override def toString: String = "(" + first + "," + second + ")"
//}

//def makeFriends(p:Pair[Person])=
//    p.first+"and"+p.second+"are now friends"


//val studentPair = new Pair(fred,ww)

//makeFriends(studentPair)

class Pair[+T](val first:T,val second:T){
    override def toString: String = "(" + first + "," + second + ")"
}

def makeFriends(p:Pair[Person])=
    p.first+"and"+p.second+"now are friends"

trait Friend[-T]{
    def befriend(someone:T)
}

class Person(name:String) extends Friend[Person]{
    override def toString: String = getClass.getName+" "+name

    override def befriend(someone: Person): Unit = {
        this+"And "+someone+"now are friends"
    }
}

class Student(name:String) extends Person(name)

def makeFriendWith(s:Student,f:Friend[Student]){f.befriend(s)}


val fred = new Student("Fred")
val ww = new Student("ww")
val studentPair = new Pair(fred, ww)

makeFriends(studentPair) // OK

def friends (students:Array[Student],find:Function1[Student,Person])=
    for(s<-students)yield find(s)

def findFred(s:Student)= new Person("Fred")

friends(Array(new Student("susan"),new Student("barney")),findFred)