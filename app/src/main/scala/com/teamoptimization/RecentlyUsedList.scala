package com.teamoptimization

class RecentlyUsedList {

  var itemCount: Int = 0

  def add(item: String): Unit = {
    itemCount = itemCount + 1
  }

  def size: Int = {
    itemCount
  }

}
