package creational.prototype

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PrototypeTest {

    @Test
    fun testPrototype() {
        ShapeCache.loadCache()
        val clonedShape1 = ShapeCache.getShape("1")
        val clonedShape2 = ShapeCache.getShape("2")
        val clonedShape3 = ShapeCache.getShape("3")

        clonedShape1.draw()
        clonedShape2.draw()
        clonedShape3.draw()

        assertEquals(clonedShape1.type,"Circle")
        assertEquals(clonedShape2.type,"Square")
        assertEquals(clonedShape3.type,"Rectangle")
    }
}