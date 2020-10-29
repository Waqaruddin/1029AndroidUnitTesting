package com.example.androidunittesting

import org.junit.Assert
import org.junit.Test

class TestWithPattern {

    @Test
    fun test(){
        //Arrange Act Assert (AAA) pattern

        //Arrange

        val myObj = Addition()

        //Act
        val actual = myObj.add(2,2)


        //Assert
        Assert.assertEquals(4, actual)

    }
}


class Addition{
    fun add(a:Int , b:Int):Int{
        return a + b
    }
}