package creational.factory

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CurrencyFactoryTest{

    @Test
    fun currencyTest() {
        val greekCurrency = CurrencyFactory.currencyForCountry(Greece("")).code
        println("Greek currency: $greekCurrency")

        val usaCurrency = CurrencyFactory.currencyForCountry(USA("")).code
        println("USA currency: $usaCurrency")

        assertEquals(greekCurrency,"EUR")
        assertEquals(usaCurrency,"USD")
    }
}