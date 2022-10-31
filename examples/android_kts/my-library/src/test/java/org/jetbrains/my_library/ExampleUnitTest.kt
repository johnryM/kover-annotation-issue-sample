package org.jetbrains.my_library

import app.cash.paparazzi.Paparazzi
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_short_text() {
        paparazzi.snapshot {
            MyComposable(name = "john", showLongText = false)
        }
    }

    @Test
    fun test_long_text() {
        paparazzi.snapshot {
            MyComposable(name = "john", showLongText = true)
        }
    }
}