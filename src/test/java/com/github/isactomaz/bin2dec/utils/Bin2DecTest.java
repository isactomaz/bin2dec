package com.github.isactomaz.bin2dec.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Bin2DecTest {

  @Test
  public void shouldBin2DecAnswer3With11() {
    assertEquals(3, Bin2Dec.bin2Dec("11"));
  }

  @Test
  public void shouldBin2DecAnswer3With011() {
    assertEquals(3, Bin2Dec.bin2Dec("00000011"));
  }

  @Test
  public void shouldBin2DecAnswer2With10() {
    assertEquals(2, Bin2Dec.bin2Dec("10"));
  }

  @Test
  public void shouldBin2DecAnswer2With010() {
    assertEquals(2, Bin2Dec.bin2Dec("00000010"));
  }

  @Test
  public void shouldBin2DecAnswer6With110() {
    assertEquals(6, Bin2Dec.bin2Dec("110"));
  }

  @Test
  public void shouldBin2DecAnswer6With0110() {
    assertEquals(6, Bin2Dec.bin2Dec("00000110"));
  }

  @Test
  public void shouldBin2DecAnswer9With1001() {
    assertEquals(9, Bin2Dec.bin2Dec("1001"));
  }

  @Test
  public void shouldBin2DecAnswer9With01001() {
    assertEquals(9, Bin2Dec.bin2Dec("00001001"));
  }

  @Test
  public void shouldBin2DecAnswer255WithBin255() {
    assertEquals(255, Bin2Dec.bin2Dec("11111111"));
  }

  @Test
  public void shouldBin2DecAnswer256WithBin256() {
    assertEquals(256, Bin2Dec.bin2Dec("100000000"));
  }

  @Test
  public void shouldBin2DecAnswerThrowsIllegalArgumentExceptionWithAbc() {
    String expectedMessage = "Invalid Input";
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
      Bin2Dec.bin2Dec("abc");
    });
    assertTrue(expectedMessage.contains(exception.getMessage()));
  }

  @Test
  public void shouldBin2DecAnswerThrowsIllegalArgumentExceptionWithABC() {
    String expectedMessage = "Invalid Input";
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
      Bin2Dec.bin2Dec("ABC");
    });
    assertTrue(expectedMessage.contains(exception.getMessage()));
  }

  @Test
  public void shouldBin2DecAnswerThrowsIllegalArgumentExceptionWith01y1() {
    String expectedMessage = "Invalid Input";
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
      Bin2Dec.bin2Dec("000001y1");
    });
    assertTrue(expectedMessage.contains(exception.getMessage()));
  }

  @Test
  public void shouldBin2DecAnswerThrowsIllegalArgumentExceptionWith1zy1() {
    String expectedMessage = "Invalid Input";
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
      Bin2Dec.bin2Dec("1zy1");
    });
    assertTrue(expectedMessage.contains(exception.getMessage()));
  }

}
