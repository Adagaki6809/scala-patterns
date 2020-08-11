package structural.composite

class Team(assignees: Array[Assignee]) extends Assignee {
  //noinspection ScalaUnusedSymbol
  def add(assignee: Assignee): Unit = {}
  //noinspection ScalaUnusedSymbol
  def remove(assignee: Assignee): Unit = {}

  override def canHandleTask(task: String): Boolean = {
    println("Задание " + task + " может выполнить команда из работников.")

    this.assignees.foreach(assignee => {
      if (assignee.canHandleTask(task))
        return true
    })
    false
  }

  override def takeTask(task: String): Unit = {
    println("Задание " + task + " выполнит команда из работников.")
  }

}
