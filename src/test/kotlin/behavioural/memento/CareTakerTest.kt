package behavioural.memento

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MementoTest {

    @Test
    fun testMemento() {
        val originator = Originator("initial state")
        val careTaker = CareTaker()
        careTaker.saveState(originator.createMemento())
        println("Current state is ${originator.state}")

        originator.state = "State 1"
        careTaker.saveState(originator.createMemento())
        println("Current state is ${originator.state}")

        originator.state = "State 2"
        careTaker.saveState(originator.createMemento())
        println("Current state is ${originator.state}")

        assertEquals(originator.state,"State 2")

        originator.restoreMemento(careTaker.restore(1))
        println("Current state is ${originator.state}")
        assertEquals(originator.state,"State 1")

        originator.restoreMemento(careTaker.restore(0))
        println("Current state is ${originator.state}")
        assertEquals(originator.state,"initial state")

        originator.restoreMemento(careTaker.restore(2))
        println("Current state is ${originator.state}")
        assertEquals(originator.state,"State 2")
    }
}