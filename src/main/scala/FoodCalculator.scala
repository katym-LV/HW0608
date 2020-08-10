object FoodCalculator extends App {
  val food = "potatoes"
  val price = 0.37
  val quantity = 20
  println(s"It will cost ${price * quantity} to buy $quantity kilos of $food")
  println(s"We got ${args.length} arguments")
  println(s"First argument is ${args(0)}") //regular indexing
  println(s"Second argument is ${args(1)}") //regular indexing
  println(s"Third argument is ${args(2)}") //regular indexing
  // val cost = args(0).toFloat * args(1).toInt
  println(s"It will cost ${args(0).toFloat * args(1).toInt} to buy ${args(1)} kilos of ${args(2)}")
}
