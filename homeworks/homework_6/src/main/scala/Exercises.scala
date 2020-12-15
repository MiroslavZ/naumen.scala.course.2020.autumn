object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    seq.reverse
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    idx match {
      case 0 => 0
      case 1 => 1
      case 2 => 1
      case _ => fibonacci4Index(idx-2)+fibonacci4Index(idx-1)
    }
  }

  def fibonacci(idx: Int): Seq[Int] = for (i <- 0 to idx) yield fibonacci4Index(i)

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String =
    text.toUpperCase.split("").map(symbol =>
      if (MORSE.contains(symbol))
        MORSE(symbol)
      else symbol).mkString(" ")


  def wordReverse(text: String): String =
    text
    .split("(?=[!. ,?])|(?<=[!. ,?])")
    .map(word => if (word.charAt(0).isUpper) {
      word.toLowerCase.reverse.capitalize
    } else word.reverse)
    .mkString("")

}
