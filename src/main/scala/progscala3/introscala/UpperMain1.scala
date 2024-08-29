package progscala3.introscala

// runMain progscala3.introscala.UpperMain1 Hello World!
object UpperMain1:
  def main(params: Array[String]): Unit =
    print("UpperMain1.main: ")
    params.map(s => s.toUpperCase).foreach(s => printf("%s ",s))
    println("")
// runMain progscala3.introscala.UpperMain1$package Hello World!
def main(params: Array[String]): Unit =
  print("main: ")
  params.map(s => s.toUpperCase).foreach(s => printf("%s ",s))
  println("")
// runMain progscala3.introscala.Hello Hello World!
@main def Hello(params: String*): Unit =
  print("Hello: ")
  params.map(s => s.toUpperCase).foreach(s => printf("%s ",s))
  println("")