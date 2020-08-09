package structural.proxy

class Security(door: Door) {
  def open(password: String): Unit = {
    if (this.authenticate(password))
      this.door.open()
    else
      println("Нет! Это невозможно.")
  }

  def authenticate(password: String): Boolean = {
    password == "$ecr@t"
  }

  def close(): Unit = {
    this.door.close()
  }
}
