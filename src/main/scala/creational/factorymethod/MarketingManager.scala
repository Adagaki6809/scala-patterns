package creational.factorymethod

class MarketingManager extends HiringManager {
  override def makeInterviewer: Interviewer = new CommunityExecutive
}
