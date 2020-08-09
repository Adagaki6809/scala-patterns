package structural.decorator

class VanillaCoffee(coffee: Coffee) extends Coffee {
  def cost: Int = coffee.cost + 3
  def description: String = coffee.description + ", ваниль"
}
