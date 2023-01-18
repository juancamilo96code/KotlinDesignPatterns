package structural.decorator

import org.junit.jupiter.api.Test

class DecoratorTest {

    @Test
    fun testDecorator() {
        val normalMachine = NormalCoffeeMachine()
        val enhancedMachine = EnhancedCoffeeMachine(normalMachine)

        enhancedMachine.makeSmallCoffee()
        println("------------------")
        enhancedMachine.makeLargeCoffee()
        println("------------------")
        enhancedMachine.makeMilkCoffee()
    }
}