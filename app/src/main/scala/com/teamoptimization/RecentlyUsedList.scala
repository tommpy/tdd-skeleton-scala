package com.teamoptimization

class RecentlyUsedList {
  private var somethingHasBeenAdded = false
  def add(str: String): Unit = {
    somethingHasBeenAdded = true
  }
  def isEmpty: Boolean = !somethingHasBeenAdded
}
