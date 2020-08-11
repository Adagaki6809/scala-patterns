package structural.bridge

class Careers(theme: Theme) extends WebPage {
  protected val _theme: Theme = theme
  override def getContent: String = "Страница карьеры в " + this._theme.getColor
}
