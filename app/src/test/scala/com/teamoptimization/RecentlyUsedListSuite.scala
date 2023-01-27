package com.teamoptimization

import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

/*
This is a list of items such as recently dialled numbers on your phone, or
recently opened files in an application on your computer.
• The list should be empty when initialised.
• We should be able to add things to the list.
• We should be able to retrieve items from the list.
• The most recent item should be first in the list.
• Items in the list are unique, so duplicate insertions should be moved
rather than added.
 */

@RunWith(classOf[JUnitRunner])
class RecentlyUsedListSuite extends AnyFunSuite {
  test("A new list is empty") {
    val underTest = new RecentlyUsedList
    assertTrue(underTest.isEmpty)
  }
  test("A list is non empty when an item is added") {
    val underTest = new RecentlyUsedList
    underTest.add("1234")
    assertFalse(underTest.isEmpty)
  }
  test("A list should contain added element") {
    val underTest = new RecentlyUsedList
    underTest.add("1234")
    assertEquals("1234", underTest.getLastUsed)
  }
  test("The list should hold more than one item") {
    val underTest = new RecentlyUsedList
    underTest.add("1234")
    underTest.add("4321")
    assertEquals(2, underTest.length)
  }
  test("The list should hold more than two item") {
    val underTest = new RecentlyUsedList
    underTest.add("1234")
    underTest.add("4321")
    underTest.add("5678")
    assertEquals(3, underTest.length)
  }
  test("The list should return all items stored") {
    val underTest = new RecentlyUsedList
    underTest.add("1234")
    underTest.add("4321")
    assertEquals(List("4321","1234"), underTest.getList)
  }
  test("The list should contain unique elements") {
    val underTest = new RecentlyUsedList
    underTest.add("1234")
    underTest.add("1234")
    underTest.add("4321")
    underTest.add("4321")
    assertEquals(List("4321","1234"), underTest.getList)
  }
}
