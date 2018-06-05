package practice

fun manyTimesString(str: String, i: Int): String {
  return str.repeat(i)
}

data class SimpleTime(val hours: Int, val minutes: Int)