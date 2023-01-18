package structural.composite

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CompositeTest {

    @Test
    fun testComposite() {
        val memory = Memory()
            .add(ROM())
            .add(RAM())
        val pc = Computer()
            .add(memory)
            .add(Processor())
            .add(HardDrive())
        println("PC price: ${pc.price}")

        assertEquals(pc.name,"PC")
        assertEquals(pc.price,1425)
    }
}