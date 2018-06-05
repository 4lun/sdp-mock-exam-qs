package test
import practice.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue

class PracticeTests {
  @Test fun q1() {
    val m1 = manyTimesString("abc", 3)
    assertEquals("abcabcabc", m1)
  }
}
