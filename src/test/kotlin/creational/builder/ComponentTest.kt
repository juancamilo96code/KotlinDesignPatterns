package creational.builder

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ComponentTest{

    @Test
    fun builderTest() {
        val component = Component.Builder()
            .setParam1("Some value")
            .setParam3(true)
            .build()
        println(component)
        println(component.param1)
        println(component.param3)

        assertEquals(component.param1,"Some value")
        assertEquals(component.param3,true)
        assertEquals(component.param2,null)

    }
}