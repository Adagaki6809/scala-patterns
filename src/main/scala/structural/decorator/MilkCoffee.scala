package structural.decorator

class MilkCoffee(coffee: Coffee) extends Coffee {
  def cost: Int = coffee.cost + 2
  def description: String = coffee.description + ", молоко"
}
