package behavioural.chain_of_responsability

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ChainOfResponsibilityTest {

    @Test
    fun testChainOfResponsibility() {
        val authenticationHeader = AuthenticationHeader("123456")
        val contentTypeHeader = ContentTypeHeader("json")
        val bodyPayloadHeader = BodyPayloadHeader("Body: {\"username\" = \"john\"}")

        authenticationHeader.next = contentTypeHeader
        contentTypeHeader.next = bodyPayloadHeader

        val messageWithAuthentication = authenticationHeader.addHeader("Headers with authentication")
        println(messageWithAuthentication)

        println("-------------------------")

        val messageWithoutAuthentication = contentTypeHeader.addHeader("Headers without authentication")
        println(messageWithoutAuthentication)

        assertEquals(messageWithAuthentication,
            """
                    Headers with authentication
                    Authorization: 123456
                    ContentType: json
                    Body: {"username" = "john"}
                """.trimIndent()
        )

        assertEquals(messageWithoutAuthentication,
            """
                    Headers without authentication
                    ContentType: json
                    Body: {"username" = "john"}
                """.trimIndent()
        )
    }
}