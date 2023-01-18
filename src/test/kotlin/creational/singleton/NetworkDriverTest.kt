package creational.singleton

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NetworkDriverTest{

    @Test
    fun testSingletonNetworkDriverTest(){
        println("Start")
        val networkDriver1 = NetworkDriver.log()
        val networkDriver2 = NetworkDriver.log()

        assertEquals(networkDriver1,NetworkDriver)
        assertEquals(networkDriver2,NetworkDriver)
    }
}