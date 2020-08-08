package creational

package object builder {
  def builderDemo(): Unit = {
    println("Шаблон Строитель:")
    val burger = new BurgerBuilder(14).addPepperoni.addLettuce.addTomato.build
    println(burger.toString + "\n")
  }
}