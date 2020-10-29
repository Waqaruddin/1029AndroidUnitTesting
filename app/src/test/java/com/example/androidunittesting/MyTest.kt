package com.example.androidunittesting

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
        println("1")

    }

    @Test
    fun test2(){
        println("2")

    }
}