package com.teamoptimization

class RecentlyUsedList {

  var itemCount: Int = 0

  def add(str: String) = {
    itemCount = itemCount + 1
  }


  def size: Int = {
    itemCount
  }

}
