package structural

package object proxy {
  def proxyDemo(): Unit = {
    println("Шаблон Заместитель:")
    val door = new Security(new LabDoor)
    door.open("invalid")
    door.open("$ecr@t")
    door.close()

    println()
  }
}
