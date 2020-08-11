package creational

package object factorymethod {
  def factoryMethodDemo(): Unit = {
    println("Шаблон Фабричный метод:")
    val developmentManager = new DevelopmentManager
    developmentManager.takeInterview()

    val marketingManager = new MarketingManager
    marketingManager.takeInterview()
    println
  }
}
