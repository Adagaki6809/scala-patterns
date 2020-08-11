package structural.bridge

class About(theme: Theme) extends WebPage {
  protected val _theme: Theme = theme
  override def getContent: String = "Страница с информацией в " + this._theme.getColor
}
