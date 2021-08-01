package io.github.haopoboy.leetcode.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory

internal class RemoveDuplicatesFromSortedArrayTest {
    private val logger = LoggerFactory.getLogger(this::class.java)!!

    @Test
    fun contextLoads() {
        assertMe(intArrayOf(1, 1, 2))
    }

    private fun assertMe(inputs: IntArray = intArrayOf()) {
        val first = inputs.copyOf()
        val second = inputs.copyOf()
        val firstCount = RemoveDuplicatesFromSortedArray().run(first)
        val secondCount = RemoveDuplicatesFromSortedArray().runFromIndex1(second)

        assertThat(firstCount).isEqualTo(secondCount)
        assertThat(first).isEqualTo(second)
    }

    private fun run(inputs: IntArray = intArrayOf()) {
        logger.info("********* Start running *********")
        val returnedValue = RemoveDuplicatesFromSortedArray().run(inputs)
        logger.info("Solutions returnedValue($returnedValue) = ${inputs.toList()}")
        logger.info("********* Ended *********")
    }

    private fun runFromIndex1(inputs: IntArray = intArrayOf()) {
        logger.info("********* Start running *********")
        val returnedValue = RemoveDuplicatesFromSortedArray().runFromIndex1(inputs)
        logger.info("Solutions returnedValue($returnedValue) = ${inputs.toList()}")
        logger.info("********* Ended *********")
    }

}