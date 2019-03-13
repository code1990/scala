//多维数组 2行4列
val matrix = Array.ofDim[Double](2,4)

val row =0
val column = 2

matrix(0)(2)=18.99

matrix.length

matrix(row)
matrix(row).length

val triangle = new Array[Array[Int]](10)
for(i <- triangle.indices)
    triangle(i)=new Array[Int](i+1)

triangle(0)(0)=1

for(i <- 1 until triangle.length){
    triangle(i)(0)=1
    triangle(i)(i)=1
    for(j<-1 until triangle(i).length-1){
        triangle(i)(j)=triangle(i-1)(j-1)+triangle(i-1)(j)
    }
}

for(row <- triangle){
    for(elem <- row)print(elem+" ")
    println()
}

