package com.consistent

trait Ring{
  def addNode(node:Node): Ring
  def removeNode(title: String): Ring
  def getData(item: String): Option[Node]
}