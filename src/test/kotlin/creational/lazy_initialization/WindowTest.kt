package creational.lazy_initialization

import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull

class WindowTest {

    @Test
    fun windowTest() {
        val window = Window()
        window.showMessage("Hello window")
        assertNotNull(window.box)

        val window2 = Window2()
        window2.showMessage("Second window")
        assertNotNull(window2.box)
    }
}