object TipCalculator:
  def getTipPercentage(names: List[String]): Int =
    if (names.size > 5) 20
    else if (names.size > 0) 10
    else 0


// val smallGroup = List("Alice", "Bob", "Charlie")
// val largeGroup = List("Alice", "Bob", "Charlie", "Daniel", "Emily", "Frank")

// TipCalculator.getTipPercentage(List.empty)
// TipCalculator.getTipPercentage(smallGroup)
// TipCalculator.getTipPercentage(largeGroup)