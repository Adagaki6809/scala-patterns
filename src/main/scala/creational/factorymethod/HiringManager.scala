package creational.factorymethod

abstract class HiringManager {
  def makeInterviewer: Interviewer
  def takeInterview(): Unit = {
    val interviewer = this.makeInterviewer
    interviewer.askQuestions()
  }
}
