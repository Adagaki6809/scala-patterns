package structural

package object decorator {
  def decoratorDemo(): Unit = {
    println("Шаблон Декоратор:")
    var someCoffee: Coffee = new SimpleCoffee
    println(someCoffee.cost)
    println(someCoffee.description)

    someCoffee = new MilkCoffee(someCoffee)
    println(someCoffee.cost)
    println(someCoffee.description)

    someCoffee = new WhipCoffee(someCoffee)
    println(someCoffee.cost)
    println(someCoffee.description)

    someCoffee = new VanillaCoffee(someCoffee)
    println(someCoffee.cost)
    println(someCoffee.description)

    println()
  }
}
