package com.teamoptimization

class RecentlyUsedList {
  private var element: String = ""

  var length = 0

  def getLastUsed: String = element

  def getList(): Seq[String] = Seq()

  def add(str: String): Unit = {
    length = length+1
    element = str
  }
  def isEmpty: Boolean = element.isEmpty
}
