package structural.composite

class TaskManager(assignees: Array[Assignee]) {
  def performTask(task: String): Unit = {
    this.assignees.foreach(assignee => {
      if (assignee.canHandleTask(task)) {
        assignee.takeTask(task)
        return
      }
    })
    throw new Exception("Невозможно выполнить задание - пожалуйста,наймите больше людей.")
  }
}
