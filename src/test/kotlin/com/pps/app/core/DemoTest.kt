package com.pps.app.core

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class DemoTest {

  private val demo = Demo()

  @Test
  fun test1() {
    demo.run()
    assertTrue(1 < 2)
  }
}
