package structural.decorator

class WhipCoffee(coffee: Coffee) extends Coffee {
  def cost: Int = coffee.cost + 5
  def description: String = coffee.description + ", сливки"
}
