package behavioral

package object templatemethod {
  def templateMethodDemo(): Unit = {
    println("Шаблон Шаблонный метод:")

    val androidBuilder = new AndroidBuilder()
    androidBuilder.build()
    println()

    val iosBuilder = new IosBuilder()
    iosBuilder.build()
    println()
  }
}
