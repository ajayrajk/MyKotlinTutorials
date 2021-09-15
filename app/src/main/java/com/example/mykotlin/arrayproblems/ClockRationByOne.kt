package com.example.mykotlin.arrayproblems

import java.util.*

class ClockRationByOne {
    var arr = intArrayOf(1, 2, 3, 4, 5)

    // Method for rotation
    private fun rotate() {
        val x = arr[arr.size - 1]
        var i: Int = arr.size - 1
        while (i > 0) {
            arr[i] = arr[i - 1]
            i--
        }
        arr[0] = x
    }

    /* Driver program */
    fun main(args: Array<String>) {
        println("Given Array is")
        println(Arrays.toString(arr))
        rotate()
        println("Rotated Array is")
        println(Arrays.toString(arr))
    }
}