package io.github.haopoboy.leetcode.easy

import org.slf4j.LoggerFactory

/**
 * Problem https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
class RemoveDuplicatesFromSortedArray {
    private val logger = LoggerFactory.getLogger(this::class.java)!!

    fun run(nums: IntArray): Int {
        logger.info("First we create variable 'count' for summary times of duplicates")
        var count = 0
        logger.info("Then foreach nums ${nums.toList()} with index")
        for (index in 0 until nums.size - 1) {
            val value = nums[index]
            val nextValue = nums[index + 1]
            if (value == nextValue) {
                logger.info("Foreach on index($index), duplication happened, value($value) == nextValue(${nums[index]})")
                count++
                logger.info("  So we added 1 to count(${count - 1}), count = $count")
            } else {
                logger.info("Foreach on index($index) value $value != nextValue($nextValue)")
                nums[index - count + 1] = nextValue
                logger.info("  So reassigned nums[${index - count + 1}] = $value")
            }
        }
        return nums.size - count
    }

    /**
     * See https://leetcode.com/problems/remove-duplicates-from-sorted-array/discuss/11782/Share-my-clean-C%2B%2B-code
     */
    fun runFromIndex1(nums: IntArray): Int {
        logger.info("First we create variable 'count' for summary times of duplicates")
        var count = 0
        logger.info("Then foreach nums ${nums.toList()} with index")
        for (index in 1 until nums.size) {
            val value = nums[index]
            val previousValue = nums[index - 1]
            if (value == previousValue) {
                logger.info("Foreach on index($index), duplication happened, value($value) == previousValue(${nums[index]})")
                count++
                logger.info("  So we added 1 to count(${count - 1}), count = $count")
            } else {
                logger.info("Foreach on index($index) value $value != previousValue($previousValue)")
                nums[index - count] = value
                logger.info("  So reassigned nums[${index - count}] = $value")
            }
        }
        return nums.size - count
    }
}