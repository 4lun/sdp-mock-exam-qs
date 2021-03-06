package test
import practice.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled

class PracticeTests {
  // For comparing Doubles - we don't care if they are slightly out
  // due to floating point arithmetic rounding.
  // Credit: https://github.com/fatal-exception/
  private infix fun Double.nearEnough(d2: Double) = this - d2 < 0.001

  @Test
  fun q1() {
    val m1 = manyTimesString("abc", 3)
    assertEquals("abcabcabc", m1)
  }

  @Test
  fun q2() {
    val t = SimpleTime(hours=5, minutes=30)
    assertEquals(t.hours, 5)
    assertEquals(t.minutes, 30)
  }

  @Test
  fun q3() {
    val flour = Item(name="flour", price=4.0)
    assertEquals(flour.cost(grocery=true), 4.0)
    val sunscreen = Item(name="sunscreen", price=3.0)
    assertTrue(sunscreen.cost().nearEnough(3.3))
    val tv = Item(name="television", price=500.0)
    assertTrue(tv.cost(taxRate = 0.06).nearEnough(530.0))
  }

  @Test
  fun q4() {
    try {
      ClothesWasher()
      ClothesWasher("TurboClean")
      ClothesWasher(25.0)

    } catch (exception: Exception) {
      fail<Nothing>("Fail")
    }
  }

  @Test
  fun q5() {
    val p = Person("Jane", "Smile","jane@smile.com")
    assertEquals(p.first, "Jane")
    assertEquals(p.last, "Smile")
    assertEquals(p.email, "jane@smile.com")
  }

  @Test
  fun q6() {
    assertFalse(between(70, 80, 90))
    assertTrue(between(70, 60, 90))
  }

  @Test
  fun q7() {
    assertEquals(sumIt(1, 2, 3), 6)
    assertEquals(sumIt(45, 45, 45, 60), 195)
  }

  @Test
  @Disabled("To Do")
  fun q8() {
    assertNotNull("Adapter?")
  }

  @Test
  fun q9() {
    assertNotNull("""
      Change the class keyword on the class definition to object. Then inspect
      the usage of the class in the codebase and refactor if necessary
    """)
  }
}
