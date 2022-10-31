package forms

import com.raquo.laminar.api.L._
import org.scalajs.dom

object Main {
  val appContainer: dom.Element = dom.document.querySelector("#appContainer")
  val weather = TextQuestion.apply.withLabel("What is the weather like?")
  val awesome = BooleanQuestion.apply.withLabel("Is everything awesome?")
  val question = weather.product(awesome)

  val appElement: HtmlElement =
    Render.render(question)

  def main(args: Array[String]): Unit =
    renderOnDomContentLoaded(appContainer, appElement)
}
