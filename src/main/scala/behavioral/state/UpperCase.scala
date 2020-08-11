package behavioral.state

class UpperCase extends WritingState {
  def write(words :String): Unit = {
    println(words.toUpperCase())
  }
}
