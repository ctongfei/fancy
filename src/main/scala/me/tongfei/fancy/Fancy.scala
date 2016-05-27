package me.tongfei.fancy

/**
 * @author Tongfei Chen
 */
object Fancy {

  private[fancy] def wrap(c: String) = (s: String) ⇒ c + s + Ansi.reset

  val bold = wrap(Ansi.Formatting.bold)
  val dim = wrap(Ansi.Formatting.dim)
  val underlined = wrap(Ansi.Formatting.underlined)
  val blink = wrap(Ansi.Formatting.blink)
  val reverse = wrap(Ansi.Formatting.reverse)
  val hidden = wrap(Ansi.Formatting.hidden)

  val black = wrap(Ansi.Foreground.black)
  val red = wrap(Ansi.Foreground.red)
  val green = wrap(Ansi.Foreground.green)
  val yellow = wrap(Ansi.Foreground.yellow)
  val blue = wrap(Ansi.Foreground.blue)
  val magenta = wrap(Ansi.Foreground.magenta)
  val cyan = wrap(Ansi.Foreground.cyan)
  val lightGray = wrap(Ansi.Foreground.lightGray)
  val darkGray = wrap(Ansi.Foreground.darkGray)
  val lightRed = wrap(Ansi.Foreground.lightRed)
  val lightGreen = wrap(Ansi.Foreground.lightGreen)
  val lightYellow = wrap(Ansi.Foreground.lightYellow)
  val lightBlue = wrap(Ansi.Foreground.lightBlue)
  val lightMagenta = wrap(Ansi.Foreground.lightMagenta)
  val lightCyan = wrap(Ansi.Foreground.lightCyan)
  val white = wrap(Ansi.Foreground.white)
  
  val blackBg = wrap(Ansi.Background.black)
  val redBg = wrap(Ansi.Background.red)
  val greenBg = wrap(Ansi.Background.green)
  val yellowBg = wrap(Ansi.Background.yellow)
  val blueBg = wrap(Ansi.Background.blue)
  val magentaBg = wrap(Ansi.Background.magenta)
  val cyanBg = wrap(Ansi.Background.cyan)
  val lightGrayBg = wrap(Ansi.Background.lightGray)
  val darkGrayBg = wrap(Ansi.Background.darkGray)
  val lightRedBg = wrap(Ansi.Background.lightRed)
  val lightGreenBg = wrap(Ansi.Background.lightGreen)
  val lightYellowBg = wrap(Ansi.Background.lightYellow)
  val lightBlueBg = wrap(Ansi.Background.lightBlue)
  val lightMagentaBg = wrap(Ansi.Background.lightMagenta)
  val lightCyanBg = wrap(Ansi.Background.lightCyan)
  val whiteBg = wrap(Ansi.Background.white)

  def moveCursorTo(row: Int, col: Int) = print(Ansi.Cursor.goto(row, col))
  def moveCursorUp(n: Int) = print(Ansi.Cursor.up(n))
  def moveCursorDown(n: Int) = print(Ansi.Cursor.down(n))
  def moveCursorLeft(n: Int) = print(Ansi.Cursor.left(n))
  def moveCursorRight(n: Int) = print(Ansi.Cursor.right(n))

}
