package behavioral.iterator

import scala.collection.mutable.ArrayBuffer

class StationList extends CustomIterator[RadioStation] {
  protected var position: Int = 0
  protected var stations: ArrayBuffer[RadioStation] = ArrayBuffer[RadioStation]()
  override def hasNext: Boolean = {
    if (position >= stations.length)
      false
    else
      true
  }

  override def next: RadioStation = {
    val radioStation = stations(position)
    position += 1
    radioStation
  }

  def rewind(): Unit = {
    position = 0
  }

  def addStation(radioStation: RadioStation): Unit = {
    stations = stations += radioStation
  }

  def removeStation(toRemove: RadioStation): Unit = {
    stations = stations.filter (station => station.frequency != toRemove.frequency)
  }
}
