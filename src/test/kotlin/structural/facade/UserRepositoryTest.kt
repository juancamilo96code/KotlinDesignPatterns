package structural.facade

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FacadeTest {

    @Test
    fun testFacade() {
        val userRepo = UserRepository()
        val user = User("john")
        userRepo.save(user)

        val retrievedUser = userRepo.findFirst()

        assertEquals(retrievedUser.login,"john")
    }
}