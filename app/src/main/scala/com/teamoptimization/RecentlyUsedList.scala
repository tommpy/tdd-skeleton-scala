package com.teamoptimization

class RecentlyUsedList {
  private var list: Seq[String] = Seq.empty
  def length: Int = list.size
  def getLastUsed: String = list.head
  def getList: Seq[String] = list
  def add(str: String): Unit = {
    list = list.prepended(str)
  }
  def isEmpty: Boolean = list.isEmpty
}
