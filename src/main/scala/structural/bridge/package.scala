package structural

package object bridge {
  def bridgeDemo(): Unit = {
    println("Шаблон Мост:")
    val darkTheme = new DarkTheme
    val about = new About(darkTheme)
    val careers = new Careers(darkTheme)
    println(about.getContent)
    println(careers.getContent)
    println()
  }
}
