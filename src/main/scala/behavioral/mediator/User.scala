package behavioral.mediator

class User(_name: String, chatMediator: ChatRoomMediator) {
  def name: String =_name
  def send(message: String): Unit = {
    chatMediator.showMessage(this, message)
  }
}
