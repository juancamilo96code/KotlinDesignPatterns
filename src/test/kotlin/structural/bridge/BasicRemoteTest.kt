package structural.bridge

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BridgeTest {

    @Test
    fun testBridge() {
        val tv = TV()
        val radio = Radio()

        val tvRemote = BasicRemote(tv)
        val radioRemote = BasicRemote(radio)

        tvRemote.volumeUp()
        tvRemote.volumeUp()
        tvRemote.volumeDown()

        radioRemote.volumeUp()
        radioRemote.volumeUp()
        radioRemote.volumeUp()
        radioRemote.volumeDown()

        assertEquals(tv.volume,1)
        assertEquals(radio.volume,2)
    }
}