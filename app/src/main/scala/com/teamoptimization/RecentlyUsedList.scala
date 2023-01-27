package com.teamoptimization

class RecentlyUsedList {
  var length = 0

  private var element: String = ""

  def getLastUsed(): String = element

  def add(str: String): Unit = {
    element = str
  }
  def isEmpty: Boolean = element.isEmpty
}
