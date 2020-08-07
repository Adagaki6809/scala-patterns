package creational.singleton

class President private(var state: Int) {
  def doSomething(): Unit = {
    state += 1
    println("Сделал что-то " + this.state + " раз(а).")
  }
}

object President {
  private var _instance: President = _
  def instance: President = {
    if (_instance == null)
      _instance = new President(0)
    _instance
  }

}
