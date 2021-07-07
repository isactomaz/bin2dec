package com.github.isactomaz.bin2dec.utils;

import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Bin2Dec {

  public static int bin2Dec(String binary) {
    if (Pattern.compile("[^0-1]").matcher(binary).find()) {
      throw new IllegalArgumentException("Invalid Input");
    }
    Stream<String> array = Stream.of(binary.split(""));
    Stream<Integer> numbers = array.map(Integer::parseInt);
    int result = 0;
    int j = binary.length();
    for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
      int i = iterator.next();
      j--;
      result += Math.pow(2, j) * i;
    }
    return result;
  }

}
