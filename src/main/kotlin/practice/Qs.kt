package practice

fun manyTimesString(str: String, i: Int): String {
  return str.repeat(i)
}

data class SimpleTime(val hours: Int, val minutes: Int)

data class Item(val name: String, val price: Double) {
  fun cost(grocery: Boolean = false, medication: Boolean = false, taxRate: Double = 0.10): Double {
    return if (grocery || medication) {
      price
    } else {
      price * (1 + taxRate)
    }
  }
}

class ClothesWasher {
  constructor(): super() {}
  constructor(modelName: String) {}
  constructor(capacity: Double) {}
}