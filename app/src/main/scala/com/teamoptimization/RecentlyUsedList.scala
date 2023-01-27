package com.teamoptimization

class RecentlyUsedList {
  private var list: Seq[String] = Seq.empty
  def length: Int = list.size
  def getLastUsed: Option[String] = Some(list.head)
  def getList: Seq[String] = list
  def add(str: String): Unit = {
    list =  if (!list.contains(str))
              list.prepended(str)
            else
              list
  }
  def isEmpty: Boolean = list.isEmpty
}
