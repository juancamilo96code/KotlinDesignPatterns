package creational.factory

object CurrencyFactory {
    fun currencyForCountry(country: Country): Currency =
        when(country) {
            is Spain -> Currency("EUR")
            is Greece -> Currency("EUR")
            is USA -> Currency("USD")
            is Country.Canada -> Currency("CAD")
        }
}