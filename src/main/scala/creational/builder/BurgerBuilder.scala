package creational.builder

class BurgerBuilder(_size: Int) {
  val size: Int = _size
  var cheese: Boolean = false
  var pepperoni : Boolean = false
  var lettuce : Boolean = false
  var tomato : Boolean = false

  def addCheese(): BurgerBuilder = {
    this.cheese = true
    this
  }
  def addPepperoni(): BurgerBuilder = {
    this.pepperoni = true
    this
  }
  def addLettuce(): BurgerBuilder = {
    this.lettuce = true
    this
  }
  def addTomato(): BurgerBuilder = {
    this.tomato = true
    this
  }
  def build: Burger = new Burger(this)
}
