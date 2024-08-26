package progscala3.introscala

object UpperMain1:
  def main(params: Array[String]): Unit =
    print("UpperMain1.main: ")
    params.map(s => s.toUpperCase).foreach(s => printf("%s ",s))
    println("")

def main(params: Array[String]): Unit =
  print("main: ")
  params.map(s => s.toUpperCase).foreach(s => printf("%s ",s))
  println("")

@main def Hello(params: String*): Unit =
  print("Hello: ")
  params.map(s => s.toUpperCase).foreach(s => printf("%s ",s))
  println("")