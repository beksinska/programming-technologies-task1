import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {

    @Test
    fun testPointsSum() {
        val p1 = Point(1.0, 1.0)
        val p2 = Point(2.0, 2.0)
        val expectedPoint = Point(3.0, 3.0)
        assertEquals(expectedPoint, p1 + p2)
    }
}