import kotlin.test.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val sol: Solution = Solution()

    @Test
    fun smallerNumbersThanCurrentExample1() {
        assertEquals(true, intArrayOf(4, 0, 1, 1, 3).contentEquals ( sol.smallerNumbersThanCurrent(intArrayOf(8, 1, 2, 2, 3))))
    }

    @Test
    fun smallerNumbersThanCurrentExample2() {
        assertEquals(true, intArrayOf(2, 1, 0, 3).contentEquals( sol.smallerNumbersThanCurrent(intArrayOf(6, 5, 4, 8))))
    }
    @Test
    fun smallerNumbersThanCurrentExample3() {
        assertEquals(true, intArrayOf(0, 0, 0, 0).contentEquals(sol.smallerNumbersThanCurrent(intArrayOf(7, 7, 7, 7))))
    }
}