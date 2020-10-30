package com.example.androidunittesting

import org.junit.Assert
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito

class TestWithMockito {
    @Test
    fun test() {
        //AAA pattern
        //Arrange
        //val myObject = AdditionForMockito()

        //or

        val myObject = Mockito.mock(AdditionForMockito::class.java)

        //pre programming the object
        Mockito.`when`(myObject.add(5, 6)).thenReturn(4)

        //or


        //using member variables with annotation

        //whenever myObject.add(3,4) 6

        //Act
        val actual = myObject.add(5, 6)

        //Assert
        Assert.assertEquals(4, actual)
    }
}

open class AdditionForMockito {
    open fun add(a: Int, b: Int): Int {
        return a + b
    }


}