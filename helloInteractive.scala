import scala.io.StdIn.readLine

@main def helloInteractive() =
  println("Please enter your name:")
  val name = readLine()

  println(s"Hello, $name!")

  // for v3: scala-cli run helloInteractive.scala