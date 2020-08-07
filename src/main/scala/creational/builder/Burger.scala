package creational.builder

class Burger(builder: BurgerBuilder) {
  private var size: Int = builder.size
  private var cheese: Boolean = builder.cheese
  private var pepperoni : Boolean = builder.pepperoni
  private var lettuce : Boolean = builder.lettuce
  private var tomato : Boolean = builder.tomato
}
