package com.teamoptimization

class RecentlyUsedList {

  var phones: List[String] = List.empty

  def add(str: String): Unit = {
    phones = phones.::(str)
  }

  def isEmpty(): Boolean = {
    phones.isEmpty
  }
}