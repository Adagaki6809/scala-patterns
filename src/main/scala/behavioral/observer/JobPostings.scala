package behavioral.observer

import scala.collection.mutable.ArrayBuffer

class JobPostings  {
  private val observers: ArrayBuffer[JobSeeker] = ArrayBuffer[JobSeeker]()

  def notify(jobPosting: JobPost): Unit = {
    observers.foreach(x => x.onJobPosted(jobPosting))
  }

  def attach(observer: JobSeeker): Unit = {
    observers.addOne(observer)
  }

  def addJob(jobPosting: JobPost): Unit = {
    notify(jobPosting)
  }
}