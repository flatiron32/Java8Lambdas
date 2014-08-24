package com.tomaw.chapter2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question2 {

  private static final ThreadLocal<DateTimeFormatter> dtf = 
      ThreadLocal.withInitial(() -> { return DateTimeFormatter.ofPattern("dd-MMM-yyyy"); });
  
  public static void main(String[] args) {
    System.out.println(dtf.get().hashCode());
    System.out.println(dtf.get().format(LocalDate.now()));
  }
}
