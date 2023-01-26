package com.teamoptimization

class RecentlyUsedList {

  private var item: String = null

  def add(item: String): Unit = {
    this.item = item
  }

  def size: Int = {
    if (item == null) 0 else 1
  }

  def recentlyUsedItem: String = {
    item
  }

}
