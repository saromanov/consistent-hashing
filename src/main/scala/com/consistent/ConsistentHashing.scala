package com.consistent

class ConsistentHashing(private val nodes: List[Node]=List[Node]())  extends Ring {
  def addNode(node:Node):Ring = {
    val newnodes = (node :: nodes).sortBy(_.hashCode)
    new ConsistentHashing(newnodes)
  }
  
  def removeNode(title: String): Ring = {
    new ConsistentHashing(nodes.filter(_.value != title))
  }
  
  def getData(hash:String): Option[Node] = {
    nodes.find(_.getHash >= hash.hashCode())
  }
}