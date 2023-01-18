package structural.adapter

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AdapterTest {

    @Test
    fun adapterTest() {
        val generator = DatabaseDataGenerator()
        val generatedData = generator.generateData()
        val adapter = DataDisplayAdapter(DataDisplay())
        val convertData = adapter.convertData(generatedData)

        assertEquals(convertData.size,3)
        assertEquals(convertData[1].index,3f)
        assertEquals(convertData[1].data,"7")
    }

}