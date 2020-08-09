package structural

package object composite {
  def compositeDemo(): Unit = {
    println("Шаблон Компоновщик:")
    val employee1 = new Employee("Анто")
    val employee2 = new Employee("Борис")
    val employee3 = new Employee("Василий")
    val employee4 = new Employee("Григорий")
    val team1 = new Team(Array(employee3, employee4))

    // ВНИМАНИЕ: передаем команду в taskManager как единый композит.
    // Сам taskManager не знает, что это команда и работает с ней без модификации своей логики.
    val taskManager = new TaskManager(Array(team1, employee1, employee2))
    val task = "'пофиксить баги'"
    taskManager.performTask(task)
    println()
  }
}
