import scala.collection.JavaConverters._

for((k,v)<-System.getProperties.asScala)println(k+"=>"+v)

//忽略异常的项目打出所有的value为null的条目
for((k,"")<-System.getProperties.asScala)println(k)

//通过守卫提取所有的v为null的属性
for((k,v)<-System.getProperties.asScala if v=="")println(k)