package progscala3.introscala

@main def Hello2(params: String*): Unit =
  val output = params.map(_.toUpperCase).mkString("pre ", " | ", " post")
  println(output)

// sbt:Learn Scala 3> runMain progscala3.introscala.Hello2 hello world again!