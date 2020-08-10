package behavioral.command

class RemoteControl {
  def submit(command: Command): Unit = command.execute()
}
