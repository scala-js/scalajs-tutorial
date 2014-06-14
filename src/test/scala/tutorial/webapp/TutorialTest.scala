package tutorial.webapp

import utest._

import org.scalajs.jquery._

object TutorialTest extends TestSuite {

  // Initialize App
  TutorialApp.setupUI()

  def tests = Tests {
    test("HelloWorld") {
      assert(jQuery("p:contains('Hello World')").length == 1)
    }

    test("ButtonClick") {
      def messageCount =
        jQuery("p:contains('You clicked the button!')").length

      val button = jQuery("button:contains('Click me!')")
      assert(button.length == 1)
      assert(messageCount == 0)

      for (c <- 1 to 5) {
        button.click()
        assert(messageCount == c)
      }
    }
  }
}
