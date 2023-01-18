package behavioural.visitor

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class VisitorTest {

    @Test
    fun testVisitor() {
        val projectAlpha = FixedPriceContract(10_000)
        val projectBeta = SupportContract(500)
        val projectGamma = TimeAndMaterialsContract(150, 10)
        val projectKappa = TimeAndMaterialsContract(50, 50)

        val project = arrayListOf(projectAlpha, projectBeta, projectGamma, projectKappa)

        val monthlyCostVisitor = MonthlyCostReportVisitor()
        val monthlyCost = project.map { it.accept(monthlyCostVisitor) }.sum()
        println("Monthly cost: $monthlyCost")
        assertEquals(monthlyCost,5333)

        val yearlyCostVisitor = YearlyCostReportVisitor()
        val yearlyCost = project.map { it.accept(yearlyCostVisitor) }.sum()
        println("Yearly cost: $yearlyCost")
        assertEquals(yearlyCost,20_000)
    }
}