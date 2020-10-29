package com.example.androidunittesting

import junit.framework.Assert.assertTrue
import org.junit.After
import org.junit.Before
import org.junit.Test

class MyTest {

    @Before
    fun beforeMethod(){
        println("Before")
    }

    @After
    fun afterMethod(){
        println("After")
    }

    @Test
    fun test(){
        val m1 = 1
        val m2 = 2
        val expected = 3
        val result = m1 + m2
        assertTrue(expected == result)
    }

    @Test
    fun test2(){
        println("2")

    }
}