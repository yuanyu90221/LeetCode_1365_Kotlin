# LeetCode_1356_Kotlin

## 題目描述

給定一個陣列 nums，寫一個 function 計算出每個元素中比目前元素值還要小的元素個數，這個回傳結果是一個陣列。

## 舉例

### Example 1

```shell
Input: nums = [8, 1, 2, 2, 3]
Output: [4, 0, 1, 1, 3]
```

### Example 2

```shell
Input: nums = [6, 5, 4, 8]
Output: [2, 1, 0, 3]
```

### Example 3

```shell
Input: nums = [7, 7, 7, 7]
Output: [0, 0, 0, 0]
```

## 解法

```kotlin
class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        return nums.map { num -> nums.filter { i -> i < num }.size
        }.toIntArray()
    }
}
```

## 參考

[ReccaChao 's leetcode 1365](https://gitpage.reccachao.net/kotlin/leetcode/1365/)