package forms

import com.raquo.laminar.api.L._

object Render {
  def render[A](question: Question[A]): HtmlElement =
    question match {
      case TextQuestion(initialValue @ _, label @ _, pHolder) =>
        input(typ := "text", placeholder := pHolder.getOrElse(""))
      case IntQuestion(initialValue @ _, label, pHolder) =>
        input(
          typ := "number",
          placeholder := pHolder.getOrElse(0).toString,
          name := label.getOrElse("")
        )
      case BooleanQuestion(initialValue @ _, label @ _) =>
        input(typ := "boolean")
      case Checkbox(label, choices) =>
        input(typ := "checkbox", name := label.getOrElse(""))
        choices.map { case (prompt, _) =>
          input(typ := "checkbox", name := prompt)
        // //   label(value := prompt)
        // <label for=prompt>prompt</label>
        }
        input(typ := "submit")
      case Product(left, right) =>
        div(h1("Hello world", color := "red"), render(left), render(right))

    }
}
