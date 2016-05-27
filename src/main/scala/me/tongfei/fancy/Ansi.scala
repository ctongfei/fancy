package me.tongfei.fancy

/**
 * Contains definitions of ANSI control sequences.
 * @author Tongfei Chen
 */
object Ansi {

  private[fancy] def wrap(code: Int) = "\033[" + code.toString + "m"

  val reset = "\033[0m"

  object Formatting {
    val bold          = wrap(1)
    val dim           = wrap(2)
    val underlined    = wrap(4)
    val blink         = wrap(5)
    val reverse       = wrap(7)
    val hidden        = wrap(8)
  }

  object Foreground {
    val default       = wrap(39)
    val black         = wrap(30)
    val red           = wrap(31)
    val green         = wrap(32)
    val yellow        = wrap(33)
    val blue          = wrap(34)
    val magenta       = wrap(35)
    val cyan          = wrap(36)
    val lightGray     = wrap(37)
    val darkGray      = wrap(90)
    val lightRed      = wrap(91)
    val lightGreen    = wrap(92)
    val lightYellow   = wrap(93)
    val lightBlue     = wrap(94)
    val lightMagenta  = wrap(95)
    val lightCyan     = wrap(96)
    val white         = wrap(97)
  }

  object Background {
    val default       = wrap(49)
    val black         = wrap(40)
    val red           = wrap(41)
    val green         = wrap(42)
    val yellow        = wrap(43)
    val blue          = wrap(44)
    val magenta       = wrap(45)
    val cyan          = wrap(46)
    val lightGray     = wrap(47)
    val darkGray      = wrap(100)
    val lightRed      = wrap(101)
    val lightGreen    = wrap(102)
    val lightYellow   = wrap(103)
    val lightBlue     = wrap(104)
    val lightMagenta  = wrap(105)
    val lightCyan     = wrap(106)
    val white         = wrap(107)
  }

  object Cursor {
    def goto(row: Int, col: Int) = s"\033[$row;${col}H"
    def up(n: Int) = s"\033[${n}A"
    def down(n: Int) = s"\033[${n}B"
    def right(n: Int) = s"\033[${n}C"
    def left(n: Int) = s"\033[${n}D"
    val push = "\033[s"
    val pop = "\033[u"
    val cls = "\033[2J"
  }

}
