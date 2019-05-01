import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.{document, window}
import org.scalajs.dom.raw.HTMLElement

object MainApp extends JSApp {

  def main(): Unit = {
    println("Starting 'scala-moe'...")

    val p = document.createElement("p")
    val text = document.createTextNode("Elegant and typesafe with Scala")
    p.appendChild(text)
    document.getElementById("scala-chan").appendChild(p)
  }

  def render(hm: HTMLElement): Unit = {
    
  }

  def index =
    <div>
      <p>Elegent and typesafe</p>
    </div>

}
