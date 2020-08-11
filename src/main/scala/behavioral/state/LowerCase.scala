package behavioral.state

class LowerCase extends WritingState {
  def write(words :String): Unit = {
    println(words.toLowerCase())
  }
}
