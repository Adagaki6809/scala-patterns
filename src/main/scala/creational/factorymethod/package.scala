package creational

package object factorymethod {
  def launchDemo: Unit = {
    val developmentManager = new DevelopmentManager
    developmentManager.takeInterview

    val marketingManager = new MarketingManager
    marketingManager.takeInterview
  }
}
