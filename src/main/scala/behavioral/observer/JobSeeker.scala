package behavioral.observer

class JobSeeker(_name: String){
  def name: String = _name

  def onJobPosted(job: JobPost): Unit = {
    println("Привет " + name + "! Появилась новая работа: " + job.title)
  }
}
