package com.example.androidunittesting

import org.junit.Test

class TestWithMockitoKotlin {
    @Test
    fun test() {
        //Arrange
        //mockitokotlin2
//        val myObject = com.nhaarman.mockitokotlin2.mock<AdditionForMockito> {
//            on { add(5,6) } doReturn 4
//        }

        //Act
        //val actual = myObject.add(5, 6)

        //Assert
        //Assert.assertEquals(4, actual)
    }
}

class AdditionForMockitoWithMockitoKotlin {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}