object  ShoppingCarts:
  def getDiscountPercentage(items: List[String]): Int =
    if (items.contains("Book"))
      5
    else
      0

// val justApple = List("Apple")
// ShoppingCarts.getDiscountPercentage(justApple)

// val BookAndApple = List("Book", "Apple")
// ShoppingCarts.getDiscountPercentage(BookAndApple)