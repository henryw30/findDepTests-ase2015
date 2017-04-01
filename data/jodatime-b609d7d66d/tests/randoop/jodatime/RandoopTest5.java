package randoop.jodatime;

import junit.framework.*;

public class RandoopTest5 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test1"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.DateMidnight var4 = var1.minusWeeks((-1));
    org.joda.time.Duration var6 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var7 = new org.joda.time.MutableDateTime();
    var7.setWeekOfWeekyear(1);
    int var10 = var7.getRoundingMode();
    var7.addMillis(100);
    var7.setSecondOfMinute(10);
    org.joda.time.PeriodType var15 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var16 = new org.joda.time.Period((org.joda.time.ReadableDuration)var6, (org.joda.time.ReadableInstant)var7, var15);
    org.joda.time.Days var17 = var16.toStandardDays();
    org.joda.time.DurationFieldType var18 = var17.getFieldType();
    org.joda.time.DateMidnight var20 = var4.withFieldAdded(var18, 1);
    org.joda.time.chrono.JulianChronology var21 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var22 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var21);
    org.joda.time.LocalDate var23 = var22.toLocalDate();
    org.joda.time.DateMidnight var25 = var22.minusWeeks((-1));
    org.joda.time.Duration var27 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var28 = new org.joda.time.MutableDateTime();
    var28.setWeekOfWeekyear(1);
    int var31 = var28.getRoundingMode();
    var28.addMillis(100);
    var28.setSecondOfMinute(10);
    org.joda.time.PeriodType var36 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var37 = new org.joda.time.Period((org.joda.time.ReadableDuration)var27, (org.joda.time.ReadableInstant)var28, var36);
    org.joda.time.Days var38 = var37.toStandardDays();
    org.joda.time.DurationFieldType var39 = var38.getFieldType();
    org.joda.time.DateMidnight var41 = var25.withFieldAdded(var39, 1);
    org.joda.time.DateMidnight var43 = var4.withFieldAdded(var39, 13);
    java.util.GregorianCalendar var44 = var43.toGregorianCalendar();
    org.joda.time.YearMonth var45 = org.joda.time.YearMonth.fromCalendarFields((java.util.Calendar)var44);
    org.joda.time.YearMonthDay var46 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar)var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test2"); }


    org.joda.time.chrono.GJChronology var0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    java.lang.String var1 = var0.toString();
    org.joda.time.DurationField var2 = var0.eras();
    org.joda.time.DateTimeField var3 = var0.secondOfMinute();
    org.joda.time.DurationField var4 = var0.hours();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var12 = var0.getDateTimeMillis(24430, 830, 5036841, 126, 34, 16, 841);
      fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "GJChronology[UTC]"+ "'", var1.equals("GJChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test3"); }


    org.joda.time.Duration var1 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var2 = new org.joda.time.MutableDateTime();
    var2.setWeekOfWeekyear(1);
    int var5 = var2.getRoundingMode();
    var2.addMillis(100);
    var2.setSecondOfMinute(10);
    org.joda.time.PeriodType var10 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var11 = new org.joda.time.Period((org.joda.time.ReadableDuration)var1, (org.joda.time.ReadableInstant)var2, var10);
    org.joda.time.Days var12 = var11.toStandardDays();
    org.joda.time.Hours var13 = var12.toStandardHours();
    java.lang.String var14 = var13.toString();
    org.joda.time.Days var15 = var13.toStandardDays();
    org.joda.time.Minutes var16 = var15.toStandardMinutes();
    org.joda.time.Seconds var17 = var16.toStandardSeconds();
    org.joda.time.DurationFieldType var18 = var17.getFieldType();
    java.lang.String var19 = var17.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PT0H"+ "'", var14.equals("PT0H"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "PT0S"+ "'", var19.equals("PT0S"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test4"); }


    org.joda.time.DateTime var0 = org.joda.time.DateTime.now();
    org.joda.time.chrono.JulianChronology var1 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var2 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var1);
    org.joda.time.LocalDate var3 = var2.toLocalDate();
    org.joda.time.MutableDateTime var4 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var5 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var2, (org.joda.time.ReadableInstant)var4);
    org.joda.time.MutableDateTime var6 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var7 = var6.year();
    boolean var8 = var4.isBefore((org.joda.time.ReadableInstant)var6);
    org.joda.time.MutableDateTime.Property var9 = var6.minuteOfHour();
    org.joda.time.MutableDateTime.Property var10 = var6.millisOfSecond();
    org.joda.time.Chronology var11 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant)var0, (org.joda.time.ReadableInstant)var6);
    org.joda.time.chrono.JulianChronology var12 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var13 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var12);
    org.joda.time.LocalDate var14 = var13.toLocalDate();
    org.joda.time.LocalDate var16 = var14.withMonthOfYear(1);
    org.joda.time.LocalDate var18 = var16.withEra(1);
    org.joda.time.LocalDate.Property var19 = var16.yearOfCentury();
    int var20 = var16.getCenturyOfEra();
    int var21 = var16.getYearOfCentury();
    org.joda.time.DateTime var22 = var0.withFields((org.joda.time.ReadablePartial)var16);
    org.joda.time.DateTime var24 = var0.withMillis(1378944000000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.Hours var1 = org.joda.time.Hours.parseHours("1962-04-23");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test6"); }


    org.joda.time.format.DateTimeFormatter var0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTime();
    org.joda.time.format.DateTimeParser var1 = var0.getParser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test7"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.MutableDateTime var3 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var4 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var1, (org.joda.time.ReadableInstant)var3);
    org.joda.time.MutableDateTime var5 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var6 = var5.year();
    boolean var7 = var3.isBefore((org.joda.time.ReadableInstant)var5);
    org.joda.time.Duration var9 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var11 = org.joda.time.Duration.standardHours((-1L));
    boolean var12 = var9.isShorterThan((org.joda.time.ReadableDuration)var11);
    org.joda.time.Duration var14 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var16 = org.joda.time.Duration.standardHours((-1L));
    boolean var17 = var14.isShorterThan((org.joda.time.ReadableDuration)var16);
    org.joda.time.Duration var18 = var9.plus((org.joda.time.ReadableDuration)var14);
    var5.add((org.joda.time.ReadableDuration)var14);
    org.joda.time.chrono.JulianChronology var20 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var21 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var20);
    org.joda.time.LocalDate var22 = var21.toLocalDate();
    org.joda.time.MutableDateTime var23 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var24 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var21, (org.joda.time.ReadableInstant)var23);
    org.joda.time.MutableDateTime var25 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var26 = var25.year();
    boolean var27 = var23.isBefore((org.joda.time.ReadableInstant)var25);
    org.joda.time.Interval var28 = new org.joda.time.Interval((org.joda.time.ReadableInstant)var5, (org.joda.time.ReadableInstant)var25);
    org.joda.time.DateTime var29 = var5.toDateTime();
    var5.addMonths(69);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setDayOfMonth(318);
      fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test8"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.LocalDate var4 = var2.minusMonths(0);
    org.joda.time.DateTime var5 = var2.toDateTimeAtMidnight();
    org.joda.time.DateTime var7 = var5.withMillis(100L);
    int var8 = var5.getWeekyear();
    org.joda.time.LocalDateTime var9 = var5.toLocalDateTime();
    org.joda.time.LocalTime var10 = var5.toLocalTime();
    org.joda.time.DateTime var12 = var5.plusHours(2005);
    org.joda.time.chrono.JulianChronology var13 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var14 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var13);
    org.joda.time.LocalDate var15 = var14.toLocalDate();
    org.joda.time.MutableDateTime var16 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var17 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var14, (org.joda.time.ReadableInstant)var16);
    org.joda.time.chrono.JulianChronology var18 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var19 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var18);
    org.joda.time.LocalDate var20 = var19.toLocalDate();
    org.joda.time.MutableDateTime var21 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var22 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var19, (org.joda.time.ReadableInstant)var21);
    org.joda.time.MutableDateTime var23 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var24 = var23.year();
    boolean var25 = var21.isBefore((org.joda.time.ReadableInstant)var23);
    org.joda.time.Duration var27 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var29 = org.joda.time.Duration.standardHours((-1L));
    boolean var30 = var27.isShorterThan((org.joda.time.ReadableDuration)var29);
    org.joda.time.Duration var32 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var34 = org.joda.time.Duration.standardHours((-1L));
    boolean var35 = var32.isShorterThan((org.joda.time.ReadableDuration)var34);
    org.joda.time.Duration var36 = var27.plus((org.joda.time.ReadableDuration)var32);
    var23.add((org.joda.time.ReadableDuration)var32);
    org.joda.time.Seconds var38 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant)var14, (org.joda.time.ReadableInstant)var23);
    org.joda.time.Duration var39 = var38.toStandardDuration();
    org.joda.time.DateTime var40 = var12.minus((org.joda.time.ReadableDuration)var39);
    org.joda.time.TimeOfDay var41 = var40.toTimeOfDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2013);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test9"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var0);
    org.joda.time.DateTimeField var3 = var0.millisOfSecond();
    org.joda.time.chrono.EthiopicChronology var4 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var5 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var6 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var5);
    org.joda.time.LocalDate var7 = var6.toLocalDate();
    org.joda.time.LocalDate var9 = var7.minusMonths(0);
    int[] var11 = var4.get((org.joda.time.ReadablePartial)var9, 100L);
    org.joda.time.chrono.EthiopicChronology var15 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var16 = var15.hours();
    org.joda.time.LocalTime var17 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var15);
    org.joda.time.Period var18 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var15);
    org.joda.time.DateTimeField var19 = var15.millisOfSecond();
    org.joda.time.DateTimeField var20 = var15.secondOfDay();
    org.joda.time.field.SkipDateTimeField var22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var4, var20, 100);
    org.joda.time.LocalDateTime var23 = org.joda.time.LocalDateTime.now();
    int var24 = var23.getDayOfYear();
    org.joda.time.Chronology var25 = var23.getChronology();
    int var26 = var23.getYearOfCentury();
    int var27 = var22.getMaximumValue((org.joda.time.ReadablePartial)var23);
    boolean var29 = var22.isLeap(1L);
    org.joda.time.LocalDateTime var30 = org.joda.time.LocalDateTime.now();
    int var31 = var30.getDayOfYear();
    int var32 = var22.getMinimumValue((org.joda.time.ReadablePartial)var30);
    org.joda.time.DurationField var33 = var22.getDurationField();
    org.joda.time.DateTimeFieldType var34 = var22.getType();
    org.joda.time.field.OffsetDateTimeField var38 = new org.joda.time.field.OffsetDateTimeField(var3, var34, 884, 3, 948);
    boolean var39 = var38.isSupported();
    int var40 = var38.getMaximumValue();
    org.joda.time.DateTimeFieldType var41 = var38.getType();
    org.joda.time.chrono.JulianChronology var42 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var43 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var42);
    org.joda.time.LocalDate var44 = var43.toLocalDate();
    org.joda.time.MutableDateTime var45 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var46 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var43, (org.joda.time.ReadableInstant)var45);
    org.joda.time.DateTimeComparator var47 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
    org.joda.time.DateTimeFieldType var48 = var47.getUpperLimit();
    org.joda.time.MutableDateTime.Property var49 = var45.property(var48);
    org.joda.time.field.DividedDateTimeField var51 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField)var38, var48, 240);
    long var54 = var51.getDifferenceAsLong(604800000L, 1377746621805L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-5738090924L));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test10"); }


    org.joda.time.format.DateTimeFormatterBuilder var0 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var2 = var0.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var5 = var0.appendYear(23, 8);
    org.joda.time.format.DateTimeFormatterBuilder var7 = var5.appendWeekOfWeekyear(13);
    org.joda.time.format.DateTimeFormatter var8 = org.joda.time.format.ISODateTimeFormat.yearMonth();
    org.joda.time.format.DateTimeFormatterBuilder var9 = var7.append(var8);
    org.joda.time.format.DateTimePrinter var10 = var9.toPrinter();
    org.joda.time.format.DateTimeFormatterBuilder var11 = var9.appendHalfdayOfDayText();
    org.joda.time.format.DateTimeFormatterBuilder var13 = var9.appendMinuteOfHour(951);
    org.joda.time.format.DateTimeFormatterBuilder var14 = var13.appendDayOfWeekText();
    org.joda.time.LocalDateTime var15 = org.joda.time.LocalDateTime.now();
    int var16 = var15.getDayOfYear();
    org.joda.time.LocalDateTime var18 = var15.minusSeconds(2005);
    org.joda.time.Chronology var19 = var15.getChronology();
    org.joda.time.DateTimeZone var21 = org.joda.time.DateTimeZone.forOffsetMillis(759);
    org.joda.time.MutableDateTime var22 = org.joda.time.MutableDateTime.now(var21);
    org.joda.time.DateTime var23 = var15.toDateTime(var21);
    int var24 = var15.getSecondOfMinute();
    org.joda.time.DateTime var25 = var15.toDateTime();
    org.joda.time.format.DateTimeFormatterBuilder var26 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var28 = var26.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var30 = var26.appendClockhourOfHalfday(692);
    org.joda.time.chrono.JulianChronology var31 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var32 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var31);
    org.joda.time.LocalDate var33 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var31);
    org.joda.time.DateTimeField var34 = var31.millisOfSecond();
    org.joda.time.chrono.EthiopicChronology var35 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var36 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var37 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var36);
    org.joda.time.LocalDate var38 = var37.toLocalDate();
    org.joda.time.LocalDate var40 = var38.minusMonths(0);
    int[] var42 = var35.get((org.joda.time.ReadablePartial)var40, 100L);
    org.joda.time.chrono.EthiopicChronology var46 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var47 = var46.hours();
    org.joda.time.LocalTime var48 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var46);
    org.joda.time.Period var49 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var46);
    org.joda.time.DateTimeField var50 = var46.millisOfSecond();
    org.joda.time.DateTimeField var51 = var46.secondOfDay();
    org.joda.time.field.SkipDateTimeField var53 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var35, var51, 100);
    org.joda.time.LocalDateTime var54 = org.joda.time.LocalDateTime.now();
    int var55 = var54.getDayOfYear();
    org.joda.time.Chronology var56 = var54.getChronology();
    int var57 = var54.getYearOfCentury();
    int var58 = var53.getMaximumValue((org.joda.time.ReadablePartial)var54);
    boolean var60 = var53.isLeap(1L);
    org.joda.time.LocalDateTime var61 = org.joda.time.LocalDateTime.now();
    int var62 = var61.getDayOfYear();
    int var63 = var53.getMinimumValue((org.joda.time.ReadablePartial)var61);
    org.joda.time.DurationField var64 = var53.getDurationField();
    org.joda.time.DateTimeFieldType var65 = var53.getType();
    org.joda.time.field.OffsetDateTimeField var69 = new org.joda.time.field.OffsetDateTimeField(var34, var65, 884, 3, 948);
    org.joda.time.IllegalFieldValueException var72 = new org.joda.time.IllegalFieldValueException(var65, (java.lang.Number)35L, "secondOfDay");
    org.joda.time.format.DateTimeFormatterBuilder var75 = var26.appendFraction(var65, 33, (-948));
    org.joda.time.chrono.EthiopicChronology var76 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var77 = var76.minutes();
    org.joda.time.DateTimeField var78 = var76.year();
    org.joda.time.DurationField var79 = var76.hours();
    org.joda.time.field.UnsupportedDateTimeField var80 = org.joda.time.field.UnsupportedDateTimeField.getInstance(var65, var79);
    boolean var81 = var15.isSupported(var65);
    org.joda.time.format.DateTimeFormatterBuilder var84 = var14.appendDecimal(var65, 15, 44);
    org.joda.time.IllegalFieldValueException var88 = new org.joda.time.IllegalFieldValueException(var65, (java.lang.Number)529, (java.lang.Number)10, (java.lang.Number)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test11"); }


    org.joda.time.chrono.EthiopicChronology var0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = new org.joda.time.DateMidnight((org.joda.time.Chronology)var0);
    org.joda.time.MutableDateTime var2 = var1.toMutableDateTimeISO();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test12"); }


    org.joda.time.Period var1 = org.joda.time.Period.days(1);
    org.joda.time.Period var3 = var1.minusHours(0);
    org.joda.time.Seconds var4 = var1.toStandardSeconds();
    int var5 = var1.getMinutes();
    int var6 = var1.getMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test13"); }


    org.joda.time.Years var1 = org.joda.time.Years.years((-1));
    org.joda.time.PeriodType var2 = var1.getPeriodType();
    org.joda.time.Years var4 = org.joda.time.Years.years((-1));
    int var5 = var1.compareTo((org.joda.time.base.BaseSingleFieldPeriod)var4);
    org.joda.time.MutablePeriod var6 = var4.toMutablePeriod();
    org.joda.time.chrono.JulianChronology var7 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var8 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var7);
    org.joda.time.LocalDate var9 = var8.toLocalDate();
    org.joda.time.LocalDate var11 = var9.minusMonths(0);
    org.joda.time.DateTime var12 = var9.toDateTimeAtMidnight();
    org.joda.time.DateTime var14 = var12.withMillis(100L);
    org.joda.time.chrono.JulianChronology var15 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var16 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var15);
    org.joda.time.LocalDate var17 = var16.toLocalDate();
    org.joda.time.DateMidnight var19 = var16.minusWeeks((-1));
    org.joda.time.Duration var21 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var22 = new org.joda.time.MutableDateTime();
    var22.setWeekOfWeekyear(1);
    int var25 = var22.getRoundingMode();
    var22.addMillis(100);
    var22.setSecondOfMinute(10);
    org.joda.time.PeriodType var30 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var31 = new org.joda.time.Period((org.joda.time.ReadableDuration)var21, (org.joda.time.ReadableInstant)var22, var30);
    org.joda.time.Days var32 = var31.toStandardDays();
    org.joda.time.DurationFieldType var33 = var32.getFieldType();
    org.joda.time.DateMidnight var35 = var19.withFieldAdded(var33, 1);
    org.joda.time.DateMidnight.Property var36 = var19.monthOfYear();
    org.joda.time.Duration var38 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var39 = new org.joda.time.MutableDateTime();
    var39.setWeekOfWeekyear(1);
    int var42 = var39.getRoundingMode();
    var39.addMillis(100);
    var39.setSecondOfMinute(10);
    org.joda.time.PeriodType var47 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var48 = new org.joda.time.Period((org.joda.time.ReadableDuration)var38, (org.joda.time.ReadableInstant)var39, var47);
    org.joda.time.PeriodType var49 = var47.withWeeksRemoved();
    org.joda.time.Period var50 = new org.joda.time.Period((org.joda.time.ReadableInstant)var14, (org.joda.time.ReadableInstant)var19, var47);
    org.joda.time.Duration var51 = var6.toDurationTo((org.joda.time.ReadableInstant)var14);
    org.joda.time.MutablePeriod var52 = var6.toMutablePeriod();
    var52.addMillis(353);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test14"); }


    org.joda.time.LocalDateTime var0 = org.joda.time.LocalDateTime.now();
    int var1 = var0.getDayOfYear();
    org.joda.time.LocalDateTime var3 = var0.minusSeconds(2005);
    org.joda.time.Chronology var4 = var0.getChronology();
    org.joda.time.DateTimeZone var6 = org.joda.time.DateTimeZone.forOffsetMillis(759);
    org.joda.time.MutableDateTime var7 = org.joda.time.MutableDateTime.now(var6);
    org.joda.time.DateTime var8 = var0.toDateTime(var6);
    int var9 = var0.getSecondOfMinute();
    org.joda.time.LocalDateTime var11 = var0.minusHours(240);
    org.joda.time.LocalDateTime.Property var12 = var11.weekOfWeekyear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test15"); }


    org.joda.time.MutableInterval var0 = new org.joda.time.MutableInterval();
    long var1 = var0.getEndMillis();
    org.joda.time.Months var2 = org.joda.time.Months.monthsIn((org.joda.time.ReadableInterval)var0);
    org.joda.time.Months var4 = var2.plus(2013);
    org.joda.time.TimeOfDay var5 = new org.joda.time.TimeOfDay();
    int var6 = var5.size();
    org.joda.time.chrono.EthiopicChronology var8 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var9 = var8.hours();
    org.joda.time.LocalTime var10 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var8);
    org.joda.time.LocalTime var12 = var10.withMillisOfSecond(1);
    org.joda.time.LocalTime var14 = var12.minusHours((-1));
    org.joda.time.Years var15 = org.joda.time.Years.yearsBetween((org.joda.time.ReadablePartial)var5, (org.joda.time.ReadablePartial)var14);
    int var16 = var5.getMillisOfSecond();
    org.joda.time.chrono.JulianChronology var17 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.TimeOfDay var18 = var5.withChronologyRetainFields((org.joda.time.Chronology)var17);
    org.joda.time.Months var20 = org.joda.time.Months.months((-1));
    org.joda.time.Months var22 = var20.plus(100);
    int var23 = var20.size();
    org.joda.time.TimeOfDay var25 = var5.withPeriodAdded((org.joda.time.ReadablePeriod)var20, 2013);
    org.joda.time.Months var26 = var4.plus(var20);
    org.joda.time.DurationFieldType var27 = var20.getFieldType();
    org.joda.time.DurationFieldType var28 = var20.getFieldType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 984);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test16"); }


    org.joda.time.PeriodType var0 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var1 = new org.joda.time.MutablePeriod(var0);
    var1.addDays(1);
    org.joda.time.Duration var5 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var7 = org.joda.time.Duration.standardHours((-1L));
    boolean var8 = var5.isShorterThan((org.joda.time.ReadableDuration)var7);
    var1.add((org.joda.time.ReadableDuration)var7);
    org.joda.time.DateTime var10 = org.joda.time.DateTime.now();
    org.joda.time.DateTime var12 = var10.withMillis(0L);
    org.joda.time.MutablePeriod var13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)var7, (org.joda.time.ReadableInstant)var12);
    org.joda.time.Duration var15 = var7.withMillis(1377742981948L);
    org.joda.time.Days var16 = var15.toStandardDays();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test17"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var0);
    org.joda.time.DateTimeField var3 = var0.millisOfSecond();
    org.joda.time.chrono.EthiopicChronology var4 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var5 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var6 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var5);
    org.joda.time.LocalDate var7 = var6.toLocalDate();
    org.joda.time.LocalDate var9 = var7.minusMonths(0);
    int[] var11 = var4.get((org.joda.time.ReadablePartial)var9, 100L);
    org.joda.time.chrono.EthiopicChronology var15 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var16 = var15.hours();
    org.joda.time.LocalTime var17 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var15);
    org.joda.time.Period var18 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var15);
    org.joda.time.DateTimeField var19 = var15.millisOfSecond();
    org.joda.time.DateTimeField var20 = var15.secondOfDay();
    org.joda.time.field.SkipDateTimeField var22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var4, var20, 100);
    org.joda.time.LocalDateTime var23 = org.joda.time.LocalDateTime.now();
    int var24 = var23.getDayOfYear();
    org.joda.time.Chronology var25 = var23.getChronology();
    int var26 = var23.getYearOfCentury();
    int var27 = var22.getMaximumValue((org.joda.time.ReadablePartial)var23);
    boolean var29 = var22.isLeap(1L);
    org.joda.time.LocalDateTime var30 = org.joda.time.LocalDateTime.now();
    int var31 = var30.getDayOfYear();
    int var32 = var22.getMinimumValue((org.joda.time.ReadablePartial)var30);
    org.joda.time.DurationField var33 = var22.getDurationField();
    org.joda.time.DateTimeFieldType var34 = var22.getType();
    org.joda.time.field.OffsetDateTimeField var38 = new org.joda.time.field.OffsetDateTimeField(var3, var34, 884, 3, 948);
    boolean var39 = var38.isSupported();
    long var42 = var38.addWrapField(1377746594066L, 1883);
    java.lang.String var44 = var38.getAsShortText(1377742992740L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1377746594064L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "1624"+ "'", var44.equals("1624"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test18"); }


    org.joda.time.LocalDateTime var0 = org.joda.time.LocalDateTime.now();
    int var1 = var0.getDayOfYear();
    org.joda.time.Chronology var2 = var0.getChronology();
    org.joda.time.YearMonthDay var3 = new org.joda.time.YearMonthDay(var2);
    org.joda.time.YearMonthDay var5 = var3.plusYears(2013);
    org.joda.time.TimeOfDay var6 = new org.joda.time.TimeOfDay();
    int var7 = var6.size();
    org.joda.time.chrono.EthiopicChronology var9 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var10 = var9.hours();
    org.joda.time.LocalTime var11 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var9);
    org.joda.time.LocalTime var13 = var11.withMillisOfSecond(1);
    org.joda.time.LocalTime var15 = var13.minusHours((-1));
    org.joda.time.Years var16 = org.joda.time.Years.yearsBetween((org.joda.time.ReadablePartial)var6, (org.joda.time.ReadablePartial)var15);
    int var17 = var6.getMillisOfSecond();
    org.joda.time.TimeOfDay var19 = var6.minusMillis((-9));
    org.joda.time.chrono.ISOChronology var20 = org.joda.time.chrono.ISOChronology.getInstance();
    org.joda.time.tz.FixedDateTimeZone var25 = new org.joda.time.tz.FixedDateTimeZone("P0D", "hi!", 28, 228);
    int var27 = var25.getOffsetFromLocal(1377742981323L);
    org.joda.time.DateTimeZone var29 = org.joda.time.DateTimeZone.forOffsetMillis(33);
    org.joda.time.chrono.JulianChronology var30 = org.joda.time.chrono.JulianChronology.getInstance(var29);
    long var32 = var25.getMillisKeepLocal(var29, 1377746580759L);
    org.joda.time.Chronology var33 = var20.withZone(var29);
    java.util.TimeZone var34 = var29.toTimeZone();
    org.joda.time.DateTime var35 = var5.toDateTime(var19, var29);
    int var37 = var29.getOffsetFromLocal(104L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1377746580754L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 33);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test19"); }


    org.joda.time.format.DateTimeFormatter var0 = org.joda.time.format.DateTimeFormat.shortTime();
    java.util.Locale var1 = var0.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test20"); }


    org.joda.time.Instant var0 = new org.joda.time.Instant();
    org.joda.time.Instant var1 = var0.toInstant();
    org.joda.time.PeriodType var2 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var3 = new org.joda.time.MutablePeriod(var2);
    var3.addDays(1);
    org.joda.time.Duration var7 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var9 = org.joda.time.Duration.standardHours((-1L));
    boolean var10 = var7.isShorterThan((org.joda.time.ReadableDuration)var9);
    var3.add((org.joda.time.ReadableDuration)var9);
    org.joda.time.Duration var13 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var15 = org.joda.time.Duration.standardHours((-1L));
    boolean var16 = var13.isShorterThan((org.joda.time.ReadableDuration)var15);
    org.joda.time.Duration var17 = var13.toDuration();
    org.joda.time.chrono.JulianChronology var18 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var19 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var18);
    org.joda.time.LocalDate var20 = var19.toLocalDate();
    org.joda.time.MutableDateTime var21 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var22 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var19, (org.joda.time.ReadableInstant)var21);
    org.joda.time.MutableDateTime var23 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var24 = var23.year();
    boolean var25 = var21.isBefore((org.joda.time.ReadableInstant)var23);
    org.joda.time.Duration var27 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var29 = org.joda.time.Duration.standardHours((-1L));
    boolean var30 = var27.isShorterThan((org.joda.time.ReadableDuration)var29);
    org.joda.time.Duration var32 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var34 = org.joda.time.Duration.standardHours((-1L));
    boolean var35 = var32.isShorterThan((org.joda.time.ReadableDuration)var34);
    org.joda.time.Duration var36 = var27.plus((org.joda.time.ReadableDuration)var32);
    var23.add((org.joda.time.ReadableDuration)var32);
    org.joda.time.PeriodType var38 = org.joda.time.PeriodType.months();
    org.joda.time.Period var39 = new org.joda.time.Period((org.joda.time.ReadableDuration)var13, (org.joda.time.ReadableInstant)var23, var38);
    org.joda.time.Period var40 = new org.joda.time.Period((org.joda.time.ReadableInstant)var1, (org.joda.time.ReadableDuration)var9, var38);
    org.joda.time.DateTime var41 = var1.toDateTimeISO();
    org.joda.time.DateTime.Property var42 = var41.secondOfDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test21"); }


    org.joda.time.Period var9 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var11 = var9.plusYears((-1));
    org.joda.time.Years var13 = org.joda.time.Years.years((-1));
    org.joda.time.PeriodType var14 = var13.getPeriodType();
    org.joda.time.Period var15 = var9.normalizedStandard(var14);
    org.joda.time.PeriodType var16 = var14.withMillisRemoved();
    org.joda.time.MutablePeriod var17 = new org.joda.time.MutablePeriod(var14);
    org.joda.time.PeriodType var18 = var14.withYearsRemoved();
    org.joda.time.Period var19 = new org.joda.time.Period(86400000L, var18);
    org.joda.time.LocalDateTime var20 = org.joda.time.LocalDateTime.now();
    int var21 = var20.getDayOfYear();
    org.joda.time.Chronology var22 = var20.getChronology();
    org.joda.time.chrono.StrictChronology var23 = org.joda.time.chrono.StrictChronology.getInstance(var22);
    org.joda.time.chrono.JulianChronology var24 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var25 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var24);
    org.joda.time.LocalDate var26 = var25.toLocalDate();
    org.joda.time.LocalDate var28 = var26.withMonthOfYear(1);
    org.joda.time.LocalDate var30 = var26.withWeekyear(1);
    org.joda.time.LocalDate var32 = var26.withDayOfYear(1);
    org.joda.time.LocalDate var34 = var32.minusMonths(16);
    boolean var35 = var23.equals((java.lang.Object)16);
    java.lang.String var36 = var23.toString();
    org.joda.time.Period var37 = new org.joda.time.Period(1000L, 1377742982607L, var18, (org.joda.time.Chronology)var23);
    org.joda.time.PeriodType var38 = var18.withWeeksRemoved();
    org.joda.time.MutablePeriod var39 = new org.joda.time.MutablePeriod(1377746580659L, 1377746599386L, var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "StrictChronology[ISOChronology[UTC]]"+ "'", var36.equals("StrictChronology[ISOChronology[UTC]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test22"); }


    org.joda.time.PeriodType var0 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var1 = new org.joda.time.MutablePeriod(var0);
    var1.addDays(1);
    org.joda.time.Duration var5 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var7 = org.joda.time.Duration.standardHours((-1L));
    boolean var8 = var5.isShorterThan((org.joda.time.ReadableDuration)var7);
    var1.add((org.joda.time.ReadableDuration)var7);
    org.joda.time.MutableDateTime var10 = new org.joda.time.MutableDateTime();
    org.joda.time.MutablePeriod var11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)var7, (org.joda.time.ReadableInstant)var10);
    var11.clear();
    org.joda.time.PeriodType var13 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var14 = new org.joda.time.MutablePeriod(var13);
    var14.addDays(1);
    org.joda.time.Duration var18 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var20 = org.joda.time.Duration.standardHours((-1L));
    boolean var21 = var18.isShorterThan((org.joda.time.ReadableDuration)var20);
    var14.add((org.joda.time.ReadableDuration)var20);
    var11.add((org.joda.time.ReadablePeriod)var14);
    org.joda.time.chrono.JulianChronology var24 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var25 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var24);
    org.joda.time.LocalDate var26 = var25.toLocalDate();
    org.joda.time.MutableDateTime var27 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var28 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var25, (org.joda.time.ReadableInstant)var27);
    org.joda.time.MutableDateTime var29 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var30 = var29.year();
    boolean var31 = var27.isBefore((org.joda.time.ReadableInstant)var29);
    org.joda.time.Duration var33 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var35 = org.joda.time.Duration.standardHours((-1L));
    boolean var36 = var33.isShorterThan((org.joda.time.ReadableDuration)var35);
    org.joda.time.Duration var38 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var40 = org.joda.time.Duration.standardHours((-1L));
    boolean var41 = var38.isShorterThan((org.joda.time.ReadableDuration)var40);
    org.joda.time.Duration var42 = var33.plus((org.joda.time.ReadableDuration)var38);
    var29.add((org.joda.time.ReadableDuration)var38);
    org.joda.time.chrono.JulianChronology var44 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var45 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var44);
    org.joda.time.LocalDate var46 = var45.toLocalDate();
    org.joda.time.MutableDateTime var47 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var48 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var45, (org.joda.time.ReadableInstant)var47);
    org.joda.time.MutableDateTime var49 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var50 = var49.year();
    boolean var51 = var47.isBefore((org.joda.time.ReadableInstant)var49);
    org.joda.time.Interval var52 = new org.joda.time.Interval((org.joda.time.ReadableInstant)var29, (org.joda.time.ReadableInstant)var49);
    boolean var54 = var52.isAfter(10L);
    org.joda.time.MutableDateTime var55 = new org.joda.time.MutableDateTime();
    var55.setWeekOfWeekyear(1);
    org.joda.time.chrono.JulianChronology var58 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    var55.setChronology((org.joda.time.Chronology)var58);
    org.joda.time.Interval var60 = var52.withChronology((org.joda.time.Chronology)var58);
    var11.setPeriod((org.joda.time.ReadableInterval)var52);
    org.joda.time.Duration var63 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var64 = new org.joda.time.MutableDateTime();
    var64.setWeekOfWeekyear(1);
    int var67 = var64.getRoundingMode();
    var64.addMillis(100);
    var64.setSecondOfMinute(10);
    org.joda.time.PeriodType var72 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var73 = new org.joda.time.Period((org.joda.time.ReadableDuration)var63, (org.joda.time.ReadableInstant)var64, var72);
    org.joda.time.Days var74 = var73.toStandardDays();
    org.joda.time.Hours var75 = var74.toStandardHours();
    org.joda.time.Interval var76 = var52.withPeriodBeforeEnd((org.joda.time.ReadablePeriod)var74);
    org.joda.time.Months var77 = org.joda.time.Months.monthsIn((org.joda.time.ReadableInterval)var52);
    org.joda.time.DateTime var78 = var52.getStart();
    org.joda.time.DateTime var80 = var78.minusMinutes(14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test23"); }


    org.joda.time.format.DateTimeFormatterBuilder var0 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var2 = var0.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var4 = var0.appendClockhourOfHalfday(692);
    org.joda.time.format.DateTimeFormatterBuilder var5 = var4.appendTimeZoneId();
    org.joda.time.format.DateTimeFormatterBuilder var7 = var5.appendMillisOfDay(14400001);
    org.joda.time.format.DateTimeFormatterBuilder var9 = var7.appendMinuteOfHour(692);
    org.joda.time.format.DateTimeFormatterBuilder var11 = var7.appendDayOfMonth(24414959);
    org.joda.time.format.DateTimeFormatterBuilder var12 = var7.appendTimeZoneName();
    org.joda.time.format.DateTimeFormatterBuilder var14 = var7.appendDayOfWeek(571);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.format.DateTimeFormatter var1 = org.joda.time.format.DateTimeFormat.forStyle("06:47:08.290");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test25"); }


    org.joda.time.format.PeriodFormatterBuilder var0 = new org.joda.time.format.PeriodFormatterBuilder();
    org.joda.time.format.PeriodFormatterBuilder var3 = var0.appendSeparator("T07:00:08", "P121961710312T697819483414166.171");
    org.joda.time.format.PeriodFormatterBuilder var4 = var3.appendYears();
    org.joda.time.format.PeriodFormatterBuilder var6 = var4.appendSuffix("01:23:56.045");
    org.joda.time.format.PeriodFormatterBuilder var8 = var4.appendSeparatorIfFieldsBefore("years");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test26"); }


    org.joda.time.PeriodType var0 = org.joda.time.PeriodType.months();
    org.joda.time.Duration var2 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var3 = new org.joda.time.MutableDateTime();
    var3.setWeekOfWeekyear(1);
    int var6 = var3.getRoundingMode();
    var3.addMillis(100);
    var3.setSecondOfMinute(10);
    org.joda.time.PeriodType var11 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var12 = new org.joda.time.Period((org.joda.time.ReadableDuration)var2, (org.joda.time.ReadableInstant)var3, var11);
    org.joda.time.Days var13 = var12.toStandardDays();
    org.joda.time.DurationFieldType var14 = var13.getFieldType();
    int var15 = var0.indexOf(var14);
    org.joda.time.PeriodType var16 = var0.withHoursRemoved();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test27"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.DateMidnight var3 = var1.plusDays(2013);
    org.joda.time.chrono.JulianChronology var4 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var5 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var4);
    org.joda.time.LocalDate var6 = var5.toLocalDate();
    org.joda.time.DateMidnight var8 = var5.minusWeeks((-1));
    org.joda.time.Duration var10 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var11 = new org.joda.time.MutableDateTime();
    var11.setWeekOfWeekyear(1);
    int var14 = var11.getRoundingMode();
    var11.addMillis(100);
    var11.setSecondOfMinute(10);
    org.joda.time.PeriodType var19 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var20 = new org.joda.time.Period((org.joda.time.ReadableDuration)var10, (org.joda.time.ReadableInstant)var11, var19);
    org.joda.time.Days var21 = var20.toStandardDays();
    org.joda.time.DurationFieldType var22 = var21.getFieldType();
    org.joda.time.DateMidnight var24 = var8.withFieldAdded(var22, 1);
    org.joda.time.field.PreciseDurationField var26 = new org.joda.time.field.PreciseDurationField(var22, 1L);
    org.joda.time.DateMidnight var28 = var3.withFieldAdded(var22, 228);
    org.joda.time.field.PreciseDurationField var30 = new org.joda.time.field.PreciseDurationField(var22, (-9L));
    long var31 = var30.getUnitMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-9L));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test28"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.LocalDate var4 = var2.minusMonths(0);
    org.joda.time.DateTime var5 = var2.toDateTimeAtMidnight();
    org.joda.time.DateTime var7 = var5.withMillis(100L);
    org.joda.time.DateTime.Property var8 = var7.era();
    org.joda.time.TimeOfDay var9 = var7.toTimeOfDay();
    org.joda.time.TimeOfDay var11 = var9.plusSeconds(100);
    org.joda.time.Period var16 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var18 = var16.plusYears((-1));
    org.joda.time.Minutes var19 = var16.toStandardMinutes();
    org.joda.time.Minutes var21 = org.joda.time.Minutes.minutes(10);
    org.joda.time.Minutes var22 = var19.minus(var21);
    org.joda.time.DurationFieldType var23 = var22.getFieldType();
    org.joda.time.Period var28 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var30 = var28.plusYears((-1));
    org.joda.time.Minutes var31 = var28.toStandardMinutes();
    org.joda.time.Minutes var33 = org.joda.time.Minutes.minutes(10);
    org.joda.time.Minutes var34 = var31.minus(var33);
    org.joda.time.DurationFieldType var35 = var34.getFieldType();
    org.joda.time.Duration var36 = var34.toStandardDuration();
    boolean var37 = var22.isLessThan(var34);
    org.joda.time.Weeks var38 = var22.toStandardWeeks();
    org.joda.time.TimeOfDay var40 = var9.withPeriodAdded((org.joda.time.ReadablePeriod)var38, 434);
    org.joda.time.Hours var41 = var38.toStandardHours();
    org.joda.time.Weeks var42 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod)var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test29"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.LocalDate var4 = var2.minusMonths(0);
    org.joda.time.DateTime var5 = var2.toDateTimeAtMidnight();
    org.joda.time.DateTime var7 = var5.withMillis(100L);
    org.joda.time.DateTime.Property var8 = var7.era();
    org.joda.time.TimeOfDay var9 = var7.toTimeOfDay();
    org.joda.time.TimeOfDay var11 = var9.plusSeconds(100);
    org.joda.time.chrono.JulianChronology var12 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var13 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var12);
    org.joda.time.LocalDate var14 = var13.toLocalDate();
    org.joda.time.MutableDateTime var15 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var16 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var13, (org.joda.time.ReadableInstant)var15);
    org.joda.time.chrono.JulianChronology var17 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var18 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var17);
    org.joda.time.LocalDate var19 = var18.toLocalDate();
    org.joda.time.MutableDateTime var20 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var21 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var18, (org.joda.time.ReadableInstant)var20);
    org.joda.time.MutableDateTime var22 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var23 = var22.year();
    boolean var24 = var20.isBefore((org.joda.time.ReadableInstant)var22);
    org.joda.time.Duration var26 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var28 = org.joda.time.Duration.standardHours((-1L));
    boolean var29 = var26.isShorterThan((org.joda.time.ReadableDuration)var28);
    org.joda.time.Duration var31 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var33 = org.joda.time.Duration.standardHours((-1L));
    boolean var34 = var31.isShorterThan((org.joda.time.ReadableDuration)var33);
    org.joda.time.Duration var35 = var26.plus((org.joda.time.ReadableDuration)var31);
    var22.add((org.joda.time.ReadableDuration)var31);
    org.joda.time.Seconds var37 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant)var13, (org.joda.time.ReadableInstant)var22);
    org.joda.time.Duration var38 = var37.toStandardDuration();
    org.joda.time.TimeOfDay var40 = var11.withPeriodAdded((org.joda.time.ReadablePeriod)var37, 948);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.TimeOfDay var42 = var11.withMillisOfSecond(1970);
      fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test30"); }


    org.joda.time.tz.FixedDateTimeZone var4 = new org.joda.time.tz.FixedDateTimeZone("P0D", "hi!", 28, 228);
    boolean var5 = var4.isFixed();
    java.util.TimeZone var6 = var4.toTimeZone();
    boolean var7 = var4.isFixed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test31"); }


    org.joda.time.MutableInterval var0 = new org.joda.time.MutableInterval();
    long var1 = var0.getEndMillis();
    org.joda.time.Months var2 = org.joda.time.Months.monthsIn((org.joda.time.ReadableInterval)var0);
    org.joda.time.Months var4 = var2.plus(2013);
    org.joda.time.TimeOfDay var5 = new org.joda.time.TimeOfDay();
    int var6 = var5.size();
    org.joda.time.chrono.EthiopicChronology var8 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var9 = var8.hours();
    org.joda.time.LocalTime var10 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var8);
    org.joda.time.LocalTime var12 = var10.withMillisOfSecond(1);
    org.joda.time.LocalTime var14 = var12.minusHours((-1));
    org.joda.time.Years var15 = org.joda.time.Years.yearsBetween((org.joda.time.ReadablePartial)var5, (org.joda.time.ReadablePartial)var14);
    int var16 = var5.getMillisOfSecond();
    org.joda.time.chrono.JulianChronology var17 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.TimeOfDay var18 = var5.withChronologyRetainFields((org.joda.time.Chronology)var17);
    org.joda.time.Months var20 = org.joda.time.Months.months((-1));
    org.joda.time.Months var22 = var20.plus(100);
    int var23 = var20.size();
    org.joda.time.TimeOfDay var25 = var5.withPeriodAdded((org.joda.time.ReadablePeriod)var20, 2013);
    org.joda.time.Months var26 = var4.plus(var20);
    org.joda.time.DurationFieldType var27 = var20.getFieldType();
    org.joda.time.PeriodType var28 = var20.getPeriodType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 208);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test32"); }


    org.joda.time.PeriodType var0 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var1 = new org.joda.time.MutablePeriod(var0);
    var1.addDays(1);
    org.joda.time.Duration var5 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var7 = org.joda.time.Duration.standardHours((-1L));
    boolean var8 = var5.isShorterThan((org.joda.time.ReadableDuration)var7);
    var1.add((org.joda.time.ReadableDuration)var7);
    org.joda.time.MutableDateTime var10 = new org.joda.time.MutableDateTime();
    org.joda.time.MutablePeriod var11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)var7, (org.joda.time.ReadableInstant)var10);
    var11.clear();
    org.joda.time.PeriodType var13 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var14 = new org.joda.time.MutablePeriod(var13);
    var14.addDays(1);
    org.joda.time.Duration var18 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var20 = org.joda.time.Duration.standardHours((-1L));
    boolean var21 = var18.isShorterThan((org.joda.time.ReadableDuration)var20);
    var14.add((org.joda.time.ReadableDuration)var20);
    var11.add((org.joda.time.ReadablePeriod)var14);
    org.joda.time.chrono.JulianChronology var24 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var25 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var24);
    org.joda.time.LocalDate var26 = var25.toLocalDate();
    org.joda.time.MutableDateTime var27 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var28 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var25, (org.joda.time.ReadableInstant)var27);
    org.joda.time.MutableDateTime var29 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var30 = var29.year();
    boolean var31 = var27.isBefore((org.joda.time.ReadableInstant)var29);
    org.joda.time.Duration var33 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var35 = org.joda.time.Duration.standardHours((-1L));
    boolean var36 = var33.isShorterThan((org.joda.time.ReadableDuration)var35);
    org.joda.time.Duration var38 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var40 = org.joda.time.Duration.standardHours((-1L));
    boolean var41 = var38.isShorterThan((org.joda.time.ReadableDuration)var40);
    org.joda.time.Duration var42 = var33.plus((org.joda.time.ReadableDuration)var38);
    var29.add((org.joda.time.ReadableDuration)var38);
    org.joda.time.chrono.JulianChronology var44 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var45 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var44);
    org.joda.time.LocalDate var46 = var45.toLocalDate();
    org.joda.time.MutableDateTime var47 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var48 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var45, (org.joda.time.ReadableInstant)var47);
    org.joda.time.MutableDateTime var49 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var50 = var49.year();
    boolean var51 = var47.isBefore((org.joda.time.ReadableInstant)var49);
    org.joda.time.Interval var52 = new org.joda.time.Interval((org.joda.time.ReadableInstant)var29, (org.joda.time.ReadableInstant)var49);
    boolean var54 = var52.isAfter(10L);
    org.joda.time.MutableDateTime var55 = new org.joda.time.MutableDateTime();
    var55.setWeekOfWeekyear(1);
    org.joda.time.chrono.JulianChronology var58 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    var55.setChronology((org.joda.time.Chronology)var58);
    org.joda.time.Interval var60 = var52.withChronology((org.joda.time.Chronology)var58);
    var11.setPeriod((org.joda.time.ReadableInterval)var52);
    var11.addMillis((-1));
    int var64 = var11.getWeeks();
    var11.setPeriod(1377746681334L);
    var11.setMonths(759);
    java.lang.String var69 = var11.toString();
    var11.addYears(661);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "P759M2278WT3H24M41.334S"+ "'", var69.equals("P759M2278WT3H24M41.334S"));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test33"); }


    org.joda.time.chrono.EthiopicChronology var1 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var2 = var1.hours();
    org.joda.time.LocalTime var3 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var1);
    org.joda.time.LocalTime var5 = var3.withMillisOfSecond(1);
    org.joda.time.LocalTime var7 = var5.minusHours((-1));
    org.joda.time.Duration var9 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var10 = new org.joda.time.MutableDateTime();
    var10.setWeekOfWeekyear(1);
    int var13 = var10.getRoundingMode();
    var10.addMillis(100);
    var10.setSecondOfMinute(10);
    org.joda.time.PeriodType var18 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var19 = new org.joda.time.Period((org.joda.time.ReadableDuration)var9, (org.joda.time.ReadableInstant)var10, var18);
    org.joda.time.LocalTime var20 = var7.plus((org.joda.time.ReadablePeriod)var19);
    java.lang.String var22 = var20.toString("2004");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "2004"+ "'", var22.equals("2004"));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test34"); }


    org.joda.time.MutableDateTime var0 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var1 = var0.year();
    org.joda.time.YearMonth var2 = new org.joda.time.YearMonth((java.lang.Object)var0);
    org.joda.time.chrono.EthiopicChronology var6 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var7 = var6.hours();
    org.joda.time.LocalTime var8 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var6);
    org.joda.time.Period var9 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var6);
    var0.add((org.joda.time.ReadablePeriod)var9);
    org.joda.time.format.PeriodFormatter var11 = org.joda.time.format.PeriodFormat.getDefault();
    org.joda.time.chrono.JulianChronology var12 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var13 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var12);
    org.joda.time.LocalDate var14 = var13.toLocalDate();
    org.joda.time.MutableDateTime var15 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var16 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var13, (org.joda.time.ReadableInstant)var15);
    org.joda.time.chrono.JulianChronology var17 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var18 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var17);
    org.joda.time.LocalDate var19 = var18.toLocalDate();
    org.joda.time.MutableDateTime var20 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var21 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var18, (org.joda.time.ReadableInstant)var20);
    org.joda.time.MutableDateTime var22 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var23 = var22.year();
    boolean var24 = var20.isBefore((org.joda.time.ReadableInstant)var22);
    org.joda.time.Duration var26 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var28 = org.joda.time.Duration.standardHours((-1L));
    boolean var29 = var26.isShorterThan((org.joda.time.ReadableDuration)var28);
    org.joda.time.Duration var31 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var33 = org.joda.time.Duration.standardHours((-1L));
    boolean var34 = var31.isShorterThan((org.joda.time.ReadableDuration)var33);
    org.joda.time.Duration var35 = var26.plus((org.joda.time.ReadableDuration)var31);
    var22.add((org.joda.time.ReadableDuration)var31);
    org.joda.time.Seconds var37 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant)var13, (org.joda.time.ReadableInstant)var22);
    org.joda.time.Seconds var39 = var37.plus(2005);
    org.joda.time.Minutes var40 = var37.toStandardMinutes();
    java.lang.String var41 = var11.print((org.joda.time.ReadablePeriod)var37);
    java.lang.String var42 = var9.toString(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "1441 seconds"+ "'", var41.equals("1441 seconds"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "-2 milliseconds"+ "'", var42.equals("-2 milliseconds"));

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test35"); }


    org.joda.time.chrono.EthiopicChronology var0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DateTimeField var1 = var0.dayOfYear();
    org.joda.time.YearMonthDay var2 = new org.joda.time.YearMonthDay((org.joda.time.Chronology)var0);
    int var3 = var2.getDayOfMonth();
    int var4 = var2.getDayOfMonth();
    org.joda.time.tz.FixedDateTimeZone var9 = new org.joda.time.tz.FixedDateTimeZone("PT0H", "ISOChronology[UTC]", 100, 13);
    org.joda.time.PeriodType var10 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var11 = new org.joda.time.MutablePeriod(var10);
    var11.addDays(1);
    org.joda.time.Duration var15 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var17 = org.joda.time.Duration.standardHours((-1L));
    boolean var18 = var15.isShorterThan((org.joda.time.ReadableDuration)var17);
    var11.add((org.joda.time.ReadableDuration)var17);
    org.joda.time.MutableDateTime var20 = new org.joda.time.MutableDateTime();
    org.joda.time.MutablePeriod var21 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)var17, (org.joda.time.ReadableInstant)var20);
    var21.clear();
    org.joda.time.MutableDateTime var23 = new org.joda.time.MutableDateTime();
    org.joda.time.chrono.JulianChronology var24 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var25 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var24);
    org.joda.time.LocalDate var26 = var25.toLocalDate();
    org.joda.time.MutableDateTime var27 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var28 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var25, (org.joda.time.ReadableInstant)var27);
    org.joda.time.MutableDateTime var29 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var30 = var29.year();
    boolean var31 = var27.isBefore((org.joda.time.ReadableInstant)var29);
    org.joda.time.Duration var33 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var35 = org.joda.time.Duration.standardHours((-1L));
    boolean var36 = var33.isShorterThan((org.joda.time.ReadableDuration)var35);
    org.joda.time.Duration var38 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var40 = org.joda.time.Duration.standardHours((-1L));
    boolean var41 = var38.isShorterThan((org.joda.time.ReadableDuration)var40);
    org.joda.time.Duration var42 = var33.plus((org.joda.time.ReadableDuration)var38);
    var29.add((org.joda.time.ReadableDuration)var38);
    org.joda.time.MutableDateTime.Property var44 = var29.dayOfWeek();
    var21.setPeriod((org.joda.time.ReadableInstant)var23, (org.joda.time.ReadableInstant)var29);
    boolean var46 = var9.equals((java.lang.Object)var21);
    boolean var47 = var9.isFixed();
    boolean var48 = var9.isFixed();
    org.joda.time.DateTime var49 = var2.toDateTimeAtMidnight((org.joda.time.DateTimeZone)var9);
    org.joda.time.DateMidnight var50 = new org.joda.time.DateMidnight((org.joda.time.DateTimeZone)var9);
    org.joda.time.MutableDateTime var51 = org.joda.time.MutableDateTime.now((org.joda.time.DateTimeZone)var9);
    long var54 = var9.convertLocalToUTC(1377746580759L, true);
    org.joda.time.LocalDateTime var55 = org.joda.time.LocalDateTime.now((org.joda.time.DateTimeZone)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1377746580659L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test36"); }


    org.joda.time.chrono.EthiopicChronology var0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DateTimeField var1 = var0.dayOfYear();
    org.joda.time.YearMonthDay var2 = new org.joda.time.YearMonthDay((org.joda.time.Chronology)var0);
    org.joda.time.YearMonthDay var4 = var2.plusDays((-1));
    org.joda.time.DateTime var5 = var4.toDateTimeAtCurrentTime();
    org.joda.time.YearMonthDay var7 = var4.minusYears(7);
    org.joda.time.DateMidnight var8 = var7.toDateMidnight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test37"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.DateMidnight var4 = var1.minusWeeks((-1));
    org.joda.time.Duration var6 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var7 = new org.joda.time.MutableDateTime();
    var7.setWeekOfWeekyear(1);
    int var10 = var7.getRoundingMode();
    var7.addMillis(100);
    var7.setSecondOfMinute(10);
    org.joda.time.PeriodType var15 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var16 = new org.joda.time.Period((org.joda.time.ReadableDuration)var6, (org.joda.time.ReadableInstant)var7, var15);
    org.joda.time.Days var17 = var16.toStandardDays();
    org.joda.time.DurationFieldType var18 = var17.getFieldType();
    org.joda.time.DateMidnight var20 = var4.withFieldAdded(var18, 1);
    org.joda.time.field.PreciseDurationField var22 = new org.joda.time.field.PreciseDurationField(var18, 1L);
    org.joda.time.chrono.JulianChronology var23 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var24 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var23);
    org.joda.time.LocalDate var25 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var23);
    org.joda.time.DurationField var26 = var23.hours();
    int var27 = var22.compareTo(var26);
    org.joda.time.format.DateTimeFormatterBuilder var28 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var30 = var28.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var33 = var28.appendYear(23, 8);
    org.joda.time.format.DateTimeFormatterBuilder var36 = var33.appendFractionOfSecond(21, 51);
    org.joda.time.format.DateTimeFormatterBuilder var38 = var36.appendTwoDigitWeekyear(9);
    boolean var39 = var22.equals((java.lang.Object)var36);
    org.joda.time.format.DateTimeFormatterBuilder var40 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var43 = var40.appendCenturyOfEra(35, 10);
    org.joda.time.format.DateTimeFormatterBuilder var44 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var46 = var44.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var48 = var44.appendClockhourOfHalfday(692);
    org.joda.time.chrono.JulianChronology var49 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var50 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var49);
    org.joda.time.LocalDate var51 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var49);
    org.joda.time.DateTimeField var52 = var49.millisOfSecond();
    org.joda.time.chrono.EthiopicChronology var53 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var54 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var55 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var54);
    org.joda.time.LocalDate var56 = var55.toLocalDate();
    org.joda.time.LocalDate var58 = var56.minusMonths(0);
    int[] var60 = var53.get((org.joda.time.ReadablePartial)var58, 100L);
    org.joda.time.chrono.EthiopicChronology var64 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var65 = var64.hours();
    org.joda.time.LocalTime var66 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var64);
    org.joda.time.Period var67 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var64);
    org.joda.time.DateTimeField var68 = var64.millisOfSecond();
    org.joda.time.DateTimeField var69 = var64.secondOfDay();
    org.joda.time.field.SkipDateTimeField var71 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var53, var69, 100);
    org.joda.time.LocalDateTime var72 = org.joda.time.LocalDateTime.now();
    int var73 = var72.getDayOfYear();
    org.joda.time.Chronology var74 = var72.getChronology();
    int var75 = var72.getYearOfCentury();
    int var76 = var71.getMaximumValue((org.joda.time.ReadablePartial)var72);
    boolean var78 = var71.isLeap(1L);
    org.joda.time.LocalDateTime var79 = org.joda.time.LocalDateTime.now();
    int var80 = var79.getDayOfYear();
    int var81 = var71.getMinimumValue((org.joda.time.ReadablePartial)var79);
    org.joda.time.DurationField var82 = var71.getDurationField();
    org.joda.time.DateTimeFieldType var83 = var71.getType();
    org.joda.time.field.OffsetDateTimeField var87 = new org.joda.time.field.OffsetDateTimeField(var52, var83, 884, 3, 948);
    org.joda.time.IllegalFieldValueException var90 = new org.joda.time.IllegalFieldValueException(var83, (java.lang.Number)35L, "secondOfDay");
    org.joda.time.format.DateTimeFormatterBuilder var93 = var44.appendFraction(var83, 33, (-948));
    org.joda.time.Partial var95 = new org.joda.time.Partial(var83, 4);
    org.joda.time.format.DateTimeFormatterBuilder var96 = var43.appendText(var83);
    org.joda.time.format.DateTimeFormatterBuilder var98 = var36.appendFixedDecimal(var83, 452);
    org.joda.time.format.DateTimeFormatterBuilder var99 = var98.appendEraText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test38"); }


    org.joda.time.MutableDateTime var0 = org.joda.time.MutableDateTime.now();
    org.joda.time.chrono.JulianChronology var1 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var2 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var1);
    org.joda.time.LocalDate var3 = var2.toLocalDate();
    org.joda.time.DateMidnight var5 = var2.minusWeeks((-1));
    org.joda.time.DateMidnight var7 = var5.minusMonths(100);
    org.joda.time.DateMidnight var9 = var5.withYearOfEra(2013);
    org.joda.time.DateMidnight var11 = var5.withYearOfCentury(13);
    org.joda.time.chrono.JulianChronology var12 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var13 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var12);
    org.joda.time.Period var18 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var20 = var18.plusSeconds(100);
    org.joda.time.Period var22 = var18.minusMillis(10);
    boolean var23 = var13.equals((java.lang.Object)10);
    org.joda.time.DateMidnight.Property var24 = var13.dayOfYear();
    org.joda.time.chrono.JulianChronology var25 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var26 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var25);
    org.joda.time.LocalDate var27 = var26.toLocalDate();
    org.joda.time.LocalDate var29 = var27.minusMonths(0);
    org.joda.time.DateTime var30 = var27.toDateTimeAtMidnight();
    org.joda.time.DateTime var32 = var30.withCenturyOfEra(4);
    org.joda.time.Days var33 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant)var13, (org.joda.time.ReadableInstant)var32);
    org.joda.time.DateMidnight var35 = var13.plusMonths(10);
    org.joda.time.DateTimeZone var37 = org.joda.time.DateTimeZone.forOffsetMillis(759);
    org.joda.time.MutableDateTime var38 = org.joda.time.MutableDateTime.now(var37);
    org.joda.time.DateMidnight var39 = var13.withZoneRetainFields(var37);
    org.joda.time.DateMidnight var40 = var11.withZoneRetainFields(var37);
    var0.setTime((org.joda.time.ReadableInstant)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test39"); }


    org.joda.time.format.DateTimeFormatterBuilder var0 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var2 = var0.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var4 = var2.appendDayOfWeek(8400);
    org.joda.time.format.DateTimeFormatterBuilder var6 = var4.appendLiteral("-1 hours");
    org.joda.time.format.DateTimeFormatterBuilder var8 = var4.appendClockhourOfDay(2005);
    org.joda.time.format.DateTimeFormatterBuilder var11 = var4.appendFractionOfSecond(630, 241);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.format.DateTimeFormatterBuilder var16 = var4.appendTimeZoneOffset("2013-08", true, 2063, (-17));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test40"); }


    org.joda.time.TimeOfDay var0 = new org.joda.time.TimeOfDay();
    int var1 = var0.size();
    org.joda.time.TimeOfDay var3 = var0.withMillisOfSecond(1);
    org.joda.time.TimeOfDay var5 = var0.minusMinutes(1);
    org.joda.time.PeriodType var6 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var7 = new org.joda.time.MutablePeriod(var6);
    var7.addDays(1);
    org.joda.time.TimeOfDay var10 = var0.plus((org.joda.time.ReadablePeriod)var7);
    var7.addYears(1970);
    int var13 = var7.getYears();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1970);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test41"); }


    org.joda.time.Period var4 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var6 = var4.plusYears((-1));
    org.joda.time.Minutes var7 = var4.toStandardMinutes();
    org.joda.time.Minutes var9 = org.joda.time.Minutes.minutes(10);
    org.joda.time.Minutes var10 = var7.minus(var9);
    org.joda.time.Period var15 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var17 = var15.plusYears((-1));
    org.joda.time.Minutes var18 = var15.toStandardMinutes();
    org.joda.time.Minutes var19 = var7.plus(var18);
    org.joda.time.Period var24 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var26 = var24.plusYears((-1));
    org.joda.time.Minutes var27 = var24.toStandardMinutes();
    org.joda.time.Minutes var29 = org.joda.time.Minutes.minutes(10);
    org.joda.time.Minutes var30 = var27.minus(var29);
    org.joda.time.Minutes var31 = var19.plus(var27);
    org.joda.time.DurationFieldType var32 = var27.getFieldType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test42"); }


    org.joda.time.format.PeriodFormatterBuilder var0 = new org.joda.time.format.PeriodFormatterBuilder();
    org.joda.time.format.PeriodFormatterBuilder var1 = var0.appendYears();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test43"); }


    org.joda.time.TimeOfDay var0 = new org.joda.time.TimeOfDay();
    int var1 = var0.size();
    org.joda.time.chrono.EthiopicChronology var3 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var4 = var3.hours();
    org.joda.time.LocalTime var5 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var3);
    org.joda.time.LocalTime var7 = var5.withMillisOfSecond(1);
    org.joda.time.LocalTime var9 = var7.minusHours((-1));
    org.joda.time.Years var10 = org.joda.time.Years.yearsBetween((org.joda.time.ReadablePartial)var0, (org.joda.time.ReadablePartial)var9);
    int var11 = var0.getMillisOfSecond();
    org.joda.time.TimeOfDay var13 = var0.minusMillis((-9));
    org.joda.time.tz.FixedDateTimeZone var18 = new org.joda.time.tz.FixedDateTimeZone("ConverterManager[6 instant,7 partial,5 duration,5 period,3 interval]", "ConverterManager[6 instant,7 partial,5 duration,5 period,3 interval]", 2, 759);
    org.joda.time.DateTime var19 = var13.toDateTimeToday((org.joda.time.DateTimeZone)var18);
    org.joda.time.DateTimeZone var21 = org.joda.time.DateTimeZone.forOffsetMillis(759);
    org.joda.time.MutableDateTime var22 = org.joda.time.MutableDateTime.now(var21);
    org.joda.time.chrono.JulianChronology var23 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var24 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var23);
    org.joda.time.LocalDate var25 = var24.toLocalDate();
    org.joda.time.MutableDateTime var26 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var27 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var24, (org.joda.time.ReadableInstant)var26);
    org.joda.time.chrono.JulianChronology var28 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var29 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var28);
    org.joda.time.LocalDate var30 = var29.toLocalDate();
    org.joda.time.MutableDateTime var31 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var32 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var29, (org.joda.time.ReadableInstant)var31);
    org.joda.time.MutableDateTime var33 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var34 = var33.year();
    boolean var35 = var31.isBefore((org.joda.time.ReadableInstant)var33);
    org.joda.time.Duration var37 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var39 = org.joda.time.Duration.standardHours((-1L));
    boolean var40 = var37.isShorterThan((org.joda.time.ReadableDuration)var39);
    org.joda.time.Duration var42 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var44 = org.joda.time.Duration.standardHours((-1L));
    boolean var45 = var42.isShorterThan((org.joda.time.ReadableDuration)var44);
    org.joda.time.Duration var46 = var37.plus((org.joda.time.ReadableDuration)var42);
    var33.add((org.joda.time.ReadableDuration)var42);
    org.joda.time.Seconds var48 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant)var24, (org.joda.time.ReadableInstant)var33);
    var33.setWeekOfWeekyear(28);
    org.joda.time.DateTime var51 = org.joda.time.DateTime.now();
    long var52 = var51.getMillis();
    var33.setMillis((org.joda.time.ReadableInstant)var51);
    org.joda.time.DateTimeZone var54 = var33.getZone();
    long var56 = var21.getMillisKeepLocal(var54, 1377742981948L);
    org.joda.time.DateTime var57 = var19.withZoneRetainFields(var21);
    org.joda.time.chrono.GregorianChronology var58 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.chrono.JulianChronology var59 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var60 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var59);
    org.joda.time.LocalDate var61 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var59);
    org.joda.time.DurationField var62 = var59.hours();
    org.joda.time.Chronology var63 = var59.withUTC();
    org.joda.time.chrono.JulianChronology var64 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var65 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var64);
    org.joda.time.LocalDate var66 = var65.toLocalDate();
    org.joda.time.MutableDateTime var67 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var68 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var65, (org.joda.time.ReadableInstant)var67);
    org.joda.time.MutableDateTime var69 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var70 = var69.year();
    boolean var71 = var67.isBefore((org.joda.time.ReadableInstant)var69);
    org.joda.time.Duration var73 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var75 = org.joda.time.Duration.standardHours((-1L));
    boolean var76 = var73.isShorterThan((org.joda.time.ReadableDuration)var75);
    org.joda.time.Duration var78 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var80 = org.joda.time.Duration.standardHours((-1L));
    boolean var81 = var78.isShorterThan((org.joda.time.ReadableDuration)var80);
    org.joda.time.Duration var82 = var73.plus((org.joda.time.ReadableDuration)var78);
    var69.add((org.joda.time.ReadableDuration)var78);
    org.joda.time.chrono.JulianChronology var84 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var85 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var84);
    org.joda.time.LocalDate var86 = var85.toLocalDate();
    org.joda.time.MutableDateTime var87 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var88 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var85, (org.joda.time.ReadableInstant)var87);
    org.joda.time.MutableDateTime var89 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var90 = var89.year();
    boolean var91 = var87.isBefore((org.joda.time.ReadableInstant)var89);
    org.joda.time.Interval var92 = new org.joda.time.Interval((org.joda.time.ReadableInstant)var69, (org.joda.time.ReadableInstant)var89);
    org.joda.time.DateTimeZone var93 = var89.getZone();
    org.joda.time.Chronology var94 = var59.withZone(var93);
    org.joda.time.Chronology var95 = var58.withZone(var93);
    org.joda.time.TimeOfDay var96 = new org.joda.time.TimeOfDay(var93);
    org.joda.time.MutableDateTime var97 = var57.toMutableDateTime(var93);
    org.joda.time.MutableDateTime.Property var98 = var97.millisOfSecond();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 497);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1377739441400L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1377742982607L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test44"); }


    org.joda.time.Period var1 = new org.joda.time.Period(10L);
    org.joda.time.Period var3 = var1.plusYears((-59));
    org.joda.time.Period var5 = var1.plusMinutes(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test45"); }


    org.joda.time.DateTimeZone var1 = org.joda.time.DateTimeZone.forOffsetMillis(33);
    org.joda.time.chrono.JulianChronology var2 = org.joda.time.chrono.JulianChronology.getInstance(var1);
    org.joda.time.LocalTime var3 = org.joda.time.LocalTime.now((org.joda.time.Chronology)var2);
    org.joda.time.PeriodType var4 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var5 = new org.joda.time.MutablePeriod(var4);
    var5.addDays(1);
    org.joda.time.Duration var9 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var11 = org.joda.time.Duration.standardHours((-1L));
    boolean var12 = var9.isShorterThan((org.joda.time.ReadableDuration)var11);
    var5.add((org.joda.time.ReadableDuration)var11);
    org.joda.time.MutableDateTime var14 = new org.joda.time.MutableDateTime();
    org.joda.time.MutablePeriod var15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)var11, (org.joda.time.ReadableInstant)var14);
    var15.setSeconds(1);
    int var18 = var15.getSeconds();
    org.joda.time.PeriodType var19 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var20 = new org.joda.time.MutablePeriod(var19);
    var20.addDays(1);
    org.joda.time.Duration var24 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var26 = org.joda.time.Duration.standardHours((-1L));
    boolean var27 = var24.isShorterThan((org.joda.time.ReadableDuration)var26);
    var20.add((org.joda.time.ReadableDuration)var26);
    org.joda.time.DateTime var29 = org.joda.time.DateTime.now();
    org.joda.time.DateTime var31 = var29.withMillis(0L);
    org.joda.time.MutablePeriod var32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)var26, (org.joda.time.ReadableInstant)var31);
    org.joda.time.Duration var34 = var26.withMillis(1377742981948L);
    var15.add((org.joda.time.ReadableDuration)var26);
    boolean var36 = var3.equals((java.lang.Object)var15);
    int var37 = var3.getSecondOfMinute();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test46"); }


    org.joda.time.Period var4 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var6 = var4.plusSeconds(100);
    org.joda.time.Period var8 = var6.withSeconds(0);
    org.joda.time.Period var9 = var6.normalizedStandard();
    org.joda.time.MutableDateTime var10 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var11 = var10.year();
    org.joda.time.MutableDateTime.Property var12 = var10.weekOfWeekyear();
    var10.setMillisOfDay(16);
    org.joda.time.Duration var16 = org.joda.time.Duration.standardHours(99L);
    var10.add((org.joda.time.ReadableDuration)var16, 3);
    org.joda.time.TimeOfDay var19 = new org.joda.time.TimeOfDay();
    int var20 = var19.size();
    org.joda.time.chrono.EthiopicChronology var22 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var23 = var22.hours();
    org.joda.time.LocalTime var24 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var22);
    org.joda.time.LocalTime var26 = var24.withMillisOfSecond(1);
    org.joda.time.LocalTime var28 = var26.minusHours((-1));
    org.joda.time.Years var29 = org.joda.time.Years.yearsBetween((org.joda.time.ReadablePartial)var19, (org.joda.time.ReadablePartial)var28);
    org.joda.time.DurationFieldType var30 = var29.getFieldType();
    var10.add(var30, 41);
    org.joda.time.Period var34 = var9.withFieldAdded(var30, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test47"); }


    org.joda.time.MutableInterval var0 = new org.joda.time.MutableInterval();
    org.joda.time.MutableInterval var1 = var0.copy();
    org.joda.time.DateTime var2 = var1.getStart();
    java.util.Date var3 = var2.toDate();
    org.joda.time.MonthDay var4 = org.joda.time.MonthDay.fromDateFields(var3);
    org.joda.time.Period var9 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var11 = var9.plusSeconds(100);
    org.joda.time.Period var13 = var11.withSeconds(0);
    int var14 = var13.getMonths();
    org.joda.time.MonthDay var15 = var4.minus((org.joda.time.ReadablePeriod)var13);
    org.joda.time.chrono.JulianChronology var16 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var17 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var16);
    org.joda.time.LocalDate var18 = var17.toLocalDate();
    org.joda.time.MutableDateTime var19 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var20 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var17, (org.joda.time.ReadableInstant)var19);
    org.joda.time.chrono.JulianChronology var21 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var22 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var21);
    org.joda.time.LocalDate var23 = var22.toLocalDate();
    org.joda.time.MutableDateTime var24 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var25 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var22, (org.joda.time.ReadableInstant)var24);
    org.joda.time.MutableDateTime var26 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var27 = var26.year();
    boolean var28 = var24.isBefore((org.joda.time.ReadableInstant)var26);
    org.joda.time.Duration var30 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var32 = org.joda.time.Duration.standardHours((-1L));
    boolean var33 = var30.isShorterThan((org.joda.time.ReadableDuration)var32);
    org.joda.time.Duration var35 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var37 = org.joda.time.Duration.standardHours((-1L));
    boolean var38 = var35.isShorterThan((org.joda.time.ReadableDuration)var37);
    org.joda.time.Duration var39 = var30.plus((org.joda.time.ReadableDuration)var35);
    var26.add((org.joda.time.ReadableDuration)var35);
    org.joda.time.Seconds var41 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant)var17, (org.joda.time.ReadableInstant)var26);
    org.joda.time.Seconds var42 = var41.negated();
    org.joda.time.Seconds var44 = var42.plus(240);
    org.joda.time.MonthDay var45 = var15.plus((org.joda.time.ReadablePeriod)var44);
    org.joda.time.MonthDay var47 = var15.minusMonths(22);
    org.joda.time.Years var49 = org.joda.time.Years.years((-1));
    org.joda.time.PeriodType var50 = var49.getPeriodType();
    org.joda.time.Years var52 = org.joda.time.Years.years((-1));
    int var53 = var49.compareTo((org.joda.time.base.BaseSingleFieldPeriod)var52);
    org.joda.time.TimeOfDay var54 = new org.joda.time.TimeOfDay();
    int var55 = var54.size();
    org.joda.time.chrono.EthiopicChronology var57 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var58 = var57.hours();
    org.joda.time.LocalTime var59 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var57);
    org.joda.time.LocalTime var61 = var59.withMillisOfSecond(1);
    org.joda.time.LocalTime var63 = var61.minusHours((-1));
    org.joda.time.Years var64 = org.joda.time.Years.yearsBetween((org.joda.time.ReadablePartial)var54, (org.joda.time.ReadablePartial)var63);
    boolean var65 = var52.isLessThan(var64);
    org.joda.time.MonthDay var66 = var47.minus((org.joda.time.ReadablePeriod)var52);
    int var67 = var66.getDayOfMonth();
    org.joda.time.MonthDay var69 = var66.minusMonths(41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.MonthDay var71 = var69.withMonthOfYear(24430);
      fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test48"); }


    org.joda.time.Period var1 = org.joda.time.Period.days(1);
    org.joda.time.Period var3 = var1.minusHours(0);
    org.joda.time.Seconds var4 = var1.toStandardSeconds();
    org.joda.time.PeriodType var5 = var4.getPeriodType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test49"); }


    org.joda.time.DateMidnight var1 = new org.joda.time.DateMidnight((java.lang.Object)"16");

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test50"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.MutableDateTime var3 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var4 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var1, (org.joda.time.ReadableInstant)var3);
    org.joda.time.Years var6 = var4.multipliedBy(69781948);
    org.joda.time.PeriodType var7 = var6.getPeriodType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test51"); }


    org.joda.time.MutableDateTime var0 = new org.joda.time.MutableDateTime();
    var0.setWeekOfWeekyear(1);
    org.joda.time.chrono.JulianChronology var3 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    var0.setChronology((org.joda.time.Chronology)var3);
    org.joda.time.DateTimeField var5 = var3.clockhourOfHalfday();
    org.joda.time.YearMonth var6 = new org.joda.time.YearMonth((org.joda.time.Chronology)var3);
    org.joda.time.YearMonth var8 = var6.plusMonths(69781948);
    org.joda.time.Period var13 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var15 = var13.plusYears((-1));
    org.joda.time.Minutes var16 = var13.toStandardMinutes();
    org.joda.time.Minutes var18 = org.joda.time.Minutes.minutes(10);
    org.joda.time.Minutes var19 = var16.minus(var18);
    org.joda.time.PeriodType var20 = var16.getPeriodType();
    int var21 = var16.getMinutes();
    org.joda.time.YearMonth var23 = var8.withPeriodAdded((org.joda.time.ReadablePeriod)var16, 69781948);
    org.joda.time.Weeks var24 = var16.toStandardWeeks();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test52"); }


    org.joda.time.MutablePeriod var1 = new org.joda.time.MutablePeriod((-1000L));
    var1.setYears(630);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test53"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.DateMidnight var4 = var1.minusWeeks((-1));
    org.joda.time.Duration var6 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var7 = new org.joda.time.MutableDateTime();
    var7.setWeekOfWeekyear(1);
    int var10 = var7.getRoundingMode();
    var7.addMillis(100);
    var7.setSecondOfMinute(10);
    org.joda.time.PeriodType var15 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var16 = new org.joda.time.Period((org.joda.time.ReadableDuration)var6, (org.joda.time.ReadableInstant)var7, var15);
    org.joda.time.Days var17 = var16.toStandardDays();
    org.joda.time.DurationFieldType var18 = var17.getFieldType();
    org.joda.time.DateMidnight var20 = var4.withFieldAdded(var18, 1);
    org.joda.time.field.PreciseDurationField var22 = new org.joda.time.field.PreciseDurationField(var18, 1L);
    org.joda.time.DurationFieldType var23 = var22.getType();
    org.joda.time.field.UnsupportedDurationField var24 = org.joda.time.field.UnsupportedDurationField.getInstance(var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var26 = var24.getMillis(14);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test54"); }


    org.joda.time.format.DateTimeFormatter var0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTimeNoMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test55"); }


    org.joda.time.LocalDateTime var0 = org.joda.time.LocalDateTime.now();
    int var1 = var0.getDayOfYear();
    org.joda.time.LocalDateTime var3 = var0.minusSeconds(2005);
    org.joda.time.Chronology var4 = var0.getChronology();
    org.joda.time.DateTimeZone var6 = org.joda.time.DateTimeZone.forOffsetMillis(759);
    org.joda.time.MutableDateTime var7 = org.joda.time.MutableDateTime.now(var6);
    org.joda.time.DateTime var8 = var0.toDateTime(var6);
    int var9 = var0.getSecondOfMinute();
    org.joda.time.DateTime var10 = var0.toDateTime();
    org.joda.time.LocalDateTime var12 = var0.withYear(928);
    org.joda.time.LocalDateTime var14 = var0.withDayOfMonth(14);
    int var15 = var0.getDayOfWeek();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.LocalDateTime var17 = var0.withEra(194);
      fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test56"); }


    org.joda.time.Period var1 = org.joda.time.Period.months((-948));
    int var2 = var1.getMinutes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test57"); }


    org.joda.time.chrono.JulianChronology var9 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var10 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var9);
    org.joda.time.LocalDate var11 = var10.toLocalDate();
    org.joda.time.DateMidnight var13 = var10.minusWeeks((-1));
    org.joda.time.DateMidnight var15 = var10.withWeekOfWeekyear(35);
    org.joda.time.chrono.JulianChronology var16 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var17 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var16);
    org.joda.time.LocalDate var18 = var17.toLocalDate();
    org.joda.time.MutableDateTime var19 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var20 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var17, (org.joda.time.ReadableInstant)var19);
    org.joda.time.chrono.JulianChronology var21 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var22 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var21);
    org.joda.time.LocalDate var23 = var22.toLocalDate();
    org.joda.time.MutableDateTime var24 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var25 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var22, (org.joda.time.ReadableInstant)var24);
    org.joda.time.MutableDateTime var26 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var27 = var26.year();
    boolean var28 = var24.isBefore((org.joda.time.ReadableInstant)var26);
    org.joda.time.Duration var30 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var32 = org.joda.time.Duration.standardHours((-1L));
    boolean var33 = var30.isShorterThan((org.joda.time.ReadableDuration)var32);
    org.joda.time.Duration var35 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var37 = org.joda.time.Duration.standardHours((-1L));
    boolean var38 = var35.isShorterThan((org.joda.time.ReadableDuration)var37);
    org.joda.time.Duration var39 = var30.plus((org.joda.time.ReadableDuration)var35);
    var26.add((org.joda.time.ReadableDuration)var35);
    org.joda.time.Seconds var41 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant)var17, (org.joda.time.ReadableInstant)var26);
    org.joda.time.Duration var42 = var41.toStandardDuration();
    org.joda.time.Duration var44 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var46 = org.joda.time.Duration.standardHours((-1L));
    boolean var47 = var44.isShorterThan((org.joda.time.ReadableDuration)var46);
    org.joda.time.Duration var48 = var44.toDuration();
    boolean var49 = var42.isShorterThan((org.joda.time.ReadableDuration)var48);
    org.joda.time.Duration var51 = var48.withMillis(228009L);
    org.joda.time.Period var52 = new org.joda.time.Period((org.joda.time.ReadableInstant)var10, (org.joda.time.ReadableDuration)var48);
    org.joda.time.PeriodType var53 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var54 = new org.joda.time.MutablePeriod(var53);
    var54.addDays(1);
    org.joda.time.Duration var58 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var60 = org.joda.time.Duration.standardHours((-1L));
    boolean var61 = var58.isShorterThan((org.joda.time.ReadableDuration)var60);
    var54.add((org.joda.time.ReadableDuration)var60);
    org.joda.time.MutableDateTime var63 = new org.joda.time.MutableDateTime();
    org.joda.time.MutablePeriod var64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)var60, (org.joda.time.ReadableInstant)var63);
    org.joda.time.PeriodType var65 = var64.getPeriodType();
    org.joda.time.Period var66 = var48.toPeriod(var65);
    org.joda.time.Period var67 = new org.joda.time.Period(24424, 2019, 19, 241, 1883, 2063, 85516010, 12217692, var65);
    org.joda.time.chrono.JulianChronology var68 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var69 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var68);
    org.joda.time.LocalDate var70 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var68);
    org.joda.time.DurationField var71 = var68.hours();
    org.joda.time.DateTimeField var72 = var68.clockhourOfDay();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.MutablePeriod var73 = new org.joda.time.MutablePeriod((java.lang.Object)1377739432486L, var65, (org.joda.time.Chronology)var68);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test58"); }


    org.joda.time.TimeOfDay var0 = new org.joda.time.TimeOfDay();
    int var1 = var0.size();
    org.joda.time.chrono.EthiopicChronology var3 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var4 = var3.hours();
    org.joda.time.LocalTime var5 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var3);
    org.joda.time.LocalTime var7 = var5.withMillisOfSecond(1);
    org.joda.time.LocalTime var9 = var7.minusHours((-1));
    org.joda.time.Years var10 = org.joda.time.Years.yearsBetween((org.joda.time.ReadablePartial)var0, (org.joda.time.ReadablePartial)var9);
    org.joda.time.TimeOfDay var12 = var0.minusHours(51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test59"); }


    org.joda.time.chrono.EthiopicChronology var0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
    org.joda.time.DateTimeZone var2 = org.joda.time.DateTimeZone.forOffsetMillis(33);
    org.joda.time.YearMonth var3 = new org.joda.time.YearMonth(var2);
    org.joda.time.Chronology var4 = var0.withZone(var2);
    org.joda.time.DateTime var5 = org.joda.time.DateTime.now(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test60"); }


    org.joda.time.format.DateTimeFormatterBuilder var0 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var2 = var0.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var4 = var0.appendClockhourOfHalfday(692);
    org.joda.time.chrono.JulianChronology var5 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var6 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var5);
    org.joda.time.LocalDate var7 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var5);
    org.joda.time.DateTimeField var8 = var5.millisOfSecond();
    org.joda.time.chrono.EthiopicChronology var9 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var10 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var11 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var10);
    org.joda.time.LocalDate var12 = var11.toLocalDate();
    org.joda.time.LocalDate var14 = var12.minusMonths(0);
    int[] var16 = var9.get((org.joda.time.ReadablePartial)var14, 100L);
    org.joda.time.chrono.EthiopicChronology var20 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var21 = var20.hours();
    org.joda.time.LocalTime var22 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var20);
    org.joda.time.Period var23 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var20);
    org.joda.time.DateTimeField var24 = var20.millisOfSecond();
    org.joda.time.DateTimeField var25 = var20.secondOfDay();
    org.joda.time.field.SkipDateTimeField var27 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var9, var25, 100);
    org.joda.time.LocalDateTime var28 = org.joda.time.LocalDateTime.now();
    int var29 = var28.getDayOfYear();
    org.joda.time.Chronology var30 = var28.getChronology();
    int var31 = var28.getYearOfCentury();
    int var32 = var27.getMaximumValue((org.joda.time.ReadablePartial)var28);
    boolean var34 = var27.isLeap(1L);
    org.joda.time.LocalDateTime var35 = org.joda.time.LocalDateTime.now();
    int var36 = var35.getDayOfYear();
    int var37 = var27.getMinimumValue((org.joda.time.ReadablePartial)var35);
    org.joda.time.DurationField var38 = var27.getDurationField();
    org.joda.time.DateTimeFieldType var39 = var27.getType();
    org.joda.time.field.OffsetDateTimeField var43 = new org.joda.time.field.OffsetDateTimeField(var8, var39, 884, 3, 948);
    org.joda.time.IllegalFieldValueException var46 = new org.joda.time.IllegalFieldValueException(var39, (java.lang.Number)35L, "secondOfDay");
    org.joda.time.format.DateTimeFormatterBuilder var49 = var0.appendFraction(var39, 33, (-948));
    org.joda.time.chrono.EthiopicChronology var50 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var51 = var50.minutes();
    org.joda.time.DateTimeField var52 = var50.year();
    org.joda.time.DurationField var53 = var50.hours();
    org.joda.time.field.UnsupportedDateTimeField var54 = org.joda.time.field.UnsupportedDateTimeField.getInstance(var39, var53);
    long var57 = var54.add((-1000L), 1377742981L);
    boolean var58 = var54.isLenient();
    long var61 = var54.add(1377742999393L, 12194);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var62 = var54.getMaximumValue();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 4959874731599000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1421641399393L);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test61"); }


    org.joda.time.DateTime var0 = org.joda.time.DateTime.now();
    long var1 = var0.getMillis();
    org.joda.time.DateTime.Property var2 = var0.yearOfEra();
    org.joda.time.DateTime var4 = var0.withMillisOfDay(216);
    org.joda.time.chrono.JulianChronology var5 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var6 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var5);
    org.joda.time.LocalDate var7 = var6.toLocalDate();
    org.joda.time.DateMidnight var9 = var6.minusWeeks((-1));
    org.joda.time.DateMidnight var11 = var9.minusMonths(100);
    org.joda.time.MutableInterval var12 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)var0, (org.joda.time.ReadableInstant)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.DateMidnight var14 = var9.withWeekOfWeekyear((-22));
      fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1377739441530L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test62"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.LocalDate var4 = var2.minusMonths(0);
    org.joda.time.DateTime var5 = var2.toDateTimeAtMidnight();
    org.joda.time.DateTime var7 = var5.withCenturyOfEra(4);
    org.joda.time.DateTime.Property var8 = var7.monthOfYear();
    org.joda.time.DateTime var10 = var7.withSecondOfMinute(10);
    org.joda.time.LocalDateTime var11 = var10.toLocalDateTime();
    java.lang.String var12 = var11.toString();
    org.joda.time.LocalDateTime var14 = var11.plusMonths(12);
    org.joda.time.LocalDateTime var15 = org.joda.time.LocalDateTime.now();
    int var16 = var15.getDayOfYear();
    org.joda.time.Chronology var17 = var15.getChronology();
    int var18 = var15.getYearOfCentury();
    org.joda.time.Duration var20 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var21 = new org.joda.time.MutableDateTime();
    var21.setWeekOfWeekyear(1);
    int var24 = var21.getRoundingMode();
    var21.addMillis(100);
    var21.setSecondOfMinute(10);
    org.joda.time.PeriodType var29 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var30 = new org.joda.time.Period((org.joda.time.ReadableDuration)var20, (org.joda.time.ReadableInstant)var21, var29);
    org.joda.time.Days var31 = var30.toStandardDays();
    boolean var32 = var15.equals((java.lang.Object)var31);
    org.joda.time.LocalDateTime var34 = var15.withSecondOfMinute(36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.Seconds var35 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadablePartial)var14, (org.joda.time.ReadablePartial)var34);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "0313-08-16T00:00:10.000"+ "'", var12.equals("0313-08-16T00:00:10.000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test63"); }


    org.joda.time.Duration var1 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var2 = new org.joda.time.MutableDateTime();
    var2.setWeekOfWeekyear(1);
    int var5 = var2.getRoundingMode();
    var2.addMillis(100);
    var2.setSecondOfMinute(10);
    org.joda.time.PeriodType var10 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var11 = new org.joda.time.Period((org.joda.time.ReadableDuration)var1, (org.joda.time.ReadableInstant)var2, var10);
    org.joda.time.DateTime var12 = org.joda.time.DateTime.now();
    org.joda.time.chrono.JulianChronology var13 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var14 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var13);
    org.joda.time.LocalDate var15 = var14.toLocalDate();
    org.joda.time.MutableDateTime var16 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var17 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var14, (org.joda.time.ReadableInstant)var16);
    org.joda.time.MutableDateTime var18 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var19 = var18.year();
    boolean var20 = var16.isBefore((org.joda.time.ReadableInstant)var18);
    org.joda.time.MutableDateTime.Property var21 = var18.minuteOfHour();
    org.joda.time.MutableDateTime.Property var22 = var18.millisOfSecond();
    org.joda.time.Chronology var23 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant)var12, (org.joda.time.ReadableInstant)var18);
    var2.setDate((org.joda.time.ReadableInstant)var18);
    long var25 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1377739441534L);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test64"); }


    org.joda.time.LocalDateTime var1 = org.joda.time.LocalDateTime.now();
    int var2 = var1.getDayOfYear();
    org.joda.time.Chronology var3 = var1.getChronology();
    int var4 = var1.getWeekOfWeekyear();
    org.joda.time.LocalDateTime var6 = var1.withDayOfWeek(2);
    org.joda.time.LocalDateTime.Property var7 = var6.yearOfCentury();
    org.joda.time.LocalDateTime var8 = org.joda.time.LocalDateTime.now();
    int var9 = var8.getDayOfYear();
    org.joda.time.Chronology var10 = var8.getChronology();
    int var11 = var8.getYearOfCentury();
    int var12 = var8.getWeekOfWeekyear();
    org.joda.time.LocalDateTime var14 = var8.minusMinutes(1);
    org.joda.time.Years var15 = org.joda.time.Years.yearsBetween((org.joda.time.ReadablePartial)var6, (org.joda.time.ReadablePartial)var8);
    org.joda.time.LocalDateTime var16 = org.joda.time.LocalDateTime.now();
    int var17 = var16.getDayOfYear();
    org.joda.time.Chronology var18 = var16.getChronology();
    org.joda.time.Period var23 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var25 = var23.plusSeconds(100);
    org.joda.time.Period var27 = var23.minusMillis(10);
    org.joda.time.LocalDateTime var28 = var16.plus((org.joda.time.ReadablePeriod)var27);
    org.joda.time.Instant var30 = new org.joda.time.Instant(2762381894421796L);
    long var31 = var30.getMillis();
    org.joda.time.Duration var33 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var35 = org.joda.time.Duration.standardHours((-1L));
    boolean var36 = var33.isShorterThan((org.joda.time.ReadableDuration)var35);
    org.joda.time.Duration var37 = var33.toDuration();
    org.joda.time.Duration var39 = org.joda.time.Duration.standardHours((-1L));
    boolean var40 = var37.isShorterThan((org.joda.time.ReadableDuration)var39);
    org.joda.time.Years var42 = org.joda.time.Years.years((-1));
    org.joda.time.PeriodType var43 = var42.getPeriodType();
    org.joda.time.Period var44 = new org.joda.time.Period((org.joda.time.ReadableInstant)var30, (org.joda.time.ReadableDuration)var37, var43);
    org.joda.time.Period var45 = new org.joda.time.Period((org.joda.time.ReadablePartial)var6, (org.joda.time.ReadablePartial)var16, var43);
    org.joda.time.LocalDateTime var48 = org.joda.time.LocalDateTime.now();
    int var49 = var48.getDayOfYear();
    org.joda.time.Chronology var50 = var48.getChronology();
    org.joda.time.chrono.StrictChronology var51 = org.joda.time.chrono.StrictChronology.getInstance(var50);
    org.joda.time.chrono.JulianChronology var52 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var53 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var52);
    org.joda.time.LocalDate var54 = var53.toLocalDate();
    org.joda.time.LocalDate var56 = var54.withMonthOfYear(1);
    org.joda.time.LocalDate var58 = var54.withWeekyear(1);
    org.joda.time.LocalDate var60 = var54.withDayOfYear(1);
    org.joda.time.LocalDate var62 = var60.minusMonths(16);
    boolean var63 = var51.equals((java.lang.Object)16);
    org.joda.time.YearMonth var64 = new org.joda.time.YearMonth(0L, (org.joda.time.Chronology)var51);
    org.joda.time.DateTime var65 = new org.joda.time.DateTime(1377742981948L, (org.joda.time.Chronology)var51);
    org.joda.time.MutablePeriod var66 = new org.joda.time.MutablePeriod(1377746597241L, var43, (org.joda.time.Chronology)var51);
    org.joda.time.LocalDate var67 = new org.joda.time.LocalDate((org.joda.time.Chronology)var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2762381894421796L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test65"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.LocalDate var4 = var2.withMonthOfYear(1);
    org.joda.time.LocalDate var6 = var4.withEra(1);
    org.joda.time.LocalDate.Property var7 = var4.yearOfCentury();
    java.lang.String var8 = var4.toString();
    int var9 = var4.getWeekyear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "2013-01-16"+ "'", var8.equals("2013-01-16"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2013);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test66"); }


    org.joda.time.LocalDateTime var0 = org.joda.time.LocalDateTime.now();
    int var1 = var0.getDayOfYear();
    org.joda.time.Chronology var2 = var0.getChronology();
    org.joda.time.chrono.StrictChronology var3 = org.joda.time.chrono.StrictChronology.getInstance(var2);
    org.joda.time.tz.FixedDateTimeZone var8 = new org.joda.time.tz.FixedDateTimeZone("P0D", "hi!", 28, 228);
    org.joda.time.Chronology var9 = var3.withZone((org.joda.time.DateTimeZone)var8);
    org.joda.time.chrono.IslamicChronology var10 = org.joda.time.chrono.IslamicChronology.getInstance((org.joda.time.DateTimeZone)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test67"); }


    org.joda.time.Period var1 = org.joda.time.Period.days(34);
    int[] var2 = var1.getValues();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test68"); }


    org.joda.time.Period var4 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var6 = var4.plusYears((-1));
    org.joda.time.Years var8 = org.joda.time.Years.years((-1));
    org.joda.time.PeriodType var9 = var8.getPeriodType();
    org.joda.time.Period var10 = var4.normalizedStandard(var9);
    org.joda.time.PeriodType var11 = var9.withMillisRemoved();
    org.joda.time.PeriodType var12 = var9.withYearsRemoved();
    org.joda.time.PeriodType var13 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var14 = new org.joda.time.MutablePeriod(var13);
    var14.addDays(1);
    org.joda.time.Duration var18 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var20 = org.joda.time.Duration.standardHours((-1L));
    boolean var21 = var18.isShorterThan((org.joda.time.ReadableDuration)var20);
    var14.add((org.joda.time.ReadableDuration)var20);
    org.joda.time.MutableDateTime var23 = new org.joda.time.MutableDateTime();
    org.joda.time.MutablePeriod var24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)var20, (org.joda.time.ReadableInstant)var23);
    boolean var25 = var9.equals((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test69"); }


    org.joda.time.LocalDateTime var1 = org.joda.time.LocalDateTime.now();
    int var2 = var1.getDayOfYear();
    org.joda.time.Chronology var3 = var1.getChronology();
    org.joda.time.chrono.StrictChronology var4 = org.joda.time.chrono.StrictChronology.getInstance(var3);
    org.joda.time.chrono.JulianChronology var5 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var6 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var5);
    org.joda.time.LocalDate var7 = var6.toLocalDate();
    org.joda.time.LocalDate var9 = var7.withMonthOfYear(1);
    org.joda.time.LocalDate var11 = var7.withWeekyear(1);
    org.joda.time.LocalDate var13 = var7.withDayOfYear(1);
    org.joda.time.LocalDate var15 = var13.minusMonths(16);
    boolean var16 = var4.equals((java.lang.Object)16);
    org.joda.time.YearMonth var17 = new org.joda.time.YearMonth(0L, (org.joda.time.Chronology)var4);
    java.lang.String var18 = var17.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var20 = var17.toString("YearsNoYears");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "1970-01"+ "'", var18.equals("1970-01"));

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test70"); }


    org.joda.time.chrono.EthiopicChronology var1 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var2 = var1.hours();
    org.joda.time.LocalTime var3 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var1);
    org.joda.time.LocalTime var5 = var3.withMillisOfSecond(1);
    org.joda.time.LocalTime var6 = org.joda.time.LocalTime.now();
    boolean var7 = var5.isAfter((org.joda.time.ReadablePartial)var6);
    org.joda.time.LocalTime var9 = var5.withHourOfDay(4);
    org.joda.time.LocalTime var11 = var5.minusMinutes(33);
    org.joda.time.DateTime var12 = var11.toDateTimeToday();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test71"); }


    org.joda.time.chrono.EthiopicChronology var1 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var2 = var1.hours();
    org.joda.time.DateTimeField var3 = var1.minuteOfHour();
    org.joda.time.LocalDate var4 = new org.joda.time.LocalDate(1L, (org.joda.time.Chronology)var1);
    org.joda.time.LocalDate.Property var5 = var4.weekyear();
    java.lang.String var6 = var4.toString();
    org.joda.time.LocalDateTime var8 = org.joda.time.LocalDateTime.now();
    int var9 = var8.getDayOfYear();
    org.joda.time.Chronology var10 = var8.getChronology();
    org.joda.time.chrono.StrictChronology var11 = org.joda.time.chrono.StrictChronology.getInstance(var10);
    org.joda.time.chrono.EthiopicChronology var12 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var13 = var12.hours();
    org.joda.time.DateTimeField var14 = var12.minuteOfHour();
    boolean var15 = var11.equals((java.lang.Object)var12);
    org.joda.time.Chronology var16 = var12.withUTC();
    org.joda.time.LocalTime var17 = org.joda.time.LocalTime.fromMillisOfDay((-3600L), (org.joda.time.Chronology)var12);
    org.joda.time.chrono.JulianChronology var18 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var19 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var18);
    org.joda.time.Period var24 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var26 = var24.plusSeconds(100);
    org.joda.time.Period var28 = var24.minusMillis(10);
    boolean var29 = var19.equals((java.lang.Object)10);
    org.joda.time.DateMidnight.Property var30 = var19.dayOfYear();
    int var31 = var19.getSecondOfDay();
    org.joda.time.DateMidnight var33 = var19.withWeekyear(240);
    org.joda.time.DateMidnight var35 = var33.minusMonths(28);
    org.joda.time.DateTimeZone var36 = var35.getZone();
    org.joda.time.DateTime var37 = var4.toDateTime(var17, var36);
    org.joda.time.LocalTime var38 = org.joda.time.LocalTime.now(var36);
    org.joda.time.TimeOfDay var39 = new org.joda.time.TimeOfDay(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "1962-04-23"+ "'", var6.equals("1962-04-23"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test72"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.LocalDate var4 = var2.minusMonths(0);
    org.joda.time.DateTime var5 = var2.toDateTimeAtMidnight();
    org.joda.time.DateTime var7 = var5.withMillis(100L);
    org.joda.time.DateTime.Property var8 = var7.era();
    org.joda.time.TimeOfDay var9 = var7.toTimeOfDay();
    org.joda.time.TimeOfDay var11 = var9.plusSeconds(100);
    org.joda.time.chrono.JulianChronology var12 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var13 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var12);
    org.joda.time.LocalDate var14 = var13.toLocalDate();
    org.joda.time.MutableDateTime var15 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var16 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var13, (org.joda.time.ReadableInstant)var15);
    org.joda.time.chrono.JulianChronology var17 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var18 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var17);
    org.joda.time.LocalDate var19 = var18.toLocalDate();
    org.joda.time.MutableDateTime var20 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var21 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var18, (org.joda.time.ReadableInstant)var20);
    org.joda.time.MutableDateTime var22 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var23 = var22.year();
    boolean var24 = var20.isBefore((org.joda.time.ReadableInstant)var22);
    org.joda.time.Duration var26 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var28 = org.joda.time.Duration.standardHours((-1L));
    boolean var29 = var26.isShorterThan((org.joda.time.ReadableDuration)var28);
    org.joda.time.Duration var31 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var33 = org.joda.time.Duration.standardHours((-1L));
    boolean var34 = var31.isShorterThan((org.joda.time.ReadableDuration)var33);
    org.joda.time.Duration var35 = var26.plus((org.joda.time.ReadableDuration)var31);
    var22.add((org.joda.time.ReadableDuration)var31);
    org.joda.time.Seconds var37 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant)var13, (org.joda.time.ReadableInstant)var22);
    org.joda.time.Duration var38 = var37.toStandardDuration();
    org.joda.time.TimeOfDay var40 = var11.withPeriodAdded((org.joda.time.ReadablePeriod)var37, 948);
    org.joda.time.chrono.JulianChronology var41 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var42 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var41);
    org.joda.time.LocalDate var43 = var42.toLocalDate();
    org.joda.time.MutableDateTime var44 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var45 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var42, (org.joda.time.ReadableInstant)var44);
    org.joda.time.chrono.JulianChronology var46 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var47 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var46);
    org.joda.time.LocalDate var48 = var47.toLocalDate();
    org.joda.time.MutableDateTime var49 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var50 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var47, (org.joda.time.ReadableInstant)var49);
    org.joda.time.MutableDateTime var51 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var52 = var51.year();
    boolean var53 = var49.isBefore((org.joda.time.ReadableInstant)var51);
    org.joda.time.Duration var55 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var57 = org.joda.time.Duration.standardHours((-1L));
    boolean var58 = var55.isShorterThan((org.joda.time.ReadableDuration)var57);
    org.joda.time.Duration var60 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var62 = org.joda.time.Duration.standardHours((-1L));
    boolean var63 = var60.isShorterThan((org.joda.time.ReadableDuration)var62);
    org.joda.time.Duration var64 = var55.plus((org.joda.time.ReadableDuration)var60);
    var51.add((org.joda.time.ReadableDuration)var60);
    org.joda.time.Seconds var66 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant)var42, (org.joda.time.ReadableInstant)var51);
    org.joda.time.Seconds var67 = var66.negated();
    org.joda.time.Seconds var69 = var67.plus(240);
    org.joda.time.TimeOfDay var70 = var40.plus((org.joda.time.ReadablePeriod)var69);
    org.joda.time.TimeOfDay var72 = var70.plusMillis(25785);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test73"); }


    org.joda.time.chrono.EthiopicChronology var1 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var2 = var1.hours();
    org.joda.time.LocalTime var3 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var1);
    org.joda.time.LocalTime var5 = var3.withMillisOfSecond(1);
    org.joda.time.LocalTime var6 = org.joda.time.LocalTime.now();
    boolean var7 = var5.isAfter((org.joda.time.ReadablePartial)var6);
    org.joda.time.chrono.JulianChronology var8 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var9 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var8);
    org.joda.time.LocalDate var10 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var8);
    org.joda.time.DurationField var11 = var8.hours();
    boolean var12 = var6.equals((java.lang.Object)var8);
    org.joda.time.LocalTime var14 = var6.minusMillis(12);
    int var15 = var14.getMinuteOfHour();
    int var16 = var14.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test74"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.MutableDateTime var3 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var4 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var1, (org.joda.time.ReadableInstant)var3);
    org.joda.time.YearMonthDay var5 = var1.toYearMonthDay();
    int var6 = var1.getDayOfMonth();
    org.joda.time.PeriodType var7 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var8 = new org.joda.time.MutablePeriod(var7);
    var8.addDays(1);
    org.joda.time.Duration var12 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var14 = org.joda.time.Duration.standardHours((-1L));
    boolean var15 = var12.isShorterThan((org.joda.time.ReadableDuration)var14);
    var8.add((org.joda.time.ReadableDuration)var14);
    org.joda.time.MutableDateTime var17 = new org.joda.time.MutableDateTime();
    org.joda.time.MutablePeriod var18 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)var14, (org.joda.time.ReadableInstant)var17);
    var18.setSeconds(1);
    int var21 = var18.getSeconds();
    org.joda.time.TimeOfDay var22 = new org.joda.time.TimeOfDay();
    int var23 = var22.size();
    org.joda.time.chrono.EthiopicChronology var25 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var26 = var25.hours();
    org.joda.time.LocalTime var27 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var25);
    org.joda.time.LocalTime var29 = var27.withMillisOfSecond(1);
    org.joda.time.LocalTime var31 = var29.minusHours((-1));
    org.joda.time.Years var32 = org.joda.time.Years.yearsBetween((org.joda.time.ReadablePartial)var22, (org.joda.time.ReadablePartial)var31);
    org.joda.time.DurationFieldType var33 = var32.getFieldType();
    org.joda.time.IllegalFieldValueException var37 = new org.joda.time.IllegalFieldValueException(var33, (java.lang.Number)10.0d, (java.lang.Number)1377746681334L, (java.lang.Number)1377742981948L);
    int var38 = var18.get(var33);
    org.joda.time.DateMidnight var39 = var1.plus((org.joda.time.ReadablePeriod)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test75"); }


    org.joda.time.Instant var0 = org.joda.time.Instant.now();
    org.joda.time.DateTime var1 = var0.toDateTimeISO();
    org.joda.time.chrono.JulianChronology var2 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var3 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var2);
    org.joda.time.LocalDate var4 = var3.toLocalDate();
    org.joda.time.MutableDateTime var5 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var6 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var3, (org.joda.time.ReadableInstant)var5);
    org.joda.time.MutableDateTime var7 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var8 = var7.year();
    boolean var9 = var5.isBefore((org.joda.time.ReadableInstant)var7);
    org.joda.time.Duration var11 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var13 = org.joda.time.Duration.standardHours((-1L));
    boolean var14 = var11.isShorterThan((org.joda.time.ReadableDuration)var13);
    org.joda.time.Duration var16 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var18 = org.joda.time.Duration.standardHours((-1L));
    boolean var19 = var16.isShorterThan((org.joda.time.ReadableDuration)var18);
    org.joda.time.Duration var20 = var11.plus((org.joda.time.ReadableDuration)var16);
    var7.add((org.joda.time.ReadableDuration)var16);
    org.joda.time.chrono.JulianChronology var22 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var23 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var22);
    org.joda.time.LocalDate var24 = var23.toLocalDate();
    org.joda.time.MutableDateTime var25 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var26 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var23, (org.joda.time.ReadableInstant)var25);
    org.joda.time.MutableDateTime var27 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var28 = var27.year();
    boolean var29 = var25.isBefore((org.joda.time.ReadableInstant)var27);
    org.joda.time.Interval var30 = new org.joda.time.Interval((org.joda.time.ReadableInstant)var7, (org.joda.time.ReadableInstant)var27);
    org.joda.time.DateTimeZone var31 = var27.getZone();
    org.joda.time.Hours var32 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant)var0, (org.joda.time.ReadableInstant)var27);
    var27.setTime(3600001L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var27.setDateTime(999, 830, 2049, 100, 25785, 452, 611);
      fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test76"); }


    org.joda.time.format.DateTimeFormatter var0 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
    org.joda.time.chrono.EthiopicChronology var4 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var5 = var4.hours();
    org.joda.time.LocalTime var6 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var4);
    org.joda.time.Period var7 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var4);
    org.joda.time.DateTimeField var8 = var4.millisOfSecond();
    org.joda.time.chrono.LenientChronology var9 = org.joda.time.chrono.LenientChronology.getInstance((org.joda.time.Chronology)var4);
    org.joda.time.format.DateTimeFormatter var10 = var0.withChronology((org.joda.time.Chronology)var9);
    org.joda.time.DateTimeField var11 = var9.weekyear();
    org.joda.time.format.DateTimeFormatter var12 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
    org.joda.time.chrono.EthiopicChronology var16 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var17 = var16.hours();
    org.joda.time.LocalTime var18 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var16);
    org.joda.time.Period var19 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var16);
    org.joda.time.DateTimeField var20 = var16.millisOfSecond();
    org.joda.time.chrono.LenientChronology var21 = org.joda.time.chrono.LenientChronology.getInstance((org.joda.time.Chronology)var16);
    org.joda.time.format.DateTimeFormatter var22 = var12.withChronology((org.joda.time.Chronology)var21);
    org.joda.time.chrono.ISOChronology var23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    org.joda.time.tz.FixedDateTimeZone var28 = new org.joda.time.tz.FixedDateTimeZone("P0D", "hi!", 28, 228);
    int var30 = var28.getOffsetFromLocal(1377742981323L);
    org.joda.time.Chronology var31 = var23.withZone((org.joda.time.DateTimeZone)var28);
    long var33 = var28.nextTransition(9L);
    org.joda.time.Chronology var34 = var21.withZone((org.joda.time.DateTimeZone)var28);
    org.joda.time.Chronology var35 = var9.withZone((org.joda.time.DateTimeZone)var28);
    org.joda.time.LocalDate var37 = org.joda.time.LocalDate.parse("1969-12");
    org.joda.time.tz.FixedDateTimeZone var42 = new org.joda.time.tz.FixedDateTimeZone("PT0H", "ISOChronology[UTC]", 100, 13);
    org.joda.time.PeriodType var43 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var44 = new org.joda.time.MutablePeriod(var43);
    var44.addDays(1);
    org.joda.time.Duration var48 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var50 = org.joda.time.Duration.standardHours((-1L));
    boolean var51 = var48.isShorterThan((org.joda.time.ReadableDuration)var50);
    var44.add((org.joda.time.ReadableDuration)var50);
    org.joda.time.MutableDateTime var53 = new org.joda.time.MutableDateTime();
    org.joda.time.MutablePeriod var54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)var50, (org.joda.time.ReadableInstant)var53);
    var54.clear();
    org.joda.time.MutableDateTime var56 = new org.joda.time.MutableDateTime();
    org.joda.time.chrono.JulianChronology var57 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var58 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var57);
    org.joda.time.LocalDate var59 = var58.toLocalDate();
    org.joda.time.MutableDateTime var60 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var61 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var58, (org.joda.time.ReadableInstant)var60);
    org.joda.time.MutableDateTime var62 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var63 = var62.year();
    boolean var64 = var60.isBefore((org.joda.time.ReadableInstant)var62);
    org.joda.time.Duration var66 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var68 = org.joda.time.Duration.standardHours((-1L));
    boolean var69 = var66.isShorterThan((org.joda.time.ReadableDuration)var68);
    org.joda.time.Duration var71 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var73 = org.joda.time.Duration.standardHours((-1L));
    boolean var74 = var71.isShorterThan((org.joda.time.ReadableDuration)var73);
    org.joda.time.Duration var75 = var66.plus((org.joda.time.ReadableDuration)var71);
    var62.add((org.joda.time.ReadableDuration)var71);
    org.joda.time.MutableDateTime.Property var77 = var62.dayOfWeek();
    var54.setPeriod((org.joda.time.ReadableInstant)var56, (org.joda.time.ReadableInstant)var62);
    boolean var79 = var42.equals((java.lang.Object)var54);
    boolean var80 = var42.isFixed();
    org.joda.time.LocalTime var81 = org.joda.time.LocalTime.now((org.joda.time.DateTimeZone)var42);
    org.joda.time.DateTime var82 = var37.toDateTimeAtStartOfDay((org.joda.time.DateTimeZone)var42);
    org.joda.time.DateTimeZone var84 = org.joda.time.DateTimeZone.forOffsetMillis(33);
    org.joda.time.chrono.JulianChronology var85 = org.joda.time.chrono.JulianChronology.getInstance(var84);
    org.joda.time.DateTime var86 = var82.toDateTime((org.joda.time.Chronology)var85);
    org.joda.time.DateTimeZone var87 = var85.getZone();
    org.joda.time.chrono.ZonedChronology var88 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology)var9, var87);
    boolean var90 = var88.equals((java.lang.Object)208);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 9L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test77"); }


    org.joda.time.Partial var0 = new org.joda.time.Partial();
    java.lang.String var1 = var0.toString();
    org.joda.time.PeriodType var2 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var3 = new org.joda.time.MutablePeriod(var2);
    org.joda.time.DurationFieldType[] var4 = var3.getFieldTypes();
    org.joda.time.Partial var5 = var0.plus((org.joda.time.ReadablePeriod)var3);
    var3.addWeeks((-1377742992));
    org.joda.time.chrono.JulianChronology var8 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var9 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var8);
    org.joda.time.LocalDate var10 = var9.toLocalDate();
    org.joda.time.LocalDate var12 = var10.withMonthOfYear(1);
    org.joda.time.LocalDate var14 = var10.withWeekyear(1);
    org.joda.time.LocalDate var16 = var10.withDayOfYear(1);
    org.joda.time.Duration var18 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var19 = new org.joda.time.MutableDateTime();
    var19.setWeekOfWeekyear(1);
    int var22 = var19.getRoundingMode();
    var19.addMillis(100);
    var19.setSecondOfMinute(10);
    org.joda.time.PeriodType var27 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var28 = new org.joda.time.Period((org.joda.time.ReadableDuration)var18, (org.joda.time.ReadableInstant)var19, var27);
    org.joda.time.Days var29 = var28.toStandardDays();
    org.joda.time.DurationFieldType var30 = var29.getFieldType();
    boolean var31 = var10.isSupported(var30);
    org.joda.time.field.PreciseDurationField var33 = new org.joda.time.field.PreciseDurationField(var30, 1325559981L);
    var3.set(var30, 23544431);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test78"); }


    org.joda.time.PeriodType var1 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.DateTime var2 = org.joda.time.DateTime.now();
    org.joda.time.chrono.JulianChronology var3 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var4 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var3);
    org.joda.time.LocalDate var5 = var4.toLocalDate();
    org.joda.time.MutableDateTime var6 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var7 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var4, (org.joda.time.ReadableInstant)var6);
    org.joda.time.MutableDateTime var8 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var9 = var8.year();
    boolean var10 = var6.isBefore((org.joda.time.ReadableInstant)var8);
    org.joda.time.MutableDateTime.Property var11 = var8.minuteOfHour();
    org.joda.time.MutableDateTime.Property var12 = var8.millisOfSecond();
    org.joda.time.Chronology var13 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant)var2, (org.joda.time.ReadableInstant)var8);
    org.joda.time.MutablePeriod var14 = new org.joda.time.MutablePeriod(9L, var1, var13);
    org.joda.time.YearMonthDay var15 = new org.joda.time.YearMonthDay(var13);
    org.joda.time.chrono.EthiopicChronology var16 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DateTimeField var17 = var16.dayOfYear();
    org.joda.time.YearMonthDay var18 = new org.joda.time.YearMonthDay((org.joda.time.Chronology)var16);
    org.joda.time.YearMonthDay var20 = var18.plusDays((-1));
    org.joda.time.DateMidnight var21 = var20.toDateMidnight();
    org.joda.time.DateTime var29 = new org.joda.time.DateTime(0, 4, 28, 1, 28, 1, 1);
    int var30 = var29.getHourOfDay();
    org.joda.time.DateTime.Property var31 = var29.yearOfCentury();
    org.joda.time.LocalDate var32 = var29.toLocalDate();
    org.joda.time.tz.FixedDateTimeZone var37 = new org.joda.time.tz.FixedDateTimeZone("P0D", "hi!", 28, 228);
    org.joda.time.chrono.ISOChronology var38 = org.joda.time.chrono.ISOChronology.getInstance((org.joda.time.DateTimeZone)var37);
    org.joda.time.DateTime var39 = var29.withZoneRetainFields((org.joda.time.DateTimeZone)var37);
    int var41 = var37.getOffset((-86379208L));
    org.joda.time.DateTime var42 = var20.toDateTimeAtMidnight((org.joda.time.DateTimeZone)var37);
    org.joda.time.LocalDate var43 = org.joda.time.LocalDate.now((org.joda.time.DateTimeZone)var37);
    org.joda.time.DateMidnight var44 = var15.toDateMidnight((org.joda.time.DateTimeZone)var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.DateTimeField var46 = var15.getField(2049);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test79"); }


    org.joda.time.format.DateTimeFormatterBuilder var0 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var2 = var0.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var4 = var0.appendHourOfHalfday(759);
    org.joda.time.format.DateTimeFormatterBuilder var6 = var4.appendDayOfYear(12182);
    org.joda.time.chrono.EthiopicChronology var7 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var8 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var9 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var8);
    org.joda.time.LocalDate var10 = var9.toLocalDate();
    org.joda.time.LocalDate var12 = var10.minusMonths(0);
    int[] var14 = var7.get((org.joda.time.ReadablePartial)var12, 100L);
    org.joda.time.chrono.EthiopicChronology var18 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var19 = var18.hours();
    org.joda.time.LocalTime var20 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var18);
    org.joda.time.Period var21 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var18);
    org.joda.time.DateTimeField var22 = var18.millisOfSecond();
    org.joda.time.DateTimeField var23 = var18.secondOfDay();
    org.joda.time.field.SkipDateTimeField var25 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var7, var23, 100);
    org.joda.time.LocalDateTime var26 = org.joda.time.LocalDateTime.now();
    int var27 = var26.getDayOfYear();
    org.joda.time.Chronology var28 = var26.getChronology();
    int var29 = var26.getYearOfCentury();
    int var30 = var25.getMaximumValue((org.joda.time.ReadablePartial)var26);
    boolean var32 = var25.isLeap(1L);
    org.joda.time.LocalDateTime var33 = org.joda.time.LocalDateTime.now();
    int var34 = var33.getDayOfYear();
    int var35 = var25.getMinimumValue((org.joda.time.ReadablePartial)var33);
    org.joda.time.DurationField var36 = var25.getDurationField();
    org.joda.time.DateTimeFieldType var37 = var25.getType();
    org.joda.time.format.DateTimeFormatterBuilder var38 = var6.appendText(var37);
    org.joda.time.format.DateTimeFormatter var39 = org.joda.time.format.DateTimeFormat.mediumDateTime();
    boolean var40 = var39.isPrinter();
    java.util.Locale var41 = var39.getLocale();
    org.joda.time.format.DateTimeFormatter var43 = var39.withPivotYear(16);
    org.joda.time.format.DateTimeParser var44 = var43.getParser();
    org.joda.time.format.DateTimeFormatterBuilder var45 = var6.appendOptional(var44);
    org.joda.time.chrono.JulianChronology var46 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var47 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var46);
    org.joda.time.LocalDate var48 = var47.toLocalDate();
    org.joda.time.MutableDateTime var49 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var50 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var47, (org.joda.time.ReadableInstant)var49);
    org.joda.time.DateTimeComparator var51 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
    org.joda.time.DateTimeFieldType var52 = var51.getUpperLimit();
    org.joda.time.MutableDateTime.Property var53 = var49.property(var52);
    org.joda.time.format.DateTimeFormatterBuilder var54 = var6.appendText(var52);
    org.joda.time.format.DateTimeFormatterBuilder var56 = var6.appendSecondOfDay(353);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test80"); }


    org.joda.time.DateTime var0 = new org.joda.time.DateTime();
    org.joda.time.chrono.JulianChronology var2 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var3 = new org.joda.time.DateMidnight((-1L), (org.joda.time.Chronology)var2);
    org.joda.time.chrono.JulianChronology var4 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var5 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var4);
    org.joda.time.LocalDate var6 = var5.toLocalDate();
    org.joda.time.MutableDateTime var7 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var8 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var5, (org.joda.time.ReadableInstant)var7);
    org.joda.time.MutableDateTime var9 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var10 = var9.year();
    boolean var11 = var7.isBefore((org.joda.time.ReadableInstant)var9);
    org.joda.time.Duration var13 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var15 = org.joda.time.Duration.standardHours((-1L));
    boolean var16 = var13.isShorterThan((org.joda.time.ReadableDuration)var15);
    org.joda.time.Duration var18 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var20 = org.joda.time.Duration.standardHours((-1L));
    boolean var21 = var18.isShorterThan((org.joda.time.ReadableDuration)var20);
    org.joda.time.Duration var22 = var13.plus((org.joda.time.ReadableDuration)var18);
    var9.add((org.joda.time.ReadableDuration)var18);
    var9.setHourOfDay(10);
    org.joda.time.Years var26 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var3, (org.joda.time.ReadableInstant)var9);
    org.joda.time.Period var27 = new org.joda.time.Period((org.joda.time.ReadableInstant)var0, (org.joda.time.ReadableInstant)var9);
    org.joda.time.chrono.EthiopicChronology var31 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var32 = var31.hours();
    org.joda.time.LocalTime var33 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var31);
    org.joda.time.Period var34 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var31);
    org.joda.time.DateTimeField var35 = var31.millisOfSecond();
    org.joda.time.chrono.EthiopicChronology var37 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var38 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var39 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var38);
    org.joda.time.LocalDate var40 = var39.toLocalDate();
    org.joda.time.LocalDate var42 = var40.minusMonths(0);
    int[] var44 = var37.get((org.joda.time.ReadablePartial)var42, 100L);
    org.joda.time.DateTime var45 = new org.joda.time.DateTime(1377746581334L, (org.joda.time.Chronology)var37);
    org.joda.time.chrono.EthiopicChronology var49 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var50 = var49.hours();
    org.joda.time.LocalTime var51 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var49);
    org.joda.time.Period var52 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var49);
    org.joda.time.DateTimeField var53 = var49.millisOfSecond();
    org.joda.time.field.SkipDateTimeField var54 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var37, var53);
    org.joda.time.DateTimeField var55 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField)var54);
    int var56 = var54.getMinimumValue();
    org.joda.time.field.SkipUndoDateTimeField var58 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology)var31, (org.joda.time.DateTimeField)var54, 19);
    var9.setRounding((org.joda.time.DateTimeField)var54);
    int var60 = var54.getMinimumValue();
    int var62 = var54.get(104010L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 110);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test81"); }


    org.joda.time.chrono.EthiopicChronology var1 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var2 = var1.hours();
    org.joda.time.LocalTime var3 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var1);
    org.joda.time.LocalTime var5 = var3.withMillisOfSecond(1);
    org.joda.time.LocalTime var7 = var5.minusHours((-1));
    org.joda.time.Partial var8 = new org.joda.time.Partial((org.joda.time.ReadablePartial)var5);
    int[] var9 = var8.getValues();
    java.lang.String var11 = var8.toString("\uFFFD\uFFFD1969\uFFFD");
    org.joda.time.format.DateTimeFormatterBuilder var12 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var15 = var12.appendCenturyOfEra(35, 10);
    org.joda.time.format.DateTimeFormatterBuilder var16 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var18 = var16.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var20 = var16.appendClockhourOfHalfday(692);
    org.joda.time.chrono.JulianChronology var21 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var22 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var21);
    org.joda.time.LocalDate var23 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var21);
    org.joda.time.DateTimeField var24 = var21.millisOfSecond();
    org.joda.time.chrono.EthiopicChronology var25 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var26 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var27 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var26);
    org.joda.time.LocalDate var28 = var27.toLocalDate();
    org.joda.time.LocalDate var30 = var28.minusMonths(0);
    int[] var32 = var25.get((org.joda.time.ReadablePartial)var30, 100L);
    org.joda.time.chrono.EthiopicChronology var36 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var37 = var36.hours();
    org.joda.time.LocalTime var38 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var36);
    org.joda.time.Period var39 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var36);
    org.joda.time.DateTimeField var40 = var36.millisOfSecond();
    org.joda.time.DateTimeField var41 = var36.secondOfDay();
    org.joda.time.field.SkipDateTimeField var43 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var25, var41, 100);
    org.joda.time.LocalDateTime var44 = org.joda.time.LocalDateTime.now();
    int var45 = var44.getDayOfYear();
    org.joda.time.Chronology var46 = var44.getChronology();
    int var47 = var44.getYearOfCentury();
    int var48 = var43.getMaximumValue((org.joda.time.ReadablePartial)var44);
    boolean var50 = var43.isLeap(1L);
    org.joda.time.LocalDateTime var51 = org.joda.time.LocalDateTime.now();
    int var52 = var51.getDayOfYear();
    int var53 = var43.getMinimumValue((org.joda.time.ReadablePartial)var51);
    org.joda.time.DurationField var54 = var43.getDurationField();
    org.joda.time.DateTimeFieldType var55 = var43.getType();
    org.joda.time.field.OffsetDateTimeField var59 = new org.joda.time.field.OffsetDateTimeField(var24, var55, 884, 3, 948);
    org.joda.time.IllegalFieldValueException var62 = new org.joda.time.IllegalFieldValueException(var55, (java.lang.Number)35L, "secondOfDay");
    org.joda.time.format.DateTimeFormatterBuilder var65 = var16.appendFraction(var55, 33, (-948));
    org.joda.time.Partial var67 = new org.joda.time.Partial(var55, 4);
    org.joda.time.format.DateTimeFormatterBuilder var68 = var15.appendText(var55);
    org.joda.time.Partial var69 = var8.without(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "\uFFFD\uFFFD1969\uFFFD"+ "'", var11.equals("\uFFFD\uFFFD1969\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test82"); }


    org.joda.time.DateTimeComparator var0 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
    org.joda.time.DateTimeFieldType var1 = var0.getUpperLimit();
    org.joda.time.DateTimeComparator var2 = org.joda.time.DateTimeComparator.getInstance(var1);
    org.joda.time.DateTimeFieldType var3 = var2.getUpperLimit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test83"); }


    org.joda.time.format.DateTimeFormatterBuilder var0 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var2 = var0.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var5 = var0.appendYear(23, 8);
    org.joda.time.format.DateTimeFormatterBuilder var7 = var5.appendWeekOfWeekyear(13);
    org.joda.time.format.DateTimeFormatter var8 = org.joda.time.format.ISODateTimeFormat.yearMonth();
    org.joda.time.format.DateTimeFormatterBuilder var9 = var7.append(var8);
    org.joda.time.format.DateTimeFormatterBuilder var10 = var7.appendTimeZoneName();
    org.joda.time.format.DateTimeFormatterBuilder var12 = var10.appendSecondOfDay(10);
    org.joda.time.format.DateTimeFormatterBuilder var14 = var10.appendDayOfMonth(3);
    org.joda.time.format.DateTimeFormatterBuilder var17 = var10.appendFractionOfMinute(5037, 767326786);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test84"); }


    org.joda.time.PeriodType var0 = org.joda.time.PeriodType.standard();
    org.joda.time.PeriodType var1 = org.joda.time.DateTimeUtils.getPeriodType(var0);
    org.joda.time.PeriodType var2 = var0.withDaysRemoved();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test85"); }


    org.joda.time.format.PeriodFormatterBuilder var0 = new org.joda.time.format.PeriodFormatterBuilder();
    org.joda.time.format.PeriodFormatterBuilder var3 = var0.appendSeparator("T07:00:08", "P121961710312T697819483414166.171");
    org.joda.time.format.PeriodFormatterBuilder var5 = var0.appendSeparatorIfFieldsAfter("days");
    org.joda.time.format.PeriodFormatterBuilder var7 = var0.minimumPrintedDigits(17);
    org.joda.time.format.PeriodFormatterBuilder var8 = var7.appendHours();
    org.joda.time.format.PeriodFormatterBuilder var9 = var8.appendSecondsWithMillis();
    org.joda.time.format.PeriodFormatterBuilder var11 = var8.rejectSignedValues(false);
    org.joda.time.format.PeriodFormatterBuilder var13 = var8.appendSeparator("2013-08-29T02:23:39.501+00:00:00.100");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test86"); }


    org.joda.time.chrono.EthiopicChronology var1 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var2 = var1.hours();
    org.joda.time.LocalTime var3 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var1);
    org.joda.time.LocalTime var5 = var3.withMillisOfSecond(1);
    org.joda.time.LocalTime var6 = org.joda.time.LocalTime.now();
    boolean var7 = var5.isAfter((org.joda.time.ReadablePartial)var6);
    org.joda.time.chrono.JulianChronology var8 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var9 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var8);
    org.joda.time.LocalDate var10 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var8);
    org.joda.time.DurationField var11 = var8.hours();
    boolean var12 = var6.equals((java.lang.Object)var8);
    org.joda.time.LocalTime var14 = var6.minusMillis(12);
    org.joda.time.tz.FixedDateTimeZone var19 = new org.joda.time.tz.FixedDateTimeZone("PT0H", "ISOChronology[UTC]", 100, 13);
    org.joda.time.PeriodType var20 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var21 = new org.joda.time.MutablePeriod(var20);
    var21.addDays(1);
    org.joda.time.Duration var25 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var27 = org.joda.time.Duration.standardHours((-1L));
    boolean var28 = var25.isShorterThan((org.joda.time.ReadableDuration)var27);
    var21.add((org.joda.time.ReadableDuration)var27);
    org.joda.time.MutableDateTime var30 = new org.joda.time.MutableDateTime();
    org.joda.time.MutablePeriod var31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)var27, (org.joda.time.ReadableInstant)var30);
    var31.clear();
    org.joda.time.MutableDateTime var33 = new org.joda.time.MutableDateTime();
    org.joda.time.chrono.JulianChronology var34 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var35 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var34);
    org.joda.time.LocalDate var36 = var35.toLocalDate();
    org.joda.time.MutableDateTime var37 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var38 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var35, (org.joda.time.ReadableInstant)var37);
    org.joda.time.MutableDateTime var39 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var40 = var39.year();
    boolean var41 = var37.isBefore((org.joda.time.ReadableInstant)var39);
    org.joda.time.Duration var43 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var45 = org.joda.time.Duration.standardHours((-1L));
    boolean var46 = var43.isShorterThan((org.joda.time.ReadableDuration)var45);
    org.joda.time.Duration var48 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var50 = org.joda.time.Duration.standardHours((-1L));
    boolean var51 = var48.isShorterThan((org.joda.time.ReadableDuration)var50);
    org.joda.time.Duration var52 = var43.plus((org.joda.time.ReadableDuration)var48);
    var39.add((org.joda.time.ReadableDuration)var48);
    org.joda.time.MutableDateTime.Property var54 = var39.dayOfWeek();
    var31.setPeriod((org.joda.time.ReadableInstant)var33, (org.joda.time.ReadableInstant)var39);
    boolean var56 = var19.equals((java.lang.Object)var31);
    int var57 = var31.getMinutes();
    int var58 = var31.getMonths();
    org.joda.time.LocalTime var59 = var14.minus((org.joda.time.ReadablePeriod)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test87"); }


    org.joda.time.chrono.EthiopicChronology var0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DateTimeField var1 = var0.dayOfYear();
    org.joda.time.YearMonthDay var2 = new org.joda.time.YearMonthDay((org.joda.time.Chronology)var0);
    int var3 = var2.getYear();
    org.joda.time.Period var6 = new org.joda.time.Period(10L, 1L);
    org.joda.time.Duration var8 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var9 = new org.joda.time.MutableDateTime();
    var9.setWeekOfWeekyear(1);
    int var12 = var9.getRoundingMode();
    var9.addMillis(100);
    var9.setSecondOfMinute(10);
    org.joda.time.PeriodType var17 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var18 = new org.joda.time.Period((org.joda.time.ReadableDuration)var8, (org.joda.time.ReadableInstant)var9, var17);
    org.joda.time.Days var19 = var18.toStandardDays();
    org.joda.time.DurationFieldType var20 = var19.getFieldType();
    int var21 = var6.get(var20);
    org.joda.time.YearMonthDay var22 = var2.minus((org.joda.time.ReadablePeriod)var6);
    org.joda.time.Period var23 = new org.joda.time.Period();
    org.joda.time.Period var25 = var23.minusMinutes((-1));
    org.joda.time.YearMonthDay var26 = var2.plus((org.joda.time.ReadablePeriod)var25);
    java.lang.String var27 = var25.toString();
    org.joda.time.Period var29 = var25.withWeeks(42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2005);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "PT1M"+ "'", var27.equals("PT1M"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test88"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var0);
    org.joda.time.DateMidnight var3 = new org.joda.time.DateMidnight((org.joda.time.Chronology)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test89"); }


    int var2 = org.joda.time.field.FieldUtils.safeMultiply(529, 353);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 186737);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test90"); }


    org.joda.time.LocalDateTime var0 = org.joda.time.LocalDateTime.now();
    org.joda.time.chrono.EthiopicChronology var1 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var2 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var3 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var2);
    org.joda.time.LocalDate var4 = var3.toLocalDate();
    org.joda.time.LocalDate var6 = var4.minusMonths(0);
    int[] var8 = var1.get((org.joda.time.ReadablePartial)var6, 100L);
    org.joda.time.chrono.EthiopicChronology var12 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var13 = var12.hours();
    org.joda.time.LocalTime var14 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var12);
    org.joda.time.Period var15 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var12);
    org.joda.time.DateTimeField var16 = var12.millisOfSecond();
    org.joda.time.DateTimeField var17 = var12.secondOfDay();
    org.joda.time.field.SkipDateTimeField var19 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var1, var17, 100);
    org.joda.time.LocalDateTime var20 = org.joda.time.LocalDateTime.now();
    int var21 = var20.getDayOfYear();
    org.joda.time.Chronology var22 = var20.getChronology();
    int var23 = var20.getYearOfCentury();
    int var24 = var19.getMaximumValue((org.joda.time.ReadablePartial)var20);
    int var25 = var20.getSecondOfMinute();
    int var26 = var20.getDayOfYear();
    org.joda.time.LocalDateTime var28 = var20.withMillisOfSecond(692);
    org.joda.time.DateTimeZone var30 = org.joda.time.DateTimeZone.forOffsetMillis(33);
    org.joda.time.chrono.JulianChronology var31 = org.joda.time.chrono.JulianChronology.getInstance(var30);
    org.joda.time.LocalTime var32 = org.joda.time.LocalTime.now((org.joda.time.Chronology)var31);
    boolean var33 = var20.equals((java.lang.Object)var32);
    org.joda.time.Minutes var34 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadablePartial)var0, (org.joda.time.ReadablePartial)var20);
    org.joda.time.Minutes var36 = var34.plus(2063);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test91"); }


    org.joda.time.IllegalFieldValueException var2 = new org.joda.time.IllegalFieldValueException("T20:23:01.948", "Aug 23, 2013 12:00:00 AM");
    java.lang.Number var3 = var2.getUpperBound();
    var2.prependMessage("00:00:00.010");
    java.lang.String var6 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.joda.time.IllegalFieldValueException: 00:00:00.010: Value \"Aug 23, 2013 12:00:00 AM\" for T20:23:01.948 is not supported"+ "'", var6.equals("org.joda.time.IllegalFieldValueException: 00:00:00.010: Value \"Aug 23, 2013 12:00:00 AM\" for T20:23:01.948 is not supported"));

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test92"); }


    org.joda.time.chrono.EthiopicChronology var0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DateTimeField var1 = var0.dayOfYear();
    org.joda.time.YearMonthDay var2 = new org.joda.time.YearMonthDay((org.joda.time.Chronology)var0);
    org.joda.time.YearMonthDay.Property var3 = var2.monthOfYear();
    org.joda.time.Partial var4 = new org.joda.time.Partial((org.joda.time.ReadablePartial)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test93"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.Period var6 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var8 = var6.plusSeconds(100);
    org.joda.time.Period var10 = var6.minusMillis(10);
    boolean var11 = var1.equals((java.lang.Object)10);
    org.joda.time.DateMidnight.Property var12 = var1.dayOfYear();
    org.joda.time.chrono.JulianChronology var13 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var14 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var13);
    org.joda.time.LocalDate var15 = var14.toLocalDate();
    org.joda.time.LocalDate var17 = var15.minusMonths(0);
    org.joda.time.DateTime var18 = var15.toDateTimeAtMidnight();
    org.joda.time.DateTime var20 = var18.withCenturyOfEra(4);
    org.joda.time.Days var21 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant)var1, (org.joda.time.ReadableInstant)var20);
    org.joda.time.DateTime var23 = var20.plusSeconds(10);
    org.joda.time.DateTime var25 = var23.minusMinutes(16);
    org.joda.time.DateTime var27 = var23.withHourOfDay(2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.DateTime var29 = var27.withMinuteOfHour((-1377742992));
      fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test94"); }


    org.joda.time.chrono.JulianChronology var1 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var2 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var1);
    org.joda.time.LocalDate var3 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var1);
    org.joda.time.DurationField var4 = var1.eras();
    org.joda.time.DateTimeField var5 = var1.millisOfDay();
    org.joda.time.YearMonth var6 = new org.joda.time.YearMonth((-1000L), (org.joda.time.Chronology)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var6.toString("Months");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test95"); }


    org.joda.time.chrono.EthiopicChronology var0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
    org.joda.time.DateTimeField var1 = var0.dayOfYear();
    org.joda.time.chrono.IslamicChronology var2 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
    org.joda.time.format.DateTimeFormatter var3 = org.joda.time.format.ISODateTimeFormat.localDateParser();
    org.joda.time.DateTimeZone var4 = var3.getZone();
    org.joda.time.Chronology var5 = var2.withZone(var4);
    org.joda.time.Chronology var6 = var0.withZone(var4);
    org.joda.time.Duration var8 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var9 = new org.joda.time.MutableDateTime();
    var9.setWeekOfWeekyear(1);
    int var12 = var9.getRoundingMode();
    var9.addMillis(100);
    var9.setSecondOfMinute(10);
    org.joda.time.PeriodType var17 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var18 = new org.joda.time.Period((org.joda.time.ReadableDuration)var8, (org.joda.time.ReadableInstant)var9, var17);
    org.joda.time.Days var19 = var18.toStandardDays();
    org.joda.time.Hours var20 = var19.toStandardHours();
    java.lang.String var21 = var20.toString();
    org.joda.time.Days var22 = var20.toStandardDays();
    org.joda.time.Minutes var23 = var22.toStandardMinutes();
    org.joda.time.Duration var24 = var23.toStandardDuration();
    org.joda.time.chrono.JulianChronology var25 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var26 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var25);
    org.joda.time.LocalDate var27 = var26.toLocalDate();
    org.joda.time.MutableDateTime var28 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var29 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var26, (org.joda.time.ReadableInstant)var28);
    org.joda.time.MutableDateTime var30 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var31 = var30.year();
    boolean var32 = var28.isBefore((org.joda.time.ReadableInstant)var30);
    var30.addMonths(104);
    org.joda.time.PeriodType var35 = org.joda.time.PeriodType.yearDay();
    org.joda.time.Period var36 = var24.toPeriodTo((org.joda.time.ReadableInstant)var30, var35);
    int var37 = var35.size();
    org.joda.time.LocalDateTime var38 = org.joda.time.LocalDateTime.now();
    int var39 = var38.getDayOfYear();
    org.joda.time.Chronology var40 = var38.getChronology();
    org.joda.time.chrono.StrictChronology var41 = org.joda.time.chrono.StrictChronology.getInstance(var40);
    org.joda.time.DateTime var49 = new org.joda.time.DateTime(0, 4, 28, 1, 28, 1, 1);
    org.joda.time.LocalDate var50 = var49.toLocalDate();
    org.joda.time.LocalDate.Property var51 = var50.weekyear();
    long var53 = var41.set((org.joda.time.ReadablePartial)var50, 104L);
    org.joda.time.DateTimeField var54 = var41.dayOfYear();
    org.joda.time.chrono.EthiopicChronology var56 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var57 = var56.hours();
    org.joda.time.LocalTime var58 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var56);
    org.joda.time.LocalTime var60 = var58.withMillisOfSecond(1);
    org.joda.time.LocalTime var61 = org.joda.time.LocalTime.now();
    boolean var62 = var60.isAfter((org.joda.time.ReadablePartial)var61);
    org.joda.time.chrono.JulianChronology var63 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var64 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var63);
    org.joda.time.LocalDate var65 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var63);
    org.joda.time.DurationField var66 = var63.hours();
    boolean var67 = var61.equals((java.lang.Object)var63);
    org.joda.time.Duration var69 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var70 = new org.joda.time.MutableDateTime();
    var70.setWeekOfWeekyear(1);
    int var73 = var70.getRoundingMode();
    var70.addMillis(100);
    var70.setSecondOfMinute(10);
    org.joda.time.PeriodType var78 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var79 = new org.joda.time.Period((org.joda.time.ReadableDuration)var69, (org.joda.time.ReadableInstant)var70, var78);
    org.joda.time.Days var80 = var79.toStandardDays();
    org.joda.time.LocalTime var81 = var61.minus((org.joda.time.ReadablePeriod)var79);
    boolean var82 = var41.equals((java.lang.Object)var81);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.MutablePeriod var83 = new org.joda.time.MutablePeriod((java.lang.Object)var0, var35, (org.joda.time.Chronology)var41);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "PT0H"+ "'", var21.equals("PT0H"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-62157023999896L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test96"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.MutableDateTime var3 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var4 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var1, (org.joda.time.ReadableInstant)var3);
    org.joda.time.chrono.JulianChronology var5 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var6 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var5);
    org.joda.time.LocalDate var7 = var6.toLocalDate();
    org.joda.time.MutableDateTime var8 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var9 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var6, (org.joda.time.ReadableInstant)var8);
    org.joda.time.MutableDateTime var10 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var11 = var10.year();
    boolean var12 = var8.isBefore((org.joda.time.ReadableInstant)var10);
    org.joda.time.Duration var14 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var16 = org.joda.time.Duration.standardHours((-1L));
    boolean var17 = var14.isShorterThan((org.joda.time.ReadableDuration)var16);
    org.joda.time.Duration var19 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var21 = org.joda.time.Duration.standardHours((-1L));
    boolean var22 = var19.isShorterThan((org.joda.time.ReadableDuration)var21);
    org.joda.time.Duration var23 = var14.plus((org.joda.time.ReadableDuration)var19);
    var10.add((org.joda.time.ReadableDuration)var19);
    org.joda.time.Seconds var25 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant)var1, (org.joda.time.ReadableInstant)var10);
    org.joda.time.Weeks var26 = var25.toStandardWeeks();
    org.joda.time.Duration var27 = var26.toStandardDuration();
    org.joda.time.Duration var28 = var27.toDuration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test97"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.MutableDateTime var3 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var4 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var1, (org.joda.time.ReadableInstant)var3);
    org.joda.time.MutableDateTime var5 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var6 = var5.year();
    boolean var7 = var3.isBefore((org.joda.time.ReadableInstant)var5);
    org.joda.time.Duration var9 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var11 = org.joda.time.Duration.standardHours((-1L));
    boolean var12 = var9.isShorterThan((org.joda.time.ReadableDuration)var11);
    org.joda.time.Duration var14 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var16 = org.joda.time.Duration.standardHours((-1L));
    boolean var17 = var14.isShorterThan((org.joda.time.ReadableDuration)var16);
    org.joda.time.Duration var18 = var9.plus((org.joda.time.ReadableDuration)var14);
    var5.add((org.joda.time.ReadableDuration)var14);
    var5.setHourOfDay(10);
    var5.setDate(37L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test98"); }


    org.joda.time.Period var4 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var6 = var4.plusYears((-1));
    org.joda.time.Minutes var7 = var4.toStandardMinutes();
    org.joda.time.Minutes var9 = org.joda.time.Minutes.minutes(10);
    org.joda.time.Minutes var10 = var7.minus(var9);
    org.joda.time.Period var15 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var17 = var15.plusYears((-1));
    org.joda.time.Minutes var18 = var15.toStandardMinutes();
    org.joda.time.Minutes var19 = var7.plus(var18);
    org.joda.time.DurationFieldType var20 = var19.getFieldType();
    org.joda.time.Seconds var21 = var19.toStandardSeconds();
    int var22 = var21.getSeconds();
    org.joda.time.chrono.JulianChronology var23 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var24 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var23);
    org.joda.time.LocalDate var25 = var24.toLocalDate();
    org.joda.time.LocalDate var27 = var25.minusMonths(0);
    org.joda.time.DateTime var28 = var25.toDateTimeAtMidnight();
    org.joda.time.DateTime var30 = var28.withMillis(100L);
    org.joda.time.DateTime.Property var31 = var30.era();
    org.joda.time.TimeOfDay var32 = var30.toTimeOfDay();
    org.joda.time.TimeOfDay var34 = var32.plusSeconds(100);
    org.joda.time.chrono.JulianChronology var35 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var36 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var35);
    org.joda.time.LocalDate var37 = var36.toLocalDate();
    org.joda.time.MutableDateTime var38 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var39 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var36, (org.joda.time.ReadableInstant)var38);
    org.joda.time.chrono.JulianChronology var40 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var41 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var40);
    org.joda.time.LocalDate var42 = var41.toLocalDate();
    org.joda.time.MutableDateTime var43 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var44 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var41, (org.joda.time.ReadableInstant)var43);
    org.joda.time.MutableDateTime var45 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var46 = var45.year();
    boolean var47 = var43.isBefore((org.joda.time.ReadableInstant)var45);
    org.joda.time.Duration var49 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var51 = org.joda.time.Duration.standardHours((-1L));
    boolean var52 = var49.isShorterThan((org.joda.time.ReadableDuration)var51);
    org.joda.time.Duration var54 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var56 = org.joda.time.Duration.standardHours((-1L));
    boolean var57 = var54.isShorterThan((org.joda.time.ReadableDuration)var56);
    org.joda.time.Duration var58 = var49.plus((org.joda.time.ReadableDuration)var54);
    var45.add((org.joda.time.ReadableDuration)var54);
    org.joda.time.Seconds var60 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant)var36, (org.joda.time.ReadableInstant)var45);
    org.joda.time.Duration var61 = var60.toStandardDuration();
    org.joda.time.TimeOfDay var63 = var34.withPeriodAdded((org.joda.time.ReadablePeriod)var60, 948);
    org.joda.time.Seconds var64 = var21.minus(var60);
    org.joda.time.Period var65 = var64.toPeriod();
    org.joda.time.Period var67 = var65.plusSeconds(58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 8400);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test99"); }


    org.joda.time.chrono.ISOChronology var4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    java.lang.String var5 = var4.toString();
    org.joda.time.Chronology var6 = var4.withUTC();
    org.joda.time.MutableDateTime var7 = new org.joda.time.MutableDateTime(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.TimeOfDay var8 = new org.joda.time.TimeOfDay((-2), 2049, 194, 524, var6);
      fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "ISOChronology[UTC]"+ "'", var5.equals("ISOChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test100"); }


    org.joda.time.format.DateTimeFormatterBuilder var0 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var2 = var0.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var4 = var0.appendClockhourOfHalfday(692);
    org.joda.time.chrono.JulianChronology var5 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var6 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var5);
    org.joda.time.LocalDate var7 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var5);
    org.joda.time.DateTimeField var8 = var5.millisOfSecond();
    org.joda.time.chrono.EthiopicChronology var9 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var10 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var11 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var10);
    org.joda.time.LocalDate var12 = var11.toLocalDate();
    org.joda.time.LocalDate var14 = var12.minusMonths(0);
    int[] var16 = var9.get((org.joda.time.ReadablePartial)var14, 100L);
    org.joda.time.chrono.EthiopicChronology var20 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var21 = var20.hours();
    org.joda.time.LocalTime var22 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var20);
    org.joda.time.Period var23 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var20);
    org.joda.time.DateTimeField var24 = var20.millisOfSecond();
    org.joda.time.DateTimeField var25 = var20.secondOfDay();
    org.joda.time.field.SkipDateTimeField var27 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var9, var25, 100);
    org.joda.time.LocalDateTime var28 = org.joda.time.LocalDateTime.now();
    int var29 = var28.getDayOfYear();
    org.joda.time.Chronology var30 = var28.getChronology();
    int var31 = var28.getYearOfCentury();
    int var32 = var27.getMaximumValue((org.joda.time.ReadablePartial)var28);
    boolean var34 = var27.isLeap(1L);
    org.joda.time.LocalDateTime var35 = org.joda.time.LocalDateTime.now();
    int var36 = var35.getDayOfYear();
    int var37 = var27.getMinimumValue((org.joda.time.ReadablePartial)var35);
    org.joda.time.DurationField var38 = var27.getDurationField();
    org.joda.time.DateTimeFieldType var39 = var27.getType();
    org.joda.time.field.OffsetDateTimeField var43 = new org.joda.time.field.OffsetDateTimeField(var8, var39, 884, 3, 948);
    org.joda.time.IllegalFieldValueException var46 = new org.joda.time.IllegalFieldValueException(var39, (java.lang.Number)35L, "secondOfDay");
    org.joda.time.format.DateTimeFormatterBuilder var49 = var0.appendFraction(var39, 33, (-948));
    org.joda.time.chrono.EthiopicChronology var50 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var51 = var50.minutes();
    org.joda.time.DateTimeField var52 = var50.year();
    org.joda.time.DurationField var53 = var50.hours();
    org.joda.time.field.UnsupportedDateTimeField var54 = org.joda.time.field.UnsupportedDateTimeField.getInstance(var39, var53);
    long var57 = var54.add((-1000L), 1377742981L);
    boolean var58 = var54.isLenient();
    long var61 = var54.add(1377742999393L, 12194);
    int var64 = var54.getDifference(2762376429621796L, (-703463L));
    long var67 = var54.getDifferenceAsLong(1377735830915L, (-86390600L));
    java.lang.String var68 = var54.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var70 = var54.isLeap(382709L);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 4959874731599000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1421641399393L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 767326786);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 382728L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "secondOfDay"+ "'", var68.equals("secondOfDay"));

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test101"); }


    org.joda.time.DateTimeComparator var0 = org.joda.time.DateTimeComparator.getTimeOnlyInstance();
    org.joda.time.DateTimeFieldType var1 = var0.getUpperLimit();
    org.joda.time.DateTimeFieldType var2 = var0.getLowerLimit();
    org.joda.time.DateTimeFieldType var3 = var0.getLowerLimit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test102"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.MutableDateTime var3 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var4 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var1, (org.joda.time.ReadableInstant)var3);
    org.joda.time.MutableDateTime var5 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var6 = var5.year();
    boolean var7 = var3.isBefore((org.joda.time.ReadableInstant)var5);
    org.joda.time.Duration var9 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var11 = org.joda.time.Duration.standardHours((-1L));
    boolean var12 = var9.isShorterThan((org.joda.time.ReadableDuration)var11);
    org.joda.time.Duration var14 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var16 = org.joda.time.Duration.standardHours((-1L));
    boolean var17 = var14.isShorterThan((org.joda.time.ReadableDuration)var16);
    org.joda.time.Duration var18 = var9.plus((org.joda.time.ReadableDuration)var14);
    var5.add((org.joda.time.ReadableDuration)var14);
    var5.addDays(104);
    org.joda.time.MutableDateTime.Property var22 = var5.minuteOfDay();
    org.joda.time.DateTimeZone var24 = org.joda.time.DateTimeZone.forOffsetMillis(759);
    org.joda.time.DateTimeZone var25 = org.joda.time.DateTimeUtils.getZone(var24);
    java.lang.String var26 = var24.toString();
    var5.setZone(var24);
    java.lang.String var28 = var24.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.chrono.CopticChronology var30 = org.joda.time.chrono.CopticChronology.getInstance(var24, 529);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "+00:00:00.759"+ "'", var26.equals("+00:00:00.759"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "+00:00:00.759"+ "'", var28.equals("+00:00:00.759"));

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test103"); }


    org.joda.time.MutableDateTime var0 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var1 = var0.year();
    org.joda.time.MutableDateTime.Property var2 = var0.weekOfWeekyear();
    org.joda.time.chrono.JulianChronology var3 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var4 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var3);
    org.joda.time.Period var9 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var11 = var9.plusSeconds(100);
    org.joda.time.Period var13 = var9.minusMillis(10);
    boolean var14 = var4.equals((java.lang.Object)10);
    org.joda.time.Weeks var15 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant)var0, (org.joda.time.ReadableInstant)var4);
    org.joda.time.MutableDateTime var16 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var17 = var16.year();
    org.joda.time.MutableDateTime.Property var18 = var16.weekOfWeekyear();
    org.joda.time.chrono.JulianChronology var19 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var20 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var19);
    org.joda.time.Period var25 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var27 = var25.plusSeconds(100);
    org.joda.time.Period var29 = var25.minusMillis(10);
    boolean var30 = var20.equals((java.lang.Object)10);
    org.joda.time.Weeks var31 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant)var16, (org.joda.time.ReadableInstant)var20);
    org.joda.time.Weeks var32 = var15.minus(var31);
    org.joda.time.Weeks var34 = var31.minus(3);
    org.joda.time.Weeks var36 = var31.dividedBy(590);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test104"); }


    org.joda.time.chrono.EthiopicChronology var0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var1 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var2 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var1);
    org.joda.time.LocalDate var3 = var2.toLocalDate();
    org.joda.time.LocalDate var5 = var3.minusMonths(0);
    int[] var7 = var0.get((org.joda.time.ReadablePartial)var5, 100L);
    org.joda.time.chrono.EthiopicChronology var11 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var12 = var11.hours();
    org.joda.time.LocalTime var13 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var11);
    org.joda.time.Period var14 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var11);
    org.joda.time.DateTimeField var15 = var11.millisOfSecond();
    org.joda.time.DateTimeField var16 = var11.secondOfDay();
    org.joda.time.field.SkipDateTimeField var18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var0, var16, 100);
    org.joda.time.LocalDateTime var19 = org.joda.time.LocalDateTime.now();
    int var20 = var19.getDayOfYear();
    org.joda.time.Chronology var21 = var19.getChronology();
    int var22 = var19.getYearOfCentury();
    int var23 = var18.getMaximumValue((org.joda.time.ReadablePartial)var19);
    long var26 = var18.addWrapField(1377746581334L, 100);
    org.joda.time.DurationField var27 = var18.getRangeDurationField();
    org.joda.time.chrono.JulianChronology var28 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var29 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var28);
    org.joda.time.DateMidnight var31 = var29.plusDays(2013);
    org.joda.time.chrono.JulianChronology var32 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var33 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var32);
    org.joda.time.LocalDate var34 = var33.toLocalDate();
    org.joda.time.DateMidnight var36 = var33.minusWeeks((-1));
    org.joda.time.Duration var38 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var39 = new org.joda.time.MutableDateTime();
    var39.setWeekOfWeekyear(1);
    int var42 = var39.getRoundingMode();
    var39.addMillis(100);
    var39.setSecondOfMinute(10);
    org.joda.time.PeriodType var47 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var48 = new org.joda.time.Period((org.joda.time.ReadableDuration)var38, (org.joda.time.ReadableInstant)var39, var47);
    org.joda.time.Days var49 = var48.toStandardDays();
    org.joda.time.DurationFieldType var50 = var49.getFieldType();
    org.joda.time.DateMidnight var52 = var36.withFieldAdded(var50, 1);
    org.joda.time.field.PreciseDurationField var54 = new org.joda.time.field.PreciseDurationField(var50, 1L);
    org.joda.time.DateMidnight var56 = var31.withFieldAdded(var50, 228);
    org.joda.time.field.DecoratedDurationField var57 = new org.joda.time.field.DecoratedDurationField(var27, var50);
    long var60 = var57.add(1377768182707L, 100L);
    boolean var61 = var57.isPrecise();
    org.joda.time.DurationField var62 = var57.getWrappedField();
    long var63 = var57.getUnitMillis();
    org.joda.time.DurationField var64 = var57.getWrappedField();
    org.joda.time.PeriodType var65 = org.joda.time.PeriodType.months();
    java.lang.String var66 = var65.toString();
    org.joda.time.PeriodType var67 = org.joda.time.PeriodType.months();
    org.joda.time.Duration var69 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var70 = new org.joda.time.MutableDateTime();
    var70.setWeekOfWeekyear(1);
    int var73 = var70.getRoundingMode();
    var70.addMillis(100);
    var70.setSecondOfMinute(10);
    org.joda.time.PeriodType var78 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var79 = new org.joda.time.Period((org.joda.time.ReadableDuration)var69, (org.joda.time.ReadableInstant)var70, var78);
    org.joda.time.Days var80 = var79.toStandardDays();
    org.joda.time.DurationFieldType var81 = var80.getFieldType();
    int var82 = var67.indexOf(var81);
    boolean var83 = var65.isSupported(var81);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.Period var84 = new org.joda.time.Period((java.lang.Object)var64, var65);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1377746681334L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1386408182707L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 86400000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "PeriodType[Months]"+ "'", var66.equals("PeriodType[Months]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test105"); }


    org.joda.time.format.DateTimeFormatterBuilder var0 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var2 = var0.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var4 = var0.appendClockhourOfHalfday(692);
    org.joda.time.format.DateTimeFormatterBuilder var5 = var4.appendTimeZoneId();
    org.joda.time.format.DateTimeParser var6 = var5.toParser();
    org.joda.time.format.DateTimeFormatterBuilder var8 = var5.appendDayOfYear(34);
    org.joda.time.chrono.JulianChronology var9 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var10 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var9);
    org.joda.time.LocalDate var11 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var9);
    org.joda.time.DateTimeField var12 = var9.millisOfSecond();
    org.joda.time.chrono.EthiopicChronology var13 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var14 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var15 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var14);
    org.joda.time.LocalDate var16 = var15.toLocalDate();
    org.joda.time.LocalDate var18 = var16.minusMonths(0);
    int[] var20 = var13.get((org.joda.time.ReadablePartial)var18, 100L);
    org.joda.time.chrono.EthiopicChronology var24 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var25 = var24.hours();
    org.joda.time.LocalTime var26 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var24);
    org.joda.time.Period var27 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var24);
    org.joda.time.DateTimeField var28 = var24.millisOfSecond();
    org.joda.time.DateTimeField var29 = var24.secondOfDay();
    org.joda.time.field.SkipDateTimeField var31 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var13, var29, 100);
    org.joda.time.LocalDateTime var32 = org.joda.time.LocalDateTime.now();
    int var33 = var32.getDayOfYear();
    org.joda.time.Chronology var34 = var32.getChronology();
    int var35 = var32.getYearOfCentury();
    int var36 = var31.getMaximumValue((org.joda.time.ReadablePartial)var32);
    boolean var38 = var31.isLeap(1L);
    org.joda.time.LocalDateTime var39 = org.joda.time.LocalDateTime.now();
    int var40 = var39.getDayOfYear();
    int var41 = var31.getMinimumValue((org.joda.time.ReadablePartial)var39);
    org.joda.time.DurationField var42 = var31.getDurationField();
    org.joda.time.DateTimeFieldType var43 = var31.getType();
    org.joda.time.field.OffsetDateTimeField var47 = new org.joda.time.field.OffsetDateTimeField(var12, var43, 884, 3, 948);
    org.joda.time.IllegalFieldValueException var50 = new org.joda.time.IllegalFieldValueException(var43, (java.lang.Number)35L, "secondOfDay");
    org.joda.time.format.DateTimeFormatterBuilder var51 = var5.appendShortText(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test106"); }


    org.joda.time.chrono.EthiopicChronology var0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var1 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var2 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var1);
    org.joda.time.LocalDate var3 = var2.toLocalDate();
    org.joda.time.LocalDate var5 = var3.minusMonths(0);
    int[] var7 = var0.get((org.joda.time.ReadablePartial)var5, 100L);
    org.joda.time.chrono.EthiopicChronology var11 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var12 = var11.hours();
    org.joda.time.LocalTime var13 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var11);
    org.joda.time.Period var14 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var11);
    org.joda.time.DateTimeField var15 = var11.millisOfSecond();
    org.joda.time.DateTimeField var16 = var11.secondOfDay();
    org.joda.time.field.SkipDateTimeField var18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var0, var16, 100);
    org.joda.time.LocalDateTime var19 = org.joda.time.LocalDateTime.now();
    int var20 = var19.getDayOfYear();
    org.joda.time.Chronology var21 = var19.getChronology();
    int var22 = var19.getYearOfCentury();
    int var23 = var18.getMaximumValue((org.joda.time.ReadablePartial)var19);
    int var24 = var19.getSecondOfMinute();
    int var25 = var19.getDayOfYear();
    org.joda.time.LocalDateTime var27 = var19.withMillisOfSecond(692);
    org.joda.time.LocalDateTime var28 = org.joda.time.LocalDateTime.now();
    int var29 = var28.getDayOfYear();
    org.joda.time.Chronology var30 = var28.getChronology();
    org.joda.time.LocalDateTime var32 = var28.withYear((-1));
    int var33 = var19.compareTo((org.joda.time.ReadablePartial)var28);
    org.joda.time.TimeOfDay var34 = new org.joda.time.TimeOfDay();
    int var35 = var34.size();
    org.joda.time.chrono.EthiopicChronology var37 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var38 = var37.hours();
    org.joda.time.LocalTime var39 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var37);
    org.joda.time.LocalTime var41 = var39.withMillisOfSecond(1);
    org.joda.time.LocalTime var43 = var41.minusHours((-1));
    org.joda.time.Years var44 = org.joda.time.Years.yearsBetween((org.joda.time.ReadablePartial)var34, (org.joda.time.ReadablePartial)var43);
    int var45 = var34.getMillisOfSecond();
    org.joda.time.chrono.JulianChronology var46 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.TimeOfDay var47 = var34.withChronologyRetainFields((org.joda.time.Chronology)var46);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.Weeks var48 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadablePartial)var19, (org.joda.time.ReadablePartial)var34);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 288);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test107"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.LocalDate var4 = var2.minusMonths(0);
    org.joda.time.DateTime var5 = var2.toDateTimeAtMidnight();
    org.joda.time.DateTime var7 = var5.withMillis(100L);
    int var8 = var5.getWeekyear();
    org.joda.time.LocalDateTime var9 = var5.toLocalDateTime();
    org.joda.time.LocalTime var10 = var5.toLocalTime();
    org.joda.time.DateTime var12 = var5.plusHours(2005);
    org.joda.time.chrono.JulianChronology var13 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var14 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var13);
    org.joda.time.LocalDate var15 = var14.toLocalDate();
    org.joda.time.MutableDateTime var16 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var17 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var14, (org.joda.time.ReadableInstant)var16);
    org.joda.time.chrono.JulianChronology var18 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var19 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var18);
    org.joda.time.LocalDate var20 = var19.toLocalDate();
    org.joda.time.MutableDateTime var21 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var22 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var19, (org.joda.time.ReadableInstant)var21);
    org.joda.time.MutableDateTime var23 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var24 = var23.year();
    boolean var25 = var21.isBefore((org.joda.time.ReadableInstant)var23);
    org.joda.time.Duration var27 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var29 = org.joda.time.Duration.standardHours((-1L));
    boolean var30 = var27.isShorterThan((org.joda.time.ReadableDuration)var29);
    org.joda.time.Duration var32 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var34 = org.joda.time.Duration.standardHours((-1L));
    boolean var35 = var32.isShorterThan((org.joda.time.ReadableDuration)var34);
    org.joda.time.Duration var36 = var27.plus((org.joda.time.ReadableDuration)var32);
    var23.add((org.joda.time.ReadableDuration)var32);
    org.joda.time.Seconds var38 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant)var14, (org.joda.time.ReadableInstant)var23);
    org.joda.time.Duration var39 = var38.toStandardDuration();
    org.joda.time.DateTime var40 = var12.minus((org.joda.time.ReadableDuration)var39);
    org.joda.time.chrono.EthiopicChronology var41 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DateTimeField var42 = var41.dayOfYear();
    org.joda.time.YearMonthDay var43 = new org.joda.time.YearMonthDay((org.joda.time.Chronology)var41);
    org.joda.time.YearMonthDay var45 = var43.plusYears(13);
    org.joda.time.DateTimeZone var47 = org.joda.time.DateTimeZone.forOffsetMillis(33);
    org.joda.time.Interval var48 = var43.toInterval(var47);
    org.joda.time.DateMidnight var49 = var43.toDateMidnight();
    org.joda.time.DateMidnight var51 = var49.plus(1377742981000L);
    org.joda.time.Period var52 = new org.joda.time.Period((org.joda.time.ReadableInstant)var40, (org.joda.time.ReadableInstant)var49);
    org.joda.time.DateTime var54 = var40.plusMonths(567);
    org.joda.time.DateTime.Property var55 = var54.yearOfEra();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2013);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test108"); }


    org.joda.time.Period var4 = new org.joda.time.Period(1, 10, 10, 1);
    int var5 = var4.getWeeks();
    org.joda.time.Period var6 = var4.toPeriod();
    org.joda.time.Days var7 = var6.toStandardDays();
    org.joda.time.Days var9 = var7.multipliedBy(3975);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test109"); }


    org.joda.time.Period var4 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var6 = var4.plusYears((-1));
    org.joda.time.Period var8 = var4.minusWeeks(2057);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test110"); }


    org.joda.time.LocalTime var1 = org.joda.time.LocalTime.fromMillisOfDay(10L);
    int var2 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test111"); }


    org.joda.time.chrono.EthiopicChronology var0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DateTimeField var1 = var0.dayOfYear();
    org.joda.time.YearMonthDay var2 = new org.joda.time.YearMonthDay((org.joda.time.Chronology)var0);
    org.joda.time.YearMonthDay var4 = var2.plusDays((-1));
    org.joda.time.YearMonthDay.Property var5 = var2.year();
    org.joda.time.chrono.JulianChronology var6 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var7 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var6);
    org.joda.time.LocalDate var8 = var7.toLocalDate();
    org.joda.time.MutableDateTime var9 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var10 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var7, (org.joda.time.ReadableInstant)var9);
    org.joda.time.MutableDateTime var11 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var12 = var11.year();
    boolean var13 = var9.isBefore((org.joda.time.ReadableInstant)var11);
    org.joda.time.Duration var15 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var17 = org.joda.time.Duration.standardHours((-1L));
    boolean var18 = var15.isShorterThan((org.joda.time.ReadableDuration)var17);
    org.joda.time.Duration var20 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var22 = org.joda.time.Duration.standardHours((-1L));
    boolean var23 = var20.isShorterThan((org.joda.time.ReadableDuration)var22);
    org.joda.time.Duration var24 = var15.plus((org.joda.time.ReadableDuration)var20);
    var11.add((org.joda.time.ReadableDuration)var20);
    org.joda.time.Hours var26 = var20.toStandardHours();
    org.joda.time.YearMonthDay var28 = var2.withPeriodAdded((org.joda.time.ReadablePeriod)var26, 2013);
    org.joda.time.YearMonthDay var30 = var28.withDayOfMonth(23);
    org.joda.time.tz.FixedDateTimeZone var35 = new org.joda.time.tz.FixedDateTimeZone("P0D", "hi!", 28, 228);
    int var37 = var35.getOffsetFromLocal(1377742981323L);
    org.joda.time.DateTimeZone var39 = org.joda.time.DateTimeZone.forOffsetMillis(33);
    org.joda.time.chrono.JulianChronology var40 = org.joda.time.chrono.JulianChronology.getInstance(var39);
    long var42 = var35.getMillisKeepLocal(var39, 1377746580759L);
    int var44 = var35.getStandardOffset(1377768182707L);
    org.joda.time.DateTime var45 = var30.toDateTimeAtMidnight((org.joda.time.DateTimeZone)var35);
    org.joda.time.chrono.ISOChronology var46 = org.joda.time.chrono.ISOChronology.getInstance((org.joda.time.DateTimeZone)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1377746580754L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 228);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test112"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.LocalDate var4 = var2.withMonthOfYear(1);
    org.joda.time.LocalDate var6 = var2.withWeekyear(1);
    org.joda.time.LocalDate var8 = var2.withDayOfYear(1);
    org.joda.time.LocalDate var10 = var8.plusWeeks(73381948);
    org.joda.time.LocalDate var12 = var10.minusYears(8);
    org.joda.time.DateMidnight var13 = var10.toDateMidnight();
    org.joda.time.DateMidnight var15 = var13.withMillis(1377739436186L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test113"); }


    org.joda.time.tz.FixedDateTimeZone var4 = new org.joda.time.tz.FixedDateTimeZone("PT0H", "ISOChronology[UTC]", 100, 13);
    org.joda.time.PeriodType var5 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.MutablePeriod var6 = new org.joda.time.MutablePeriod(var5);
    var6.addDays(1);
    org.joda.time.Duration var10 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var12 = org.joda.time.Duration.standardHours((-1L));
    boolean var13 = var10.isShorterThan((org.joda.time.ReadableDuration)var12);
    var6.add((org.joda.time.ReadableDuration)var12);
    org.joda.time.MutableDateTime var15 = new org.joda.time.MutableDateTime();
    org.joda.time.MutablePeriod var16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)var12, (org.joda.time.ReadableInstant)var15);
    var16.clear();
    org.joda.time.MutableDateTime var18 = new org.joda.time.MutableDateTime();
    org.joda.time.chrono.JulianChronology var19 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var20 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var19);
    org.joda.time.LocalDate var21 = var20.toLocalDate();
    org.joda.time.MutableDateTime var22 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var23 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var20, (org.joda.time.ReadableInstant)var22);
    org.joda.time.MutableDateTime var24 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var25 = var24.year();
    boolean var26 = var22.isBefore((org.joda.time.ReadableInstant)var24);
    org.joda.time.Duration var28 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var30 = org.joda.time.Duration.standardHours((-1L));
    boolean var31 = var28.isShorterThan((org.joda.time.ReadableDuration)var30);
    org.joda.time.Duration var33 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var35 = org.joda.time.Duration.standardHours((-1L));
    boolean var36 = var33.isShorterThan((org.joda.time.ReadableDuration)var35);
    org.joda.time.Duration var37 = var28.plus((org.joda.time.ReadableDuration)var33);
    var24.add((org.joda.time.ReadableDuration)var33);
    org.joda.time.MutableDateTime.Property var39 = var24.dayOfWeek();
    var16.setPeriod((org.joda.time.ReadableInstant)var18, (org.joda.time.ReadableInstant)var24);
    boolean var41 = var4.equals((java.lang.Object)var16);
    int var42 = var16.getMinutes();
    int var43 = var16.getMonths();
    var16.setPeriod(13L, 1377739437840L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-59));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test114"); }


    org.joda.time.format.DateTimeFormatterBuilder var0 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var2 = var0.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var4 = var0.appendHourOfHalfday(759);
    org.joda.time.format.DateTimeFormatterBuilder var6 = var4.appendDayOfYear(12182);
    org.joda.time.chrono.EthiopicChronology var7 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var8 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var9 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var8);
    org.joda.time.LocalDate var10 = var9.toLocalDate();
    org.joda.time.LocalDate var12 = var10.minusMonths(0);
    int[] var14 = var7.get((org.joda.time.ReadablePartial)var12, 100L);
    org.joda.time.chrono.EthiopicChronology var18 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var19 = var18.hours();
    org.joda.time.LocalTime var20 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var18);
    org.joda.time.Period var21 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var18);
    org.joda.time.DateTimeField var22 = var18.millisOfSecond();
    org.joda.time.DateTimeField var23 = var18.secondOfDay();
    org.joda.time.field.SkipDateTimeField var25 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var7, var23, 100);
    org.joda.time.LocalDateTime var26 = org.joda.time.LocalDateTime.now();
    int var27 = var26.getDayOfYear();
    org.joda.time.Chronology var28 = var26.getChronology();
    int var29 = var26.getYearOfCentury();
    int var30 = var25.getMaximumValue((org.joda.time.ReadablePartial)var26);
    boolean var32 = var25.isLeap(1L);
    org.joda.time.LocalDateTime var33 = org.joda.time.LocalDateTime.now();
    int var34 = var33.getDayOfYear();
    int var35 = var25.getMinimumValue((org.joda.time.ReadablePartial)var33);
    org.joda.time.DurationField var36 = var25.getDurationField();
    org.joda.time.DateTimeFieldType var37 = var25.getType();
    org.joda.time.format.DateTimeFormatterBuilder var38 = var6.appendText(var37);
    boolean var39 = var6.canBuildPrinter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test115"); }


    org.joda.time.format.PeriodFormatter var0 = org.joda.time.format.PeriodFormat.wordBased();
    boolean var1 = var0.isPrinter();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.Period var3 = var0.parsePeriod("[]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test116"); }


    org.joda.time.chrono.JulianChronology var2 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var3 = new org.joda.time.DateMidnight((-1L), (org.joda.time.Chronology)var2);
    org.joda.time.LocalTime var4 = org.joda.time.LocalTime.fromMillisOfDay(1377768182707L, (org.joda.time.Chronology)var2);
    org.joda.time.DateTimeField var5 = var2.hourOfHalfday();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test117"); }


    org.joda.time.Partial var0 = new org.joda.time.Partial();
    java.lang.String var1 = var0.toString();
    int var2 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.getValue(126);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test118"); }


    org.joda.time.format.DateTimeFormatterBuilder var0 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var2 = var0.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var4 = var0.appendClockhourOfHalfday(692);
    org.joda.time.chrono.JulianChronology var5 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var6 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var5);
    org.joda.time.LocalDate var7 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var5);
    org.joda.time.DateTimeField var8 = var5.millisOfSecond();
    org.joda.time.chrono.EthiopicChronology var9 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var10 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var11 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var10);
    org.joda.time.LocalDate var12 = var11.toLocalDate();
    org.joda.time.LocalDate var14 = var12.minusMonths(0);
    int[] var16 = var9.get((org.joda.time.ReadablePartial)var14, 100L);
    org.joda.time.chrono.EthiopicChronology var20 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var21 = var20.hours();
    org.joda.time.LocalTime var22 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var20);
    org.joda.time.Period var23 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var20);
    org.joda.time.DateTimeField var24 = var20.millisOfSecond();
    org.joda.time.DateTimeField var25 = var20.secondOfDay();
    org.joda.time.field.SkipDateTimeField var27 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var9, var25, 100);
    org.joda.time.LocalDateTime var28 = org.joda.time.LocalDateTime.now();
    int var29 = var28.getDayOfYear();
    org.joda.time.Chronology var30 = var28.getChronology();
    int var31 = var28.getYearOfCentury();
    int var32 = var27.getMaximumValue((org.joda.time.ReadablePartial)var28);
    boolean var34 = var27.isLeap(1L);
    org.joda.time.LocalDateTime var35 = org.joda.time.LocalDateTime.now();
    int var36 = var35.getDayOfYear();
    int var37 = var27.getMinimumValue((org.joda.time.ReadablePartial)var35);
    org.joda.time.DurationField var38 = var27.getDurationField();
    org.joda.time.DateTimeFieldType var39 = var27.getType();
    org.joda.time.field.OffsetDateTimeField var43 = new org.joda.time.field.OffsetDateTimeField(var8, var39, 884, 3, 948);
    org.joda.time.IllegalFieldValueException var46 = new org.joda.time.IllegalFieldValueException(var39, (java.lang.Number)35L, "secondOfDay");
    org.joda.time.format.DateTimeFormatterBuilder var49 = var0.appendFraction(var39, 33, (-948));
    org.joda.time.chrono.EthiopicChronology var50 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var51 = var50.minutes();
    org.joda.time.DateTimeField var52 = var50.year();
    org.joda.time.DurationField var53 = var50.hours();
    org.joda.time.field.UnsupportedDateTimeField var54 = org.joda.time.field.UnsupportedDateTimeField.getInstance(var39, var53);
    long var57 = var54.add((-1000L), 1377742981L);
    boolean var58 = var54.isLenient();
    long var61 = var54.add(1377742999393L, 12194);
    int var64 = var54.getDifference(2762376429621796L, (-703463L));
    long var67 = var54.getDifferenceAsLong(1377735830915L, (-86390600L));
    long var70 = var54.add(604800000L, 35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var72 = var54.getLeapAmount((-62157023999896L));
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 4959874731599000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1421641399393L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 767326786);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 382728L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 730800000L);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test119"); }


    org.joda.time.chrono.EthiopicChronology var0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DateTimeField var1 = var0.dayOfYear();
    org.joda.time.YearMonthDay var2 = new org.joda.time.YearMonthDay((org.joda.time.Chronology)var0);
    org.joda.time.YearMonthDay var4 = var2.plusDays((-1));
    org.joda.time.DateTime var5 = var4.toDateTimeAtCurrentTime();
    org.joda.time.Duration var7 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var9 = org.joda.time.Duration.standardHours((-1L));
    boolean var10 = var7.isShorterThan((org.joda.time.ReadableDuration)var9);
    org.joda.time.Duration var12 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var14 = org.joda.time.Duration.standardHours((-1L));
    boolean var15 = var12.isShorterThan((org.joda.time.ReadableDuration)var14);
    org.joda.time.Duration var16 = var7.plus((org.joda.time.ReadableDuration)var12);
    org.joda.time.PeriodType var18 = org.joda.time.PeriodType.yearDay();
    org.joda.time.MutableDateTime var19 = new org.joda.time.MutableDateTime();
    var19.setWeekOfWeekyear(1);
    org.joda.time.chrono.JulianChronology var22 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    var19.setChronology((org.joda.time.Chronology)var22);
    org.joda.time.MutablePeriod var24 = new org.joda.time.MutablePeriod(0L, var18, (org.joda.time.Chronology)var22);
    org.joda.time.Duration var26 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var27 = new org.joda.time.MutableDateTime();
    var27.setWeekOfWeekyear(1);
    int var30 = var27.getRoundingMode();
    var27.addMillis(100);
    var27.setSecondOfMinute(10);
    org.joda.time.PeriodType var35 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var36 = new org.joda.time.Period((org.joda.time.ReadableDuration)var26, (org.joda.time.ReadableInstant)var27, var35);
    org.joda.time.Days var37 = var36.toStandardDays();
    org.joda.time.Duration var38 = var37.toStandardDuration();
    org.joda.time.chrono.EthiopicChronology var40 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var41 = var40.hours();
    org.joda.time.DateTimeField var42 = var40.minuteOfHour();
    org.joda.time.LocalDate var43 = new org.joda.time.LocalDate(1L, (org.joda.time.Chronology)var40);
    var24.setPeriod((org.joda.time.ReadableDuration)var38, (org.joda.time.Chronology)var40);
    int var45 = var16.compareTo((org.joda.time.ReadableDuration)var38);
    org.joda.time.Duration var46 = var38.toDuration();
    org.joda.time.DateTime var47 = var5.minus((org.joda.time.ReadableDuration)var38);
    org.joda.time.DateTime.Property var48 = var5.millisOfDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test120"); }


    org.joda.time.format.DateTimeFormatterBuilder var0 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var2 = var0.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var4 = var0.appendClockhourOfHalfday(692);
    org.joda.time.chrono.JulianChronology var5 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var6 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var5);
    org.joda.time.LocalDate var7 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var5);
    org.joda.time.DateTimeField var8 = var5.millisOfSecond();
    org.joda.time.chrono.EthiopicChronology var9 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var10 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var11 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var10);
    org.joda.time.LocalDate var12 = var11.toLocalDate();
    org.joda.time.LocalDate var14 = var12.minusMonths(0);
    int[] var16 = var9.get((org.joda.time.ReadablePartial)var14, 100L);
    org.joda.time.chrono.EthiopicChronology var20 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var21 = var20.hours();
    org.joda.time.LocalTime var22 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var20);
    org.joda.time.Period var23 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var20);
    org.joda.time.DateTimeField var24 = var20.millisOfSecond();
    org.joda.time.DateTimeField var25 = var20.secondOfDay();
    org.joda.time.field.SkipDateTimeField var27 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var9, var25, 100);
    org.joda.time.LocalDateTime var28 = org.joda.time.LocalDateTime.now();
    int var29 = var28.getDayOfYear();
    org.joda.time.Chronology var30 = var28.getChronology();
    int var31 = var28.getYearOfCentury();
    int var32 = var27.getMaximumValue((org.joda.time.ReadablePartial)var28);
    boolean var34 = var27.isLeap(1L);
    org.joda.time.LocalDateTime var35 = org.joda.time.LocalDateTime.now();
    int var36 = var35.getDayOfYear();
    int var37 = var27.getMinimumValue((org.joda.time.ReadablePartial)var35);
    org.joda.time.DurationField var38 = var27.getDurationField();
    org.joda.time.DateTimeFieldType var39 = var27.getType();
    org.joda.time.field.OffsetDateTimeField var43 = new org.joda.time.field.OffsetDateTimeField(var8, var39, 884, 3, 948);
    org.joda.time.IllegalFieldValueException var46 = new org.joda.time.IllegalFieldValueException(var39, (java.lang.Number)35L, "secondOfDay");
    org.joda.time.format.DateTimeFormatterBuilder var49 = var0.appendFraction(var39, 33, (-948));
    org.joda.time.chrono.EthiopicChronology var50 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var51 = var50.minutes();
    org.joda.time.DateTimeField var52 = var50.year();
    org.joda.time.DurationField var53 = var50.hours();
    org.joda.time.field.UnsupportedDateTimeField var54 = org.joda.time.field.UnsupportedDateTimeField.getInstance(var39, var53);
    long var57 = var54.add((-1000L), 1377742981L);
    boolean var58 = var54.isLenient();
    long var61 = var54.add(1377742999393L, 12194);
    int var64 = var54.getDifference(2762376429621796L, (-703463L));
    long var67 = var54.getDifferenceAsLong(1377735830915L, (-86390600L));
    java.lang.String var68 = var54.getName();
    java.lang.String var69 = var54.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 4959874731599000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1421641399393L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 767326786);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 382728L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "secondOfDay"+ "'", var68.equals("secondOfDay"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "secondOfDay"+ "'", var69.equals("secondOfDay"));

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test121"); }


    org.joda.time.chrono.EthiopicChronology var3 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var4 = var3.hours();
    org.joda.time.LocalTime var5 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var3);
    org.joda.time.Period var6 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var3);
    org.joda.time.DateTimeField var7 = var3.millisOfSecond();
    org.joda.time.chrono.EthiopicChronology var9 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var10 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var11 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var10);
    org.joda.time.LocalDate var12 = var11.toLocalDate();
    org.joda.time.LocalDate var14 = var12.minusMonths(0);
    int[] var16 = var9.get((org.joda.time.ReadablePartial)var14, 100L);
    org.joda.time.DateTime var17 = new org.joda.time.DateTime(1377746581334L, (org.joda.time.Chronology)var9);
    org.joda.time.chrono.EthiopicChronology var21 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var22 = var21.hours();
    org.joda.time.LocalTime var23 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var21);
    org.joda.time.Period var24 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var21);
    org.joda.time.DateTimeField var25 = var21.millisOfSecond();
    org.joda.time.field.SkipDateTimeField var26 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var9, var25);
    org.joda.time.DateTimeField var27 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField)var26);
    int var28 = var26.getMinimumValue();
    org.joda.time.field.SkipUndoDateTimeField var30 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology)var3, (org.joda.time.DateTimeField)var26, 19);
    org.joda.time.DurationField var31 = var30.getLeapDurationField();
    int var33 = var30.getMaximumValue(1325559981L);
    int var35 = var30.getMaximumValue(104L);
    int var36 = var30.getMinimumValue();
    int var37 = var30.getMinimumValue();
    org.joda.time.DurationField var38 = var30.getDurationField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 999);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 999);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test122"); }


    org.joda.time.MutableInterval var0 = new org.joda.time.MutableInterval();
    org.joda.time.MutableInterval var1 = var0.copy();
    org.joda.time.DateTime var2 = var1.getStart();
    java.util.Date var3 = var2.toDate();
    org.joda.time.DateTime var4 = var2.withLaterOffsetAtOverlap();
    org.joda.time.DateTime var6 = var2.withWeekyear(240);
    org.joda.time.LocalDateTime var7 = org.joda.time.LocalDateTime.now();
    int var8 = var7.getDayOfYear();
    org.joda.time.Chronology var9 = var7.getChronology();
    org.joda.time.LocalDateTime var11 = var7.withYear(1);
    org.joda.time.chrono.ISOChronology var12 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    java.lang.String var13 = var12.toString();
    org.joda.time.Chronology var14 = var12.withUTC();
    org.joda.time.MutableDateTime var15 = new org.joda.time.MutableDateTime(var14);
    org.joda.time.LocalDate var16 = new org.joda.time.LocalDate((java.lang.Object)var11, var14);
    org.joda.time.DateTime var17 = var6.toDateTime(var14);
    org.joda.time.DateTime var19 = var6.plusMillis(46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "ISOChronology[UTC]"+ "'", var13.equals("ISOChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test123"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.LocalDate var4 = var2.minusMonths(0);
    org.joda.time.DateTime var5 = var2.toDateTimeAtMidnight();
    org.joda.time.DateTime var7 = var5.withMillis(100L);
    int var8 = var5.getWeekyear();
    org.joda.time.LocalDateTime var9 = var5.toLocalDateTime();
    org.joda.time.LocalTime var10 = var5.toLocalTime();
    org.joda.time.DateTime var12 = var5.minusSeconds(35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.joda.time.DateTime var14 = var12.withSecondOfMinute(928);
      fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2013);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test124"); }


    org.joda.time.LocalDateTime var0 = org.joda.time.LocalDateTime.now();
    int var1 = var0.getDayOfYear();
    org.joda.time.Chronology var2 = var0.getChronology();
    org.joda.time.LocalDateTime.Property var3 = var0.centuryOfEra();
    org.joda.time.LocalDateTime var5 = var0.plusMinutes(2013);
    org.joda.time.DateTimeFieldType[] var6 = var0.getFieldTypes();
    org.joda.time.LocalDateTime var8 = var0.withCenturyOfEra(124);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test125"); }


    org.joda.time.format.DateTimeFormatterBuilder var0 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var2 = var0.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var5 = var0.appendYear(23, 8);
    org.joda.time.format.DateTimeFormatterBuilder var7 = var5.appendWeekOfWeekyear(13);
    org.joda.time.format.DateTimeFormatter var8 = org.joda.time.format.ISODateTimeFormat.yearMonth();
    org.joda.time.format.DateTimeFormatterBuilder var9 = var7.append(var8);
    org.joda.time.format.DateTimePrinter var10 = var9.toPrinter();
    org.joda.time.format.DateTimeFormatterBuilder var13 = var9.appendYearOfEra(15795333, 240);
    org.joda.time.format.DateTimeFormatterBuilder var15 = var9.appendHourOfHalfday(8400);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test126"); }


    org.joda.time.format.DateTimeFormatterBuilder var0 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.joda.time.format.DateTimeFormatterBuilder var2 = var0.appendClockhourOfHalfday(22);
    org.joda.time.format.DateTimeFormatterBuilder var4 = var0.appendClockhourOfHalfday(692);
    org.joda.time.chrono.JulianChronology var5 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var6 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var5);
    org.joda.time.LocalDate var7 = org.joda.time.LocalDate.now((org.joda.time.Chronology)var5);
    org.joda.time.DateTimeField var8 = var5.millisOfSecond();
    org.joda.time.chrono.EthiopicChronology var9 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var10 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var11 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var10);
    org.joda.time.LocalDate var12 = var11.toLocalDate();
    org.joda.time.LocalDate var14 = var12.minusMonths(0);
    int[] var16 = var9.get((org.joda.time.ReadablePartial)var14, 100L);
    org.joda.time.chrono.EthiopicChronology var20 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var21 = var20.hours();
    org.joda.time.LocalTime var22 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var20);
    org.joda.time.Period var23 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var20);
    org.joda.time.DateTimeField var24 = var20.millisOfSecond();
    org.joda.time.DateTimeField var25 = var20.secondOfDay();
    org.joda.time.field.SkipDateTimeField var27 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var9, var25, 100);
    org.joda.time.LocalDateTime var28 = org.joda.time.LocalDateTime.now();
    int var29 = var28.getDayOfYear();
    org.joda.time.Chronology var30 = var28.getChronology();
    int var31 = var28.getYearOfCentury();
    int var32 = var27.getMaximumValue((org.joda.time.ReadablePartial)var28);
    boolean var34 = var27.isLeap(1L);
    org.joda.time.LocalDateTime var35 = org.joda.time.LocalDateTime.now();
    int var36 = var35.getDayOfYear();
    int var37 = var27.getMinimumValue((org.joda.time.ReadablePartial)var35);
    org.joda.time.DurationField var38 = var27.getDurationField();
    org.joda.time.DateTimeFieldType var39 = var27.getType();
    org.joda.time.field.OffsetDateTimeField var43 = new org.joda.time.field.OffsetDateTimeField(var8, var39, 884, 3, 948);
    org.joda.time.IllegalFieldValueException var46 = new org.joda.time.IllegalFieldValueException(var39, (java.lang.Number)35L, "secondOfDay");
    org.joda.time.format.DateTimeFormatterBuilder var49 = var0.appendFraction(var39, 33, (-948));
    org.joda.time.chrono.EthiopicChronology var50 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var51 = var50.minutes();
    org.joda.time.DateTimeField var52 = var50.year();
    org.joda.time.DurationField var53 = var50.hours();
    org.joda.time.field.UnsupportedDateTimeField var54 = org.joda.time.field.UnsupportedDateTimeField.getInstance(var39, var53);
    long var57 = var54.add(1377746581334L, (-15946L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var60 = var54.set(1377746597600L, "8597 seconds");
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1320340981334L);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test127"); }


    org.joda.time.Duration var1 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var2 = new org.joda.time.MutableDateTime();
    var2.setWeekOfWeekyear(1);
    int var5 = var2.getRoundingMode();
    var2.addMillis(100);
    var2.setSecondOfMinute(10);
    org.joda.time.PeriodType var10 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var11 = new org.joda.time.Period((org.joda.time.ReadableDuration)var1, (org.joda.time.ReadableInstant)var2, var10);
    org.joda.time.Days var12 = var11.toStandardDays();
    org.joda.time.chrono.JulianChronology var13 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var14 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var13);
    org.joda.time.Period var19 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var21 = var19.plusSeconds(100);
    org.joda.time.Period var23 = var19.minusMillis(10);
    boolean var24 = var14.equals((java.lang.Object)10);
    org.joda.time.DateMidnight.Property var25 = var14.dayOfYear();
    org.joda.time.chrono.JulianChronology var26 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var27 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var26);
    org.joda.time.LocalDate var28 = var27.toLocalDate();
    org.joda.time.LocalDate var30 = var28.minusMonths(0);
    org.joda.time.DateTime var31 = var28.toDateTimeAtMidnight();
    org.joda.time.DateTime var33 = var31.withCenturyOfEra(4);
    org.joda.time.Days var34 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant)var14, (org.joda.time.ReadableInstant)var33);
    org.joda.time.Days var36 = var34.dividedBy(1);
    boolean var37 = var12.isGreaterThan(var34);
    org.joda.time.Days var39 = var12.dividedBy(100);
    int var40 = var39.getDays();
    org.joda.time.Days var42 = var39.plus(765);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test128"); }


    org.joda.time.MonthDay var0 = new org.joda.time.MonthDay();
    org.joda.time.LocalDate var2 = var0.toLocalDate(14400001);
    int var3 = var0.getDayOfMonth();
    org.joda.time.Duration var5 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var6 = new org.joda.time.MutableDateTime();
    var6.setWeekOfWeekyear(1);
    int var9 = var6.getRoundingMode();
    var6.addMillis(100);
    var6.setSecondOfMinute(10);
    org.joda.time.PeriodType var14 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var15 = new org.joda.time.Period((org.joda.time.ReadableDuration)var5, (org.joda.time.ReadableInstant)var6, var14);
    org.joda.time.Days var16 = var15.toStandardDays();
    org.joda.time.Hours var17 = var16.toStandardHours();
    java.lang.String var18 = var17.toString();
    org.joda.time.Hours var19 = var17.negated();
    org.joda.time.Days var20 = var19.toStandardDays();
    org.joda.time.MonthDay var21 = var0.minus((org.joda.time.ReadablePeriod)var20);
    org.joda.time.LocalDate var23 = var21.toLocalDate(126);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "PT0H"+ "'", var18.equals("PT0H"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test129"); }


    org.joda.time.TimeOfDay var0 = new org.joda.time.TimeOfDay();
    int var1 = var0.size();
    org.joda.time.TimeOfDay var3 = var0.withMillisOfSecond(1);
    org.joda.time.Years var5 = org.joda.time.Years.years((-1));
    org.joda.time.PeriodType var6 = var5.getPeriodType();
    org.joda.time.Years var8 = org.joda.time.Years.years((-1));
    int var9 = var5.compareTo((org.joda.time.base.BaseSingleFieldPeriod)var8);
    org.joda.time.Years var11 = org.joda.time.Years.years((-1));
    org.joda.time.PeriodType var12 = var11.getPeriodType();
    org.joda.time.Years var13 = var8.minus(var11);
    org.joda.time.TimeOfDay var14 = var3.minus((org.joda.time.ReadablePeriod)var8);
    org.joda.time.TimeOfDay var16 = var3.minusSeconds(2049);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test130"); }


    org.joda.time.DateTime var0 = org.joda.time.DateTime.now();
    org.joda.time.DateTime var2 = var0.withMillis(0L);
    org.joda.time.DateTime var4 = var0.minusMonths(33);
    org.joda.time.DateTime var5 = var0.withLaterOffsetAtOverlap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test131"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.MutableDateTime var3 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var4 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var1, (org.joda.time.ReadableInstant)var3);
    org.joda.time.MutableDateTime var5 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var6 = var5.year();
    boolean var7 = var3.isBefore((org.joda.time.ReadableInstant)var5);
    org.joda.time.Duration var9 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var11 = org.joda.time.Duration.standardHours((-1L));
    boolean var12 = var9.isShorterThan((org.joda.time.ReadableDuration)var11);
    org.joda.time.Duration var14 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var16 = org.joda.time.Duration.standardHours((-1L));
    boolean var17 = var14.isShorterThan((org.joda.time.ReadableDuration)var16);
    org.joda.time.Duration var18 = var9.plus((org.joda.time.ReadableDuration)var14);
    var5.add((org.joda.time.ReadableDuration)var14);
    var5.addDays(104);
    var5.addMillis(216);
    int var24 = var5.getRoundingMode();
    org.joda.time.chrono.JulianChronology var25 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var26 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var25);
    org.joda.time.DateMidnight var28 = var26.plusDays(2013);
    org.joda.time.DateMidnight var30 = var28.withDayOfMonth(10);
    org.joda.time.DateMidnight.Property var31 = var30.yearOfCentury();
    org.joda.time.Chronology var32 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant)var5, (org.joda.time.ReadableInstant)var30);
    int var33 = var5.getYearOfEra();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2013);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test132"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.DateMidnight var4 = var1.minusWeeks((-1));
    org.joda.time.Duration var6 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var7 = new org.joda.time.MutableDateTime();
    var7.setWeekOfWeekyear(1);
    int var10 = var7.getRoundingMode();
    var7.addMillis(100);
    var7.setSecondOfMinute(10);
    org.joda.time.PeriodType var15 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var16 = new org.joda.time.Period((org.joda.time.ReadableDuration)var6, (org.joda.time.ReadableInstant)var7, var15);
    org.joda.time.Days var17 = var16.toStandardDays();
    org.joda.time.DurationFieldType var18 = var17.getFieldType();
    org.joda.time.DateMidnight var20 = var4.withFieldAdded(var18, 1);
    org.joda.time.chrono.JulianChronology var21 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var22 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var21);
    org.joda.time.LocalDate var23 = var22.toLocalDate();
    org.joda.time.DateMidnight var25 = var22.minusWeeks((-1));
    org.joda.time.Duration var27 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var28 = new org.joda.time.MutableDateTime();
    var28.setWeekOfWeekyear(1);
    int var31 = var28.getRoundingMode();
    var28.addMillis(100);
    var28.setSecondOfMinute(10);
    org.joda.time.PeriodType var36 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var37 = new org.joda.time.Period((org.joda.time.ReadableDuration)var27, (org.joda.time.ReadableInstant)var28, var36);
    org.joda.time.Days var38 = var37.toStandardDays();
    org.joda.time.DurationFieldType var39 = var38.getFieldType();
    org.joda.time.DateMidnight var41 = var25.withFieldAdded(var39, 1);
    org.joda.time.DateMidnight var43 = var4.withFieldAdded(var39, 13);
    java.util.GregorianCalendar var44 = var43.toGregorianCalendar();
    org.joda.time.LocalDateTime var45 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar)var44);
    org.joda.time.YearMonthDay var46 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar)var44);
    org.joda.time.MonthDay var47 = org.joda.time.MonthDay.fromCalendarFields((java.util.Calendar)var44);
    org.joda.time.YearMonth var48 = org.joda.time.YearMonth.fromCalendarFields((java.util.Calendar)var44);
    org.joda.time.Duration var50 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var51 = new org.joda.time.MutableDateTime();
    var51.setWeekOfWeekyear(1);
    int var54 = var51.getRoundingMode();
    var51.addMillis(100);
    var51.setSecondOfMinute(10);
    org.joda.time.PeriodType var59 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var60 = new org.joda.time.Period((org.joda.time.ReadableDuration)var50, (org.joda.time.ReadableInstant)var51, var59);
    org.joda.time.Days var61 = var60.toStandardDays();
    org.joda.time.Hours var62 = var61.toStandardHours();
    java.lang.String var63 = var62.toString();
    org.joda.time.Days var64 = var62.toStandardDays();
    org.joda.time.Minutes var65 = var64.toStandardMinutes();
    org.joda.time.Duration var66 = var65.toStandardDuration();
    org.joda.time.Duration var67 = var65.toStandardDuration();
    org.joda.time.Minutes var68 = var65.negated();
    org.joda.time.YearMonth var69 = var48.plus((org.joda.time.ReadablePeriod)var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "PT0H"+ "'", var63.equals("PT0H"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test133"); }


    org.joda.time.DateTimeZone var1 = org.joda.time.DateTimeZone.forOffsetMillis(759);
    org.joda.time.DateTimeZone var2 = org.joda.time.DateTimeUtils.getZone(var1);
    boolean var4 = var1.isStandardOffset(1377742999393L);
    org.joda.time.TimeOfDay var5 = new org.joda.time.TimeOfDay(var1);
    org.joda.time.MutableDateTime var6 = new org.joda.time.MutableDateTime();
    var6.setWeekOfWeekyear(1);
    org.joda.time.chrono.JulianChronology var9 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    var6.setChronology((org.joda.time.Chronology)var9);
    org.joda.time.DateTimeField var11 = var9.clockhourOfHalfday();
    org.joda.time.YearMonth var12 = new org.joda.time.YearMonth((org.joda.time.Chronology)var9);
    org.joda.time.YearMonth var14 = var12.plusMonths(69781948);
    org.joda.time.Period var19 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var21 = var19.plusYears((-1));
    org.joda.time.Minutes var22 = var19.toStandardMinutes();
    org.joda.time.Minutes var24 = org.joda.time.Minutes.minutes(10);
    org.joda.time.Minutes var25 = var22.minus(var24);
    org.joda.time.PeriodType var26 = var22.getPeriodType();
    int var27 = var22.getMinutes();
    org.joda.time.YearMonth var29 = var14.withPeriodAdded((org.joda.time.ReadablePeriod)var22, 69781948);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var30 = var5.isAfter((org.joda.time.ReadablePartial)var14);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test134"); }


    org.joda.time.chrono.JulianChronology var0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var1 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var0);
    org.joda.time.LocalDate var2 = var1.toLocalDate();
    org.joda.time.DateMidnight var4 = var1.minusWeeks((-1));
    org.joda.time.Duration var6 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var7 = new org.joda.time.MutableDateTime();
    var7.setWeekOfWeekyear(1);
    int var10 = var7.getRoundingMode();
    var7.addMillis(100);
    var7.setSecondOfMinute(10);
    org.joda.time.PeriodType var15 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var16 = new org.joda.time.Period((org.joda.time.ReadableDuration)var6, (org.joda.time.ReadableInstant)var7, var15);
    org.joda.time.Days var17 = var16.toStandardDays();
    org.joda.time.DurationFieldType var18 = var17.getFieldType();
    org.joda.time.DateMidnight var20 = var4.withFieldAdded(var18, 1);
    org.joda.time.MutableInterval var21 = new org.joda.time.MutableInterval();
    org.joda.time.MutableInterval var22 = var21.copy();
    org.joda.time.DateTime var23 = var22.getStart();
    org.joda.time.Duration var25 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var27 = org.joda.time.Duration.standardHours((-1L));
    boolean var28 = var25.isShorterThan((org.joda.time.ReadableDuration)var27);
    org.joda.time.Duration var29 = var25.toDuration();
    org.joda.time.chrono.JulianChronology var30 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var31 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var30);
    org.joda.time.LocalDate var32 = var31.toLocalDate();
    org.joda.time.MutableDateTime var33 = new org.joda.time.MutableDateTime();
    org.joda.time.Years var34 = org.joda.time.Years.yearsBetween((org.joda.time.ReadableInstant)var31, (org.joda.time.ReadableInstant)var33);
    org.joda.time.MutableDateTime var35 = new org.joda.time.MutableDateTime();
    org.joda.time.MutableDateTime.Property var36 = var35.year();
    boolean var37 = var33.isBefore((org.joda.time.ReadableInstant)var35);
    org.joda.time.Duration var39 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var41 = org.joda.time.Duration.standardHours((-1L));
    boolean var42 = var39.isShorterThan((org.joda.time.ReadableDuration)var41);
    org.joda.time.Duration var44 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var46 = org.joda.time.Duration.standardHours((-1L));
    boolean var47 = var44.isShorterThan((org.joda.time.ReadableDuration)var46);
    org.joda.time.Duration var48 = var39.plus((org.joda.time.ReadableDuration)var44);
    var35.add((org.joda.time.ReadableDuration)var44);
    org.joda.time.PeriodType var50 = org.joda.time.PeriodType.months();
    org.joda.time.Period var51 = new org.joda.time.Period((org.joda.time.ReadableDuration)var25, (org.joda.time.ReadableInstant)var35, var50);
    org.joda.time.MutablePeriod var52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant)var4, (org.joda.time.ReadableInstant)var23, var50);
    org.joda.time.DateMidnight var54 = var4.withYear(33);
    org.joda.time.LocalDateTime var56 = org.joda.time.LocalDateTime.now();
    int var57 = var56.getDayOfYear();
    org.joda.time.LocalDateTime var59 = var56.minusSeconds(2005);
    org.joda.time.LocalDateTime var61 = var59.withMillisOfSecond(16);
    int var62 = var61.getMillisOfSecond();
    org.joda.time.tz.FixedDateTimeZone var67 = new org.joda.time.tz.FixedDateTimeZone("P0D", "hi!", 28, 228);
    int var69 = var67.getOffsetFromLocal(1377742981323L);
    org.joda.time.DateTimeZone var71 = org.joda.time.DateTimeZone.forOffsetMillis(33);
    org.joda.time.chrono.JulianChronology var72 = org.joda.time.chrono.JulianChronology.getInstance(var71);
    long var74 = var67.getMillisKeepLocal(var71, 1377746580759L);
    org.joda.time.DateTime var75 = var61.toDateTime((org.joda.time.DateTimeZone)var67);
    org.joda.time.DateMidnight var76 = new org.joda.time.DateMidnight((org.joda.time.DateTimeZone)var67);
    boolean var77 = var67.isFixed();
    org.joda.time.DateTime var78 = new org.joda.time.DateTime(81326L, (org.joda.time.DateTimeZone)var67);
    org.joda.time.DateMidnight var79 = var4.withZoneRetainFields((org.joda.time.DateTimeZone)var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1377746580754L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test135"); }


    org.joda.time.chrono.GJChronology var0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    int var1 = var0.getMinimumDaysInFirstWeek();
    org.joda.time.Chronology var2 = var0.withUTC();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test136"); }


    org.joda.time.chrono.EthiopicChronology var0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var1 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var2 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var1);
    org.joda.time.LocalDate var3 = var2.toLocalDate();
    org.joda.time.LocalDate var5 = var3.minusMonths(0);
    int[] var7 = var0.get((org.joda.time.ReadablePartial)var5, 100L);
    org.joda.time.chrono.EthiopicChronology var11 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var12 = var11.hours();
    org.joda.time.LocalTime var13 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var11);
    org.joda.time.Period var14 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var11);
    org.joda.time.DateTimeField var15 = var11.millisOfSecond();
    org.joda.time.DateTimeField var16 = var11.secondOfDay();
    org.joda.time.field.SkipDateTimeField var18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var0, var16, 100);
    org.joda.time.LocalDateTime var19 = org.joda.time.LocalDateTime.now();
    int var20 = var19.getDayOfYear();
    org.joda.time.Chronology var21 = var19.getChronology();
    int var22 = var19.getYearOfCentury();
    int var23 = var18.getMaximumValue((org.joda.time.ReadablePartial)var19);
    long var26 = var18.addWrapField(1377746581334L, 100);
    org.joda.time.DurationField var27 = var18.getRangeDurationField();
    org.joda.time.chrono.JulianChronology var28 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var29 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var28);
    org.joda.time.DateMidnight var31 = var29.plusDays(2013);
    org.joda.time.chrono.JulianChronology var32 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var33 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var32);
    org.joda.time.LocalDate var34 = var33.toLocalDate();
    org.joda.time.DateMidnight var36 = var33.minusWeeks((-1));
    org.joda.time.Duration var38 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var39 = new org.joda.time.MutableDateTime();
    var39.setWeekOfWeekyear(1);
    int var42 = var39.getRoundingMode();
    var39.addMillis(100);
    var39.setSecondOfMinute(10);
    org.joda.time.PeriodType var47 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var48 = new org.joda.time.Period((org.joda.time.ReadableDuration)var38, (org.joda.time.ReadableInstant)var39, var47);
    org.joda.time.Days var49 = var48.toStandardDays();
    org.joda.time.DurationFieldType var50 = var49.getFieldType();
    org.joda.time.DateMidnight var52 = var36.withFieldAdded(var50, 1);
    org.joda.time.field.PreciseDurationField var54 = new org.joda.time.field.PreciseDurationField(var50, 1L);
    org.joda.time.DateMidnight var56 = var31.withFieldAdded(var50, 228);
    org.joda.time.field.DecoratedDurationField var57 = new org.joda.time.field.DecoratedDurationField(var27, var50);
    long var60 = var57.add(1377746681334L, 9);
    org.joda.time.Duration var62 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.MutableDateTime var63 = new org.joda.time.MutableDateTime();
    var63.setWeekOfWeekyear(1);
    int var66 = var63.getRoundingMode();
    var63.addMillis(100);
    var63.setSecondOfMinute(10);
    org.joda.time.PeriodType var71 = org.joda.time.PeriodType.yearWeekDayTime();
    org.joda.time.Period var72 = new org.joda.time.Period((org.joda.time.ReadableDuration)var62, (org.joda.time.ReadableInstant)var63, var71);
    org.joda.time.Days var73 = var72.toStandardDays();
    org.joda.time.DurationFieldType var74 = var73.getFieldType();
    org.joda.time.field.DecoratedDurationField var75 = new org.joda.time.field.DecoratedDurationField((org.joda.time.DurationField)var57, var74);
    org.joda.time.field.UnsupportedDurationField var76 = org.joda.time.field.UnsupportedDurationField.getInstance(var74);
    java.lang.String var77 = var76.getName();
    long var78 = var76.getUnitMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1377746681334L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1378524281334L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "days"+ "'", var77.equals("days"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0L);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test137"); }


    org.joda.time.chrono.JulianChronology var1 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var2 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var1);
    org.joda.time.LocalDate var3 = var2.toLocalDate();
    org.joda.time.LocalDate var5 = var3.withMonthOfYear(1);
    org.joda.time.LocalDate var7 = var5.withEra(1);
    org.joda.time.LocalDate.Property var8 = var5.yearOfCentury();
    org.joda.time.Period var13 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var15 = var13.plusYears((-1));
    org.joda.time.Minutes var16 = var13.toStandardMinutes();
    org.joda.time.Minutes var18 = org.joda.time.Minutes.minutes(10);
    org.joda.time.Minutes var19 = var16.minus(var18);
    org.joda.time.PeriodType var20 = var16.getPeriodType();
    boolean var21 = var5.equals((java.lang.Object)var20);
    org.joda.time.chrono.JulianChronology var22 = org.joda.time.chrono.JulianChronology.getInstance();
    org.joda.time.MutablePeriod var23 = new org.joda.time.MutablePeriod(9L, var20, (org.joda.time.Chronology)var22);
    org.joda.time.Duration var25 = org.joda.time.Duration.standardHours((-1L));
    org.joda.time.Duration var27 = org.joda.time.Duration.standardHours((-1L));
    boolean var28 = var25.isShorterThan((org.joda.time.ReadableDuration)var27);
    org.joda.time.Duration var29 = var25.toDuration();
    org.joda.time.Duration var31 = org.joda.time.Duration.standardHours((-1L));
    boolean var32 = var29.isShorterThan((org.joda.time.ReadableDuration)var31);
    org.joda.time.chrono.GJChronology var33 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    java.lang.String var34 = var33.toString();
    org.joda.time.DurationField var35 = var33.eras();
    org.joda.time.Chronology var36 = var33.withUTC();
    var23.setPeriod((org.joda.time.ReadableDuration)var31, (org.joda.time.Chronology)var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setDays(567);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "GJChronology[UTC]"+ "'", var34.equals("GJChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test138"); }


    org.joda.time.format.DateTimeFormatter var0 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
    org.joda.time.format.DateTimePrinter var1 = var0.getPrinter();
    org.joda.time.chrono.EthiopicChronology var12 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var13 = var12.hours();
    org.joda.time.LocalTime var14 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var12);
    org.joda.time.Period var15 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var12);
    org.joda.time.DateTimeField var16 = var12.millisOfSecond();
    org.joda.time.chrono.LenientChronology var17 = org.joda.time.chrono.LenientChronology.getInstance((org.joda.time.Chronology)var12);
    org.joda.time.chrono.JulianChronology var18 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var19 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var18);
    org.joda.time.Period var24 = new org.joda.time.Period(1, 10, 10, 1);
    org.joda.time.Period var26 = var24.plusSeconds(100);
    org.joda.time.Period var28 = var24.minusMillis(10);
    boolean var29 = var19.equals((java.lang.Object)10);
    org.joda.time.DateMidnight.Property var30 = var19.dayOfYear();
    org.joda.time.chrono.JulianChronology var31 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var32 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var31);
    org.joda.time.LocalDate var33 = var32.toLocalDate();
    org.joda.time.LocalDate var35 = var33.minusMonths(0);
    org.joda.time.DateTime var36 = var33.toDateTimeAtMidnight();
    org.joda.time.DateTime var38 = var36.withCenturyOfEra(4);
    org.joda.time.Days var39 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant)var19, (org.joda.time.ReadableInstant)var38);
    org.joda.time.DateMidnight var41 = var19.plusMonths(10);
    org.joda.time.DateTimeZone var43 = org.joda.time.DateTimeZone.forOffsetMillis(759);
    org.joda.time.MutableDateTime var44 = org.joda.time.MutableDateTime.now(var43);
    org.joda.time.DateMidnight var45 = var19.withZoneRetainFields(var43);
    org.joda.time.Chronology var46 = var17.withZone(var43);
    org.joda.time.MutableDateTime var47 = new org.joda.time.MutableDateTime(57600100, 36, 768, 3975, 25785, 31, 24, var46);
    int var50 = var0.parseInto((org.joda.time.ReadWritableInstant)var47, "T01:23:56.333", 985);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-986));

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test139"); }


    org.joda.time.chrono.EthiopicChronology var0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.chrono.JulianChronology var1 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    org.joda.time.DateMidnight var2 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)var1);
    org.joda.time.LocalDate var3 = var2.toLocalDate();
    org.joda.time.LocalDate var5 = var3.minusMonths(0);
    int[] var7 = var0.get((org.joda.time.ReadablePartial)var5, 100L);
    org.joda.time.chrono.EthiopicChronology var11 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.DurationField var12 = var11.hours();
    org.joda.time.LocalTime var13 = org.joda.time.LocalTime.fromMillisOfDay(0L, (org.joda.time.Chronology)var11);
    org.joda.time.Period var14 = new org.joda.time.Period(1L, (-1L), (org.joda.time.Chronology)var11);
    org.joda.time.DateTimeField var15 = var11.millisOfSecond();
    org.joda.time.DateTimeField var16 = var11.secondOfDay();
    org.joda.time.field.SkipDateTimeField var18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)var0, var16, 100);
    org.joda.time.LocalDateTime var19 = org.joda.time.LocalDateTime.now();
    int var20 = var19.getDayOfYear();
    org.joda.time.Chronology var21 = var19.getChronology();
    int var22 = var19.getYearOfCentury();
    int var23 = var18.getMaximumValue((org.joda.time.ReadablePartial)var19);
    int var24 = var19.getSecondOfMinute();
    org.joda.time.LocalDateTime var26 = var19.plusSeconds(228);
    org.joda.time.LocalDateTime var28 = var26.minusHours(16);
    int var29 = var28.getCenturyOfEra();
    org.joda.time.LocalDateTime var31 = var28.withCenturyOfEra(31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 86399);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

}
