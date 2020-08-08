package structural

package object adapter {
  def adapterDemo(): Unit = {
    println("Шаблон Адаптер:")
    val dog = new WildDog
    val wildDogAdapter = new WildDogAdapter(dog)
    val hunter = new Hunter
    hunter.hunt(wildDogAdapter)
    println()
  }
}
