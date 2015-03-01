package example

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom

import service.Service

object ScalaJSExample extends js.JSApp {
  def main(): Unit = {
    val paragraph = dom.document.createElement("p")
    paragraph.innerHTML = s"<strong>It worksx ${Service.square(2)}!</strong>"
    dom.document.getElementById("playground").appendChild(paragraph)
  }
}
