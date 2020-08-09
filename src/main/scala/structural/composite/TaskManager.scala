package structural.composite

class TaskManager(assignees: Array[Assignee]) {
  def performTask(task: String): Unit = {
    try {
      this.assignees.foreach(assignee => {
        if (assignee.canHandleTask(task)) {
          assignee.takeTask(task)
          return
        }
      })
    }
    catch {
      case e: Exception => println(e.getMessage + "Невозможно выполнить задание - пожалуйста,наймите больше людей.")
    }
  }
}
