package behavioural.state

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StateTest {

    @Test
    fun testState() {
        val authorizationPresenter = AuthorizationPresenter()

        authorizationPresenter.loginUser("admin")
        println(authorizationPresenter)
        assertEquals(authorizationPresenter.isAuthorized,true)
        assertEquals(authorizationPresenter.username,"admin")

        authorizationPresenter.logoutUser()
        println(authorizationPresenter)
        assertEquals(authorizationPresenter.isAuthorized,false)
        assertEquals(authorizationPresenter.username,"Unknown")
    }
}