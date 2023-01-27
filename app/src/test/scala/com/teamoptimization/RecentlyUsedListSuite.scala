package com.teamoptimization

import org.junit.Assert.{assertFalse, assertTrue}
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
  test("A list should be empty when initialised") {
    val underTest = new RecentlyUsedList
    assertTrue(underTest.isEmpty)
  }

  test("A list with one item should not be empty") {
    val underTest = new RecentlyUsedList
    underTest.add("Foo")
    assertFalse(underTest.isEmpty)
  }
}
