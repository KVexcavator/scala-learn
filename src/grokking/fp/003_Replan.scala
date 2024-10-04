// принимает строку String c полным именем и возвращает сокращенную версию
def abbreviate(fullname: String): String = {
  val initial = fullname.substring(0,1);
  val separator = fullname.indexOf(' ');
  val lastName = fullname.substring(separator +1);
  initial + ". " + lastName
}

abbreviate("Alonzo Church")
abbreviate("A. Church")
abbreviate("A Church")

// добавляет в список слово
def replan(plan: List[String], newCity: String, beforeCity: String): List[String] = {
  val beforeCityIndex = plan.indexOf(beforeCity);
  val citiesBefore = plan.slice(0, beforeCityIndex);
  val citiesAfter = plan.slice(beforeCityIndex, plan.size);
  citiesBefore.appended(newCity).appendedAll(citiesAfter);
}

val testList = List("a", "b", "c", "d")

def firsTwo(list: List[String]): List[String] = {
  list.slice(0,2)
}

firsTwo(testList);
  
def lastTwo(list: List[String]): List[String] = {
  list.slice(list.size - 2, list.size)
}

lastTwo(testList)

def movedFirstTwoToTheEnd(list: List[String]): List[String] = {
  val end = list.slice(0,2);
  val start = list.slice(2, list.size)
  start.appendedAll(end)
}

movedFirstTwoToTheEnd(testList)

def insertBeforeLast(list: List[String], element: String): List[String] = {
  val start = list.slice(0, list.size -1)
  start.appended(element).appendedAll(list.slice(list.size -1, list.size))
}

insertBeforeLast(testList, "Ok")