package tutorial.webapp

import org.querki.jquery._

object TutorialApp {
  def main(args: Array[String]): Unit = {
    $(() => setupUI())
  }

  def setupUI(): Unit = {
    $("body").append("<p>Hello World</p>")
    $("#click-me-button").click(() => addClickedMessage())
  }

  def addClickedMessage(): Unit = {
    $("body").append("<p>You clicked the button!</p>")
  }
}
