package com.teamoptimization

class RecentlyUsedList {
  private var element: String = ""

  var length = 2

  def getLastUsed: String = element

  def add(str: String): Unit = {
    element = str
  }
  def isEmpty: Boolean = element.isEmpty
}
