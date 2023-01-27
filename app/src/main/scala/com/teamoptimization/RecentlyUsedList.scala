package com.teamoptimization

class RecentlyUsedList {
  val getLastUsed = ""

  private var somethingHasBeenAdded = false
  def add(str: String): Unit = {
    somethingHasBeenAdded = true
  }
  def isEmpty: Boolean = !somethingHasBeenAdded
}
