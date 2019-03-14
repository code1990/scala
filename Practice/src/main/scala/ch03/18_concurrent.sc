(1 to 5).par.foreach{it =>println(Thread.currentThread());print("^"+it)}

(1 to 5).map(_ + 100).seq