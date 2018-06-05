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

  @Test
  fun q2() {
    val t = SimpleTime(hours=5, minutes=30)
    assertEquals(t.hours, 5)
    assertEquals(t.minutes, 30)
  }
}
