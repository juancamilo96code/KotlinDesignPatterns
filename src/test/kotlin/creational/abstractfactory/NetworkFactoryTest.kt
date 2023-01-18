package creational.abstractfactory

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NetworkFactoryTest{
    @Test
    fun dataSourceFactoryTest() {
        val datasourceFactory = DataSourceFactory.createFactory<DatabaseDataSource>()
        val dataSource = datasourceFactory.makeDataSource()
        println("Created datasource $dataSource")

        assertInstanceOf(DatabaseDataSource::class.java,dataSource)
    }
}