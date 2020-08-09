package structural.composite

trait Assignee {
  def canHandleTask(task: String): Boolean
  def takeTask(task: String)
}
