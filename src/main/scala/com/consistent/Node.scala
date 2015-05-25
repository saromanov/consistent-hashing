package com.consistent

class Node(title:String) extends NodeLike{
  def value = title
  def getHash():Long = new JenkinsHash(title) result
}