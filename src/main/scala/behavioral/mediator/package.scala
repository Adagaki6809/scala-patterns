package behavioral

package object mediator {
  def mediatorDemo(): Unit = {
    println("Шаблон Посредник:")
    val mediator = new ChatRoom
    val john = new User("John Doe", mediator)
    val jane = new User("Jane Doe", mediator)

    john.send("Привет!")
    jane.send("Привет!")

    println()
  }
}
