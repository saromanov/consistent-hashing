import org.scalatest._
import com.consistent._

class TestConsistentHashing extends FlatSpec with Matchers {
  "ConsistentHashing" should "create new object" in {
    val hashing = new ConsistentHashing()
    val data = hashing.addNode(new Node("node1")).addNode(new Node("node2")).addNode(new Node("node3"))
    data.getData("node1").get.value should be ("node1")
    data.getData("node2").get.value should be ("node2")
    data.getData("node3").get.value should be ("node3")
    data.getData("fun").get.value should be ("node2")
  }
}