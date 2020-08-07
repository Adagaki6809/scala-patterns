package creational.factorymethod

class DevelopmentManager extends HiringManager {
  override def makeInterviewer: Interviewer = new Developer
}
