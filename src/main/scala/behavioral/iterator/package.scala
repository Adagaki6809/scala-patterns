package behavioral

package object iterator {
  def iteratorDemo(): Unit = {
    println("Шаблон Итератор:")
    val stationList = new StationList

    // Добавление станций
    stationList.addStation(new RadioStation(89.0))
    stationList.addStation(new RadioStation(101.0))
    stationList.addStation(new RadioStation(102.0))
    stationList.addStation(new RadioStation(103.2))

    while (stationList.hasNext)
      println(stationList.next.frequency)
    stationList.rewind()

    stationList.removeStation(new RadioStation(89.0))
    println()
  }
}
