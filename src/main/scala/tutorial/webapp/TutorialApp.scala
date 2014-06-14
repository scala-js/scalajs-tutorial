package tutorial.webapp

import org.querki.jquery._

object TutorialApp {
  def main(args: Array[String]): Unit = {
    $(() => setupUI())
  }

  def setupUI(): Unit = {
    $("""<button type="button">Click me!</button>""")
      .click(() => addClickedMessage())
      .appendTo($("body"))
    $("body").append("<p>Hello World</p>")
  }

  def addClickedMessage(): Unit = {
    $("body").append("<p>You clicked the button!</p>")
  }
}
