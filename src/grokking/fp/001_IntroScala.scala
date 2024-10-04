def add(x: Int, y: Int): Int =
  x + y

assert(add(1,1) == 2)

def increment(x: Int): Int =
  x + 1

assert(increment(4) == 5)

def getFirstCharacter(str: String): Char = 
  if (str.length() > 0) str.charAt(0)
  else ' '

assert(getFirstCharacter("dog") == 'd')
assert(getFirstCharacter("") == ' ')

def wordScore(word: String): Int =
  word.replaceAll("a", "").length()

assert(wordScore("cat") == 2)

def getTipPercentage(names: List[String]): Int =
  if (names.size > 5) 20
  else if (names.size > 0) 10
  else 0

assert(getTipPercentage(List("Bob", "Sem")) == 10)
assert(getTipPercentage(List.empty) == 0)

  

// scala> :load src/grokking/fp/001_IntroScala.scala