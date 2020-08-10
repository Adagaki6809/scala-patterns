package behavioral.mediator

import java.util.Date

class ChatRoom extends ChatRoomMediator {
  override def showMessage(user: User, message: String): Unit = {
    val time = new Date()
    val sender = user.name

    println(time + " [" + sender + "]: " + message)
  }
}
