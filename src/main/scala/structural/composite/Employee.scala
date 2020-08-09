package structural.composite

class Employee(employeeName: String) extends Assignee {
  override def canHandleTask(task: String): Boolean = {
    println("Задание " + task + " может выполнить работник " + this.employeeName + ".")
    true
  }
  override def takeTask(task: String): Unit = {
    println("Задание " + task + " выполнит работник " + this.employeeName + ".")
  }
}
