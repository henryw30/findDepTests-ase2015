package randoop.jfreechart;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    org.jfree.chart.plot.PlotUtilities var0 = new org.jfree.chart.plot.PlotUtilities();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = org.jfree.chart.imagemap.ImageMapUtilities.htmlEscape("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.title.DateTitle var1 = new org.jfree.chart.title.DateTitle((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Comparable[] var1 = new java.lang.Comparable[] { 100};
    java.lang.Comparable[] var3 = new java.lang.Comparable[] { 'a'};
    double[][] var4 = new double[][] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.category.CategoryDataset var5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(var1, var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesShapesVisible((-1), false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var1 = java.awt.Color.decode("");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    double var4 = var2.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var7 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var8 = var7.getItemLabelFont();
    java.awt.Shape var9 = var7.getBaseLegendShape();
    var2.setShape(var9);
    org.jfree.data.general.DefaultKeyedValues2DDataset var13 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var15 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.entity.CategoryItemEntity var17 = new org.jfree.chart.entity.CategoryItemEntity(var9, "hi!", "hi!", (org.jfree.data.category.CategoryDataset)var13, 0, (java.lang.Object)var15, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    org.jfree.chart.util.HexNumberFormat var0 = new org.jfree.chart.util.HexNumberFormat();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    var5.setShape(var12);
    var2.setLegendBar(var12);
    double var15 = var2.getShadowXOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4.0d);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Locale var2 = javax.swing.JComponent.getDefaultLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.DateFormat var3 = java.text.DateFormat.getDateTimeInstance((-1), (-1), var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.DateFormat var2 = java.text.DateFormat.getDateTimeInstance((-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var1 = org.jfree.chart.imagemap.ImageMapUtilities.htmlEscape("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    org.jfree.data.xy.DefaultIntervalXYDataset var0 = new org.jfree.data.xy.DefaultIntervalXYDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var0.getStartXValue(1, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var5 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.general.PieDataset var7 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow((org.jfree.data.category.CategoryDataset)var0, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.ResourceBundle.clearCache();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    org.jfree.chart.urls.StandardPieURLGenerator var0 = new org.jfree.chart.urls.StandardPieURLGenerator();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Comparable[] var1 = new java.lang.Comparable[] { 100L};
    java.lang.Comparable[] var3 = new java.lang.Comparable[] { (-1.0f)};
    double[][] var4 = new double[][] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.category.CategoryDataset var5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(var1, var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    org.jfree.data.xy.XYIntervalSeriesCollection var0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYIntervalSeries var2 = var0.getSeries(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    org.jfree.chart.renderer.category.BarRenderer3D var1 = new org.jfree.chart.renderer.category.BarRenderer3D();
    java.lang.Object[] var2 = new java.lang.Object[] { var1};
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var5 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var8 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var9 = var8.getItemLabelFont();
    double var10 = var8.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var13 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var14 = var13.getItemLabelFont();
    java.awt.Shape var15 = var13.getBaseLegendShape();
    var8.setShape(var15);
    var5.setLegendBar(var15);
    java.lang.Object[] var18 = new java.lang.Object[] { var5};
    org.jfree.chart.renderer.category.BarRenderer3D var21 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var22 = var21.getItemLabelFont();
    double var23 = var21.getItemLabelAnchorOffset();
    java.lang.Object[] var24 = new java.lang.Object[] { var21};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.contour.DefaultContourDataset var25 = new org.jfree.data.contour.DefaultContourDataset((java.lang.Comparable)10.0f, var2, var18, var24);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    org.jfree.chart.util.LineUtilities var0 = new org.jfree.chart.util.LineUtilities();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    java.lang.Object[][][] var2 = new java.lang.Object[][][] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.DefaultWindDataset var3 = new org.jfree.data.xy.DefaultWindDataset(var1, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.String var0 = org.jfree.chart.servlet.ServletUtilities.getTempFilePrefix();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "jfreechart-"+ "'", var0.equals("jfreechart-"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.encoders.ImageEncoder var3 = org.jfree.chart.encoders.ImageEncoderFactory.newInstance("hi!", 10.0f, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    org.jfree.chart.labels.ItemLabelPosition var0 = new org.jfree.chart.labels.ItemLabelPosition();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var0 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var2 = var0.getSeriesItemLabelGenerator(0);
    var0.setPlotLines(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    org.jfree.chart.renderer.xy.XYBlockRenderer var0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var1 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var2 = var0.findDomainBounds((org.jfree.data.xy.XYDataset)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var5 = var1.getY((-1), 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var5 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.incrementValue(4.0d, (java.lang.Comparable)"jfreechart-", (java.lang.Comparable)(-1.0f));
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.Object[] var2 = new java.lang.Object[] { 10};
    java.lang.String[] var5 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var6 = new org.jfree.chart.axis.SymbolAxis("hi!", var5);
    java.lang.String[] var9 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var10 = new org.jfree.chart.axis.SymbolAxis("hi!", var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.contour.NonGridContourDataset var14 = new org.jfree.data.contour.NonGridContourDataset("jfreechart-", var2, (java.lang.Object[])var5, (java.lang.Object[])var9, 0, 10, 10);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var5 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var7 = var0.getColumnKey(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    org.jfree.chart.servlet.ServletUtilities.setTempFilePrefix("");

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var5 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var0);
    org.jfree.chart.urls.StandardXYURLGenerator var9 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    boolean var10 = var0.equals((java.lang.Object)"hi!");
    org.jfree.data.Range var11 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds((org.jfree.data.category.CategoryDataset)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var13 = var0.getColumnKey((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    var5.setShape(var12);
    var2.setLegendBar(var12);
    org.jfree.data.general.DefaultKeyedValues2DDataset var17 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var20 = new org.jfree.chart.entity.CategoryItemEntity(var12, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var17, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    var20.setCategoryIndex(0);
    java.lang.String var23 = var20.getShapeCoords();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "-4,-4,4,4"+ "'", var23.equals("-4,-4,4,4"));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    org.jfree.data.xy.DefaultIntervalXYDataset var0 = new org.jfree.data.xy.DefaultIntervalXYDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var0.getStartYValue(10, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    org.jfree.chart.util.HexNumberFormat var1 = new org.jfree.chart.util.HexNumberFormat(1);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    org.jfree.data.statistics.SimpleHistogramDataset var1 = new org.jfree.data.statistics.SimpleHistogramDataset((java.lang.Comparable)100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var4 = var1.getStartX(10, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var2 = var0.getSeriesLinesVisible(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesShapesVisible(2147483647, (java.lang.Boolean)false);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(100.0d, true);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    org.jfree.chart.renderer.xy.StandardXYItemRenderer var0 = new org.jfree.chart.renderer.xy.StandardXYItemRenderer();

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.updateUI();
    java.lang.String var4 = var0.toString();
    java.awt.Color var5 = var0.getForeground();
    float[] var8 = new float[] { 1.0f, 0.0f};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var9 = var5.getRGBComponents(var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var4,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var4.equals("org.jfree.chart.ChartPanel[,0,0,0var4,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.Object var3 = var2.clone();
    int var4 = var2.getMaximumItemCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var6 = var2.getX((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483647);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    org.jfree.data.xy.XYIntervalSeries var3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable)"org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", false, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var3.getYValue(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    org.jfree.data.xy.XYIntervalSeriesCollection var0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.xy.XYBarDataset var2 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var0, 10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var5 = var2.getStartX(1, 2013);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var1 = java.awt.Color.decode("jfreechart-");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.encoders.ImageEncoder var1 = org.jfree.chart.encoders.ImageEncoderFactory.newInstance("Combined Range XYPlot");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    org.jfree.chart.labels.StandardPieToolTipGenerator var1 = new org.jfree.chart.labels.StandardPieToolTipGenerator("");
    java.lang.Object var2 = var1.clone();
    java.lang.Object var3 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var1 = var0.getRangeZeroBaselineStroke();
    org.jfree.chart.axis.AxisCollection var3 = new org.jfree.chart.axis.AxisCollection();
    java.util.List var4 = var3.getAxesAtLeft();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mapDatasetToRangeAxes(1, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    org.jfree.data.statistics.HistogramBin var2 = new org.jfree.data.statistics.HistogramBin(0.0d, 1.0d);
    double var3 = var2.getStartBoundary();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    org.jfree.data.xy.XYIntervalSeriesCollection var0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.xy.XYBarDataset var2 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var0, 10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var5 = var2.getStartY(10, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    java.text.DateFormat var0 = java.text.DateFormat.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var5 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var0);
    java.util.List var6 = var0.getColumnKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var9 = var0.getValue((-1), 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    org.jfree.chart.axis.TickUnitSource var0 = org.jfree.chart.axis.NumberAxis.createIntegerTickUnits();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    org.jfree.data.xy.XYIntervalSeriesCollection var0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeSeries(2013);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    org.jfree.chart.renderer.xy.XYBarRenderer var0 = new org.jfree.chart.renderer.xy.XYBarRenderer();

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    java.text.DateFormat var1 = java.text.DateFormat.getTimeInstance(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    org.jfree.data.xy.XYIntervalSeriesCollection var0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.xy.XYBarDataset var2 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var0, 10.0d);
    java.lang.Number var3 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var6 = var0.getEndY(1, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    org.jfree.data.time.Minute var1 = org.jfree.data.time.Minute.parseMinute("jfreechart-");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    org.jfree.chart.labels.StandardCategoryToolTipGenerator var0 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
    org.jfree.data.general.DefaultKeyedValues2DDataset var1 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var1.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var6 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var0.generateRowLabel((org.jfree.data.category.CategoryDataset)var1, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removePointer(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var5 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var7 = var0.getColumnKey(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.renderer.GrayPaintScale var3 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 2.0d, 2013);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var3 = var2.isAxisLineVisible();
    var2.setAxisLineVisible(true);
    var2.setMinorTickMarksVisible(true);
    var2.setFixedAutoRange(Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    org.jfree.data.statistics.SimpleHistogramBin var2 = new org.jfree.data.statistics.SimpleHistogramBin(100.0d, Double.NaN);
    
    // Checks the contract:  var2.equals(var2)
    assertTrue("Contract failed: var2.equals(var2)", var2.equals(var2));

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ResourceBundle var1 = java.util.ResourceBundle.getBundle("Combined Range XYPlot");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    java.lang.Number[][] var0 = new java.lang.Number[][] { };
    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setStartValue(0, (java.lang.Comparable)(short)(-1), (java.lang.Number)Double.NaN);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    java.lang.Number[][] var0 = new java.lang.Number[][] { };
    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var1);
    java.lang.Comparable[] var4 = new java.lang.Comparable[] { 0.05d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setSeriesKeys(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    org.jfree.data.resources.DataPackageResources var0 = new org.jfree.data.resources.DataPackageResources();
    java.util.Enumeration var1 = var0.getKeys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    org.jfree.data.xy.DefaultIntervalXYDataset var0 = new org.jfree.data.xy.DefaultIntervalXYDataset();
    org.jfree.chart.util.ParamChecks.nullNotPermitted((java.lang.Object)var0, "Combined Range XYPlot");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.getEndYValue(100, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    org.jfree.chart.plot.CompassPlot var4 = new org.jfree.chart.plot.CompassPlot();
    boolean var5 = var3.equals((java.lang.Object)var4);
    java.lang.String var6 = var4.getPlotType();
    java.awt.Paint var7 = var4.getRoseCenterPaint();
    java.awt.Paint var8 = var4.getBackgroundPaint();
    java.awt.Paint var9 = var4.getRoseHighlightPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Compass Plot"+ "'", var6.equals("Compass Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    java.lang.String var0 = org.jfree.chart.servlet.ServletUtilities.getTempOneTimeFilePrefix();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "jfreechart-onetime-"+ "'", var0.equals("jfreechart-onetime-"));

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    boolean var2 = var0.getIgnoreRepaint();
    org.jfree.chart.plot.ContourPlot var4 = new org.jfree.chart.plot.ContourPlot();
    var4.setOutlineVisible(false);
    var0.addPropertyChangeListener("Combined Range XYPlot", (java.beans.PropertyChangeListener)var4);
    org.jfree.chart.urls.XYURLGenerator var8 = var4.getURLGenerator();
    var4.clearAnnotations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removePointer(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    org.jfree.data.xy.DefaultXYZDataset var0 = new org.jfree.data.xy.DefaultXYZDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var0.getYValue(100, 2013);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    org.jfree.data.xml.RootHandler var0 = new org.jfree.data.xml.RootHandler();
    var0.endElement("", "hi!", "hi!");
    char[] var5 = new char[] { };
    var0.characters(var5, (-1), (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.xml.sax.helpers.DefaultHandler var9 = var0.popSubHandler();
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var4 = var1.getMaxRegularValue((-1), 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    org.jfree.chart.block.EmptyBlock var2 = new org.jfree.chart.block.EmptyBlock(0.0d, 0.05d);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    var5.setShape(var12);
    var2.setLegendBar(var12);
    var2.setDrawBarOutline(true);
    org.jfree.data.xy.CategoryTableXYDataset var17 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var18 = var2.findDomainBounds((org.jfree.data.xy.XYDataset)var17);
    org.jfree.data.Range var20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds((org.jfree.data.xy.TableXYDataset)var17, (-1.0d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var23 = var17.getStartX((-1), 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Month var2 = new org.jfree.data.time.Month(100, 2013);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.updateUI();
    java.lang.String var4 = var0.toString();
    java.awt.Color var5 = var0.getForeground();
    float[] var7 = new float[] { 10.0f};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var8 = var5.getComponents(var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var4,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var4.equals("org.jfree.chart.ChartPanel[,0,0,0var4,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    boolean var0 = org.jfree.chart.renderer.category.BarRenderer.getDefaultShadowsVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    org.jfree.data.general.DefaultKeyedValueDataset var0 = new org.jfree.data.general.DefaultKeyedValueDataset();
    org.jfree.data.general.DatasetGroup var1 = var0.getGroup();
    org.jfree.data.general.DefaultKeyedValueDataset var2 = new org.jfree.data.general.DefaultKeyedValueDataset((org.jfree.data.KeyedValue)var0);
    var2.setValue((java.lang.Comparable)100.0f, (java.lang.Number)(-1.0d));
    org.jfree.data.general.DatasetGroup var6 = var2.getGroup();
    
    // Checks the contract:  equals-hashcode on var1 and var6
    assertTrue("Contract failed: equals-hashcode on var1 and var6", var1.equals(var6) ? var1.hashCode() == var6.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var6 and var1
    assertTrue("Contract failed: equals-hashcode on var6 and var1", var6.equals(var1) ? var6.hashCode() == var1.hashCode() : true);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    org.jfree.data.time.TimeTableXYDataset var0 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    var0.remove((org.jfree.data.time.TimePeriod)var2, (java.lang.Comparable)100, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.getXValue(2147483647, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    java.util.Locale var4 = var2.getLocale();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var6 = var5.getPreferredSize();
    java.awt.Dimension var7 = var2.getSize(var6);
    java.awt.event.ContainerListener[] var8 = var2.getContainerListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var2.getBaseline(2013, (-1));
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    org.jfree.data.function.PowerFunction2D var2 = new org.jfree.data.function.PowerFunction2D(2.0d, 1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYSeries var7 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries((org.jfree.data.function.Function2D)var2, 1.0d, (-1.0d), 10, (java.lang.Comparable)0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    java.util.Locale var4 = var2.getLocale();
    var2.list();
    javax.swing.JPanel var6 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var7 = var6.getPreferredSize();
    java.awt.image.ColorModel var8 = var6.getColorModel();
    var6.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var13 = var6.getForeground();
    boolean var14 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var15 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var16 = var15.getBaseItemLabelsVisible();
    boolean var17 = var15.getDrawOutlines();
    var15.setSeriesLinesVisible(0, (java.lang.Boolean)false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.add((java.awt.Component)var6, (java.lang.Object)0, 2147483647);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + false+ "'", var16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.Object var3 = var2.clone();
    int var4 = var2.getMaximumItemCount();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var6 = var5.getPreferredSize();
    boolean var7 = var5.getIgnoreRepaint();
    org.jfree.chart.plot.ContourPlot var9 = new org.jfree.chart.plot.ContourPlot();
    var9.setOutlineVisible(false);
    var5.addPropertyChangeListener("Combined Range XYPlot", (java.beans.PropertyChangeListener)var9);
    org.jfree.chart.urls.XYURLGenerator var13 = var9.getURLGenerator();
    var2.removePropertyChangeListener((java.beans.PropertyChangeListener)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var16 = var2.getX(2013);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    java.awt.Shape var3 = var2.getLegendBar();
    org.jfree.chart.entity.ContourEntity var6 = new org.jfree.chart.entity.ContourEntity(var3, "", "hi!");
    org.jfree.chart.entity.TickLabelEntity var9 = new org.jfree.chart.entity.TickLabelEntity(var3, "hi!", "");
    var9.setToolTipText("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    org.jfree.chart.entity.StandardEntityCollection var0 = new org.jfree.chart.entity.StandardEntityCollection();
    org.jfree.chart.entity.ChartEntity var3 = var0.getEntity(0.0d, 2.0d);
    org.jfree.chart.entity.ChartEntity var6 = var0.getEntity(10.0d, 1.0d);
    org.jfree.chart.entity.ChartEntity var9 = var0.getEntity(Double.NaN, 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    org.jfree.data.time.TimePeriodValue var5 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var2, (java.lang.Number)10);
    var0.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    java.awt.Stroke var7 = var0.getRangeMinorGridlineStroke();
    org.jfree.chart.event.RendererChangeEvent var9 = new org.jfree.chart.event.RendererChangeEvent((java.lang.Object)10);
    var0.rendererChanged(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    org.jfree.data.xy.XYIntervalSeriesCollection var0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var2 = var0.getSeriesKey(2013);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var1 = var0.getBaseItemLabelsVisible();
    boolean var2 = var0.getDrawOutlines();
    var0.setSeriesLinesVisible(0, (java.lang.Boolean)false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setItemMargin(10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    org.jfree.chart.StandardChartTheme var2 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var3 = var2.getLegendItemPaint();
    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var5 = var4.getBaseItemLabelsVisible();
    var4.setSeriesShapesFilled(1, (java.lang.Boolean)false);
    var4.setDrawOutlines(true);
    org.jfree.chart.renderer.category.BarRenderer3D var13 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var14 = var13.getItemLabelFont();
    double var15 = var13.getItemLabelAnchorOffset();
    java.awt.Shape var17 = var13.getSeriesShape(1);
    org.jfree.chart.renderer.category.BarRenderer3D var21 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var22 = var21.getItemLabelFont();
    double var23 = var21.getItemLabelAnchorOffset();
    org.jfree.chart.axis.CyclicNumberAxis var27 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var28 = var27.getTickLabelPaint();
    var21.setLegendTextPaint(0, var28);
    var13.setSeriesFillPaint(100, var28, true);
    var4.setBaseOutlinePaint(var28, false);
    var2.setLegendBackgroundPaint(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    java.awt.Shape var3 = var2.getLegendBar();
    org.jfree.chart.entity.ContourEntity var6 = new org.jfree.chart.entity.ContourEntity(var3, "", "hi!");
    java.lang.String var7 = var6.getToolTipText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removePointer(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    org.jfree.chart.renderer.xy.XYBarRenderer var1 = new org.jfree.chart.renderer.xy.XYBarRenderer(100.0d);
    boolean var2 = var1.getShadowsVisible();
    boolean var3 = var1.getUseYInterval();
    java.awt.Paint var5 = var1.getLegendTextPaint(10);
    var1.setAutoPopulateSeriesPaint(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    org.jfree.chart.plot.CompassPlot var4 = new org.jfree.chart.plot.CompassPlot();
    boolean var5 = var3.equals((java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setSeriesNeedle(10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    org.jfree.chart.util.RelativeDateFormat var0 = new org.jfree.chart.util.RelativeDateFormat();
    java.lang.Object var1 = var0.clone();
    java.lang.String var2 = var0.getDaySuffix();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "d"+ "'", var2.equals("d"));

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var2 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var1);
    var2.setPercentComplete((java.lang.Double)10.0d);
    org.jfree.data.time.Week var6 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var7 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var6);
    var7.setPercentComplete((java.lang.Double)10.0d);
    var2.addSubtask(var7);
    java.lang.Double var11 = var2.getPercentComplete();
    java.lang.Object var12 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 10.0d+ "'", var11.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    org.jfree.chart.util.HexNumberFormat var1 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var3 = var2.getPreferredSize();
    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var2.setNextFocusableComponent((java.awt.Component)var4);
    java.util.Locale var6 = var4.getLocale();
    org.jfree.chart.axis.MonthDateFormat var7 = new org.jfree.chart.axis.MonthDateFormat(var6);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var8 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var1, (java.text.DateFormat)var7);
    int var9 = var1.getNumberOfDigits();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    boolean var5 = var2.getItemVisible(0, 0);
    double var6 = var2.getUpperClip();
    org.jfree.chart.labels.ItemLabelPosition var7 = var2.getNegativeItemLabelPositionFallback();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    org.jfree.chart.urls.StandardPieURLGenerator var3 = new org.jfree.chart.urls.StandardPieURLGenerator("Combined Range XYPlot", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", "");

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var1 = var0.getBaseItemLabelsVisible();
    var0.setSeriesShapesFilled(1, (java.lang.Boolean)false);
    var0.setDrawOutlines(true);
    org.jfree.chart.renderer.category.BarRenderer3D var9 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var10 = var9.getItemLabelFont();
    double var11 = var9.getItemLabelAnchorOffset();
    java.awt.Shape var13 = var9.getSeriesShape(1);
    org.jfree.chart.renderer.category.BarRenderer3D var17 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var18 = var17.getItemLabelFont();
    double var19 = var17.getItemLabelAnchorOffset();
    org.jfree.chart.axis.CyclicNumberAxis var23 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var24 = var23.getTickLabelPaint();
    var17.setLegendTextPaint(0, var24);
    var9.setSeriesFillPaint(100, var24, true);
    var0.setBaseOutlinePaint(var24, false);
    double var30 = var0.getItemLabelAnchorOffset();
    org.jfree.chart.labels.CategorySeriesLabelGenerator var31 = var0.getLegendItemToolTipGenerator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    org.jfree.chart.needle.PinNeedle var1 = new org.jfree.chart.needle.PinNeedle();
    org.jfree.chart.plot.CategoryPlot var2 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.plot.CategoryMarker var4 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var5 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var7 = var5.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var10 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var11 = var10.getTickLabelPaint();
    var5.setFillPaint(var11, true);
    var4.setLabelPaint(var11);
    var2.setDomainGridlinePaint(var11);
    var1.setHighlightPaint(var11);
    java.awt.Paint var17 = var1.getHighlightPaint();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var20 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var23 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var24 = var23.getItemLabelFont();
    double var25 = var23.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var28 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var29 = var28.getItemLabelFont();
    java.awt.Shape var30 = var28.getBaseLegendShape();
    var23.setShape(var30);
    var20.setLegendBar(var30);
    org.jfree.data.general.DefaultKeyedValues2DDataset var35 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var38 = new org.jfree.chart.entity.CategoryItemEntity(var30, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var35, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    org.jfree.chart.plot.CombinedRangeXYPlot var39 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var40 = var39.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CategoryMarker var42 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var43 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var45 = var43.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var48 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var49 = var48.getTickLabelPaint();
    var43.setFillPaint(var49, true);
    var42.setLabelPaint(var49);
    org.jfree.chart.annotations.XYShapeAnnotation var53 = new org.jfree.chart.annotations.XYShapeAnnotation(var30, var40, var49);
    org.jfree.chart.plot.Crosshair var54 = new org.jfree.chart.plot.Crosshair(1.0d, var17, var40);
    
    // Checks the contract:  equals-hashcode on var4 and var42
    assertTrue("Contract failed: equals-hashcode on var4 and var42", var4.equals(var42) ? var4.hashCode() == var42.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var42 and var4
    assertTrue("Contract failed: equals-hashcode on var42 and var4", var42.equals(var4) ? var42.hashCode() == var4.hashCode() : true);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var5 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var0);
    org.jfree.data.Range var7 = org.jfree.data.Range.shift(var5, (-1.0d));
    org.jfree.data.Range var9 = org.jfree.data.Range.scale(var7, 100.0d);
    org.jfree.data.general.DefaultKeyedValues2DDataset var10 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var10.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var10);
    org.jfree.data.Range var17 = org.jfree.data.Range.shift(var15, (-1.0d));
    org.jfree.data.Range var19 = org.jfree.data.Range.scale(var17, 100.0d);
    boolean var20 = var9.intersects(var19);
    double var21 = var9.getUpperBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    org.jfree.chart.util.LogFormat var0 = new org.jfree.chart.util.LogFormat();

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var6 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var6.setUpperMargin(10.0d);
    var6.setAxisLineVisible(true);
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var12 = var11.getLocation();
    java.awt.Dimension var13 = var11.preferredSize();
    java.awt.Rectangle var14 = var11.bounds();
    java.awt.Point var15 = var0.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var6, (java.awt.geom.Rectangle2D)var14);
    var6.setFixedAutoRange(2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
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

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var0 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    org.jfree.data.time.TimeTableXYDataset var1 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var4 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var3);
    var1.remove((org.jfree.data.time.TimePeriod)var3, (java.lang.Comparable)100, false);
    org.jfree.data.xy.XYBarDataset var9 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var1, Double.NaN);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var10 = var0.findRangeBounds((org.jfree.data.xy.XYDataset)var9);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    org.jfree.data.UnknownKeyException var1 = new org.jfree.data.UnknownKeyException("Combined Range XYPlot");

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    org.jfree.chart.StandardChartTheme var2 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    org.jfree.chart.plot.DrawingSupplier var3 = var2.getDrawingSupplier();
    org.jfree.chart.StandardChartTheme var6 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    org.jfree.chart.plot.DrawingSupplier var7 = var6.getDrawingSupplier();
    org.jfree.chart.plot.dial.StandardDialScale var8 = new org.jfree.chart.plot.dial.StandardDialScale();
    var8.setMajorTickIncrement(10.0d);
    java.awt.Paint var11 = var8.getMinorTickPaint();
    var6.setTickLabelPaint(var11);
    java.awt.Paint var13 = var6.getBaselinePaint();
    var2.setRangeGridlinePaint(var13);
    
    // Checks the contract:  equals-hashcode on var3 and var7
    assertTrue("Contract failed: equals-hashcode on var3 and var7", var3.equals(var7) ? var3.hashCode() == var7.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var7 and var3
    assertTrue("Contract failed: equals-hashcode on var7 and var3", var7.equals(var3) ? var7.hashCode() == var3.hashCode() : true);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    org.jfree.data.xy.VectorDataItem var5 = new org.jfree.data.xy.VectorDataItem((-1.0d), 10.0d, 2.0d, (-1.0d));
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var8 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    java.awt.Shape var9 = var8.getLegendBar();
    boolean var10 = var5.equals((java.lang.Object)var9);
    var0.setBaseShape(var9);
    org.jfree.chart.labels.ItemLabelPosition var12 = var0.getBaseNegativeItemLabelPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    long var0 = org.jfree.chart.axis.SegmentedTimeline.firstMondayAfter1900();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == (-2208960000000L));

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    org.jfree.chart.labels.StandardXYItemLabelGenerator var1 = new org.jfree.chart.labels.StandardXYItemLabelGenerator("hi!");

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    org.jfree.chart.renderer.category.BarRenderer3D var6 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var7 = var6.getItemLabelFont();
    double var8 = var6.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var11 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var12 = var11.getItemLabelFont();
    java.awt.Shape var13 = var11.getBaseLegendShape();
    var6.setShape(var13);
    var3.setDownArrow(var13);
    var3.setAutoRange(false);
    float var18 = var3.getMinorTickMarkOutsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2.0f);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    org.jfree.data.xy.XYIntervalSeriesCollection var0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.xy.XYBarDataset var2 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var0, 10.0d);
    java.lang.Number var3 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var0.getStartYValue(0, 51);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.encoders.ImageEncoder var2 = org.jfree.chart.encoders.ImageEncoderFactory.newInstance("d", true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    org.jfree.data.time.Day var1 = org.jfree.data.time.Day.parseDay("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    boolean var0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    org.jfree.data.time.TimeTableXYDataset var0 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    var0.remove((org.jfree.data.time.TimePeriod)var2, (java.lang.Comparable)100, false);
    org.jfree.data.xy.XYBarDataset var8 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var0, Double.NaN);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var11 = var8.getX((-13421773), (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    java.lang.String var1 = org.jfree.chart.imagemap.ImageMapUtilities.htmlEscape("hi!?hi!=100&amp;hi!=1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!?hi!=100&amp;amp;hi!=1"+ "'", var1.equals("hi!?hi!=100&amp;amp;hi!=1"));

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var1 = var0.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CombinedRangeXYPlot var2 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var3 = var2.getRangeZeroBaselineStroke();
    var0.setRangeGridlineStroke(var3);
    boolean var5 = var0.isDomainZoomable();
    java.lang.Number[][] var7 = new java.lang.Number[][] { };
    java.lang.Number[][] var8 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var7, var8);
    int var10 = var9.getRowCount();
    org.jfree.data.xy.OHLCDataItem[] var12 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var13 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var12);
    var9.setSeriesKeys((java.lang.Comparable[])var12);
    java.util.List var15 = var9.getRowKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mapDatasetToRangeAxes(0, var15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    var0.setUseSeriesOffset(true);
    var0.setAutoPopulateSeriesOutlinePaint(false);
    boolean var5 = var0.getUseOutlinePaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    org.jfree.chart.labels.StandardCategorySeriesLabelGenerator var1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("hi!");
    java.lang.Object var2 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    org.jfree.chart.renderer.xy.XYBarRenderer var1 = new org.jfree.chart.renderer.xy.XYBarRenderer(100.0d);
    org.jfree.chart.renderer.xy.XYBlockRenderer var2 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var3 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var4 = var2.findDomainBounds((org.jfree.data.xy.XYDataset)var3);
    org.jfree.chart.renderer.category.BarRenderer3D var7 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var8 = var7.getItemLabelFont();
    double var9 = var7.getItemLabelAnchorOffset();
    org.jfree.chart.labels.ItemLabelPosition var12 = var7.getNegativeItemLabelPosition(0, 0);
    double var13 = var12.getAngle();
    var2.setNegativeItemLabelPosition(var12);
    var1.setNegativeItemLabelPositionFallback(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    var2.add((-1.0d), (-1.0d), false);
    double var7 = var2.getMaxY();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.update((java.lang.Number)100.0f, (java.lang.Number)4.0d);
      fail("Expected exception of type org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1.0d));

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    org.jfree.chart.renderer.NotOutlierException var1 = new org.jfree.chart.renderer.NotOutlierException("hi!");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.jfree.chart.renderer.NotOutlierException: hi!"+ "'", var2.equals("org.jfree.chart.renderer.NotOutlierException: hi!"));

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    org.jfree.data.xy.VectorDataItem var5 = new org.jfree.data.xy.VectorDataItem((-1.0d), 10.0d, 2.0d, (-1.0d));
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var8 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    java.awt.Shape var9 = var8.getLegendBar();
    boolean var10 = var5.equals((java.lang.Object)var9);
    var0.setBaseShape(var9);
    java.lang.Object var12 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    org.jfree.chart.plot.CompassPlot var4 = new org.jfree.chart.plot.CompassPlot();
    boolean var5 = var3.equals((java.lang.Object)var4);
    var3.setGridBandsVisible(false);
    float var8 = var3.getMinorTickMarkOutsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2.0f);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    java.lang.Number[][] var0 = new java.lang.Number[][] { };
    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var5 = var2.getEndValue(8, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    org.jfree.data.xy.XYIntervalSeries var3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable)"org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", false, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var3.getYHighValue(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    int var3 = var1.getItemCount((-13421773));
    org.jfree.chart.axis.AxisCollection var4 = new org.jfree.chart.axis.AxisCollection();
    java.util.List var5 = var4.getAxesAtLeft();
    org.jfree.data.Range var7 = org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds((org.jfree.data.xy.XYDataset)var1, var5, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    boolean var2 = var0.getIgnoreRepaint();
    org.jfree.chart.plot.ContourPlot var4 = new org.jfree.chart.plot.ContourPlot();
    var4.setOutlineVisible(false);
    var0.addPropertyChangeListener("Combined Range XYPlot", (java.beans.PropertyChangeListener)var4);
    var0.nextFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    org.jfree.chart.renderer.category.DefaultCategoryItemRenderer var0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = var0.getSeriesItemURLGenerator(2147483647);
    boolean var3 = var0.getBaseShapesVisible();
    java.lang.String[] var6 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var7 = new org.jfree.chart.axis.SymbolAxis("hi!", var6);
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    double var12 = var10.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var15 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var16 = var15.getItemLabelFont();
    java.awt.Shape var17 = var15.getBaseLegendShape();
    var10.setShape(var17);
    var7.setDownArrow(var17);
    javax.swing.JPanel var20 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var21 = var20.getPreferredSize();
    java.awt.image.ColorModel var22 = var20.getColorModel();
    var20.updateUI();
    java.lang.String var24 = var20.toString();
    boolean var25 = var20.getInheritsPopupMenu();
    javax.swing.InputMap var26 = var20.getInputMap();
    var20.nextFocus();
    boolean var28 = var20.getInheritsPopupMenu();
    javax.swing.JPanel var29 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var30 = var29.getPreferredSize();
    java.awt.image.ColorModel var31 = var29.getColorModel();
    var29.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var36 = var29.getForeground();
    var20.setForeground(var36);
    var7.setGridBandAlternatePaint((java.awt.Paint)var36);
    var0.setBaseItemLabelPaint((java.awt.Paint)var36, false);
    int var41 = var36.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var24,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var24.equals("org.jfree.chart.ChartPanel[,0,0,0var24,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 51);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    org.jfree.data.xml.RootHandler var0 = new org.jfree.data.xml.RootHandler();
    var0.endElement("", "hi!", "hi!");
    var0.endDocument();
    var0.startDocument();

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var1 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var2 = var1.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator var3 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.XYStepAreaRenderer var4 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(0, (org.jfree.chart.labels.XYToolTipGenerator)var1, (org.jfree.chart.urls.XYURLGenerator)var3);
    org.jfree.data.xy.CategoryTableXYDataset var5 = new org.jfree.data.xy.CategoryTableXYDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var3.generateURL((org.jfree.data.xy.XYDataset)var5, (-2), 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.String var3 = var2.getDescription();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.update((java.lang.Number)100L, (java.lang.Number)10.0f);
      fail("Expected exception of type org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    org.jfree.chart.title.TextTitle var1 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var2 = var1.isVisible();
    java.lang.Object var3 = var1.clone();
    java.lang.String var4 = var1.getURLText();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var6 = var5.getPreferredSize();
    java.awt.image.ColorModel var7 = var5.getColorModel();
    var5.updateUI();
    java.lang.String var9 = var5.toString();
    java.awt.Color var10 = var5.getForeground();
    var1.setBackgroundPaint((java.awt.Paint)var10);
    org.jfree.chart.event.TitleChangeEvent var12 = new org.jfree.chart.event.TitleChangeEvent((org.jfree.chart.title.Title)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var9,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var9.equals("org.jfree.chart.ChartPanel[,0,0,0var9,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    org.jfree.chart.util.HexNumberFormat var1 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var3 = var2.getPreferredSize();
    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var2.setNextFocusableComponent((java.awt.Component)var4);
    java.util.Locale var6 = var4.getLocale();
    org.jfree.chart.axis.MonthDateFormat var7 = new org.jfree.chart.axis.MonthDateFormat(var6);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var8 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var1, (java.text.DateFormat)var7);
    boolean var9 = var1.isGroupingUsed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.RoundingMode var10 = var1.getRoundingMode();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    org.jfree.chart.renderer.category.LevelRenderer var0 = new org.jfree.chart.renderer.category.LevelRenderer();
    org.jfree.chart.plot.CombinedRangeXYPlot var2 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var3 = var2.getRangeZeroBaselineStroke();
    org.jfree.chart.title.TextTitle var5 = new org.jfree.chart.title.TextTitle("hi!");
    org.jfree.ui.RectangleInsets var6 = var5.getMargin();
    var2.setAxisOffset(var6);
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var10 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var13 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var14 = var13.getItemLabelFont();
    double var15 = var13.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var18 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var19 = var18.getItemLabelFont();
    java.awt.Shape var20 = var18.getBaseLegendShape();
    var13.setShape(var20);
    var10.setLegendBar(var20);
    org.jfree.data.general.DefaultKeyedValues2DDataset var25 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var28 = new org.jfree.chart.entity.CategoryItemEntity(var20, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var25, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    org.jfree.chart.plot.CombinedRangeXYPlot var29 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var30 = var29.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CategoryMarker var32 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var33 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var35 = var33.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var38 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var39 = var38.getTickLabelPaint();
    var33.setFillPaint(var39, true);
    var32.setLabelPaint(var39);
    org.jfree.chart.annotations.XYShapeAnnotation var43 = new org.jfree.chart.annotations.XYShapeAnnotation(var20, var30, var39);
    var2.setRangeCrosshairPaint(var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setLegendTextPaint((-13421773), var39);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    org.jfree.chart.annotations.XYLineAnnotation var4 = new org.jfree.chart.annotations.XYLineAnnotation(0.2d, 0.05d, 3.0d, 3.0d);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.statistics.SimpleHistogramBin var2 = new org.jfree.data.statistics.SimpleHistogramBin(1.0d, 0.2d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var0 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    boolean var1 = var0.isOutline();
    var0.setUseFillPaint(true);
    org.jfree.chart.StandardChartTheme var6 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var7 = var6.getLegendItemPaint();
    var0.setShapePaint(var7);
    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    int var12 = var10.getItemCount((-13421773));
    boolean var13 = var0.equals((java.lang.Object)var10);
    double var15 = var10.getRangeLowerBound(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == Double.NaN);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer var0 = new org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer();
    org.jfree.chart.StandardChartTheme var3 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var4 = var3.getLegendItemPaint();
    var0.setBoxPaint(var4);
    java.lang.Number[][] var6 = new java.lang.Number[][] { };
    java.lang.Number[][] var7 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var6, var7);
    int var10 = var8.getRowIndex((java.lang.Comparable)'a');
    boolean var11 = var0.equals((java.lang.Object)var8);
    java.lang.Object var12 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var1 = var0.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CombinedRangeXYPlot var2 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var3 = var2.getRangeZeroBaselineStroke();
    var0.setRangeGridlineStroke(var3);
    var0.setDomainMinorGridlinesVisible(true);
    org.jfree.chart.renderer.xy.XYItemRenderer var7 = var0.getRenderer();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    double var13 = var10.getItemMargin();
    org.jfree.chart.plot.CombinedRangeXYPlot var14 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var15 = var14.getRangeZeroBaselineStroke();
    var10.setStroke(var15, false);
    var0.setDomainZeroBaselineStroke(var15);
    
    // Checks the contract:  equals-hashcode on var2 and var14
    assertTrue("Contract failed: equals-hashcode on var2 and var14", var2.equals(var14) ? var2.hashCode() == var14.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var14 and var2
    assertTrue("Contract failed: equals-hashcode on var14 and var2", var14.equals(var2) ? var14.hashCode() == var2.hashCode() : true);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    var0.show();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var6 = var5.getLocation();
    java.awt.Dimension var7 = var5.preferredSize();
    java.awt.Rectangle var8 = var5.bounds();
    var0.scrollRectToVisible(var8);
    var0.firePropertyChange("jfreechart-onetime-", '4', ' ');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.InputMap var15 = var0.getInputMap(10);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    var0.show();
    java.awt.FocusTraversalPolicy var5 = var0.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    org.jfree.data.xy.XIntervalSeries var1 = new org.jfree.data.xy.XIntervalSeries((java.lang.Comparable)4.0d);
    java.lang.String var2 = var1.getDescription();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var1.getXLowValue((-2));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    org.jfree.data.xy.XIntervalDataItem var4 = new org.jfree.data.xy.XIntervalDataItem(1.0d, 0.05d, 0.2d, 2.0d);
    double var5 = var4.getXHighValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.2d);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    java.lang.Number[][] var0 = new java.lang.Number[][] { };
    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var1);
    int var3 = var2.getRowCount();
    org.jfree.data.xy.OHLCDataItem[] var5 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var6 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var5);
    var2.setSeriesKeys((java.lang.Comparable[])var5);
    java.util.List var8 = var2.getRowKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setEndValue(0, (java.lang.Comparable)(short)10, (java.lang.Number)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var1 = var0.getRangeZeroBaselineStroke();
    java.lang.String var2 = var0.getPlotType();
    org.jfree.chart.plot.CategoryMarker var4 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var5 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var7 = var5.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var10 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var11 = var10.getTickLabelPaint();
    var5.setFillPaint(var11, true);
    var4.setLabelPaint(var11);
    boolean var15 = var0.removeRangeMarker((org.jfree.chart.plot.Marker)var4);
    org.jfree.chart.axis.AxisLocation var16 = var0.getDomainAxisLocation();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var19 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var22 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var23 = var22.getItemLabelFont();
    double var24 = var22.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var27 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var28 = var27.getItemLabelFont();
    java.awt.Shape var29 = var27.getBaseLegendShape();
    var22.setShape(var29);
    var19.setLegendBar(var29);
    var19.setDrawBarOutline(true);
    org.jfree.data.xy.CategoryTableXYDataset var34 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var35 = var19.findDomainBounds((org.jfree.data.xy.XYDataset)var34);
    int var36 = var0.getIndexOf((org.jfree.chart.renderer.xy.XYItemRenderer)var19);
    var0.setRangeCrosshairVisible(false);
    org.jfree.chart.plot.CombinedRangeXYPlot var39 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    org.jfree.chart.plot.CategoryMarker var41 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    java.lang.String var42 = var41.getLabel();
    boolean var43 = var39.removeDomainMarker((org.jfree.chart.plot.Marker)var41);
    var0.add((org.jfree.chart.plot.XYPlot)var39, 51);
    
    // Checks the contract:  equals-hashcode on var4 and var41
    assertTrue("Contract failed: equals-hashcode on var4 and var41", var4.equals(var41) ? var4.hashCode() == var41.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var41 and var4
    assertTrue("Contract failed: equals-hashcode on var41 and var4", var41.equals(var4) ? var41.hashCode() == var4.hashCode() : true);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    org.jfree.chart.util.HexNumberFormat var2 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var3 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var4 = var3.getPreferredSize();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var3.setNextFocusableComponent((java.awt.Component)var5);
    java.util.Locale var7 = var5.getLocale();
    org.jfree.chart.axis.MonthDateFormat var8 = new org.jfree.chart.axis.MonthDateFormat(var7);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var9 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var2, (java.text.DateFormat)var8);
    org.jfree.chart.util.HexNumberFormat var11 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var12 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var13 = var12.getPreferredSize();
    javax.swing.JPanel var14 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var12.setNextFocusableComponent((java.awt.Component)var14);
    java.util.Locale var16 = var14.getLocale();
    org.jfree.chart.axis.MonthDateFormat var17 = new org.jfree.chart.axis.MonthDateFormat(var16);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var18 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var11, (java.text.DateFormat)var17);
    org.jfree.chart.labels.StandardPieSectionLabelGenerator var19 = new org.jfree.chart.labels.StandardPieSectionLabelGenerator("Combined Range XYPlot", (java.text.NumberFormat)var2, (java.text.NumberFormat)var11);
    int var20 = var11.getMinimumIntegerDigits();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    var5.setShape(var12);
    var2.setLegendBar(var12);
    var2.setDrawBarOutline(true);
    java.awt.Paint var18 = var2.getLegendTextPaint(0);
    boolean var19 = var2.isDrawBarOutline();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    var5.setShape(var12);
    var2.setLegendBar(var12);
    org.jfree.data.general.DefaultKeyedValues2DDataset var17 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var20 = new org.jfree.chart.entity.CategoryItemEntity(var12, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var17, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    java.lang.Object var21 = var20.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var4 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var6 = var4.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var9 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var10 = var9.getTickLabelPaint();
    var4.setFillPaint(var10, true);
    var3.setGridBandAlternatePaint(var10);
    var3.setFixedDimension(100.0d);
    var3.setGridBandsVisible(false);
    var3.centerRange(0.04d);
    var3.setVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    var5.setShape(var12);
    var2.setLegendBar(var12);
    var2.setDrawBarOutline(true);
    java.awt.Paint var18 = var2.getLegendTextPaint(0);
    java.lang.Object var19 = var2.clone();
    var2.setBaseSeriesVisibleInLegend(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var1 = var0.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CombinedRangeXYPlot var2 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var3 = var2.getRangeZeroBaselineStroke();
    var0.setRangeGridlineStroke(var3);
    var0.setDomainZeroBaselineVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var2 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var1);
    org.jfree.data.time.TimePeriodValue var4 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var1, (java.lang.Number)10);
    org.jfree.data.time.ohlc.OHLCItem var9 = new org.jfree.data.time.ohlc.OHLCItem((org.jfree.data.time.RegularTimePeriod)var1, 100.0d, 0.0d, 0.05d, 0.0d);
    org.jfree.chart.plot.XYPlot var10 = new org.jfree.chart.plot.XYPlot();
    java.lang.Object var11 = var10.clone();
    org.jfree.data.ComparableObjectItem var12 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable)var9, (java.lang.Object)var10);
    double var13 = var9.getCloseValue();
    double var14 = var9.getOpenValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    org.jfree.chart.imagemap.ImageMapUtilities var0 = new org.jfree.chart.imagemap.ImageMapUtilities();

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    org.jfree.chart.HashUtilities var0 = new org.jfree.chart.HashUtilities();

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    org.jfree.chart.block.BlockBorder var4 = new org.jfree.chart.block.BlockBorder(3.0d, 0.0d, 0.2d, 1.0d);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    org.jfree.chart.plot.CompassPlot var4 = new org.jfree.chart.plot.CompassPlot();
    boolean var5 = var3.equals((java.lang.Object)var4);
    var3.setGridBandsVisible(false);
    java.text.NumberFormat var8 = var3.getNumberFormatOverride();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var1 = java.awt.Color.decode("-4,-4,4,4");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var1 = var0.getBaseItemLabelsVisible();
    boolean var2 = var0.getDrawOutlines();
    var0.setSeriesLinesVisible(0, (java.lang.Boolean)false);
    var0.setBaseShapesFilled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    org.jfree.chart.plot.dial.DialValueIndicator var0 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var1 = var0.getInsets();
    java.awt.Stroke var2 = var0.getOutlineStroke();
    javax.swing.JPanel var3 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var4 = var3.getPreferredSize();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var3.setNextFocusableComponent((java.awt.Component)var5);
    java.util.Locale var7 = var5.getLocale();
    javax.swing.JPanel var8 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var9 = var8.getPreferredSize();
    java.awt.Dimension var10 = var5.getSize(var9);
    java.awt.event.ContainerListener[] var11 = var5.getContainerListeners();
    javax.swing.JPanel var12 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var13 = var12.getPreferredSize();
    java.awt.image.ColorModel var14 = var12.getColorModel();
    var12.updateUI();
    java.lang.String var16 = var12.toString();
    java.awt.Color var17 = var12.getForeground();
    var5.setBackground(var17);
    var0.setOutlinePaint((java.awt.Paint)var17);
    float[] var23 = new float[] { 10.0f, (-1.0f), 1.0f};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var24 = var17.getComponents(var23);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertTrue("'" + var16 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var16,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var16.equals("org.jfree.chart.ChartPanel[,0,0,0var16,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var1 = var0.getRangeZeroBaselineStroke();
    java.lang.String var2 = var0.getPlotType();
    boolean var3 = var0.isDomainZoomable();
    org.jfree.chart.plot.ContourPlot var4 = new org.jfree.chart.plot.ContourPlot();
    org.jfree.chart.plot.CategoryMarker var6 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    var4.addRangeMarker((org.jfree.chart.plot.Marker)var6);
    boolean var8 = var0.removeRangeMarker((org.jfree.chart.plot.Marker)var6);
    org.jfree.chart.plot.CombinedRangeXYPlot var9 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var10 = var9.getRangeZeroBaselineStroke();
    java.lang.String var11 = var9.getPlotType();
    boolean var12 = var9.isDomainZoomable();
    org.jfree.chart.plot.CombinedRangeXYPlot var13 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var14 = var13.getRangeZeroBaselineStroke();
    var9.setDomainCrosshairStroke(var14);
    var0.setRangeZeroBaselineStroke(var14);
    
    // Checks the contract:  equals-hashcode on var0 and var13
    assertTrue("Contract failed: equals-hashcode on var0 and var13", var0.equals(var13) ? var0.hashCode() == var13.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var13 and var0
    assertTrue("Contract failed: equals-hashcode on var13 and var0", var13.equals(var0) ? var13.hashCode() == var0.hashCode() : true);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    org.jfree.data.time.DynamicTimeSeriesCollection var2 = new org.jfree.data.time.DynamicTimeSeriesCollection(2, (-1));
    org.jfree.data.time.RegularTimePeriod var3 = var2.advanceTime();

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    org.jfree.chart.renderer.xy.XYSplineRenderer var1 = new org.jfree.chart.renderer.xy.XYSplineRenderer(2147483647);
    var1.setLinesVisible(true);
    java.lang.Boolean var5 = var1.getSeriesLinesVisible(10);
    java.lang.Boolean var6 = var1.getShapesVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var6 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var6.setUpperMargin(10.0d);
    var6.setAxisLineVisible(true);
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var12 = var11.getLocation();
    java.awt.Dimension var13 = var11.preferredSize();
    java.awt.Rectangle var14 = var11.bounds();
    java.awt.Point var15 = var0.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var6, (java.awt.geom.Rectangle2D)var14);
    org.jfree.data.xy.DefaultXYZDataset var17 = new org.jfree.data.xy.DefaultXYZDataset();
    org.jfree.data.DomainOrder var18 = var17.getDomainOrder();
    var0.setDataset(1, (org.jfree.data.xy.XYDataset)var17);
    java.lang.Object var20 = var17.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    java.lang.Number var5 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.category.CategoryDataset)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.general.PieDataset var7 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow((org.jfree.data.category.CategoryDataset)var0, 15);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.0d+ "'", var5.equals(1.0d));

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.updateUI();
    java.lang.String var4 = var0.toString();
    var0.setFocusable(true);
    boolean var7 = var0.requestDefaultFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var4,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var4.equals("org.jfree.chart.ChartPanel[,0,0,0var4,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    org.jfree.chart.util.HexNumberFormat var1 = new org.jfree.chart.util.HexNumberFormat((-2));

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    org.jfree.data.KeyedObjects var0 = new org.jfree.data.KeyedObjects();
    org.jfree.data.xy.XIntervalDataItem var5 = new org.jfree.data.xy.XIntervalDataItem(1.0d, 0.05d, 0.2d, 2.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeValue((java.lang.Comparable)0.05d);
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var2 = var0.get(15);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    java.lang.Number[][] var0 = new java.lang.Number[][] { };
    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var1);
    int var3 = var2.getRowCount();
    org.jfree.data.xy.OHLCDataItem[] var5 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var6 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var5);
    var2.setSeriesKeys((java.lang.Comparable[])var5);
    org.jfree.data.statistics.SimpleHistogramBin var11 = new org.jfree.data.statistics.SimpleHistogramBin(0.05d, 2.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var12 = var2.getValue((java.lang.Comparable)(-1.0f), (java.lang.Comparable)2.0d);
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    boolean var3 = var0.isDoubleBuffered();
    var0.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Month var2 = new org.jfree.data.time.Month((-2), 2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    org.jfree.chart.renderer.xy.XYBlockRenderer var0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var1 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var2 = var0.findDomainBounds((org.jfree.data.xy.XYDataset)var1);
    java.lang.Number var3 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset)var1);
    var1.add(100.0d, Double.NaN, "jfreechart-onetime-");
    var1.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var11 = var1.getY(1, 2013);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + Double.NaN+ "'", var3.equals(Double.NaN));

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    var0.setDomainZeroBaselineVisible(false);
    org.jfree.chart.axis.CyclicNumberAxis var6 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var7 = var6.isAxisLineVisible();
    var6.setAxisLineVisible(true);
    org.jfree.data.general.DefaultKeyedValues2DDataset var10 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var10.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var10);
    var6.setDefaultAutoRange(var15);
    org.jfree.data.Range var17 = var6.getRange();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeAxis((-2), (org.jfree.chart.axis.ValueAxis)var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.plot.CategoryMarker var2 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var3 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var5 = var3.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var8 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var9 = var8.getTickLabelPaint();
    var3.setFillPaint(var9, true);
    var2.setLabelPaint(var9);
    var0.setDomainGridlinePaint(var9);
    var0.setDrawSharedDomainAxis(false);
    var0.zoom(Double.NaN);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.String var3 = var2.getDescription();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYDataItem var5 = var2.remove((java.lang.Number)(-90.0d));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    org.jfree.chart.plot.dial.DialValueIndicator var0 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var1 = var0.getInsets();
    java.awt.Stroke var2 = var0.getOutlineStroke();
    javax.swing.JPanel var3 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var4 = var3.getPreferredSize();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var3.setNextFocusableComponent((java.awt.Component)var5);
    java.util.Locale var7 = var5.getLocale();
    javax.swing.JPanel var8 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var9 = var8.getPreferredSize();
    java.awt.Dimension var10 = var5.getSize(var9);
    java.awt.event.ContainerListener[] var11 = var5.getContainerListeners();
    javax.swing.JPanel var12 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var13 = var12.getPreferredSize();
    java.awt.image.ColorModel var14 = var12.getColorModel();
    var12.updateUI();
    java.lang.String var16 = var12.toString();
    java.awt.Color var17 = var12.getForeground();
    var5.setBackground(var17);
    var0.setOutlinePaint((java.awt.Paint)var17);
    javax.swing.JPanel var20 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var21 = var20.getPreferredSize();
    javax.swing.JPanel var22 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var20.setNextFocusableComponent((java.awt.Component)var22);
    java.util.Locale var24 = var22.getLocale();
    javax.swing.JPanel var25 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var26 = var25.getPreferredSize();
    java.awt.Dimension var27 = var22.getSize(var26);
    java.awt.event.ContainerListener[] var28 = var22.getContainerListeners();
    javax.swing.JPanel var29 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var30 = var29.getPreferredSize();
    java.awt.image.ColorModel var31 = var29.getColorModel();
    var29.updateUI();
    java.lang.String var33 = var29.toString();
    java.awt.Color var34 = var29.getForeground();
    var22.setBackground(var34);
    var0.setOutlinePaint((java.awt.Paint)var34);
    float[] var37 = new float[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var38 = var34.getRGBComponents(var37);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertTrue("'" + var16 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var16,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var16.equals("org.jfree.chart.ChartPanel[,0,0,0var16,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var33,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var33.equals("org.jfree.chart.ChartPanel[,0,0,0var33,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    org.jfree.chart.util.HexNumberFormat var3 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var5 = var4.getPreferredSize();
    javax.swing.JPanel var6 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var4.setNextFocusableComponent((java.awt.Component)var6);
    java.util.Locale var8 = var6.getLocale();
    org.jfree.chart.axis.MonthDateFormat var9 = new org.jfree.chart.axis.MonthDateFormat(var8);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var10 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var3, (java.text.DateFormat)var9);
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var12 = var11.getPreferredSize();
    javax.swing.JPanel var13 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var11.setNextFocusableComponent((java.awt.Component)var13);
    java.util.Locale var15 = var13.getLocale();
    org.jfree.chart.axis.MonthDateFormat var16 = new org.jfree.chart.axis.MonthDateFormat(var15);
    org.jfree.chart.labels.StandardXYToolTipGenerator var17 = new org.jfree.chart.labels.StandardXYToolTipGenerator("Combined Range XYPlot", (java.text.DateFormat)var9, (java.text.DateFormat)var16);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var18 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer(10, (org.jfree.chart.labels.XYToolTipGenerator)var17);
    org.jfree.chart.renderer.category.BarRenderer3D var21 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    var21.setSeriesVisible((java.lang.Boolean)false, true);
    double var25 = var21.getBase();
    double var26 = var21.getItemLabelAnchorOffset();
    boolean var27 = var18.equals((java.lang.Object)var26);
    var18.setPlotLines(true);
    var18.setPlotImages(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    var2.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYDataItem var5 = var2.remove(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    org.jfree.chart.util.HexNumberFormat var3 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var5 = var4.getPreferredSize();
    javax.swing.JPanel var6 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var4.setNextFocusableComponent((java.awt.Component)var6);
    java.util.Locale var8 = var6.getLocale();
    org.jfree.chart.axis.MonthDateFormat var9 = new org.jfree.chart.axis.MonthDateFormat(var8);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var10 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var3, (java.text.DateFormat)var9);
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var12 = var11.getPreferredSize();
    javax.swing.JPanel var13 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var11.setNextFocusableComponent((java.awt.Component)var13);
    java.util.Locale var15 = var13.getLocale();
    org.jfree.chart.axis.MonthDateFormat var16 = new org.jfree.chart.axis.MonthDateFormat(var15);
    org.jfree.chart.labels.StandardXYToolTipGenerator var17 = new org.jfree.chart.labels.StandardXYToolTipGenerator("Combined Range XYPlot", (java.text.DateFormat)var9, (java.text.DateFormat)var16);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var18 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer(10, (org.jfree.chart.labels.XYToolTipGenerator)var17);
    org.jfree.chart.renderer.category.BarRenderer3D var21 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    var21.setSeriesVisible((java.lang.Boolean)false, true);
    double var25 = var21.getBase();
    double var26 = var21.getItemLabelAnchorOffset();
    boolean var27 = var18.equals((java.lang.Object)var26);
    org.jfree.util.UnitType var28 = var18.getGapThresholdType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    org.jfree.chart.renderer.category.DefaultCategoryItemRenderer var0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
    var0.setBaseShapesFilled(true);
    java.awt.Font var3 = var0.getBaseLegendTextFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    var2.add((-1.0d), (-1.0d), false);
    double var7 = var2.getMaxY();
    org.jfree.data.time.Year var10 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var11 = new org.jfree.data.time.Month(1, var10);
    org.jfree.chart.util.HexNumberFormat var13 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var14 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var15 = var14.getPreferredSize();
    javax.swing.JPanel var16 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var14.setNextFocusableComponent((java.awt.Component)var16);
    java.util.Locale var18 = var16.getLocale();
    org.jfree.chart.axis.MonthDateFormat var19 = new org.jfree.chart.axis.MonthDateFormat(var18);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var20 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var13, (java.text.DateFormat)var19);
    boolean var21 = var10.equals((java.lang.Object)var19);
    org.jfree.chart.renderer.category.BarRenderer3D var24 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var25 = var24.getItemLabelFont();
    java.awt.Shape var26 = var24.getBaseLegendShape();
    boolean var27 = var10.equals((java.lang.Object)var24);
    var2.setKey((java.lang.Comparable)var27);
    double var29 = var2.getMaxY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1.0d));

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var5 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var0);
    java.util.List var6 = var0.getColumnKeys();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var9 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var12 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var13 = var12.getItemLabelFont();
    double var14 = var12.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var17 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var18 = var17.getItemLabelFont();
    java.awt.Shape var19 = var17.getBaseLegendShape();
    var12.setShape(var19);
    var9.setLegendBar(var19);
    var9.setDrawBarOutline(true);
    org.jfree.data.xy.CategoryTableXYDataset var24 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var25 = var9.findDomainBounds((org.jfree.data.xy.XYDataset)var24);
    org.jfree.data.Range var27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds((org.jfree.data.xy.TableXYDataset)var24, (-1.0d));
    boolean var28 = var0.hasListener((java.util.EventListener)var24);
    var24.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    org.jfree.data.time.DynamicTimeSeriesCollection var2 = new org.jfree.data.time.DynamicTimeSeriesCollection(2, (-1));
    org.jfree.data.Range var4 = var2.getDomainBounds(true);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    org.jfree.chart.entity.StandardEntityCollection var0 = new org.jfree.chart.entity.StandardEntityCollection();
    org.jfree.chart.entity.ChartEntity var3 = var0.getEntity(0.0d, 2.0d);
    org.jfree.chart.entity.ChartEntity var6 = var0.getEntity(10.0d, 1.0d);
    org.jfree.chart.entity.ChartEntity var9 = var0.getEntity((-90.0d), 3.0d);
    org.jfree.chart.entity.StandardEntityCollection var10 = new org.jfree.chart.entity.StandardEntityCollection();
    org.jfree.chart.entity.ChartEntity var13 = var10.getEntity(0.0d, 2.0d);
    org.jfree.chart.entity.ChartEntity var16 = var10.getEntity(10.0d, 1.0d);
    var0.addAll((org.jfree.chart.entity.EntityCollection)var10);
    
    // Checks the contract:  equals-hashcode on var0 and var10
    assertTrue("Contract failed: equals-hashcode on var0 and var10", var0.equals(var10) ? var0.hashCode() == var10.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var10 and var0
    assertTrue("Contract failed: equals-hashcode on var10 and var0", var10.equals(var0) ? var10.hashCode() == var0.hashCode() : true);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    var0.setView(0.2d, 4.0d, 10.0d, 10.0d);
    var0.mapDatasetToScale(2013, 100);
    org.jfree.chart.plot.dial.DialPlot var9 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var10 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var11 = var9.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var10);
    var10.setTickLabelsVisible(false);
    int var14 = var0.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removePointer(2147483647);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.String var3 = var2.getDescription();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYDataItem var5 = var2.remove((java.lang.Number)0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    org.jfree.data.time.TimeTableXYDataset var0 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    var0.remove((org.jfree.data.time.TimePeriod)var2, (java.lang.Comparable)100, false);
    double var8 = var0.getDomainLowerBound(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var11 = var0.getStartX(8, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.NaN);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    org.jfree.chart.annotations.XYPointerAnnotation var4 = new org.jfree.chart.annotations.XYPointerAnnotation("", (-0.7853981633974483d), 1.0d, 0.2d);
    double var5 = var4.getTipRadius();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10.0d);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    org.jfree.data.xy.OHLCDataItem[] var1 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var2 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var2.getVolumeValue(10, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    org.jfree.chart.renderer.xy.XYLineAndShapeRenderer var0 = new org.jfree.chart.renderer.xy.XYLineAndShapeRenderer();
    var0.setBaseItemLabelsVisible((java.lang.Boolean)true);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    java.lang.Object var1 = var0.clone();
    org.jfree.chart.util.HexNumberFormat var3 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.axis.NumberTickUnit var5 = new org.jfree.chart.axis.NumberTickUnit(0.05d, (java.text.NumberFormat)var3, 1);
    java.lang.String var7 = var5.valueToString(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var8 = var0.getCeilingTickUnit((org.jfree.chart.axis.TickUnit)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "0var70000001"+ "'", var7.equals("0var70000001"));

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer var0 = new org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer();
    org.jfree.chart.StandardChartTheme var3 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var4 = var3.getLegendItemPaint();
    var0.setBoxPaint(var4);
    java.lang.Number[][] var6 = new java.lang.Number[][] { };
    java.lang.Number[][] var7 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var6, var7);
    int var10 = var8.getRowIndex((java.lang.Comparable)'a');
    boolean var11 = var0.equals((java.lang.Object)var8);
    java.lang.Comparable[] var13 = new java.lang.Comparable[] { 100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setSeriesKeys(var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    org.jfree.data.time.TimePeriodValue var5 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var2, (java.lang.Number)10);
    var0.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    boolean var7 = var0.getDrawSharedDomainAxis();
    org.jfree.ui.RectangleEdge var9 = var0.getDomainAxisEdge(2);
    var0.zoom(Double.NaN);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    var0.setUseSeriesOffset(true);
    var0.setAutoPopulateSeriesOutlinePaint(false);
    java.lang.Boolean var5 = var0.getShapesFilled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    org.jfree.chart.renderer.xy.XYBarRenderer var1 = new org.jfree.chart.renderer.xy.XYBarRenderer(100.0d);
    boolean var2 = var1.getShadowsVisible();
    var1.setShadowVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    org.jfree.data.resources.DataPackageResources_fr var0 = new org.jfree.data.resources.DataPackageResources_fr();

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    org.jfree.chart.axis.CategoryLabelPositions var1 = org.jfree.chart.axis.CategoryLabelPositions.createDownRotationLabelPositions((-1.0d));
    org.jfree.chart.plot.CategoryPlot var2 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var5 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var4);
    org.jfree.data.time.TimePeriodValue var7 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var4, (java.lang.Number)10);
    var2.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var9 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var11 = var9.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var14 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var15 = var14.getTickLabelPaint();
    var9.setFillPaint(var15, true);
    var2.setDomainCrosshairPaint(var15);
    boolean var19 = var1.equals((java.lang.Object)var2);
    org.jfree.chart.plot.ContourPlot var20 = new org.jfree.chart.plot.ContourPlot();
    var20.setOutlineVisible(false);
    var20.setRangeCrosshairValue(0.04d, false);
    org.jfree.data.time.Year var29 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var30 = new org.jfree.data.time.Month(1, var29);
    org.jfree.data.time.RegularTimePeriod var31 = var30.previous();
    long var32 = var30.getSerialIndex();
    org.jfree.data.time.TimeTableXYDataset var33 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var35 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var36 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var35);
    var33.remove((org.jfree.data.time.TimePeriod)var35, (java.lang.Comparable)100, false);
    org.jfree.chart.axis.PeriodAxis var40 = new org.jfree.chart.axis.PeriodAxis("Compass Plot", (org.jfree.data.time.RegularTimePeriod)var30, (org.jfree.data.time.RegularTimePeriod)var35);
    var40.setMinorTickMarksVisible(false);
    java.awt.Stroke var43 = var40.getMinorTickMarkStroke();
    var20.setDomainCrosshairStroke(var43);
    var2.setRangeMinorGridlineStroke(var43);
    
    // Checks the contract:  equals-hashcode on var5 and var36
    assertTrue("Contract failed: equals-hashcode on var5 and var36", var5.equals(var36) ? var5.hashCode() == var36.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var36 and var5
    assertTrue("Contract failed: equals-hashcode on var36 and var5", var36.equals(var5) ? var36.hashCode() == var5.hashCode() : true);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    org.jfree.chart.renderer.category.StackedBarRenderer3D var0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
    boolean var1 = var0.getIncludeBaseInRange();
    java.awt.Paint var3 = var0.getSeriesFillPaint((-13421773));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    org.jfree.chart.title.TextTitle var1 = new org.jfree.chart.title.TextTitle("hi!");
    var1.setExpandToFitSpace(false);
    java.lang.String[] var10 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var11 = new org.jfree.chart.axis.SymbolAxis("hi!", var10);
    org.jfree.chart.plot.CompassPlot var12 = new org.jfree.chart.plot.CompassPlot();
    boolean var13 = var11.equals((java.lang.Object)var12);
    java.lang.String var14 = var12.getPlotType();
    java.awt.Paint var15 = var12.getRoseCenterPaint();
    java.awt.Paint var16 = var12.getBackgroundPaint();
    javax.swing.JPanel var17 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var18 = var17.getPreferredSize();
    java.awt.image.ColorModel var19 = var17.getColorModel();
    var17.updateUI();
    java.lang.String var21 = var17.toString();
    boolean var22 = var17.getInheritsPopupMenu();
    javax.swing.InputMap var23 = var17.getInputMap();
    var17.nextFocus();
    boolean var25 = var17.getInheritsPopupMenu();
    javax.swing.JPanel var26 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var27 = var26.getPreferredSize();
    java.awt.image.ColorModel var28 = var26.getColorModel();
    var26.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var33 = var26.getForeground();
    var17.setForeground(var33);
    org.jfree.chart.renderer.xy.XYDifferenceRenderer var36 = new org.jfree.chart.renderer.xy.XYDifferenceRenderer(var16, (java.awt.Paint)var33, true);
    org.jfree.chart.block.BlockBorder var37 = new org.jfree.chart.block.BlockBorder((-90.0d), 0.05d, 3.0d, 2.0d, (java.awt.Paint)var33);
    var1.setFrame((org.jfree.chart.block.BlockFrame)var37);
    double var39 = var1.getContentXOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Compass Plot"+ "'", var14.equals("Compass Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var21,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var21.equals("org.jfree.chart.ChartPanel[,0,0,0var21,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1.05d);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.lang.Comparable var1 = var0.getDomainCrosshairColumnKey();
    var0.setCrosshairDatasetIndex(100);
    org.jfree.chart.plot.CombinedRangeXYPlot var4 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var5 = var4.getRangeZeroBaselineStroke();
    org.jfree.chart.title.TextTitle var7 = new org.jfree.chart.title.TextTitle("hi!");
    org.jfree.ui.RectangleInsets var8 = var7.getMargin();
    var4.setAxisOffset(var8);
    var0.setAxisOffset(var8);
    org.jfree.chart.plot.CategoryMarker var12 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var13 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var15 = var13.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var18 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var19 = var18.getTickLabelPaint();
    var13.setFillPaint(var19, true);
    var12.setLabelPaint(var19);
    org.jfree.chart.plot.CompassPlot var23 = new org.jfree.chart.plot.CompassPlot();
    var12.addChangeListener((org.jfree.chart.event.MarkerChangeListener)var23);
    boolean var25 = var0.removeRangeMarker((org.jfree.chart.plot.Marker)var12);
    java.lang.Object var26 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    org.jfree.chart.axis.TickUnitSource var0 = org.jfree.chart.axis.DateAxis.createStandardDateTickUnits();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    org.jfree.data.xy.XYIntervalSeriesCollection var0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var3 = var0.getX(0, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.lang.Comparable var1 = var0.getDomainCrosshairColumnKey();
    var0.setCrosshairDatasetIndex(100);
    org.jfree.chart.plot.CombinedRangeXYPlot var4 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var5 = var4.getRangeZeroBaselineStroke();
    org.jfree.chart.title.TextTitle var7 = new org.jfree.chart.title.TextTitle("hi!");
    org.jfree.ui.RectangleInsets var8 = var7.getMargin();
    var4.setAxisOffset(var8);
    var0.setAxisOffset(var8);
    org.jfree.chart.axis.ValueAxis var12 = var0.getRangeAxis((-13421773));
    java.lang.String[] var15 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var16 = new org.jfree.chart.axis.SymbolAxis("hi!", var15);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var17 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var19 = var17.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var22 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var23 = var22.getTickLabelPaint();
    var17.setFillPaint(var23, true);
    var16.setGridBandAlternatePaint(var23);
    org.jfree.chart.needle.PinNeedle var27 = new org.jfree.chart.needle.PinNeedle();
    org.jfree.chart.plot.CategoryPlot var28 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.plot.CategoryMarker var30 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var31 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var33 = var31.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var36 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var37 = var36.getTickLabelPaint();
    var31.setFillPaint(var37, true);
    var30.setLabelPaint(var37);
    var28.setDomainGridlinePaint(var37);
    var27.setHighlightPaint(var37);
    java.awt.Paint var43 = var27.getHighlightPaint();
    var16.setLabelPaint(var43);
    var0.setRangeCrosshairPaint(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    org.jfree.data.time.DynamicTimeSeriesCollection var2 = new org.jfree.data.time.DynamicTimeSeriesCollection(2, (-1));
    int var4 = var2.offsetFromOldest(51);
    org.jfree.data.time.RegularTimePeriod var5 = var2.advanceTime();

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    org.jfree.chart.axis.NumberAxis3D var0 = new org.jfree.chart.axis.NumberAxis3D();
    var0.setLowerBound(0.04d);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    org.jfree.chart.renderer.category.StackedBarRenderer3D var3 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(100.0d, 0.0d, true);
    var3.setIgnoreZeroValues(true);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    var0.enable(true);
    boolean var6 = var0.isPaintingForPrint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    org.jfree.chart.renderer.xy.XYShapeRenderer var0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    boolean var1 = var0.getUseFillPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    org.jfree.chart.labels.StandardCategorySeriesLabelGenerator var1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("hi!");
    org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer var2 = new org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer();
    org.jfree.chart.StandardChartTheme var5 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var6 = var5.getLegendItemPaint();
    var2.setBoxPaint(var6);
    java.lang.Number[][] var8 = new java.lang.Number[][] { };
    java.lang.Number[][] var9 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var10 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var8, var9);
    int var12 = var10.getRowIndex((java.lang.Comparable)'a');
    boolean var13 = var2.equals((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = var1.generateLabel((org.jfree.data.category.CategoryDataset)var10, 8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    org.jfree.chart.util.HexNumberFormat var2 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.labels.StandardCrosshairLabelGenerator var3 = new org.jfree.chart.labels.StandardCrosshairLabelGenerator("", (java.text.NumberFormat)var2);
    boolean var4 = var2.isParseIntegerOnly();
    org.jfree.chart.labels.IntervalCategoryItemLabelGenerator var5 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator("Compass Plot", (java.text.NumberFormat)var2);
    org.jfree.chart.util.LogFormat var11 = new org.jfree.chart.util.LogFormat(0.0d, "hi!", true);
    javax.swing.JPanel var12 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var13 = var12.getPreferredSize();
    javax.swing.JPanel var14 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var12.setNextFocusableComponent((java.awt.Component)var14);
    java.util.Locale var16 = var14.getLocale();
    org.jfree.chart.axis.TickUnitSource var17 = org.jfree.chart.axis.LogAxis.createLogTickUnits(var16);
    java.text.NumberFormat var18 = java.text.NumberFormat.getPercentInstance(var16);
    org.jfree.chart.labels.StandardXYItemLabelGenerator var19 = new org.jfree.chart.labels.StandardXYItemLabelGenerator("d", (java.text.NumberFormat)var11, var18);
    org.jfree.chart.axis.NumberTickUnit var20 = new org.jfree.chart.axis.NumberTickUnit(0.04d, (java.text.NumberFormat)var11);
    boolean var21 = var5.equals((java.lang.Object)0.04d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var21 == false);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.axis.CategoryAxis var1 = var0.getDomainAxis();
    var0.clearRangeMarkers(2013);
    org.jfree.chart.axis.SubCategoryAxis var6 = new org.jfree.chart.axis.SubCategoryAxis("Combined Range XYPlot");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDomainAxis((-1), (org.jfree.chart.axis.CategoryAxis)var6, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    org.jfree.data.xy.VectorDataItem var5 = new org.jfree.data.xy.VectorDataItem((-1.0d), 10.0d, 2.0d, (-1.0d));
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var8 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    java.awt.Shape var9 = var8.getLegendBar();
    boolean var10 = var5.equals((java.lang.Object)var9);
    var0.setBaseShape(var9);
    var0.setBaseShapesVisible(false);
    java.awt.Paint var14 = var0.getItemLabelPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var5 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var0);
    org.jfree.data.Range var7 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds((org.jfree.data.category.CategoryDataset)var0, true);
    java.lang.String var8 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Range[1.0,1.0]"+ "'", var8.equals("Range[1.0,1.0]"));

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    javax.swing.JPanel var1 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var2 = var1.getPreferredSize();
    javax.swing.JPanel var3 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var1.setNextFocusableComponent((java.awt.Component)var3);
    java.util.Locale var5 = var3.getLocale();
    org.jfree.chart.axis.TickUnitSource var6 = org.jfree.chart.axis.LogAxis.createLogTickUnits(var5);
    java.text.NumberFormat var7 = java.text.NumberFormat.getPercentInstance(var5);
    java.text.NumberFormat var8 = java.text.NumberFormat.getInstance(var5);
    javax.swing.JPanel var9 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var10 = var9.getPreferredSize();
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var9.setNextFocusableComponent((java.awt.Component)var11);
    java.util.Locale var13 = var11.getLocale();
    java.text.NumberFormat var14 = java.text.NumberFormat.getIntegerInstance(var13);
    org.jfree.chart.labels.StandardCategoryItemLabelGenerator var15 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator("hi!?hi!=100&amp;hi!=1", var8, var14);
    
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

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    org.jfree.chart.needle.PinNeedle var0 = new org.jfree.chart.needle.PinNeedle();
    var0.setRotateX((-1.0d));

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var1 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var2 = var0.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var1);
    var1.setTickLabelsVisible(false);
    var1.setTickRadius(0.05d);
    var1.setUpperBound(0.04d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    java.lang.String[] var6 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var7 = new org.jfree.chart.axis.SymbolAxis("hi!", var6);
    org.jfree.chart.plot.CompassPlot var8 = new org.jfree.chart.plot.CompassPlot();
    boolean var9 = var7.equals((java.lang.Object)var8);
    java.lang.String var10 = var8.getPlotType();
    java.awt.Paint var11 = var8.getRoseCenterPaint();
    java.awt.Paint var12 = var8.getBackgroundPaint();
    javax.swing.JPanel var13 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var14 = var13.getPreferredSize();
    java.awt.image.ColorModel var15 = var13.getColorModel();
    var13.updateUI();
    java.lang.String var17 = var13.toString();
    boolean var18 = var13.getInheritsPopupMenu();
    javax.swing.InputMap var19 = var13.getInputMap();
    var13.nextFocus();
    boolean var21 = var13.getInheritsPopupMenu();
    javax.swing.JPanel var22 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var23 = var22.getPreferredSize();
    java.awt.image.ColorModel var24 = var22.getColorModel();
    var22.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var29 = var22.getForeground();
    var13.setForeground(var29);
    org.jfree.chart.renderer.xy.XYDifferenceRenderer var32 = new org.jfree.chart.renderer.xy.XYDifferenceRenderer(var12, (java.awt.Paint)var29, true);
    org.jfree.chart.block.BlockBorder var33 = new org.jfree.chart.block.BlockBorder((-90.0d), 0.05d, 3.0d, 2.0d, (java.awt.Paint)var29);
    java.awt.Paint var34 = var33.getPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Compass Plot"+ "'", var10.equals("Compass Plot"));
    
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
    assertTrue("'" + var17 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var17,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var17.equals("org.jfree.chart.ChartPanel[,0,0,0var17,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    org.jfree.data.xml.RootHandler var0 = new org.jfree.data.xml.RootHandler();
    var0.endElement("", "hi!", "hi!");
    var0.endDocument();
    org.jfree.data.xml.CategorySeriesHandler var6 = new org.jfree.data.xml.CategorySeriesHandler(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.xml.sax.helpers.DefaultHandler var7 = var0.popSubHandler();
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    org.jfree.chart.renderer.WaferMapRenderer var0 = new org.jfree.chart.renderer.WaferMapRenderer();
    java.awt.Paint var2 = var0.getChipColor((java.lang.Number)(-1.0d));

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isCounterClockwise();
    var0.setRadiusGridlinesVisible(false);
    int var4 = var0.getMargin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    org.jfree.data.xy.XYIntervalSeriesCollection var0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.xy.XYBarDataset var2 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var0, 10.0d);
    var2.setBarWidth(2.0d);
    org.jfree.chart.axis.AxisCollection var5 = new org.jfree.chart.axis.AxisCollection();
    java.util.List var6 = var5.getAxesAtLeft();
    org.jfree.data.general.DefaultKeyedValues2DDataset var7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var7.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var7);
    org.jfree.data.Range var14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds((org.jfree.data.category.CategoryDataset)var7, true);
    org.jfree.data.Range var16 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds((org.jfree.data.xy.XYDataset)var2, var6, var14, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var18 = var2.getSeriesKey(52);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.DateFormat var1 = java.text.DateFormat.getDateInstance(2013);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    org.jfree.chart.plot.dial.StandardDialScale var0 = new org.jfree.chart.plot.dial.StandardDialScale();
    var0.setMajorTickIncrement(10.0d);
    java.awt.Paint var3 = var0.getMinorTickPaint();
    var0.setStartAngle((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    double var2 = var1.getOutlierCoefficient();
    org.jfree.data.Range var4 = var1.getRangeBounds(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    org.jfree.chart.axis.AxisCollection var0 = new org.jfree.chart.axis.AxisCollection();
    java.util.List var1 = var0.getAxesAtLeft();
    java.util.List var2 = var0.getAxesAtRight();
    java.util.List var3 = var0.getAxesAtTop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    org.jfree.data.statistics.DefaultStatisticalCategoryDataset var0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    var0.clear();
    java.util.List var2 = var0.getRowKeys();
    java.lang.Object var3 = var0.clone();
    int var4 = var0.getRowCount();
    org.jfree.chart.util.HexNumberFormat var6 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.axis.NumberTickUnit var8 = new org.jfree.chart.axis.NumberTickUnit(0.05d, (java.text.NumberFormat)var6, 1);
    java.lang.String var10 = var8.valueToString(1.0d);
    java.lang.String var12 = var8.valueToString((-0.7853981633974483d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove((java.lang.Comparable)(-0.7853981633974483d), (java.lang.Comparable)(short)10);
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "0var100000001"+ "'", var10.equals("0var100000001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "0var120000000"+ "'", var12.equals("0var120000000"));

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    java.awt.Shape var4 = var2.getBaseLegendShape();
    var2.setSeriesItemLabelsVisible(2, (java.lang.Boolean)true, false);
    int var9 = var2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    org.jfree.data.xy.DefaultIntervalXYDataset var0 = new org.jfree.data.xy.DefaultIntervalXYDataset();
    org.jfree.chart.event.ChartChangeEvent var1 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getItemCount(20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    org.jfree.chart.renderer.xy.StackedXYBarRenderer var0 = new org.jfree.chart.renderer.xy.StackedXYBarRenderer();
    javax.swing.JPanel var1 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var2 = var1.getPreferredSize();
    java.awt.image.ColorModel var3 = var1.getColorModel();
    var1.updateUI();
    java.lang.String var5 = var1.toString();
    var1.setFocusable(true);
    boolean var8 = var0.equals((java.lang.Object)var1);
    boolean var9 = var1.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var5,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var5.equals("org.jfree.chart.ChartPanel[,0,0,0var5,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    org.jfree.chart.axis.NumberTickUnit var1 = new org.jfree.chart.axis.NumberTickUnit(0.05d);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    org.jfree.chart.renderer.category.StackedAreaRenderer var0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Millisecond var7 = new org.jfree.data.time.Millisecond(20, 8, 52, 52, 2147483647, 52, (-2));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    org.jfree.chart.plot.dial.DialValueIndicator var0 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var1 = var0.getInsets();
    java.awt.Stroke var2 = var0.getOutlineStroke();
    javax.swing.JPanel var3 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var4 = var3.getPreferredSize();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var3.setNextFocusableComponent((java.awt.Component)var5);
    java.util.Locale var7 = var5.getLocale();
    javax.swing.JPanel var8 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var9 = var8.getPreferredSize();
    java.awt.Dimension var10 = var5.getSize(var9);
    java.awt.event.ContainerListener[] var11 = var5.getContainerListeners();
    javax.swing.JPanel var12 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var13 = var12.getPreferredSize();
    java.awt.image.ColorModel var14 = var12.getColorModel();
    var12.updateUI();
    java.lang.String var16 = var12.toString();
    java.awt.Color var17 = var12.getForeground();
    var5.setBackground(var17);
    var0.setOutlinePaint((java.awt.Paint)var17);
    javax.swing.JPanel var20 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var21 = var20.getPreferredSize();
    javax.swing.JPanel var22 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var20.setNextFocusableComponent((java.awt.Component)var22);
    java.util.Locale var24 = var22.getLocale();
    javax.swing.JPanel var25 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var26 = var25.getPreferredSize();
    java.awt.Dimension var27 = var22.getSize(var26);
    java.awt.event.ContainerListener[] var28 = var22.getContainerListeners();
    javax.swing.JPanel var29 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var30 = var29.getPreferredSize();
    java.awt.image.ColorModel var31 = var29.getColorModel();
    var29.updateUI();
    java.lang.String var33 = var29.toString();
    java.awt.Color var34 = var29.getForeground();
    var22.setBackground(var34);
    var0.setOutlinePaint((java.awt.Paint)var34);
    org.jfree.ui.RectangleInsets var37 = var0.getInsets();
    org.jfree.ui.RectangleAnchor var38 = var0.getFrameAnchor();
    double var39 = var0.getRadius();
    
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
    assertTrue("'" + var16 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var16,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var16.equals("org.jfree.chart.ChartPanel[,0,0,0var16,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var33,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var33.equals("org.jfree.chart.ChartPanel[,0,0,0var33,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.3d);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    org.jfree.data.time.DynamicTimeSeriesCollection var2 = new org.jfree.data.time.DynamicTimeSeriesCollection(2, (-1));
    java.lang.Number var3 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset)var2);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    org.jfree.data.time.Year var3 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var4 = new org.jfree.data.time.Month(1, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Quarter var5 = new org.jfree.data.time.Quarter(10, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    java.lang.Number[][] var2 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var1, var2);
    int var4 = var3.getRowCount();
    org.jfree.data.xy.OHLCDataItem[] var6 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var7 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var6);
    var3.setSeriesKeys((java.lang.Comparable[])var6);
    double[] var13 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var14 = new org.jfree.chart.annotations.XYPolygonAnnotation(var13);
    double[] var17 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var18 = new org.jfree.chart.annotations.XYPolygonAnnotation(var17);
    org.jfree.chart.ClipPath var19 = new org.jfree.chart.ClipPath(var13, var17);
    double[][] var20 = new double[][] { var13};
    org.jfree.data.category.CategoryDataset var21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", "jfreechart-onetime-", var20);
    org.jfree.data.xy.OHLCDataItem[] var23 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var24 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.contour.DefaultContourDataset var25 = new org.jfree.data.contour.DefaultContourDataset((java.lang.Comparable)"item", (java.lang.Object[])var6, (java.lang.Object[])var20, (java.lang.Object[])var23);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    org.jfree.chart.StandardChartTheme var2 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    org.jfree.chart.plot.DrawingSupplier var3 = var2.getDrawingSupplier();
    org.jfree.chart.plot.dial.StandardDialScale var4 = new org.jfree.chart.plot.dial.StandardDialScale();
    var4.setMajorTickIncrement(10.0d);
    java.awt.Paint var7 = var4.getMinorTickPaint();
    var2.setTickLabelPaint(var7);
    java.awt.Paint var9 = var2.getBaselinePaint();
    java.awt.Paint var10 = var2.getTickLabelPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    org.jfree.data.time.TimePeriodValue var5 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var2, (java.lang.Number)10);
    var0.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    boolean var7 = var0.getDrawSharedDomainAxis();
    boolean var8 = var0.getDrawSharedDomainAxis();
    var0.clearRangeMarkers(0);
    org.jfree.chart.plot.CombinedRangeXYPlot var11 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    var0.addChangeListener((org.jfree.chart.event.PlotChangeListener)var11);
    org.jfree.chart.event.PlotChangeEvent var13 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var11);
    org.jfree.chart.plot.CombinedRangeXYPlot var14 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var15 = var14.getRangeZeroBaselineStroke();
    java.lang.String var16 = var14.getPlotType();
    boolean var17 = var14.isDomainZoomable();
    org.jfree.chart.plot.CombinedRangeXYPlot var18 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var19 = var18.getRangeZeroBaselineStroke();
    var14.setDomainCrosshairStroke(var19);
    var11.setDomainCrosshairStroke(var19);
    
    // Checks the contract:  equals-hashcode on var11 and var14
    assertTrue("Contract failed: equals-hashcode on var11 and var14", var11.equals(var14) ? var11.hashCode() == var14.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var14 and var11
    assertTrue("Contract failed: equals-hashcode on var14 and var11", var14.equals(var11) ? var14.hashCode() == var11.hashCode() : true);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    double[] var2 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var3 = new org.jfree.chart.annotations.XYPolygonAnnotation(var2);
    double[] var6 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var7 = new org.jfree.chart.annotations.XYPolygonAnnotation(var6);
    org.jfree.chart.ClipPath var8 = new org.jfree.chart.ClipPath(var2, var6);
    int var9 = org.jfree.chart.HashUtilities.hashCodeForDoubleArray(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1043495433);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var1 = var0.getRangeZeroBaselineStroke();
    java.lang.String var2 = var0.getPlotType();
    org.jfree.chart.plot.CategoryMarker var4 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var5 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var7 = var5.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var10 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var11 = var10.getTickLabelPaint();
    var5.setFillPaint(var11, true);
    var4.setLabelPaint(var11);
    boolean var15 = var0.removeRangeMarker((org.jfree.chart.plot.Marker)var4);
    org.jfree.chart.axis.AxisLocation var16 = var0.getDomainAxisLocation();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var19 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var22 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var23 = var22.getItemLabelFont();
    double var24 = var22.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var27 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var28 = var27.getItemLabelFont();
    java.awt.Shape var29 = var27.getBaseLegendShape();
    var22.setShape(var29);
    var19.setLegendBar(var29);
    var19.setDrawBarOutline(true);
    org.jfree.data.xy.CategoryTableXYDataset var34 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var35 = var19.findDomainBounds((org.jfree.data.xy.XYDataset)var34);
    int var36 = var0.getIndexOf((org.jfree.chart.renderer.xy.XYItemRenderer)var19);
    var0.setRangeCrosshairVisible(false);
    org.jfree.chart.renderer.xy.StackedXYBarRenderer var39 = new org.jfree.chart.renderer.xy.StackedXYBarRenderer();
    javax.swing.JPanel var40 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var41 = var40.getPreferredSize();
    java.awt.image.ColorModel var42 = var40.getColorModel();
    var40.updateUI();
    java.lang.String var44 = var40.toString();
    var40.setFocusable(true);
    boolean var47 = var39.equals((java.lang.Object)var40);
    java.awt.Paint var49 = var39.lookupSeriesOutlinePaint((-1));
    var0.setDomainCrosshairPaint(var49);
    org.jfree.data.statistics.SimpleHistogramDataset var52 = new org.jfree.data.statistics.SimpleHistogramDataset((java.lang.Comparable)100.0f);
    var0.setDataset((org.jfree.data.xy.XYDataset)var52);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var56 = var52.getStartX(100, 2147483647);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Combined Range XYPlot"+ "'", var2.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var44,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var44.equals("org.jfree.chart.ChartPanel[,0,0,0var44,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    org.jfree.chart.block.EmptyBlock var2 = new org.jfree.chart.block.EmptyBlock(1.5d, 1.0d);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.statistics.SimpleHistogramBin var4 = new org.jfree.data.statistics.SimpleHistogramBin(100.0d, (-170.0d), false, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    org.jfree.chart.axis.CyclicNumberAxis var3 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var4 = var3.isAxisLineVisible();
    var3.setAxisLineVisible(true);
    org.jfree.data.general.DefaultKeyedValues2DDataset var7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var7.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var12 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var7);
    var3.setDefaultAutoRange(var12);
    org.jfree.chart.block.RectangleConstraint var14 = new org.jfree.chart.block.RectangleConstraint(0.04d, var12);
    org.jfree.data.Range var16 = org.jfree.data.Range.shift(var12, Double.NaN);
    
    // Checks the contract:  var16.equals(var16)
    assertTrue("Contract failed: var16.equals(var16)", var16.equals(var16));

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    org.jfree.chart.annotations.XYPointerAnnotation var4 = new org.jfree.chart.annotations.XYPointerAnnotation("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (-1.0d), 0.2d, 4.0d);
    double var5 = var4.getLabelOffset();
    double var6 = var4.getAngle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 4.0d);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    org.jfree.chart.urls.StandardXYURLGenerator var3 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    org.jfree.data.statistics.SimpleHistogramDataset var5 = new org.jfree.data.statistics.SimpleHistogramDataset((java.lang.Comparable)100.0f);
    var5.removeAllBins();
    java.lang.String var9 = var3.generateURL((org.jfree.data.xy.XYDataset)var5, 100, 1);
    org.jfree.data.DomainOrder var10 = var5.getDomainOrder();
    java.lang.Comparable var12 = var5.getSeriesKey(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.addObservation(0.04d);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!?hi!=100&amp;hi!=1"+ "'", var9.equals("hi!?hi!=100&amp;hi!=1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 100.0f+ "'", var12.equals(100.0f));

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    java.lang.String var3 = org.jfree.chart.servlet.ServletUtilities.searchReplace("jfreechart-onetime-", "Combined Range XYPlot", "item");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "jfreechart-onetime-"+ "'", var3.equals("jfreechart-onetime-"));

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    java.awt.Shape var4 = var2.getBaseLegendShape();
    double var5 = var2.getItemMargin();
    org.jfree.chart.plot.CombinedRangeXYPlot var6 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var7 = var6.getRangeZeroBaselineStroke();
    var2.setStroke(var7, false);
    var2.setBase(2.0d);
    java.awt.Font var12 = var2.getItemLabelFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    boolean var2 = var0.getIgnoreRepaint();
    java.awt.dnd.DropTarget var3 = var0.getDropTarget();
    java.awt.event.ContainerListener[] var4 = var0.getContainerListeners();
    var0.paintImmediately(2147483647, 100, 1, 100);
    var0.setIgnoreRepaint(false);
    java.lang.String var12 = var0.getToolTipText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    java.lang.Number[][] var0 = new java.lang.Number[][] { };
    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var1);
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var5 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var4);
    int var6 = var2.getColumnIndex((java.lang.Comparable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var9 = var2.getEndValue((java.lang.Comparable)2.0d, (java.lang.Comparable)(byte)10);
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    org.jfree.chart.plot.Crosshair var0 = new org.jfree.chart.plot.Crosshair();
    double var1 = var0.getValue();
    double var2 = var0.getLabelYOffset();
    org.jfree.chart.plot.dial.DialCap var3 = new org.jfree.chart.plot.dial.DialCap();
    boolean var4 = var0.equals((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    org.jfree.chart.labels.BubbleXYItemLabelGenerator var0 = new org.jfree.chart.labels.BubbleXYItemLabelGenerator();
    java.text.DateFormat var1 = var0.getZDateFormat();
    org.jfree.chart.urls.StandardXYURLGenerator var5 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    org.jfree.data.statistics.SimpleHistogramDataset var7 = new org.jfree.data.statistics.SimpleHistogramDataset((java.lang.Comparable)100.0f);
    var7.removeAllBins();
    java.lang.String var11 = var5.generateURL((org.jfree.data.xy.XYDataset)var7, 100, 1);
    org.jfree.data.DomainOrder var12 = var7.getDomainOrder();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = var0.generateLabel((org.jfree.data.xy.XYDataset)var7, 1, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!?hi!=100&amp;hi!=1"+ "'", var11.equals("hi!?hi!=100&amp;hi!=1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    org.jfree.chart.util.LogFormat var4 = new org.jfree.chart.util.LogFormat(0.0d, "hi!", true);
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var6 = var5.getPreferredSize();
    javax.swing.JPanel var7 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var5.setNextFocusableComponent((java.awt.Component)var7);
    java.util.Locale var9 = var7.getLocale();
    org.jfree.chart.axis.TickUnitSource var10 = org.jfree.chart.axis.LogAxis.createLogTickUnits(var9);
    java.text.NumberFormat var11 = java.text.NumberFormat.getPercentInstance(var9);
    org.jfree.chart.labels.StandardXYItemLabelGenerator var12 = new org.jfree.chart.labels.StandardXYItemLabelGenerator("d", (java.text.NumberFormat)var4, var11);
    var11.setMinimumIntegerDigits(2013);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    java.awt.image.VolatileImage var6 = var2.createVolatileImage(1, 0);
    boolean var7 = var2.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    org.jfree.data.xy.OHLCDataItem[] var1 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var2 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var1);
    int var3 = var2.getSeriesCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var6 = var2.getX(2, 15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    var0.show();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var6 = var5.getLocation();
    java.awt.Dimension var7 = var5.preferredSize();
    java.awt.Rectangle var8 = var5.bounds();
    var0.scrollRectToVisible(var8);
    var0.firePropertyChange("jfreechart-onetime-", '4', ' ');
    java.awt.Graphics var14 = var0.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    org.jfree.chart.plot.GreyPalette var0 = new org.jfree.chart.plot.GreyPalette();
    var0.setPaletteName("Compass Plot");
    boolean var3 = var0.isLogscale();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var1 = var0.getRangeZeroBaselineStroke();
    java.lang.String var2 = var0.getPlotType();
    boolean var3 = var0.isDomainZoomable();
    boolean var4 = org.jfree.chart.plot.PlotUtilities.isEmptyOrNull((org.jfree.chart.plot.XYPlot)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Combined Range XYPlot"+ "'", var2.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    org.jfree.chart.plot.dial.StandardDialFrame var0 = new org.jfree.chart.plot.dial.StandardDialFrame();
    java.awt.Paint var1 = var0.getForegroundPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    org.jfree.chart.renderer.category.ScatterRenderer var0 = new org.jfree.chart.renderer.category.ScatterRenderer();
    var0.setItemMargin(0.2d);
    boolean var3 = var0.getUseFillPaint();
    var0.setSeriesShapesFilled(2, (java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    org.jfree.chart.renderer.xy.XYSplineRenderer var1 = new org.jfree.chart.renderer.xy.XYSplineRenderer(2147483647);
    boolean var4 = var1.getItemShapeFilled((-1), 2013);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    org.jfree.data.function.NormalDistributionFunction2D var2 = new org.jfree.data.function.NormalDistributionFunction2D(4.0d, 10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYDataset var7 = org.jfree.data.general.DatasetUtilities.sampleFunction2D((org.jfree.data.function.Function2D)var2, 100.0d, 10.0d, 100, (java.lang.Comparable)"d");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    double[] var2 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var3 = new org.jfree.chart.annotations.XYPolygonAnnotation(var2);
    double[] var6 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var7 = new org.jfree.chart.annotations.XYPolygonAnnotation(var6);
    org.jfree.chart.ClipPath var8 = new org.jfree.chart.ClipPath(var2, var6);
    double[][] var9 = new double[][] { var2};
    double[] var14 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var15 = new org.jfree.chart.annotations.XYPolygonAnnotation(var14);
    double[] var18 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var19 = new org.jfree.chart.annotations.XYPolygonAnnotation(var18);
    org.jfree.chart.ClipPath var20 = new org.jfree.chart.ClipPath(var14, var18);
    double[][] var21 = new double[][] { var14};
    org.jfree.data.category.CategoryDataset var22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", "jfreechart-onetime-", var21);
    org.jfree.data.category.DefaultIntervalCategoryDataset var23 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var9, var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.general.PieDataset var25 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow((org.jfree.data.category.CategoryDataset)var23, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    org.jfree.chart.plot.CompassPlot var4 = new org.jfree.chart.plot.CompassPlot();
    boolean var5 = var3.equals((java.lang.Object)var4);
    java.lang.String var6 = var4.getPlotType();
    java.awt.Paint var7 = var4.getRoseCenterPaint();
    java.awt.Paint var8 = var4.getBackgroundPaint();
    boolean var9 = var4.getDrawBorder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Compass Plot"+ "'", var6.equals("Compass Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    boolean var2 = var0.getIgnoreRepaint();
    java.awt.dnd.DropTarget var3 = var0.getDropTarget();
    java.awt.event.ContainerListener[] var4 = var0.getContainerListeners();
    var0.paintImmediately(2147483647, 100, 1, 100);
    var0.setIgnoreRepaint(false);
    float var12 = var0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.5f);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.renderer.GrayPaintScale var3 = new org.jfree.chart.renderer.GrayPaintScale(2.0d, 1.05d, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    org.jfree.chart.axis.StandardTickUnitSource var0 = new org.jfree.chart.axis.StandardTickUnitSource();
    org.jfree.chart.util.HexNumberFormat var2 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.axis.NumberTickUnit var4 = new org.jfree.chart.axis.NumberTickUnit(0.05d, (java.text.NumberFormat)var2, 1);
    java.lang.String var6 = var4.valueToString(1.0d);
    java.lang.String var8 = var4.valueToString((-0.7853981633974483d));
    org.jfree.chart.axis.TickUnit var9 = var0.getCeilingTickUnit((org.jfree.chart.axis.TickUnit)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "0var60000001"+ "'", var6.equals("0var60000001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "0var80000000"+ "'", var8.equals("0var80000000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    org.jfree.chart.plot.GreyPalette var0 = new org.jfree.chart.plot.GreyPalette();
    var0.setPaletteName("Compass Plot");
    org.jfree.data.xy.XYIntervalSeriesCollection var3 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.xy.XYBarDataset var5 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var3, 10.0d);
    var5.setBarWidth(2.0d);
    org.jfree.chart.axis.AxisCollection var8 = new org.jfree.chart.axis.AxisCollection();
    java.util.List var9 = var8.getAxesAtLeft();
    org.jfree.data.general.DefaultKeyedValues2DDataset var10 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var10.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var15 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var10);
    org.jfree.data.Range var17 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds((org.jfree.data.category.CategoryDataset)var10, true);
    org.jfree.data.Range var19 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds((org.jfree.data.xy.XYDataset)var5, var9, var17, true);
    var0.setTickValues(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Paint var22 = var0.getColor(1.05d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    boolean var2 = var0.getIgnoreRepaint();
    boolean var3 = var0.isLightweight();
    boolean var4 = var0.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var3 = var2.isAxisLineVisible();
    var2.setAdvanceLineVisible(false);
    var2.setBoundMappedToLastCycle(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    org.jfree.chart.util.RelativeDateFormat var0 = new org.jfree.chart.util.RelativeDateFormat();
    boolean var1 = var0.getShowZeroHours();
    var0.setPositivePrefix("d");
    var0.setBaseMillis(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    org.jfree.data.time.Year var3 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var4 = new org.jfree.data.time.Month(1, var3);
    org.jfree.data.time.RegularTimePeriod var5 = var4.previous();
    long var6 = var4.getSerialIndex();
    org.jfree.data.time.TimeTableXYDataset var7 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var10 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var9);
    var7.remove((org.jfree.data.time.TimePeriod)var9, (java.lang.Comparable)100, false);
    org.jfree.chart.axis.PeriodAxis var14 = new org.jfree.chart.axis.PeriodAxis("Compass Plot", (org.jfree.data.time.RegularTimePeriod)var4, (org.jfree.data.time.RegularTimePeriod)var9);
    var14.setMinorTickMarksVisible(false);
    java.awt.Stroke var17 = var14.getMinorTickMarkStroke();
    org.jfree.data.time.Week var19 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var20 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var19);
    org.jfree.data.time.TimePeriodValue var22 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var19, (java.lang.Number)10);
    var14.setFirst((org.jfree.data.time.RegularTimePeriod)var19);
    
    // Checks the contract:  equals-hashcode on var10 and var20
    assertTrue("Contract failed: equals-hashcode on var10 and var20", var10.equals(var20) ? var10.hashCode() == var20.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var20 and var10
    assertTrue("Contract failed: equals-hashcode on var20 and var10", var20.equals(var10) ? var20.hashCode() == var10.hashCode() : true);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var1 = var0.getRangeZeroBaselineStroke();
    java.lang.String var2 = var0.getPlotType();
    org.jfree.chart.plot.CategoryMarker var4 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var5 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var7 = var5.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var10 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var11 = var10.getTickLabelPaint();
    var5.setFillPaint(var11, true);
    var4.setLabelPaint(var11);
    boolean var15 = var0.removeRangeMarker((org.jfree.chart.plot.Marker)var4);
    java.awt.Paint var16 = var0.getRangeZeroBaselinePaint();
    org.jfree.chart.plot.CombinedRangeXYPlot var17 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var18 = var17.getRangeZeroBaselineStroke();
    java.lang.String var19 = var17.getPlotType();
    org.jfree.chart.plot.CategoryMarker var21 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var22 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var24 = var22.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var27 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var28 = var27.getTickLabelPaint();
    var22.setFillPaint(var28, true);
    var21.setLabelPaint(var28);
    boolean var32 = var17.removeRangeMarker((org.jfree.chart.plot.Marker)var21);
    org.jfree.chart.axis.AxisLocation var33 = var17.getDomainAxisLocation();
    org.jfree.data.time.Week var35 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var36 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var35);
    org.jfree.data.time.TimePeriodValue var38 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var35, (java.lang.Number)10);
    org.jfree.data.time.ohlc.OHLCItem var43 = new org.jfree.data.time.ohlc.OHLCItem((org.jfree.data.time.RegularTimePeriod)var35, 100.0d, 0.0d, 0.05d, 0.0d);
    org.jfree.chart.plot.XYPlot var44 = new org.jfree.chart.plot.XYPlot();
    java.lang.Object var45 = var44.clone();
    org.jfree.data.ComparableObjectItem var46 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable)var43, (java.lang.Object)var44);
    double var47 = var43.getLowValue();
    boolean var48 = var33.equals((java.lang.Object)var43);
    var0.setRangeAxisLocation(var33);
    
    // Checks the contract:  equals-hashcode on var0 and var17
    assertTrue("Contract failed: equals-hashcode on var0 and var17", var0.equals(var17) ? var0.hashCode() == var17.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var17 and var0
    assertTrue("Contract failed: equals-hashcode on var17 and var0", var17.equals(var0) ? var17.hashCode() == var0.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var4 and var21
    assertTrue("Contract failed: equals-hashcode on var4 and var21", var4.equals(var21) ? var4.hashCode() == var21.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var21 and var4
    assertTrue("Contract failed: equals-hashcode on var21 and var4", var21.equals(var4) ? var21.hashCode() == var4.hashCode() : true);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    double var4 = var2.getItemLabelAnchorOffset();
    org.jfree.chart.axis.CyclicNumberAxis var8 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var9 = var8.getTickLabelPaint();
    var2.setLegendTextPaint(0, var9);
    var2.setItemLabelsVisible((java.lang.Boolean)false, true);
    org.jfree.ui.GradientPaintTransformer var14 = var2.getGradientPaintTransformer();
    org.jfree.chart.LegendItem var17 = var2.getLegendItem((-13421773), 2147483647);
    org.jfree.chart.renderer.category.BarRenderer3D var21 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var22 = var21.getItemLabelFont();
    double var23 = var21.getItemLabelAnchorOffset();
    org.jfree.chart.labels.ItemLabelPosition var26 = var21.getNegativeItemLabelPosition(0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setSeriesPositiveItemLabelPosition((-1), var26);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    org.jfree.chart.renderer.category.LayeredBarRenderer var0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
    org.jfree.chart.axis.AxisCollection var1 = new org.jfree.chart.axis.AxisCollection();
    boolean var2 = var0.equals((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    org.jfree.chart.labels.BubbleXYItemLabelGenerator var0 = new org.jfree.chart.labels.BubbleXYItemLabelGenerator();
    java.text.DateFormat var1 = var0.getZDateFormat();
    org.jfree.data.time.DynamicTimeSeriesCollection var4 = new org.jfree.data.time.DynamicTimeSeriesCollection(2, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var0.generateLabelString((org.jfree.data.xy.XYDataset)var4, 52, 51);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    var3.setLabelAngle(0.0d);
    var3.setTickLabelsVisible(true);
    java.lang.String var8 = var3.getLabel();
    var3.setMinorTickCount(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    org.jfree.chart.renderer.category.DefaultCategoryItemRenderer var0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = var0.getSeriesItemURLGenerator(2147483647);
    boolean var3 = var0.getBaseShapesVisible();
    java.lang.Boolean var5 = var0.getSeriesVisibleInLegend(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    org.jfree.chart.title.ShortTextTitle var1 = new org.jfree.chart.title.ShortTextTitle("0x00000000");

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Minute var5 = new org.jfree.data.time.Minute(20, 15, 8, 2013, 20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ResourceBundle var1 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("-4,-4,4,4");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    org.jfree.data.xy.DefaultIntervalXYDataset var0 = new org.jfree.data.xy.DefaultIntervalXYDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var0.getStartYValue((-13421773), 2147483647);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    org.jfree.chart.axis.CyclicNumberAxis var3 = new org.jfree.chart.axis.CyclicNumberAxis(1.0d, 4.0d, "");
    boolean var4 = var3.isAxisLineVisible();
    boolean var5 = var3.isTickLabelsVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    org.jfree.chart.axis.AxisState var0 = new org.jfree.chart.axis.AxisState();
    var0.setCursor(10.0d);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var1 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var2 = var0.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var1);
    double var4 = var0.getValue(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NaN);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var1 = var0.getRangeZeroBaselineStroke();
    java.lang.String var2 = var0.getPlotType();
    org.jfree.chart.plot.CategoryMarker var4 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var5 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var7 = var5.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var10 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var11 = var10.getTickLabelPaint();
    var5.setFillPaint(var11, true);
    var4.setLabelPaint(var11);
    boolean var15 = var0.removeRangeMarker((org.jfree.chart.plot.Marker)var4);
    org.jfree.chart.axis.AxisLocation var16 = var0.getDomainAxisLocation();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var19 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var22 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var23 = var22.getItemLabelFont();
    double var24 = var22.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var27 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var28 = var27.getItemLabelFont();
    java.awt.Shape var29 = var27.getBaseLegendShape();
    var22.setShape(var29);
    var19.setLegendBar(var29);
    var19.setDrawBarOutline(true);
    org.jfree.data.xy.CategoryTableXYDataset var34 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var35 = var19.findDomainBounds((org.jfree.data.xy.XYDataset)var34);
    int var36 = var0.getIndexOf((org.jfree.chart.renderer.xy.XYItemRenderer)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Paint var38 = var0.getQuadrantPaint(2013);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Combined Range XYPlot"+ "'", var2.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    org.jfree.chart.plot.PlotState var0 = new org.jfree.chart.plot.PlotState();

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var0 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem(1, 0);
    org.jfree.data.xy.XYIntervalSeriesCollection var4 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.Range var5 = var0.findRangeBounds((org.jfree.data.xy.XYDataset)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var4.getEndYValue(52, (-2));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    org.jfree.data.general.DatasetGroup var1 = new org.jfree.data.general.DatasetGroup("hi!?hi!=100&amp;hi!=1");

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var1 = var0.getBaseItemLabelsVisible();
    var0.setSeriesShapesFilled(1, (java.lang.Boolean)false);
    var0.setDrawOutlines(true);
    org.jfree.chart.renderer.category.BarRenderer3D var9 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var10 = var9.getItemLabelFont();
    double var11 = var9.getItemLabelAnchorOffset();
    java.awt.Shape var13 = var9.getSeriesShape(1);
    org.jfree.chart.renderer.category.BarRenderer3D var17 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var18 = var17.getItemLabelFont();
    double var19 = var17.getItemLabelAnchorOffset();
    org.jfree.chart.axis.CyclicNumberAxis var23 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var24 = var23.getTickLabelPaint();
    var17.setLegendTextPaint(0, var24);
    var9.setSeriesFillPaint(100, var24, true);
    var0.setBaseOutlinePaint(var24, false);
    java.lang.Object var30 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var1 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var2 = var1.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator var3 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.XYStepAreaRenderer var4 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(0, (org.jfree.chart.labels.XYToolTipGenerator)var1, (org.jfree.chart.urls.XYURLGenerator)var3);
    boolean var5 = var4.getPlotArea();
    java.lang.Object var6 = var4.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    double var4 = var2.getItemLabelAnchorOffset();
    java.lang.String[] var8 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var9 = new org.jfree.chart.axis.SymbolAxis("hi!", var8);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var10 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var12 = var10.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var15 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var16 = var15.getTickLabelPaint();
    var10.setFillPaint(var16, true);
    var9.setGridBandAlternatePaint(var16);
    var2.setSeriesFillPaint(2013, var16, false);
    var2.setItemLabelsVisible((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    org.jfree.chart.renderer.category.StackedBarRenderer var1 = new org.jfree.chart.renderer.category.StackedBarRenderer(false);
    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var5 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var8 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var9 = var8.getItemLabelFont();
    double var10 = var8.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var13 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var14 = var13.getItemLabelFont();
    java.awt.Shape var15 = var13.getBaseLegendShape();
    var8.setShape(var15);
    var5.setLegendBar(var15);
    org.jfree.data.general.DefaultKeyedValues2DDataset var20 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var23 = new org.jfree.chart.entity.CategoryItemEntity(var15, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var20, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    org.jfree.data.Range var25 = var2.findRangeBounds((org.jfree.data.category.CategoryDataset)var20, true);
    org.jfree.data.Range var26 = var1.findRangeBounds((org.jfree.data.category.CategoryDataset)var20);
    org.jfree.chart.labels.ItemLabelPosition var27 = var1.getNegativeItemLabelPositionFallback();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    org.jfree.chart.renderer.category.LayeredBarRenderer var0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
    java.awt.Paint var1 = var0.getBaseLegendTextPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    org.jfree.data.xy.OHLCDataItem[] var2 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var3 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var2);
    org.jfree.chart.plot.CategoryPlot var4 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.axis.CyclicNumberAxis var7 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var8 = var7.getTickLabelPaint();
    org.jfree.chart.axis.ValueAxis[] var9 = new org.jfree.chart.axis.ValueAxis[] { var7};
    var4.setRangeAxes(var9);
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var17 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var20 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var21 = var20.getItemLabelFont();
    double var22 = var20.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var25 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var26 = var25.getItemLabelFont();
    java.awt.Shape var27 = var25.getBaseLegendShape();
    var20.setShape(var27);
    var17.setLegendBar(var27);
    var17.setDrawBarOutline(true);
    org.jfree.chart.title.LegendTitle var32 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var17);
    org.jfree.chart.annotations.XYDrawableAnnotation var33 = new org.jfree.chart.annotations.XYDrawableAnnotation(100.0d, 10.0d, 0.0d, (-1.0d), (org.jfree.ui.Drawable)var32);
    java.awt.Paint var34 = var32.getItemPaint();
    org.jfree.chart.LegendItemSource[] var35 = var32.getSources();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.contour.NonGridContourDataset var39 = new org.jfree.data.contour.NonGridContourDataset("hi!", (java.lang.Object[])var2, (java.lang.Object[])var9, (java.lang.Object[])var35, 52, (-2), 2013);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    org.jfree.data.xy.DefaultXYZDataset var0 = new org.jfree.data.xy.DefaultXYZDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var3 = var0.getZ((-13421773), 2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }


    org.jfree.chart.util.HexNumberFormat var3 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var5 = var4.getPreferredSize();
    javax.swing.JPanel var6 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var4.setNextFocusableComponent((java.awt.Component)var6);
    java.util.Locale var8 = var6.getLocale();
    org.jfree.chart.axis.MonthDateFormat var9 = new org.jfree.chart.axis.MonthDateFormat(var8);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var10 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var3, (java.text.DateFormat)var9);
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var12 = var11.getPreferredSize();
    javax.swing.JPanel var13 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var11.setNextFocusableComponent((java.awt.Component)var13);
    java.util.Locale var15 = var13.getLocale();
    org.jfree.chart.axis.MonthDateFormat var16 = new org.jfree.chart.axis.MonthDateFormat(var15);
    org.jfree.chart.labels.StandardXYToolTipGenerator var17 = new org.jfree.chart.labels.StandardXYToolTipGenerator("Combined Range XYPlot", (java.text.DateFormat)var9, (java.text.DateFormat)var16);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var18 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer(10, (org.jfree.chart.labels.XYToolTipGenerator)var17);
    org.jfree.chart.renderer.category.BarRenderer3D var21 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    var21.setSeriesVisible((java.lang.Boolean)false, true);
    double var25 = var21.getBase();
    double var26 = var21.getItemLabelAnchorOffset();
    boolean var27 = var18.equals((java.lang.Object)var26);
    boolean var28 = var18.getPlotLines();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    org.jfree.data.contour.NonGridContourDataset var0 = new org.jfree.data.contour.NonGridContourDataset();
    int var3 = var0.indexZ(2013, 20);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    boolean var1 = org.jfree.chart.util.PaintAlpha.setLegacyAlpha(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var1 = var0.getBaseItemLabelsVisible();
    var0.setSeriesShapesFilled(20, false);
    boolean var7 = var0.getItemShapeFilled(2013, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    java.lang.Number[][] var0 = new java.lang.Number[][] { };
    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var1);
    int var3 = var2.getRowCount();
    org.jfree.data.xy.OHLCDataItem[] var5 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var6 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var5);
    var2.setSeriesKeys((java.lang.Comparable[])var5);
    int var9 = var2.getSeriesIndex((java.lang.Comparable)"Compass Plot");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var12 = var2.getStartValue((java.lang.Comparable)'4', (java.lang.Comparable)15);
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    org.jfree.chart.plot.ThermometerPlot var0 = new org.jfree.chart.plot.ThermometerPlot();
    org.jfree.chart.axis.ValueAxis var1 = var0.getRangeAxis();
    var1.setUpperBound(3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Day var3 = new org.jfree.data.time.Day(20, 10, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.lang.Comparable var1 = var0.getDomainCrosshairColumnKey();
    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    var2.setUseSeriesOffset(true);
    var2.setBaseSeriesVisible(true);
    var2.setAutoPopulateSeriesShape(false);
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var9 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
    var0.setRenderers(var9);
    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    org.jfree.data.xy.VectorDataItem var17 = new org.jfree.data.xy.VectorDataItem((-1.0d), 10.0d, 2.0d, (-1.0d));
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var20 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    java.awt.Shape var21 = var20.getLegendBar();
    boolean var22 = var17.equals((java.lang.Object)var21);
    var12.setBaseShape(var21);
    var12.setBaseShapesVisible(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRenderer((-1), (org.jfree.chart.renderer.category.CategoryItemRenderer)var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    org.jfree.chart.renderer.xy.XYBarRenderer var1 = new org.jfree.chart.renderer.xy.XYBarRenderer(100.0d);
    boolean var2 = var1.getShadowsVisible();
    boolean var3 = var1.getUseYInterval();
    double var4 = var1.getBarAlignmentFactor();
    var1.setShadowVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1.0d));

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    java.util.Locale var4 = var2.getLocale();
    var2.list();
    boolean var6 = var2.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    org.jfree.data.time.Year var1 = new org.jfree.data.time.Year(100);
    org.jfree.chart.plot.CategoryPlot var2 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var5 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var4);
    org.jfree.data.time.TimePeriodValue var7 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var4, (java.lang.Number)10);
    var2.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    boolean var9 = var2.getDrawSharedDomainAxis();
    boolean var10 = var2.getDrawSharedDomainAxis();
    var2.clearRangeMarkers(0);
    org.jfree.chart.plot.CombinedRangeXYPlot var13 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    var2.addChangeListener((org.jfree.chart.event.PlotChangeListener)var13);
    org.jfree.chart.event.PlotChangeEvent var15 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var13);
    int var16 = var1.compareTo((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    org.jfree.chart.renderer.category.BarRenderer3D var6 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var7 = var6.getItemLabelFont();
    java.awt.Shape var8 = var6.getBaseLegendShape();
    org.jfree.chart.entity.ContourEntity var10 = new org.jfree.chart.entity.ContourEntity(var8, "hi!?hi!=100&amp;hi!=1");
    org.jfree.chart.title.TextTitle var12 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var13 = var12.isVisible();
    java.lang.Object var14 = var12.clone();
    java.lang.String var15 = var12.getURLText();
    javax.swing.JPanel var16 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var17 = var16.getPreferredSize();
    java.awt.image.ColorModel var18 = var16.getColorModel();
    var16.updateUI();
    java.lang.String var20 = var16.toString();
    java.awt.Color var21 = var16.getForeground();
    var12.setBackgroundPaint((java.awt.Paint)var21);
    int var23 = var21.getRGB();
    int var24 = var21.getBlue();
    org.jfree.chart.plot.dial.DialPlot var25 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var26 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var27 = var25.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var26);
    org.jfree.chart.plot.dial.DialValueIndicator var28 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var29 = var28.getInsets();
    int var30 = var25.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var28);
    java.awt.Stroke var31 = var28.getOutlineStroke();
    org.jfree.chart.title.TextTitle var33 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var34 = var33.isVisible();
    java.lang.Object var35 = var33.clone();
    java.lang.String var36 = var33.getURLText();
    javax.swing.JPanel var37 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var38 = var37.getPreferredSize();
    java.awt.image.ColorModel var39 = var37.getColorModel();
    var37.updateUI();
    java.lang.String var41 = var37.toString();
    java.awt.Color var42 = var37.getForeground();
    var33.setBackgroundPaint((java.awt.Paint)var42);
    org.jfree.chart.LegendItem var44 = new org.jfree.chart.LegendItem("", "jfreechart-", "hi!", "hi!", var8, (java.awt.Paint)var21, var31, (java.awt.Paint)var42);
    var44.setDatasetIndex((-2));
    var44.setSeriesKey((java.lang.Comparable)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var20,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var20.equals("org.jfree.chart.ChartPanel[,0,0,0var20,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-13421773));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var41,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var41.equals("org.jfree.chart.ChartPanel[,0,0,0var41,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    org.jfree.chart.renderer.xy.XYShapeRenderer var0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    boolean var1 = var0.getDrawOutlines();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    org.jfree.chart.renderer.category.BarRenderer3D var6 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var7 = var6.getItemLabelFont();
    double var8 = var6.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var11 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var12 = var11.getItemLabelFont();
    java.awt.Shape var13 = var11.getBaseLegendShape();
    var6.setShape(var13);
    var3.setDownArrow(var13);
    var3.setAutoRange(false);
    org.jfree.chart.plot.dial.StandardDialScale var18 = new org.jfree.chart.plot.dial.StandardDialScale();
    var18.setMajorTickIncrement(10.0d);
    java.awt.Paint var21 = var18.getMinorTickPaint();
    var3.setGridBandPaint(var21);
    java.lang.String[] var23 = var3.getSymbols();
    java.lang.Number[][] var24 = new java.lang.Number[][] { };
    java.lang.Number[][] var25 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var26 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var24, var25);
    java.lang.Number[][] var27 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var28 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var23, var24, var27);
    
    // Checks the contract:  equals-hashcode on var26 and var28
    assertTrue("Contract failed: equals-hashcode on var26 and var28", var26.equals(var28) ? var26.hashCode() == var28.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var28 and var26
    assertTrue("Contract failed: equals-hashcode on var28 and var26", var28.equals(var26) ? var28.hashCode() == var26.hashCode() : true);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    java.awt.Shape var4 = var2.getBaseLegendShape();
    double var5 = var2.getItemMargin();
    org.jfree.chart.plot.CombinedRangeXYPlot var6 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var7 = var6.getRangeZeroBaselineStroke();
    var2.setStroke(var7, false);
    double var10 = var2.getItemMargin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.2d);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var6 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var9 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var10 = var9.getItemLabelFont();
    double var11 = var9.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var14 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var15 = var14.getItemLabelFont();
    java.awt.Shape var16 = var14.getBaseLegendShape();
    var9.setShape(var16);
    var6.setLegendBar(var16);
    org.jfree.chart.plot.dial.DialValueIndicator var19 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var20 = var19.getInsets();
    java.awt.Stroke var21 = var19.getOutlineStroke();
    javax.swing.JPanel var22 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var23 = var22.getPreferredSize();
    javax.swing.JPanel var24 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var22.setNextFocusableComponent((java.awt.Component)var24);
    java.util.Locale var26 = var24.getLocale();
    javax.swing.JPanel var27 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var28 = var27.getPreferredSize();
    java.awt.Dimension var29 = var24.getSize(var28);
    java.awt.event.ContainerListener[] var30 = var24.getContainerListeners();
    javax.swing.JPanel var31 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var32 = var31.getPreferredSize();
    java.awt.image.ColorModel var33 = var31.getColorModel();
    var31.updateUI();
    java.lang.String var35 = var31.toString();
    java.awt.Color var36 = var31.getForeground();
    var24.setBackground(var36);
    var19.setOutlinePaint((java.awt.Paint)var36);
    java.awt.Color var39 = var36.brighter();
    org.jfree.chart.renderer.category.BarRenderer3D var42 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var43 = var42.getItemLabelFont();
    java.awt.Shape var44 = var42.getBaseLegendShape();
    double var45 = var42.getItemMargin();
    org.jfree.chart.plot.CombinedRangeXYPlot var46 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var47 = var46.getRangeZeroBaselineStroke();
    var42.setStroke(var47, false);
    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var50 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    boolean var51 = var50.isOutline();
    var50.setUseFillPaint(true);
    org.jfree.chart.StandardChartTheme var56 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var57 = var56.getLegendItemPaint();
    var50.setShapePaint(var57);
    org.jfree.chart.LegendItem var59 = new org.jfree.chart.LegendItem("Compass Plot", "Combined Range XYPlot", "d", "jfreechart-onetime-", var16, (java.awt.Paint)var39, var47, var57);
    float[] var60 = new float[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var61 = var39.getColorComponents(var60);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var35,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var35.equals("org.jfree.chart.ChartPanel[,0,0,0var35,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    org.jfree.chart.renderer.category.IntervalBarRenderer var0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
    double var1 = var0.getShadowXOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.0d);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    org.jfree.chart.annotations.XYLineAnnotation var4 = new org.jfree.chart.annotations.XYLineAnnotation((-1.0d), (-1.0d), 100.0d, 100.0d);
    org.jfree.data.xy.DefaultIntervalXYDataset var5 = new org.jfree.data.xy.DefaultIntervalXYDataset();
    boolean var6 = var4.hasListener((java.util.EventListener)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var9 = var5.getEndY(2013, 1043495433);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    org.jfree.chart.renderer.category.ScatterRenderer var0 = new org.jfree.chart.renderer.category.ScatterRenderer();
    var0.setItemMargin(0.2d);
    double var3 = var0.getItemMargin();
    org.jfree.chart.plot.CategoryMarker var6 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var7 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var9 = var7.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var12 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var13 = var12.getTickLabelPaint();
    var7.setFillPaint(var13, true);
    var6.setLabelPaint(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesFillPaint((-2), var13, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var1 = var0.getRangeZeroBaselineStroke();
    double var2 = var0.getRangeCrosshairValue();
    org.jfree.chart.renderer.category.BarRenderer3D var9 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var10 = var9.getItemLabelFont();
    java.awt.Shape var11 = var9.getBaseLegendShape();
    org.jfree.chart.entity.ContourEntity var13 = new org.jfree.chart.entity.ContourEntity(var11, "hi!?hi!=100&amp;hi!=1");
    org.jfree.chart.title.TextTitle var15 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var16 = var15.isVisible();
    java.lang.Object var17 = var15.clone();
    java.lang.String var18 = var15.getURLText();
    javax.swing.JPanel var19 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var20 = var19.getPreferredSize();
    java.awt.image.ColorModel var21 = var19.getColorModel();
    var19.updateUI();
    java.lang.String var23 = var19.toString();
    java.awt.Color var24 = var19.getForeground();
    var15.setBackgroundPaint((java.awt.Paint)var24);
    int var26 = var24.getRGB();
    int var27 = var24.getBlue();
    org.jfree.chart.plot.dial.DialPlot var28 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var29 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var30 = var28.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var29);
    org.jfree.chart.plot.dial.DialValueIndicator var31 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var32 = var31.getInsets();
    int var33 = var28.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var31);
    java.awt.Stroke var34 = var31.getOutlineStroke();
    org.jfree.chart.title.TextTitle var36 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var37 = var36.isVisible();
    java.lang.Object var38 = var36.clone();
    java.lang.String var39 = var36.getURLText();
    javax.swing.JPanel var40 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var41 = var40.getPreferredSize();
    java.awt.image.ColorModel var42 = var40.getColorModel();
    var40.updateUI();
    java.lang.String var44 = var40.toString();
    java.awt.Color var45 = var40.getForeground();
    var36.setBackgroundPaint((java.awt.Paint)var45);
    org.jfree.chart.LegendItem var47 = new org.jfree.chart.LegendItem("", "jfreechart-", "hi!", "hi!", var11, (java.awt.Paint)var24, var34, (java.awt.Paint)var45);
    var0.setDomainZeroBaselinePaint((java.awt.Paint)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var23,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var23.equals("org.jfree.chart.ChartPanel[,0,0,0var23,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-13421773));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var44,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var44.equals("org.jfree.chart.ChartPanel[,0,0,0var44,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var3 = var2.isAxisLineVisible();
    var2.setAxisLineVisible(true);
    var2.setMinorTickMarksVisible(true);
    org.jfree.chart.plot.CombinedRangeXYPlot var8 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var2);
    var8.setDomainMinorGridlinesVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    org.jfree.data.time.TimePeriodValue var5 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var2, (java.lang.Number)10);
    var0.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    boolean var7 = var0.getDrawSharedDomainAxis();
    boolean var8 = var0.getDrawSharedDomainAxis();
    var0.clearRangeMarkers(0);
    org.jfree.chart.plot.CombinedRangeXYPlot var11 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    var0.addChangeListener((org.jfree.chart.event.PlotChangeListener)var11);
    org.jfree.data.time.Week var14 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var15 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var14);
    org.jfree.data.time.TimePeriodValue var17 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var14, (java.lang.Number)10);
    org.jfree.data.time.ohlc.OHLCItem var22 = new org.jfree.data.time.ohlc.OHLCItem((org.jfree.data.time.RegularTimePeriod)var14, 100.0d, 0.0d, 0.05d, 0.0d);
    org.jfree.chart.plot.XYPlot var23 = new org.jfree.chart.plot.XYPlot();
    java.lang.Object var24 = var23.clone();
    org.jfree.data.ComparableObjectItem var25 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable)var22, (java.lang.Object)var23);
    java.lang.String var26 = var23.getNoDataMessage();
    var11.remove(var23);
    
    // Checks the contract:  equals-hashcode on var3 and var15
    assertTrue("Contract failed: equals-hashcode on var3 and var15", var3.equals(var15) ? var3.hashCode() == var15.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var15 and var3
    assertTrue("Contract failed: equals-hashcode on var15 and var3", var15.equals(var3) ? var15.hashCode() == var3.hashCode() : true);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    org.jfree.chart.plot.ThermometerPlot var0 = new org.jfree.chart.plot.ThermometerPlot();
    boolean var1 = var0.isDomainZoomable();
    int var2 = var0.getAxisLocation();
    org.jfree.data.general.ValueDataset var3 = var0.getDataset();
    org.jfree.chart.plot.dial.DialPlot var4 = new org.jfree.chart.plot.dial.DialPlot(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isCounterClockwise();
    var0.setRadiusGridlinesVisible(false);
    int var4 = var0.getDatasetCount();
    var0.addCornerTextItem("");
    java.lang.String[] var10 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var11 = new org.jfree.chart.axis.SymbolAxis("hi!", var10);
    org.jfree.chart.plot.CompassPlot var12 = new org.jfree.chart.plot.CompassPlot();
    boolean var13 = var11.equals((java.lang.Object)var12);
    var11.setAxisLineVisible(true);
    var11.setGridBandsVisible(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setAxis(2147483647, (org.jfree.chart.axis.ValueAxis)var11);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var1 = var0.getRangeZeroBaselineStroke();
    org.jfree.chart.title.TextTitle var3 = new org.jfree.chart.title.TextTitle("hi!");
    org.jfree.ui.RectangleInsets var4 = var3.getMargin();
    var0.setAxisOffset(var4);
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var8 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var11 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var12 = var11.getItemLabelFont();
    double var13 = var11.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var16 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var17 = var16.getItemLabelFont();
    java.awt.Shape var18 = var16.getBaseLegendShape();
    var11.setShape(var18);
    var8.setLegendBar(var18);
    org.jfree.data.general.DefaultKeyedValues2DDataset var23 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var26 = new org.jfree.chart.entity.CategoryItemEntity(var18, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var23, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    org.jfree.chart.plot.CombinedRangeXYPlot var27 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var28 = var27.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CategoryMarker var30 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var31 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var33 = var31.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var36 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var37 = var36.getTickLabelPaint();
    var31.setFillPaint(var37, true);
    var30.setLabelPaint(var37);
    org.jfree.chart.annotations.XYShapeAnnotation var41 = new org.jfree.chart.annotations.XYShapeAnnotation(var18, var28, var37);
    var0.setRangeCrosshairPaint(var37);
    boolean var43 = var0.isDomainCrosshairLockedOnData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    org.jfree.chart.renderer.xy.XYAreaRenderer var0 = new org.jfree.chart.renderer.xy.XYAreaRenderer();

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    double var4 = var2.getItemLabelAnchorOffset();
    org.jfree.chart.labels.ItemLabelPosition var7 = var2.getNegativeItemLabelPosition(0, 0);
    java.awt.Paint var10 = var2.getItemFillPaint(2013, 1);
    org.jfree.chart.labels.CategoryItemLabelGenerator var12 = var2.getSeriesItemLabelGenerator((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    org.jfree.data.time.TimePeriodValue var5 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var2, (java.lang.Number)10);
    var0.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    boolean var7 = var0.getDrawSharedDomainAxis();
    boolean var8 = var0.isDomainPannable();
    float var9 = var0.getBackgroundAlpha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0f);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    org.jfree.chart.util.HexNumberFormat var1 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.axis.NumberTickUnit var3 = new org.jfree.chart.axis.NumberTickUnit(0.05d, (java.text.NumberFormat)var1, 1);
    java.lang.String var5 = var3.valueToString(1.0d);
    java.lang.String[] var8 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var9 = new org.jfree.chart.axis.SymbolAxis("hi!", var8);
    org.jfree.chart.renderer.category.BarRenderer3D var12 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var13 = var12.getItemLabelFont();
    double var14 = var12.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var17 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var18 = var17.getItemLabelFont();
    java.awt.Shape var19 = var17.getBaseLegendShape();
    var12.setShape(var19);
    var9.setDownArrow(var19);
    org.jfree.chart.entity.CategoryLabelEntity var24 = new org.jfree.chart.entity.CategoryLabelEntity((java.lang.Comparable)var5, var19, "hi!?hi!=100&amp;amp;hi!=1", "hi!?hi!=100&amp;hi!=1");
    org.jfree.data.xy.XYSeries var27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.Object var28 = var27.clone();
    int var29 = var27.getMaximumItemCount();
    javax.swing.JPanel var30 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var31 = var30.getPreferredSize();
    boolean var32 = var30.getIgnoreRepaint();
    org.jfree.chart.plot.ContourPlot var34 = new org.jfree.chart.plot.ContourPlot();
    var34.setOutlineVisible(false);
    var30.addPropertyChangeListener("Combined Range XYPlot", (java.beans.PropertyChangeListener)var34);
    org.jfree.chart.urls.XYURLGenerator var38 = var34.getURLGenerator();
    var27.removePropertyChangeListener((java.beans.PropertyChangeListener)var34);
    float var40 = var34.getForegroundAlpha();
    double var41 = var34.getRangeCrosshairValue();
    boolean var42 = var24.equals((java.lang.Object)var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0var50000001"+ "'", var5.equals("0var50000001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    org.jfree.data.time.TimeTableXYDataset var0 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    var0.remove((org.jfree.data.time.TimePeriod)var2, (java.lang.Comparable)100, false);
    org.jfree.data.xy.XYBarDataset var8 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var0, Double.NaN);
    boolean var9 = var0.getDomainIsPointsInTime();
    org.jfree.data.xy.CategoryTableXYDataset var10 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.general.DefaultKeyedValues2DDataset var11 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var11.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var16 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var11);
    java.util.List var17 = var11.getColumnKeys();
    org.jfree.data.Range var19 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)var10, var17, true);
    org.jfree.data.Range var21 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)var0, var17, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    org.jfree.chart.renderer.category.DefaultCategoryItemRenderer var0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
    var0.setBaseShapesFilled(true);
    boolean var3 = var0.getBaseShapesVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    org.jfree.chart.LegendItemCollection var0 = new org.jfree.chart.LegendItemCollection();
    java.lang.Object var1 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    org.jfree.chart.util.HexNumberFormat var1 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.labels.IntervalCategoryToolTipGenerator var2 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("Combined Range XYPlot", (java.text.NumberFormat)var1);
    boolean var4 = var2.equals((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var1 = var0.getBaseItemLabelsVisible();
    var0.setSeriesShapesFilled(1, (java.lang.Boolean)false);
    var0.setDrawOutlines(true);
    var0.setSeriesShapesVisible(1, (java.lang.Boolean)true);
    java.lang.Boolean var10 = var0.getShapesFilled();
    java.awt.Shape var12 = var0.lookupSeriesShape(52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


    org.jfree.chart.annotations.XYLineAnnotation var4 = new org.jfree.chart.annotations.XYLineAnnotation((-1.0d), (-1.0d), 100.0d, 100.0d);
    java.lang.Object var5 = var4.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    org.jfree.chart.util.LogFormat var4 = new org.jfree.chart.util.LogFormat(0.0d, "hi!", true);
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var6 = var5.getPreferredSize();
    javax.swing.JPanel var7 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var5.setNextFocusableComponent((java.awt.Component)var7);
    java.util.Locale var9 = var7.getLocale();
    org.jfree.chart.axis.TickUnitSource var10 = org.jfree.chart.axis.LogAxis.createLogTickUnits(var9);
    java.text.NumberFormat var11 = java.text.NumberFormat.getPercentInstance(var9);
    org.jfree.chart.labels.StandardXYItemLabelGenerator var12 = new org.jfree.chart.labels.StandardXYItemLabelGenerator("d", (java.text.NumberFormat)var4, var11);
    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var13 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    boolean var14 = var13.isOutline();
    var13.setUseFillPaint(true);
    org.jfree.chart.StandardChartTheme var19 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var20 = var19.getLegendItemPaint();
    var13.setShapePaint(var20);
    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var23 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    int var25 = var23.getItemCount((-13421773));
    boolean var26 = var13.equals((java.lang.Object)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var29 = var12.generateLabel((org.jfree.data.xy.XYDataset)var23, 52, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }


    org.jfree.data.time.TimeTableXYDataset var0 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    var0.remove((org.jfree.data.time.TimePeriod)var2, (java.lang.Comparable)100, false);
    int var7 = var0.getSeriesCount();
    int var9 = var0.getItemCount(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    java.lang.Number[][] var0 = new java.lang.Number[][] { };
    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var1);
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var5 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var4);
    int var6 = var2.getColumnIndex((java.lang.Comparable)var4);
    java.lang.String[] var9 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var10 = new org.jfree.chart.axis.SymbolAxis("hi!", var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setSeriesKeys((java.lang.Comparable[])var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var5 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var0);
    int var6 = var0.getColumnCount();
    java.lang.Number var7 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.category.CategoryDataset)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.0d+ "'", var7.equals(1.0d));

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var3 = var2.isAxisLineVisible();
    var2.setAxisLineVisible(true);
    org.jfree.data.general.DefaultKeyedValues2DDataset var6 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var6.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var11 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var6);
    var2.setDefaultAutoRange(var11);
    var2.setAutoTickUnitSelection(true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    org.jfree.chart.plot.GreyPalette var0 = new org.jfree.chart.plot.GreyPalette();
    var0.setPaletteName("Compass Plot");
    org.jfree.data.xy.XYIntervalSeriesCollection var3 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.xy.XYBarDataset var5 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var3, 10.0d);
    var5.setBarWidth(2.0d);
    org.jfree.chart.axis.AxisCollection var8 = new org.jfree.chart.axis.AxisCollection();
    java.util.List var9 = var8.getAxesAtLeft();
    org.jfree.data.general.DefaultKeyedValues2DDataset var10 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var10.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var15 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var10);
    org.jfree.data.Range var17 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds((org.jfree.data.category.CategoryDataset)var10, true);
    org.jfree.data.Range var19 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds((org.jfree.data.xy.XYDataset)var5, var9, var17, true);
    var0.setTickValues(var9);
    var0.initialize();
    var0.setPaletteName("jfreechart-");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    org.jfree.data.xy.XYSeries var5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.Object var6 = var5.clone();
    int var7 = var5.getMaximumItemCount();
    javax.swing.JPanel var8 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var9 = var8.getPreferredSize();
    boolean var10 = var8.getIgnoreRepaint();
    org.jfree.chart.plot.ContourPlot var12 = new org.jfree.chart.plot.ContourPlot();
    var12.setOutlineVisible(false);
    var8.addPropertyChangeListener("Combined Range XYPlot", (java.beans.PropertyChangeListener)var12);
    org.jfree.chart.urls.XYURLGenerator var16 = var12.getURLGenerator();
    var5.removePropertyChangeListener((java.beans.PropertyChangeListener)var12);
    float var18 = var12.getForegroundAlpha();
    var2.addPropertyChangeListener((java.beans.PropertyChangeListener)var12);
    org.jfree.chart.block.CenterArrangement var20 = new org.jfree.chart.block.CenterArrangement();
    org.jfree.chart.renderer.xy.XYBlockRenderer var21 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var22 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var23 = var21.findDomainBounds((org.jfree.data.xy.XYDataset)var22);
    org.jfree.chart.renderer.category.BarRenderer3D var26 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var27 = var26.getItemLabelFont();
    double var28 = var26.getItemLabelAnchorOffset();
    org.jfree.chart.labels.ItemLabelPosition var31 = var26.getNegativeItemLabelPosition(0, 0);
    double var32 = var31.getAngle();
    var21.setNegativeItemLabelPosition(var31);
    org.jfree.chart.labels.XYSeriesLabelGenerator var34 = var21.getLegendItemToolTipGenerator();
    org.jfree.chart.title.LegendTitle var35 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var21);
    org.jfree.chart.block.BlockContainer var36 = var35.getItemContainer();
    org.jfree.chart.block.CenterArrangement var37 = new org.jfree.chart.block.CenterArrangement();
    var36.setArrangement((org.jfree.chart.block.Arrangement)var37);
    org.jfree.chart.title.LegendTitle var39 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var12, (org.jfree.chart.block.Arrangement)var20, (org.jfree.chart.block.Arrangement)var37);
    
    // Checks the contract:  equals-hashcode on var20 and var37
    assertTrue("Contract failed: equals-hashcode on var20 and var37", var20.equals(var37) ? var20.hashCode() == var37.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var37 and var20
    assertTrue("Contract failed: equals-hashcode on var37 and var20", var37.equals(var20) ? var37.hashCode() == var20.hashCode() : true);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    org.jfree.chart.axis.CategoryLabelPositions var1 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(100.0d);
    org.jfree.chart.title.TextTitle var3 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var4 = var3.isVisible();
    java.lang.Object var5 = var3.clone();
    org.jfree.ui.RectangleEdge var6 = var3.getPosition();
    org.jfree.chart.axis.CategoryLabelPosition var7 = var1.getLabelPosition(var6);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var8 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    boolean var9 = var7.equals((java.lang.Object)var8);
    java.lang.Boolean var10 = var8.getShapesFilled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var2 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var1);
    org.jfree.data.time.TimePeriodValue var4 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var1, (java.lang.Number)10);
    java.lang.Object var5 = var4.clone();
    org.jfree.data.time.TimePeriod var6 = var4.getPeriod();
    java.lang.String var7 = var4.toString();
    org.jfree.data.xy.XYSeries var10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    var10.add((-1.0d), (-1.0d), false);
    boolean var15 = var4.equals((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "TimePeriodValue[Week 37, 2013,10]"+ "'", var7.equals("TimePeriodValue[Week 37, 2013,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    var5.setShape(var12);
    var2.setLegendBar(var12);
    var2.setDrawBarOutline(true);
    java.lang.Object var17 = var2.clone();
    org.jfree.data.io.CSV var18 = new org.jfree.data.io.CSV();
    boolean var19 = var2.equals((java.lang.Object)var18);
    boolean var20 = var2.getAutoPopulateSeriesOutlineStroke();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.DateTickUnit var2 = new org.jfree.chart.axis.DateTickUnit(15, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.Object var3 = var2.clone();
    int var4 = var2.getMaximumItemCount();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var6 = var5.getPreferredSize();
    boolean var7 = var5.getIgnoreRepaint();
    org.jfree.chart.plot.ContourPlot var9 = new org.jfree.chart.plot.ContourPlot();
    var9.setOutlineVisible(false);
    var5.addPropertyChangeListener("Combined Range XYPlot", (java.beans.PropertyChangeListener)var9);
    org.jfree.chart.urls.XYURLGenerator var13 = var9.getURLGenerator();
    var2.removePropertyChangeListener((java.beans.PropertyChangeListener)var9);
    float var15 = var9.getForegroundAlpha();
    org.jfree.chart.plot.ValueMarker var17 = new org.jfree.chart.plot.ValueMarker((-1.0d));
    var9.addDomainMarker((org.jfree.chart.plot.Marker)var17);
    var9.setDataAreaRatio(3.0d);
    org.jfree.data.Range var21 = var9.getContourDataRange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }


    org.jfree.chart.annotations.XYBoxAnnotation var4 = new org.jfree.chart.annotations.XYBoxAnnotation(1.0d, 0.2d, 1.05d, 0.2d);

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var5 = var4.getLocation();
    java.awt.Dimension var6 = var4.preferredSize();
    var0.setSize(var6);
    javax.swing.JPanel var8 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var9 = var8.getPreferredSize();
    java.awt.image.ColorModel var10 = var8.getColorModel();
    var8.firePropertyChange("", 0.0f, 0.0f);
    javax.swing.JPanel var15 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var16 = var15.getLocation();
    java.awt.Point var17 = var8.getLocation(var16);
    var0.add((java.awt.Component)var8, (java.lang.Object)(-1.0d), 0);
    javax.swing.JPanel var21 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var22 = var21.getPreferredSize();
    boolean var23 = var21.getIgnoreRepaint();
    org.jfree.chart.plot.ContourPlot var25 = new org.jfree.chart.plot.ContourPlot();
    var25.setOutlineVisible(false);
    var21.addPropertyChangeListener("Combined Range XYPlot", (java.beans.PropertyChangeListener)var25);
    org.jfree.chart.plot.CombinedRangeXYPlot var29 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var30 = var29.getRangeZeroBaselineStroke();
    java.lang.String var31 = var29.getPlotType();
    org.jfree.chart.plot.CategoryMarker var33 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var34 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var36 = var34.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var39 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var40 = var39.getTickLabelPaint();
    var34.setFillPaint(var40, true);
    var33.setLabelPaint(var40);
    boolean var44 = var29.removeRangeMarker((org.jfree.chart.plot.Marker)var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.add((java.awt.Component)var21, (java.lang.Object)var29, 10);
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Combined Range XYPlot"+ "'", var31.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.updateUI();
    java.lang.String var4 = var0.toString();
    java.awt.Color var5 = var0.getForeground();
    var0.enableInputMethods(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var4,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var4.equals("org.jfree.chart.ChartPanel[,0,0,0var4,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    org.jfree.data.xy.YIntervalSeriesCollection var0 = new org.jfree.data.xy.YIntervalSeriesCollection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var3 = var0.getStartY(1043495433, 8);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    org.jfree.chart.renderer.xy.WindItemRenderer var0 = new org.jfree.chart.renderer.xy.WindItemRenderer();
    java.lang.Object var1 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    org.jfree.chart.plot.ThermometerPlot var0 = new org.jfree.chart.plot.ThermometerPlot();
    org.jfree.chart.axis.ValueAxis var1 = var0.getRangeAxis();
    java.awt.Paint var3 = var0.getSubrangePaint(52);
    org.jfree.chart.renderer.xy.XYShapeRenderer var4 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CyclicNumberAxis var7 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var8 = var7.isAxisLineVisible();
    var7.setAxisLineVisible(true);
    var7.setMinorTickMarksVisible(true);
    org.jfree.ui.RectangleInsets var13 = var7.getTickLabelInsets();
    boolean var14 = var4.equals((java.lang.Object)var7);
    org.jfree.chart.axis.TickUnits var15 = new org.jfree.chart.axis.TickUnits();
    java.lang.Object var16 = var15.clone();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var19 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var22 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var23 = var22.getItemLabelFont();
    double var24 = var22.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var27 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var28 = var27.getItemLabelFont();
    java.awt.Shape var29 = var27.getBaseLegendShape();
    var22.setShape(var29);
    var19.setLegendBar(var29);
    org.jfree.data.general.DefaultKeyedValues2DDataset var34 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var37 = new org.jfree.chart.entity.CategoryItemEntity(var29, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var34, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    var37.setToolTipText("Combined Range XYPlot");
    boolean var40 = var15.equals((java.lang.Object)"Combined Range XYPlot");
    var7.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var15);
    var0.setRangeAxis((org.jfree.chart.axis.ValueAxis)var7);
    java.awt.Paint var43 = var7.getTickLabelPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    org.jfree.chart.plot.dial.StandardDialScale var0 = new org.jfree.chart.plot.dial.StandardDialScale();
    var0.setMajorTickIncrement(10.0d);
    var0.setMinorTickLength(1.5d);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    boolean var2 = var0.getIgnoreRepaint();
    org.jfree.chart.plot.ContourPlot var4 = new org.jfree.chart.plot.ContourPlot();
    var4.setOutlineVisible(false);
    var0.addPropertyChangeListener("Combined Range XYPlot", (java.beans.PropertyChangeListener)var4);
    org.jfree.chart.urls.XYURLGenerator var8 = var4.getURLGenerator();
    org.jfree.chart.ClipPath var9 = var4.getClipPath();
    var4.clearRangeMarkers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.Object var3 = var2.clone();
    int var4 = var2.getMaximumItemCount();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var6 = var5.getPreferredSize();
    boolean var7 = var5.getIgnoreRepaint();
    org.jfree.chart.plot.ContourPlot var9 = new org.jfree.chart.plot.ContourPlot();
    var9.setOutlineVisible(false);
    var5.addPropertyChangeListener("Combined Range XYPlot", (java.beans.PropertyChangeListener)var9);
    org.jfree.chart.urls.XYURLGenerator var13 = var9.getURLGenerator();
    var2.removePropertyChangeListener((java.beans.PropertyChangeListener)var9);
    float var15 = var9.getForegroundAlpha();
    var9.clearRangeMarkers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.0f);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var1 = var0.getLocation();
    java.awt.Dimension var2 = var0.preferredSize();
    org.jfree.chart.plot.ContourPlot var3 = new org.jfree.chart.plot.ContourPlot();
    var0.addPropertyChangeListener((java.beans.PropertyChangeListener)var3);
    org.jfree.data.general.DatasetGroup var5 = var3.getDatasetGroup();
    java.awt.Paint var6 = var3.getRangeCrosshairPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    org.jfree.data.xy.CategoryTableXYDataset var0 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.general.DefaultKeyedValues2DDataset var1 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var1.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var6 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var1);
    java.util.List var7 = var1.getColumnKeys();
    org.jfree.data.Range var9 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)var0, var7, true);
    double var11 = var0.getDomainLowerBound(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var14 = var0.getStartX((-1), 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == Double.NaN);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    org.jfree.chart.renderer.xy.XYSplineRenderer var1 = new org.jfree.chart.renderer.xy.XYSplineRenderer(2147483647);
    var1.setLinesVisible(true);
    java.lang.Boolean var5 = var1.getSeriesLinesVisible(10);
    org.jfree.chart.labels.XYToolTipGenerator var8 = var1.getToolTipGenerator(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    double var2 = var1.getOutlierCoefficient();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var5 = var1.getMaxOutlier((-1), 2013);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5d);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    org.jfree.data.contour.NonGridContourDataset var0 = new org.jfree.data.contour.NonGridContourDataset();
    org.jfree.chart.axis.CyclicNumberAxis var3 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var4 = var3.isAxisLineVisible();
    var3.setAxisLineVisible(true);
    org.jfree.data.general.DefaultKeyedValues2DDataset var7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var7.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var12 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var7);
    var3.setDefaultAutoRange(var12);
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var16 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var19 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var20 = var19.getItemLabelFont();
    double var21 = var19.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var24 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var25 = var24.getItemLabelFont();
    java.awt.Shape var26 = var24.getBaseLegendShape();
    var19.setShape(var26);
    var16.setLegendBar(var26);
    var16.setDrawBarOutline(true);
    org.jfree.data.xy.CategoryTableXYDataset var31 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var32 = var16.findDomainBounds((org.jfree.data.xy.XYDataset)var31);
    org.jfree.data.Range var34 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds((org.jfree.data.xy.TableXYDataset)var31, (-1.0d));
    org.jfree.data.Range var35 = var0.getZValueRange(var12, var34);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    org.jfree.chart.renderer.xy.XYBarRenderer var1 = new org.jfree.chart.renderer.xy.XYBarRenderer(100.0d);
    boolean var2 = var1.getUseYInterval();
    boolean var3 = var1.getAutoPopulateSeriesOutlineStroke();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    org.jfree.data.time.TimeTableXYDataset var0 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    var0.remove((org.jfree.data.time.TimePeriod)var2, (java.lang.Comparable)100, false);
    double var8 = var0.getDomainLowerBound(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var11 = var0.getEndX(20, 8);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.NaN);

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }


    org.jfree.chart.plot.CategoryMarker var1 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var2 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var4 = var2.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var7 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var8 = var7.getTickLabelPaint();
    var2.setFillPaint(var8, true);
    var1.setLabelPaint(var8);
    org.jfree.chart.plot.CompassPlot var12 = new org.jfree.chart.plot.CompassPlot();
    var1.addChangeListener((org.jfree.chart.event.MarkerChangeListener)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.setLabelType((-2));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var2 = var0.getSeriesLinesVisible(10);
    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var5 = var4.getPreferredSize();
    boolean var6 = var4.getIgnoreRepaint();
    boolean var7 = var4.isLightweight();
    javax.swing.JPanel var8 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var9 = var8.getPreferredSize();
    javax.swing.JPanel var10 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var8.setNextFocusableComponent((java.awt.Component)var10);
    var8.show();
    javax.swing.JPanel var13 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var14 = var13.getLocation();
    java.awt.Dimension var15 = var13.preferredSize();
    java.awt.Rectangle var16 = var13.bounds();
    var8.scrollRectToVisible(var16);
    var4.setBounds(var16);
    var0.setSeriesShape(15, (java.awt.Shape)var16);
    javax.swing.JPanel var21 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var22 = var21.getLocation();
    java.awt.Dimension var23 = var21.preferredSize();
    java.awt.Rectangle var24 = var21.bounds();
    var21.setDoubleBuffered(true);
    org.jfree.chart.axis.CyclicNumberAxis var29 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var30 = var29.getTickLabelPaint();
    var29.setVisible(false);
    java.lang.Object var33 = var29.clone();
    org.jfree.chart.plot.CombinedRangeXYPlot var34 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    org.jfree.chart.annotations.XYPointerAnnotation var39 = new org.jfree.chart.annotations.XYPointerAnnotation("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (-1.0d), 0.2d, 4.0d);
    double var40 = var39.getLabelOffset();
    org.jfree.ui.TextAnchor var41 = var39.getRotationAnchor();
    boolean var42 = var34.removeAnnotation((org.jfree.chart.annotations.XYAnnotation)var39);
    org.jfree.chart.StandardChartTheme var45 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var46 = var45.getLegendItemPaint();
    java.awt.Paint var47 = var45.getSubtitlePaint();
    java.awt.Font var48 = var45.getLargeFont();
    var39.setFont(var48);
    var29.setLabelFont(var48);
    var21.setFont(var48);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesItemLabelFont((-13421773), var48, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var1 = var0.getRangeZeroBaselineStroke();
    java.lang.String var2 = var0.getPlotType();
    org.jfree.chart.plot.CategoryMarker var4 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var5 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var7 = var5.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var10 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var11 = var10.getTickLabelPaint();
    var5.setFillPaint(var11, true);
    var4.setLabelPaint(var11);
    boolean var15 = var0.removeRangeMarker((org.jfree.chart.plot.Marker)var4);
    java.awt.Paint var17 = var0.getQuadrantPaint(1);
    var0.clearDomainMarkers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Combined Range XYPlot"+ "'", var2.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var5 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var0);
    org.jfree.data.Range var7 = org.jfree.data.Range.shift(var5, (-1.0d));
    org.jfree.data.Range var9 = org.jfree.data.Range.scale(var5, 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer var0 = new org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer();
    org.jfree.chart.StandardChartTheme var3 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var4 = var3.getLegendItemPaint();
    var0.setBoxPaint(var4);
    java.lang.Number[][] var6 = new java.lang.Number[][] { };
    java.lang.Number[][] var7 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var6, var7);
    int var10 = var8.getRowIndex((java.lang.Comparable)'a');
    boolean var11 = var0.equals((java.lang.Object)var8);
    var0.setBoxWidth(0.3d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    org.jfree.data.xy.XIntervalSeries var1 = new org.jfree.data.xy.XIntervalSeries((java.lang.Comparable)4.0d);
    java.lang.String var2 = var1.getDescription();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var1.getYValue(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isCounterClockwise();
    var0.setRadiusGridlinesVisible(false);
    int var4 = var0.getDatasetCount();
    int var5 = var0.getAxisCount();
    double var6 = var0.getAngleOffset();
    int var7 = var0.getDatasetCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-90.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    org.jfree.data.xy.YIntervalSeriesCollection var0 = new org.jfree.data.xy.YIntervalSeriesCollection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeSeries(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    org.jfree.data.gantt.TaskSeries var1 = new org.jfree.data.gantt.TaskSeries("hi!");
    int var2 = var1.getItemCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    java.lang.String var2 = org.jfree.chart.urls.URLUtilities.encode("jfreechart-onetime-", "Range[0.0,0.0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    org.jfree.data.statistics.MeanAndStandardDeviation var2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number)0.75d, (java.lang.Number)(-2));

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var1 = var0.getBaseItemLabelsVisible();
    var0.setSeriesShapesFilled(1, (java.lang.Boolean)false);
    var0.setDrawOutlines(true);
    var0.setSeriesShapesVisible(1, (java.lang.Boolean)true);
    java.lang.Boolean var10 = var0.getShapesFilled();
    boolean var13 = var0.getItemShapeVisible(51, 20);
    boolean var16 = var0.getItemLineVisible(1043495433, (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    org.jfree.data.xy.VectorDataItem var4 = new org.jfree.data.xy.VectorDataItem((-1.0d), 10.0d, 2.0d, (-1.0d));
    double var5 = var4.getXValue();
    double var6 = var4.getVectorY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1.0d));

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    org.jfree.chart.editor.DefaultChartEditorFactory var0 = new org.jfree.chart.editor.DefaultChartEditorFactory();
    org.jfree.chart.editor.ChartEditorManager.setChartEditorFactory((org.jfree.chart.editor.ChartEditorFactory)var0);
    org.jfree.chart.editor.ChartEditorManager.setChartEditorFactory((org.jfree.chart.editor.ChartEditorFactory)var0);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    org.jfree.data.time.Year var4 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var5 = new org.jfree.data.time.Month(1, var4);
    org.jfree.data.time.RegularTimePeriod var6 = var5.previous();
    long var7 = var5.getSerialIndex();
    org.jfree.data.time.TimeTableXYDataset var8 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var10 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var11 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var10);
    var8.remove((org.jfree.data.time.TimePeriod)var10, (java.lang.Comparable)100, false);
    org.jfree.chart.axis.PeriodAxis var15 = new org.jfree.chart.axis.PeriodAxis("Compass Plot", (org.jfree.data.time.RegularTimePeriod)var5, (org.jfree.data.time.RegularTimePeriod)var10);
    java.lang.Number[][] var16 = new java.lang.Number[][] { };
    java.lang.Number[][] var17 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var18 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var16, var17);
    org.jfree.data.time.Week var20 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var21 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var20);
    int var22 = var18.getColumnIndex((java.lang.Comparable)var20);
    org.jfree.chart.axis.PeriodAxis var23 = new org.jfree.chart.axis.PeriodAxis("DomainOrder.NONE", (org.jfree.data.time.RegularTimePeriod)var5, (org.jfree.data.time.RegularTimePeriod)var20);
    
    // Checks the contract:  equals-hashcode on var11 and var21
    assertTrue("Contract failed: equals-hashcode on var11 and var21", var11.equals(var21) ? var11.hashCode() == var21.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var21 and var11
    assertTrue("Contract failed: equals-hashcode on var21 and var11", var21.equals(var11) ? var21.hashCode() == var11.hashCode() : true);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    org.jfree.chart.plot.Crosshair var0 = new org.jfree.chart.plot.Crosshair();
    double var1 = var0.getValue();
    org.jfree.chart.needle.PinNeedle var2 = new org.jfree.chart.needle.PinNeedle();
    org.jfree.chart.plot.CategoryPlot var3 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.plot.CategoryMarker var5 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var6 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var8 = var6.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var11 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var12 = var11.getTickLabelPaint();
    var6.setFillPaint(var12, true);
    var5.setLabelPaint(var12);
    var3.setDomainGridlinePaint(var12);
    var2.setHighlightPaint(var12);
    java.awt.Paint var18 = var2.getHighlightPaint();
    var0.setLabelOutlinePaint(var18);
    org.jfree.data.statistics.SimpleHistogramBin var22 = new org.jfree.data.statistics.SimpleHistogramBin(0.05d, 2.0d);
    var22.setItemCount(2);
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var27 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var30 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var31 = var30.getItemLabelFont();
    double var32 = var30.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var35 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var36 = var35.getItemLabelFont();
    java.awt.Shape var37 = var35.getBaseLegendShape();
    var30.setShape(var37);
    var27.setLegendBar(var37);
    var27.setDrawBarOutline(true);
    java.awt.Paint var43 = var27.getLegendTextPaint(0);
    var27.setSeriesItemLabelsVisible(0, true);
    boolean var47 = var22.equals((java.lang.Object)var27);
    boolean var48 = var0.equals((java.lang.Object)var47);
    var0.setVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    org.jfree.data.general.DatasetGroup var1 = new org.jfree.data.general.DatasetGroup("d");
    java.lang.Object var2 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    var5.setShape(var12);
    var2.setLegendBar(var12);
    org.jfree.data.general.DefaultKeyedValues2DDataset var17 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var20 = new org.jfree.chart.entity.CategoryItemEntity(var12, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var17, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    int var21 = var20.getCategoryIndex();
    var20.setSeries(2013);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    var5.setShape(var12);
    var2.setLegendBar(var12);
    org.jfree.data.general.DefaultKeyedValues2DDataset var17 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var20 = new org.jfree.chart.entity.CategoryItemEntity(var12, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var17, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    var20.setCategoryIndex(0);
    var20.setCategoryIndex(15);
    int var25 = var20.getSeries();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    org.jfree.data.function.LineFunction2D var2 = new org.jfree.data.function.LineFunction2D(0.05d, 10.0d);
    double var4 = var2.getValue(0.0d);
    double var5 = var2.getIntercept();
    double var6 = var2.getIntercept();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.05d);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var1 = var0.getBaseItemLabelsVisible();
    var0.setSeriesShapesFilled(1, (java.lang.Boolean)false);
    var0.setDrawOutlines(true);
    var0.setSeriesShapesVisible(1, (java.lang.Boolean)true);
    java.lang.Boolean var10 = var0.getShapesFilled();
    java.lang.Boolean var11 = var0.getBaseItemLabelsVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    org.jfree.chart.labels.StandardXYSeriesLabelGenerator var1 = new org.jfree.chart.labels.StandardXYSeriesLabelGenerator("Range[0.0,0.0]");

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    org.jfree.data.xy.VectorSeriesCollection var0 = new org.jfree.data.xy.VectorSeriesCollection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var0.getXValue(1043495433, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    org.jfree.chart.annotations.XYPointerAnnotation var4 = new org.jfree.chart.annotations.XYPointerAnnotation("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (-1.0d), 0.2d, 4.0d);
    java.lang.Object var5 = var4.clone();
    java.awt.Stroke var6 = var4.getArrowStroke();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var5 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var0);
    org.jfree.data.Range var7 = org.jfree.data.Range.shift(var5, (-1.0d));
    org.jfree.data.Range var9 = org.jfree.data.Range.scale(var7, 100.0d);
    org.jfree.data.general.DefaultKeyedValues2DDataset var10 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var10.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var10);
    org.jfree.data.Range var17 = org.jfree.data.Range.shift(var15, (-1.0d));
    org.jfree.data.Range var19 = org.jfree.data.Range.scale(var17, 100.0d);
    boolean var20 = var9.intersects(var19);
    org.jfree.data.Range var22 = org.jfree.data.Range.shift(var19, (-1.0d));
    boolean var25 = var19.intersects(Double.NaN, 3.0d);
    org.jfree.data.Range var27 = org.jfree.data.Range.scale(var19, 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    org.jfree.chart.renderer.category.CategoryStepRenderer var0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
    boolean var2 = var0.equals((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    double var4 = var2.getItemLabelAnchorOffset();
    java.awt.Shape var6 = var2.getSeriesShape(1);
    org.jfree.chart.StandardChartTheme var10 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var11 = var10.getLegendItemPaint();
    java.awt.Paint var12 = var10.getSubtitlePaint();
    java.awt.Font var13 = var10.getLargeFont();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setSeriesItemLabelFont(2147483647, var13);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    java.lang.Object var1 = var0.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var3 = var0.getCeilingTickUnit(10.0d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


    org.jfree.data.xy.XYIntervalSeriesCollection var0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.xy.XYBarDataset var2 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var0, 10.0d);
    org.jfree.chart.plot.CombinedRangeXYPlot var3 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var4 = var3.getRangeZeroBaselineStroke();
    java.lang.String var5 = var3.getPlotType();
    boolean var6 = var0.hasListener((java.util.EventListener)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var9 = var0.getEndX(2013, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Combined Range XYPlot"+ "'", var5.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var6 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var6.setUpperMargin(10.0d);
    var6.setAxisLineVisible(true);
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var12 = var11.getLocation();
    java.awt.Dimension var13 = var11.preferredSize();
    java.awt.Rectangle var14 = var11.bounds();
    java.awt.Point var15 = var0.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var6, (java.awt.geom.Rectangle2D)var14);
    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var18 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    double var19 = var18.getOutlierCoefficient();
    var0.setDataset(100, (org.jfree.data.xy.XYDataset)var18);
    java.lang.String[] var25 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var26 = new org.jfree.chart.axis.SymbolAxis("hi!", var25);
    org.jfree.chart.plot.CompassPlot var27 = new org.jfree.chart.plot.CompassPlot();
    boolean var28 = var26.equals((java.lang.Object)var27);
    var26.setAxisLineVisible(true);
    var26.setGridBandsVisible(false);
    javax.swing.JPanel var33 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var34 = var33.getLocation();
    org.jfree.chart.plot.PolarPlot var35 = new org.jfree.chart.plot.PolarPlot();
    boolean var36 = var35.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var41 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var41.setUpperMargin(10.0d);
    var41.setAxisLineVisible(true);
    javax.swing.JPanel var46 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var47 = var46.getLocation();
    java.awt.Dimension var48 = var46.preferredSize();
    java.awt.Rectangle var49 = var46.bounds();
    java.awt.Point var50 = var35.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var41, (java.awt.geom.Rectangle2D)var49);
    java.awt.Rectangle var51 = var33.getBounds(var49);
    java.awt.Point var52 = var0.translateToJava2D(175.0d, 0.3d, (org.jfree.chart.axis.ValueAxis)var26, (java.awt.geom.Rectangle2D)var51);
    
    // Checks the contract:  equals-hashcode on var0 and var35
    assertTrue("Contract failed: equals-hashcode on var0 and var35", var0.equals(var35) ? var0.hashCode() == var35.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var35 and var0
    assertTrue("Contract failed: equals-hashcode on var35 and var0", var35.equals(var0) ? var35.hashCode() == var0.hashCode() : true);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    var2.add((-1.0d), (-1.0d), false);
    double[][] var7 = var2.toArray();
    double[] var10 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var11 = new org.jfree.chart.annotations.XYPolygonAnnotation(var10);
    double[] var14 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var15 = new org.jfree.chart.annotations.XYPolygonAnnotation(var14);
    org.jfree.chart.ClipPath var16 = new org.jfree.chart.ClipPath(var10, var14);
    double[][] var17 = new double[][] { var10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.category.DefaultIntervalCategoryDataset var18 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var7, var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var6 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var6.setUpperMargin(10.0d);
    var6.setAxisLineVisible(true);
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var12 = var11.getLocation();
    java.awt.Dimension var13 = var11.preferredSize();
    java.awt.Rectangle var14 = var11.bounds();
    java.awt.Point var15 = var0.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var6, (java.awt.geom.Rectangle2D)var14);
    org.jfree.data.xy.DefaultXYZDataset var17 = new org.jfree.data.xy.DefaultXYZDataset();
    org.jfree.data.DomainOrder var18 = var17.getDomainOrder();
    var0.setDataset(1, (org.jfree.data.xy.XYDataset)var17);
    org.jfree.chart.labels.StandardCategoryItemLabelGenerator var20 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator();
    boolean var21 = var17.equals((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var5 = var4.getPreferredSize();
    java.awt.image.ColorModel var6 = var4.getColorModel();
    var4.firePropertyChange("", 0.0f, 0.0f);
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var12 = var11.getLocation();
    java.awt.Point var13 = var4.getLocation(var12);
    java.awt.Component var14 = var0.findComponentAt(var12);
    java.beans.VetoableChangeListener[] var15 = var0.getVetoableChangeListeners();
    java.beans.PropertyChangeListener[] var17 = var0.getPropertyChangeListeners("DomainOrder.NONE");
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    java.lang.Number[][] var0 = new java.lang.Number[][] { };
    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var1);
    java.lang.Object[][][] var3 = new java.lang.Object[][][] { var0};
    org.jfree.data.xy.DefaultWindDataset var4 = new org.jfree.data.xy.DefaultWindDataset(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var7 = var4.getWindDirection(15, (-2));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    org.jfree.chart.renderer.xy.StackedXYBarRenderer var0 = new org.jfree.chart.renderer.xy.StackedXYBarRenderer();
    javax.swing.JPanel var1 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var2 = var1.getPreferredSize();
    java.awt.image.ColorModel var3 = var1.getColorModel();
    var1.updateUI();
    java.lang.String var5 = var1.toString();
    var1.setFocusable(true);
    boolean var8 = var0.equals((java.lang.Object)var1);
    java.awt.Point var9 = var1.getMousePosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var5,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var5.equals("org.jfree.chart.ChartPanel[,0,0,0var5,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    org.jfree.chart.renderer.OutlierListCollection var0 = new org.jfree.chart.renderer.OutlierListCollection();
    var0.setHighFarOut(false);
    var0.setLowFarOut(false);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var2 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var3 = var2.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator var4 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.XYStepAreaRenderer var5 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(0, (org.jfree.chart.labels.XYToolTipGenerator)var2, (org.jfree.chart.urls.XYURLGenerator)var4);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var6 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer(0, (org.jfree.chart.labels.XYToolTipGenerator)var2);
    java.awt.Shape var8 = var6.getLegendShape(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    var0.setView(0.2d, 4.0d, 10.0d, 10.0d);
    var0.mapDatasetToScale(2013, 100);
    org.jfree.chart.plot.dial.DialPlot var9 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var10 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var11 = var9.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var10);
    var10.setTickLabelsVisible(false);
    int var14 = var0.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var10);
    double var15 = var10.getExtent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-170.0d));

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    java.util.Locale var4 = var2.getLocale();
    org.jfree.chart.axis.TickUnitSource var5 = org.jfree.chart.axis.LogAxis.createLogTickUnits(var4);
    java.text.NumberFormat var6 = java.text.NumberFormat.getCurrencyInstance(var4);
    var6.setGroupingUsed(true);
    
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

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    float var1 = var0.getForegroundAlpha();
    double var2 = var0.getViewX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    var0.show();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var6 = var5.getLocation();
    java.awt.Dimension var7 = var5.preferredSize();
    java.awt.Rectangle var8 = var5.bounds();
    var0.scrollRectToVisible(var8);
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var12 = var11.getPreferredSize();
    boolean var13 = var11.getIgnoreRepaint();
    org.jfree.chart.plot.ContourPlot var15 = new org.jfree.chart.plot.ContourPlot();
    var15.setOutlineVisible(false);
    var11.addPropertyChangeListener("Combined Range XYPlot", (java.beans.PropertyChangeListener)var15);
    org.jfree.chart.urls.XYURLGenerator var19 = var15.getURLGenerator();
    var0.addPropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var15);
    var0.enable();
    int var22 = var0.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var0 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var2 = var0.getSeriesItemLabelGenerator(0);
    org.jfree.chart.labels.XYItemLabelGenerator var5 = var0.getItemLabelGenerator((-1), 0);
    boolean var6 = var0.getBaseShapesVisible();
    org.jfree.chart.plot.CombinedRangeXYPlot var7 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var8 = var7.getRangeZeroBaselineStroke();
    java.lang.String var9 = var7.getPlotType();
    org.jfree.chart.plot.CategoryMarker var11 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var12 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var14 = var12.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var17 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var18 = var17.getTickLabelPaint();
    var12.setFillPaint(var18, true);
    var11.setLabelPaint(var18);
    boolean var22 = var7.removeRangeMarker((org.jfree.chart.plot.Marker)var11);
    org.jfree.chart.axis.AxisLocation var23 = var7.getDomainAxisLocation();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var26 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var29 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var30 = var29.getItemLabelFont();
    double var31 = var29.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var34 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var35 = var34.getItemLabelFont();
    java.awt.Shape var36 = var34.getBaseLegendShape();
    var29.setShape(var36);
    var26.setLegendBar(var36);
    var26.setDrawBarOutline(true);
    org.jfree.data.xy.CategoryTableXYDataset var41 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var42 = var26.findDomainBounds((org.jfree.data.xy.XYDataset)var41);
    int var43 = var7.getIndexOf((org.jfree.chart.renderer.xy.XYItemRenderer)var26);
    var0.setPlot((org.jfree.chart.plot.XYPlot)var7);
    var0.setPlotDiscontinuous(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Combined Range XYPlot"+ "'", var9.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var2 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var1);
    var2.setPercentComplete((java.lang.Double)10.0d);
    org.jfree.data.time.Week var6 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var7 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var6);
    var7.setPercentComplete((java.lang.Double)10.0d);
    var2.addSubtask(var7);
    var2.setPercentComplete((java.lang.Double)5.0d);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Millisecond var7 = new org.jfree.data.time.Millisecond(2013, 1043495433, 10, 0, 2013, 1, 2147483647);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    org.jfree.chart.plot.ThermometerPlot var0 = new org.jfree.chart.plot.ThermometerPlot();
    boolean var1 = var0.isDomainZoomable();
    org.jfree.chart.plot.ThermometerPlot var2 = new org.jfree.chart.plot.ThermometerPlot();
    boolean var3 = var2.isDomainZoomable();
    int var4 = var2.getAxisLocation();
    org.jfree.data.general.ValueDataset var5 = var2.getDataset();
    var0.setDataset(var5);
    
    // Checks the contract:  equals-hashcode on var0 and var2
    assertTrue("Contract failed: equals-hashcode on var0 and var2", var0.equals(var2) ? var0.hashCode() == var2.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var2 and var0
    assertTrue("Contract failed: equals-hashcode on var2 and var0", var2.equals(var0) ? var2.hashCode() == var0.hashCode() : true);

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


    org.jfree.chart.axis.SubCategoryAxis var1 = new org.jfree.chart.axis.SubCategoryAxis("Combined Range XYPlot");
    double var2 = var1.getUpperMargin();
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week();
    org.jfree.chart.axis.CyclicNumberAxis var6 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var7 = var6.getTickLabelPaint();
    var6.setVisible(false);
    java.lang.Object var10 = var6.clone();
    org.jfree.chart.plot.CombinedRangeXYPlot var11 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    org.jfree.chart.annotations.XYPointerAnnotation var16 = new org.jfree.chart.annotations.XYPointerAnnotation("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (-1.0d), 0.2d, 4.0d);
    double var17 = var16.getLabelOffset();
    org.jfree.ui.TextAnchor var18 = var16.getRotationAnchor();
    boolean var19 = var11.removeAnnotation((org.jfree.chart.annotations.XYAnnotation)var16);
    org.jfree.chart.StandardChartTheme var22 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var23 = var22.getLegendItemPaint();
    java.awt.Paint var24 = var22.getSubtitlePaint();
    java.awt.Font var25 = var22.getLargeFont();
    var16.setFont(var25);
    var6.setLabelFont(var25);
    var1.setTickLabelFont((java.lang.Comparable)var3, var25);
    int var29 = var1.getCategoryLabelPositionOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 4);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.plot.CategoryMarker var2 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var3 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var5 = var3.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var8 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var9 = var8.getTickLabelPaint();
    var3.setFillPaint(var9, true);
    var2.setLabelPaint(var9);
    var0.setDomainGridlinePaint(var9);
    org.jfree.data.time.Year var17 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var18 = new org.jfree.data.time.Month(1, var17);
    org.jfree.data.time.RegularTimePeriod var19 = var18.previous();
    long var20 = var18.getSerialIndex();
    org.jfree.data.time.TimeTableXYDataset var21 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var23 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var24 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var23);
    var21.remove((org.jfree.data.time.TimePeriod)var23, (java.lang.Comparable)100, false);
    org.jfree.chart.axis.PeriodAxis var28 = new org.jfree.chart.axis.PeriodAxis("Compass Plot", (org.jfree.data.time.RegularTimePeriod)var18, (org.jfree.data.time.RegularTimePeriod)var23);
    var28.setMinorTickMarksVisible(false);
    org.jfree.chart.axis.ValueAxis[] var31 = new org.jfree.chart.axis.ValueAxis[] { var28};
    var0.setRangeAxes(var31);
    var0.configureDomainAxes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1201L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.firePropertyChange("", 0.0f, 0.0f);
    javax.swing.JPanel var7 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var8 = var7.getLocation();
    java.awt.Point var9 = var0.getLocation(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.InputMap var11 = var0.getInputMap(4);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    org.jfree.chart.plot.CompassPlot var4 = new org.jfree.chart.plot.CompassPlot();
    boolean var5 = var3.equals((java.lang.Object)var4);
    java.lang.String var6 = var4.getPlotType();
    java.awt.Paint var7 = var4.getRoseCenterPaint();
    java.awt.Paint var8 = var4.getBackgroundPaint();
    javax.swing.JPanel var9 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var10 = var9.getPreferredSize();
    java.awt.image.ColorModel var11 = var9.getColorModel();
    var9.updateUI();
    java.lang.String var13 = var9.toString();
    boolean var14 = var9.getInheritsPopupMenu();
    javax.swing.InputMap var15 = var9.getInputMap();
    var9.nextFocus();
    boolean var17 = var9.getInheritsPopupMenu();
    javax.swing.JPanel var18 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var19 = var18.getPreferredSize();
    java.awt.image.ColorModel var20 = var18.getColorModel();
    var18.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var25 = var18.getForeground();
    var9.setForeground(var25);
    org.jfree.chart.renderer.xy.XYDifferenceRenderer var28 = new org.jfree.chart.renderer.xy.XYDifferenceRenderer(var8, (java.awt.Paint)var25, true);
    org.jfree.chart.labels.StandardXYSeriesLabelGenerator var29 = new org.jfree.chart.labels.StandardXYSeriesLabelGenerator();
    var28.setLegendItemLabelGenerator((org.jfree.chart.labels.XYSeriesLabelGenerator)var29);
    org.jfree.chart.LegendItem var33 = var28.getLegendItem(0, (-1));
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var36 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var39 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var40 = var39.getItemLabelFont();
    double var41 = var39.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var44 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var45 = var44.getItemLabelFont();
    java.awt.Shape var46 = var44.getBaseLegendShape();
    var39.setShape(var46);
    var36.setLegendBar(var46);
    var36.setDrawBarOutline(true);
    org.jfree.data.xy.CategoryTableXYDataset var51 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var52 = var36.findDomainBounds((org.jfree.data.xy.XYDataset)var51);
    org.jfree.data.Range var54 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds((org.jfree.data.xy.TableXYDataset)var51, (-1.0d));
    boolean var55 = var28.equals((java.lang.Object)(-1.0d));
    javax.swing.JPanel var56 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var57 = var56.getLocation();
    org.jfree.chart.plot.PolarPlot var58 = new org.jfree.chart.plot.PolarPlot();
    boolean var59 = var58.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var64 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var64.setUpperMargin(10.0d);
    var64.setAxisLineVisible(true);
    javax.swing.JPanel var69 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var70 = var69.getLocation();
    java.awt.Dimension var71 = var69.preferredSize();
    java.awt.Rectangle var72 = var69.bounds();
    java.awt.Point var73 = var58.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var64, (java.awt.geom.Rectangle2D)var72);
    java.awt.Rectangle var74 = var56.getBounds(var72);
    var28.setLegendLine((java.awt.Shape)var72);
    org.jfree.chart.plot.PolarPlot var76 = new org.jfree.chart.plot.PolarPlot();
    boolean var77 = var76.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var82 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var82.setUpperMargin(10.0d);
    var82.setAxisLineVisible(true);
    javax.swing.JPanel var87 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var88 = var87.getLocation();
    java.awt.Dimension var89 = var87.preferredSize();
    java.awt.Rectangle var90 = var87.bounds();
    java.awt.Point var91 = var76.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var82, (java.awt.geom.Rectangle2D)var90);
    org.jfree.chart.entity.PlotEntity var93 = new org.jfree.chart.entity.PlotEntity((java.awt.Shape)var72, (org.jfree.chart.plot.Plot)var76, "Range[1.0,1.0]");
    
    // Checks the contract:  equals-hashcode on var58 and var76
    assertTrue("Contract failed: equals-hashcode on var58 and var76", var58.equals(var76) ? var58.hashCode() == var76.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var76 and var58
    assertTrue("Contract failed: equals-hashcode on var76 and var58", var76.equals(var58) ? var76.hashCode() == var58.hashCode() : true);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    org.jfree.chart.renderer.xy.XYLineAndShapeRenderer var0 = new org.jfree.chart.renderer.xy.XYLineAndShapeRenderer();
    boolean var1 = var0.getUseOutlinePaint();
    org.jfree.chart.labels.StandardXYItemLabelGenerator var2 = new org.jfree.chart.labels.StandardXYItemLabelGenerator();
    var0.setItemLabelGenerator((org.jfree.chart.labels.XYItemLabelGenerator)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    var3.setLabelAngle(0.0d);
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var8 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var11 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var12 = var11.getItemLabelFont();
    double var13 = var11.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var16 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var17 = var16.getItemLabelFont();
    java.awt.Shape var18 = var16.getBaseLegendShape();
    var11.setShape(var18);
    var8.setLegendBar(var18);
    org.jfree.data.general.DefaultKeyedValues2DDataset var23 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var26 = new org.jfree.chart.entity.CategoryItemEntity(var18, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var23, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    org.jfree.chart.plot.CombinedRangeXYPlot var27 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var28 = var27.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CategoryMarker var30 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var31 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var33 = var31.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var36 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var37 = var36.getTickLabelPaint();
    var31.setFillPaint(var37, true);
    var30.setLabelPaint(var37);
    org.jfree.chart.annotations.XYShapeAnnotation var41 = new org.jfree.chart.annotations.XYShapeAnnotation(var18, var28, var37);
    var3.setAxisLineStroke(var28);
    boolean var43 = var3.isAutoRange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    org.jfree.data.xy.XIntervalSeriesCollection var0 = new org.jfree.data.xy.XIntervalSeriesCollection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var3 = var0.getStartY(100, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    var5.setShape(var12);
    var2.setLegendBar(var12);
    org.jfree.data.general.DefaultKeyedValues2DDataset var17 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var20 = new org.jfree.chart.entity.CategoryItemEntity(var12, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var17, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    int var21 = var20.getCategoryIndex();
    var20.setColumnKey((java.lang.Comparable)5.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    org.jfree.chart.renderer.category.LevelRenderer var0 = new org.jfree.chart.renderer.category.LevelRenderer();
    double var1 = var0.getItemMargin();
    org.jfree.chart.StrokeMap var2 = new org.jfree.chart.StrokeMap();
    java.lang.Object var3 = var2.clone();
    boolean var4 = var0.equals((java.lang.Object)var2);
    java.lang.Object var5 = var2.clone();
    
    // Checks the contract:  equals-hashcode on var3 and var5
    assertTrue("Contract failed: equals-hashcode on var3 and var5", var3.equals(var5) ? var3.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var3
    assertTrue("Contract failed: equals-hashcode on var5 and var3", var5.equals(var3) ? var5.hashCode() == var3.hashCode() : true);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var5 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var0);
    org.jfree.chart.urls.StandardXYURLGenerator var9 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    boolean var10 = var0.equals((java.lang.Object)"hi!");
    org.jfree.data.Range var11 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds((org.jfree.data.category.CategoryDataset)var0);
    boolean var12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var0);
    var0.addValue((java.lang.Number)2.0d, (java.lang.Comparable)8, (java.lang.Comparable)0.04d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isCounterClockwise();
    var0.setRadiusGridlinesVisible(false);
    int var4 = var0.getDatasetCount();
    boolean var5 = var0.isAngleGridlinesVisible();
    int var6 = var0.getSeriesCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    boolean var5 = var2.getItemVisible(0, 0);
    org.jfree.chart.renderer.category.BarPainter var6 = var2.getBarPainter();
    org.jfree.chart.renderer.category.BarRenderer.setDefaultBarPainter(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.String var3 = var2.getDescription();
    org.jfree.data.xy.XYSeries var6 = var2.createCopy(100, 10);
    var6.add(175.0d, 175.0d, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    var2.clear();
    boolean var4 = var2.getAutoSort();
    org.jfree.chart.plot.PolarPlot var5 = new org.jfree.chart.plot.PolarPlot();
    boolean var6 = var5.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var11 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var11.setUpperMargin(10.0d);
    var11.setAxisLineVisible(true);
    javax.swing.JPanel var16 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var17 = var16.getLocation();
    java.awt.Dimension var18 = var16.preferredSize();
    java.awt.Rectangle var19 = var16.bounds();
    java.awt.Point var20 = var5.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var11, (java.awt.geom.Rectangle2D)var19);
    org.jfree.data.xy.DefaultXYZDataset var22 = new org.jfree.data.xy.DefaultXYZDataset();
    org.jfree.data.DomainOrder var23 = var22.getDomainOrder();
    var5.setDataset(1, (org.jfree.data.xy.XYDataset)var22);
    var2.addChangeListener((org.jfree.data.general.SeriesChangeListener)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var28 = var22.getZValue(0, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    org.jfree.chart.plot.dial.DialPlot var1 = new org.jfree.chart.plot.dial.DialPlot();
    var0.setParent((org.jfree.chart.plot.Plot)var1);
    org.jfree.data.general.ValueDataset var3 = var1.getDataset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    org.jfree.data.xy.XYIntervalSeriesCollection var0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.xy.XYBarDataset var2 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var0, 10.0d);
    org.jfree.chart.plot.CombinedRangeXYPlot var3 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var4 = var3.getRangeZeroBaselineStroke();
    java.lang.String var5 = var3.getPlotType();
    boolean var6 = var0.hasListener((java.util.EventListener)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var8 = var0.getSeriesKey(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Combined Range XYPlot"+ "'", var5.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var2 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var1);
    org.jfree.data.time.TimePeriodValue var4 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var1, (java.lang.Number)10);
    org.jfree.data.time.ohlc.OHLCItem var9 = new org.jfree.data.time.ohlc.OHLCItem((org.jfree.data.time.RegularTimePeriod)var1, 100.0d, 0.0d, 0.05d, 0.0d);
    org.jfree.chart.plot.XYPlot var10 = new org.jfree.chart.plot.XYPlot();
    java.lang.Object var11 = var10.clone();
    org.jfree.data.ComparableObjectItem var12 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable)var9, (java.lang.Object)var10);
    org.jfree.data.ComparableObjectSeries var15 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable)var12, false, false);
    org.jfree.chart.renderer.category.BarRenderer3D var22 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var23 = var22.getItemLabelFont();
    java.awt.Shape var24 = var22.getBaseLegendShape();
    org.jfree.chart.entity.ContourEntity var26 = new org.jfree.chart.entity.ContourEntity(var24, "hi!?hi!=100&amp;hi!=1");
    org.jfree.chart.title.TextTitle var28 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var29 = var28.isVisible();
    java.lang.Object var30 = var28.clone();
    java.lang.String var31 = var28.getURLText();
    javax.swing.JPanel var32 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var33 = var32.getPreferredSize();
    java.awt.image.ColorModel var34 = var32.getColorModel();
    var32.updateUI();
    java.lang.String var36 = var32.toString();
    java.awt.Color var37 = var32.getForeground();
    var28.setBackgroundPaint((java.awt.Paint)var37);
    int var39 = var37.getRGB();
    int var40 = var37.getBlue();
    org.jfree.chart.plot.dial.DialPlot var41 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var42 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var43 = var41.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var42);
    org.jfree.chart.plot.dial.DialValueIndicator var44 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var45 = var44.getInsets();
    int var46 = var41.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var44);
    java.awt.Stroke var47 = var44.getOutlineStroke();
    org.jfree.chart.title.TextTitle var49 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var50 = var49.isVisible();
    java.lang.Object var51 = var49.clone();
    java.lang.String var52 = var49.getURLText();
    javax.swing.JPanel var53 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var54 = var53.getPreferredSize();
    java.awt.image.ColorModel var55 = var53.getColorModel();
    var53.updateUI();
    java.lang.String var57 = var53.toString();
    java.awt.Color var58 = var53.getForeground();
    var49.setBackgroundPaint((java.awt.Paint)var58);
    org.jfree.chart.LegendItem var60 = new org.jfree.chart.LegendItem("", "jfreechart-", "hi!", "hi!", var24, (java.awt.Paint)var37, var47, (java.awt.Paint)var58);
    boolean var61 = var15.equals((java.lang.Object)var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var36,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var36.equals("org.jfree.chart.ChartPanel[,0,0,0var36,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-13421773));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var57,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var57.equals("org.jfree.chart.ChartPanel[,0,0,0var57,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    org.jfree.chart.plot.dial.ArcDialFrame var0 = new org.jfree.chart.plot.dial.ArcDialFrame();
    double var1 = var0.getOuterRadius();
    double var2 = var0.getOuterRadius();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setInnerRadius((-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.75d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.75d);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }


    org.jfree.chart.needle.LineNeedle var0 = new org.jfree.chart.needle.LineNeedle();
    java.awt.Stroke var1 = var0.getOutlineStroke();
    java.lang.Object var2 = var0.clone();
    double var3 = var0.getRotateX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.5d);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    var5.setShape(var12);
    var2.setLegendBar(var12);
    org.jfree.data.general.DefaultKeyedValues2DDataset var17 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var20 = new org.jfree.chart.entity.CategoryItemEntity(var12, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var17, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    int var21 = var20.getCategoryIndex();
    java.lang.String var22 = var20.getURLText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var22,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var22.equals("org.jfree.chart.ChartPanel[,0,0,0var22,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    org.jfree.chart.StandardChartTheme var1 = new org.jfree.chart.StandardChartTheme("Compass Plot");
    java.lang.String[] var4 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var5 = new org.jfree.chart.axis.SymbolAxis("hi!", var4);
    org.jfree.chart.plot.CompassPlot var6 = new org.jfree.chart.plot.CompassPlot();
    boolean var7 = var5.equals((java.lang.Object)var6);
    java.lang.String var8 = var6.getPlotType();
    java.awt.Paint var9 = var6.getRoseCenterPaint();
    java.awt.Paint var10 = var6.getBackgroundPaint();
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var12 = var11.getPreferredSize();
    java.awt.image.ColorModel var13 = var11.getColorModel();
    var11.updateUI();
    java.lang.String var15 = var11.toString();
    boolean var16 = var11.getInheritsPopupMenu();
    javax.swing.InputMap var17 = var11.getInputMap();
    var11.nextFocus();
    boolean var19 = var11.getInheritsPopupMenu();
    javax.swing.JPanel var20 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var21 = var20.getPreferredSize();
    java.awt.image.ColorModel var22 = var20.getColorModel();
    var20.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var27 = var20.getForeground();
    var11.setForeground(var27);
    org.jfree.chart.renderer.xy.XYDifferenceRenderer var30 = new org.jfree.chart.renderer.xy.XYDifferenceRenderer(var10, (java.awt.Paint)var27, true);
    var1.setPlotBackgroundPaint((java.awt.Paint)var27);
    org.jfree.chart.renderer.category.BarRenderer3D var34 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var35 = var34.getItemLabelFont();
    double var36 = var34.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var39 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var40 = var39.getItemLabelFont();
    java.awt.Shape var41 = var39.getBaseLegendShape();
    var34.setShape(var41);
    org.jfree.chart.StandardChartTheme var45 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var46 = var45.getLegendItemPaint();
    var34.setItemLabelPaint(var46);
    org.jfree.chart.block.ColorBlock var50 = new org.jfree.chart.block.ColorBlock(var46, 4.0d, (-0.7853981633974483d));
    java.awt.Paint var51 = var50.getPaint();
    var1.setLabelLinkPaint(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Compass Plot"+ "'", var8.equals("Compass Plot"));
    
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
    assertTrue("'" + var15 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var15,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var15.equals("org.jfree.chart.ChartPanel[,0,0,0var15,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    boolean var5 = var2.getItemVisible(0, 0);
    org.jfree.chart.renderer.category.BarPainter var6 = var2.getBarPainter();
    double var7 = var2.getShadowXOffset();
    org.jfree.chart.renderer.xy.XYBarRenderer var9 = new org.jfree.chart.renderer.xy.XYBarRenderer(100.0d);
    boolean var10 = var9.getShadowsVisible();
    boolean var11 = var9.getUseYInterval();
    boolean var12 = var2.hasListener((java.util.EventListener)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.updateUI();
    java.awt.Dimension var4 = var0.getPreferredSize();
    var0.firePropertyChange("hi!?hi!=100&amp;amp;hi!=1", true, false);
    org.jfree.data.resources.DataPackageResources var10 = new org.jfree.data.resources.DataPackageResources();
    java.util.Locale var11 = var10.getLocale();
    java.util.Set var12 = var10.keySet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys(100, var12);
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var0 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem(1, 0);
    org.jfree.data.xy.XYIntervalSeriesCollection var4 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.Range var5 = var0.findRangeBounds((org.jfree.data.xy.XYDataset)var4);
    var0.setPlotLines(false);
    java.lang.String[] var11 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var12 = new org.jfree.chart.axis.SymbolAxis("hi!", var11);
    org.jfree.chart.plot.CompassPlot var13 = new org.jfree.chart.plot.CompassPlot();
    boolean var14 = var12.equals((java.lang.Object)var13);
    java.lang.String var15 = var13.getPlotType();
    java.awt.Paint var16 = var13.getRoseCenterPaint();
    java.awt.Paint var17 = var13.getBackgroundPaint();
    javax.swing.JPanel var18 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var19 = var18.getPreferredSize();
    java.awt.image.ColorModel var20 = var18.getColorModel();
    var18.updateUI();
    java.lang.String var22 = var18.toString();
    boolean var23 = var18.getInheritsPopupMenu();
    javax.swing.InputMap var24 = var18.getInputMap();
    var18.nextFocus();
    boolean var26 = var18.getInheritsPopupMenu();
    javax.swing.JPanel var27 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var28 = var27.getPreferredSize();
    java.awt.image.ColorModel var29 = var27.getColorModel();
    var27.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var34 = var27.getForeground();
    var18.setForeground(var34);
    org.jfree.chart.renderer.xy.XYDifferenceRenderer var37 = new org.jfree.chart.renderer.xy.XYDifferenceRenderer(var17, (java.awt.Paint)var34, true);
    org.jfree.chart.LegendItem var40 = var37.getLegendItem(10, 51);
    org.jfree.chart.plot.CategoryPlot var41 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var43 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var44 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var43);
    org.jfree.data.time.TimePeriodValue var46 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var43, (java.lang.Number)10);
    var41.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    java.awt.Stroke var48 = var41.getRangeMinorGridlineStroke();
    var37.setBaseStroke(var48);
    var0.setSeriesStroke(52, var48, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Compass Plot"+ "'", var15.equals("Compass Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var22,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var22.equals("org.jfree.chart.ChartPanel[,0,0,0var22,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var1 = var0.getLocation();
    java.awt.Dimension var2 = var0.preferredSize();
    java.awt.Rectangle var3 = var0.bounds();
    var0.setDoubleBuffered(true);
    org.jfree.chart.axis.CyclicNumberAxis var8 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var9 = var8.getTickLabelPaint();
    var8.setVisible(false);
    java.lang.Object var12 = var8.clone();
    org.jfree.chart.plot.CombinedRangeXYPlot var13 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    org.jfree.chart.annotations.XYPointerAnnotation var18 = new org.jfree.chart.annotations.XYPointerAnnotation("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (-1.0d), 0.2d, 4.0d);
    double var19 = var18.getLabelOffset();
    org.jfree.ui.TextAnchor var20 = var18.getRotationAnchor();
    boolean var21 = var13.removeAnnotation((org.jfree.chart.annotations.XYAnnotation)var18);
    org.jfree.chart.StandardChartTheme var24 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var25 = var24.getLegendItemPaint();
    java.awt.Paint var26 = var24.getSubtitlePaint();
    java.awt.Font var27 = var24.getLargeFont();
    var18.setFont(var27);
    var8.setLabelFont(var27);
    var0.setFont(var27);
    var0.firePropertyChange("-4,-4,4,4", 1.5d, 175.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    org.jfree.chart.StandardChartTheme var2 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var3 = var2.getLegendItemPaint();
    org.jfree.chart.block.ColorBlock var6 = new org.jfree.chart.block.ColorBlock(var3, (-170.0d), 0.75d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    var5.setShape(var12);
    var2.setLegendBar(var12);
    var2.setDrawBarOutline(true);
    org.jfree.data.xy.CategoryTableXYDataset var17 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var18 = var2.findDomainBounds((org.jfree.data.xy.XYDataset)var17);
    org.jfree.data.Range var20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds((org.jfree.data.xy.TableXYDataset)var17, (-1.0d));
    java.lang.Object var21 = var17.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.axis.CategoryAxis var1 = var0.getDomainAxis();
    org.jfree.chart.event.ChartChangeEvent var2 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var0);
    boolean var3 = var0.getDrawSharedDomainAxis();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    var1.setUseSeriesOffset(true);
    java.awt.Paint var4 = var1.getErrorIndicatorPaint();
    org.jfree.chart.renderer.category.BarRenderer3D var11 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var12 = var11.getItemLabelFont();
    java.awt.Shape var13 = var11.getBaseLegendShape();
    org.jfree.chart.entity.ContourEntity var15 = new org.jfree.chart.entity.ContourEntity(var13, "hi!?hi!=100&amp;hi!=1");
    org.jfree.chart.title.TextTitle var17 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var18 = var17.isVisible();
    java.lang.Object var19 = var17.clone();
    java.lang.String var20 = var17.getURLText();
    javax.swing.JPanel var21 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var22 = var21.getPreferredSize();
    java.awt.image.ColorModel var23 = var21.getColorModel();
    var21.updateUI();
    java.lang.String var25 = var21.toString();
    java.awt.Color var26 = var21.getForeground();
    var17.setBackgroundPaint((java.awt.Paint)var26);
    int var28 = var26.getRGB();
    int var29 = var26.getBlue();
    org.jfree.chart.plot.dial.DialPlot var30 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var31 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var32 = var30.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var31);
    org.jfree.chart.plot.dial.DialValueIndicator var33 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var34 = var33.getInsets();
    int var35 = var30.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var33);
    java.awt.Stroke var36 = var33.getOutlineStroke();
    org.jfree.chart.title.TextTitle var38 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var39 = var38.isVisible();
    java.lang.Object var40 = var38.clone();
    java.lang.String var41 = var38.getURLText();
    javax.swing.JPanel var42 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var43 = var42.getPreferredSize();
    java.awt.image.ColorModel var44 = var42.getColorModel();
    var42.updateUI();
    java.lang.String var46 = var42.toString();
    java.awt.Color var47 = var42.getForeground();
    var38.setBackgroundPaint((java.awt.Paint)var47);
    org.jfree.chart.LegendItem var49 = new org.jfree.chart.LegendItem("", "jfreechart-", "hi!", "hi!", var13, (java.awt.Paint)var26, var36, (java.awt.Paint)var47);
    var1.setFillPaint((java.awt.Paint)var26, false);
    java.awt.Color var52 = java.awt.Color.getColor("", var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var25,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var25.equals("org.jfree.chart.ChartPanel[,0,0,0var25,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-13421773));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var46,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var46.equals("org.jfree.chart.ChartPanel[,0,0,0var46,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.plot.DatasetRenderingOrder var1 = var0.getDatasetRenderingOrder();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var3 = var2.getLocation();
    var0.setQuadrantOrigin((java.awt.geom.Point2D)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var1 = var0.getLocation();
    java.awt.Dimension var2 = var0.preferredSize();
    var0.paintImmediately(100, 100, 10, (-1));
    org.jfree.chart.plot.PolarPlot var8 = new org.jfree.chart.plot.PolarPlot();
    boolean var9 = var8.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var14 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var14.setUpperMargin(10.0d);
    var14.setAxisLineVisible(true);
    javax.swing.JPanel var19 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var20 = var19.getLocation();
    java.awt.Dimension var21 = var19.preferredSize();
    java.awt.Rectangle var22 = var19.bounds();
    java.awt.Point var23 = var8.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var14, (java.awt.geom.Rectangle2D)var22);
    boolean var24 = var0.contains(var23);
    javax.swing.JPopupMenu var25 = var0.getComponentPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    org.jfree.data.xy.XIntervalSeries var1 = new org.jfree.data.xy.XIntervalSeries((java.lang.Comparable)1201L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var1.getXLowValue(1043495433);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.updateUI();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.getInheritsPopupMenu();
    double[] var8 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var9 = new org.jfree.chart.annotations.XYPolygonAnnotation(var8);
    java.lang.Object var10 = var9.clone();
    org.jfree.chart.event.AnnotationChangeEvent var11 = new org.jfree.chart.event.AnnotationChangeEvent((java.lang.Object)var0, (org.jfree.chart.annotations.Annotation)var9);
    var0.setLocation(20, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var4,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var4.equals("org.jfree.chart.ChartPanel[,0,0,0var4,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    org.jfree.data.xy.XYIntervalSeries var3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable)"org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", false, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.ComparableObjectItem var5 = var3.remove((java.lang.Comparable)(-2208960000000L));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.plot.CategoryMarker var2 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var3 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var5 = var3.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var8 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var9 = var8.getTickLabelPaint();
    var3.setFillPaint(var9, true);
    var2.setLabelPaint(var9);
    var0.setDomainGridlinePaint(var9);
    var0.setDrawSharedDomainAxis(false);
    org.jfree.chart.renderer.category.ScatterRenderer var16 = new org.jfree.chart.renderer.category.ScatterRenderer();
    javax.swing.JPanel var17 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var18 = var17.getLocation();
    java.awt.Dimension var19 = var17.preferredSize();
    java.awt.Rectangle var20 = var17.bounds();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var23 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var26 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var27 = var26.getItemLabelFont();
    double var28 = var26.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var31 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var32 = var31.getItemLabelFont();
    java.awt.Shape var33 = var31.getBaseLegendShape();
    var26.setShape(var33);
    var23.setLegendBar(var33);
    org.jfree.data.general.DefaultKeyedValues2DDataset var38 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var41 = new org.jfree.chart.entity.CategoryItemEntity(var33, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var38, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    org.jfree.chart.plot.CombinedRangeXYPlot var42 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var43 = var42.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CategoryMarker var45 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var46 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var48 = var46.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var51 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var52 = var51.getTickLabelPaint();
    var46.setFillPaint(var52, true);
    var45.setLabelPaint(var52);
    org.jfree.chart.annotations.XYShapeAnnotation var56 = new org.jfree.chart.annotations.XYShapeAnnotation(var33, var43, var52);
    java.lang.String[] var59 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var60 = new org.jfree.chart.axis.SymbolAxis("hi!", var59);
    org.jfree.chart.renderer.category.BarRenderer3D var63 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var64 = var63.getItemLabelFont();
    double var65 = var63.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var68 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var69 = var68.getItemLabelFont();
    java.awt.Shape var70 = var68.getBaseLegendShape();
    var63.setShape(var70);
    var60.setDownArrow(var70);
    javax.swing.JPanel var73 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var74 = var73.getPreferredSize();
    java.awt.image.ColorModel var75 = var73.getColorModel();
    var73.updateUI();
    java.lang.String var77 = var73.toString();
    boolean var78 = var73.getInheritsPopupMenu();
    javax.swing.InputMap var79 = var73.getInputMap();
    var73.nextFocus();
    boolean var81 = var73.getInheritsPopupMenu();
    javax.swing.JPanel var82 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var83 = var82.getPreferredSize();
    java.awt.image.ColorModel var84 = var82.getColorModel();
    var82.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var89 = var82.getForeground();
    var73.setForeground(var89);
    var60.setGridBandAlternatePaint((java.awt.Paint)var89);
    org.jfree.chart.annotations.XYShapeAnnotation var92 = new org.jfree.chart.annotations.XYShapeAnnotation((java.awt.Shape)var20, var43, (java.awt.Paint)var89);
    var16.setOutlineStroke(var43, false);
    var0.setDomainCrosshairStroke(var43);
    
    // Checks the contract:  equals-hashcode on var2 and var45
    assertTrue("Contract failed: equals-hashcode on var2 and var45", var2.equals(var45) ? var2.hashCode() == var45.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var45 and var2
    assertTrue("Contract failed: equals-hashcode on var45 and var2", var45.equals(var2) ? var45.hashCode() == var2.hashCode() : true);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var8 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var11 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var12 = var11.getItemLabelFont();
    double var13 = var11.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var16 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var17 = var16.getItemLabelFont();
    java.awt.Shape var18 = var16.getBaseLegendShape();
    var11.setShape(var18);
    var8.setLegendBar(var18);
    var8.setDrawBarOutline(true);
    org.jfree.chart.title.LegendTitle var23 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var8);
    org.jfree.chart.annotations.XYDrawableAnnotation var24 = new org.jfree.chart.annotations.XYDrawableAnnotation(100.0d, 10.0d, 0.0d, (-1.0d), (org.jfree.ui.Drawable)var23);
    var24.setURL("");
    boolean var27 = var1.equals((java.lang.Object)var24);
    double var29 = var1.getRangeUpperBound(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == Double.NaN);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var6 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var6.setUpperMargin(10.0d);
    var6.setAxisLineVisible(true);
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var12 = var11.getLocation();
    java.awt.Dimension var13 = var11.preferredSize();
    java.awt.Rectangle var14 = var11.bounds();
    java.awt.Point var15 = var0.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var6, (java.awt.geom.Rectangle2D)var14);
    org.jfree.data.xy.DefaultXYZDataset var17 = new org.jfree.data.xy.DefaultXYZDataset();
    org.jfree.data.DomainOrder var18 = var17.getDomainOrder();
    var0.setDataset(1, (org.jfree.data.xy.XYDataset)var17);
    org.jfree.chart.plot.PolarPlot var20 = new org.jfree.chart.plot.PolarPlot();
    boolean var21 = var20.isCounterClockwise();
    var20.setRadiusGridlinesVisible(false);
    int var24 = var20.getDatasetCount();
    boolean var25 = var20.isAngleGridlinesVisible();
    org.jfree.data.xy.CategoryTableXYDataset var27 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.general.DefaultKeyedValues2DDataset var28 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var28.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var28);
    java.util.List var34 = var28.getColumnKeys();
    org.jfree.data.Range var36 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)var27, var34, true);
    var20.setDataset(15, (org.jfree.data.xy.XYDataset)var27);
    var0.setDataset((org.jfree.data.xy.XYDataset)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    org.jfree.chart.labels.StandardXYSeriesLabelGenerator var1 = new org.jfree.chart.labels.StandardXYSeriesLabelGenerator("RectangleConstraint[LengthConstraintType.FIXED: width=0.04, height=0.0]");

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    org.jfree.chart.plot.CompassPlot var0 = new org.jfree.chart.plot.CompassPlot();
    org.jfree.chart.LegendItemCollection var1 = var0.getLegendItems();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    org.jfree.chart.renderer.category.BarRenderer3D var0 = new org.jfree.chart.renderer.category.BarRenderer3D();
    var0.setDefaultEntityRadius((-1));
    var0.setMinimumBarLength(Double.NaN);

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var2 = var0.getSeriesLinesVisible(10);
    java.awt.Stroke var3 = var0.getErrorIndicatorStroke();
    org.jfree.data.general.DefaultKeyedValues2DDataset var4 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var4.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    var4.setValue((java.lang.Number)0.04d, (java.lang.Comparable)(short)(-1), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var13 = var0.findRangeBounds((org.jfree.data.category.CategoryDataset)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeRow((java.lang.Comparable)'a');
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    org.jfree.chart.util.HexNumberFormat var3 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var5 = var4.getPreferredSize();
    javax.swing.JPanel var6 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var4.setNextFocusableComponent((java.awt.Component)var6);
    java.util.Locale var8 = var6.getLocale();
    org.jfree.chart.axis.MonthDateFormat var9 = new org.jfree.chart.axis.MonthDateFormat(var8);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var10 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var3, (java.text.DateFormat)var9);
    org.jfree.chart.util.HexNumberFormat var12 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var13 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var14 = var13.getPreferredSize();
    javax.swing.JPanel var15 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var13.setNextFocusableComponent((java.awt.Component)var15);
    java.util.Locale var17 = var15.getLocale();
    org.jfree.chart.axis.MonthDateFormat var18 = new org.jfree.chart.axis.MonthDateFormat(var17);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var19 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var12, (java.text.DateFormat)var18);
    org.jfree.chart.labels.StandardPieSectionLabelGenerator var20 = new org.jfree.chart.labels.StandardPieSectionLabelGenerator("Combined Range XYPlot", (java.text.NumberFormat)var3, (java.text.NumberFormat)var12);
    org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator var21 = new org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator("hi!", (java.text.NumberFormat)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var22 = var3.getCurrency();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    org.jfree.chart.renderer.xy.StackedXYBarRenderer var0 = new org.jfree.chart.renderer.xy.StackedXYBarRenderer();
    org.jfree.chart.labels.ItemLabelPosition var1 = var0.getPositiveItemLabelPositionFallback();
    var0.setRenderAsPercentages(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }


    org.jfree.chart.urls.StandardPieURLGenerator var2 = new org.jfree.chart.urls.StandardPieURLGenerator("jfreechart-onetime-", "PanelUI");

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.renderer.xy.XYSplineRenderer var1 = new org.jfree.chart.renderer.xy.XYSplineRenderer((-2));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    org.jfree.chart.util.HexNumberFormat var0 = new org.jfree.chart.util.HexNumberFormat();
    var0.setNumberOfDigits(1043495433);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    org.jfree.chart.renderer.OutlierListCollection var0 = new org.jfree.chart.renderer.OutlierListCollection();
    var0.setHighFarOut(false);
    boolean var3 = var0.isHighFarOut();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    java.util.Locale var4 = var2.getLocale();
    org.jfree.chart.axis.MonthDateFormat var5 = new org.jfree.chart.axis.MonthDateFormat(var4);
    org.jfree.chart.axis.TickUnitSource var6 = org.jfree.chart.axis.NumberAxis.createStandardTickUnits(var4);
    
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

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var1 = var0.getRangeZeroBaselineStroke();
    java.lang.String var2 = var0.getPlotType();
    org.jfree.chart.plot.CategoryMarker var4 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var5 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var7 = var5.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var10 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var11 = var10.getTickLabelPaint();
    var5.setFillPaint(var11, true);
    var4.setLabelPaint(var11);
    boolean var15 = var0.removeRangeMarker((org.jfree.chart.plot.Marker)var4);
    javax.swing.JPanel var16 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var17 = var16.getPreferredSize();
    java.awt.image.ColorModel var18 = var16.getColorModel();
    var16.updateUI();
    java.lang.String var20 = var16.toString();
    boolean var21 = var16.getInheritsPopupMenu();
    double[] var24 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var25 = new org.jfree.chart.annotations.XYPolygonAnnotation(var24);
    java.lang.Object var26 = var25.clone();
    org.jfree.chart.event.AnnotationChangeEvent var27 = new org.jfree.chart.event.AnnotationChangeEvent((java.lang.Object)var16, (org.jfree.chart.annotations.Annotation)var25);
    var0.annotationChanged(var27);
    java.lang.String var29 = var27.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Combined Range XYPlot"+ "'", var2.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var20,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var20.equals("org.jfree.chart.ChartPanel[,0,0,0var20,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "org.jfree.chart.event.AnnotationChangeEvent[source=org.jfree.chart.ChartPanel[,0,0,0var29,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]]"+ "'", var29.equals("org.jfree.chart.event.AnnotationChangeEvent[source=org.jfree.chart.ChartPanel[,0,0,0var29,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]]"));

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    org.jfree.chart.needle.PinNeedle var0 = new org.jfree.chart.needle.PinNeedle();
    org.jfree.chart.plot.CategoryPlot var1 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.plot.CategoryMarker var3 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var4 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var6 = var4.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var9 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var10 = var9.getTickLabelPaint();
    var4.setFillPaint(var10, true);
    var3.setLabelPaint(var10);
    var1.setDomainGridlinePaint(var10);
    var0.setHighlightPaint(var10);
    java.awt.Paint var16 = var0.getFillPaint();
    java.awt.Paint var17 = var0.getFillPaint();
    javax.swing.JPanel var18 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var19 = var18.getLocation();
    java.awt.Dimension var20 = var18.preferredSize();
    java.awt.Rectangle var21 = var18.bounds();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var24 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var27 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var28 = var27.getItemLabelFont();
    double var29 = var27.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var32 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var33 = var32.getItemLabelFont();
    java.awt.Shape var34 = var32.getBaseLegendShape();
    var27.setShape(var34);
    var24.setLegendBar(var34);
    org.jfree.data.general.DefaultKeyedValues2DDataset var39 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var42 = new org.jfree.chart.entity.CategoryItemEntity(var34, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var39, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    org.jfree.chart.plot.CombinedRangeXYPlot var43 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var44 = var43.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CategoryMarker var46 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var47 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var49 = var47.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var52 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var53 = var52.getTickLabelPaint();
    var47.setFillPaint(var53, true);
    var46.setLabelPaint(var53);
    org.jfree.chart.annotations.XYShapeAnnotation var57 = new org.jfree.chart.annotations.XYShapeAnnotation(var34, var44, var53);
    java.lang.String[] var60 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var61 = new org.jfree.chart.axis.SymbolAxis("hi!", var60);
    org.jfree.chart.renderer.category.BarRenderer3D var64 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var65 = var64.getItemLabelFont();
    double var66 = var64.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var69 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var70 = var69.getItemLabelFont();
    java.awt.Shape var71 = var69.getBaseLegendShape();
    var64.setShape(var71);
    var61.setDownArrow(var71);
    javax.swing.JPanel var74 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var75 = var74.getPreferredSize();
    java.awt.image.ColorModel var76 = var74.getColorModel();
    var74.updateUI();
    java.lang.String var78 = var74.toString();
    boolean var79 = var74.getInheritsPopupMenu();
    javax.swing.InputMap var80 = var74.getInputMap();
    var74.nextFocus();
    boolean var82 = var74.getInheritsPopupMenu();
    javax.swing.JPanel var83 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var84 = var83.getPreferredSize();
    java.awt.image.ColorModel var85 = var83.getColorModel();
    var83.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var90 = var83.getForeground();
    var74.setForeground(var90);
    var61.setGridBandAlternatePaint((java.awt.Paint)var90);
    org.jfree.chart.annotations.XYShapeAnnotation var93 = new org.jfree.chart.annotations.XYShapeAnnotation((java.awt.Shape)var21, var44, (java.awt.Paint)var90);
    var0.setHighlightPaint((java.awt.Paint)var90);
    
    // Checks the contract:  equals-hashcode on var3 and var46
    assertTrue("Contract failed: equals-hashcode on var3 and var46", var3.equals(var46) ? var3.hashCode() == var46.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var46 and var3
    assertTrue("Contract failed: equals-hashcode on var46 and var3", var46.equals(var3) ? var46.hashCode() == var3.hashCode() : true);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    org.jfree.chart.renderer.category.ScatterRenderer var0 = new org.jfree.chart.renderer.category.ScatterRenderer();
    javax.swing.JPanel var1 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var2 = var1.getLocation();
    java.awt.Dimension var3 = var1.preferredSize();
    java.awt.Rectangle var4 = var1.bounds();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var7 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    double var12 = var10.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var15 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var16 = var15.getItemLabelFont();
    java.awt.Shape var17 = var15.getBaseLegendShape();
    var10.setShape(var17);
    var7.setLegendBar(var17);
    org.jfree.data.general.DefaultKeyedValues2DDataset var22 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var25 = new org.jfree.chart.entity.CategoryItemEntity(var17, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var22, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    org.jfree.chart.plot.CombinedRangeXYPlot var26 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var27 = var26.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CategoryMarker var29 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var30 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var32 = var30.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var35 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var36 = var35.getTickLabelPaint();
    var30.setFillPaint(var36, true);
    var29.setLabelPaint(var36);
    org.jfree.chart.annotations.XYShapeAnnotation var40 = new org.jfree.chart.annotations.XYShapeAnnotation(var17, var27, var36);
    java.lang.String[] var43 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var44 = new org.jfree.chart.axis.SymbolAxis("hi!", var43);
    org.jfree.chart.renderer.category.BarRenderer3D var47 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var48 = var47.getItemLabelFont();
    double var49 = var47.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var52 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var53 = var52.getItemLabelFont();
    java.awt.Shape var54 = var52.getBaseLegendShape();
    var47.setShape(var54);
    var44.setDownArrow(var54);
    javax.swing.JPanel var57 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var58 = var57.getPreferredSize();
    java.awt.image.ColorModel var59 = var57.getColorModel();
    var57.updateUI();
    java.lang.String var61 = var57.toString();
    boolean var62 = var57.getInheritsPopupMenu();
    javax.swing.InputMap var63 = var57.getInputMap();
    var57.nextFocus();
    boolean var65 = var57.getInheritsPopupMenu();
    javax.swing.JPanel var66 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var67 = var66.getPreferredSize();
    java.awt.image.ColorModel var68 = var66.getColorModel();
    var66.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var73 = var66.getForeground();
    var57.setForeground(var73);
    var44.setGridBandAlternatePaint((java.awt.Paint)var73);
    org.jfree.chart.annotations.XYShapeAnnotation var76 = new org.jfree.chart.annotations.XYShapeAnnotation((java.awt.Shape)var4, var27, (java.awt.Paint)var73);
    var0.setOutlineStroke(var27, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setItemMargin((-1.0d));
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var61,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var61.equals("org.jfree.chart.ChartPanel[,0,0,0var61,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }


    org.jfree.chart.plot.ContourPlot var0 = new org.jfree.chart.plot.ContourPlot();
    org.jfree.chart.plot.CategoryMarker var2 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    var0.addRangeMarker((org.jfree.chart.plot.Marker)var2);
    org.jfree.chart.urls.StandardXYURLGenerator var7 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    org.jfree.data.statistics.SimpleHistogramDataset var9 = new org.jfree.data.statistics.SimpleHistogramDataset((java.lang.Comparable)100.0f);
    var9.removeAllBins();
    java.lang.String var13 = var7.generateURL((org.jfree.data.xy.XYDataset)var9, 100, 1);
    var0.setURLGenerator((org.jfree.chart.urls.XYURLGenerator)var7);
    java.lang.Number[][] var16 = new java.lang.Number[][] { };
    java.lang.Number[][] var17 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var18 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var16, var17);
    int var19 = var18.getRowCount();
    org.jfree.data.xy.OHLCDataItem[] var21 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var22 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var21);
    var18.setSeriesKeys((java.lang.Comparable[])var21);
    org.jfree.data.xy.DefaultOHLCDataset var24 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)"d", var21);
    java.lang.String var27 = var7.generateURL((org.jfree.data.xy.XYDataset)var24, 15, 10);
    int var28 = var24.getSeriesCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!?hi!=100&amp;hi!=1"+ "'", var13.equals("hi!?hi!=100&amp;hi!=1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!?hi!=15&amp;hi!=10"+ "'", var27.equals("hi!?hi!=15&amp;hi!=10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    org.jfree.chart.plot.CombinedDomainCategoryPlot var0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    java.util.List var1 = var0.getSubplots();
    org.jfree.chart.plot.CategoryPlot var2 = new org.jfree.chart.plot.CategoryPlot();
    java.lang.Comparable var3 = var2.getDomainCrosshairColumnKey();
    var2.setCrosshairDatasetIndex(100);
    org.jfree.chart.plot.CombinedRangeXYPlot var6 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var7 = var6.getRangeZeroBaselineStroke();
    org.jfree.chart.title.TextTitle var9 = new org.jfree.chart.title.TextTitle("hi!");
    org.jfree.ui.RectangleInsets var10 = var9.getMargin();
    var6.setAxisOffset(var10);
    var2.setAxisOffset(var10);
    org.jfree.chart.plot.CategoryMarker var14 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var15 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var17 = var15.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var20 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var21 = var20.getTickLabelPaint();
    var15.setFillPaint(var21, true);
    var14.setLabelPaint(var21);
    org.jfree.chart.plot.CompassPlot var25 = new org.jfree.chart.plot.CompassPlot();
    var14.addChangeListener((org.jfree.chart.event.MarkerChangeListener)var25);
    boolean var27 = var2.removeRangeMarker((org.jfree.chart.plot.Marker)var14);
    var0.remove(var2);
    org.jfree.chart.plot.CombinedRangeXYPlot var30 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var31 = var30.getRangeZeroBaselineStroke();
    java.lang.String var32 = var30.getPlotType();
    org.jfree.chart.plot.CategoryMarker var34 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var35 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var37 = var35.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var40 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var41 = var40.getTickLabelPaint();
    var35.setFillPaint(var41, true);
    var34.setLabelPaint(var41);
    boolean var45 = var30.removeRangeMarker((org.jfree.chart.plot.Marker)var34);
    org.jfree.chart.axis.AxisLocation var46 = var30.getDomainAxisLocation();
    org.jfree.data.time.Week var48 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var49 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var48);
    org.jfree.data.time.TimePeriodValue var51 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var48, (java.lang.Number)10);
    org.jfree.data.time.ohlc.OHLCItem var56 = new org.jfree.data.time.ohlc.OHLCItem((org.jfree.data.time.RegularTimePeriod)var48, 100.0d, 0.0d, 0.05d, 0.0d);
    org.jfree.chart.plot.XYPlot var57 = new org.jfree.chart.plot.XYPlot();
    java.lang.Object var58 = var57.clone();
    org.jfree.data.ComparableObjectItem var59 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable)var56, (java.lang.Object)var57);
    double var60 = var56.getLowValue();
    boolean var61 = var46.equals((java.lang.Object)var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeAxisLocation(2147483647, var46);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Combined Range XYPlot"+ "'", var32.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Dimension var7 = var0.getMaximumSize();
    var0.disable();
    javax.swing.JPanel var10 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var11 = var10.getPreferredSize();
    java.awt.image.ColorModel var12 = var10.getColorModel();
    var10.updateUI();
    java.lang.String var14 = var10.toString();
    boolean var15 = var10.getInheritsPopupMenu();
    javax.swing.InputMap var16 = var10.getInputMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setInputMap(2013, var16);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var14,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var14.equals("org.jfree.chart.ChartPanel[,0,0,0var14,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    org.jfree.chart.needle.PinNeedle var0 = new org.jfree.chart.needle.PinNeedle();
    org.jfree.chart.plot.CategoryPlot var1 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.plot.CategoryMarker var3 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var4 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var6 = var4.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var9 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var10 = var9.getTickLabelPaint();
    var4.setFillPaint(var10, true);
    var3.setLabelPaint(var10);
    var1.setDomainGridlinePaint(var10);
    var0.setHighlightPaint(var10);
    var0.setRotateX(0.75d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.firePropertyChange("", 0.0f, 0.0f);
    java.awt.event.MouseWheelListener[] var7 = var0.getMouseWheelListeners();
    java.awt.FocusTraversalPolicy var8 = var0.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    org.jfree.chart.renderer.xy.XYStepAreaRenderer var1 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(0);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    org.jfree.chart.renderer.category.DefaultCategoryItemRenderer var0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = var0.getSeriesItemURLGenerator(2147483647);
    boolean var3 = var0.getBaseShapesVisible();
    java.lang.String[] var6 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var7 = new org.jfree.chart.axis.SymbolAxis("hi!", var6);
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    double var12 = var10.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var15 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var16 = var15.getItemLabelFont();
    java.awt.Shape var17 = var15.getBaseLegendShape();
    var10.setShape(var17);
    var7.setDownArrow(var17);
    javax.swing.JPanel var20 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var21 = var20.getPreferredSize();
    java.awt.image.ColorModel var22 = var20.getColorModel();
    var20.updateUI();
    java.lang.String var24 = var20.toString();
    boolean var25 = var20.getInheritsPopupMenu();
    javax.swing.InputMap var26 = var20.getInputMap();
    var20.nextFocus();
    boolean var28 = var20.getInheritsPopupMenu();
    javax.swing.JPanel var29 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var30 = var29.getPreferredSize();
    java.awt.image.ColorModel var31 = var29.getColorModel();
    var29.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var36 = var29.getForeground();
    var20.setForeground(var36);
    var7.setGridBandAlternatePaint((java.awt.Paint)var36);
    var0.setBaseItemLabelPaint((java.awt.Paint)var36, false);
    java.lang.Object var41 = var0.clone();
    boolean var43 = var0.getSeriesShapesFilled(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var24,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var24.equals("org.jfree.chart.ChartPanel[,0,0,0var24,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }


    org.jfree.chart.plot.dial.StandardDialScale var0 = new org.jfree.chart.plot.dial.StandardDialScale();
    var0.setMajorTickIncrement(10.0d);
    java.awt.Paint var3 = var0.getMinorTickPaint();
    var0.setTickLabelsVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    org.jfree.chart.axis.LogAxis var0 = new org.jfree.chart.axis.LogAxis();
    var0.setFixedDimension((-170.0d));
    var0.zoomRange((-0.21460183660255172d), 0.5d);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    org.jfree.data.statistics.MeanAndStandardDeviation var2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number)1L, (java.lang.Number)0.0f);
    double var3 = var2.getMeanValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var2.setUpperMargin(10.0d);
    java.awt.Stroke var5 = var2.getTickMarkStroke();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    java.awt.Shape var4 = var2.getBaseLegendShape();
    org.jfree.chart.entity.ContourEntity var6 = new org.jfree.chart.entity.ContourEntity(var4, "hi!?hi!=100&amp;hi!=1");
    var6.setToolTipText("0x00000001");
    var6.setIndex(52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    org.jfree.chart.util.RelativeDateFormat var0 = new org.jfree.chart.util.RelativeDateFormat();
    boolean var1 = var0.getShowZeroHours();
    java.text.NumberFormat var2 = var0.getNumberFormat();
    org.jfree.chart.util.HexNumberFormat var4 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var6 = var5.getPreferredSize();
    javax.swing.JPanel var7 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var5.setNextFocusableComponent((java.awt.Component)var7);
    java.util.Locale var9 = var7.getLocale();
    org.jfree.chart.axis.MonthDateFormat var10 = new org.jfree.chart.axis.MonthDateFormat(var9);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var11 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var4, (java.text.DateFormat)var10);
    boolean var12 = var4.isGroupingUsed();
    var4.setGroupingUsed(true);
    var0.setNumberFormat((java.text.NumberFormat)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }


    org.jfree.chart.annotations.XYLineAnnotation var4 = new org.jfree.chart.annotations.XYLineAnnotation((-1.0d), (-1.0d), 100.0d, 100.0d);
    org.jfree.data.xy.DefaultIntervalXYDataset var5 = new org.jfree.data.xy.DefaultIntervalXYDataset();
    boolean var6 = var4.hasListener((java.util.EventListener)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var9 = var5.getStartX(100, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    java.lang.Number[][] var0 = new java.lang.Number[][] { };
    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var1);
    int var4 = var2.getRowIndex((java.lang.Comparable)'a');
    org.jfree.data.xy.YIntervalDataItem var10 = new org.jfree.data.xy.YIntervalDataItem(0.2d, (-1.0d), 0.2d, 2.0d);
    double var11 = var10.getYHighValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setStartValue(52, (java.lang.Comparable)var10, (java.lang.Number)Double.NaN);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2.0d);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }


    org.jfree.chart.renderer.category.LevelRenderer var0 = new org.jfree.chart.renderer.category.LevelRenderer();
    var0.setMaxItemWidth((-1.0d));
    double var3 = var0.getMaximumItemWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1.0d));

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    org.jfree.chart.labels.BubbleXYItemLabelGenerator var0 = new org.jfree.chart.labels.BubbleXYItemLabelGenerator();
    java.text.DateFormat var1 = var0.getZDateFormat();
    java.text.DateFormat var2 = var0.getYDateFormat();
    org.jfree.chart.axis.CyclicNumberAxis var5 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var5.setVisible(false);
    org.jfree.chart.plot.CombinedRangeXYPlot var8 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var9 = var8.getRangeZeroBaselineStroke();
    org.jfree.chart.title.TextTitle var11 = new org.jfree.chart.title.TextTitle("hi!");
    org.jfree.ui.RectangleInsets var12 = var11.getMargin();
    var8.setAxisOffset(var12);
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var16 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var19 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var20 = var19.getItemLabelFont();
    double var21 = var19.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var24 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var25 = var24.getItemLabelFont();
    java.awt.Shape var26 = var24.getBaseLegendShape();
    var19.setShape(var26);
    var16.setLegendBar(var26);
    org.jfree.data.general.DefaultKeyedValues2DDataset var31 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var34 = new org.jfree.chart.entity.CategoryItemEntity(var26, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var31, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    org.jfree.chart.plot.CombinedRangeXYPlot var35 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var36 = var35.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CategoryMarker var38 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var39 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var41 = var39.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var44 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var45 = var44.getTickLabelPaint();
    var39.setFillPaint(var45, true);
    var38.setLabelPaint(var45);
    org.jfree.chart.annotations.XYShapeAnnotation var49 = new org.jfree.chart.annotations.XYShapeAnnotation(var26, var36, var45);
    var8.setRangeCrosshairPaint(var45);
    var5.setAdvanceLinePaint(var45);
    boolean var52 = var0.equals((java.lang.Object)var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var3 = var2.isAxisLineVisible();
    var2.setAxisLineVisible(true);
    org.jfree.data.general.DefaultKeyedValues2DDataset var6 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var6.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var11 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var6);
    var2.setDefaultAutoRange(var11);
    org.jfree.data.Range var13 = var2.getRange();
    var2.setLabelAngle((-90.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    org.jfree.data.statistics.DefaultStatisticalCategoryDataset var0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    var0.clear();
    java.util.List var2 = var0.getRowKeys();
    java.lang.Object var3 = var0.clone();
    int var4 = var0.getRowCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeRow(1043495433);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


    org.jfree.chart.renderer.category.GroupedStackedBarRenderer var0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
    javax.swing.JPanel var1 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var2 = var1.getPreferredSize();
    javax.swing.JPanel var3 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var1.setNextFocusableComponent((java.awt.Component)var3);
    java.util.Locale var5 = var3.getLocale();
    javax.swing.JPanel var6 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var7 = var6.getPreferredSize();
    java.awt.Dimension var8 = var3.getSize(var7);
    java.awt.event.ContainerListener[] var9 = var3.getContainerListeners();
    var3.removeNotify();
    boolean var11 = var3.requestFocusInWindow();
    boolean var12 = var0.equals((java.lang.Object)var11);
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    org.jfree.chart.renderer.category.BarRenderer3D var6 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var7 = var6.getItemLabelFont();
    java.awt.Shape var8 = var6.getBaseLegendShape();
    org.jfree.chart.entity.ContourEntity var10 = new org.jfree.chart.entity.ContourEntity(var8, "hi!?hi!=100&amp;hi!=1");
    org.jfree.chart.title.TextTitle var12 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var13 = var12.isVisible();
    java.lang.Object var14 = var12.clone();
    java.lang.String var15 = var12.getURLText();
    javax.swing.JPanel var16 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var17 = var16.getPreferredSize();
    java.awt.image.ColorModel var18 = var16.getColorModel();
    var16.updateUI();
    java.lang.String var20 = var16.toString();
    java.awt.Color var21 = var16.getForeground();
    var12.setBackgroundPaint((java.awt.Paint)var21);
    int var23 = var21.getRGB();
    int var24 = var21.getBlue();
    org.jfree.chart.plot.dial.DialPlot var25 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var26 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var27 = var25.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var26);
    org.jfree.chart.plot.dial.DialValueIndicator var28 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var29 = var28.getInsets();
    int var30 = var25.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var28);
    java.awt.Stroke var31 = var28.getOutlineStroke();
    org.jfree.chart.title.TextTitle var33 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var34 = var33.isVisible();
    java.lang.Object var35 = var33.clone();
    java.lang.String var36 = var33.getURLText();
    javax.swing.JPanel var37 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var38 = var37.getPreferredSize();
    java.awt.image.ColorModel var39 = var37.getColorModel();
    var37.updateUI();
    java.lang.String var41 = var37.toString();
    java.awt.Color var42 = var37.getForeground();
    var33.setBackgroundPaint((java.awt.Paint)var42);
    org.jfree.chart.LegendItem var44 = new org.jfree.chart.LegendItem("", "jfreechart-", "hi!", "hi!", var8, (java.awt.Paint)var21, var31, (java.awt.Paint)var42);
    var44.setDatasetIndex((-2));
    org.jfree.data.function.LineFunction2D var49 = new org.jfree.data.function.LineFunction2D(0.05d, 10.0d);
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var52 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var55 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var56 = var55.getItemLabelFont();
    double var57 = var55.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var60 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var61 = var60.getItemLabelFont();
    java.awt.Shape var62 = var60.getBaseLegendShape();
    var55.setShape(var62);
    var52.setLegendBar(var62);
    org.jfree.data.general.DefaultKeyedValues2DDataset var67 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var70 = new org.jfree.chart.entity.CategoryItemEntity(var62, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var67, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var73 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    java.awt.Shape var74 = var73.getLegendBar();
    org.jfree.chart.entity.ContourEntity var77 = new org.jfree.chart.entity.ContourEntity(var74, "", "hi!");
    var70.setArea(var74);
    boolean var79 = var49.equals((java.lang.Object)var74);
    var44.setLine(var74);
    java.lang.Object var81 = var44.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var20,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var20.equals("org.jfree.chart.ChartPanel[,0,0,0var20,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-13421773));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var41,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var41.equals("org.jfree.chart.ChartPanel[,0,0,0var41,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    java.lang.Boolean var4 = var2.getSeriesCreateEntities(52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    org.jfree.data.general.DatasetGroup var1 = new org.jfree.data.general.DatasetGroup("DomainOrder.NONE");
    java.lang.Object var2 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Dimension var7 = var0.getMaximumSize();
    var0.disable();
    javax.swing.InputVerifier var9 = var0.getInputVerifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    org.jfree.data.contour.NonGridContourDataset var0 = new org.jfree.data.contour.NonGridContourDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var0.getItemCount(4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    org.jfree.chart.plot.dial.DialCap var0 = new org.jfree.chart.plot.dial.DialCap();
    double var1 = var0.getRadius();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.05d);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }


    org.jfree.chart.renderer.xy.XYDotRenderer var0 = new org.jfree.chart.renderer.xy.XYDotRenderer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDotHeight((-13421773));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    org.jfree.chart.util.HexNumberFormat var1 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.labels.StandardCrosshairLabelGenerator var2 = new org.jfree.chart.labels.StandardCrosshairLabelGenerator("", (java.text.NumberFormat)var1);
    org.jfree.chart.plot.Crosshair var3 = new org.jfree.chart.plot.Crosshair();
    double var4 = var3.getValue();
    org.jfree.chart.needle.PinNeedle var5 = new org.jfree.chart.needle.PinNeedle();
    org.jfree.chart.plot.CategoryPlot var6 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.plot.CategoryMarker var8 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var9 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var11 = var9.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var14 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var15 = var14.getTickLabelPaint();
    var9.setFillPaint(var15, true);
    var8.setLabelPaint(var15);
    var6.setDomainGridlinePaint(var15);
    var5.setHighlightPaint(var15);
    java.awt.Paint var21 = var5.getHighlightPaint();
    var3.setLabelOutlinePaint(var21);
    java.lang.String var23 = var2.generateLabel(var3);
    org.jfree.chart.plot.CombinedRangeXYPlot var28 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var29 = var28.getRangeZeroBaselineStroke();
    java.lang.String var30 = var28.getPlotType();
    org.jfree.chart.plot.CategoryMarker var32 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var33 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var35 = var33.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var38 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var39 = var38.getTickLabelPaint();
    var33.setFillPaint(var39, true);
    var32.setLabelPaint(var39);
    boolean var43 = var28.removeRangeMarker((org.jfree.chart.plot.Marker)var32);
    java.awt.Paint var45 = var28.getQuadrantPaint(1);
    org.jfree.data.xy.XYDataset var47 = var28.getDataset((-1));
    double var48 = var28.getDomainCrosshairValue();
    javax.swing.JPanel var49 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var50 = var49.getPreferredSize();
    boolean var51 = var49.getIgnoreRepaint();
    boolean var52 = var49.isLightweight();
    javax.swing.JPanel var53 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var54 = var53.getPreferredSize();
    javax.swing.JPanel var55 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var53.setNextFocusableComponent((java.awt.Component)var55);
    var53.show();
    javax.swing.JPanel var58 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var59 = var58.getLocation();
    java.awt.Dimension var60 = var58.preferredSize();
    java.awt.Rectangle var61 = var58.bounds();
    var53.scrollRectToVisible(var61);
    var49.setBounds(var61);
    org.jfree.chart.renderer.category.BarRenderer3D var66 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var67 = var66.getItemLabelFont();
    java.awt.Shape var68 = var66.getBaseLegendShape();
    double var69 = var66.getItemMargin();
    org.jfree.chart.plot.CombinedRangeXYPlot var70 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var71 = var70.getRangeZeroBaselineStroke();
    var66.setStroke(var71, false);
    org.jfree.chart.renderer.category.BarRenderer3D var76 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var77 = var76.getItemLabelFont();
    double var78 = var76.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var81 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var82 = var81.getItemLabelFont();
    java.awt.Shape var83 = var81.getBaseLegendShape();
    var76.setShape(var83);
    org.jfree.chart.StandardChartTheme var87 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var88 = var87.getLegendItemPaint();
    var76.setItemLabelPaint(var88);
    org.jfree.chart.annotations.XYShapeAnnotation var90 = new org.jfree.chart.annotations.XYShapeAnnotation((java.awt.Shape)var61, var71, var88);
    var28.setDomainMinorGridlineStroke(var71);
    org.jfree.chart.plot.dial.StandardDialScale var92 = new org.jfree.chart.plot.dial.StandardDialScale();
    var92.setMajorTickIncrement(10.0d);
    java.awt.Paint var95 = var92.getMinorTickPaint();
    org.jfree.chart.annotations.XYLineAnnotation var96 = new org.jfree.chart.annotations.XYLineAnnotation(10.0d, (-0.7853981633974483d), (-0.21460183660255172d), 100.0d, var71, var95);
    var3.setLabelBackgroundPaint(var95);
    
    // Checks the contract:  equals-hashcode on var8 and var32
    assertTrue("Contract failed: equals-hashcode on var8 and var32", var8.equals(var32) ? var8.hashCode() == var32.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var32 and var8
    assertTrue("Contract failed: equals-hashcode on var32 and var8", var32.equals(var8) ? var32.hashCode() == var8.hashCode() : true);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }


    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    java.lang.Number[][] var2 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var1, var2);
    int var4 = var3.getRowCount();
    org.jfree.data.xy.OHLCDataItem[] var6 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var7 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var6);
    var3.setSeriesKeys((java.lang.Comparable[])var6);
    org.jfree.data.xy.DefaultOHLCDataset var9 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)"d", var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var12 = var9.getOpen(51, 2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    org.jfree.chart.renderer.xy.XYBlockRenderer var0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var1 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var2 = var0.findDomainBounds((org.jfree.data.xy.XYDataset)var1);
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.labels.ItemLabelPosition var10 = var5.getNegativeItemLabelPosition(0, 0);
    double var11 = var10.getAngle();
    var0.setNegativeItemLabelPosition(var10);
    org.jfree.chart.labels.XYSeriesLabelGenerator var13 = var0.getLegendItemToolTipGenerator();
    org.jfree.chart.title.LegendTitle var14 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var0);
    org.jfree.chart.plot.CategoryPlot var15 = new org.jfree.chart.plot.CategoryPlot();
    java.lang.Comparable var16 = var15.getDomainCrosshairColumnKey();
    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var17 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    var17.setUseSeriesOffset(true);
    var17.setBaseSeriesVisible(true);
    var17.setAutoPopulateSeriesShape(false);
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var24 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var17};
    var15.setRenderers(var24);
    var14.setSources((org.jfree.chart.LegendItemSource[])var24);
    org.jfree.ui.RectangleAnchor var27 = var14.getLegendItemGraphicLocation();
    org.jfree.chart.plot.CategoryPlot var28 = new org.jfree.chart.plot.CategoryPlot();
    java.lang.Comparable var29 = var28.getDomainCrosshairColumnKey();
    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var30 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    var30.setUseSeriesOffset(true);
    var30.setBaseSeriesVisible(true);
    var30.setAutoPopulateSeriesShape(false);
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var37 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var30};
    var28.setRenderers(var37);
    var14.setSources((org.jfree.chart.LegendItemSource[])var37);
    
    // Checks the contract:  equals-hashcode on var15 and var28
    assertTrue("Contract failed: equals-hashcode on var15 and var28", var15.equals(var28) ? var15.hashCode() == var28.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var28 and var15
    assertTrue("Contract failed: equals-hashcode on var28 and var15", var28.equals(var15) ? var28.hashCode() == var15.hashCode() : true);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    org.jfree.chart.renderer.xy.XYShapeRenderer var0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    org.jfree.chart.axis.CyclicNumberAxis var3 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var4 = var3.isAxisLineVisible();
    var3.setAxisLineVisible(true);
    var3.setMinorTickMarksVisible(true);
    org.jfree.ui.RectangleInsets var9 = var3.getTickLabelInsets();
    boolean var10 = var0.equals((java.lang.Object)var3);
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var12 = var11.getPreferredSize();
    java.awt.image.ColorModel var13 = var11.getColorModel();
    var11.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var18 = var11.getForeground();
    boolean var19 = var0.equals((java.lang.Object)var11);
    boolean var20 = var0.isGuideLinesVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    org.jfree.chart.plot.dial.StandardDialFrame var0 = new org.jfree.chart.plot.dial.StandardDialFrame();
    boolean var1 = var0.isClippedToWindow();
    boolean var2 = var0.isClippedToWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    java.util.Locale var4 = var2.getLocale();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var6 = var5.getPreferredSize();
    java.awt.Dimension var7 = var2.getSize(var6);
    java.awt.event.ContainerListener[] var8 = var2.getContainerListeners();
    boolean var11 = var2.inside(2147483647, 10);
    javax.swing.JPanel var12 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var13 = var12.getPreferredSize();
    javax.swing.JPanel var14 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var12.setNextFocusableComponent((java.awt.Component)var14);
    java.util.Locale var16 = var14.getLocale();
    javax.swing.JPanel var17 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var18 = var17.getPreferredSize();
    java.awt.Dimension var19 = var14.getSize(var18);
    java.awt.event.ContainerListener[] var20 = var14.getContainerListeners();
    boolean var23 = var14.inside(2147483647, 10);
    var2.setNextFocusableComponent((java.awt.Component)var14);
    boolean var25 = var2.isPaintingForPrint();
    boolean var26 = var2.isDoubleBuffered();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    double[] var2 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var3 = new org.jfree.chart.annotations.XYPolygonAnnotation(var2);
    double[] var6 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var7 = new org.jfree.chart.annotations.XYPolygonAnnotation(var6);
    org.jfree.chart.ClipPath var8 = new org.jfree.chart.ClipPath(var2, var6);
    double[][] var9 = new double[][] { var2};
    double[] var14 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var15 = new org.jfree.chart.annotations.XYPolygonAnnotation(var14);
    double[] var18 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var19 = new org.jfree.chart.annotations.XYPolygonAnnotation(var18);
    org.jfree.chart.ClipPath var20 = new org.jfree.chart.ClipPath(var14, var18);
    double[][] var21 = new double[][] { var14};
    org.jfree.data.category.CategoryDataset var22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", "jfreechart-onetime-", var21);
    org.jfree.data.category.DefaultIntervalCategoryDataset var23 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var9, var21);
    java.util.List var24 = var23.getColumnKeys();
    double[] var27 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var28 = new org.jfree.chart.annotations.XYPolygonAnnotation(var27);
    double[] var31 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var32 = new org.jfree.chart.annotations.XYPolygonAnnotation(var31);
    org.jfree.chart.ClipPath var33 = new org.jfree.chart.ClipPath(var27, var31);
    double[][] var34 = new double[][] { var27};
    double[] var39 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var40 = new org.jfree.chart.annotations.XYPolygonAnnotation(var39);
    double[] var43 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var44 = new org.jfree.chart.annotations.XYPolygonAnnotation(var43);
    org.jfree.chart.ClipPath var45 = new org.jfree.chart.ClipPath(var39, var43);
    double[][] var46 = new double[][] { var39};
    org.jfree.data.category.CategoryDataset var47 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", "jfreechart-onetime-", var46);
    org.jfree.data.category.DefaultIntervalCategoryDataset var48 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var34, var46);
    java.util.List var49 = var48.getColumnKeys();
    org.jfree.data.general.DatasetChangeEvent var50 = new org.jfree.data.general.DatasetChangeEvent((java.lang.Object)var23, (org.jfree.data.general.Dataset)var48);
    
    // Checks the contract:  equals-hashcode on var23 and var48
    assertTrue("Contract failed: equals-hashcode on var23 and var48", var23.equals(var48) ? var23.hashCode() == var48.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var48 and var23
    assertTrue("Contract failed: equals-hashcode on var48 and var23", var48.equals(var23) ? var48.hashCode() == var23.hashCode() : true);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    org.jfree.chart.plot.dial.DialValueIndicator var0 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var1 = var0.getInsets();
    java.awt.Stroke var2 = var0.getOutlineStroke();
    javax.swing.JPanel var3 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var4 = var3.getPreferredSize();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var3.setNextFocusableComponent((java.awt.Component)var5);
    java.util.Locale var7 = var5.getLocale();
    javax.swing.JPanel var8 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var9 = var8.getPreferredSize();
    java.awt.Dimension var10 = var5.getSize(var9);
    java.awt.event.ContainerListener[] var11 = var5.getContainerListeners();
    javax.swing.JPanel var12 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var13 = var12.getPreferredSize();
    java.awt.image.ColorModel var14 = var12.getColorModel();
    var12.updateUI();
    java.lang.String var16 = var12.toString();
    java.awt.Color var17 = var12.getForeground();
    var5.setBackground(var17);
    var0.setOutlinePaint((java.awt.Paint)var17);
    javax.swing.JPanel var20 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var21 = var20.getPreferredSize();
    javax.swing.JPanel var22 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var20.setNextFocusableComponent((java.awt.Component)var22);
    java.util.Locale var24 = var22.getLocale();
    javax.swing.JPanel var25 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var26 = var25.getPreferredSize();
    java.awt.Dimension var27 = var22.getSize(var26);
    java.awt.event.ContainerListener[] var28 = var22.getContainerListeners();
    javax.swing.JPanel var29 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var30 = var29.getPreferredSize();
    java.awt.image.ColorModel var31 = var29.getColorModel();
    var29.updateUI();
    java.lang.String var33 = var29.toString();
    java.awt.Color var34 = var29.getForeground();
    var22.setBackground(var34);
    var0.setOutlinePaint((java.awt.Paint)var34);
    org.jfree.ui.RectangleInsets var37 = var0.getInsets();
    org.jfree.ui.RectangleAnchor var38 = var0.getFrameAnchor();
    org.jfree.chart.annotations.XYPointerAnnotation var43 = new org.jfree.chart.annotations.XYPointerAnnotation("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (-1.0d), 0.2d, 4.0d);
    double var44 = var43.getLabelOffset();
    org.jfree.ui.TextAnchor var45 = var43.getRotationAnchor();
    var0.setTextAnchor(var45);
    double var47 = var0.getAngle();
    
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
    assertTrue("'" + var16 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var16,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var16.equals("org.jfree.chart.ChartPanel[,0,0,0var16,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var33,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var33.equals("org.jfree.chart.ChartPanel[,0,0,0var33,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-90.0d));

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    org.jfree.chart.annotations.XYPointerAnnotation var4 = new org.jfree.chart.annotations.XYPointerAnnotation("", (-0.7853981633974483d), 1.0d, 0.2d);
    var4.setRotationAngle(0.04d);

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var2 = var0.getCeilingTickUnit(0.3d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    org.jfree.data.contour.NonGridContourDataset var0 = new org.jfree.data.contour.NonGridContourDataset();
    int[] var1 = var0.getXIndices();
    java.lang.Number var4 = var0.getY((-13421773), 0);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var4 = var1.getX(15, 1043495433);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getBaseline((-13421773), 20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    var0.show();
    javax.swing.border.Border var5 = var0.getBorder();
    boolean var6 = var0.requestDefaultFocus();
    javax.accessibility.AccessibleContext var7 = var0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.updateUI();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.getInheritsPopupMenu();
    javax.swing.InputMap var6 = var0.getInputMap();
    var0.nextFocus();
    java.awt.event.HierarchyListener[] var8 = var0.getHierarchyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var4,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var4.equals("org.jfree.chart.ChartPanel[,0,0,0var4,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

}
