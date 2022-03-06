class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        return nums.map { num -> nums.filter { i -> i < num }.size
        }.toIntArray()
    }
}