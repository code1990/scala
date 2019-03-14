val names = List("Peter","Paul","Mary")

//map映射
names.map(_.toUpperCase)

for(n<-names)yield  n.toUpperCase

def ulcase(s:String)=Vector(s.toLowerCase(),s.toUpperCase())

names.map(ulcase)

//faltMap
names.flatMap(ulcase)
names.foreach(println)
