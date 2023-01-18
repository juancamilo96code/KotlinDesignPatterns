package behavioural.observer

import org.junit.jupiter.api.Test

class ObserverTest {

    @Test
    fun testObserver() {
        val editor = Editor()

        val logListener = LogOpenListener("path/to/log/file.txt")
        val emailListener = EmailNotificationListener("test@test.com")

        editor.events.subscribe("open", logListener)
        editor.events.subscribe("open", emailListener)
        editor.events.subscribe("save", emailListener)

        editor.openFile("test.txt")
        editor.saveFile()
    }
}