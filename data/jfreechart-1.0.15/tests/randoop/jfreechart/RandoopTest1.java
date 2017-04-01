package randoop.jfreechart;

import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


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
    org.jfree.chart.renderer.category.StackedAreaRenderer var23 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.LegendItem var26 = var23.getLegendItem((-1), (-1));
    java.awt.Paint var27 = var23.getBaseOutlinePaint();
    var2.setShadowPaint(var27);
    boolean var29 = var2.getIncludeBaseInRange();
    var2.setShadowVisible(false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    var0.setUseSeriesOffset(true);
    int var3 = var0.getPassCount();
    var0.setShapesVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    org.jfree.chart.renderer.xy.XYSplineRenderer var1 = new org.jfree.chart.renderer.xy.XYSplineRenderer(2147483647);
    var1.clearSeriesPaints(false);
    org.jfree.chart.LegendItem var6 = var1.getLegendItem(15, 2013);
    java.lang.Boolean var7 = var1.getLinesVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    org.jfree.data.xy.DefaultXYZDataset var0 = new org.jfree.data.xy.DefaultXYZDataset();
    org.jfree.data.Range var2 = org.jfree.data.general.DatasetUtilities.findZBounds((org.jfree.data.xy.XYZDataset)var0, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.getXValue((-13421773), 20);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.axis.CategoryAxis var1 = var0.getDomainAxis();
    var0.clearRangeMarkers(2013);
    java.awt.Stroke var4 = var0.getDomainGridlineStroke();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


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
    double var21 = var0.getMinZ();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1.0d));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    org.jfree.data.resources.DataPackageResources_es var0 = new org.jfree.data.resources.DataPackageResources_es();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var2 = var0.getStringArray("jfreechart-");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    org.jfree.chart.axis.SubCategoryAxis var1 = new org.jfree.chart.axis.SubCategoryAxis("Combined Range XYPlot");
    double var2 = var1.getUpperMargin();
    var1.setVisible(false);
    int var5 = var1.getCategoryLabelPositionOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


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
    java.lang.Object[][] var24 = org.jfree.data.contour.DefaultContourDataset.formObjectArray(var9);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }


    org.jfree.data.statistics.SimpleHistogramBin var2 = new org.jfree.data.statistics.SimpleHistogramBin(0.05d, 2.0d);
    var2.setItemCount(2);
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var7 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    double var12 = var10.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var15 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var16 = var15.getItemLabelFont();
    java.awt.Shape var17 = var15.getBaseLegendShape();
    var10.setShape(var17);
    var7.setLegendBar(var17);
    var7.setDrawBarOutline(true);
    java.awt.Paint var23 = var7.getLegendTextPaint(0);
    var7.setSeriesItemLabelsVisible(0, true);
    boolean var27 = var2.equals((java.lang.Object)var7);
    org.jfree.chart.labels.XYItemLabelGenerator var28 = var7.getItemLabelGenerator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.axis.CyclicNumberAxis var3 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var4 = var3.getTickLabelPaint();
    org.jfree.chart.axis.ValueAxis[] var5 = new org.jfree.chart.axis.ValueAxis[] { var3};
    var0.setRangeAxes(var5);
    boolean var7 = var0.isRangeZoomable();
    org.jfree.chart.axis.CyclicNumberAxis var9 = new org.jfree.chart.axis.CyclicNumberAxis(2.0d);
    org.jfree.data.Range var10 = var0.getDataRange((org.jfree.chart.axis.ValueAxis)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.String var3 = var2.getDescription();
    org.jfree.data.xy.XYSeries var6 = var2.createCopy(100, 10);
    int var7 = var2.getItemCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    org.jfree.chart.axis.CategoryAxis3D var0 = new org.jfree.chart.axis.CategoryAxis3D();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    org.jfree.chart.plot.MultiplePiePlot var0 = new org.jfree.chart.plot.MultiplePiePlot();
    org.jfree.chart.renderer.category.BarRenderer3D var3 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var4 = var3.getItemLabelFont();
    double var5 = var3.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var8 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var9 = var8.getItemLabelFont();
    java.awt.Shape var10 = var8.getBaseLegendShape();
    var3.setShape(var10);
    org.jfree.chart.StandardChartTheme var14 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var15 = var14.getLegendItemPaint();
    var3.setItemLabelPaint(var15);
    var0.setAggregatedItemsPaint(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    var2.setSeriesVisible((java.lang.Boolean)false, true);
    var2.setShadowYOffset(0.02d);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


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
    boolean var18 = var2.isSeriesItemLabelsVisible(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    org.jfree.data.resources.DataPackageResources_de var0 = new org.jfree.data.resources.DataPackageResources_de();
    java.util.Set var1 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
    long var1 = var0.getFirstMillisecond();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1378623600000L);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var2 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var1);
    var2.setPercentComplete((java.lang.Double)10.0d);
    org.jfree.data.time.TimePeriod var5 = var2.getDuration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    org.jfree.chart.axis.CyclicNumberAxis var3 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var4 = var3.isAxisLineVisible();
    var3.setAxisLineVisible(true);
    org.jfree.data.general.DefaultKeyedValues2DDataset var7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var7.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var12 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var7);
    var3.setDefaultAutoRange(var12);
    org.jfree.chart.block.RectangleConstraint var14 = new org.jfree.chart.block.RectangleConstraint(0.04d, var12);
    java.lang.String var15 = var14.toString();
    double var16 = var14.getWidth();
    double var17 = var14.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RectangleConstraint[LengthConstraintType.FIXED: width=0.04, height=0.0]"+ "'", var15.equals("RectangleConstraint[LengthConstraintType.FIXED: width=0.04, height=0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.04d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.04d);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var1 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var2 = var0.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var1);
    double var3 = var1.getMajorTickLength();
    boolean var4 = var1.getFirstTickLabelVisible();
    double var5 = var1.getStartAngle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.04d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 175.0d);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    boolean var2 = var0.getIgnoreRepaint();
    java.awt.dnd.DropTarget var3 = var0.getDropTarget();
    java.awt.event.ContainerListener[] var4 = var0.getContainerListeners();
    var0.paintImmediately(2147483647, 100, 1, 100);
    var0.firePropertyChange("hi!", '#', '#');
    java.awt.Image var16 = var0.createImage(0, 4);
    
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
    assertNull(var16);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    org.jfree.chart.renderer.category.StackedBarRenderer3D var3 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(100.0d, 0.0d, true);
    double var4 = var3.getShadowYOffset();
    boolean var5 = var3.getAutoPopulateSeriesPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    org.jfree.chart.StandardChartTheme var2 = new org.jfree.chart.StandardChartTheme("hi!", true);
    org.jfree.chart.renderer.category.BarPainter var3 = var2.getBarPainter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    org.jfree.chart.axis.SubCategoryAxis var1 = new org.jfree.chart.axis.SubCategoryAxis("RectangleConstraint[LengthConstraintType.FIXED: width=0.04, height=0.0]");

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


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
    org.jfree.chart.axis.CyclicNumberAxis var20 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var21 = var20.isAxisLineVisible();
    var20.setAxisLineVisible(true);
    var20.setMinorTickMarksVisible(true);
    org.jfree.chart.plot.CombinedRangeXYPlot var26 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var27 = var26.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CombinedRangeXYPlot var28 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var29 = var28.getRangeZeroBaselineStroke();
    var26.setRangeGridlineStroke(var29);
    var26.setDomainMinorGridlinesVisible(true);
    var26.setRangeZeroBaselineVisible(true);
    var20.setPlot((org.jfree.chart.plot.Plot)var26);
    var0.setDomainAxis((org.jfree.chart.axis.ValueAxis)var20);
    var0.mapDatasetToRangeAxis(2013, 2013);
    var0.setRangeGridlinesVisible(false);
    boolean var42 = var0.isDomainCrosshairLockedOnData();
    var0.setRangeCrosshairValue(0.5d, true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    org.jfree.data.xy.XIntervalSeriesCollection var0 = new org.jfree.data.xy.XIntervalSeriesCollection();
    org.jfree.data.xy.XIntervalSeries var2 = new org.jfree.data.xy.XIntervalSeries((java.lang.Comparable)1201L);
    var0.addSeries(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var0.getYValue(8, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var3 = var2.getTickLabelPaint();
    var2.setVisible(false);
    java.lang.Object var6 = var2.clone();
    org.jfree.data.RangeType var7 = var2.getRangeType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    org.jfree.data.general.DatasetGroup var0 = new org.jfree.data.general.DatasetGroup();

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


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
    var9.setDomainCrosshairValue((-170.0d));
    org.jfree.chart.StandardChartTheme var23 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    org.jfree.chart.plot.DrawingSupplier var24 = var23.getDrawingSupplier();
    org.jfree.chart.plot.dial.StandardDialScale var25 = new org.jfree.chart.plot.dial.StandardDialScale();
    var25.setMajorTickIncrement(10.0d);
    java.awt.Paint var28 = var25.getMinorTickPaint();
    var23.setTickLabelPaint(var28);
    java.awt.Paint var30 = var23.getBaselinePaint();
    var9.setRangeCrosshairPaint(var30);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


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
    var24.add(10.0d, 0.0d, "hi!?hi!=100&amp;hi!=1");
    org.jfree.data.Range var33 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)var24);
    var24.add((java.lang.Number)0.75d, (java.lang.Number)0.0f, "jfreechart-", false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isRadiusGridlinesVisible();
    org.jfree.chart.renderer.category.BarRenderer3D var4 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var5 = var4.getItemLabelFont();
    java.awt.Shape var6 = var4.getBaseLegendShape();
    double var7 = var4.getItemMargin();
    org.jfree.chart.plot.CombinedRangeXYPlot var8 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var9 = var8.getRangeZeroBaselineStroke();
    var4.setStroke(var9, false);
    var0.setRadiusGridlineStroke(var9);
    org.jfree.chart.StandardChartTheme var14 = new org.jfree.chart.StandardChartTheme("Compass Plot");
    org.jfree.chart.StandardChartTheme var17 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var18 = var17.getLegendItemPaint();
    org.jfree.chart.plot.DrawingSupplier var19 = var17.getDrawingSupplier();
    var14.setDrawingSupplier(var19);
    var0.setDrawingSupplier(var19, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }


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
    org.jfree.data.xy.XYDataset var19 = var0.getDataset((-1));
    double var20 = var0.getDomainCrosshairValue();
    var0.setRangeCrosshairVisible(false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    org.jfree.data.xy.OHLCDataItem[] var1 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var2 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var1);
    int var3 = var2.getSeriesCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var6 = var2.getLow(2013, 8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isCounterClockwise();
    var0.setRadiusGridlinesVisible(false);
    int var4 = var0.getDatasetCount();
    boolean var5 = var0.isAngleGridlinesVisible();
    org.jfree.data.xy.CategoryTableXYDataset var7 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.general.DefaultKeyedValues2DDataset var8 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var8.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var13 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var8);
    java.util.List var14 = var8.getColumnKeys();
    org.jfree.data.Range var16 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)var7, var14, true);
    var0.setDataset(15, (org.jfree.data.xy.XYDataset)var7);
    var7.add((java.lang.Number)0.04d, (java.lang.Number)52, "hi!?hi!=100&amp;hi!=1", false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var25 = var7.getX(2013, 15);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    java.lang.Number[][] var0 = new java.lang.Number[][] { };
    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var1);
    int var3 = var2.getRowCount();
    org.jfree.data.xy.OHLCDataItem[] var5 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var6 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var5);
    var2.setSeriesKeys((java.lang.Comparable[])var5);
    java.lang.Object var8 = var2.clone();
    java.util.List var9 = var2.getCategories();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    org.jfree.chart.util.HexNumberFormat var5 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.labels.IntervalCategoryToolTipGenerator var6 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("Combined Range XYPlot", (java.text.NumberFormat)var5);
    var2.setToolTipGenerator((org.jfree.chart.labels.CategoryToolTipGenerator)var6);
    var2.setAutoPopulateSeriesOutlinePaint(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    org.jfree.chart.renderer.xy.XYSplineRenderer var1 = new org.jfree.chart.renderer.xy.XYSplineRenderer(2147483647);
    var1.clearSeriesPaints(false);
    java.lang.Boolean var4 = var1.getShapesVisible();
    java.awt.Shape var5 = var1.getLegendLine();
    boolean var6 = var1.getBaseLinesVisible();
    org.jfree.chart.labels.XYItemLabelGenerator var7 = var1.getBaseItemLabelGenerator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    org.jfree.data.statistics.DefaultStatisticalCategoryDataset var0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    var0.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var4 = var0.getValue(20, 52);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


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
    boolean var21 = var8.isDoubleBuffered();
    javax.swing.JPanel var22 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var23 = var22.getPreferredSize();
    java.awt.image.ColorModel var24 = var22.getColorModel();
    var22.updateUI();
    java.awt.Dimension var26 = var22.getPreferredSize();
    java.awt.Dimension var27 = var8.getSize(var26);
    java.lang.String var28 = var8.toString();
    
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
    assertTrue(var21 == true);
    
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
    assertTrue("'" + var28 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var28,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var28.equals("org.jfree.chart.ChartPanel[,0,0,0var28,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.axis.CyclicNumberAxis var3 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var4 = var3.getTickLabelPaint();
    org.jfree.chart.axis.ValueAxis[] var5 = new org.jfree.chart.axis.ValueAxis[] { var3};
    var0.setRangeAxes(var5);
    var0.setRangeCrosshairValue(1.05d, false);
    var0.setDrawSharedDomainAxis(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    org.jfree.chart.block.BlockContainer var0 = new org.jfree.chart.block.BlockContainer();
    org.jfree.chart.title.TextTitle var2 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var3 = var2.isVisible();
    java.lang.Object var4 = var2.clone();
    java.lang.String var5 = var2.getURLText();
    javax.swing.JPanel var6 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var7 = var6.getPreferredSize();
    java.awt.image.ColorModel var8 = var6.getColorModel();
    var6.updateUI();
    java.lang.String var10 = var6.toString();
    java.awt.Color var11 = var6.getForeground();
    var2.setBackgroundPaint((java.awt.Paint)var11);
    var2.setNotify(false);
    java.lang.String[] var17 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var18 = new org.jfree.chart.axis.SymbolAxis("hi!", var17);
    org.jfree.chart.plot.CompassPlot var19 = new org.jfree.chart.plot.CompassPlot();
    boolean var20 = var18.equals((java.lang.Object)var19);
    java.lang.String var21 = var19.getPlotType();
    java.awt.Paint var22 = var19.getRoseCenterPaint();
    java.awt.Paint var23 = var19.getBackgroundPaint();
    javax.swing.JPanel var24 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var25 = var24.getPreferredSize();
    java.awt.image.ColorModel var26 = var24.getColorModel();
    var24.updateUI();
    java.lang.String var28 = var24.toString();
    boolean var29 = var24.getInheritsPopupMenu();
    javax.swing.InputMap var30 = var24.getInputMap();
    var24.nextFocus();
    boolean var32 = var24.getInheritsPopupMenu();
    javax.swing.JPanel var33 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var34 = var33.getPreferredSize();
    java.awt.image.ColorModel var35 = var33.getColorModel();
    var33.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var40 = var33.getForeground();
    var24.setForeground(var40);
    org.jfree.chart.renderer.xy.XYDifferenceRenderer var43 = new org.jfree.chart.renderer.xy.XYDifferenceRenderer(var23, (java.awt.Paint)var40, true);
    org.jfree.chart.labels.StandardXYSeriesLabelGenerator var44 = new org.jfree.chart.labels.StandardXYSeriesLabelGenerator();
    var43.setLegendItemLabelGenerator((org.jfree.chart.labels.XYSeriesLabelGenerator)var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((org.jfree.chart.block.Block)var2, (java.lang.Object)var43);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var10,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var10.equals("org.jfree.chart.ChartPanel[,0,0,0var10,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Compass Plot"+ "'", var21.equals("Compass Plot"));
    
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
    assertTrue("'" + var28 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var28,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var28.equals("org.jfree.chart.ChartPanel[,0,0,0var28,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    org.jfree.data.time.Second var0 = new org.jfree.data.time.Second();
    org.jfree.data.time.TimeSeries var1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)var0);
    var1.setMaximumItemCount(0);
    org.jfree.data.time.TimeSeries var6 = var1.createCopy(52, 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var2 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    var2.clearDomainMarkers();
    java.awt.Paint var4 = var2.getRangeGridlinePaint();
    org.jfree.chart.plot.dial.StandardDialRange var5 = new org.jfree.chart.plot.dial.StandardDialRange(0.2d, 10.0d, var4);
    org.jfree.chart.plot.CombinedRangeXYPlot var6 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    var6.clearDomainMarkers();
    java.awt.Paint var8 = var6.getRangeGridlinePaint();
    var5.setPaint(var8);
    
    // Checks the contract:  equals-hashcode on var2 and var6
    assertTrue("Contract failed: equals-hashcode on var2 and var6", var2.equals(var6) ? var2.hashCode() == var6.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var6 and var2
    assertTrue("Contract failed: equals-hashcode on var6 and var2", var6.equals(var2) ? var6.hashCode() == var2.hashCode() : true);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    org.jfree.data.contour.NonGridContourDataset var0 = new org.jfree.data.contour.NonGridContourDataset();
    int[] var1 = var0.getXIndices();
    double var2 = var0.getMaxZValue();

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    org.jfree.data.function.LineFunction2D var2 = new org.jfree.data.function.LineFunction2D(0.05d, 10.0d);
    double var4 = var2.getValue(0.0d);
    org.jfree.data.general.DefaultKeyedValueDataset var5 = new org.jfree.data.general.DefaultKeyedValueDataset();
    org.jfree.data.general.DatasetGroup var6 = var5.getGroup();
    boolean var7 = var2.equals((java.lang.Object)var5);
    double var9 = var2.getValue(0.02d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.25d);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.Object var3 = var2.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYDataItem var5 = var2.remove((java.lang.Number)0.25d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    org.jfree.chart.renderer.category.DefaultCategoryItemRenderer var0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
    var0.setBaseShapesFilled(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesShapesFilled(2147483647, true);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    java.lang.Number[][] var0 = new java.lang.Number[][] { };
    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var1);
    int var3 = var2.getRowCount();
    org.jfree.data.xy.OHLCDataItem[] var5 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var6 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var5);
    var2.setSeriesKeys((java.lang.Comparable[])var5);
    int var9 = var2.getSeriesIndex((java.lang.Comparable)"Compass Plot");
    int var10 = var2.getRowCount();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var0 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer();
    var0.setUseYInterval(false);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var0 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    boolean var1 = var0.isOutline();
    java.awt.Stroke var2 = var0.getShapeStroke();
    java.lang.Object var3 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.jdbc.JDBCCategoryDataset var4 = new org.jfree.data.jdbc.JDBCCategoryDataset("0x00000000", "0x00000001", "jfreechart-onetime-", "0x00000000");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    java.util.Locale var4 = var2.getLocale();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var6 = var5.getPreferredSize();
    java.awt.Dimension var7 = var2.getSize(var6);
    java.awt.event.ContainerListener[] var8 = var2.getContainerListeners();
    javax.swing.JPanel var9 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var10 = var9.getPreferredSize();
    java.awt.image.ColorModel var11 = var9.getColorModel();
    var9.updateUI();
    java.lang.String var13 = var9.toString();
    java.awt.Color var14 = var9.getForeground();
    var2.setBackground(var14);
    int var16 = var14.getRGB();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var13,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var13.equals("org.jfree.chart.ChartPanel[,0,0,0var13,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-13421773));

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    org.jfree.chart.title.TextTitle var1 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var2 = var1.isVisible();
    java.lang.Object var3 = var1.clone();
    java.lang.String var4 = var1.getID();
    java.awt.Paint var5 = var1.getBackgroundPaint();
    var1.setURLText("Range[1.0,1.0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    org.jfree.chart.axis.SubCategoryAxis var1 = new org.jfree.chart.axis.SubCategoryAxis("hi!?hi!=100&amp;amp;hi!=1");

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    java.lang.Number[][] var2 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var1, var2);
    int var4 = var3.getRowCount();
    org.jfree.data.xy.OHLCDataItem[] var6 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var7 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var6);
    var3.setSeriesKeys((java.lang.Comparable[])var6);
    org.jfree.data.xy.DefaultOHLCDataset var9 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)"d", var6);
    org.jfree.chart.renderer.xy.StackedXYBarRenderer var10 = new org.jfree.chart.renderer.xy.StackedXYBarRenderer();
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var12 = var11.getPreferredSize();
    java.awt.image.ColorModel var13 = var11.getColorModel();
    var11.updateUI();
    java.lang.String var15 = var11.toString();
    var11.setFocusable(true);
    boolean var18 = var10.equals((java.lang.Object)var11);
    boolean var19 = var9.equals((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var15,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var15.equals("org.jfree.chart.ChartPanel[,0,0,0var15,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    org.jfree.data.time.Second var0 = new org.jfree.data.time.Second();
    org.jfree.data.time.TimeSeries var1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)var0);
    org.jfree.data.time.Year var5 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var6 = new org.jfree.data.time.Month(1, var5);
    org.jfree.data.time.RegularTimePeriod var7 = var6.previous();
    long var8 = var6.getSerialIndex();
    org.jfree.data.time.TimeTableXYDataset var9 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var11 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var12 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var11);
    var9.remove((org.jfree.data.time.TimePeriod)var11, (java.lang.Comparable)100, false);
    org.jfree.chart.axis.PeriodAxis var16 = new org.jfree.chart.axis.PeriodAxis("Compass Plot", (org.jfree.data.time.RegularTimePeriod)var6, (org.jfree.data.time.RegularTimePeriod)var11);
    var16.setMinorTickMarksVisible(false);
    org.jfree.data.time.Year var20 = new org.jfree.data.time.Year(100);
    org.jfree.chart.plot.CombinedDomainCategoryPlot var21 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    int var22 = var20.compareTo((java.lang.Object)var21);
    var16.setFirst((org.jfree.data.time.RegularTimePeriod)var20);
    java.lang.String var24 = var20.toString();
    var1.add((org.jfree.data.time.RegularTimePeriod)var20, (java.lang.Number)(short)(-1));
    var1.setDomainDescription("[size=0x00000000]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setMaximumItemCount((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1201L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "100"+ "'", var24.equals("100"));

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    org.jfree.chart.needle.LongNeedle var0 = new org.jfree.chart.needle.LongNeedle();
    org.jfree.chart.encoders.EncoderUtil var1 = new org.jfree.chart.encoders.EncoderUtil();
    boolean var2 = var0.equals((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var7 = var0.getForeground();
    java.awt.Component[] var8 = var0.getComponents();
    
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

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


    org.jfree.data.DefaultKeyedValues var0 = new org.jfree.data.DefaultKeyedValues();
    var0.setValue((java.lang.Comparable)4.0d, (-0.7853981633974483d));
    var0.setValue((java.lang.Comparable)10.0f, (java.lang.Number)1.05d);
    org.jfree.data.time.Year var9 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var10 = new org.jfree.data.time.Month(1, var9);
    org.jfree.chart.util.HexNumberFormat var12 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var13 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var14 = var13.getPreferredSize();
    javax.swing.JPanel var15 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var13.setNextFocusableComponent((java.awt.Component)var15);
    java.util.Locale var17 = var15.getLocale();
    org.jfree.chart.axis.MonthDateFormat var18 = new org.jfree.chart.axis.MonthDateFormat(var17);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var19 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var12, (java.text.DateFormat)var18);
    boolean var20 = var9.equals((java.lang.Object)var18);
    long var21 = var9.getSerialIndex();
    var0.addValue((java.lang.Comparable)var21, (-90.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.axis.CategoryAxis var1 = var0.getDomainAxis();
    var0.clearRangeMarkers(2013);
    boolean var4 = var0.isDomainPannable();
    org.jfree.chart.axis.CyclicNumberAxis var8 = new org.jfree.chart.axis.CyclicNumberAxis(1.0d, "jfreechart-onetime-");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeAxis(2147483647, (org.jfree.chart.axis.ValueAxis)var8, false);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    org.jfree.chart.renderer.category.ScatterRenderer var0 = new org.jfree.chart.renderer.category.ScatterRenderer();
    var0.setUseFillPaint(true);
    org.jfree.chart.event.ChartChangeEvent var3 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)true);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    org.jfree.data.function.PowerFunction2D var2 = new org.jfree.data.function.PowerFunction2D(2.0d, 1.0d);
    org.jfree.chart.axis.CyclicNumberAxis var6 = new org.jfree.chart.axis.CyclicNumberAxis(1.0d, 4.0d, "");
    var6.setInverted(true);
    boolean var9 = var2.equals((java.lang.Object)var6);
    double var10 = var2.getA();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2.0d);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    org.jfree.data.xy.DefaultXYZDataset var0 = new org.jfree.data.xy.DefaultXYZDataset();
    org.jfree.data.DomainOrder var1 = var0.getDomainOrder();
    int var3 = var0.indexOf((java.lang.Comparable)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    org.jfree.chart.renderer.category.BarRenderer.setDefaultShadowsVisible(false);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    java.util.Locale var4 = var2.getLocale();
    org.jfree.chart.axis.TickUnitSource var5 = org.jfree.chart.axis.LogAxis.createLogTickUnits(var4);
    java.text.NumberFormat var6 = java.text.NumberFormat.getPercentInstance(var4);
    java.text.NumberFormat var7 = java.text.NumberFormat.getInstance(var4);
    org.jfree.chart.axis.TickUnitSource var8 = org.jfree.chart.axis.LogAxis.createLogTickUnits(var4);
    
    // Checks the contract:  equals-hashcode on var5 and var8
    assertTrue("Contract failed: equals-hashcode on var5 and var8", var5.equals(var8) ? var5.hashCode() == var8.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var8 and var5
    assertTrue("Contract failed: equals-hashcode on var8 and var5", var8.equals(var5) ? var8.hashCode() == var5.hashCode() : true);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    org.jfree.chart.renderer.xy.XYShapeRenderer var0 = new org.jfree.chart.renderer.xy.XYShapeRenderer();
    var0.setGuideLinesVisible(true);
    boolean var3 = var0.getDrawOutlines();
    org.jfree.chart.renderer.xy.XYBlockRenderer var5 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var6 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var7 = var5.findDomainBounds((org.jfree.data.xy.XYDataset)var6);
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    double var12 = var10.getItemLabelAnchorOffset();
    org.jfree.chart.labels.ItemLabelPosition var15 = var10.getNegativeItemLabelPosition(0, 0);
    double var16 = var15.getAngle();
    var5.setNegativeItemLabelPosition(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesNegativeItemLabelPosition(1043495433, var15, false);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    org.jfree.chart.servlet.ServletUtilities.setTempFilePrefix("[size=0x00000000]");

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    org.jfree.data.general.SeriesException var1 = new org.jfree.data.general.SeriesException("hi!?hi!=100&amp;hi!=1");

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    var0.addCornerTextItem("0x00000001");
    var0.removeCornerTextItem("Combined Range XYPlot");

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    org.jfree.data.DefaultKeyedValues var0 = new org.jfree.data.DefaultKeyedValues();
    var0.addValue((java.lang.Comparable)100.0f, (java.lang.Number)2.0f);
    java.lang.Object var4 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    org.jfree.chart.plot.CompassPlot var0 = new org.jfree.chart.plot.CompassPlot();
    var0.setDrawBorder(true);
    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var4 = var3.getBaseItemLabelsVisible();
    var3.setSeriesShapesFilled(1, (java.lang.Boolean)false);
    var3.setDrawOutlines(true);
    org.jfree.chart.renderer.category.BarRenderer3D var12 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var13 = var12.getItemLabelFont();
    double var14 = var12.getItemLabelAnchorOffset();
    java.awt.Shape var16 = var12.getSeriesShape(1);
    org.jfree.chart.renderer.category.BarRenderer3D var20 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var21 = var20.getItemLabelFont();
    double var22 = var20.getItemLabelAnchorOffset();
    org.jfree.chart.axis.CyclicNumberAxis var26 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var27 = var26.getTickLabelPaint();
    var20.setLegendTextPaint(0, var27);
    var12.setSeriesFillPaint(100, var27, true);
    var3.setBaseOutlinePaint(var27, false);
    var0.setRoseHighlightPaint(var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setLabelType(2013);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.lang.Comparable var1 = var0.getDomainCrosshairColumnKey();
    var0.setCrosshairDatasetIndex(100);
    org.jfree.chart.plot.CombinedRangeXYPlot var4 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var5 = var4.getRangeZeroBaselineStroke();
    org.jfree.chart.title.TextTitle var7 = new org.jfree.chart.title.TextTitle("hi!");
    org.jfree.ui.RectangleInsets var8 = var7.getMargin();
    var4.setAxisOffset(var8);
    var0.setAxisOffset(var8);
    org.jfree.data.category.CategoryDataset var12 = var0.getDataset((-2));
    org.jfree.chart.LegendItemCollection var13 = var0.getLegendItems();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var15 = var13.get(20);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    int var2 = var0.getColumnIndex((java.lang.Comparable)'#');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.getObject((java.lang.Comparable)false, (java.lang.Comparable)"RectangleConstraint[LengthConstraintType.FIXED: width=0.04, height=0.0]");
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.Object var3 = var2.clone();
    var2.add((-0.21460183660255172d), (java.lang.Number)15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    java.text.DateFormat var2 = java.text.DateFormat.getTimeInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.DateTickUnit var3 = new org.jfree.chart.axis.DateTickUnit((-13421773), 2147483647, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    org.jfree.data.contour.NonGridContourDataset var0 = new org.jfree.data.contour.NonGridContourDataset();
    int[] var1 = var0.getXIndices();
    org.jfree.data.Range var3 = org.jfree.data.general.DatasetUtilities.findZBounds((org.jfree.data.xy.XYZDataset)var0, false);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    org.jfree.data.time.TimeTableXYDataset var0 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    var0.remove((org.jfree.data.time.TimePeriod)var2, (java.lang.Comparable)100, false);
    org.jfree.data.xy.XYBarDataset var8 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var0, Double.NaN);
    int var10 = var8.getItemCount((-2));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var8.getStartYValue(1043495433, 51);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    org.jfree.data.xy.XYIntervalSeriesCollection var0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.xy.XYBarDataset var2 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var0, 10.0d);
    org.jfree.chart.plot.CombinedRangeXYPlot var3 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var4 = var3.getRangeZeroBaselineStroke();
    java.lang.String var5 = var3.getPlotType();
    boolean var6 = var0.hasListener((java.util.EventListener)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.getYValue(1043495433, (-13421773));
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

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


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
    int var13 = var11.getDatasetCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


    org.jfree.chart.renderer.xy.XYDotRenderer var0 = new org.jfree.chart.renderer.xy.XYDotRenderer();
    org.jfree.chart.needle.LineNeedle var1 = new org.jfree.chart.needle.LineNeedle();
    java.awt.Stroke var2 = var1.getOutlineStroke();
    boolean var3 = var0.equals((java.lang.Object)var1);
    org.jfree.chart.LegendItem var6 = var0.getLegendItem(10, (-1));
    org.jfree.chart.needle.LineNeedle var7 = new org.jfree.chart.needle.LineNeedle();
    java.awt.Stroke var8 = var7.getOutlineStroke();
    var0.setOutlineStroke(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    int var2 = var0.getColumnIndex((java.lang.Comparable)'#');
    int var3 = var0.getColumnCount();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    org.jfree.chart.util.HexNumberFormat var2 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.labels.StandardCrosshairLabelGenerator var3 = new org.jfree.chart.labels.StandardCrosshairLabelGenerator("", (java.text.NumberFormat)var2);
    boolean var4 = var2.isParseIntegerOnly();
    org.jfree.chart.labels.IntervalCategoryItemLabelGenerator var5 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator("Compass Plot", (java.text.NumberFormat)var2);
    java.lang.Object var6 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    org.jfree.data.xy.CategoryTableXYDataset var0 = new org.jfree.data.xy.CategoryTableXYDataset();
    var0.add(3.0d, (-90.0d), "hi!?hi!=100&amp;amp;hi!=1");
    var0.remove((java.lang.Number)10.0d, "TimePeriodValue[Week 37, 2013,10]", true);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    org.jfree.chart.entity.StandardEntityCollection var0 = new org.jfree.chart.entity.StandardEntityCollection();
    org.jfree.chart.entity.ChartEntity var3 = var0.getEntity(0.0d, 2.0d);
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


    org.jfree.data.Range var2 = new org.jfree.data.Range((-1.0d), 0.0d);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var2 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var1);
    org.jfree.data.time.TimePeriodValue var4 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var1, (java.lang.Number)10);
    org.jfree.data.time.ohlc.OHLCItem var9 = new org.jfree.data.time.ohlc.OHLCItem((org.jfree.data.time.RegularTimePeriod)var1, 100.0d, 0.0d, 0.05d, 0.0d);
    org.jfree.chart.plot.XYPlot var10 = new org.jfree.chart.plot.XYPlot();
    java.lang.Object var11 = var10.clone();
    org.jfree.data.ComparableObjectItem var12 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable)var9, (java.lang.Object)var10);
    org.jfree.data.ComparableObjectSeries var15 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable)var12, false, false);
    boolean var16 = var15.getAllowDuplicateXValues();
    var15.setDescription("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.updateUI();
    java.awt.Dimension var4 = var0.getPreferredSize();
    boolean var5 = var0.isForegroundSet();
    java.lang.Object var6 = var0.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isCounterClockwise();
    var0.setRadiusGridlinesVisible(false);
    int var4 = var0.getDatasetCount();
    int var5 = var0.getAxisCount();
    org.jfree.chart.axis.ValueAxis var7 = var0.getAxisForDataset(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    org.jfree.chart.plot.dial.StandardDialScale var0 = new org.jfree.chart.plot.dial.StandardDialScale();
    var0.setMajorTickIncrement(10.0d);
    org.jfree.chart.plot.dial.DialPlot var3 = new org.jfree.chart.plot.dial.DialPlot();
    var3.setView(0.2d, 4.0d, 10.0d, 10.0d);
    var3.mapDatasetToScale(2013, 100);
    var0.addChangeListener((org.jfree.chart.plot.dial.DialLayerChangeListener)var3);
    org.jfree.chart.renderer.category.BarRenderer3D var15 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var16 = var15.getItemLabelFont();
    double var17 = var15.getItemLabelAnchorOffset();
    java.lang.String[] var21 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var22 = new org.jfree.chart.axis.SymbolAxis("hi!", var21);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var23 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var25 = var23.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var28 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var29 = var28.getTickLabelPaint();
    var23.setFillPaint(var29, true);
    var22.setGridBandAlternatePaint(var29);
    var15.setSeriesFillPaint(2013, var29, false);
    org.jfree.chart.renderer.category.StackedAreaRenderer var36 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.LegendItem var39 = var36.getLegendItem((-1), (-1));
    java.awt.Paint var40 = var36.getBaseOutlinePaint();
    var15.setShadowPaint(var40);
    var0.setTickLabelPaint(var40);
    int var43 = var0.getMinorTickCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 4);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


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
    org.jfree.chart.axis.CyclicNumberAxis var19 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var20 = var19.isAxisLineVisible();
    var19.setAxisLineVisible(true);
    var19.setMinorTickMarksVisible(true);
    var0.setRangeAxis((org.jfree.chart.axis.ValueAxis)var19);
    org.jfree.chart.plot.CombinedRangeXYPlot var26 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var19);
    
    // Checks the contract:  equals-hashcode on var0 and var26
    assertTrue("Contract failed: equals-hashcode on var0 and var26", var0.equals(var26) ? var0.hashCode() == var26.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var26 and var0
    assertTrue("Contract failed: equals-hashcode on var26 and var0", var26.equals(var0) ? var26.hashCode() == var0.hashCode() : true);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    org.jfree.chart.axis.SubCategoryAxis var1 = new org.jfree.chart.axis.SubCategoryAxis("Combined Range XYPlot");
    double var2 = var1.getUpperMargin();
    var1.setVisible(false);
    float var5 = var1.getMinorTickMarkOutsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2.0f);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }


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
    org.jfree.chart.event.RendererChangeEvent var38 = new org.jfree.chart.event.RendererChangeEvent((java.lang.Object)var19, false);
    java.lang.Object var39 = var19.clone();
    
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
    assertNotNull(var39);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    org.jfree.chart.renderer.xy.XYBarRenderer var1 = new org.jfree.chart.renderer.xy.XYBarRenderer(100.0d);
    boolean var2 = var1.getShadowsVisible();
    boolean var3 = var1.getUseYInterval();
    boolean var4 = var1.getAutoPopulateSeriesShape();
    org.jfree.chart.LegendItem var7 = var1.getLegendItem(2, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


    org.jfree.chart.renderer.xy.DefaultXYItemRenderer var0 = new org.jfree.chart.renderer.xy.DefaultXYItemRenderer();
    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var1 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var2 = var1.clone();
    var0.setBaseToolTipGenerator((org.jfree.chart.labels.XYToolTipGenerator)var1);
    java.lang.Boolean var5 = var0.getSeriesShapesFilled(1043495433);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.RoundingMode var20 = var11.getRoundingMode();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    org.jfree.chart.util.PaintAlpha var0 = new org.jfree.chart.util.PaintAlpha();

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    org.jfree.data.xy.CategoryTableXYDataset var0 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.general.DefaultKeyedValues2DDataset var1 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var1.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var6 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var1);
    java.util.List var7 = var1.getColumnKeys();
    org.jfree.data.Range var9 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)var0, var7, true);
    double var11 = var0.getDomainLowerBound(true);
    var0.validateObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == Double.NaN);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }


    org.jfree.chart.util.RelativeDateFormat var1 = new org.jfree.chart.util.RelativeDateFormat();
    boolean var2 = var1.getShowZeroHours();
    var1.setPositivePrefix("d");
    org.jfree.chart.util.HexNumberFormat var6 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.labels.StandardCrosshairLabelGenerator var7 = new org.jfree.chart.labels.StandardCrosshairLabelGenerator("", (java.text.NumberFormat)var6);
    org.jfree.chart.labels.StandardXYItemLabelGenerator var8 = new org.jfree.chart.labels.StandardXYItemLabelGenerator("Range[0.0,0.0]", (java.text.DateFormat)var1, (java.text.NumberFormat)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var1 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var2 = var0.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var1);
    org.jfree.chart.plot.dial.DialValueIndicator var3 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var4 = var3.getInsets();
    int var5 = var0.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var3);
    org.jfree.chart.plot.dial.DialValueIndicator var6 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var7 = var6.getInsets();
    java.awt.Stroke var8 = var6.getOutlineStroke();
    var0.setCap((org.jfree.chart.plot.dial.DialLayer)var6);
    var6.setTemplateValue((java.lang.Number)1378623600000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    org.jfree.data.time.TimeTableXYDataset var0 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    var0.remove((org.jfree.data.time.TimePeriod)var2, (java.lang.Comparable)100, false);
    org.jfree.data.xy.XYBarDataset var8 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var0, Double.NaN);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var11 = var0.getStartX(4, 20);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


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
    boolean var27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var20.removeRow(8);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var27 == true);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    org.jfree.chart.axis.SubCategoryAxis var1 = new org.jfree.chart.axis.SubCategoryAxis("Compass Plot");
    var1.configure();
    double var3 = var1.getLowerMargin();
    org.jfree.chart.axis.CategoryLabelPositions var5 = org.jfree.chart.axis.CategoryLabelPositions.createDownRotationLabelPositions((-1.0d));
    var1.setCategoryLabelPositions(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    org.jfree.chart.axis.SubCategoryAxis var1 = new org.jfree.chart.axis.SubCategoryAxis("Compass Plot");
    var1.configure();
    double var3 = var1.getFixedDimension();
    org.jfree.data.xml.RootHandler var5 = new org.jfree.data.xml.RootHandler();
    var5.endElement("", "hi!", "hi!");
    var5.endDocument();
    java.util.Stack var11 = var5.getSubHandlers();
    java.util.Stack var12 = var5.getSubHandlers();
    javax.swing.JPanel var13 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var14 = var13.getLocation();
    org.jfree.chart.plot.PolarPlot var15 = new org.jfree.chart.plot.PolarPlot();
    boolean var16 = var15.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var21 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var21.setUpperMargin(10.0d);
    var21.setAxisLineVisible(true);
    javax.swing.JPanel var26 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var27 = var26.getLocation();
    java.awt.Dimension var28 = var26.preferredSize();
    java.awt.Rectangle var29 = var26.bounds();
    java.awt.Point var30 = var15.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var21, (java.awt.geom.Rectangle2D)var29);
    java.awt.Rectangle var31 = var13.getBounds(var29);
    org.jfree.chart.axis.CategoryLabelPositions var33 = org.jfree.chart.axis.CategoryLabelPositions.createDownRotationLabelPositions((-1.0d));
    org.jfree.chart.plot.CategoryPlot var34 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var36 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var37 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var36);
    org.jfree.data.time.TimePeriodValue var39 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var36, (java.lang.Number)10);
    var34.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var41 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var43 = var41.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var46 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var47 = var46.getTickLabelPaint();
    var41.setFillPaint(var47, true);
    var34.setDomainCrosshairPaint(var47);
    boolean var51 = var33.equals((java.lang.Object)var34);
    org.jfree.ui.RectangleEdge var52 = var34.getRangeAxisEdge();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var53 = var1.getCategoryMiddle((java.lang.Comparable)1378623600000L, (java.util.List)var12, (java.awt.geom.Rectangle2D)var29, var52);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    org.jfree.chart.renderer.xy.XYBlockRenderer var0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var1 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var2 = var0.findDomainBounds((org.jfree.data.xy.XYDataset)var1);
    java.lang.Number var3 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset)var1);
    var1.add(100.0d, Double.NaN, "jfreechart-onetime-");
    var1.clear();
    int var10 = var1.getItemCount(8);
    org.jfree.data.xy.XYSeries var15 = org.jfree.data.time.MovingAverage.createMovingAverage((org.jfree.data.xy.XYDataset)var1, 2013, "hi!?hi!=100&amp;hi!=1", 0.3d, 1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var18 = var1.getXValue(10, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + Double.NaN+ "'", var3.equals(Double.NaN));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var3 = var2.isAxisLineVisible();
    var2.setAxisLineVisible(true);
    org.jfree.data.general.DefaultKeyedValues2DDataset var6 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var6.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var11 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var6);
    var2.setDefaultAutoRange(var11);
    org.jfree.data.Range var13 = var2.getRange();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var15 = org.jfree.data.Range.scale(var13, (-0.7853981633974483d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    org.jfree.data.time.MovingAverage var0 = new org.jfree.data.time.MovingAverage();

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var2 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.LegendItem var5 = var2.getLegendItem(1, 0);
    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var6 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    var2.setBaseToolTipGenerator((org.jfree.chart.labels.XYToolTipGenerator)var6);
    org.jfree.chart.renderer.xy.CandlestickRenderer var8 = new org.jfree.chart.renderer.xy.CandlestickRenderer(0.75d, false, (org.jfree.chart.labels.XYToolTipGenerator)var6);
    boolean var9 = var8.getUseOutlinePaint();
    org.jfree.chart.annotations.XYPointerAnnotation var14 = new org.jfree.chart.annotations.XYPointerAnnotation("-4,-4,4,4", (-0.7853981633974483d), (-90.0d), 0.05d);
    org.jfree.chart.plot.CombinedRangeXYPlot var15 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    org.jfree.chart.annotations.XYPointerAnnotation var20 = new org.jfree.chart.annotations.XYPointerAnnotation("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (-1.0d), 0.2d, 4.0d);
    double var21 = var20.getLabelOffset();
    org.jfree.ui.TextAnchor var22 = var20.getRotationAnchor();
    boolean var23 = var15.removeAnnotation((org.jfree.chart.annotations.XYAnnotation)var20);
    org.jfree.chart.StandardChartTheme var26 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var27 = var26.getLegendItemPaint();
    java.awt.Paint var28 = var26.getSubtitlePaint();
    java.awt.Font var29 = var26.getLargeFont();
    var20.setFont(var29);
    var14.setFont(var29);
    double var32 = var14.getX();
    var8.addAnnotation((org.jfree.chart.annotations.XYAnnotation)var14);
    var14.setBaseRadius(4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-0.7853981633974483d));

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


    org.jfree.chart.urls.CustomCategoryURLGenerator var0 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var0.getURLCount(20);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }


    org.jfree.chart.renderer.category.GradientBarPainter var0 = new org.jfree.chart.renderer.category.GradientBarPainter();

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    org.jfree.chart.renderer.category.CategoryStepRenderer var0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
    var0.clearSeriesPaints(false);
    org.jfree.chart.plot.Crosshair var3 = new org.jfree.chart.plot.Crosshair();
    java.awt.Paint var4 = var3.getLabelPaint();
    boolean var5 = var0.equals((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


    org.jfree.chart.plot.ContourPlot var0 = new org.jfree.chart.plot.ContourPlot();
    org.jfree.chart.plot.CategoryMarker var2 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    var0.addRangeMarker((org.jfree.chart.plot.Marker)var2);
    org.jfree.chart.urls.StandardXYURLGenerator var7 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    org.jfree.data.statistics.SimpleHistogramDataset var9 = new org.jfree.data.statistics.SimpleHistogramDataset((java.lang.Comparable)100.0f);
    var9.removeAllBins();
    java.lang.String var13 = var7.generateURL((org.jfree.data.xy.XYDataset)var9, 100, 1);
    var0.setURLGenerator((org.jfree.chart.urls.XYURLGenerator)var7);
    var0.zoom(3.0d);
    org.jfree.chart.plot.CombinedRangeXYPlot var17 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var18 = var17.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CombinedRangeXYPlot var19 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var20 = var19.getRangeZeroBaselineStroke();
    var17.setRangeGridlineStroke(var20);
    var17.setDomainMinorGridlinesVisible(true);
    org.jfree.chart.renderer.xy.XYItemRenderer var24 = var17.getRenderer();
    var0.removeChangeListener((org.jfree.chart.event.PlotChangeListener)var17);
    boolean var26 = var17.isRangeCrosshairVisible();
    java.awt.Stroke var27 = var17.getDomainCrosshairStroke();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!?hi!=100&amp;hi!=1"+ "'", var13.equals("hi!?hi!=100&amp;hi!=1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    org.jfree.data.statistics.SimpleHistogramDataset var1 = new org.jfree.data.statistics.SimpleHistogramDataset((java.lang.Comparable)100.0f);
    var1.removeAllBins();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var1.getYValue(15, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }


    org.jfree.chart.axis.CyclicNumberAxis var1 = new org.jfree.chart.axis.CyclicNumberAxis(2.0d);
    org.jfree.chart.axis.NumberTickUnit var2 = var1.getTickUnit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ResourceBundle var1 = java.util.ResourceBundle.getBundle("[Dec 31, 1969 4:00:00 PM --> Dec 31, 1969 4:00:00 PM]");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    org.jfree.chart.renderer.category.BarRenderer3D var4 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var5 = var4.getItemLabelFont();
    double var6 = var4.getItemLabelAnchorOffset();
    org.jfree.chart.labels.ItemLabelPosition var9 = var4.getNegativeItemLabelPosition(0, 0);
    double var10 = var9.getAngle();
    org.jfree.ui.TextAnchor var11 = var9.getTextAnchor();
    org.jfree.chart.plot.dial.DialValueIndicator var12 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var13 = var12.getInsets();
    java.awt.Stroke var14 = var12.getOutlineStroke();
    javax.swing.JPanel var15 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var16 = var15.getPreferredSize();
    javax.swing.JPanel var17 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var15.setNextFocusableComponent((java.awt.Component)var17);
    java.util.Locale var19 = var17.getLocale();
    javax.swing.JPanel var20 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var21 = var20.getPreferredSize();
    java.awt.Dimension var22 = var17.getSize(var21);
    java.awt.event.ContainerListener[] var23 = var17.getContainerListeners();
    javax.swing.JPanel var24 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var25 = var24.getPreferredSize();
    java.awt.image.ColorModel var26 = var24.getColorModel();
    var24.updateUI();
    java.lang.String var28 = var24.toString();
    java.awt.Color var29 = var24.getForeground();
    var17.setBackground(var29);
    var12.setOutlinePaint((java.awt.Paint)var29);
    boolean var32 = var12.isClippedToWindow();
    org.jfree.ui.TextAnchor var33 = var12.getTextAnchor();
    org.jfree.chart.axis.NumberTick var35 = new org.jfree.chart.axis.NumberTick((java.lang.Number)(short)0, "jfreechart-onetime-", var11, var33, 1.0d);
    double var36 = var35.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
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
    assertNotNull(var17);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var28,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var28.equals("org.jfree.chart.ChartPanel[,0,0,0var28,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


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
    org.jfree.ui.RectangleEdge var20 = var2.getRangeAxisEdge();
    org.jfree.chart.axis.SubCategoryAxis var22 = new org.jfree.chart.axis.SubCategoryAxis("Compass Plot");
    int var23 = var2.getDomainAxisIndex((org.jfree.chart.axis.CategoryAxis)var22);
    org.jfree.chart.plot.ContourPlot var24 = new org.jfree.chart.plot.ContourPlot();
    var24.setOutlineVisible(false);
    var24.setRangeCrosshairValue(0.04d, false);
    org.jfree.data.time.Year var33 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var34 = new org.jfree.data.time.Month(1, var33);
    org.jfree.data.time.RegularTimePeriod var35 = var34.previous();
    long var36 = var34.getSerialIndex();
    org.jfree.data.time.TimeTableXYDataset var37 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var39 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var40 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var39);
    var37.remove((org.jfree.data.time.TimePeriod)var39, (java.lang.Comparable)100, false);
    org.jfree.chart.axis.PeriodAxis var44 = new org.jfree.chart.axis.PeriodAxis("Compass Plot", (org.jfree.data.time.RegularTimePeriod)var34, (org.jfree.data.time.RegularTimePeriod)var39);
    var44.setMinorTickMarksVisible(false);
    java.awt.Stroke var47 = var44.getMinorTickMarkStroke();
    var24.setDomainCrosshairStroke(var47);
    var2.setDomainCrosshairStroke(var47);
    
    // Checks the contract:  equals-hashcode on var5 and var40
    assertTrue("Contract failed: equals-hashcode on var5 and var40", var5.equals(var40) ? var5.hashCode() == var40.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var40 and var5
    assertTrue("Contract failed: equals-hashcode on var40 and var5", var40.equals(var5) ? var40.hashCode() == var5.hashCode() : true);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    org.jfree.chart.labels.HighLowItemLabelGenerator var0 = new org.jfree.chart.labels.HighLowItemLabelGenerator();
    org.jfree.data.time.TimeTableXYDataset var1 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var4 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var3);
    var1.remove((org.jfree.data.time.TimePeriod)var3, (java.lang.Comparable)100, false);
    org.jfree.data.xy.XYBarDataset var9 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var1, Double.NaN);
    boolean var10 = var1.getDomainIsPointsInTime();
    java.lang.String var13 = var0.generateToolTip((org.jfree.data.xy.XYDataset)var1, 52, 1043495433);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var16 = var1.getX(2147483647, 4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var2 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.LegendItem var5 = var2.getLegendItem(1, 0);
    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var6 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    var2.setBaseToolTipGenerator((org.jfree.chart.labels.XYToolTipGenerator)var6);
    org.jfree.chart.renderer.xy.CandlestickRenderer var8 = new org.jfree.chart.renderer.xy.CandlestickRenderer(0.75d, false, (org.jfree.chart.labels.XYToolTipGenerator)var6);
    boolean var9 = var8.getUseOutlinePaint();
    int var10 = var8.getAutoWidthMethod();
    double var11 = var8.getCandleWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.75d);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }


    org.jfree.chart.renderer.xy.XYBlockRenderer var0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.chart.renderer.PaintScale var1 = var0.getPaintScale();
    org.jfree.chart.renderer.PaintScale var2 = var0.getPaintScale();
    boolean var3 = var0.getDataBoundsIncludesVisibleSeriesOnly();
    org.jfree.ui.RectangleAnchor var4 = var0.getBlockAnchor();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var7 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    double var12 = var10.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var15 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var16 = var15.getItemLabelFont();
    java.awt.Shape var17 = var15.getBaseLegendShape();
    var10.setShape(var17);
    var7.setLegendBar(var17);
    var7.setDrawBarOutline(true);
    org.jfree.data.xy.CategoryTableXYDataset var22 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var23 = var7.findDomainBounds((org.jfree.data.xy.XYDataset)var22);
    org.jfree.data.xy.XYIntervalSeriesCollection var24 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.xy.XYBarDataset var26 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var24, 10.0d);
    var26.setBarWidth(2.0d);
    org.jfree.chart.axis.AxisCollection var29 = new org.jfree.chart.axis.AxisCollection();
    java.util.List var30 = var29.getAxesAtLeft();
    org.jfree.data.general.DefaultKeyedValues2DDataset var31 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var31.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var36 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var31);
    org.jfree.data.Range var38 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds((org.jfree.data.category.CategoryDataset)var31, true);
    org.jfree.data.Range var40 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds((org.jfree.data.xy.XYDataset)var26, var30, var38, true);
    org.jfree.data.Range var42 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)var22, var30, true);
    java.lang.Number var43 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset)var22);
    org.jfree.data.Range var44 = var0.findRangeBounds((org.jfree.data.xy.XYDataset)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var47 = var22.getStartY(51, 51);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
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
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + Double.NaN+ "'", var43.equals(Double.NaN));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    org.jfree.chart.renderer.xy.StackedXYBarRenderer var0 = new org.jfree.chart.renderer.xy.StackedXYBarRenderer();
    javax.swing.JPanel var1 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var2 = var1.getPreferredSize();
    java.awt.image.ColorModel var3 = var1.getColorModel();
    var1.updateUI();
    java.lang.String var5 = var1.toString();
    var1.setFocusable(true);
    boolean var8 = var0.equals((java.lang.Object)var1);
    org.jfree.chart.needle.PinNeedle var9 = new org.jfree.chart.needle.PinNeedle();
    org.jfree.chart.plot.CategoryPlot var10 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.plot.CategoryMarker var12 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var13 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var15 = var13.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var18 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var19 = var18.getTickLabelPaint();
    var13.setFillPaint(var19, true);
    var12.setLabelPaint(var19);
    var10.setDomainGridlinePaint(var19);
    var9.setHighlightPaint(var19);
    boolean var25 = var0.equals((java.lang.Object)var19);
    boolean var26 = var0.getRenderAsPercentages();
    
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    org.jfree.chart.plot.CombinedDomainCategoryPlot var8 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    java.util.List var9 = var8.getSubplots();
    org.jfree.data.statistics.BoxAndWhiskerItem var10 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)100.0d, (java.lang.Number)0.3d, (java.lang.Number)2.0d, (java.lang.Number)2, (java.lang.Number)(short)10, (java.lang.Number)10.0f, (java.lang.Number)15, (java.lang.Number)2.0d, var9);
    java.util.List var11 = var10.getOutliers();
    java.lang.Number var12 = var10.getMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 100.0d+ "'", var12.equals(100.0d));

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


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
    org.jfree.data.xy.CategoryTableXYDataset var14 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.general.DefaultKeyedValues2DDataset var15 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var15.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var15);
    java.util.List var21 = var15.getColumnKeys();
    org.jfree.data.Range var23 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)var14, var21, true);
    double var25 = var14.getDomainLowerBound(true);
    int var26 = var11.indexOf((org.jfree.data.xy.XYDataset)var14);
    var14.remove((java.lang.Number)4, "d", false);
    org.jfree.data.time.Year var34 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var35 = new org.jfree.data.time.Month(1, var34);
    org.jfree.data.time.RegularTimePeriod var36 = var35.previous();
    long var37 = var35.getSerialIndex();
    org.jfree.data.time.TimeTableXYDataset var38 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var40 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var41 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var40);
    var38.remove((org.jfree.data.time.TimePeriod)var40, (java.lang.Comparable)100, false);
    org.jfree.chart.axis.PeriodAxis var45 = new org.jfree.chart.axis.PeriodAxis("Compass Plot", (org.jfree.data.time.RegularTimePeriod)var35, (org.jfree.data.time.RegularTimePeriod)var40);
    org.jfree.chart.renderer.DefaultPolarItemRenderer var46 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
    org.jfree.chart.plot.DrawingSupplier var47 = var46.getDrawingSupplier();
    org.jfree.chart.plot.PolarPlot var48 = new org.jfree.chart.plot.PolarPlot((org.jfree.data.xy.XYDataset)var14, (org.jfree.chart.axis.ValueAxis)var45, (org.jfree.chart.renderer.PolarItemRenderer)var46);
    
    // Checks the contract:  equals-hashcode on var3 and var41
    assertTrue("Contract failed: equals-hashcode on var3 and var41", var3.equals(var41) ? var3.hashCode() == var41.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var41 and var3
    assertTrue("Contract failed: equals-hashcode on var41 and var3", var41.equals(var3) ? var41.hashCode() == var3.hashCode() : true);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    org.jfree.data.xy.XYIntervalSeries var3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable)"org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", false, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var3.getYLowValue(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    org.jfree.chart.axis.AxisState var0 = new org.jfree.chart.axis.AxisState();
    org.jfree.chart.title.TextTitle var3 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var4 = var3.isVisible();
    java.lang.Object var5 = var3.clone();
    org.jfree.ui.RectangleEdge var6 = var3.getPosition();
    var0.moveCursor(4.0d, var6);
    var0.setCursor(0.02d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    java.util.Locale var4 = var2.getLocale();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var6 = var5.getPreferredSize();
    java.awt.Dimension var7 = var2.getSize(var6);
    java.awt.event.ContainerListener[] var8 = var2.getContainerListeners();
    var2.removeNotify();
    boolean var10 = var2.requestFocusInWindow();
    boolean var11 = var2.isDoubleBuffered();
    
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.updateUI();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.getInheritsPopupMenu();
    javax.swing.InputMap var6 = var0.getInputMap();
    var0.nextFocus();
    javax.swing.JPanel var8 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var9 = var8.getPreferredSize();
    javax.swing.JPanel var10 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var8.setNextFocusableComponent((java.awt.Component)var10);
    java.util.Locale var12 = var10.getLocale();
    javax.swing.JPanel var13 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var14 = var13.getPreferredSize();
    java.awt.Dimension var15 = var10.getSize(var14);
    var0.setMinimumSize(var15);
    java.lang.String var17 = var0.getUIClassID();
    java.awt.Dimension var18 = var0.getPreferredSize();
    
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
    assertTrue("'" + var17 + "' != '" + "PanelUI"+ "'", var17.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    org.jfree.data.time.DynamicTimeSeriesCollection var2 = new org.jfree.data.time.DynamicTimeSeriesCollection(2, (-1));
    int var4 = var2.offsetFromOldest(51);
    int var5 = var2.getNewestIndex();
    int var7 = var2.getItemCount(20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var10 = var2.getY(2013, 52);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    org.jfree.chart.StandardChartTheme var2 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    org.jfree.chart.plot.DrawingSupplier var3 = var2.getDrawingSupplier();
    org.jfree.chart.StandardChartTheme var6 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var7 = var6.getLegendItemPaint();
    java.awt.Paint var8 = var6.getSubtitlePaint();
    java.awt.Font var9 = var6.getLargeFont();
    var2.setSmallFont(var9);
    org.jfree.chart.plot.CompassPlot var11 = new org.jfree.chart.plot.CompassPlot();
    var11.setDrawBorder(true);
    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var14 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var15 = var14.getBaseItemLabelsVisible();
    var14.setSeriesShapesFilled(1, (java.lang.Boolean)false);
    var14.setDrawOutlines(true);
    org.jfree.chart.renderer.category.BarRenderer3D var23 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var24 = var23.getItemLabelFont();
    double var25 = var23.getItemLabelAnchorOffset();
    java.awt.Shape var27 = var23.getSeriesShape(1);
    org.jfree.chart.renderer.category.BarRenderer3D var31 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var32 = var31.getItemLabelFont();
    double var33 = var31.getItemLabelAnchorOffset();
    org.jfree.chart.axis.CyclicNumberAxis var37 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var38 = var37.getTickLabelPaint();
    var31.setLegendTextPaint(0, var38);
    var23.setSeriesFillPaint(100, var38, true);
    var14.setBaseOutlinePaint(var38, false);
    var11.setRoseHighlightPaint(var38);
    var2.setTickLabelPaint(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + false+ "'", var15.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    int var3 = java.awt.Color.HSBtoRGB(0.0f, 100.0f, 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-334));

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }


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
    var20.setToolTipText("Combined Range XYPlot");
    java.lang.String var23 = var20.getShapeCoords();
    var20.setToolTipText("");
    org.jfree.chart.plot.CombinedRangeXYPlot var26 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var27 = var26.getRangeZeroBaselineStroke();
    java.lang.String var28 = var26.getPlotType();
    org.jfree.chart.plot.CategoryMarker var30 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var31 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var33 = var31.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var36 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var37 = var36.getTickLabelPaint();
    var31.setFillPaint(var37, true);
    var30.setLabelPaint(var37);
    boolean var41 = var26.removeRangeMarker((org.jfree.chart.plot.Marker)var30);
    org.jfree.chart.axis.AxisLocation var42 = var26.getDomainAxisLocation();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var45 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var48 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var49 = var48.getItemLabelFont();
    double var50 = var48.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var53 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var54 = var53.getItemLabelFont();
    java.awt.Shape var55 = var53.getBaseLegendShape();
    var48.setShape(var55);
    var45.setLegendBar(var55);
    var45.setDrawBarOutline(true);
    org.jfree.data.xy.CategoryTableXYDataset var60 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var61 = var45.findDomainBounds((org.jfree.data.xy.XYDataset)var60);
    int var62 = var26.getIndexOf((org.jfree.chart.renderer.xy.XYItemRenderer)var45);
    boolean var63 = var20.equals((java.lang.Object)var62);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Combined Range XYPlot"+ "'", var28.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }


    java.text.NumberFormat var0 = java.text.NumberFormat.getNumberInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer var0 = new org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer();
    org.jfree.chart.StandardChartTheme var3 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var4 = var3.getLegendItemPaint();
    var0.setBoxPaint(var4);
    java.lang.Number[][] var6 = new java.lang.Number[][] { };
    java.lang.Number[][] var7 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var6, var7);
    int var10 = var8.getRowIndex((java.lang.Comparable)'a');
    boolean var11 = var0.equals((java.lang.Object)var8);
    var0.setBoxWidth(1.0d);
    
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

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }


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
    double[] var56 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var57 = new org.jfree.chart.annotations.XYPolygonAnnotation(var56);
    double[] var60 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var61 = new org.jfree.chart.annotations.XYPolygonAnnotation(var60);
    org.jfree.chart.ClipPath var62 = new org.jfree.chart.ClipPath(var56, var60);
    boolean var63 = var62.isFillPath();
    var62.setClip(false);
    org.jfree.chart.plot.CategoryPlot var66 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var68 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var69 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var68);
    org.jfree.data.time.TimePeriodValue var71 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var68, (java.lang.Number)10);
    var66.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var73 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var75 = var73.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var78 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var79 = var78.getTickLabelPaint();
    var73.setFillPaint(var79, true);
    var66.setDomainCrosshairPaint(var79);
    var62.setFillPaint(var79);
    double[] var84 = var62.getYValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var52.addObservations(var84);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }


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
    double var13 = var11.getGap();
    javax.swing.JPanel var14 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var15 = var14.getPreferredSize();
    java.awt.image.ColorModel var16 = var14.getColorModel();
    var14.updateUI();
    java.lang.String var18 = var14.toString();
    boolean var19 = var14.getInheritsPopupMenu();
    double[] var22 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var23 = new org.jfree.chart.annotations.XYPolygonAnnotation(var22);
    java.lang.Object var24 = var23.clone();
    org.jfree.chart.event.AnnotationChangeEvent var25 = new org.jfree.chart.event.AnnotationChangeEvent((java.lang.Object)var14, (org.jfree.chart.annotations.Annotation)var23);
    var11.annotationChanged(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var18,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var18.equals("org.jfree.chart.ChartPanel[,0,0,0var18,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


    org.jfree.chart.util.RelativeDateFormat var1 = new org.jfree.chart.util.RelativeDateFormat();
    var1.setShowZeroHours(true);
    org.jfree.chart.axis.MonthDateFormat var4 = new org.jfree.chart.axis.MonthDateFormat();
    org.jfree.chart.util.RelativeDateFormat var6 = new org.jfree.chart.util.RelativeDateFormat();
    boolean var7 = var6.getShowZeroHours();
    org.jfree.chart.labels.StandardCategoryItemLabelGenerator var8 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator("0x00000000", (java.text.DateFormat)var6);
    org.jfree.chart.labels.BubbleXYItemLabelGenerator var9 = new org.jfree.chart.labels.BubbleXYItemLabelGenerator("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (java.text.DateFormat)var1, (java.text.DateFormat)var4, (java.text.DateFormat)var6);
    java.lang.String var10 = var1.getPositivePrefix();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


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
    org.jfree.chart.renderer.DefaultPolarItemRenderer var17 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
    var0.setRenderer(10, (org.jfree.chart.renderer.PolarItemRenderer)var17, true);
    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var22 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var23 = var22.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator var24 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.XYStepAreaRenderer var25 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(0, (org.jfree.chart.labels.XYToolTipGenerator)var22, (org.jfree.chart.urls.XYURLGenerator)var24);
    org.jfree.chart.renderer.xy.StandardXYItemRenderer var26 = new org.jfree.chart.renderer.xy.StandardXYItemRenderer(15, (org.jfree.chart.labels.XYToolTipGenerator)var22);
    java.text.NumberFormat var27 = var22.getYFormat();
    var17.setBaseToolTipGenerator((org.jfree.chart.labels.XYToolTipGenerator)var22);
    java.lang.String[] var31 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var32 = new org.jfree.chart.axis.SymbolAxis("hi!", var31);
    org.jfree.chart.plot.CompassPlot var33 = new org.jfree.chart.plot.CompassPlot();
    boolean var34 = var32.equals((java.lang.Object)var33);
    java.lang.String var35 = var33.getPlotType();
    java.awt.Paint var36 = var33.getRoseCenterPaint();
    java.awt.Paint var37 = var33.getBackgroundPaint();
    javax.swing.JPanel var38 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var39 = var38.getPreferredSize();
    java.awt.image.ColorModel var40 = var38.getColorModel();
    var38.updateUI();
    java.lang.String var42 = var38.toString();
    boolean var43 = var38.getInheritsPopupMenu();
    javax.swing.InputMap var44 = var38.getInputMap();
    var38.nextFocus();
    boolean var46 = var38.getInheritsPopupMenu();
    javax.swing.JPanel var47 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var48 = var47.getPreferredSize();
    java.awt.image.ColorModel var49 = var47.getColorModel();
    var47.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var54 = var47.getForeground();
    var38.setForeground(var54);
    org.jfree.chart.renderer.xy.XYDifferenceRenderer var57 = new org.jfree.chart.renderer.xy.XYDifferenceRenderer(var37, (java.awt.Paint)var54, true);
    org.jfree.chart.labels.StandardXYSeriesLabelGenerator var58 = new org.jfree.chart.labels.StandardXYSeriesLabelGenerator();
    var57.setLegendItemLabelGenerator((org.jfree.chart.labels.XYSeriesLabelGenerator)var58);
    var17.setLegendItemURLGenerator((org.jfree.chart.labels.XYSeriesLabelGenerator)var58);
    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var62 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var63 = var62.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator var64 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.XYStepAreaRenderer var65 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(0, (org.jfree.chart.labels.XYToolTipGenerator)var62, (org.jfree.chart.urls.XYURLGenerator)var64);
    var65.setShapesFilled(true);
    org.jfree.chart.labels.XYSeriesLabelGenerator var68 = var65.getLegendItemLabelGenerator();
    var17.setLegendItemURLGenerator(var68);
    
    // Checks the contract:  equals-hashcode on var24 and var64
    assertTrue("Contract failed: equals-hashcode on var24 and var64", var24.equals(var64) ? var24.hashCode() == var64.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var64 and var24
    assertTrue("Contract failed: equals-hashcode on var64 and var24", var64.equals(var24) ? var64.hashCode() == var24.hashCode() : true);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }


    org.jfree.data.contour.NonGridContourDataset var0 = new org.jfree.data.contour.NonGridContourDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var3 = var0.getX(52, 4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }


    org.jfree.data.gantt.TaskSeries var1 = new org.jfree.data.gantt.TaskSeries("hi!");
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var4 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var3);
    org.jfree.data.time.Week var6 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var7 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var6);
    var7.setPercentComplete((java.lang.Double)10.0d);
    org.jfree.data.time.Week var11 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var12 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var11);
    var12.setPercentComplete((java.lang.Double)10.0d);
    var7.addSubtask(var12);
    var4.addSubtask(var7);
    var1.add(var7);
    java.lang.Object var18 = var7.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }


    java.lang.Number[][] var0 = new java.lang.Number[][] { };
    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var1);
    int var3 = var2.getRowCount();
    org.jfree.data.xy.OHLCDataItem[] var5 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var6 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var5);
    var2.setSeriesKeys((java.lang.Comparable[])var5);
    java.lang.Object var8 = var2.clone();
    java.util.List var9 = var2.getColumnKeys();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }


    org.jfree.chart.ChartTheme var0 = org.jfree.chart.StandardChartTheme.createLegacyTheme();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeColumn(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    org.jfree.chart.util.DefaultShadowGenerator var0 = new org.jfree.chart.util.DefaultShadowGenerator();
    int var1 = var0.calculateOffsetY();
    float var2 = var0.getShadowOpacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5f);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var1 = var0.getLocation();
    java.awt.Dimension var2 = var0.preferredSize();
    org.jfree.chart.plot.ContourPlot var3 = new org.jfree.chart.plot.ContourPlot();
    var0.addPropertyChangeListener((java.beans.PropertyChangeListener)var3);
    java.awt.event.MouseWheelListener[] var5 = var0.getMouseWheelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


    org.jfree.data.time.Second var0 = new org.jfree.data.time.Second();
    org.jfree.data.time.TimeSeries var1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)var0);
    org.jfree.data.time.Year var5 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var6 = new org.jfree.data.time.Month(1, var5);
    org.jfree.data.time.RegularTimePeriod var7 = var6.previous();
    long var8 = var6.getSerialIndex();
    org.jfree.data.time.TimeTableXYDataset var9 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var11 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var12 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var11);
    var9.remove((org.jfree.data.time.TimePeriod)var11, (java.lang.Comparable)100, false);
    org.jfree.chart.axis.PeriodAxis var16 = new org.jfree.chart.axis.PeriodAxis("Compass Plot", (org.jfree.data.time.RegularTimePeriod)var6, (org.jfree.data.time.RegularTimePeriod)var11);
    var16.setMinorTickMarksVisible(false);
    org.jfree.data.time.Year var20 = new org.jfree.data.time.Year(100);
    org.jfree.chart.plot.CombinedDomainCategoryPlot var21 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    int var22 = var20.compareTo((java.lang.Object)var21);
    var16.setFirst((org.jfree.data.time.RegularTimePeriod)var20);
    java.lang.String var24 = var20.toString();
    var1.add((org.jfree.data.time.RegularTimePeriod)var20, (java.lang.Number)(short)(-1));
    double var27 = var1.getMaxY();
    var1.removeAgedItems(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1201L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "100"+ "'", var24.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1.0d));

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    double var4 = var2.getItemLabelAnchorOffset();
    org.jfree.chart.axis.CyclicNumberAxis var8 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var9 = var8.getTickLabelPaint();
    var2.setLegendTextPaint(0, var9);
    var2.setItemLabelsVisible((java.lang.Boolean)false, true);
    org.jfree.ui.GradientPaintTransformer var14 = var2.getGradientPaintTransformer();
    org.jfree.chart.plot.CategoryPlot var15 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var17 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var18 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var17);
    org.jfree.data.time.TimePeriodValue var20 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var17, (java.lang.Number)10);
    var15.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    java.awt.Stroke var22 = var15.getRangeMinorGridlineStroke();
    var2.setPlot(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    org.jfree.chart.labels.IntervalCategoryToolTipGenerator var0 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator();

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


    java.lang.String var2 = org.jfree.chart.urls.URLUtilities.encode("0x00000000", "d");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isCounterClockwise();
    var0.setRadiusGridlinesVisible(false);
    int var4 = var0.getDatasetCount();
    boolean var5 = var0.isAngleGridlinesVisible();
    org.jfree.data.xy.XYDataset var7 = var0.getDataset(20);
    org.jfree.chart.util.HexNumberFormat var11 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var12 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var13 = var12.getPreferredSize();
    javax.swing.JPanel var14 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var12.setNextFocusableComponent((java.awt.Component)var14);
    java.util.Locale var16 = var14.getLocale();
    org.jfree.chart.axis.MonthDateFormat var17 = new org.jfree.chart.axis.MonthDateFormat(var16);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var18 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var11, (java.text.DateFormat)var17);
    javax.swing.JPanel var19 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var20 = var19.getPreferredSize();
    javax.swing.JPanel var21 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var19.setNextFocusableComponent((java.awt.Component)var21);
    java.util.Locale var23 = var21.getLocale();
    org.jfree.chart.axis.MonthDateFormat var24 = new org.jfree.chart.axis.MonthDateFormat(var23);
    org.jfree.chart.labels.StandardXYToolTipGenerator var25 = new org.jfree.chart.labels.StandardXYToolTipGenerator("Combined Range XYPlot", (java.text.DateFormat)var17, (java.text.DateFormat)var24);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var26 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer(10, (org.jfree.chart.labels.XYToolTipGenerator)var25);
    var26.setBaseShapesVisible(true);
    boolean var29 = var0.equals((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    org.jfree.chart.plot.CompassPlot var4 = new org.jfree.chart.plot.CompassPlot();
    boolean var5 = var3.equals((java.lang.Object)var4);
    var4.setOutlineVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


    org.jfree.chart.renderer.xy.XYBlockRenderer var0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.chart.renderer.PaintScale var1 = var0.getPaintScale();
    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var2 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    boolean var3 = var2.isOutline();
    var2.setUseFillPaint(true);
    org.jfree.chart.StandardChartTheme var8 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var9 = var8.getLegendItemPaint();
    var2.setShapePaint(var9);
    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    int var14 = var12.getItemCount((-13421773));
    boolean var15 = var2.equals((java.lang.Object)var12);
    org.jfree.data.Range var16 = var0.findDomainBounds((org.jfree.data.xy.XYDataset)var12);
    var12.setOutlierCoefficient(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


    org.jfree.chart.renderer.xy.XYSplineRenderer var1 = new org.jfree.chart.renderer.xy.XYSplineRenderer(2147483647);
    var1.clearSeriesPaints(false);
    boolean var4 = var1.getBaseLinesVisible();
    boolean var7 = var1.getItemShapeFilled((-2), 15);
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
    var1.setLegendLine((java.awt.Shape)var22);
    boolean var25 = var1.getBaseShapesFilled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
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
    assertTrue(var25 == true);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }


    org.jfree.data.xml.RootHandler var0 = new org.jfree.data.xml.RootHandler();
    org.jfree.data.xml.CategorySeriesHandler var1 = new org.jfree.data.xml.CategorySeriesHandler(var0);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    org.jfree.chart.renderer.xy.XYBlockRenderer var0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var1 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var2 = var0.findDomainBounds((org.jfree.data.xy.XYDataset)var1);
    java.lang.Number var3 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset)var1);
    var1.add(100.0d, Double.NaN, "jfreechart-onetime-");
    var1.clear();
    int var10 = var1.getItemCount(8);
    org.jfree.data.xy.XYSeries var15 = org.jfree.data.time.MovingAverage.createMovingAverage((org.jfree.data.xy.XYDataset)var1, 2013, "hi!?hi!=100&amp;hi!=1", 0.3d, 1.0d);
    java.lang.Object var16 = var15.clone();
    var15.add(0.0d, 0.0d, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + Double.NaN+ "'", var3.equals(Double.NaN));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    double var4 = var2.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var7 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var8 = var7.getItemLabelFont();
    java.awt.Shape var9 = var7.getBaseLegendShape();
    var2.setShape(var9);
    org.jfree.chart.StandardChartTheme var13 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var14 = var13.getLegendItemPaint();
    var2.setItemLabelPaint(var14);
    org.jfree.chart.block.ColorBlock var18 = new org.jfree.chart.block.ColorBlock(var14, 4.0d, (-0.7853981633974483d));
    org.jfree.chart.block.BlockBorder var19 = var18.getBorder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }


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
    org.jfree.chart.plot.dial.DialValueIndicator var45 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var46 = var45.getInsets();
    java.awt.Stroke var47 = var45.getOutlineStroke();
    javax.swing.JPanel var48 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var49 = var48.getPreferredSize();
    javax.swing.JPanel var50 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var48.setNextFocusableComponent((java.awt.Component)var50);
    java.util.Locale var52 = var50.getLocale();
    javax.swing.JPanel var53 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var54 = var53.getPreferredSize();
    java.awt.Dimension var55 = var50.getSize(var54);
    java.awt.event.ContainerListener[] var56 = var50.getContainerListeners();
    javax.swing.JPanel var57 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var58 = var57.getPreferredSize();
    java.awt.image.ColorModel var59 = var57.getColorModel();
    var57.updateUI();
    java.lang.String var61 = var57.toString();
    java.awt.Color var62 = var57.getForeground();
    var50.setBackground(var62);
    var45.setOutlinePaint((java.awt.Paint)var62);
    java.awt.Color var65 = var62.brighter();
    var7.setDomainTickBandPaint((java.awt.Paint)var65);
    java.lang.Object var67 = var7.clone();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
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
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var61,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var61.equals("org.jfree.chart.ChartPanel[,0,0,0var61,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


    org.jfree.chart.plot.GreyPalette var0 = new org.jfree.chart.plot.GreyPalette();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var2 = var0.getColor((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


    org.jfree.chart.renderer.xy.XYBlockRenderer var0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var1 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var2 = var0.findDomainBounds((org.jfree.data.xy.XYDataset)var1);
    java.lang.Number var3 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset)var1);
    var1.add(100.0d, Double.NaN, "jfreechart-onetime-");
    var1.clear();
    int var10 = var1.getItemCount(8);
    org.jfree.data.xy.XYSeries var15 = org.jfree.data.time.MovingAverage.createMovingAverage((org.jfree.data.xy.XYDataset)var1, 2013, "hi!?hi!=100&amp;hi!=1", 0.3d, 1.0d);
    org.jfree.chart.renderer.xy.GradientXYBarPainter var16 = new org.jfree.chart.renderer.xy.GradientXYBarPainter();
    boolean var17 = var15.equals((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + Double.NaN+ "'", var3.equals(Double.NaN));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    org.jfree.data.general.DatasetGroup var2 = var1.getGroup();
    java.lang.Comparable var4 = var1.getSeriesKey(51);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var7 = var1.getX(3, 2013);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (short)10+ "'", var4.equals((short)10));

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


    org.jfree.chart.plot.ContourPlot var0 = new org.jfree.chart.plot.ContourPlot();
    org.jfree.chart.plot.CategoryMarker var2 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    var0.addRangeMarker((org.jfree.chart.plot.Marker)var2);
    org.jfree.chart.urls.StandardXYURLGenerator var7 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    org.jfree.data.statistics.SimpleHistogramDataset var9 = new org.jfree.data.statistics.SimpleHistogramDataset((java.lang.Comparable)100.0f);
    var9.removeAllBins();
    java.lang.String var13 = var7.generateURL((org.jfree.data.xy.XYDataset)var9, 100, 1);
    var0.setURLGenerator((org.jfree.chart.urls.XYURLGenerator)var7);
    var0.zoom(3.0d);
    double var17 = var0.getRangeCrosshairValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!?hi!=100&amp;hi!=1"+ "'", var13.equals("hi!?hi!=100&amp;hi!=1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    org.jfree.chart.plot.CompassPlot var4 = new org.jfree.chart.plot.CompassPlot();
    boolean var5 = var3.equals((java.lang.Object)var4);
    org.jfree.chart.renderer.category.BarRenderer3D var8 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var9 = var8.getItemLabelFont();
    double var10 = var8.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var13 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var14 = var13.getItemLabelFont();
    java.awt.Shape var15 = var13.getBaseLegendShape();
    var8.setShape(var15);
    org.jfree.chart.StandardChartTheme var19 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var20 = var19.getLegendItemPaint();
    var8.setItemLabelPaint(var20);
    org.jfree.chart.block.ColorBlock var24 = new org.jfree.chart.block.ColorBlock(var20, 4.0d, (-0.7853981633974483d));
    java.awt.Paint var25 = var24.getPaint();
    var3.setGridBandAlternatePaint(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }


    org.jfree.chart.renderer.xy.XYBlockRenderer var0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.chart.renderer.PaintScale var1 = var0.getPaintScale();
    org.jfree.chart.plot.PolarPlot var2 = new org.jfree.chart.plot.PolarPlot();
    boolean var3 = var2.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var8 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var8.setUpperMargin(10.0d);
    var8.setAxisLineVisible(true);
    javax.swing.JPanel var13 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var14 = var13.getLocation();
    java.awt.Dimension var15 = var13.preferredSize();
    java.awt.Rectangle var16 = var13.bounds();
    java.awt.Point var17 = var2.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var8, (java.awt.geom.Rectangle2D)var16);
    org.jfree.data.xy.DefaultXYZDataset var19 = new org.jfree.data.xy.DefaultXYZDataset();
    org.jfree.data.DomainOrder var20 = var19.getDomainOrder();
    var2.setDataset(1, (org.jfree.data.xy.XYDataset)var19);
    org.jfree.data.Range var22 = org.jfree.data.general.DatasetUtilities.iterateZBounds((org.jfree.data.xy.XYZDataset)var19);
    java.lang.Object var23 = var19.clone();
    org.jfree.data.Range var24 = var0.findDomainBounds((org.jfree.data.xy.XYDataset)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    org.jfree.chart.renderer.category.BarRenderer var0 = new org.jfree.chart.renderer.category.BarRenderer();
    org.jfree.chart.labels.ItemLabelPosition var3 = var0.getPositiveItemLabelPosition(10, 2013);
    org.jfree.chart.axis.LogAxis var4 = new org.jfree.chart.axis.LogAxis();
    var4.setFixedDimension((-170.0d));
    boolean var8 = var4.equals((java.lang.Object)1.5d);
    org.jfree.chart.title.TextTitle var11 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var12 = var11.isVisible();
    java.lang.Object var13 = var11.clone();
    var11.setMargin(4.0d, 100.0d, 4.0d, 10.0d);
    double var19 = var11.getWidth();
    javax.swing.JPanel var20 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var21 = var20.getLocation();
    org.jfree.chart.plot.PolarPlot var22 = new org.jfree.chart.plot.PolarPlot();
    boolean var23 = var22.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var28 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var28.setUpperMargin(10.0d);
    var28.setAxisLineVisible(true);
    javax.swing.JPanel var33 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var34 = var33.getLocation();
    java.awt.Dimension var35 = var33.preferredSize();
    java.awt.Rectangle var36 = var33.bounds();
    java.awt.Point var37 = var22.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var28, (java.awt.geom.Rectangle2D)var36);
    java.awt.Rectangle var38 = var20.getBounds(var36);
    var11.setBounds((java.awt.geom.Rectangle2D)var38);
    org.jfree.chart.title.TextTitle var41 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var42 = var41.isVisible();
    java.lang.Object var43 = var41.clone();
    org.jfree.ui.RectangleEdge var44 = var41.getPosition();
    double var45 = var4.java2DToValue(Double.NaN, (java.awt.geom.Rectangle2D)var38, var44);
    var0.setShape((java.awt.Shape)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
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
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == Double.NaN);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    org.jfree.chart.plot.CategoryMarker var1 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var2 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var4 = var2.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var7 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var8 = var7.getTickLabelPaint();
    var2.setFillPaint(var8, true);
    var1.setLabelPaint(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setAlpha(2.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var1 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var2 = var1.clone();
    org.jfree.chart.renderer.xy.StandardXYItemRenderer var3 = new org.jfree.chart.renderer.xy.StandardXYItemRenderer(2013, (org.jfree.chart.labels.XYToolTipGenerator)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }


    org.jfree.data.time.Year var1 = new org.jfree.data.time.Year((-334));

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var1 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var2 = var0.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var1);
    var1.setTickLabelsVisible(false);
    org.jfree.chart.plot.dial.DialPlot var5 = new org.jfree.chart.plot.dial.DialPlot();
    double var6 = var5.getViewWidth();
    org.jfree.chart.plot.dial.DialScale var8 = var5.getScaleForDataset(1);
    var1.addChangeListener((org.jfree.chart.plot.dial.DialLayerChangeListener)var5);
    var5.mapDatasetToScale(4, (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.updateUI();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.getInheritsPopupMenu();
    javax.swing.InputMap var6 = var0.getInputMap();
    var0.nextFocus();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var9 = var0.getComponent(1);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    org.jfree.data.time.TimePeriodValue var5 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var2, (java.lang.Number)10);
    var0.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var7 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var9 = var7.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var12 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var13 = var12.getTickLabelPaint();
    var7.setFillPaint(var13, true);
    var0.setDomainCrosshairPaint(var13);
    boolean var17 = var0.isRangeCrosshairLockedOnData();
    org.jfree.chart.util.ShadowGenerator var18 = var0.getShadowGenerator();
    org.jfree.chart.axis.CategoryLabelPositions var21 = org.jfree.chart.axis.CategoryLabelPositions.createDownRotationLabelPositions((-1.0d));
    org.jfree.chart.plot.CategoryPlot var22 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var24 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var25 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var24);
    org.jfree.data.time.TimePeriodValue var27 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var24, (java.lang.Number)10);
    var22.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var29 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var31 = var29.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var34 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var35 = var34.getTickLabelPaint();
    var29.setFillPaint(var35, true);
    var22.setDomainCrosshairPaint(var35);
    boolean var39 = var21.equals((java.lang.Object)var22);
    org.jfree.ui.RectangleEdge var40 = var22.getRangeAxisEdge();
    org.jfree.chart.axis.SubCategoryAxis var42 = new org.jfree.chart.axis.SubCategoryAxis("Compass Plot");
    int var43 = var22.getDomainAxisIndex((org.jfree.chart.axis.CategoryAxis)var42);
    var0.setDomainAxis(1, (org.jfree.chart.axis.CategoryAxis)var42);
    
    // Checks the contract:  equals-hashcode on var22 and var0
    assertTrue("Contract failed: equals-hashcode on var22 and var0", var22.equals(var0) ? var22.hashCode() == var0.hashCode() : true);
    
    // This assertion (symmetry of equals) fails 
    assertTrue("Contract failed: equals-symmetric on var22 and var0.", var22.equals(var0) == var0.equals(var22));
    
    // Checks the contract:  equals-hashcode on var3 and var25
    assertTrue("Contract failed: equals-hashcode on var3 and var25", var3.equals(var25) ? var3.hashCode() == var25.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var25 and var3
    assertTrue("Contract failed: equals-hashcode on var25 and var3", var25.equals(var3) ? var25.hashCode() == var3.hashCode() : true);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }


    double[] var2 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var3 = new org.jfree.chart.annotations.XYPolygonAnnotation(var2);
    double[] var6 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var7 = new org.jfree.chart.annotations.XYPolygonAnnotation(var6);
    org.jfree.chart.ClipPath var8 = new org.jfree.chart.ClipPath(var2, var6);
    double[] var11 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var12 = new org.jfree.chart.annotations.XYPolygonAnnotation(var11);
    double[] var15 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var16 = new org.jfree.chart.annotations.XYPolygonAnnotation(var15);
    org.jfree.chart.ClipPath var17 = new org.jfree.chart.ClipPath(var11, var15);
    var8.setXValue(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


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
    org.jfree.data.Range var18 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset)var2, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var20 = var2.getSeriesKey((-2));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isCounterClockwise();
    var0.setRadiusGridlinesVisible(false);
    int var4 = var0.getDatasetCount();
    int var5 = var0.getAxisCount();
    double var6 = var0.getAngleOffset();
    org.jfree.chart.renderer.xy.XYBlockRenderer var7 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.chart.renderer.PaintScale var8 = var7.getPaintScale();
    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var9 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    boolean var10 = var9.isOutline();
    var9.setUseFillPaint(true);
    org.jfree.chart.StandardChartTheme var15 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var16 = var15.getLegendItemPaint();
    var9.setShapePaint(var16);
    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    int var21 = var19.getItemCount((-13421773));
    boolean var22 = var9.equals((java.lang.Object)var19);
    org.jfree.data.Range var23 = var7.findDomainBounds((org.jfree.data.xy.XYDataset)var19);
    int var24 = var0.indexOf((org.jfree.data.xy.XYDataset)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var27 = var19.getXDate(52, 15);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-90.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }


    org.jfree.chart.plot.CompassPlot var0 = new org.jfree.chart.plot.CompassPlot();
    var0.setDrawBorder(false);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.plot.CategoryMarker var2 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var3 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var5 = var3.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var8 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var9 = var8.getTickLabelPaint();
    var3.setFillPaint(var9, true);
    var2.setLabelPaint(var9);
    var0.setDomainGridlinePaint(var9);
    var0.clearDomainMarkers();
    var0.setWeight(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }


    org.jfree.chart.renderer.xy.XYSplineRenderer var1 = new org.jfree.chart.renderer.xy.XYSplineRenderer(2147483647);
    org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer var2 = new org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer();
    org.jfree.chart.StandardChartTheme var5 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var6 = var5.getLegendItemPaint();
    var2.setBoxPaint(var6);
    java.lang.Number[][] var8 = new java.lang.Number[][] { };
    java.lang.Number[][] var9 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var10 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var8, var9);
    int var12 = var10.getRowIndex((java.lang.Comparable)'a');
    boolean var13 = var2.equals((java.lang.Object)var10);
    boolean var14 = var1.equals((java.lang.Object)var13);
    boolean var15 = var1.getUseOutlinePaint();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }


    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var0 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    boolean var1 = var0.isOutline();
    var0.setUseFillPaint(true);
    org.jfree.chart.StandardChartTheme var6 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var7 = var6.getLegendItemPaint();
    var0.setShapePaint(var7);
    double[] var11 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var12 = new org.jfree.chart.annotations.XYPolygonAnnotation(var11);
    java.lang.Object var13 = var12.clone();
    java.awt.Paint var14 = var12.getOutlinePaint();
    var0.setBasePaint(var14);
    boolean var16 = var0.getPlotLines();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }


    org.jfree.data.time.TimePeriodValues var3 = new org.jfree.data.time.TimePeriodValues("Compass Plot", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]");
    var3.setRangeDescription("d");
    var3.fireSeriesChanged();

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }


    org.jfree.data.statistics.HistogramBin var2 = new org.jfree.data.statistics.HistogramBin(0.0d, 1.0d);
    java.lang.Object var3 = var2.clone();
    java.lang.Object var4 = var2.clone();
    
    // Checks the contract:  equals-hashcode on var3 and var4
    assertTrue("Contract failed: equals-hashcode on var3 and var4", var3.equals(var4) ? var3.hashCode() == var4.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var4 and var3
    assertTrue("Contract failed: equals-hashcode on var4 and var3", var4.equals(var3) ? var4.hashCode() == var3.hashCode() : true);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }


    org.jfree.chart.plot.MultiplePiePlot var0 = new org.jfree.chart.plot.MultiplePiePlot();
    org.jfree.chart.JFreeChart var1 = var0.getPieChart();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var4 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var7 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var8 = var7.getItemLabelFont();
    double var9 = var7.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var12 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var13 = var12.getItemLabelFont();
    java.awt.Shape var14 = var12.getBaseLegendShape();
    var7.setShape(var14);
    var4.setLegendBar(var14);
    var4.setDrawBarOutline(true);
    org.jfree.data.xy.CategoryTableXYDataset var19 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var20 = var4.findDomainBounds((org.jfree.data.xy.XYDataset)var19);
    org.jfree.data.xy.XYIntervalSeriesCollection var21 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.xy.XYBarDataset var23 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var21, 10.0d);
    var23.setBarWidth(2.0d);
    org.jfree.chart.axis.AxisCollection var26 = new org.jfree.chart.axis.AxisCollection();
    java.util.List var27 = var26.getAxesAtLeft();
    org.jfree.data.general.DefaultKeyedValues2DDataset var28 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var28.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var28);
    org.jfree.data.Range var35 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds((org.jfree.data.category.CategoryDataset)var28, true);
    org.jfree.data.Range var37 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds((org.jfree.data.xy.XYDataset)var23, var27, var35, true);
    org.jfree.data.Range var39 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)var19, var27, true);
    var1.setSubtitles(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }


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
      java.lang.Comparable var27 = var22.getSeriesKey(1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }


    java.lang.Number[][] var0 = new java.lang.Number[][] { };
    java.lang.Number[][] var1 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var1);
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var5 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var4);
    int var6 = var2.getColumnIndex((java.lang.Comparable)var4);
    int var7 = var4.getYearValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2013);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }


    org.jfree.data.time.Year var4 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var5 = new org.jfree.data.time.Month(1, var4);
    org.jfree.data.time.RegularTimePeriod var6 = var5.previous();
    long var7 = var5.getSerialIndex();
    org.jfree.data.time.TimeTableXYDataset var8 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var10 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var11 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var10);
    var8.remove((org.jfree.data.time.TimePeriod)var10, (java.lang.Comparable)100, false);
    org.jfree.chart.axis.PeriodAxis var15 = new org.jfree.chart.axis.PeriodAxis("Compass Plot", (org.jfree.data.time.RegularTimePeriod)var5, (org.jfree.data.time.RegularTimePeriod)var10);
    var15.setMinorTickMarksVisible(false);
    org.jfree.data.time.Year var19 = new org.jfree.data.time.Year(100);
    org.jfree.chart.plot.CombinedDomainCategoryPlot var20 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    int var21 = var19.compareTo((java.lang.Object)var20);
    var15.setFirst((org.jfree.data.time.RegularTimePeriod)var19);
    java.lang.String var23 = var19.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Month var24 = new org.jfree.data.time.Month(20, var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1201L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "100"+ "'", var23.equals("100"));

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }


    org.jfree.chart.renderer.category.LevelRenderer var0 = new org.jfree.chart.renderer.category.LevelRenderer();
    double var1 = var0.getItemMargin();
    org.jfree.chart.StrokeMap var2 = new org.jfree.chart.StrokeMap();
    java.lang.Object var3 = var2.clone();
    boolean var4 = var0.equals((java.lang.Object)var2);
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }


    org.jfree.data.time.Second var0 = new org.jfree.data.time.Second();
    org.jfree.data.time.TimeSeries var1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)var0);
    org.jfree.data.time.Year var5 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var6 = new org.jfree.data.time.Month(1, var5);
    org.jfree.data.time.RegularTimePeriod var7 = var6.previous();
    long var8 = var6.getSerialIndex();
    org.jfree.data.time.TimeTableXYDataset var9 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var11 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var12 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var11);
    var9.remove((org.jfree.data.time.TimePeriod)var11, (java.lang.Comparable)100, false);
    org.jfree.chart.axis.PeriodAxis var16 = new org.jfree.chart.axis.PeriodAxis("Compass Plot", (org.jfree.data.time.RegularTimePeriod)var6, (org.jfree.data.time.RegularTimePeriod)var11);
    var16.setMinorTickMarksVisible(false);
    org.jfree.data.time.Year var20 = new org.jfree.data.time.Year(100);
    org.jfree.chart.plot.CombinedDomainCategoryPlot var21 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    int var22 = var20.compareTo((java.lang.Object)var21);
    var16.setFirst((org.jfree.data.time.RegularTimePeriod)var20);
    java.lang.String var24 = var20.toString();
    var1.add((org.jfree.data.time.RegularTimePeriod)var20, (java.lang.Number)(short)(-1));
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1201L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "100"+ "'", var24.equals("100"));

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }


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
    org.jfree.data.xy.XYIntervalSeriesCollection var19 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.xy.XYBarDataset var21 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var19, 10.0d);
    var21.setBarWidth(2.0d);
    org.jfree.chart.axis.AxisCollection var24 = new org.jfree.chart.axis.AxisCollection();
    java.util.List var25 = var24.getAxesAtLeft();
    org.jfree.data.general.DefaultKeyedValues2DDataset var26 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var26.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var26);
    org.jfree.data.Range var33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds((org.jfree.data.category.CategoryDataset)var26, true);
    org.jfree.data.Range var35 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds((org.jfree.data.xy.XYDataset)var21, var25, var33, true);
    org.jfree.data.Range var37 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)var17, var25, true);
    java.lang.Number var38 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset)var17);
    double var40 = org.jfree.data.general.DatasetUtilities.calculateStackTotal((org.jfree.data.xy.TableXYDataset)var17, 52);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + Double.NaN+ "'", var38.equals(Double.NaN));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


    org.jfree.chart.util.HexNumberFormat var2 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var3 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var4 = var3.getPreferredSize();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var3.setNextFocusableComponent((java.awt.Component)var5);
    java.util.Locale var7 = var5.getLocale();
    org.jfree.chart.axis.MonthDateFormat var8 = new org.jfree.chart.axis.MonthDateFormat(var7);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var9 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var2, (java.text.DateFormat)var8);
    org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator var10 = new org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator("jfreechart-onetime-", (java.text.NumberFormat)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var12 = var2.parse("0x00000001");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }


    org.jfree.data.contour.NonGridContourDataset var0 = new org.jfree.data.contour.NonGridContourDataset();
    java.lang.Number[] var1 = var0.getYValues();
    int var2 = var0.getSeriesCount();
    int[] var3 = var0.indexX();

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }


    org.jfree.chart.StandardChartTheme var1 = new org.jfree.chart.StandardChartTheme("Compass Plot");
    java.awt.Paint var2 = var1.getTitlePaint();
    java.awt.Paint var3 = var1.getChartBackgroundPaint();
    java.awt.Paint var4 = var1.getLabelLinkPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Quarter var1 = org.jfree.data.time.Quarter.parseQuarter("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }


    org.jfree.chart.axis.LogAxis var0 = new org.jfree.chart.axis.LogAxis();
    org.jfree.chart.editor.DefaultLogAxisEditor var1 = new org.jfree.chart.editor.DefaultLogAxisEditor(var0);
    org.jfree.chart.util.HexNumberFormat var3 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.labels.IntervalCategoryToolTipGenerator var4 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("Combined Range XYPlot", (java.text.NumberFormat)var3);
    java.lang.Object var5 = var3.clone();
    var0.setNumberFormatOverride((java.text.NumberFormat)var3);
    var0.setMinorTickMarkInsideLength((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }


    org.jfree.chart.plot.ThermometerPlot var0 = new org.jfree.chart.plot.ThermometerPlot();
    boolean var1 = var0.isDomainZoomable();
    int var2 = var0.getAxisLocation();
    org.jfree.data.general.ValueDataset var3 = var0.getDataset();
    int var4 = var0.getBulbDiameter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 80);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }


    org.jfree.chart.renderer.category.ScatterRenderer var0 = new org.jfree.chart.renderer.category.ScatterRenderer();
    var0.setUseOutlinePaint(false);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }


    org.jfree.chart.title.TextTitle var1 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var2 = var1.isVisible();
    java.lang.Object var3 = var1.clone();
    var1.setMargin(4.0d, 100.0d, 4.0d, 10.0d);
    double var9 = var1.getWidth();
    java.awt.Paint var10 = var1.getBackgroundPaint();
    org.jfree.ui.HorizontalAlignment var11 = var1.getHorizontalAlignment();
    org.jfree.chart.plot.CombinedRangeXYPlot var12 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var13 = var12.getRangeZeroBaselineStroke();
    org.jfree.chart.title.TextTitle var15 = new org.jfree.chart.title.TextTitle("hi!");
    org.jfree.ui.RectangleInsets var16 = var15.getMargin();
    var12.setAxisOffset(var16);
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
    var12.setRangeCrosshairPaint(var49);
    var1.setPaint(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }


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
    double var43 = var3.getUpperBound();
    var3.setVisible(true);
    
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
    assertTrue(var43 == 1.0d);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    org.jfree.chart.plot.dial.DialPlot var1 = new org.jfree.chart.plot.dial.DialPlot();
    var0.setParent((org.jfree.chart.plot.Plot)var1);
    boolean var3 = var0.isDomainPannable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }


    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var5 = var4.getLocation();
    org.jfree.chart.plot.PolarPlot var6 = new org.jfree.chart.plot.PolarPlot();
    boolean var7 = var6.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var12 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var12.setUpperMargin(10.0d);
    var12.setAxisLineVisible(true);
    javax.swing.JPanel var17 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var18 = var17.getLocation();
    java.awt.Dimension var19 = var17.preferredSize();
    java.awt.Rectangle var20 = var17.bounds();
    java.awt.Point var21 = var6.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var12, (java.awt.geom.Rectangle2D)var20);
    java.awt.Rectangle var22 = var4.getBounds(var20);
    org.jfree.chart.renderer.category.GanttRenderer var23 = new org.jfree.chart.renderer.category.GanttRenderer();
    java.lang.String[] var26 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var27 = new org.jfree.chart.axis.SymbolAxis("hi!", var26);
    org.jfree.chart.plot.CompassPlot var28 = new org.jfree.chart.plot.CompassPlot();
    boolean var29 = var27.equals((java.lang.Object)var28);
    java.lang.String var30 = var28.getPlotType();
    java.awt.Paint var31 = var28.getRoseCenterPaint();
    var23.setIncompletePaint(var31);
    org.jfree.chart.LegendItem var33 = new org.jfree.chart.LegendItem("Range[0.0,0.0]", "RectangleConstraint[LengthConstraintType.FIXED: width=0.04, height=0.0]", "hi!?hi!=100&amp;hi!=1", "jfreechart-onetime-", (java.awt.Shape)var20, var31);
    int var34 = var33.getSeriesIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Compass Plot"+ "'", var30.equals("Compass Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    org.jfree.chart.renderer.xy.HighLowRenderer var0 = new org.jfree.chart.renderer.xy.HighLowRenderer();
    boolean var1 = var0.getDrawCloseTicks();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }


    org.jfree.data.xy.XIntervalSeriesCollection var0 = new org.jfree.data.xy.XIntervalSeriesCollection();
    org.jfree.data.xy.XIntervalSeries var2 = new org.jfree.data.xy.XIntervalSeries((java.lang.Comparable)1201L);
    var0.addSeries(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var6 = var0.getEndY(52, 80);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


    org.jfree.chart.plot.Crosshair var0 = new org.jfree.chart.plot.Crosshair();
    java.awt.Paint var1 = var0.getLabelPaint();
    org.jfree.data.xy.XYSeries var4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.Object var5 = var4.clone();
    int var6 = var4.getMaximumItemCount();
    javax.swing.JPanel var7 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var8 = var7.getPreferredSize();
    boolean var9 = var7.getIgnoreRepaint();
    org.jfree.chart.plot.ContourPlot var11 = new org.jfree.chart.plot.ContourPlot();
    var11.setOutlineVisible(false);
    var7.addPropertyChangeListener("Combined Range XYPlot", (java.beans.PropertyChangeListener)var11);
    org.jfree.chart.urls.XYURLGenerator var15 = var11.getURLGenerator();
    var4.removePropertyChangeListener((java.beans.PropertyChangeListener)var11);
    float var17 = var11.getForegroundAlpha();
    org.jfree.chart.plot.ValueMarker var19 = new org.jfree.chart.plot.ValueMarker((-1.0d));
    var11.addDomainMarker((org.jfree.chart.plot.Marker)var19);
    var0.removePropertyChangeListener((java.beans.PropertyChangeListener)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1.0f);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }


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
    java.awt.Stroke var38 = var19.getSeriesStroke(51);
    
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
    assertNull(var38);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    boolean var2 = var0.getIgnoreRepaint();
    org.jfree.chart.plot.ContourPlot var4 = new org.jfree.chart.plot.ContourPlot();
    var4.setOutlineVisible(false);
    var0.addPropertyChangeListener("Combined Range XYPlot", (java.beans.PropertyChangeListener)var4);
    javax.swing.JPopupMenu var8 = var0.getComponentPopupMenu();
    var0.reshape((-13421773), 2147483647, 2013, 2013);
    javax.swing.JPanel var14 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var15 = var14.getPreferredSize();
    java.awt.image.ColorModel var16 = var14.getColorModel();
    var14.updateUI();
    java.lang.String var18 = var14.toString();
    boolean var19 = var14.getInheritsPopupMenu();
    javax.swing.InputMap var20 = var14.getInputMap();
    var14.nextFocus();
    javax.swing.JPanel var22 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var23 = var22.getPreferredSize();
    javax.swing.JPanel var24 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var22.setNextFocusableComponent((java.awt.Component)var24);
    java.util.Locale var26 = var24.getLocale();
    javax.swing.JPanel var27 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var28 = var27.getPreferredSize();
    java.awt.Dimension var29 = var24.getSize(var28);
    var14.setMinimumSize(var29);
    java.awt.Dimension var31 = var0.getSize(var29);
    java.awt.LayoutManager var32 = var0.getLayout();
    javax.swing.event.AncestorListener[] var33 = var0.getAncestorListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var35 = var0.getFocusTraversalKeys(20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var18,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var18.equals("org.jfree.chart.ChartPanel[,0,0,0var18,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
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

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.updateUI();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.getInheritsPopupMenu();
    javax.swing.InputMap var6 = var0.getInputMap();
    var0.nextFocus();
    javax.swing.JPanel var8 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var9 = var8.getPreferredSize();
    javax.swing.JPanel var10 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var8.setNextFocusableComponent((java.awt.Component)var10);
    java.util.Locale var12 = var10.getLocale();
    javax.swing.JPanel var13 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var14 = var13.getPreferredSize();
    java.awt.Dimension var15 = var10.getSize(var14);
    var0.setMinimumSize(var15);
    var0.setName("hi!?hi!=100&amp;amp;hi!=1");
    
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

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }


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
    org.jfree.data.xy.CategoryTableXYDataset var14 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.general.DefaultKeyedValues2DDataset var15 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var15.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var15);
    java.util.List var21 = var15.getColumnKeys();
    org.jfree.data.Range var23 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)var14, var21, true);
    double var25 = var14.getDomainLowerBound(true);
    int var26 = var11.indexOf((org.jfree.data.xy.XYDataset)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var29 = var14.getY((-13421773), 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }


    org.jfree.chart.axis.LogAxis var0 = new org.jfree.chart.axis.LogAxis();
    var0.setFixedDimension((-170.0d));
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    var5.setShape(var12);
    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    double var16 = var15.getOutlierCoefficient();
    org.jfree.chart.entity.XYItemEntity var21 = new org.jfree.chart.entity.XYItemEntity(var12, (org.jfree.data.xy.XYDataset)var15, 1, 4, "-4,-4,4,4", "100");
    var0.setLeftArrow(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1.5d);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


    org.jfree.chart.plot.ContourPlot var0 = new org.jfree.chart.plot.ContourPlot();
    var0.setOutlineVisible(false);
    org.jfree.chart.axis.ValueAxis var3 = var0.getDomainAxis();
    org.jfree.chart.axis.CyclicNumberAxis var6 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var7 = var6.isAxisLineVisible();
    var6.setAxisLineVisible(true);
    var6.setMinorTickMarksVisible(true);
    double var12 = var6.getUpperMargin();
    var0.setRangeAxis((org.jfree.chart.axis.ValueAxis)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.05d);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }


    org.jfree.chart.plot.ThermometerPlot var0 = new org.jfree.chart.plot.ThermometerPlot();
    boolean var1 = var0.isDomainZoomable();
    int var2 = var0.getAxisLocation();
    org.jfree.data.general.ValueDataset var3 = var0.getDataset();
    org.jfree.chart.plot.MeterPlot var4 = new org.jfree.chart.plot.MeterPlot(var3);
    java.awt.Paint var5 = var4.getDialOutlinePaint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setMeterAngle(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


    org.jfree.chart.plot.ThermometerPlot var0 = new org.jfree.chart.plot.ThermometerPlot();
    var0.setFollowDataInSubranges(false);
    var0.setColumnRadius(80);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    org.jfree.chart.plot.CompassPlot var4 = new org.jfree.chart.plot.CompassPlot();
    boolean var5 = var3.equals((java.lang.Object)var4);
    var3.setGridBandsVisible(false);
    javax.swing.JPanel var8 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var9 = var8.getLocation();
    java.awt.Dimension var10 = var8.preferredSize();
    java.awt.Rectangle var11 = var8.bounds();
    var8.setDoubleBuffered(true);
    org.jfree.chart.axis.CyclicNumberAxis var16 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var17 = var16.getTickLabelPaint();
    var16.setVisible(false);
    java.lang.Object var20 = var16.clone();
    org.jfree.chart.plot.CombinedRangeXYPlot var21 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    org.jfree.chart.annotations.XYPointerAnnotation var26 = new org.jfree.chart.annotations.XYPointerAnnotation("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (-1.0d), 0.2d, 4.0d);
    double var27 = var26.getLabelOffset();
    org.jfree.ui.TextAnchor var28 = var26.getRotationAnchor();
    boolean var29 = var21.removeAnnotation((org.jfree.chart.annotations.XYAnnotation)var26);
    org.jfree.chart.StandardChartTheme var32 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var33 = var32.getLegendItemPaint();
    java.awt.Paint var34 = var32.getSubtitlePaint();
    java.awt.Font var35 = var32.getLargeFont();
    var26.setFont(var35);
    var16.setLabelFont(var35);
    var8.setFont(var35);
    var3.setTickLabelFont(var35);
    org.jfree.data.general.DefaultKeyedValues2DDataset var40 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var40.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var45 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var40);
    org.jfree.data.Range var47 = org.jfree.data.Range.shift(var45, (-1.0d));
    org.jfree.data.Range var49 = org.jfree.data.Range.scale(var47, 100.0d);
    var3.setDefaultAutoRange(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }


    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var0 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem(1, 0);
    var0.setGapThreshold((-0.7853981633974483d));
    var0.setGapThreshold(174.49d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }


    org.jfree.chart.axis.PeriodAxis var1 = new org.jfree.chart.axis.PeriodAxis("Compass Plot");
    org.jfree.data.general.DefaultKeyedValues2DDataset var2 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var2.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var2);
    org.jfree.data.Range var9 = org.jfree.data.Range.shift(var7, (-1.0d));
    var1.setRange(var9, false, true);
    org.jfree.data.time.DateRange var13 = new org.jfree.data.time.DateRange();
    long var14 = var13.getUpperMillis();
    org.jfree.data.general.DefaultKeyedValues2DDataset var15 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var15.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var15);
    org.jfree.data.Range var22 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds((org.jfree.data.category.CategoryDataset)var15, true);
    org.jfree.chart.block.RectangleConstraint var23 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)var13, var22);
    org.jfree.data.Range var24 = org.jfree.data.Range.combineIgnoringNaN(var9, var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }


    org.jfree.chart.title.TextTitle var5 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var6 = var5.isVisible();
    java.lang.Object var7 = var5.clone();
    var5.setMargin(4.0d, 100.0d, 4.0d, 10.0d);
    double var13 = var5.getWidth();
    javax.swing.JPanel var14 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var15 = var14.getLocation();
    org.jfree.chart.plot.PolarPlot var16 = new org.jfree.chart.plot.PolarPlot();
    boolean var17 = var16.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var22 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var22.setUpperMargin(10.0d);
    var22.setAxisLineVisible(true);
    javax.swing.JPanel var27 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var28 = var27.getLocation();
    java.awt.Dimension var29 = var27.preferredSize();
    java.awt.Rectangle var30 = var27.bounds();
    java.awt.Point var31 = var16.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var22, (java.awt.geom.Rectangle2D)var30);
    java.awt.Rectangle var32 = var14.getBounds(var30);
    var5.setBounds((java.awt.geom.Rectangle2D)var32);
    org.jfree.chart.annotations.XYDrawableAnnotation var34 = new org.jfree.chart.annotations.XYDrawableAnnotation(0.2d, (-0.21460183660255172d), 0.02d, 4.0d, (org.jfree.ui.Drawable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
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

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }


    org.jfree.data.time.DateRange var0 = new org.jfree.data.time.DateRange();
    long var1 = var0.getUpperMillis();
    org.jfree.data.general.DefaultKeyedValues2DDataset var2 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var2.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var7 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var2);
    org.jfree.data.Range var9 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds((org.jfree.data.category.CategoryDataset)var2, true);
    org.jfree.chart.block.RectangleConstraint var10 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)var0, var9);
    org.jfree.data.time.DateRange var13 = new org.jfree.data.time.DateRange((-1.0d), 1.0d);
    org.jfree.chart.block.RectangleConstraint var14 = var10.toRangeHeight((org.jfree.data.Range)var13);
    double var15 = var14.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }


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
    org.jfree.chart.axis.CyclicNumberAxis var20 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var21 = var20.isAxisLineVisible();
    var20.setAxisLineVisible(true);
    var20.setMinorTickMarksVisible(true);
    org.jfree.chart.plot.CombinedRangeXYPlot var26 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var27 = var26.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CombinedRangeXYPlot var28 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var29 = var28.getRangeZeroBaselineStroke();
    var26.setRangeGridlineStroke(var29);
    var26.setDomainMinorGridlinesVisible(true);
    var26.setRangeZeroBaselineVisible(true);
    var20.setPlot((org.jfree.chart.plot.Plot)var26);
    var0.setDomainAxis((org.jfree.chart.axis.ValueAxis)var20);
    var0.mapDatasetToRangeAxis(2013, 2013);
    var0.setDomainPannable(false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }


    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var1 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var2 = var1.clone();
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var3 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer((-2), (org.jfree.chart.labels.XYToolTipGenerator)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }


    java.text.NumberFormat var1 = java.text.NumberFormat.getPercentInstance();
    java.text.DateFormat var2 = java.text.DateFormat.getTimeInstance();
    org.jfree.chart.labels.StandardXYItemLabelGenerator var3 = new org.jfree.chart.labels.StandardXYItemLabelGenerator("[size=0x00000000]", var1, var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }


    org.jfree.data.statistics.SimpleHistogramBin var2 = new org.jfree.data.statistics.SimpleHistogramBin(0.05d, 2.0d);
    var2.setItemCount(2);
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var7 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    double var12 = var10.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var15 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var16 = var15.getItemLabelFont();
    java.awt.Shape var17 = var15.getBaseLegendShape();
    var10.setShape(var17);
    var7.setLegendBar(var17);
    var7.setDrawBarOutline(true);
    java.awt.Paint var23 = var7.getLegendTextPaint(0);
    var7.setSeriesItemLabelsVisible(0, true);
    boolean var27 = var2.equals((java.lang.Object)var7);
    var7.setDrawBarOutline(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    org.jfree.data.contour.NonGridContourDataset var0 = new org.jfree.data.contour.NonGridContourDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var2 = var0.getSeriesKey(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }


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
    java.lang.Object var25 = var20.getCategory();
    java.lang.Comparable var26 = var20.getColumnKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + true+ "'", var25.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + true+ "'", var26.equals(true));

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }


    org.jfree.chart.renderer.category.StackedBarRenderer3D var0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
    boolean var1 = var0.getRenderAsPercentages();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    org.jfree.data.time.TimePeriodValue var5 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var2, (java.lang.Number)10);
    var0.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    org.jfree.chart.renderer.category.StackedAreaRenderer var8 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.plot.CombinedRangeXYPlot var9 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var10 = var9.getRangeZeroBaselineStroke();
    java.lang.String var11 = var9.getPlotType();
    boolean var12 = var9.isDomainZoomable();
    org.jfree.chart.plot.CombinedRangeXYPlot var13 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var14 = var13.getRangeZeroBaselineStroke();
    var9.setDomainCrosshairStroke(var14);
    var8.setBaseOutlineStroke(var14, true);
    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var20 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var21 = var20.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator var22 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.XYStepAreaRenderer var23 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(0, (org.jfree.chart.labels.XYToolTipGenerator)var20, (org.jfree.chart.urls.XYURLGenerator)var22);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var24 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer(0, (org.jfree.chart.labels.XYToolTipGenerator)var20);
    boolean var25 = var8.equals((java.lang.Object)var20);
    var0.setRenderer((org.jfree.chart.renderer.category.CategoryItemRenderer)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Combined Range XYPlot"+ "'", var11.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }


    org.jfree.chart.labels.StandardCategorySeriesLabelGenerator var1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("hi!");
    java.lang.Number[][] var2 = new java.lang.Number[][] { };
    java.lang.Number[][] var3 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var4 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var2, var3);
    int var5 = var4.getRowCount();
    org.jfree.data.xy.OHLCDataItem[] var7 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var8 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var7);
    var4.setSeriesKeys((java.lang.Comparable[])var7);
    java.lang.Object var10 = var4.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var12 = var1.generateLabel((org.jfree.data.category.CategoryDataset)var4, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }


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
    org.jfree.ui.RectangleInsets var29 = var0.getAxisOffset();
    boolean var30 = var0.isOutlineVisible();
    boolean var31 = var0.isRangePannable();
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var3 = var2.isAxisLineVisible();
    var2.setAxisLineVisible(true);
    var2.setMinorTickMarksVisible(true);
    org.jfree.ui.RectangleInsets var8 = var2.getTickLabelInsets();
    org.jfree.chart.util.HexNumberFormat var10 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.axis.NumberTickUnit var12 = new org.jfree.chart.axis.NumberTickUnit(0.05d, (java.text.NumberFormat)var10, 1);
    java.lang.String var14 = var12.valueToString(1.0d);
    var2.setTickUnit(var12, true, false);
    java.lang.String var18 = var12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "0var140000001"+ "'", var14.equals("0var140000001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[size=0var180000000]"+ "'", var18.equals("[size=0var180000000]"));

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }


    org.jfree.chart.needle.ShipNeedle var0 = new org.jfree.chart.needle.ShipNeedle();
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
    boolean var18 = var0.equals((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }


    org.jfree.chart.renderer.category.ScatterRenderer var0 = new org.jfree.chart.renderer.category.ScatterRenderer();
    boolean var1 = var0.getUseOutlinePaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }


    org.jfree.data.general.DefaultKeyedValueDataset var0 = new org.jfree.data.general.DefaultKeyedValueDataset();
    org.jfree.data.general.DatasetGroup var1 = var0.getGroup();
    java.lang.Object var2 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }


    org.jfree.data.xy.YIntervalDataItem var4 = new org.jfree.data.xy.YIntervalDataItem(0.2d, (-1.0d), 0.2d, 2.0d);
    double var5 = var4.getYHighValue();
    double var6 = var4.getYLowValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.2d);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    double var4 = var2.getItemLabelAnchorOffset();
    org.jfree.chart.labels.ItemLabelPosition var7 = var2.getNegativeItemLabelPosition(0, 0);
    java.awt.Paint var10 = var2.getItemFillPaint(2013, 1);
    boolean var11 = var2.getShadowsVisible();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setSeriesVisibleInLegend((-1), (java.lang.Boolean)false, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


    org.jfree.chart.plot.ContourPlot var0 = new org.jfree.chart.plot.ContourPlot();
    org.jfree.chart.plot.CategoryMarker var2 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    var0.addRangeMarker((org.jfree.chart.plot.Marker)var2);
    org.jfree.chart.urls.StandardXYURLGenerator var7 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    org.jfree.data.statistics.SimpleHistogramDataset var9 = new org.jfree.data.statistics.SimpleHistogramDataset((java.lang.Comparable)100.0f);
    var9.removeAllBins();
    java.lang.String var13 = var7.generateURL((org.jfree.data.xy.XYDataset)var9, 100, 1);
    var0.setURLGenerator((org.jfree.chart.urls.XYURLGenerator)var7);
    var0.zoom(3.0d);
    org.jfree.chart.plot.CombinedRangeXYPlot var17 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var18 = var17.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CombinedRangeXYPlot var19 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var20 = var19.getRangeZeroBaselineStroke();
    var17.setRangeGridlineStroke(var20);
    var17.setDomainMinorGridlinesVisible(true);
    org.jfree.chart.renderer.xy.XYItemRenderer var24 = var17.getRenderer();
    var0.removeChangeListener((org.jfree.chart.event.PlotChangeListener)var17);
    boolean var26 = var17.isDomainGridlinesVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!?hi!=100&amp;hi!=1"+ "'", var13.equals("hi!?hi!=100&amp;hi!=1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }


    org.jfree.data.time.Second var0 = new org.jfree.data.time.Second();
    org.jfree.data.time.TimeSeries var1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)var0);
    org.jfree.data.time.Year var5 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var6 = new org.jfree.data.time.Month(1, var5);
    org.jfree.data.time.RegularTimePeriod var7 = var6.previous();
    long var8 = var6.getSerialIndex();
    org.jfree.data.time.TimeTableXYDataset var9 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var11 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var12 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var11);
    var9.remove((org.jfree.data.time.TimePeriod)var11, (java.lang.Comparable)100, false);
    org.jfree.chart.axis.PeriodAxis var16 = new org.jfree.chart.axis.PeriodAxis("Compass Plot", (org.jfree.data.time.RegularTimePeriod)var6, (org.jfree.data.time.RegularTimePeriod)var11);
    var16.setMinorTickMarksVisible(false);
    org.jfree.data.time.Year var20 = new org.jfree.data.time.Year(100);
    org.jfree.chart.plot.CombinedDomainCategoryPlot var21 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    int var22 = var20.compareTo((java.lang.Object)var21);
    var16.setFirst((org.jfree.data.time.RegularTimePeriod)var20);
    java.lang.String var24 = var20.toString();
    var1.add((org.jfree.data.time.RegularTimePeriod)var20, (java.lang.Number)(short)(-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.update(8, (java.lang.Number)(short)10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1201L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "100"+ "'", var24.equals("100"));

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var2 = var0.getSeriesLinesVisible(10);
    java.awt.Stroke var3 = var0.getErrorIndicatorStroke();
    org.jfree.data.general.DefaultKeyedValues2DDataset var4 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var4.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    var4.setValue((java.lang.Number)0.04d, (java.lang.Comparable)(short)(-1), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var13 = var0.findRangeBounds((org.jfree.data.category.CategoryDataset)var4);
    var0.setShapesFilled((java.lang.Boolean)true);
    var0.setSeriesShapesVisible(2013, true);
    var0.setLinesVisible((java.lang.Boolean)true);
    java.lang.Object var21 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var5 = var4.getLocation();
    java.awt.Dimension var6 = var4.preferredSize();
    var0.setSize(var6);
    java.awt.GraphicsConfiguration var8 = var0.getGraphicsConfiguration();
    
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
    assertNull(var8);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    org.jfree.data.time.TimePeriodValue var5 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var2, (java.lang.Number)10);
    var0.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    boolean var7 = var0.getDrawSharedDomainAxis();
    boolean var8 = var0.getDrawSharedDomainAxis();
    org.jfree.chart.labels.SymbolicXYItemLabelGenerator var10 = new org.jfree.chart.labels.SymbolicXYItemLabelGenerator();
    org.jfree.chart.urls.TimeSeriesURLGenerator var11 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var12 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer(100, (org.jfree.chart.labels.XYToolTipGenerator)var10, (org.jfree.chart.urls.XYURLGenerator)var11);
    boolean var13 = var12.getPlotShapes();
    org.jfree.data.time.Year var15 = new org.jfree.data.time.Year(100);
    java.lang.String[] var18 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var19 = new org.jfree.chart.axis.SymbolAxis("hi!", var18);
    org.jfree.chart.plot.CompassPlot var20 = new org.jfree.chart.plot.CompassPlot();
    boolean var21 = var19.equals((java.lang.Object)var20);
    java.lang.String var22 = var20.getPlotType();
    java.awt.Paint var23 = var20.getRoseCenterPaint();
    java.awt.Paint var24 = var20.getBackgroundPaint();
    javax.swing.JPanel var25 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var26 = var25.getPreferredSize();
    java.awt.image.ColorModel var27 = var25.getColorModel();
    var25.updateUI();
    java.lang.String var29 = var25.toString();
    boolean var30 = var25.getInheritsPopupMenu();
    javax.swing.InputMap var31 = var25.getInputMap();
    var25.nextFocus();
    boolean var33 = var25.getInheritsPopupMenu();
    javax.swing.JPanel var34 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var35 = var34.getPreferredSize();
    java.awt.image.ColorModel var36 = var34.getColorModel();
    var34.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var41 = var34.getForeground();
    var25.setForeground(var41);
    org.jfree.chart.renderer.xy.XYDifferenceRenderer var44 = new org.jfree.chart.renderer.xy.XYDifferenceRenderer(var24, (java.awt.Paint)var41, true);
    org.jfree.chart.LegendItem var47 = var44.getLegendItem(10, 51);
    org.jfree.chart.plot.CategoryPlot var48 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var50 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var51 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var50);
    org.jfree.data.time.TimePeriodValue var53 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var50, (java.lang.Number)10);
    var48.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    java.awt.Stroke var55 = var48.getRangeMinorGridlineStroke();
    var44.setBaseStroke(var55);
    int var57 = var15.compareTo((java.lang.Object)var55);
    var12.setBaseStroke(var55);
    var0.setRangeCrosshairStroke(var55);
    
    // Checks the contract:  equals-hashcode on var0 and var48
    assertTrue("Contract failed: equals-hashcode on var0 and var48", var0.equals(var48) ? var0.hashCode() == var48.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var48 and var0
    assertTrue("Contract failed: equals-hashcode on var48 and var0", var48.equals(var0) ? var48.hashCode() == var0.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var3 and var51
    assertTrue("Contract failed: equals-hashcode on var3 and var51", var3.equals(var51) ? var3.hashCode() == var51.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var51 and var3
    assertTrue("Contract failed: equals-hashcode on var51 and var3", var51.equals(var3) ? var51.hashCode() == var3.hashCode() : true);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }


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
    javax.swing.JPanel var16 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var17 = var16.getPreferredSize();
    java.awt.image.ColorModel var18 = var16.getColorModel();
    var16.updateUI();
    java.lang.String var20 = var16.toString();
    boolean var21 = var16.getInheritsPopupMenu();
    javax.swing.InputMap var22 = var16.getInputMap();
    var16.nextFocus();
    boolean var24 = var16.getInheritsPopupMenu();
    javax.swing.JPanel var25 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var26 = var25.getPreferredSize();
    java.awt.image.ColorModel var27 = var25.getColorModel();
    var25.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var32 = var25.getForeground();
    var16.setForeground(var32);
    var3.setGridBandAlternatePaint((java.awt.Paint)var32);
    org.jfree.data.time.DateRange var35 = new org.jfree.data.time.DateRange();
    var3.setRange((org.jfree.data.Range)var35, false, false);
    double var39 = var35.getLength();
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1.0d);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    double var1 = var0.getCategoryMargin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.2d);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }


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
    var28.setShapesVisible(false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var13,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var13.equals("org.jfree.chart.ChartPanel[,0,0,0var13,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }


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
    org.jfree.chart.renderer.xy.XYBlockRenderer var27 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var28 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var29 = var27.findDomainBounds((org.jfree.data.xy.XYDataset)var28);
    org.jfree.chart.renderer.category.BarRenderer3D var32 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var33 = var32.getItemLabelFont();
    double var34 = var32.getItemLabelAnchorOffset();
    org.jfree.chart.labels.ItemLabelPosition var37 = var32.getNegativeItemLabelPosition(0, 0);
    double var38 = var37.getAngle();
    var27.setNegativeItemLabelPosition(var37);
    var1.setPositiveItemLabelPosition(var37);
    
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
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }


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
    java.awt.Insets var25 = var2.getInsets();
    var2.validate();
    
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
    assertNotNull(var25);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test239"); }


    org.jfree.chart.StandardChartTheme var2 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    org.jfree.chart.plot.DrawingSupplier var3 = var2.getDrawingSupplier();
    org.jfree.chart.plot.dial.StandardDialScale var4 = new org.jfree.chart.plot.dial.StandardDialScale();
    var4.setMajorTickIncrement(10.0d);
    java.awt.Paint var7 = var4.getMinorTickPaint();
    var2.setTickLabelPaint(var7);
    java.awt.Paint var9 = var2.getLegendBackgroundPaint();
    java.awt.Paint var10 = var2.getPlotBackgroundPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test240"); }


    org.jfree.data.xy.CategoryTableXYDataset var0 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.general.DefaultKeyedValues2DDataset var1 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var1.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var6 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var1);
    java.util.List var7 = var1.getColumnKeys();
    org.jfree.data.Range var9 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)var0, var7, true);
    org.jfree.data.general.DatasetGroup var10 = var0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test241"); }


    org.jfree.data.time.DynamicTimeSeriesCollection var2 = new org.jfree.data.time.DynamicTimeSeriesCollection(2, (-1));
    double var4 = var2.getRangeLowerBound(false);
    double var6 = var2.getDomainUpperBound(true);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test242"); }


    org.jfree.chart.renderer.xy.XYSplineRenderer var1 = new org.jfree.chart.renderer.xy.XYSplineRenderer(2147483647);
    var1.clearSeriesPaints(false);
    boolean var4 = var1.getBaseLinesVisible();
    var1.setDrawOutlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test243"); }


    org.jfree.chart.renderer.category.LevelRenderer var0 = new org.jfree.chart.renderer.category.LevelRenderer();
    double var1 = var0.getItemMargin();
    org.jfree.chart.StrokeMap var2 = new org.jfree.chart.StrokeMap();
    java.lang.Object var3 = var2.clone();
    boolean var4 = var0.equals((java.lang.Object)var2);
    var0.setItemLabelAnchorOffset(4.0d);
    org.jfree.data.KeyedObjects2D var8 = new org.jfree.data.KeyedObjects2D();
    javax.swing.JPanel var9 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var10 = var9.getPreferredSize();
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var9.setNextFocusableComponent((java.awt.Component)var11);
    java.util.Locale var13 = var11.getLocale();
    org.jfree.chart.axis.TickUnitSource var14 = org.jfree.chart.axis.LogAxis.createLogTickUnits(var13);
    java.text.NumberFormat var15 = java.text.NumberFormat.getPercentInstance(var13);
    org.jfree.data.time.Year var17 = new org.jfree.data.time.Year();
    var8.addObject((java.lang.Object)var15, (java.lang.Comparable)0.04d, (java.lang.Comparable)var17);
    double[] var21 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var22 = new org.jfree.chart.annotations.XYPolygonAnnotation(var21);
    double[] var25 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var26 = new org.jfree.chart.annotations.XYPolygonAnnotation(var25);
    org.jfree.chart.ClipPath var27 = new org.jfree.chart.ClipPath(var21, var25);
    double[][] var28 = new double[][] { var21};
    double[] var33 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var34 = new org.jfree.chart.annotations.XYPolygonAnnotation(var33);
    double[] var37 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var38 = new org.jfree.chart.annotations.XYPolygonAnnotation(var37);
    org.jfree.chart.ClipPath var39 = new org.jfree.chart.ClipPath(var33, var37);
    double[][] var40 = new double[][] { var33};
    org.jfree.data.category.CategoryDataset var41 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", "jfreechart-onetime-", var40);
    org.jfree.data.category.DefaultIntervalCategoryDataset var42 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var28, var40);
    org.jfree.chart.axis.SubCategoryAxis var44 = new org.jfree.chart.axis.SubCategoryAxis("Compass Plot");
    var44.configure();
    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var46 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var48 = var46.getSeriesLinesVisible(10);
    javax.swing.JPanel var50 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var51 = var50.getPreferredSize();
    boolean var52 = var50.getIgnoreRepaint();
    boolean var53 = var50.isLightweight();
    javax.swing.JPanel var54 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var55 = var54.getPreferredSize();
    javax.swing.JPanel var56 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var54.setNextFocusableComponent((java.awt.Component)var56);
    var54.show();
    javax.swing.JPanel var59 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var60 = var59.getLocation();
    java.awt.Dimension var61 = var59.preferredSize();
    java.awt.Rectangle var62 = var59.bounds();
    var54.scrollRectToVisible(var62);
    var50.setBounds(var62);
    var46.setSeriesShape(15, (java.awt.Shape)var62);
    org.jfree.chart.axis.AxisState var66 = new org.jfree.chart.axis.AxisState();
    org.jfree.chart.title.TextTitle var69 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var70 = var69.isVisible();
    java.lang.Object var71 = var69.clone();
    org.jfree.ui.RectangleEdge var72 = var69.getPosition();
    var66.moveCursor(4.0d, var72);
    double var74 = var0.getItemMiddle((java.lang.Comparable)1201L, (java.lang.Comparable)0.04d, (org.jfree.data.category.CategoryDataset)var42, (org.jfree.chart.axis.CategoryAxis)var44, (java.awt.geom.Rectangle2D)var62, var72);
    java.awt.Stroke var77 = var0.getItemOutlineStroke(2013, 8);
    var0.setSeriesCreateEntities(80, (java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test244"); }


    org.jfree.data.time.TimeSeries var1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)"jfreechart-");
    org.jfree.data.time.Year var4 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var5 = new org.jfree.data.time.Month(1, var4);
    org.jfree.data.time.RegularTimePeriod var6 = var5.previous();
    int var7 = var5.getMonth();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.update((org.jfree.data.time.RegularTimePeriod)var5, (java.lang.Number)10);
      fail("Expected exception of type org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test245"); }


    org.jfree.chart.plot.PiePlot3D var0 = new org.jfree.chart.plot.PiePlot3D();
    boolean var1 = var0.getDarkerSides();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test246"); }


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
    var18.setBaseShapesVisible(true);
    boolean var23 = var18.getItemShapeFilled(2147483647, 52);
    
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
    assertTrue(var23 == true);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test247"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.LogAxis var1 = new org.jfree.chart.axis.LogAxis();
    org.jfree.chart.util.HexNumberFormat var3 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.axis.NumberTickUnit var5 = new org.jfree.chart.axis.NumberTickUnit(0.05d, (java.text.NumberFormat)var3, 1);
    java.lang.String var7 = var5.valueToString(1.0d);
    java.lang.String var9 = var5.valueToString((-0.7853981633974483d));
    var1.setTickUnit(var5, true, false);
    var0.add((org.jfree.chart.axis.TickUnit)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "0var70000001"+ "'", var7.equals("0var70000001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "0var90000000"+ "'", var9.equals("0var90000000"));

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test248"); }


    org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var2 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var1);
    org.jfree.data.gantt.TaskSeries var4 = new org.jfree.data.gantt.TaskSeries("hi!");
    org.jfree.data.time.Week var6 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var7 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var6);
    org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var10 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var9);
    var10.setPercentComplete((java.lang.Double)10.0d);
    org.jfree.data.time.Week var14 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var15 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var14);
    var15.setPercentComplete((java.lang.Double)10.0d);
    var10.addSubtask(var15);
    var7.addSubtask(var10);
    var4.add(var10);
    var2.removeSubtask(var10);
    java.lang.Double var22 = var2.getPercentComplete();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test249"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    var0.setBaseSeriesVisible(true, true);
    var0.setLinesVisible((java.lang.Boolean)true);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test250"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.updateUI();
    java.awt.Dimension var4 = var0.getPreferredSize();
    var0.firePropertyChange("hi!?hi!=100&amp;amp;hi!=1", true, false);
    javax.accessibility.AccessibleContext var9 = var0.getAccessibleContext();
    var0.repaint((-1L), (-334), 8, 1, (-13421773));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test251"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var3 = var2.isAxisLineVisible();
    var2.setAxisLineVisible(true);
    org.jfree.chart.axis.CyclicNumberAxis var8 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var9 = var8.getTickLabelPaint();
    var2.setTickMarkPaint(var9);
    var2.setAxisLineVisible(false);
    double var13 = var2.getLowerBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test252"); }


    org.jfree.data.DefaultKeyedValues var0 = new org.jfree.data.DefaultKeyedValues();
    var0.addValue((java.lang.Comparable)100.0f, (java.lang.Number)2.0f);
    var0.clear();

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test253"); }


    org.jfree.chart.labels.SymbolicXYItemLabelGenerator var2 = new org.jfree.chart.labels.SymbolicXYItemLabelGenerator();
    org.jfree.chart.renderer.xy.StandardXYItemRenderer var3 = new org.jfree.chart.renderer.xy.StandardXYItemRenderer(4, (org.jfree.chart.labels.XYToolTipGenerator)var2);
    org.jfree.chart.urls.StandardXYURLGenerator var7 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    org.jfree.data.statistics.SimpleHistogramDataset var9 = new org.jfree.data.statistics.SimpleHistogramDataset((java.lang.Comparable)100.0f);
    var9.removeAllBins();
    java.lang.String var13 = var7.generateURL((org.jfree.data.xy.XYDataset)var9, 100, 1);
    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var14 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer((-2), (org.jfree.chart.labels.XYToolTipGenerator)var2, (org.jfree.chart.urls.XYURLGenerator)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!?hi!=100&amp;hi!=1"+ "'", var13.equals("hi!?hi!=100&amp;hi!=1"));

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test254"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var3 = new org.jfree.chart.axis.SymbolAxis("hi!", var2);
    var3.setLabelAngle(0.0d);
    var3.setTickLabelsVisible(true);
    var3.setUpperBound(0.75d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test255"); }


    double[] var2 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var3 = new org.jfree.chart.annotations.XYPolygonAnnotation(var2);
    double[] var6 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var7 = new org.jfree.chart.annotations.XYPolygonAnnotation(var6);
    org.jfree.chart.ClipPath var8 = new org.jfree.chart.ClipPath(var2, var6);
    boolean var9 = var8.isFillPath();
    java.awt.Stroke var10 = var8.getDrawStroke();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test256"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    var2.clear();
    double var4 = var2.getMinX();
    org.jfree.data.xy.XYSeriesCollection var5 = new org.jfree.data.xy.XYSeriesCollection(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var8 = var5.getEndX(51, 4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NaN);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test257"); }


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
    double var17 = var0.getRotateX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.5d);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test258"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isCounterClockwise();
    var0.setRadiusGridlinesVisible(false);
    int var4 = var0.getDatasetCount();
    var0.addCornerTextItem("");
    java.lang.String[] var11 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var12 = new org.jfree.chart.axis.SymbolAxis("hi!", var11);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var13 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var15 = var13.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var18 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var19 = var18.getTickLabelPaint();
    var13.setFillPaint(var19, true);
    var12.setGridBandAlternatePaint(var19);
    var12.setFixedDimension(100.0d);
    org.jfree.chart.axis.DateAxis var26 = new org.jfree.chart.axis.DateAxis("0x00000000");
    boolean var28 = var26.isHiddenValue(0L);
    org.jfree.chart.title.TextTitle var31 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var32 = var31.isVisible();
    java.lang.Object var33 = var31.clone();
    var31.setMargin(4.0d, 100.0d, 4.0d, 10.0d);
    double var39 = var31.getWidth();
    javax.swing.JPanel var40 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var41 = var40.getLocation();
    org.jfree.chart.plot.PolarPlot var42 = new org.jfree.chart.plot.PolarPlot();
    boolean var43 = var42.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var48 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var48.setUpperMargin(10.0d);
    var48.setAxisLineVisible(true);
    javax.swing.JPanel var53 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var54 = var53.getLocation();
    java.awt.Dimension var55 = var53.preferredSize();
    java.awt.Rectangle var56 = var53.bounds();
    java.awt.Point var57 = var42.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var48, (java.awt.geom.Rectangle2D)var56);
    java.awt.Rectangle var58 = var40.getBounds(var56);
    var31.setBounds((java.awt.geom.Rectangle2D)var58);
    org.jfree.chart.title.TextTitle var61 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var62 = var61.isVisible();
    java.lang.Object var63 = var61.clone();
    org.jfree.ui.RectangleEdge var64 = var61.getPosition();
    double var65 = var26.valueToJava2D(5.0d, (java.awt.geom.Rectangle2D)var58, var64);
    java.awt.Point var66 = var0.translateToJava2D(5.0d, 0.3d, (org.jfree.chart.axis.ValueAxis)var12, (java.awt.geom.Rectangle2D)var58);
    var0.zoom((-0.7853981633974483d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test259"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(0.02d);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test260"); }


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
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var23 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    java.awt.Shape var24 = var23.getLegendBar();
    org.jfree.chart.entity.ContourEntity var27 = new org.jfree.chart.entity.ContourEntity(var24, "", "hi!");
    var20.setArea(var24);
    java.lang.Comparable var29 = var20.getRowKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 0.0f+ "'", var29.equals(0.0f));

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test261"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    java.lang.Object var1 = var0.clone();
    org.jfree.chart.axis.CategoryLabelPositions var3 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(100.0d);
    org.jfree.chart.title.TextTitle var5 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var6 = var5.isVisible();
    java.lang.Object var7 = var5.clone();
    org.jfree.ui.RectangleEdge var8 = var5.getPosition();
    org.jfree.chart.axis.CategoryLabelPosition var9 = var3.getLabelPosition(var8);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var10 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    boolean var11 = var9.equals((java.lang.Object)var10);
    int var12 = var0.getIndexOf((org.jfree.chart.renderer.xy.XYItemRenderer)var10);
    org.jfree.chart.util.HexNumberFormat var15 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.labels.IntervalCategoryToolTipGenerator var16 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("Combined Range XYPlot", (java.text.NumberFormat)var15);
    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var17 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var18 = var17.clone();
    boolean var19 = var16.equals((java.lang.Object)var17);
    org.jfree.chart.urls.StandardXYURLGenerator var23 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    org.jfree.chart.renderer.xy.XYStepAreaRenderer var24 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(15, (org.jfree.chart.labels.XYToolTipGenerator)var17, (org.jfree.chart.urls.XYURLGenerator)var23);
    var24.setOutline(true);
    var0.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer)var24);
    org.jfree.chart.labels.SymbolicXYItemLabelGenerator var30 = new org.jfree.chart.labels.SymbolicXYItemLabelGenerator();
    org.jfree.chart.urls.TimeSeriesURLGenerator var31 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var32 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer(100, (org.jfree.chart.labels.XYToolTipGenerator)var30, (org.jfree.chart.urls.XYURLGenerator)var31);
    var24.setSeriesItemLabelGenerator(2, (org.jfree.chart.labels.XYItemLabelGenerator)var30);
    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var35 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var36 = var35.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator var37 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.XYStepAreaRenderer var38 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(0, (org.jfree.chart.labels.XYToolTipGenerator)var35, (org.jfree.chart.urls.XYURLGenerator)var37);
    java.lang.String var39 = var37.getItemParameterName();
    java.lang.String var40 = var37.getPrefix();
    java.text.DateFormat var41 = var37.getDateFormat();
    org.jfree.chart.renderer.xy.XYAreaRenderer2 var42 = new org.jfree.chart.renderer.xy.XYAreaRenderer2((org.jfree.chart.labels.XYToolTipGenerator)var30, (org.jfree.chart.urls.XYURLGenerator)var37);
    
    // Checks the contract:  equals-hashcode on var31 and var37
    assertTrue("Contract failed: equals-hashcode on var31 and var37", var31.equals(var37) ? var31.hashCode() == var37.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var37 and var31
    assertTrue("Contract failed: equals-hashcode on var37 and var31", var37.equals(var31) ? var37.hashCode() == var31.hashCode() : true);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test262"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    java.util.Locale var4 = var2.getLocale();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var6 = var5.getPreferredSize();
    java.awt.Dimension var7 = var2.getSize(var6);
    java.awt.event.ContainerListener[] var8 = var2.getContainerListeners();
    var2.removeNotify();
    boolean var10 = var2.requestFocusInWindow();
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var12 = var11.getPreferredSize();
    java.awt.image.ColorModel var13 = var11.getColorModel();
    var11.updateUI();
    java.lang.String var15 = var11.toString();
    boolean var16 = var11.getInheritsPopupMenu();
    javax.swing.JPanel var17 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var18 = var17.getPreferredSize();
    javax.swing.JPanel var19 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var17.setNextFocusableComponent((java.awt.Component)var19);
    java.util.Locale var21 = var19.getLocale();
    javax.swing.JPanel var22 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var23 = var22.getPreferredSize();
    java.awt.Dimension var24 = var19.getSize(var23);
    var11.setSize(var23);
    java.awt.Dimension var26 = var2.getSize(var23);
    boolean var27 = var2.isFocusOwner();
    
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
    assertTrue(var10 == false);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test263"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var1 = var0.getLocation();
    java.awt.Dimension var2 = var0.preferredSize();
    java.awt.Rectangle var3 = var0.bounds();
    var0.setDoubleBuffered(true);
    org.jfree.data.statistics.DefaultStatisticalCategoryDataset var6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    var6.clear();
    java.util.List var8 = var6.getRowKeys();
    java.lang.Object var9 = var6.clone();
    org.jfree.data.Range var11 = var6.getRangeBounds(false);
    javax.swing.JPanel var12 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var13 = var12.getLocation();
    java.awt.Dimension var14 = var12.preferredSize();
    var12.paintImmediately(100, 100, 10, (-1));
    org.jfree.chart.plot.PolarPlot var20 = new org.jfree.chart.plot.PolarPlot();
    boolean var21 = var20.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var26 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var26.setUpperMargin(10.0d);
    var26.setAxisLineVisible(true);
    javax.swing.JPanel var31 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var32 = var31.getLocation();
    java.awt.Dimension var33 = var31.preferredSize();
    java.awt.Rectangle var34 = var31.bounds();
    java.awt.Point var35 = var20.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var26, (java.awt.geom.Rectangle2D)var34);
    boolean var36 = var12.contains(var35);
    var12.show(true);
    javax.swing.ActionMap var39 = var12.getActionMap();
    boolean var40 = var6.equals((java.lang.Object)var39);
    var0.setActionMap(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
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
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test264"); }


    org.jfree.data.time.TimeTableXYDataset var0 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    var0.remove((org.jfree.data.time.TimePeriod)var2, (java.lang.Comparable)100, false);
    double var8 = var0.getDomainLowerBound(false);
    int var9 = var0.getItemCount();
    int var10 = var0.getSeriesCount();
    org.jfree.data.time.Year var12 = new org.jfree.data.time.Year(100);
    java.lang.String[] var15 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var16 = new org.jfree.chart.axis.SymbolAxis("hi!", var15);
    org.jfree.chart.plot.CompassPlot var17 = new org.jfree.chart.plot.CompassPlot();
    boolean var18 = var16.equals((java.lang.Object)var17);
    java.lang.String var19 = var17.getPlotType();
    java.awt.Paint var20 = var17.getRoseCenterPaint();
    java.awt.Paint var21 = var17.getBackgroundPaint();
    javax.swing.JPanel var22 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var23 = var22.getPreferredSize();
    java.awt.image.ColorModel var24 = var22.getColorModel();
    var22.updateUI();
    java.lang.String var26 = var22.toString();
    boolean var27 = var22.getInheritsPopupMenu();
    javax.swing.InputMap var28 = var22.getInputMap();
    var22.nextFocus();
    boolean var30 = var22.getInheritsPopupMenu();
    javax.swing.JPanel var31 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var32 = var31.getPreferredSize();
    java.awt.image.ColorModel var33 = var31.getColorModel();
    var31.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var38 = var31.getForeground();
    var22.setForeground(var38);
    org.jfree.chart.renderer.xy.XYDifferenceRenderer var41 = new org.jfree.chart.renderer.xy.XYDifferenceRenderer(var21, (java.awt.Paint)var38, true);
    org.jfree.chart.LegendItem var44 = var41.getLegendItem(10, 51);
    org.jfree.chart.plot.CategoryPlot var45 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var47 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var48 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var47);
    org.jfree.data.time.TimePeriodValue var50 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var47, (java.lang.Number)10);
    var45.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    java.awt.Stroke var52 = var45.getRangeMinorGridlineStroke();
    var41.setBaseStroke(var52);
    int var54 = var12.compareTo((java.lang.Object)var52);
    boolean var55 = var0.equals((java.lang.Object)var12);
    
    // Checks the contract:  equals-hashcode on var3 and var48
    assertTrue("Contract failed: equals-hashcode on var3 and var48", var3.equals(var48) ? var3.hashCode() == var48.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var48 and var3
    assertTrue("Contract failed: equals-hashcode on var48 and var3", var48.equals(var3) ? var48.hashCode() == var3.hashCode() : true);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test265"); }


    org.jfree.data.statistics.DefaultStatisticalCategoryDataset var0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    var0.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var4 = var0.getMeanValue(1, 80);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test266"); }


    org.jfree.chart.StandardChartTheme var1 = new org.jfree.chart.StandardChartTheme("Compass Plot");
    org.jfree.chart.StandardChartTheme var4 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var5 = var4.getLegendItemPaint();
    org.jfree.chart.plot.DrawingSupplier var6 = var4.getDrawingSupplier();
    var1.setDrawingSupplier(var6);
    java.awt.Paint var8 = var1.getRangeGridlinePaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test267"); }


    org.jfree.chart.renderer.category.StackedBarRenderer3D var2 = new org.jfree.chart.renderer.category.StackedBarRenderer3D((-170.0d), 1.5d);
    var2.setIgnoreZeroValues(false);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test268"); }


    org.jfree.chart.title.TextTitle var1 = new org.jfree.chart.title.TextTitle("hi!");
    var1.setExpandToFitSpace(false);
    java.lang.String var4 = var1.getText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test269"); }


    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var0 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem(1, 0);
    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var4 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    var0.setBaseToolTipGenerator((org.jfree.chart.labels.XYToolTipGenerator)var4);
    javax.swing.JPanel var6 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var7 = var6.getPreferredSize();
    java.awt.image.ColorModel var8 = var6.getColorModel();
    var6.updateUI();
    java.lang.String var10 = var6.toString();
    boolean var11 = var6.getInheritsPopupMenu();
    double[] var14 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var15 = new org.jfree.chart.annotations.XYPolygonAnnotation(var14);
    java.lang.Object var16 = var15.clone();
    org.jfree.chart.event.AnnotationChangeEvent var17 = new org.jfree.chart.event.AnnotationChangeEvent((java.lang.Object)var6, (org.jfree.chart.annotations.Annotation)var15);
    java.awt.LayoutManager var18 = var6.getLayout();
    javax.swing.JPanel var19 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var20 = var19.getPreferredSize();
    javax.swing.JPanel var21 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var19.setNextFocusableComponent((java.awt.Component)var21);
    javax.swing.JPanel var23 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var24 = var23.getLocation();
    java.awt.Dimension var25 = var23.preferredSize();
    var19.setSize(var25);
    javax.swing.JPanel var27 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var28 = var27.getPreferredSize();
    java.awt.image.ColorModel var29 = var27.getColorModel();
    var27.firePropertyChange("", 0.0f, 0.0f);
    javax.swing.JPanel var34 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var35 = var34.getLocation();
    java.awt.Point var36 = var27.getLocation(var35);
    var19.add((java.awt.Component)var27, (java.lang.Object)(-1.0d), 0);
    boolean var40 = var6.isFocusCycleRoot((java.awt.Container)var19);
    boolean var41 = var4.equals((java.lang.Object)var19);
    java.text.NumberFormat var42 = var4.getYFormat();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var10,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var10.equals("org.jfree.chart.ChartPanel[,0,0,0var10,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test270"); }


    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var2 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    boolean var3 = var2.isOutline();
    var2.setUseFillPaint(true);
    org.jfree.chart.StandardChartTheme var8 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var9 = var8.getLegendItemPaint();
    var2.setShapePaint(var9);
    org.jfree.chart.plot.IntervalMarker var11 = new org.jfree.chart.plot.IntervalMarker(0.2d, 0.04d, var9);
    org.jfree.ui.GradientPaintTransformer var12 = var11.getGradientPaintTransformer();
    java.awt.Stroke var13 = var11.getOutlineStroke();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test271"); }


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
    org.jfree.data.general.DefaultKeyedValues2DDataset var52 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var52.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var57 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var52);
    java.util.List var58 = var52.getColumnKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mapDatasetToRangeAxes((-1), var58);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test272"); }


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
    org.jfree.chart.StandardChartTheme var15 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var16 = var15.getLegendItemPaint();
    java.awt.Paint var17 = var15.getSubtitlePaint();
    java.awt.Paint var18 = var15.getTickLabelPaint();
    var11.setDomainCrosshairPaint(var18);
    org.jfree.chart.plot.SeriesRenderingOrder var20 = var11.getSeriesRenderingOrder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test273"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Dimension var7 = var0.getMaximumSize();
    java.awt.Color var8 = var0.getBackground();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    var0.setFocusTraversalPolicyProvider(false);
    
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
    assertTrue(var9 == false);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test274"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var3 = var2.isAxisLineVisible();
    var2.setAxisLineVisible(true);
    org.jfree.data.general.DefaultKeyedValues2DDataset var6 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var6.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var11 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var6);
    var2.setDefaultAutoRange(var11);
    org.jfree.data.Range var13 = var2.getRange();
    java.awt.Stroke var14 = var2.getAdvanceLineStroke();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test275"); }


    org.jfree.data.statistics.HistogramBin var2 = new org.jfree.data.statistics.HistogramBin(0.0d, 1.0d);
    var2.incrementCount();
    int var4 = var2.getCount();
    java.lang.Object var5 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test276"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.encoders.ImageEncoder var2 = org.jfree.chart.encoders.ImageEncoderFactory.newInstance("0x00000000", 1.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test277"); }


    org.jfree.data.time.SimpleTimePeriod var2 = new org.jfree.data.time.SimpleTimePeriod((-59011603200000L), 1L);
    org.jfree.chart.util.ParamChecks.nullNotPermitted((java.lang.Object)(-59011603200000L), "Range[1.0,1.0]");

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test278"); }


    org.jfree.chart.plot.dial.StandardDialScale var0 = new org.jfree.chart.plot.dial.StandardDialScale();
    var0.setMajorTickIncrement(10.0d);
    double var3 = var0.getLowerBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test279"); }


    org.jfree.chart.title.TextTitle var1 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var2 = var1.isVisible();
    java.lang.Object var3 = var1.clone();
    var1.setMargin(4.0d, 100.0d, 4.0d, 10.0d);
    double var9 = var1.getWidth();
    java.awt.Paint var10 = var1.getBackgroundPaint();
    org.jfree.ui.HorizontalAlignment var11 = var1.getHorizontalAlignment();
    org.jfree.chart.plot.CombinedRangeXYPlot var12 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var13 = var12.getRangeZeroBaselineStroke();
    java.lang.String var14 = var12.getPlotType();
    org.jfree.chart.plot.CategoryMarker var16 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var17 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var19 = var17.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var22 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var23 = var22.getTickLabelPaint();
    var17.setFillPaint(var23, true);
    var16.setLabelPaint(var23);
    boolean var27 = var12.removeRangeMarker((org.jfree.chart.plot.Marker)var16);
    javax.swing.JPanel var28 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var29 = var28.getPreferredSize();
    java.awt.image.ColorModel var30 = var28.getColorModel();
    var28.updateUI();
    java.lang.String var32 = var28.toString();
    boolean var33 = var28.getInheritsPopupMenu();
    double[] var36 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var37 = new org.jfree.chart.annotations.XYPolygonAnnotation(var36);
    java.lang.Object var38 = var37.clone();
    org.jfree.chart.event.AnnotationChangeEvent var39 = new org.jfree.chart.event.AnnotationChangeEvent((java.lang.Object)var28, (org.jfree.chart.annotations.Annotation)var37);
    var12.annotationChanged(var39);
    org.jfree.ui.RectangleInsets var41 = var12.getAxisOffset();
    var1.setMargin(var41);
    var1.setText("Compass Plot");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Combined Range XYPlot"+ "'", var14.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var32,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var32.equals("org.jfree.chart.ChartPanel[,0,0,0var32,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test280"); }


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
    org.jfree.ui.RectangleInsets var29 = var0.getAxisOffset();
    var0.configureRangeAxes();
    var0.configureRangeAxes();
    
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
    assertNotNull(var29);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test281"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var3 = var2.isAxisLineVisible();
    var2.setAdvanceLineVisible(false);
    var2.centerRange(3.0d);
    var2.setRangeAboutValue(0.02d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test282"); }


    org.jfree.data.general.DefaultKeyedValueDataset var0 = new org.jfree.data.general.DefaultKeyedValueDataset();
    org.jfree.data.general.DatasetGroup var1 = var0.getGroup();
    org.jfree.data.general.DefaultKeyedValueDataset var2 = new org.jfree.data.general.DefaultKeyedValueDataset((org.jfree.data.KeyedValue)var0);
    var2.setValue((java.lang.Comparable)100.0f, (java.lang.Number)(-1.0d));
    org.jfree.chart.title.TextTitle var7 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var8 = var7.isVisible();
    boolean var9 = var2.equals((java.lang.Object)var8);
    java.lang.Comparable var10 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 100.0f+ "'", var10.equals(100.0f));

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test283"); }


    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var0 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var2 = var0.getSeriesItemLabelGenerator(0);
    java.lang.Boolean var4 = var0.getSeriesVisibleInLegend(2147483647);
    java.lang.Boolean var6 = var0.getSeriesShapesFilled(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test284"); }


    org.jfree.chart.annotations.XYLineAnnotation var4 = new org.jfree.chart.annotations.XYLineAnnotation((-1.0d), (-1.0d), 100.0d, 100.0d);
    org.jfree.data.xy.DefaultIntervalXYDataset var5 = new org.jfree.data.xy.DefaultIntervalXYDataset();
    boolean var6 = var4.hasListener((java.util.EventListener)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var5.getXValue(4, 51);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test285"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.chart.axis.PeriodAxis var6 = new org.jfree.chart.axis.PeriodAxis("Compass Plot");
    org.jfree.chart.axis.PeriodAxisLabelInfo[] var7 = new org.jfree.chart.axis.PeriodAxisLabelInfo[] { };
    var6.setLabelInfo(var7);
    boolean var9 = var0.equals((java.lang.Object)var6);
    int var10 = var0.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test286"); }


    org.jfree.chart.plot.Crosshair var0 = new org.jfree.chart.plot.Crosshair();
    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var3 = var1.getSeriesLinesVisible(10);
    var1.setUseOutlinePaint(true);
    boolean var6 = var0.equals((java.lang.Object)true);
    org.jfree.chart.renderer.category.GanttRenderer var7 = new org.jfree.chart.renderer.category.GanttRenderer();
    java.awt.Paint var8 = var7.getCompletePaint();
    var0.setLabelOutlinePaint(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test287"); }


    org.jfree.data.general.DatasetGroup var1 = new org.jfree.data.general.DatasetGroup("jfreechart-onetime-");

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test288"); }


    org.jfree.data.xy.XYCoordinate var2 = new org.jfree.data.xy.XYCoordinate(0.04d, 0.05d);
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "(0.04, 0.05)"+ "'", var3.equals("(0.04, 0.05)"));

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test289"); }


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
    org.jfree.chart.needle.LineNeedle var31 = new org.jfree.chart.needle.LineNeedle();
    boolean var32 = var28.equals((java.lang.Object)var31);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var13,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var13.equals("org.jfree.chart.ChartPanel[,0,0,0var13,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test290"); }


    org.jfree.chart.plot.CombinedDomainCategoryPlot var0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    java.util.List var1 = var0.getSubplots();
    boolean var2 = var0.isRangePannable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test291"); }


    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var1 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var2 = var1.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator var3 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.XYStepAreaRenderer var4 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(0, (org.jfree.chart.labels.XYToolTipGenerator)var1, (org.jfree.chart.urls.XYURLGenerator)var3);
    var4.setRangeBase(0.75d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test292"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    boolean var2 = var0.getIgnoreRepaint();
    org.jfree.chart.plot.ContourPlot var4 = new org.jfree.chart.plot.ContourPlot();
    var4.setOutlineVisible(false);
    var0.addPropertyChangeListener("Combined Range XYPlot", (java.beans.PropertyChangeListener)var4);
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    var0.reshape(100, 52, 20, 2013);
    javax.swing.JPanel var14 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var15 = var14.getPreferredSize();
    javax.swing.JPanel var16 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var14.setNextFocusableComponent((java.awt.Component)var16);
    java.util.Locale var18 = var16.getLocale();
    javax.swing.JPanel var19 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var20 = var19.getPreferredSize();
    java.awt.Dimension var21 = var16.getSize(var20);
    java.awt.event.ContainerListener[] var22 = var16.getContainerListeners();
    boolean var25 = var16.inside(2147483647, 10);
    javax.swing.JPanel var26 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var27 = var26.getPreferredSize();
    javax.swing.JPanel var28 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var26.setNextFocusableComponent((java.awt.Component)var28);
    java.util.Locale var30 = var28.getLocale();
    javax.swing.JPanel var31 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var32 = var31.getPreferredSize();
    java.awt.Dimension var33 = var28.getSize(var32);
    java.awt.event.ContainerListener[] var34 = var28.getContainerListeners();
    boolean var37 = var28.inside(2147483647, 10);
    var16.setNextFocusableComponent((java.awt.Component)var28);
    java.awt.Insets var39 = var16.getInsets();
    java.awt.Insets var40 = var0.getInsets(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test293"); }


    org.jfree.data.time.DynamicTimeSeriesCollection var2 = new org.jfree.data.time.DynamicTimeSeriesCollection(15, (-334));

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test294"); }


    org.jfree.data.xy.XIntervalSeriesCollection var0 = new org.jfree.data.xy.XIntervalSeriesCollection();
    org.jfree.data.xy.XIntervalSeries var2 = new org.jfree.data.xy.XIntervalSeries((java.lang.Comparable)1201L);
    var0.addSeries(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var0.getEndXValue(0, 52);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test295"); }


    org.jfree.chart.plot.dial.DialTextAnnotation var1 = new org.jfree.chart.plot.dial.DialTextAnnotation("hi!?hi!=100&amp;hi!=1");
    boolean var2 = var1.isClippedToWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test296"); }


    org.jfree.chart.plot.Crosshair var0 = new org.jfree.chart.plot.Crosshair();
    var0.setLabelVisible(true);
    var0.setLabelOutlineVisible(false);
    java.awt.Paint var5 = var0.getPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test297"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var3 = var2.isAxisLineVisible();
    var2.setAxisLineVisible(true);
    var2.setMinorTickMarksVisible(true);
    org.jfree.ui.RectangleInsets var8 = var2.getTickLabelInsets();
    org.jfree.chart.util.HexNumberFormat var10 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.axis.NumberTickUnit var12 = new org.jfree.chart.axis.NumberTickUnit(0.05d, (java.text.NumberFormat)var10, 1);
    java.lang.String var14 = var12.valueToString(1.0d);
    var2.setTickUnit(var12, true, false);
    float var18 = var2.getTickMarkOutsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "0var140000001"+ "'", var14.equals("0var140000001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2.0f);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test298"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.image.ColorModel var2 = var0.getColorModel();
    var0.updateUI();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.getInheritsPopupMenu();
    javax.swing.InputMap var6 = var0.getInputMap();
    var0.nextFocus();
    boolean var8 = var0.getInheritsPopupMenu();
    javax.swing.JPanel var9 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var10 = var9.getPreferredSize();
    java.awt.image.ColorModel var11 = var9.getColorModel();
    var9.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var16 = var9.getForeground();
    var0.setForeground(var16);
    var0.disable();
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test299"); }


    org.jfree.chart.util.HexNumberFormat var2 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.labels.StandardCrosshairLabelGenerator var3 = new org.jfree.chart.labels.StandardCrosshairLabelGenerator("", (java.text.NumberFormat)var2);
    boolean var4 = var2.isParseIntegerOnly();
    org.jfree.chart.labels.IntervalCategoryItemLabelGenerator var5 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator("Compass Plot", (java.text.NumberFormat)var2);
    java.text.NumberFormat var6 = var5.getNumberFormat();
    java.lang.Object var7 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test300"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    double var4 = var2.getLowerClip();
    org.jfree.chart.urls.CategoryURLGenerator var6 = var2.getSeriesItemURLGenerator(100);
    boolean var7 = var2.getShadowsVisible();
    org.jfree.chart.renderer.category.BarRenderer var9 = new org.jfree.chart.renderer.category.BarRenderer();
    org.jfree.chart.labels.ItemLabelPosition var12 = var9.getPositiveItemLabelPosition(10, 2013);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setSeriesNegativeItemLabelPosition((-2), var12, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test301"); }


    org.jfree.chart.renderer.category.MinMaxCategoryRenderer var0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    var0.setDrawLines(true);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test302"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    double var1 = var0.getDomainCrosshairValue();
    org.jfree.chart.plot.dial.DialCap var2 = new org.jfree.chart.plot.dial.DialCap();
    java.awt.Paint var3 = var2.getOutlinePaint();
    double var4 = var2.getRadius();
    org.jfree.chart.renderer.category.DefaultCategoryItemRenderer var5 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var7 = var5.getSeriesItemURLGenerator(2147483647);
    java.awt.Paint var8 = var5.getBaseOutlinePaint();
    var2.setOutlinePaint(var8);
    var0.setRangeGridlinePaint(var8);
    java.awt.Paint var11 = var0.getRangeTickBandPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test303"); }


    org.jfree.data.xy.DefaultXYZDataset var0 = new org.jfree.data.xy.DefaultXYZDataset();
    org.jfree.data.Range var2 = org.jfree.data.general.DatasetUtilities.iterateZBounds((org.jfree.data.xy.XYZDataset)var0, false);
    org.jfree.chart.plot.CombinedDomainCategoryPlot var11 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    java.util.List var12 = var11.getSubplots();
    org.jfree.data.statistics.BoxAndWhiskerItem var13 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)(-2208960000000L), (java.lang.Number)Double.NaN, (java.lang.Number)51, (java.lang.Number)0.05d, (java.lang.Number)(byte)100, (java.lang.Number)2.0f, (java.lang.Number)15, (java.lang.Number)1.0f, var12);
    org.jfree.chart.axis.CyclicNumberAxis var16 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var17 = var16.isAxisLineVisible();
    var16.setAxisLineVisible(true);
    org.jfree.data.general.DefaultKeyedValues2DDataset var20 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var20.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var25 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var20);
    var16.setDefaultAutoRange(var25);
    org.jfree.data.Range var27 = var16.getRange();
    org.jfree.data.Range var29 = org.jfree.data.general.DatasetUtilities.findZBounds((org.jfree.data.xy.XYZDataset)var0, var12, var27, true);
    int var30 = var0.getSeriesCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test304"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    double var4 = var2.getItemLabelAnchorOffset();
    org.jfree.chart.axis.CyclicNumberAxis var8 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var9 = var8.getTickLabelPaint();
    var2.setLegendTextPaint(0, var9);
    var2.setItemLabelsVisible((java.lang.Boolean)false, true);
    org.jfree.ui.GradientPaintTransformer var14 = var2.getGradientPaintTransformer();
    var2.setMinimumBarLength(174.49d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test305"); }


    org.jfree.chart.renderer.category.StackedBarRenderer3D var2 = new org.jfree.chart.renderer.category.StackedBarRenderer3D((-170.0d), 1.5d);
    boolean var3 = var2.getDataBoundsIncludesVisibleSeriesOnly();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test306"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    float var3 = var2.getMinorTickMarkInsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0f);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test307"); }


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
    org.jfree.ui.RectangleInsets var29 = var0.getAxisOffset();
    boolean var30 = var0.isOutlineVisible();
    var0.clearRangeMarkers(51);
    org.jfree.chart.renderer.xy.XYItemRenderer var34 = var0.getRenderer(2013);
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test308"); }


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
    var3.setLabelVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test309"); }


    org.jfree.chart.axis.LogAxis var0 = new org.jfree.chart.axis.LogAxis();
    org.jfree.chart.editor.DefaultLogAxisEditor var1 = new org.jfree.chart.editor.DefaultLogAxisEditor(var0);
    var0.setAutoRangeMinimumSize(360.0d);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test310"); }


    org.jfree.chart.needle.LineNeedle var4 = new org.jfree.chart.needle.LineNeedle();
    java.awt.Stroke var5 = var4.getOutlineStroke();
    org.jfree.chart.StandardChartTheme var8 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var9 = var8.getLegendItemPaint();
    org.jfree.chart.annotations.XYBoxAnnotation var10 = new org.jfree.chart.annotations.XYBoxAnnotation(0.0d, 0.2d, 0.05d, (-90.0d), var5, var9);
    org.jfree.chart.renderer.xy.DefaultXYItemRenderer var11 = new org.jfree.chart.renderer.xy.DefaultXYItemRenderer();
    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var12 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var13 = var12.clone();
    var11.setBaseToolTipGenerator((org.jfree.chart.labels.XYToolTipGenerator)var12);
    boolean var15 = var10.equals((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test311"); }


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
    org.jfree.chart.axis.CyclicNumberAxis var20 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var21 = var20.isAxisLineVisible();
    var20.setAxisLineVisible(true);
    var20.setMinorTickMarksVisible(true);
    org.jfree.chart.plot.CombinedRangeXYPlot var26 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var27 = var26.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CombinedRangeXYPlot var28 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var29 = var28.getRangeZeroBaselineStroke();
    var26.setRangeGridlineStroke(var29);
    var26.setDomainMinorGridlinesVisible(true);
    var26.setRangeZeroBaselineVisible(true);
    var20.setPlot((org.jfree.chart.plot.Plot)var26);
    var0.setDomainAxis((org.jfree.chart.axis.ValueAxis)var20);
    var0.mapDatasetToRangeAxis(2013, 2013);
    org.jfree.chart.axis.ValueAxis var40 = var0.getRangeAxis();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Paint var42 = var0.getQuadrantPaint(8);
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
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test312"); }


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
    var0.enableInputMethods(true);
    
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

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test313"); }


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
    var0.setAngle(1.5d);
    
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

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test314"); }


    org.jfree.data.xy.YWithXInterval var3 = new org.jfree.data.xy.YWithXInterval(15.0d, 1.0d, 100.0d);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test315"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeRow(19);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test316"); }


    org.jfree.chart.renderer.xy.XYBlockRenderer var0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.chart.renderer.xy.XYBlockRenderer var1 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.chart.renderer.PaintScale var2 = var1.getPaintScale();
    org.jfree.chart.renderer.PaintScale var3 = var1.getPaintScale();
    var0.setPaintScale(var3);
    java.lang.String[] var7 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var8 = new org.jfree.chart.axis.SymbolAxis("hi!", var7);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var9 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var11 = var9.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var14 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var15 = var14.getTickLabelPaint();
    var9.setFillPaint(var15, true);
    var8.setGridBandAlternatePaint(var15);
    var8.setFixedDimension(100.0d);
    var8.setGridBandsVisible(false);
    var8.centerRange(0.04d);
    org.jfree.chart.title.PaintScaleLegend var25 = new org.jfree.chart.title.PaintScaleLegend(var3, (org.jfree.chart.axis.ValueAxis)var8);
    java.awt.Paint var26 = var25.getBackgroundPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test317"); }


    org.jfree.chart.plot.Crosshair var0 = new org.jfree.chart.plot.Crosshair();
    var0.setLabelVisible(true);
    org.jfree.chart.renderer.xy.XYBlockRenderer var3 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var4 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var5 = var3.findDomainBounds((org.jfree.data.xy.XYDataset)var4);
    org.jfree.chart.renderer.category.BarRenderer3D var8 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var9 = var8.getItemLabelFont();
    double var10 = var8.getItemLabelAnchorOffset();
    org.jfree.chart.labels.ItemLabelPosition var13 = var8.getNegativeItemLabelPosition(0, 0);
    double var14 = var13.getAngle();
    var3.setNegativeItemLabelPosition(var13);
    org.jfree.chart.labels.XYSeriesLabelGenerator var16 = var3.getLegendItemToolTipGenerator();
    org.jfree.chart.title.LegendTitle var17 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var3);
    org.jfree.chart.block.BlockContainer var18 = var17.getItemContainer();
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
    javax.swing.JPanel var39 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var40 = var39.getPreferredSize();
    javax.swing.JPanel var41 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var39.setNextFocusableComponent((java.awt.Component)var41);
    java.util.Locale var43 = var41.getLocale();
    javax.swing.JPanel var44 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var45 = var44.getPreferredSize();
    java.awt.Dimension var46 = var41.getSize(var45);
    java.awt.event.ContainerListener[] var47 = var41.getContainerListeners();
    javax.swing.JPanel var48 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var49 = var48.getPreferredSize();
    java.awt.image.ColorModel var50 = var48.getColorModel();
    var48.updateUI();
    java.lang.String var52 = var48.toString();
    java.awt.Color var53 = var48.getForeground();
    var41.setBackground(var53);
    var19.setOutlinePaint((java.awt.Paint)var53);
    org.jfree.ui.RectangleInsets var56 = var19.getInsets();
    org.jfree.ui.RectangleAnchor var57 = var19.getFrameAnchor();
    var17.setLegendItemGraphicLocation(var57);
    var0.setLabelAnchor(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
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
    assertNotNull(var40);
    
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
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var52,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var52.equals("org.jfree.chart.ChartPanel[,0,0,0var52,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test318"); }


    org.jfree.data.time.Year var1 = new org.jfree.data.time.Year(51);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test319"); }


    org.jfree.data.gantt.TaskSeries var1 = new org.jfree.data.gantt.TaskSeries("[size=0x00000000]");

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test320"); }


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
    boolean var22 = var9.contains(0.2d);
    
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
    assertTrue(var22 == false);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test321"); }


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
    org.jfree.chart.plot.PolarAxisLocation var21 = var0.getAxisLocation(80);
    
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
    assertNull(var21);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test322"); }


    org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var2 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var1);
    org.jfree.data.gantt.TaskSeries var4 = new org.jfree.data.gantt.TaskSeries("hi!");
    org.jfree.data.time.Week var6 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var7 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var6);
    org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var10 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var9);
    var10.setPercentComplete((java.lang.Double)10.0d);
    org.jfree.data.time.Week var14 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var15 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var14);
    var15.setPercentComplete((java.lang.Double)10.0d);
    var10.addSubtask(var15);
    var7.addSubtask(var10);
    var4.add(var10);
    var2.removeSubtask(var10);
    int var22 = var2.getSubtaskCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test323"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    boolean var5 = var2.getItemVisible(0, 0);
    java.awt.Font var6 = var2.getBaseLegendTextFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test324"); }


    org.jfree.data.general.DefaultValueDataset var1 = new org.jfree.data.general.DefaultValueDataset((java.lang.Number)(byte)1);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test325"); }


    org.jfree.chart.util.LogFormat var3 = new org.jfree.chart.util.LogFormat(174.49d, "RectangleConstraint[LengthConstraintType.FIXED: width=0.04, height=0.0]", false);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test326"); }


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
    org.jfree.chart.axis.CyclicNumberAxis var20 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var21 = var20.isAxisLineVisible();
    var20.setAxisLineVisible(true);
    var20.setMinorTickMarksVisible(true);
    org.jfree.chart.plot.CombinedRangeXYPlot var26 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var27 = var26.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CombinedRangeXYPlot var28 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var29 = var28.getRangeZeroBaselineStroke();
    var26.setRangeGridlineStroke(var29);
    var26.setDomainMinorGridlinesVisible(true);
    var26.setRangeZeroBaselineVisible(true);
    var20.setPlot((org.jfree.chart.plot.Plot)var26);
    var0.setDomainAxis((org.jfree.chart.axis.ValueAxis)var20);
    var0.mapDatasetToRangeAxis(2013, 2013);
    var0.setRangeGridlinesVisible(false);
    java.util.List var42 = var0.getSubplots();
    org.jfree.chart.plot.CombinedRangeXYPlot var43 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Paint var44 = var43.getRangeCrosshairPaint();
    var0.add((org.jfree.chart.plot.XYPlot)var43, 80);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test327"); }


    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var0 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    java.awt.Paint var1 = var0.getShapePaint();
    int var2 = var0.getPassCount();
    boolean var3 = var0.getPlotShapes();
    int var4 = var0.getPassCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test328"); }


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
    org.jfree.chart.renderer.DefaultPolarItemRenderer var17 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
    var0.setRenderer(10, (org.jfree.chart.renderer.PolarItemRenderer)var17, true);
    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var22 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var23 = var22.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator var24 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.XYStepAreaRenderer var25 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(0, (org.jfree.chart.labels.XYToolTipGenerator)var22, (org.jfree.chart.urls.XYURLGenerator)var24);
    org.jfree.chart.renderer.xy.StandardXYItemRenderer var26 = new org.jfree.chart.renderer.xy.StandardXYItemRenderer(15, (org.jfree.chart.labels.XYToolTipGenerator)var22);
    java.text.NumberFormat var27 = var22.getYFormat();
    var17.setBaseToolTipGenerator((org.jfree.chart.labels.XYToolTipGenerator)var22);
    java.lang.String[] var31 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var32 = new org.jfree.chart.axis.SymbolAxis("hi!", var31);
    org.jfree.chart.plot.CompassPlot var33 = new org.jfree.chart.plot.CompassPlot();
    boolean var34 = var32.equals((java.lang.Object)var33);
    java.lang.String var35 = var33.getPlotType();
    java.awt.Paint var36 = var33.getRoseCenterPaint();
    java.awt.Paint var37 = var33.getBackgroundPaint();
    javax.swing.JPanel var38 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var39 = var38.getPreferredSize();
    java.awt.image.ColorModel var40 = var38.getColorModel();
    var38.updateUI();
    java.lang.String var42 = var38.toString();
    boolean var43 = var38.getInheritsPopupMenu();
    javax.swing.InputMap var44 = var38.getInputMap();
    var38.nextFocus();
    boolean var46 = var38.getInheritsPopupMenu();
    javax.swing.JPanel var47 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var48 = var47.getPreferredSize();
    java.awt.image.ColorModel var49 = var47.getColorModel();
    var47.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var54 = var47.getForeground();
    var38.setForeground(var54);
    org.jfree.chart.renderer.xy.XYDifferenceRenderer var57 = new org.jfree.chart.renderer.xy.XYDifferenceRenderer(var37, (java.awt.Paint)var54, true);
    org.jfree.chart.labels.StandardXYSeriesLabelGenerator var58 = new org.jfree.chart.labels.StandardXYSeriesLabelGenerator();
    var57.setLegendItemLabelGenerator((org.jfree.chart.labels.XYSeriesLabelGenerator)var58);
    var17.setLegendItemURLGenerator((org.jfree.chart.labels.XYSeriesLabelGenerator)var58);
    boolean var61 = var17.getUseFillPaint();
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Compass Plot"+ "'", var35.equals("Compass Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var42,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var42.equals("org.jfree.chart.ChartPanel[,0,0,0var42,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test329"); }


    org.jfree.chart.axis.CyclicNumberAxis var3 = new org.jfree.chart.axis.CyclicNumberAxis(1.0d, 4.0d, "");
    var3.setInverted(true);
    var3.setUpperMargin((-0.21460183660255172d));

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test330"); }


    org.jfree.chart.renderer.xy.XYDotRenderer var0 = new org.jfree.chart.renderer.xy.XYDotRenderer();
    java.lang.Object var1 = var0.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDotWidth((-13421773));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test331"); }


    org.jfree.chart.StandardChartTheme var2 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var3 = var2.getLegendItemPaint();
    java.awt.Paint var4 = var2.getSubtitlePaint();
    java.awt.Paint var5 = var2.getTickLabelPaint();
    java.awt.Paint var6 = var2.getThermometerPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test332"); }


    org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer var0 = new org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer();
    org.jfree.chart.StandardChartTheme var3 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var4 = var3.getLegendItemPaint();
    var0.setBoxPaint(var4);
    java.lang.Number[][] var6 = new java.lang.Number[][] { };
    java.lang.Number[][] var7 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var6, var7);
    int var10 = var8.getRowIndex((java.lang.Comparable)'a');
    boolean var11 = var0.equals((java.lang.Object)var8);
    var0.setFillBox(true);
    java.awt.Paint var14 = var0.getArtifactPaint();
    
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
    assertNotNull(var14);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test333"); }


    org.jfree.chart.annotations.XYPointerAnnotation var4 = new org.jfree.chart.annotations.XYPointerAnnotation("Range[0.0,0.0]", 0.04d, 10.0d, (-0.21460183660255172d));

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test334"); }


    org.jfree.chart.ChartRenderingInfo var0 = new org.jfree.chart.ChartRenderingInfo();
    org.jfree.chart.axis.DateAxis var2 = new org.jfree.chart.axis.DateAxis("0x00000000");
    boolean var4 = var2.isHiddenValue(0L);
    org.jfree.chart.title.TextTitle var7 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var8 = var7.isVisible();
    java.lang.Object var9 = var7.clone();
    var7.setMargin(4.0d, 100.0d, 4.0d, 10.0d);
    double var15 = var7.getWidth();
    javax.swing.JPanel var16 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var17 = var16.getLocation();
    org.jfree.chart.plot.PolarPlot var18 = new org.jfree.chart.plot.PolarPlot();
    boolean var19 = var18.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var24 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var24.setUpperMargin(10.0d);
    var24.setAxisLineVisible(true);
    javax.swing.JPanel var29 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var30 = var29.getLocation();
    java.awt.Dimension var31 = var29.preferredSize();
    java.awt.Rectangle var32 = var29.bounds();
    java.awt.Point var33 = var18.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var24, (java.awt.geom.Rectangle2D)var32);
    java.awt.Rectangle var34 = var16.getBounds(var32);
    var7.setBounds((java.awt.geom.Rectangle2D)var34);
    org.jfree.chart.title.TextTitle var37 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var38 = var37.isVisible();
    java.lang.Object var39 = var37.clone();
    org.jfree.ui.RectangleEdge var40 = var37.getPosition();
    double var41 = var2.valueToJava2D(5.0d, (java.awt.geom.Rectangle2D)var34, var40);
    var0.setChartArea((java.awt.geom.Rectangle2D)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test335"); }


    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var2 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    java.awt.Shape var3 = var2.getLegendBar();
    org.jfree.chart.entity.XYAnnotationEntity var7 = new org.jfree.chart.entity.XYAnnotationEntity(var3, 8, "-4,-4,4,4", "hi!");
    var7.setRendererIndex(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test336"); }


    org.jfree.data.xml.RootHandler var0 = new org.jfree.data.xml.RootHandler();
    var0.endElement("", "hi!", "hi!");
    char[] var5 = new char[] { };
    var0.characters(var5, (-1), (-1));
    org.jfree.data.xml.RootHandler var9 = new org.jfree.data.xml.RootHandler();
    var9.endElement("", "hi!", "hi!");
    var9.endDocument();
    org.jfree.data.xml.CategorySeriesHandler var15 = new org.jfree.data.xml.CategorySeriesHandler(var9);
    var9.endElement("Compass Plot", "Combined Range XYPlot", "Combined Range XYPlot");
    org.jfree.data.xml.ItemHandler var20 = new org.jfree.data.xml.ItemHandler(var0, (org.xml.sax.helpers.DefaultHandler)var9);
    var0.endPrefixMapping("hi!?hi!=15&amp;hi!=10");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test337"); }


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
    org.jfree.data.xy.VectorDataItem var24 = new org.jfree.data.xy.VectorDataItem((-1.0d), 10.0d, 2.0d, (-1.0d));
    double var25 = var24.getXValue();
    double[] var28 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var29 = new org.jfree.chart.annotations.XYPolygonAnnotation(var28);
    double[] var32 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var33 = new org.jfree.chart.annotations.XYPolygonAnnotation(var32);
    org.jfree.chart.ClipPath var34 = new org.jfree.chart.ClipPath(var28, var32);
    double[][] var35 = new double[][] { var28};
    double[] var40 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var41 = new org.jfree.chart.annotations.XYPolygonAnnotation(var40);
    double[] var44 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var45 = new org.jfree.chart.annotations.XYPolygonAnnotation(var44);
    org.jfree.chart.ClipPath var46 = new org.jfree.chart.ClipPath(var40, var44);
    double[][] var47 = new double[][] { var40};
    org.jfree.data.category.CategoryDataset var48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", "jfreechart-onetime-", var47);
    org.jfree.data.category.DefaultIntervalCategoryDataset var49 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var35, var47);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.addSeries((java.lang.Comparable)var24, var47);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var25 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test338"); }


    org.jfree.chart.renderer.category.DefaultCategoryItemRenderer var0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = var0.getSeriesItemURLGenerator(2147483647);
    boolean var3 = var0.getBaseShapesVisible();
    var0.setSeriesItemLabelsVisible(1, (java.lang.Boolean)false);
    int var7 = var0.getPassCount();
    var0.setLinesVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test339"); }


    org.jfree.chart.renderer.xy.XYBlockRenderer var0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var1 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var2 = var0.findDomainBounds((org.jfree.data.xy.XYDataset)var1);
    java.lang.Number var3 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset)var1);
    var1.add(100.0d, Double.NaN, "jfreechart-onetime-");
    var1.clear();
    int var10 = var1.getItemCount(8);
    org.jfree.data.xy.XYSeries var15 = org.jfree.data.time.MovingAverage.createMovingAverage((org.jfree.data.xy.XYDataset)var1, 2013, "hi!?hi!=100&amp;hi!=1", 0.3d, 1.0d);
    java.lang.Object var16 = var15.clone();
    double var17 = var15.getMaxX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + Double.NaN+ "'", var3.equals(Double.NaN));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == Double.NaN);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test340"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var1 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var2 = var0.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var1);
    org.jfree.chart.plot.dial.DialValueIndicator var3 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var4 = var3.getInsets();
    int var5 = var0.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var3);
    java.awt.Stroke var6 = var3.getOutlineStroke();
    java.awt.Paint var7 = var3.getBackgroundPaint();
    javax.swing.JPanel var8 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var9 = var8.getPreferredSize();
    boolean var10 = var8.getIgnoreRepaint();
    boolean var11 = var8.isLightweight();
    javax.swing.JPanel var12 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var13 = var12.getPreferredSize();
    javax.swing.JPanel var14 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var12.setNextFocusableComponent((java.awt.Component)var14);
    var12.show();
    javax.swing.JPanel var17 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var18 = var17.getLocation();
    java.awt.Dimension var19 = var17.preferredSize();
    java.awt.Rectangle var20 = var17.bounds();
    var12.scrollRectToVisible(var20);
    var8.setBounds(var20);
    org.jfree.chart.renderer.category.BarRenderer3D var25 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var26 = var25.getItemLabelFont();
    java.awt.Shape var27 = var25.getBaseLegendShape();
    double var28 = var25.getItemMargin();
    org.jfree.chart.plot.CombinedRangeXYPlot var29 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var30 = var29.getRangeZeroBaselineStroke();
    var25.setStroke(var30, false);
    org.jfree.chart.renderer.category.BarRenderer3D var35 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var36 = var35.getItemLabelFont();
    double var37 = var35.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var40 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var41 = var40.getItemLabelFont();
    java.awt.Shape var42 = var40.getBaseLegendShape();
    var35.setShape(var42);
    org.jfree.chart.StandardChartTheme var46 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var47 = var46.getLegendItemPaint();
    var35.setItemLabelPaint(var47);
    org.jfree.chart.annotations.XYShapeAnnotation var49 = new org.jfree.chart.annotations.XYShapeAnnotation((java.awt.Shape)var20, var30, var47);
    var3.setPaint(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test341"); }


    org.jfree.chart.renderer.xy.XYBlockRenderer var0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.chart.renderer.PaintScale var1 = var0.getPaintScale();
    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var2 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    boolean var3 = var2.isOutline();
    var2.setUseFillPaint(true);
    org.jfree.chart.StandardChartTheme var8 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var9 = var8.getLegendItemPaint();
    var2.setShapePaint(var9);
    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    int var14 = var12.getItemCount((-13421773));
    boolean var15 = var2.equals((java.lang.Object)var12);
    org.jfree.data.Range var16 = var0.findDomainBounds((org.jfree.data.xy.XYDataset)var12);
    var0.setBlockHeight(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test342"); }


    org.jfree.data.time.TimeTableXYDataset var0 = new org.jfree.data.time.TimeTableXYDataset();
    int var2 = var0.getItemCount((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test343"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    org.jfree.data.general.DatasetGroup var2 = var1.getGroup();
    java.lang.Comparable var4 = var1.getSeriesKey(51);
    java.lang.Comparable var6 = var1.getSeriesKey(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (short)10+ "'", var4.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)10+ "'", var6.equals((short)10));

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test344"); }


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
    java.lang.Number var25 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue((org.jfree.data.category.CategoryDataset)var23);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + 1.0d+ "'", var25.equals(1.0d));

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test345"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    boolean var2 = var0.getIgnoreRepaint();
    boolean var3 = var0.isLightweight();
    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var5 = var4.getPreferredSize();
    javax.swing.JPanel var6 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var4.setNextFocusableComponent((java.awt.Component)var6);
    var4.show();
    javax.swing.JPanel var9 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var10 = var9.getLocation();
    java.awt.Dimension var11 = var9.preferredSize();
    java.awt.Rectangle var12 = var9.bounds();
    var4.scrollRectToVisible(var12);
    var0.setBounds(var12);
    org.jfree.chart.renderer.category.BarRenderer3D var17 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var18 = var17.getItemLabelFont();
    java.awt.Shape var19 = var17.getBaseLegendShape();
    double var20 = var17.getItemMargin();
    org.jfree.chart.plot.CombinedRangeXYPlot var21 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var22 = var21.getRangeZeroBaselineStroke();
    var17.setStroke(var22, false);
    org.jfree.chart.renderer.category.BarRenderer3D var27 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var28 = var27.getItemLabelFont();
    double var29 = var27.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var32 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var33 = var32.getItemLabelFont();
    java.awt.Shape var34 = var32.getBaseLegendShape();
    var27.setShape(var34);
    org.jfree.chart.StandardChartTheme var38 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var39 = var38.getLegendItemPaint();
    var27.setItemLabelPaint(var39);
    org.jfree.chart.annotations.XYShapeAnnotation var41 = new org.jfree.chart.annotations.XYShapeAnnotation((java.awt.Shape)var12, var22, var39);
    org.jfree.chart.entity.ChartEntity var44 = new org.jfree.chart.entity.ChartEntity((java.awt.Shape)var12, "100", "<map id=\"org.jfree.chart.event.AnnotationChangeEvent[source=org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]]\" name=\"org.jfree.chart.event.AnnotationChangeEvent[source=org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]]\">\r\n</map>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test346"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.DateFormat var1 = java.text.DateFormat.getTimeInstance((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test347"); }


    org.jfree.data.time.DynamicTimeSeriesCollection var2 = new org.jfree.data.time.DynamicTimeSeriesCollection(2, (-1));
    double var4 = var2.getRangeLowerBound(false);
    org.jfree.data.Range var6 = var2.getDomainBounds(false);

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test348"); }


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
    org.jfree.chart.axis.CyclicNumberAxis var20 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var21 = var20.isAxisLineVisible();
    var20.setAxisLineVisible(true);
    var20.setMinorTickMarksVisible(true);
    org.jfree.chart.plot.CombinedRangeXYPlot var26 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var27 = var26.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CombinedRangeXYPlot var28 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var29 = var28.getRangeZeroBaselineStroke();
    var26.setRangeGridlineStroke(var29);
    var26.setDomainMinorGridlinesVisible(true);
    var26.setRangeZeroBaselineVisible(true);
    var20.setPlot((org.jfree.chart.plot.Plot)var26);
    var0.setDomainAxis((org.jfree.chart.axis.ValueAxis)var20);
    var0.mapDatasetToRangeAxis(2013, 2013);
    var0.setRangeGridlinesVisible(false);
    boolean var42 = var0.isDomainCrosshairLockedOnData();
    org.jfree.chart.entity.StandardEntityCollection var43 = new org.jfree.chart.entity.StandardEntityCollection();
    org.jfree.chart.entity.ChartEntity var46 = var43.getEntity(0.0d, 2.0d);
    boolean var47 = var0.equals((java.lang.Object)0.0d);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test349"); }


    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var1 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer(8);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test350"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    org.jfree.data.time.TimePeriodValue var5 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var2, (java.lang.Number)10);
    var0.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    boolean var7 = var0.getDrawSharedDomainAxis();
    boolean var8 = var0.getDrawSharedDomainAxis();
    var0.clearRangeMarkers(0);
    var0.clearDomainMarkers();
    var0.setDrawSharedDomainAxis(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test351"); }


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
    var2.transferFocusDownCycle();
    
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

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test352"); }


    org.jfree.chart.plot.ContourPlot var0 = new org.jfree.chart.plot.ContourPlot();
    double var1 = var0.getDomainCrosshairValue();
    java.lang.String[] var4 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var5 = new org.jfree.chart.axis.SymbolAxis("hi!", var4);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var6 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var8 = var6.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var11 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var12 = var11.getTickLabelPaint();
    var6.setFillPaint(var12, true);
    var5.setGridBandAlternatePaint(var12);
    var0.setDomainAxis((org.jfree.chart.axis.ValueAxis)var5);
    boolean var17 = var5.isGridBandsVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test353"); }


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
    double var24 = var3.getLowerMargin();
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.05d);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test354"); }


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
    java.awt.Paint var39 = var0.getDomainTickBandPaint();
    org.jfree.data.contour.NonGridContourDataset var40 = new org.jfree.data.contour.NonGridContourDataset();
    int[] var41 = var40.getXIndices();
    org.jfree.chart.renderer.xy.XYItemRenderer var42 = var0.getRendererForDataset((org.jfree.data.xy.XYDataset)var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var45 = var40.getX(2, (-334));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test355"); }


    org.jfree.data.xy.VectorDataItem var4 = new org.jfree.data.xy.VectorDataItem((-1.0d), 10.0d, 2.0d, (-1.0d));
    org.jfree.data.xy.Vector var5 = var4.getVector();
    double var6 = var4.getXValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1.0d));

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test356"); }


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
    org.jfree.chart.plot.CategoryMarker var18 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var19 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var21 = var19.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var24 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var25 = var24.getTickLabelPaint();
    var19.setFillPaint(var25, true);
    var18.setLabelPaint(var25);
    org.jfree.chart.plot.CompassPlot var29 = new org.jfree.chart.plot.CompassPlot();
    var18.addChangeListener((org.jfree.chart.event.MarkerChangeListener)var29);
    org.jfree.chart.renderer.category.BarRenderer3D var33 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var34 = var33.getItemLabelFont();
    double var35 = var33.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var38 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var39 = var38.getItemLabelFont();
    java.awt.Shape var40 = var38.getBaseLegendShape();
    var33.setShape(var40);
    org.jfree.chart.StandardChartTheme var44 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var45 = var44.getLegendItemPaint();
    var33.setItemLabelPaint(var45);
    java.awt.Paint var48 = var33.lookupSeriesFillPaint((-1));
    var29.setBackgroundPaint(var48);
    var0.setRangeZeroBaselinePaint(var48);
    
    // Checks the contract:  equals-hashcode on var4 and var18
    assertTrue("Contract failed: equals-hashcode on var4 and var18", var4.equals(var18) ? var4.hashCode() == var18.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var18 and var4
    assertTrue("Contract failed: equals-hashcode on var18 and var4", var18.equals(var4) ? var18.hashCode() == var4.hashCode() : true);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test357"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    org.jfree.data.time.TimePeriodValue var5 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var2, (java.lang.Number)10);
    var0.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    boolean var7 = var0.getDrawSharedDomainAxis();
    boolean var8 = var0.getDrawSharedDomainAxis();
    org.jfree.chart.axis.SubCategoryAxis var10 = new org.jfree.chart.axis.SubCategoryAxis("Combined Range XYPlot");
    java.lang.Number[][] var11 = new java.lang.Number[][] { };
    java.lang.Number[][] var12 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var11, var12);
    org.jfree.data.time.Week var15 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var16 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var15);
    int var17 = var13.getColumnIndex((java.lang.Comparable)var15);
    org.jfree.chart.plot.CategoryMarker var19 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var20 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var22 = var20.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var25 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var26 = var25.getTickLabelPaint();
    var20.setFillPaint(var26, true);
    var19.setLabelPaint(var26);
    org.jfree.chart.plot.CompassPlot var30 = new org.jfree.chart.plot.CompassPlot();
    var19.addChangeListener((org.jfree.chart.event.MarkerChangeListener)var30);
    org.jfree.chart.StandardChartTheme var34 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var35 = var34.getLegendItemPaint();
    java.awt.Paint var36 = var34.getSubtitlePaint();
    java.awt.Font var37 = var34.getLargeFont();
    var30.setLabelFont(var37);
    var10.setTickLabelFont((java.lang.Comparable)var15, var37);
    org.jfree.chart.axis.CategoryAxis[] var40 = new org.jfree.chart.axis.CategoryAxis[] { var10};
    var0.setDomainAxes(var40);
    
    // Checks the contract:  equals-hashcode on var3 and var16
    assertTrue("Contract failed: equals-hashcode on var3 and var16", var3.equals(var16) ? var3.hashCode() == var16.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var16 and var3
    assertTrue("Contract failed: equals-hashcode on var16 and var3", var16.equals(var3) ? var16.hashCode() == var3.hashCode() : true);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test358"); }


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
    var0.setMaxTemplateValue((java.lang.Number)0.5d);
    
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

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test359"); }


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
    java.awt.Paint var39 = var0.getDomainTickBandPaint();
    org.jfree.data.contour.NonGridContourDataset var40 = new org.jfree.data.contour.NonGridContourDataset();
    int[] var41 = var40.getXIndices();
    org.jfree.chart.renderer.xy.XYItemRenderer var42 = var0.getRendererForDataset((org.jfree.data.xy.XYDataset)var40);
    int var44 = var40.indexY(2013);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test360"); }


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
    org.jfree.chart.plot.dial.DialValueIndicator var39 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var40 = var39.getInsets();
    java.awt.Stroke var41 = var39.getOutlineStroke();
    javax.swing.JPanel var42 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var43 = var42.getPreferredSize();
    javax.swing.JPanel var44 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var42.setNextFocusableComponent((java.awt.Component)var44);
    java.util.Locale var46 = var44.getLocale();
    javax.swing.JPanel var47 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var48 = var47.getPreferredSize();
    java.awt.Dimension var49 = var44.getSize(var48);
    java.awt.event.ContainerListener[] var50 = var44.getContainerListeners();
    javax.swing.JPanel var51 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var52 = var51.getPreferredSize();
    java.awt.image.ColorModel var53 = var51.getColorModel();
    var51.updateUI();
    java.lang.String var55 = var51.toString();
    java.awt.Color var56 = var51.getForeground();
    var44.setBackground(var56);
    var39.setOutlinePaint((java.awt.Paint)var56);
    java.awt.Color var59 = var56.brighter();
    var0.setDomainMinorGridlinePaint((java.awt.Paint)var56);
    org.jfree.chart.LegendItemCollection var61 = var0.getFixedLegendItems();
    
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
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var55,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var55.equals("org.jfree.chart.ChartPanel[,0,0,0var55,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test361"); }


    org.jfree.chart.plot.ThermometerPlot var0 = new org.jfree.chart.plot.ThermometerPlot();
    org.jfree.chart.axis.ValueAxis var1 = var0.getRangeAxis();
    var1.resizeRange(2.0d, Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test362"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("org.jfree.chart.renderer.NotOutlierException: hi!");

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test363"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var1 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var2 = var0.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var1);
    var1.setTickLabelsVisible(false);
    var1.setTickRadius(0.05d);
    double var7 = var1.getMinorTickLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.02d);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test364"); }


    org.jfree.data.function.LineFunction2D var2 = new org.jfree.data.function.LineFunction2D(0.05d, 10.0d);
    double var4 = var2.getValue(0.0d);
    java.lang.String[] var7 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var8 = new org.jfree.chart.axis.SymbolAxis("hi!", var7);
    org.jfree.chart.renderer.category.BarRenderer3D var11 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var12 = var11.getItemLabelFont();
    double var13 = var11.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var16 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var17 = var16.getItemLabelFont();
    java.awt.Shape var18 = var16.getBaseLegendShape();
    var11.setShape(var18);
    var8.setDownArrow(var18);
    javax.swing.JPanel var21 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var22 = var21.getPreferredSize();
    java.awt.image.ColorModel var23 = var21.getColorModel();
    var21.updateUI();
    java.lang.String var25 = var21.toString();
    boolean var26 = var21.getInheritsPopupMenu();
    javax.swing.InputMap var27 = var21.getInputMap();
    var21.nextFocus();
    boolean var29 = var21.getInheritsPopupMenu();
    javax.swing.JPanel var30 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var31 = var30.getPreferredSize();
    java.awt.image.ColorModel var32 = var30.getColorModel();
    var30.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var37 = var30.getForeground();
    var21.setForeground(var37);
    var8.setGridBandAlternatePaint((java.awt.Paint)var37);
    boolean var40 = var2.equals((java.lang.Object)var8);
    double var42 = var2.getValue(4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var25,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var25.equals("org.jfree.chart.ChartPanel[,0,0,0var25,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 40.05d);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test365"); }


    org.jfree.data.time.TimeTableXYDataset var0 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    var0.remove((org.jfree.data.time.TimePeriod)var2, (java.lang.Comparable)100, false);
    org.jfree.data.xy.XYBarDataset var8 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var0, Double.NaN);
    int var10 = var8.getItemCount((-2));
    org.jfree.data.time.TimeTableXYDataset var11 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var13 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var14 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var13);
    var11.remove((org.jfree.data.time.TimePeriod)var13, (java.lang.Comparable)100, false);
    double var19 = var11.getDomainLowerBound(false);
    int var20 = var11.getItemCount();
    org.jfree.data.time.Year var23 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var24 = new org.jfree.data.time.Month(1, var23);
    var11.add((org.jfree.data.time.TimePeriod)var24, 0.3d, (java.lang.Comparable)"org.jfree.chart.renderer.NotOutlierException: hi!");
    org.jfree.data.time.ohlc.OHLCItem var32 = new org.jfree.data.time.ohlc.OHLCItem((org.jfree.data.time.RegularTimePeriod)var24, 175.0d, 4.0d, 1.5d, 2.0d);
    boolean var33 = var8.equals((java.lang.Object)4.0d);
    
    // Checks the contract:  equals-hashcode on var3 and var14
    assertTrue("Contract failed: equals-hashcode on var3 and var14", var3.equals(var14) ? var3.hashCode() == var14.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var14 and var3
    assertTrue("Contract failed: equals-hashcode on var14 and var3", var14.equals(var3) ? var14.hashCode() == var3.hashCode() : true);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test366"); }


    org.jfree.chart.plot.MultiplePiePlot var1 = new org.jfree.chart.plot.MultiplePiePlot();
    org.jfree.chart.JFreeChart var2 = var1.getPieChart();
    var2.setBackgroundImageAlpha(1.0f);
    org.jfree.chart.ChartFrame var6 = new org.jfree.chart.ChartFrame("Range[1.0,1.0]", var2, false);
    org.jfree.data.general.DefaultKeyedValues2DDataset var7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var7.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var7);
    org.jfree.chart.urls.StandardXYURLGenerator var16 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    boolean var17 = var7.equals((java.lang.Object)"hi!");
    org.jfree.data.Range var18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds((org.jfree.data.category.CategoryDataset)var7);
    boolean var19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setTextAntiAlias((java.lang.Object)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test367"); }


    org.jfree.chart.renderer.xy.XYLineAndShapeRenderer var0 = new org.jfree.chart.renderer.xy.XYLineAndShapeRenderer();
    boolean var1 = var0.getUseOutlinePaint();
    var0.setDrawSeriesLineAsPath(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test368"); }


    org.jfree.data.xy.DefaultIntervalXYDataset var0 = new org.jfree.data.xy.DefaultIntervalXYDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var3 = var0.getEndX(100, 3);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test369"); }


    org.jfree.data.time.DateRange var0 = new org.jfree.data.time.DateRange();
    long var1 = var0.getUpperMillis();
    org.jfree.data.general.DefaultKeyedValues2DDataset var2 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var2.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var7 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var2);
    org.jfree.data.Range var9 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds((org.jfree.data.category.CategoryDataset)var2, true);
    org.jfree.chart.block.RectangleConstraint var10 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)var0, var9);
    org.jfree.data.time.DateRange var13 = new org.jfree.data.time.DateRange((-1.0d), 1.0d);
    org.jfree.chart.block.RectangleConstraint var14 = var10.toRangeHeight((org.jfree.data.Range)var13);
    org.jfree.chart.block.RectangleConstraint var16 = var14.toFixedHeight(4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test370"); }


    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var0 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    boolean var1 = var0.isOutline();
    var0.setUseFillPaint(true);
    org.jfree.chart.event.ChartChangeEvent var4 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test371"); }


    org.jfree.data.xy.DefaultXYZDataset var0 = new org.jfree.data.xy.DefaultXYZDataset();
    org.jfree.data.Range var2 = org.jfree.data.general.DatasetUtilities.findZBounds((org.jfree.data.xy.XYZDataset)var0, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var4 = var0.getSeriesKey(2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test372"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    boolean var1 = var0.isCounterClockwise();
    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var5 = var4.getLocation();
    org.jfree.chart.plot.PolarPlot var6 = new org.jfree.chart.plot.PolarPlot();
    boolean var7 = var6.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var12 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var12.setUpperMargin(10.0d);
    var12.setAxisLineVisible(true);
    javax.swing.JPanel var17 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var18 = var17.getLocation();
    java.awt.Dimension var19 = var17.preferredSize();
    java.awt.Rectangle var20 = var17.bounds();
    java.awt.Point var21 = var6.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var12, (java.awt.geom.Rectangle2D)var20);
    java.awt.Rectangle var22 = var4.getBounds(var20);
    java.awt.Point var23 = var0.translateValueThetaRadiusToJava2D(180.0d, 1.0d, (java.awt.geom.Rectangle2D)var22);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test373"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.lang.Comparable var1 = var0.getDomainCrosshairColumnKey();
    var0.setCrosshairDatasetIndex(100);
    org.jfree.chart.plot.CombinedRangeXYPlot var4 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var5 = var4.getRangeZeroBaselineStroke();
    org.jfree.chart.title.TextTitle var7 = new org.jfree.chart.title.TextTitle("hi!");
    org.jfree.ui.RectangleInsets var8 = var7.getMargin();
    var4.setAxisOffset(var8);
    var0.setAxisOffset(var8);
    org.jfree.data.category.CategoryDataset var12 = var0.getDataset((-2));
    org.jfree.chart.LegendItemCollection var13 = var0.getLegendItems();
    int var14 = var13.getItemCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test374"); }


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
    org.jfree.chart.entity.XYAnnotationEntity var24 = new org.jfree.chart.entity.XYAnnotationEntity(var12, 10, "0x00000001", "jfreechart-");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test375"); }


    org.jfree.chart.block.BlockBorder var0 = new org.jfree.chart.block.BlockBorder();

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test376"); }


    org.jfree.chart.resources.JFreeChartResources var0 = new org.jfree.chart.resources.JFreeChartResources();
    java.lang.Object var2 = var0.handleGetObject("org.jfree.chart.event.AnnotationChangeEvent[source=org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var4 = var0.getStringArray("[Dec 31, 1969 4:00:00 PM --> Dec 31, 1969 4:00:00 PM]");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test377"); }


    org.jfree.chart.axis.CategoryLabelPositions var1 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(100.0d);
    org.jfree.chart.title.TextTitle var3 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var4 = var3.isVisible();
    java.lang.Object var5 = var3.clone();
    org.jfree.ui.RectangleEdge var6 = var3.getPosition();
    org.jfree.chart.axis.CategoryLabelPosition var7 = var1.getLabelPosition(var6);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var8 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    boolean var9 = var7.equals((java.lang.Object)var8);
    org.jfree.chart.axis.CategoryLabelWidthType var10 = var7.getWidthType();
    org.jfree.ui.TextAnchor var11 = var7.getRotationAnchor();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test378"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.String var3 = var2.getDescription();
    org.jfree.data.xy.XYSeries var6 = var2.createCopy(100, 10);
    boolean var7 = var6.getAllowDuplicateXValues();
    var6.add(0.2d, 15.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test379"); }


    org.jfree.data.xy.XYIntervalSeries var3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable)"org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", false, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var3.getYHighValue(3);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test380"); }


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
    org.jfree.chart.axis.CyclicNumberAxis var20 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var21 = var20.isAxisLineVisible();
    var20.setAxisLineVisible(true);
    var20.setMinorTickMarksVisible(true);
    org.jfree.chart.plot.CombinedRangeXYPlot var26 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var27 = var26.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CombinedRangeXYPlot var28 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var29 = var28.getRangeZeroBaselineStroke();
    var26.setRangeGridlineStroke(var29);
    var26.setDomainMinorGridlinesVisible(true);
    var26.setRangeZeroBaselineVisible(true);
    var20.setPlot((org.jfree.chart.plot.Plot)var26);
    var0.setDomainAxis((org.jfree.chart.axis.ValueAxis)var20);
    org.jfree.chart.plot.ContourPlot var37 = new org.jfree.chart.plot.ContourPlot();
    org.jfree.chart.plot.CategoryMarker var39 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    var37.addRangeMarker((org.jfree.chart.plot.Marker)var39);
    org.jfree.chart.axis.ValueAxis var41 = var37.getDomainAxis();
    var20.setPlot((org.jfree.chart.plot.Plot)var37);
    
    // Checks the contract:  equals-hashcode on var4 and var39
    assertTrue("Contract failed: equals-hashcode on var4 and var39", var4.equals(var39) ? var4.hashCode() == var39.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var39 and var4
    assertTrue("Contract failed: equals-hashcode on var39 and var4", var39.equals(var4) ? var39.hashCode() == var4.hashCode() : true);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test381"); }


    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var5 = var4.getLocation();
    org.jfree.chart.plot.PolarPlot var6 = new org.jfree.chart.plot.PolarPlot();
    boolean var7 = var6.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var12 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var12.setUpperMargin(10.0d);
    var12.setAxisLineVisible(true);
    javax.swing.JPanel var17 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var18 = var17.getLocation();
    java.awt.Dimension var19 = var17.preferredSize();
    java.awt.Rectangle var20 = var17.bounds();
    java.awt.Point var21 = var6.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var12, (java.awt.geom.Rectangle2D)var20);
    java.awt.Rectangle var22 = var4.getBounds(var20);
    org.jfree.chart.renderer.category.GanttRenderer var23 = new org.jfree.chart.renderer.category.GanttRenderer();
    java.lang.String[] var26 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var27 = new org.jfree.chart.axis.SymbolAxis("hi!", var26);
    org.jfree.chart.plot.CompassPlot var28 = new org.jfree.chart.plot.CompassPlot();
    boolean var29 = var27.equals((java.lang.Object)var28);
    java.lang.String var30 = var28.getPlotType();
    java.awt.Paint var31 = var28.getRoseCenterPaint();
    var23.setIncompletePaint(var31);
    org.jfree.chart.LegendItem var33 = new org.jfree.chart.LegendItem("Range[0.0,0.0]", "RectangleConstraint[LengthConstraintType.FIXED: width=0.04, height=0.0]", "hi!?hi!=100&amp;hi!=1", "jfreechart-onetime-", (java.awt.Shape)var20, var31);
    java.lang.String[] var36 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var37 = new org.jfree.chart.axis.SymbolAxis("hi!", var36);
    org.jfree.chart.plot.CompassPlot var38 = new org.jfree.chart.plot.CompassPlot();
    boolean var39 = var37.equals((java.lang.Object)var38);
    java.lang.String var40 = var38.getPlotType();
    java.awt.Paint var41 = var38.getRoseCenterPaint();
    java.awt.Paint var42 = var38.getBackgroundPaint();
    javax.swing.JPanel var43 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var44 = var43.getPreferredSize();
    java.awt.image.ColorModel var45 = var43.getColorModel();
    var43.updateUI();
    java.lang.String var47 = var43.toString();
    boolean var48 = var43.getInheritsPopupMenu();
    javax.swing.InputMap var49 = var43.getInputMap();
    var43.nextFocus();
    boolean var51 = var43.getInheritsPopupMenu();
    javax.swing.JPanel var52 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var53 = var52.getPreferredSize();
    java.awt.image.ColorModel var54 = var52.getColorModel();
    var52.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var59 = var52.getForeground();
    var43.setForeground(var59);
    org.jfree.chart.renderer.xy.XYDifferenceRenderer var62 = new org.jfree.chart.renderer.xy.XYDifferenceRenderer(var42, (java.awt.Paint)var59, true);
    org.jfree.chart.labels.StandardXYSeriesLabelGenerator var63 = new org.jfree.chart.labels.StandardXYSeriesLabelGenerator();
    var62.setLegendItemLabelGenerator((org.jfree.chart.labels.XYSeriesLabelGenerator)var63);
    org.jfree.chart.LegendItem var67 = var62.getLegendItem(0, (-1));
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var70 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var73 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var74 = var73.getItemLabelFont();
    double var75 = var73.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var78 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var79 = var78.getItemLabelFont();
    java.awt.Shape var80 = var78.getBaseLegendShape();
    var73.setShape(var80);
    var70.setLegendBar(var80);
    var70.setDrawBarOutline(true);
    org.jfree.data.xy.CategoryTableXYDataset var85 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var86 = var70.findDomainBounds((org.jfree.data.xy.XYDataset)var85);
    org.jfree.data.Range var88 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds((org.jfree.data.xy.TableXYDataset)var85, (-1.0d));
    boolean var89 = var62.equals((java.lang.Object)(-1.0d));
    java.awt.Shape var91 = var62.lookupLegendShape(2147483647);
    var33.setLine(var91);
    
    // Checks the contract:  equals-hashcode on var28 and var38
    assertTrue("Contract failed: equals-hashcode on var28 and var38", var28.equals(var38) ? var28.hashCode() == var38.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var38 and var28
    assertTrue("Contract failed: equals-hashcode on var38 and var28", var38.equals(var28) ? var38.hashCode() == var28.hashCode() : true);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test382"); }


    org.jfree.chart.renderer.xy.XYSplineRenderer var1 = new org.jfree.chart.renderer.xy.XYSplineRenderer(2147483647);
    var1.clearSeriesPaints(false);
    java.lang.Boolean var4 = var1.getShapesVisible();
    java.awt.Shape var5 = var1.getLegendLine();
    java.awt.Paint var8 = var1.getItemFillPaint(1043495433, 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test383"); }


    org.jfree.chart.title.TextTitle var1 = new org.jfree.chart.title.TextTitle("hi!");
    org.jfree.ui.RectangleInsets var2 = var1.getMargin();
    java.awt.Paint var3 = var1.getBackgroundPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test384"); }


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
    org.jfree.data.statistics.DefaultStatisticalCategoryDataset var20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    org.jfree.data.general.PieDataset var22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow((org.jfree.data.category.CategoryDataset)var20, 10);
    double var23 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(var22);
    org.jfree.data.time.Week var25 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var26 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var25);
    org.jfree.data.time.TimePeriodValue var28 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var25, (java.lang.Number)10);
    org.jfree.data.time.ohlc.OHLCItem var33 = new org.jfree.data.time.ohlc.OHLCItem((org.jfree.data.time.RegularTimePeriod)var25, 100.0d, 0.0d, 0.05d, 0.0d);
    int var34 = var25.getYearValue();
    java.text.AttributedString var35 = var19.generateAttributedSectionLabel(var22, (java.lang.Comparable)var34);
    org.jfree.data.statistics.DefaultStatisticalCategoryDataset var36 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    org.jfree.data.general.PieDataset var38 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow((org.jfree.data.category.CategoryDataset)var36, 10);
    double var39 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(var38);
    org.jfree.data.time.Minute var40 = new org.jfree.data.time.Minute();
    boolean var42 = var40.equals((java.lang.Object)"[Dec 31, 1969 4:00:00 PM --> Dec 31, 1969 4:00:00 PM]");
    java.text.AttributedString var43 = var19.generateAttributedSectionLabel(var38, (java.lang.Comparable)var40);
    
    // Checks the contract:  equals-hashcode on var20 and var36
    assertTrue("Contract failed: equals-hashcode on var20 and var36", var20.equals(var36) ? var20.hashCode() == var36.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var36 and var20
    assertTrue("Contract failed: equals-hashcode on var36 and var20", var36.equals(var20) ? var36.hashCode() == var20.hashCode() : true);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test385"); }


    org.jfree.chart.plot.ThermometerPlot var0 = new org.jfree.chart.plot.ThermometerPlot();
    boolean var1 = var0.isDomainZoomable();
    int var2 = var0.getAxisLocation();
    org.jfree.chart.plot.PlotOrientation var3 = var0.getOrientation();
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
    org.jfree.chart.LegendItem var35 = var32.getLegendItem(10, 51);
    org.jfree.chart.plot.CategoryPlot var36 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var38 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var39 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var38);
    org.jfree.data.time.TimePeriodValue var41 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var38, (java.lang.Number)10);
    var36.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    java.awt.Stroke var43 = var36.getRangeMinorGridlineStroke();
    var32.setBaseStroke(var43);
    var0.setThermometerStroke(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test386"); }


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
    var0.setLogscale(true);
    org.jfree.chart.plot.PolarPlot var23 = new org.jfree.chart.plot.PolarPlot();
    boolean var24 = var23.isCounterClockwise();
    var23.setRadiusGridlinesVisible(false);
    int var27 = var23.getDatasetCount();
    var23.addCornerTextItem("");
    java.lang.String[] var34 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var35 = new org.jfree.chart.axis.SymbolAxis("hi!", var34);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var36 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var38 = var36.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var41 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var42 = var41.getTickLabelPaint();
    var36.setFillPaint(var42, true);
    var35.setGridBandAlternatePaint(var42);
    var35.setFixedDimension(100.0d);
    org.jfree.chart.axis.DateAxis var49 = new org.jfree.chart.axis.DateAxis("0x00000000");
    boolean var51 = var49.isHiddenValue(0L);
    org.jfree.chart.title.TextTitle var54 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var55 = var54.isVisible();
    java.lang.Object var56 = var54.clone();
    var54.setMargin(4.0d, 100.0d, 4.0d, 10.0d);
    double var62 = var54.getWidth();
    javax.swing.JPanel var63 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var64 = var63.getLocation();
    org.jfree.chart.plot.PolarPlot var65 = new org.jfree.chart.plot.PolarPlot();
    boolean var66 = var65.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var71 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var71.setUpperMargin(10.0d);
    var71.setAxisLineVisible(true);
    javax.swing.JPanel var76 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var77 = var76.getLocation();
    java.awt.Dimension var78 = var76.preferredSize();
    java.awt.Rectangle var79 = var76.bounds();
    java.awt.Point var80 = var65.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var71, (java.awt.geom.Rectangle2D)var79);
    java.awt.Rectangle var81 = var63.getBounds(var79);
    var54.setBounds((java.awt.geom.Rectangle2D)var81);
    org.jfree.chart.title.TextTitle var84 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var85 = var84.isVisible();
    java.lang.Object var86 = var84.clone();
    org.jfree.ui.RectangleEdge var87 = var84.getPosition();
    double var88 = var49.valueToJava2D(5.0d, (java.awt.geom.Rectangle2D)var81, var87);
    java.awt.Point var89 = var23.translateToJava2D(5.0d, 0.3d, (org.jfree.chart.axis.ValueAxis)var35, (java.awt.geom.Rectangle2D)var81);
    boolean var90 = var0.equals((java.lang.Object)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
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
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test387"); }


    org.jfree.chart.plot.Crosshair var0 = new org.jfree.chart.plot.Crosshair();
    var0.setLabelXOffset(360.0d);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test388"); }


    org.jfree.chart.StrokeMap var0 = new org.jfree.chart.StrokeMap();
    java.lang.Object var1 = var0.clone();
    org.jfree.chart.util.HexNumberFormat var3 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.axis.NumberTickUnit var5 = new org.jfree.chart.axis.NumberTickUnit(0.05d, (java.text.NumberFormat)var3, 1);
    java.awt.Stroke var6 = var0.getStroke((java.lang.Comparable)var5);
    java.lang.Object var7 = var0.clone();
    
    // Checks the contract:  equals-hashcode on var1 and var7
    assertTrue("Contract failed: equals-hashcode on var1 and var7", var1.equals(var7) ? var1.hashCode() == var7.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var7 and var1
    assertTrue("Contract failed: equals-hashcode on var7 and var1", var7.equals(var1) ? var7.hashCode() == var1.hashCode() : true);

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test389"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var3 = var2.isAxisLineVisible();
    var2.setAxisLineVisible(true);
    org.jfree.chart.axis.CyclicNumberAxis var8 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var9 = var8.getTickLabelPaint();
    var2.setTickMarkPaint(var9);
    var2.setAxisLineVisible(false);
    org.jfree.chart.util.HexNumberFormat var14 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var15 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var16 = var15.getPreferredSize();
    javax.swing.JPanel var17 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var15.setNextFocusableComponent((java.awt.Component)var17);
    java.util.Locale var19 = var17.getLocale();
    org.jfree.chart.axis.MonthDateFormat var20 = new org.jfree.chart.axis.MonthDateFormat(var19);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var21 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var14, (java.text.DateFormat)var20);
    var2.setNumberFormatOverride((java.text.NumberFormat)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test390"); }


    org.jfree.chart.needle.ArrowNeedle var1 = new org.jfree.chart.needle.ArrowNeedle(false);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test391"); }


    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var0 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    boolean var1 = var0.isOutline();
    var0.setUseFillPaint(true);
    org.jfree.chart.StandardChartTheme var6 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var7 = var6.getLegendItemPaint();
    var0.setShapePaint(var7);
    org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset var10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset((java.lang.Comparable)(short)10);
    int var12 = var10.getItemCount((-13421773));
    boolean var13 = var0.equals((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var16 = var10.getMinOutlier(1043495433, 2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test392"); }


    org.jfree.chart.title.TextTitle var1 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var2 = var1.isVisible();
    java.lang.Object var3 = var1.clone();
    var1.setMargin(4.0d, 100.0d, 4.0d, 10.0d);
    double var9 = var1.getWidth();
    java.awt.Paint var10 = var1.getBackgroundPaint();
    org.jfree.chart.renderer.xy.XYDotRenderer var11 = new org.jfree.chart.renderer.xy.XYDotRenderer();
    int var12 = var11.getDotWidth();
    java.awt.Shape var13 = var11.getLegendShape();
    org.jfree.chart.renderer.category.GanttRenderer var14 = new org.jfree.chart.renderer.category.GanttRenderer();
    java.lang.String[] var17 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var18 = new org.jfree.chart.axis.SymbolAxis("hi!", var17);
    org.jfree.chart.plot.CompassPlot var19 = new org.jfree.chart.plot.CompassPlot();
    boolean var20 = var18.equals((java.lang.Object)var19);
    java.lang.String var21 = var19.getPlotType();
    java.awt.Paint var22 = var19.getRoseCenterPaint();
    var14.setIncompletePaint(var22);
    var11.setOutlinePaint(var22);
    var1.setPaint(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Compass Plot"+ "'", var21.equals("Compass Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test393"); }


    org.jfree.chart.plot.GreyPalette var0 = new org.jfree.chart.plot.GreyPalette();
    var0.setMaxZ((-170.0d));
    boolean var3 = var0.isInverse();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test394"); }


    org.jfree.chart.plot.MultiplePiePlot var1 = new org.jfree.chart.plot.MultiplePiePlot();
    org.jfree.chart.JFreeChart var2 = var1.getPieChart();
    var2.setBackgroundImageAlpha(1.0f);
    boolean var5 = var2.getAntiAlias();
    org.jfree.chart.ChartFrame var6 = new org.jfree.chart.ChartFrame("Range[0.0,0.0]", var2);
    java.lang.String var7 = var6.getWarningString();
    java.awt.Window var8 = var6.getOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test395"); }


    org.jfree.chart.renderer.xy.XYBlockRenderer var0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var1 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var2 = var0.findDomainBounds((org.jfree.data.xy.XYDataset)var1);
    java.lang.Number var3 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset)var1);
    var1.add(100.0d, Double.NaN, "jfreechart-onetime-");
    var1.clear();
    int var10 = var1.getItemCount(8);
    boolean var11 = var1.isAutoWidth();
    var1.setIntervalWidth(100.0d);
    org.jfree.data.xy.IntervalXYDelegate var14 = new org.jfree.data.xy.IntervalXYDelegate((org.jfree.data.xy.XYDataset)var1);
    double var15 = var14.getIntervalPositionFactor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var18 = var14.getEndX(80, 2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + Double.NaN+ "'", var3.equals(Double.NaN));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.5d);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test396"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.lang.Comparable var1 = var0.getDomainCrosshairColumnKey();
    java.awt.Stroke var2 = var0.getRangeZeroBaselineStroke();
    org.jfree.chart.renderer.category.BarRenderer3D var5 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var6 = var5.getItemLabelFont();
    double var7 = var5.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var10 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var11 = var10.getItemLabelFont();
    java.awt.Shape var12 = var10.getBaseLegendShape();
    var5.setShape(var12);
    int var14 = var0.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test397"); }


    org.jfree.chart.renderer.xy.XYStepRenderer var0 = new org.jfree.chart.renderer.xy.XYStepRenderer();
    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var2 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var3 = var2.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator var4 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.XYStepAreaRenderer var5 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(0, (org.jfree.chart.labels.XYToolTipGenerator)var2, (org.jfree.chart.urls.XYURLGenerator)var4);
    boolean var6 = var0.equals((java.lang.Object)var5);
    org.jfree.chart.plot.PolarPlot var7 = new org.jfree.chart.plot.PolarPlot();
    var7.addCornerTextItem("0x00000001");
    var7.setAngleGridlinesVisible(false);
    org.jfree.chart.plot.PolarPlot var12 = new org.jfree.chart.plot.PolarPlot();
    boolean var13 = var12.isRadiusGridlinesVisible();
    org.jfree.chart.axis.CyclicNumberAxis var18 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    var18.setUpperMargin(10.0d);
    var18.setAxisLineVisible(true);
    javax.swing.JPanel var23 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var24 = var23.getLocation();
    java.awt.Dimension var25 = var23.preferredSize();
    java.awt.Rectangle var26 = var23.bounds();
    java.awt.Point var27 = var12.translateToJava2D(Double.NaN, Double.NaN, (org.jfree.chart.axis.ValueAxis)var18, (java.awt.geom.Rectangle2D)var26);
    org.jfree.chart.renderer.DefaultPolarItemRenderer var29 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
    var12.setRenderer(10, (org.jfree.chart.renderer.PolarItemRenderer)var29, true);
    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var34 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var35 = var34.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator var36 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.XYStepAreaRenderer var37 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(0, (org.jfree.chart.labels.XYToolTipGenerator)var34, (org.jfree.chart.urls.XYURLGenerator)var36);
    org.jfree.chart.renderer.xy.StandardXYItemRenderer var38 = new org.jfree.chart.renderer.xy.StandardXYItemRenderer(15, (org.jfree.chart.labels.XYToolTipGenerator)var34);
    java.text.NumberFormat var39 = var34.getYFormat();
    var29.setBaseToolTipGenerator((org.jfree.chart.labels.XYToolTipGenerator)var34);
    java.lang.String[] var43 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var44 = new org.jfree.chart.axis.SymbolAxis("hi!", var43);
    org.jfree.chart.plot.CompassPlot var45 = new org.jfree.chart.plot.CompassPlot();
    boolean var46 = var44.equals((java.lang.Object)var45);
    java.lang.String var47 = var45.getPlotType();
    java.awt.Paint var48 = var45.getRoseCenterPaint();
    java.awt.Paint var49 = var45.getBackgroundPaint();
    javax.swing.JPanel var50 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var51 = var50.getPreferredSize();
    java.awt.image.ColorModel var52 = var50.getColorModel();
    var50.updateUI();
    java.lang.String var54 = var50.toString();
    boolean var55 = var50.getInheritsPopupMenu();
    javax.swing.InputMap var56 = var50.getInputMap();
    var50.nextFocus();
    boolean var58 = var50.getInheritsPopupMenu();
    javax.swing.JPanel var59 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var60 = var59.getPreferredSize();
    java.awt.image.ColorModel var61 = var59.getColorModel();
    var59.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var66 = var59.getForeground();
    var50.setForeground(var66);
    org.jfree.chart.renderer.xy.XYDifferenceRenderer var69 = new org.jfree.chart.renderer.xy.XYDifferenceRenderer(var49, (java.awt.Paint)var66, true);
    org.jfree.chart.labels.StandardXYSeriesLabelGenerator var70 = new org.jfree.chart.labels.StandardXYSeriesLabelGenerator();
    var69.setLegendItemLabelGenerator((org.jfree.chart.labels.XYSeriesLabelGenerator)var70);
    var29.setLegendItemURLGenerator((org.jfree.chart.labels.XYSeriesLabelGenerator)var70);
    boolean var73 = var29.getDrawOutlineWhenFilled();
    var7.setRenderer((org.jfree.chart.renderer.PolarItemRenderer)var29);
    boolean var75 = var0.equals((java.lang.Object)var7);
    
    // Checks the contract:  equals-hashcode on var4 and var36
    assertTrue("Contract failed: equals-hashcode on var4 and var36", var4.equals(var36) ? var4.hashCode() == var36.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var36 and var4
    assertTrue("Contract failed: equals-hashcode on var36 and var4", var36.equals(var4) ? var36.hashCode() == var4.hashCode() : true);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test398"); }


    org.jfree.chart.urls.URLUtilities var0 = new org.jfree.chart.urls.URLUtilities();
    org.jfree.chart.event.ChartChangeEvent var1 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var0);
    org.jfree.chart.JFreeChart var2 = var1.getChart();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test399"); }


    org.jfree.chart.plot.MultiplePiePlot var0 = new org.jfree.chart.plot.MultiplePiePlot();
    org.jfree.data.category.CategoryDataset var1 = var0.getDataset();
    java.lang.String var2 = var0.getPlotType();
    java.awt.Paint var3 = var0.getAggregatedItemsPaint();
    org.jfree.chart.renderer.xy.XYSplineRenderer var5 = new org.jfree.chart.renderer.xy.XYSplineRenderer(2147483647);
    var5.clearSeriesPaints(false);
    boolean var8 = var5.getBaseLinesVisible();
    boolean var11 = var5.getItemShapeFilled((-2), 15);
    org.jfree.chart.plot.CombinedRangeXYPlot var12 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var13 = var12.getRangeZeroBaselineStroke();
    java.lang.String var14 = var12.getPlotType();
    boolean var15 = var12.isDomainZoomable();
    org.jfree.chart.plot.CombinedRangeXYPlot var16 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var17 = var16.getRangeZeroBaselineStroke();
    var12.setDomainCrosshairStroke(var17);
    var5.setOutlineStroke(var17, true);
    var5.setSeriesShapesVisible(15, true);
    org.jfree.chart.renderer.category.BarRenderer3D var26 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var27 = var26.getItemLabelFont();
    double var28 = var26.getItemLabelAnchorOffset();
    java.awt.Shape var30 = var26.getSeriesShape(1);
    org.jfree.chart.renderer.category.BarRenderer3D var34 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var35 = var34.getItemLabelFont();
    double var36 = var34.getItemLabelAnchorOffset();
    org.jfree.chart.axis.CyclicNumberAxis var40 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var41 = var40.getTickLabelPaint();
    var34.setLegendTextPaint(0, var41);
    var26.setSeriesFillPaint(100, var41, true);
    var5.setBaseFillPaint(var41);
    var0.setAggregatedItemsPaint(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Multiple Pie Plot"+ "'", var2.equals("Multiple Pie Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Combined Range XYPlot"+ "'", var14.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test400"); }


    org.jfree.chart.util.LogFormat var6 = new org.jfree.chart.util.LogFormat(0.0d, "hi!", true);
    java.lang.Object var7 = var6.clone();
    org.jfree.chart.util.HexNumberFormat var10 = new org.jfree.chart.util.HexNumberFormat();
    javax.swing.JPanel var11 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var12 = var11.getPreferredSize();
    javax.swing.JPanel var13 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var11.setNextFocusableComponent((java.awt.Component)var13);
    java.util.Locale var15 = var13.getLocale();
    org.jfree.chart.axis.MonthDateFormat var16 = new org.jfree.chart.axis.MonthDateFormat(var15);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var17 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("", (java.text.NumberFormat)var10, (java.text.DateFormat)var16);
    org.jfree.chart.util.LogFormat var22 = new org.jfree.chart.util.LogFormat(0.0d, "hi!", true);
    javax.swing.JPanel var23 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var24 = var23.getPreferredSize();
    javax.swing.JPanel var25 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var23.setNextFocusableComponent((java.awt.Component)var25);
    java.util.Locale var27 = var25.getLocale();
    org.jfree.chart.axis.TickUnitSource var28 = org.jfree.chart.axis.LogAxis.createLogTickUnits(var27);
    java.text.NumberFormat var29 = java.text.NumberFormat.getPercentInstance(var27);
    org.jfree.chart.labels.StandardXYItemLabelGenerator var30 = new org.jfree.chart.labels.StandardXYItemLabelGenerator("d", (java.text.NumberFormat)var22, var29);
    org.jfree.chart.labels.StandardPieToolTipGenerator var31 = new org.jfree.chart.labels.StandardPieToolTipGenerator("Combined Range XYPlot", (java.text.NumberFormat)var10, var29);
    org.jfree.chart.labels.StandardCategoryItemLabelGenerator var32 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator("Combined Range XYPlot", (java.text.NumberFormat)var6, var29);
    org.jfree.chart.labels.StandardCrosshairLabelGenerator var33 = new org.jfree.chart.labels.StandardCrosshairLabelGenerator("hi!", var29);
    org.jfree.chart.util.RelativeDateFormat var35 = new org.jfree.chart.util.RelativeDateFormat();
    var35.setShowZeroHours(true);
    org.jfree.chart.axis.MonthDateFormat var38 = new org.jfree.chart.axis.MonthDateFormat();
    org.jfree.chart.util.RelativeDateFormat var40 = new org.jfree.chart.util.RelativeDateFormat();
    boolean var41 = var40.getShowZeroHours();
    org.jfree.chart.labels.StandardCategoryItemLabelGenerator var42 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator("0x00000000", (java.text.DateFormat)var40);
    org.jfree.chart.labels.BubbleXYItemLabelGenerator var43 = new org.jfree.chart.labels.BubbleXYItemLabelGenerator("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (java.text.DateFormat)var35, (java.text.DateFormat)var38, (java.text.DateFormat)var40);
    org.jfree.chart.labels.IntervalXYItemLabelGenerator var44 = new org.jfree.chart.labels.IntervalXYItemLabelGenerator("d", var29, (java.text.DateFormat)var40);
    
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
    assertTrue(var41 == true);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test401"); }


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
    var17.setLabel("Compass Plot");
    javax.swing.JPanel var21 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var22 = var21.getPreferredSize();
    java.awt.image.ColorModel var23 = var21.getColorModel();
    var21.updateUI();
    java.lang.String var25 = var21.toString();
    var21.setFocusable(true);
    boolean var28 = var17.equals((java.lang.Object)var21);
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var31 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var34 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var35 = var34.getItemLabelFont();
    double var36 = var34.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var39 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var40 = var39.getItemLabelFont();
    java.awt.Shape var41 = var39.getBaseLegendShape();
    var34.setShape(var41);
    var31.setLegendBar(var41);
    var31.setDrawBarOutline(true);
    org.jfree.chart.title.LegendTitle var46 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var31);
    org.jfree.chart.renderer.xy.XYBlockRenderer var47 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.chart.renderer.PaintScale var48 = var47.getPaintScale();
    org.jfree.chart.renderer.PaintScale var49 = var47.getPaintScale();
    boolean var50 = var47.getDataBoundsIncludesVisibleSeriesOnly();
    org.jfree.ui.RectangleAnchor var51 = var47.getBlockAnchor();
    var46.setLegendItemGraphicAnchor(var51);
    var17.setLabelAnchor(var51);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var25,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var25.equals("org.jfree.chart.ChartPanel[,0,0,0var25,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test402"); }


    org.jfree.data.time.Minute var0 = new org.jfree.data.time.Minute();
    int var1 = var0.getMinute();
    org.jfree.data.time.Hour var2 = var0.getHour();
    long var3 = var0.getFirstMillisecond();
    org.jfree.data.time.RegularTimePeriod var4 = var0.previous();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1378963140000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test403"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.lang.Comparable var1 = var0.getDomainCrosshairColumnKey();
    java.awt.Stroke var2 = var0.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CategoryPlot var3 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var5 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var6 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var5);
    org.jfree.data.time.TimePeriodValue var8 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var5, (java.lang.Number)10);
    var3.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    boolean var10 = var3.getDrawSharedDomainAxis();
    boolean var11 = var3.getDrawSharedDomainAxis();
    var3.clearRangeMarkers(0);
    org.jfree.chart.plot.CombinedRangeXYPlot var14 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    var3.addChangeListener((org.jfree.chart.event.PlotChangeListener)var14);
    var3.clearRangeMarkers();
    java.awt.Stroke var17 = var3.getDomainCrosshairStroke();
    org.jfree.chart.plot.CategoryPlot var18 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.plot.CategoryMarker var20 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var21 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var23 = var21.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var26 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var27 = var26.getTickLabelPaint();
    var21.setFillPaint(var27, true);
    var20.setLabelPaint(var27);
    var18.setDomainGridlinePaint(var27);
    var18.clearDomainMarkers();
    org.jfree.chart.axis.AxisSpace var33 = new org.jfree.chart.axis.AxisSpace();
    var18.setFixedRangeAxisSpace(var33);
    var3.setFixedDomainAxisSpace(var33);
    var0.setFixedDomainAxisSpace(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test404"); }


    org.jfree.data.xy.XYIntervalSeriesCollection var0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.xy.XYBarDataset var2 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var0, 10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var2.getXValue(80, 4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test405"); }


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
    org.jfree.chart.plot.dial.DialValueIndicator var39 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var40 = var39.getInsets();
    java.awt.Stroke var41 = var39.getOutlineStroke();
    javax.swing.JPanel var42 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var43 = var42.getPreferredSize();
    javax.swing.JPanel var44 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var42.setNextFocusableComponent((java.awt.Component)var44);
    java.util.Locale var46 = var44.getLocale();
    javax.swing.JPanel var47 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var48 = var47.getPreferredSize();
    java.awt.Dimension var49 = var44.getSize(var48);
    java.awt.event.ContainerListener[] var50 = var44.getContainerListeners();
    javax.swing.JPanel var51 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var52 = var51.getPreferredSize();
    java.awt.image.ColorModel var53 = var51.getColorModel();
    var51.updateUI();
    java.lang.String var55 = var51.toString();
    java.awt.Color var56 = var51.getForeground();
    var44.setBackground(var56);
    var39.setOutlinePaint((java.awt.Paint)var56);
    java.awt.Color var59 = var56.brighter();
    var0.setDomainMinorGridlinePaint((java.awt.Paint)var56);
    java.lang.String var61 = var0.getPlotType();
    int var62 = var0.getSeriesCount();
    
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
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var55,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var55.equals("org.jfree.chart.ChartPanel[,0,0,0var55,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "Combined Range XYPlot"+ "'", var61.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test406"); }


    org.jfree.data.statistics.DefaultMultiValueCategoryDataset var0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
    int var1 = var0.getColumnCount();
    org.jfree.chart.axis.AxisCollection var2 = new org.jfree.chart.axis.AxisCollection();
    java.util.List var3 = var2.getAxesAtLeft();
    java.util.List var4 = var2.getAxesAtRight();
    org.jfree.data.time.Year var8 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var9 = new org.jfree.data.time.Month(1, var8);
    org.jfree.data.time.RegularTimePeriod var10 = var9.previous();
    long var11 = var9.getSerialIndex();
    org.jfree.data.time.TimeTableXYDataset var12 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var14 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var15 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var14);
    var12.remove((org.jfree.data.time.TimePeriod)var14, (java.lang.Comparable)100, false);
    org.jfree.chart.axis.PeriodAxis var19 = new org.jfree.chart.axis.PeriodAxis("Compass Plot", (org.jfree.data.time.RegularTimePeriod)var9, (org.jfree.data.time.RegularTimePeriod)var14);
    java.util.Date var20 = var14.getEnd();
    org.jfree.data.time.TimeTableXYDataset var21 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var23 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var24 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var23);
    var21.remove((org.jfree.data.time.TimePeriod)var23, (java.lang.Comparable)100, false);
    double var29 = var21.getDomainLowerBound(false);
    int var30 = var21.getItemCount();
    org.jfree.data.time.Year var33 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var34 = new org.jfree.data.time.Month(1, var33);
    var21.add((org.jfree.data.time.TimePeriod)var34, 0.3d, (java.lang.Comparable)"org.jfree.chart.renderer.NotOutlierException: hi!");
    org.jfree.data.time.ohlc.OHLCItem var42 = new org.jfree.data.time.ohlc.OHLCItem((org.jfree.data.time.RegularTimePeriod)var34, 175.0d, 4.0d, 1.5d, 2.0d);
    var0.add(var4, (java.lang.Comparable)var14, (java.lang.Comparable)var42);
    
    // Checks the contract:  equals-hashcode on var15 and var24
    assertTrue("Contract failed: equals-hashcode on var15 and var24", var15.equals(var24) ? var15.hashCode() == var24.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var24 and var15
    assertTrue("Contract failed: equals-hashcode on var24 and var15", var24.equals(var15) ? var24.hashCode() == var15.hashCode() : true);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test407"); }


    org.jfree.chart.StrokeMap var0 = new org.jfree.chart.StrokeMap();
    java.lang.Object var1 = var0.clone();
    org.jfree.chart.util.HexNumberFormat var3 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.axis.NumberTickUnit var5 = new org.jfree.chart.axis.NumberTickUnit(0.05d, (java.text.NumberFormat)var3, 1);
    java.awt.Stroke var6 = var0.getStroke((java.lang.Comparable)var5);
    java.lang.String var7 = var5.toString();
    int var8 = var5.getMinorTickCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[size=0var70000000]"+ "'", var7.equals("[size=0var70000000]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test408"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var3 = var2.getItemLabelFont();
    org.jfree.chart.util.HexNumberFormat var5 = new org.jfree.chart.util.HexNumberFormat();
    org.jfree.chart.labels.IntervalCategoryToolTipGenerator var6 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("Combined Range XYPlot", (java.text.NumberFormat)var5);
    var2.setToolTipGenerator((org.jfree.chart.labels.CategoryToolTipGenerator)var6);
    java.lang.Boolean var8 = var2.getCreateEntities();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test409"); }


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
    org.jfree.chart.renderer.DefaultPolarItemRenderer var17 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
    var0.setRenderer(10, (org.jfree.chart.renderer.PolarItemRenderer)var17, true);
    org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator var22 = new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator();
    java.lang.Object var23 = var22.clone();
    org.jfree.chart.urls.TimeSeriesURLGenerator var24 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.XYStepAreaRenderer var25 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(0, (org.jfree.chart.labels.XYToolTipGenerator)var22, (org.jfree.chart.urls.XYURLGenerator)var24);
    org.jfree.chart.renderer.xy.StandardXYItemRenderer var26 = new org.jfree.chart.renderer.xy.StandardXYItemRenderer(15, (org.jfree.chart.labels.XYToolTipGenerator)var22);
    java.text.NumberFormat var27 = var22.getYFormat();
    var17.setBaseToolTipGenerator((org.jfree.chart.labels.XYToolTipGenerator)var22);
    org.jfree.chart.labels.XYSeriesLabelGenerator var29 = var17.getLegendItemURLGenerator();
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test410"); }


    org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator var2 = new org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (-334));

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test411"); }


    org.jfree.chart.urls.StandardXYURLGenerator var3 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    org.jfree.data.statistics.SimpleHistogramDataset var5 = new org.jfree.data.statistics.SimpleHistogramDataset((java.lang.Comparable)100.0f);
    var5.removeAllBins();
    java.lang.String var9 = var3.generateURL((org.jfree.data.xy.XYDataset)var5, 100, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var12 = var5.getStartX(2147483647, 20);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!?hi!=100&amp;hi!=1"+ "'", var9.equals("hi!?hi!=100&amp;hi!=1"));

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test412"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Paint var1 = var0.getRangeCrosshairPaint();
    org.jfree.chart.plot.ThermometerPlot var2 = new org.jfree.chart.plot.ThermometerPlot();
    boolean var3 = var2.isDomainZoomable();
    int var4 = var2.getAxisLocation();
    org.jfree.data.general.ValueDataset var5 = var2.getDataset();
    org.jfree.chart.plot.MeterPlot var6 = new org.jfree.chart.plot.MeterPlot(var5);
    java.awt.Paint var7 = var6.getTickLabelPaint();
    java.awt.Paint var8 = var6.getDialBackgroundPaint();
    org.jfree.chart.renderer.xy.XYDifferenceRenderer var10 = new org.jfree.chart.renderer.xy.XYDifferenceRenderer(var1, var8, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test413"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var1 = var0.getBaseItemLabelsVisible();
    var0.setSeriesShapesFilled(20, false);
    var0.setBaseLinesVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test414"); }


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
    org.jfree.chart.plot.dial.DialValueIndicator var39 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var40 = var39.getInsets();
    java.awt.Stroke var41 = var39.getOutlineStroke();
    javax.swing.JPanel var42 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var43 = var42.getPreferredSize();
    javax.swing.JPanel var44 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var42.setNextFocusableComponent((java.awt.Component)var44);
    java.util.Locale var46 = var44.getLocale();
    javax.swing.JPanel var47 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var48 = var47.getPreferredSize();
    java.awt.Dimension var49 = var44.getSize(var48);
    java.awt.event.ContainerListener[] var50 = var44.getContainerListeners();
    javax.swing.JPanel var51 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var52 = var51.getPreferredSize();
    java.awt.image.ColorModel var53 = var51.getColorModel();
    var51.updateUI();
    java.lang.String var55 = var51.toString();
    java.awt.Color var56 = var51.getForeground();
    var44.setBackground(var56);
    var39.setOutlinePaint((java.awt.Paint)var56);
    java.awt.Color var59 = var56.brighter();
    var0.setDomainMinorGridlinePaint((java.awt.Paint)var56);
    java.lang.String var61 = var0.getPlotType();
    org.jfree.chart.plot.CategoryMarker var64 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var65 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var67 = var65.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var70 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var71 = var70.getTickLabelPaint();
    var65.setFillPaint(var71, true);
    var64.setLabelPaint(var71);
    org.jfree.chart.plot.CompassPlot var75 = new org.jfree.chart.plot.CompassPlot();
    var64.addChangeListener((org.jfree.chart.event.MarkerChangeListener)var75);
    org.jfree.chart.renderer.category.BarRenderer3D var79 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var80 = var79.getItemLabelFont();
    double var81 = var79.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var84 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var85 = var84.getItemLabelFont();
    java.awt.Shape var86 = var84.getBaseLegendShape();
    var79.setShape(var86);
    org.jfree.chart.StandardChartTheme var90 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var91 = var90.getLegendItemPaint();
    var79.setItemLabelPaint(var91);
    java.awt.Paint var94 = var79.lookupSeriesFillPaint((-1));
    var75.setBackgroundPaint(var94);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setQuadrantPaint(51, var94);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
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
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var55,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var55.equals("org.jfree.chart.ChartPanel[,0,0,0var55,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "Combined Range XYPlot"+ "'", var61.equals("Combined Range XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test415"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    var0.clearDomainMarkers();
    java.awt.Paint var2 = var0.getRangeGridlinePaint();
    var0.setRangeCrosshairValue((-0.7853981633974483d));
    org.jfree.chart.plot.CombinedRangeXYPlot var5 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var6 = var5.getRangeZeroBaselineStroke();
    double var7 = var5.getRangeCrosshairValue();
    var0.remove((org.jfree.chart.plot.XYPlot)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test416"); }


    org.jfree.chart.plot.XYCrosshairState var0 = new org.jfree.chart.plot.XYCrosshairState();
    var0.updateCrosshairX(0.0d);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test417"); }


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
    var24.add(10.0d, 0.0d, "hi!?hi!=100&amp;hi!=1");
    org.jfree.chart.plot.dial.DialPlot var33 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var34 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var35 = var33.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var34);
    org.jfree.chart.plot.dial.DialValueIndicator var36 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var37 = var36.getInsets();
    int var38 = var33.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var36);
    boolean var39 = var24.equals((java.lang.Object)var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var42 = var24.getEndX(19, 2013);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test418"); }


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
    var17.setLabel("Compass Plot");
    org.jfree.data.xy.XYSeries var23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    var23.clear();
    boolean var25 = var17.equals((java.lang.Object)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYDataItem var27 = var23.remove((-334));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test419"); }


    org.jfree.chart.plot.ThermometerPlot var0 = new org.jfree.chart.plot.ThermometerPlot();
    boolean var1 = var0.isDomainZoomable();
    java.awt.Paint var2 = var0.getMercuryPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test420"); }


    org.jfree.chart.renderer.xy.XYBlockRenderer var0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var1 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var2 = var0.findDomainBounds((org.jfree.data.xy.XYDataset)var1);
    java.lang.Number var3 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset)var1);
    var1.add(100.0d, Double.NaN, "jfreechart-onetime-");
    var1.clear();
    int var10 = var1.getItemCount(8);
    boolean var11 = var1.isAutoWidth();
    var1.setIntervalWidth(100.0d);
    org.jfree.data.xy.IntervalXYDelegate var14 = new org.jfree.data.xy.IntervalXYDelegate((org.jfree.data.xy.XYDataset)var1);
    boolean var16 = var14.equals((java.lang.Object)0.25d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + Double.NaN+ "'", var3.equals(Double.NaN));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test421"); }


    org.jfree.chart.util.HexNumberFormat var2 = new org.jfree.chart.util.HexNumberFormat(15);
    org.jfree.chart.axis.NumberTickUnit var4 = new org.jfree.chart.axis.NumberTickUnit((-0.4636476090008061d), (java.text.NumberFormat)var2, 80);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test422"); }


    org.jfree.chart.title.TextTitle var5 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var6 = var5.isVisible();
    java.lang.Object var7 = var5.clone();
    var5.setMargin(4.0d, 100.0d, 4.0d, 10.0d);
    var5.setToolTipText("");
    org.jfree.chart.annotations.XYDrawableAnnotation var15 = new org.jfree.chart.annotations.XYDrawableAnnotation(1.05d, 360.0d, 0.5d, 1.5d, (org.jfree.ui.Drawable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test423"); }


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
    java.awt.Paint var39 = var0.getDomainTickBandPaint();
    org.jfree.data.contour.NonGridContourDataset var40 = new org.jfree.data.contour.NonGridContourDataset();
    int[] var41 = var40.getXIndices();
    org.jfree.chart.renderer.xy.XYItemRenderer var42 = var0.getRendererForDataset((org.jfree.data.xy.XYDataset)var40);
    int[] var43 = var40.indexX();

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test424"); }


    org.jfree.data.statistics.DefaultStatisticalCategoryDataset var0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    var0.clear();
    java.util.List var2 = var0.getRowKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeColumn(15);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test425"); }


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
    org.jfree.chart.LegendItem var31 = var28.getLegendItem(10, 51);
    org.jfree.chart.plot.CategoryPlot var32 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var34 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var35 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var34);
    org.jfree.data.time.TimePeriodValue var37 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var34, (java.lang.Number)10);
    var32.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    java.awt.Stroke var39 = var32.getRangeMinorGridlineStroke();
    var28.setBaseStroke(var39);
    java.awt.Shape var41 = var28.getLegendLine();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var13,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var13.equals("org.jfree.chart.ChartPanel[,0,0,0var13,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test426"); }


    org.jfree.chart.urls.CustomPieURLGenerator var0 = new org.jfree.chart.urls.CustomPieURLGenerator();
    java.lang.String var3 = var0.getURL((java.lang.Comparable)2.0d, 4);
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week();
    int var5 = var4.getYearValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var0.getURL((java.lang.Comparable)var5, (-2));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2013);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test427"); }


    org.jfree.data.statistics.DefaultMultiValueCategoryDataset var0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
    int var1 = var0.getColumnCount();
    org.jfree.chart.util.RelativeDateFormat var4 = new org.jfree.chart.util.RelativeDateFormat();
    java.lang.Object var5 = var4.clone();
    org.jfree.chart.axis.DateTickUnit var6 = new org.jfree.chart.axis.DateTickUnit(1, 8, (java.text.DateFormat)var4);
    int var7 = var0.getRowIndex((java.lang.Comparable)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test428"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    org.jfree.data.time.TimePeriodValue var5 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var2, (java.lang.Number)10);
    var0.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    boolean var7 = var0.getDrawSharedDomainAxis();
    boolean var8 = var0.getDrawSharedDomainAxis();
    var0.mapDatasetToDomainAxis(80, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test429"); }


    org.jfree.chart.plot.ThermometerPlot var0 = new org.jfree.chart.plot.ThermometerPlot();
    org.jfree.chart.axis.ValueAxis var1 = var0.getRangeAxis();
    org.jfree.chart.axis.ValueAxis var2 = var0.getRangeAxis();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBackgroundImageAlpha(10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test430"); }


    org.jfree.chart.plot.dial.DialValueIndicator var0 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var1 = var0.getInsets();
    var0.setAngle((-1.0d));
    org.jfree.chart.renderer.category.BarRenderer3D var8 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var9 = var8.getItemLabelFont();
    double var10 = var8.getItemLabelAnchorOffset();
    org.jfree.chart.labels.ItemLabelPosition var13 = var8.getNegativeItemLabelPosition(0, 0);
    double var14 = var13.getAngle();
    org.jfree.ui.TextAnchor var15 = var13.getTextAnchor();
    org.jfree.chart.plot.dial.DialValueIndicator var16 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var17 = var16.getInsets();
    java.awt.Stroke var18 = var16.getOutlineStroke();
    javax.swing.JPanel var19 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var20 = var19.getPreferredSize();
    javax.swing.JPanel var21 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var19.setNextFocusableComponent((java.awt.Component)var21);
    java.util.Locale var23 = var21.getLocale();
    javax.swing.JPanel var24 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var25 = var24.getPreferredSize();
    java.awt.Dimension var26 = var21.getSize(var25);
    java.awt.event.ContainerListener[] var27 = var21.getContainerListeners();
    javax.swing.JPanel var28 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var29 = var28.getPreferredSize();
    java.awt.image.ColorModel var30 = var28.getColorModel();
    var28.updateUI();
    java.lang.String var32 = var28.toString();
    java.awt.Color var33 = var28.getForeground();
    var21.setBackground(var33);
    var16.setOutlinePaint((java.awt.Paint)var33);
    boolean var36 = var16.isClippedToWindow();
    org.jfree.ui.TextAnchor var37 = var16.getTextAnchor();
    org.jfree.chart.axis.NumberTick var39 = new org.jfree.chart.axis.NumberTick((java.lang.Number)(short)0, "jfreechart-onetime-", var15, var37, 1.0d);
    var0.setTextAnchor(var37);
    org.jfree.chart.renderer.xy.XYBlockRenderer var41 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var42 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var43 = var41.findDomainBounds((org.jfree.data.xy.XYDataset)var42);
    org.jfree.chart.renderer.category.BarRenderer3D var46 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var47 = var46.getItemLabelFont();
    double var48 = var46.getItemLabelAnchorOffset();
    org.jfree.chart.labels.ItemLabelPosition var51 = var46.getNegativeItemLabelPosition(0, 0);
    double var52 = var51.getAngle();
    var41.setNegativeItemLabelPosition(var51);
    org.jfree.chart.labels.XYSeriesLabelGenerator var54 = var41.getLegendItemToolTipGenerator();
    org.jfree.chart.title.LegendTitle var55 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var41);
    org.jfree.chart.block.BlockContainer var56 = var55.getItemContainer();
    org.jfree.chart.plot.dial.DialValueIndicator var57 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var58 = var57.getInsets();
    java.awt.Stroke var59 = var57.getOutlineStroke();
    javax.swing.JPanel var60 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var61 = var60.getPreferredSize();
    javax.swing.JPanel var62 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var60.setNextFocusableComponent((java.awt.Component)var62);
    java.util.Locale var64 = var62.getLocale();
    javax.swing.JPanel var65 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var66 = var65.getPreferredSize();
    java.awt.Dimension var67 = var62.getSize(var66);
    java.awt.event.ContainerListener[] var68 = var62.getContainerListeners();
    javax.swing.JPanel var69 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var70 = var69.getPreferredSize();
    java.awt.image.ColorModel var71 = var69.getColorModel();
    var69.updateUI();
    java.lang.String var73 = var69.toString();
    java.awt.Color var74 = var69.getForeground();
    var62.setBackground(var74);
    var57.setOutlinePaint((java.awt.Paint)var74);
    javax.swing.JPanel var77 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var78 = var77.getPreferredSize();
    javax.swing.JPanel var79 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var77.setNextFocusableComponent((java.awt.Component)var79);
    java.util.Locale var81 = var79.getLocale();
    javax.swing.JPanel var82 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var83 = var82.getPreferredSize();
    java.awt.Dimension var84 = var79.getSize(var83);
    java.awt.event.ContainerListener[] var85 = var79.getContainerListeners();
    javax.swing.JPanel var86 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var87 = var86.getPreferredSize();
    java.awt.image.ColorModel var88 = var86.getColorModel();
    var86.updateUI();
    java.lang.String var90 = var86.toString();
    java.awt.Color var91 = var86.getForeground();
    var79.setBackground(var91);
    var57.setOutlinePaint((java.awt.Paint)var91);
    org.jfree.ui.RectangleInsets var94 = var57.getInsets();
    org.jfree.ui.RectangleAnchor var95 = var57.getFrameAnchor();
    var55.setLegendItemGraphicLocation(var95);
    var0.setValueAnchor(var95);
    
    // Checks the contract:  equals-hashcode on var13 and var51
    assertTrue("Contract failed: equals-hashcode on var13 and var51", var13.equals(var51) ? var13.hashCode() == var51.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var51 and var13
    assertTrue("Contract failed: equals-hashcode on var51 and var13", var51.equals(var13) ? var51.hashCode() == var13.hashCode() : true);

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test431"); }


    org.jfree.data.time.Second var1 = org.jfree.data.time.Second.parseSecond("Multiple Pie Plot");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test432"); }


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
    javax.swing.JPanel var20 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var21 = var20.getPreferredSize();
    java.awt.image.ColorModel var22 = var20.getColorModel();
    var20.updateUI();
    java.lang.String var24 = var20.toString();
    boolean var25 = var20.getInheritsPopupMenu();
    javax.swing.JPanel var26 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var27 = var26.getPreferredSize();
    javax.swing.JPanel var28 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var26.setNextFocusableComponent((java.awt.Component)var28);
    java.util.Locale var30 = var28.getLocale();
    javax.swing.JPanel var31 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var32 = var31.getPreferredSize();
    java.awt.Dimension var33 = var28.getSize(var32);
    var20.setSize(var32);
    boolean var35 = var0.equals((java.lang.Object)var20);
    java.beans.VetoableChangeListener[] var36 = var20.getVetoableChangeListeners();
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test433"); }


    org.jfree.chart.renderer.category.GanttRenderer var0 = new org.jfree.chart.renderer.category.GanttRenderer();
    java.awt.Paint var1 = var0.getCompletePaint();
    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var2 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    java.awt.Paint var3 = var2.getShapePaint();
    java.awt.Shape var4 = var2.getLegendArea();
    org.jfree.chart.renderer.category.LayeredBarRenderer var5 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
    org.jfree.chart.renderer.category.BarRenderer3D var8 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var9 = var8.getItemLabelFont();
    double var10 = var8.getItemLabelAnchorOffset();
    org.jfree.chart.axis.CyclicNumberAxis var14 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var15 = var14.getTickLabelPaint();
    var8.setLegendTextPaint(0, var15);
    org.jfree.ui.GradientPaintTransformer var17 = var8.getGradientPaintTransformer();
    var5.setGradientPaintTransformer(var17);
    var2.setGradientTransformer(var17);
    var0.setGradientPaintTransformer(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test434"); }


    org.jfree.chart.entity.StandardEntityCollection var0 = new org.jfree.chart.entity.StandardEntityCollection();
    java.util.Iterator var1 = var0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test435"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    org.jfree.chart.plot.dial.StandardDialScale var1 = new org.jfree.chart.plot.dial.StandardDialScale();
    int var2 = var0.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var1);
    org.jfree.chart.plot.dial.DialValueIndicator var3 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var4 = var3.getInsets();
    int var5 = var0.getLayerIndex((org.jfree.chart.plot.dial.DialLayer)var3);
    java.awt.Stroke var6 = var3.getOutlineStroke();
    java.awt.Paint var7 = var3.getBackgroundPaint();
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
    org.jfree.chart.renderer.PolarItemRenderer var24 = var8.getRenderer();
    boolean var25 = var3.hasListener((java.util.EventListener)var8);
    org.jfree.chart.axis.TickUnit var26 = var8.getAngleTickUnit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test436"); }


    org.jfree.data.time.TimeTableXYDataset var0 = new org.jfree.data.time.TimeTableXYDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var0.getEndXValue(3, 3);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test437"); }


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
    var0.setDisplayRange((-2), 0.3d, 4.0d);
    var0.setUpperBound(100.0d);
    
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

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test438"); }


    org.jfree.data.statistics.DefaultMultiValueCategoryDataset var0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
    int var1 = var0.getColumnCount();
    double var3 = var0.getRangeLowerBound(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test439"); }


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
    org.jfree.chart.axis.ValueAxis var22 = var0.getAxis(1);
    org.jfree.chart.needle.PinNeedle var23 = new org.jfree.chart.needle.PinNeedle();
    org.jfree.chart.plot.CategoryPlot var24 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var26 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var27 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var26);
    org.jfree.data.time.TimePeriodValue var29 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var26, (java.lang.Number)10);
    var24.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var31 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var33 = var31.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var36 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var37 = var36.getTickLabelPaint();
    var31.setFillPaint(var37, true);
    var24.setDomainCrosshairPaint(var37);
    var23.setOutlinePaint(var37);
    org.jfree.chart.event.RendererChangeEvent var42 = new org.jfree.chart.event.RendererChangeEvent((java.lang.Object)var23);
    var0.rendererChanged(var42);
    
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
    assertTrue(var19 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test440"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    java.util.Locale var4 = var2.getLocale();
    org.jfree.chart.axis.TickUnitSource var5 = org.jfree.chart.axis.LogAxis.createLogTickUnits(var4);
    java.text.NumberFormat var6 = java.text.NumberFormat.getPercentInstance(var4);
    org.jfree.chart.axis.TickUnitSource var7 = org.jfree.chart.axis.NumberAxis.createIntegerTickUnits(var4);
    org.jfree.chart.axis.TickUnitSource var8 = org.jfree.chart.axis.NumberAxis.createIntegerTickUnits(var4);
    
    // Checks the contract:  equals-hashcode on var7 and var8
    assertTrue("Contract failed: equals-hashcode on var7 and var8", var7.equals(var8) ? var7.hashCode() == var8.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var8 and var7
    assertTrue("Contract failed: equals-hashcode on var8 and var7", var8.equals(var7) ? var8.hashCode() == var7.hashCode() : true);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test441"); }


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
    javax.swing.JPanel var25 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var26 = var25.getPreferredSize();
    java.awt.image.ColorModel var27 = var25.getColorModel();
    java.lang.String var28 = var25.getToolTipText();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setComponentZOrder((java.awt.Component)var25, 20);
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test442"); }


    org.jfree.data.xy.XYSeries var2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)(byte)100, true);
    java.lang.String var3 = var2.getDescription();
    org.jfree.data.xy.XYSeries var6 = var2.createCopy(100, 10);
    var2.add(15.0d, (java.lang.Number)604800000L, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test443"); }


    org.jfree.data.general.DefaultKeyedValues2DDataset var0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var0.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var5 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var0);
    org.jfree.chart.urls.StandardXYURLGenerator var9 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    boolean var10 = var0.equals((java.lang.Object)"hi!");
    java.lang.Object var11 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test444"); }


    org.jfree.chart.plot.dial.DialValueIndicator var0 = new org.jfree.chart.plot.dial.DialValueIndicator();
    org.jfree.ui.RectangleInsets var1 = var0.getInsets();
    java.lang.Number var2 = var0.getTemplateValue();
    var0.setTemplateValue((java.lang.Number)(-334));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 100.0d+ "'", var2.equals(100.0d));

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test445"); }


    org.jfree.chart.entity.StandardEntityCollection var0 = new org.jfree.chart.entity.StandardEntityCollection();
    org.jfree.chart.entity.ChartEntity var3 = var0.getEntity(0.0d, 2.0d);
    org.jfree.chart.entity.ChartEntity var6 = var0.getEntity(10.0d, 1.0d);
    org.jfree.chart.urls.StandardXYURLGenerator var10 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    org.jfree.data.statistics.SimpleHistogramDataset var12 = new org.jfree.data.statistics.SimpleHistogramDataset((java.lang.Comparable)100.0f);
    var12.removeAllBins();
    java.lang.String var16 = var10.generateURL((org.jfree.data.xy.XYDataset)var12, 100, 1);
    int var17 = var12.getSeriesCount();
    boolean var18 = var0.equals((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!?hi!=100&amp;hi!=1"+ "'", var16.equals("hi!?hi!=100&amp;hi!=1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test446"); }


    double[] var3 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var4 = new org.jfree.chart.annotations.XYPolygonAnnotation(var3);
    double[] var7 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var8 = new org.jfree.chart.annotations.XYPolygonAnnotation(var7);
    org.jfree.chart.ClipPath var9 = new org.jfree.chart.ClipPath(var3, var7);
    boolean var10 = var9.isFillPath();
    var9.setClip(false);
    org.jfree.chart.plot.CategoryPlot var13 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var15 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var16 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var15);
    org.jfree.data.time.TimePeriodValue var18 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var15, (java.lang.Number)10);
    var13.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var20 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var22 = var20.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var25 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var26 = var25.getTickLabelPaint();
    var20.setFillPaint(var26, true);
    var13.setDomainCrosshairPaint(var26);
    var9.setFillPaint(var26);
    org.jfree.chart.plot.PolarPlot var31 = new org.jfree.chart.plot.PolarPlot();
    boolean var32 = var31.isRadiusGridlinesVisible();
    org.jfree.chart.renderer.category.BarRenderer3D var35 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var36 = var35.getItemLabelFont();
    java.awt.Shape var37 = var35.getBaseLegendShape();
    double var38 = var35.getItemMargin();
    org.jfree.chart.plot.CombinedRangeXYPlot var39 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var40 = var39.getRangeZeroBaselineStroke();
    var35.setStroke(var40, false);
    var31.setRadiusGridlineStroke(var40);
    org.jfree.chart.plot.ValueMarker var44 = new org.jfree.chart.plot.ValueMarker(0.3d, var26, var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test447"); }


    org.jfree.chart.plot.ThermometerPlot var0 = new org.jfree.chart.plot.ThermometerPlot();
    boolean var1 = var0.isDomainZoomable();
    int var2 = var0.getAxisLocation();
    int var3 = var0.getGap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test448"); }


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
    org.jfree.chart.axis.AxisLocation var44 = var0.getRangeAxisLocation(8);
    
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
    assertNotNull(var44);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test449"); }


    org.jfree.chart.util.RelativeDateFormat var0 = new org.jfree.chart.util.RelativeDateFormat();
    boolean var1 = var0.getShowZeroHours();
    var0.setPositivePrefix("d");
    var0.setMinuteSuffix("hi!?hi!=100&amp;hi!=1");
    var0.setDaySuffix("TimePeriodValue[Week 37, 2013,10]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test450"); }


    org.jfree.chart.renderer.category.StackedBarRenderer3D var2 = new org.jfree.chart.renderer.category.StackedBarRenderer3D((-170.0d), 1.5d);
    var2.setRenderAsPercentages(false);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test451"); }


    org.jfree.chart.renderer.category.IntervalBarRenderer var0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
    var0.setSeriesVisible(15, (java.lang.Boolean)false, true);
    org.jfree.chart.StandardChartTheme var7 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var8 = var7.getLegendItemPaint();
    java.awt.Paint var9 = var7.getSubtitlePaint();
    java.awt.Paint var10 = var7.getTickLabelPaint();
    var0.setBaseLegendTextPaint(var10);
    java.lang.Number[][] var12 = new java.lang.Number[][] { };
    java.lang.Number[][] var13 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var14 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var12, var13);
    int var15 = var14.getRowCount();
    org.jfree.data.xy.OHLCDataItem[] var17 = new org.jfree.data.xy.OHLCDataItem[] { };
    org.jfree.data.xy.DefaultOHLCDataset var18 = new org.jfree.data.xy.DefaultOHLCDataset((java.lang.Comparable)0.05d, var17);
    var14.setSeriesKeys((java.lang.Comparable[])var17);
    java.lang.Object var20 = var14.clone();
    org.jfree.data.Range var21 = var0.findRangeBounds((org.jfree.data.category.CategoryDataset)var14);
    int var23 = var14.indexOf((java.lang.Comparable)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test452"); }


    org.jfree.chart.plot.ContourPlot var0 = new org.jfree.chart.plot.ContourPlot();
    double var1 = var0.getDomainCrosshairValue();
    org.jfree.chart.axis.CyclicNumberAxis var4 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    boolean var5 = var4.isAxisLineVisible();
    var4.setAxisLineVisible(true);
    var4.setMinorTickMarksVisible(true);
    org.jfree.chart.plot.CombinedRangeXYPlot var10 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var11 = var10.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CombinedRangeXYPlot var12 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var13 = var12.getRangeZeroBaselineStroke();
    var10.setRangeGridlineStroke(var13);
    var10.setDomainMinorGridlinesVisible(true);
    var10.setRangeZeroBaselineVisible(true);
    var4.setPlot((org.jfree.chart.plot.Plot)var10);
    var0.setDomainAxis((org.jfree.chart.axis.ValueAxis)var4);
    var4.setOffset(360.0d);
    double var23 = var4.getAutoRangeMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1.0E-8d);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test453"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.NormalizedMatrixSeries var3 = new org.jfree.data.xy.NormalizedMatrixSeries("index.html", (-2), (-2));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test454"); }


    org.jfree.chart.urls.StandardXYURLGenerator var3 = new org.jfree.chart.urls.StandardXYURLGenerator("hi!", "hi!", "hi!");
    org.jfree.data.xy.XIntervalSeriesCollection var4 = new org.jfree.data.xy.XIntervalSeriesCollection();
    java.lang.String var7 = var3.generateURL((org.jfree.data.xy.XYDataset)var4, 10, 51);
    org.jfree.data.xy.XIntervalSeriesCollection var8 = new org.jfree.data.xy.XIntervalSeriesCollection();
    org.jfree.data.xy.XIntervalSeries var10 = new org.jfree.data.xy.XIntervalSeries((java.lang.Comparable)1201L);
    var8.addSeries(var10);
    var4.removeSeries(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!?hi!=10&amp;hi!=51"+ "'", var7.equals("hi!?hi!=10&amp;hi!=51"));

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test455"); }


    boolean var0 = org.jfree.chart.renderer.xy.XYBarRenderer.getDefaultShadowsVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test456"); }


    org.jfree.data.time.Year var1 = new org.jfree.data.time.Year(100);
    org.jfree.chart.plot.CombinedDomainCategoryPlot var2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    int var3 = var1.compareTo((java.lang.Object)var2);
    var2.setGap(2.0d);
    org.jfree.chart.plot.CombinedRangeXYPlot var6 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var7 = var6.getRangeZeroBaselineStroke();
    java.lang.String var8 = var6.getPlotType();
    org.jfree.chart.plot.CategoryMarker var10 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var11 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var13 = var11.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var16 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var17 = var16.getTickLabelPaint();
    var11.setFillPaint(var17, true);
    var10.setLabelPaint(var17);
    boolean var21 = var6.removeRangeMarker((org.jfree.chart.plot.Marker)var10);
    javax.swing.JPanel var22 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var23 = var22.getPreferredSize();
    java.awt.image.ColorModel var24 = var22.getColorModel();
    var22.updateUI();
    java.lang.String var26 = var22.toString();
    boolean var27 = var22.getInheritsPopupMenu();
    double[] var30 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var31 = new org.jfree.chart.annotations.XYPolygonAnnotation(var30);
    java.lang.Object var32 = var31.clone();
    org.jfree.chart.event.AnnotationChangeEvent var33 = new org.jfree.chart.event.AnnotationChangeEvent((java.lang.Object)var22, (org.jfree.chart.annotations.Annotation)var31);
    var6.annotationChanged(var33);
    org.jfree.chart.annotations.Annotation var35 = var33.getAnnotation();
    var2.annotationChanged(var33);
    java.lang.String[] var39 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var40 = new org.jfree.chart.axis.SymbolAxis("hi!", var39);
    var40.setLabelAngle(0.0d);
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var45 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var48 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var49 = var48.getItemLabelFont();
    double var50 = var48.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var53 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var54 = var53.getItemLabelFont();
    java.awt.Shape var55 = var53.getBaseLegendShape();
    var48.setShape(var55);
    var45.setLegendBar(var55);
    org.jfree.data.general.DefaultKeyedValues2DDataset var60 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var63 = new org.jfree.chart.entity.CategoryItemEntity(var55, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var60, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    org.jfree.chart.plot.CombinedRangeXYPlot var64 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var65 = var64.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CategoryMarker var67 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var68 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var70 = var68.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var73 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var74 = var73.getTickLabelPaint();
    var68.setFillPaint(var74, true);
    var67.setLabelPaint(var74);
    org.jfree.chart.annotations.XYShapeAnnotation var78 = new org.jfree.chart.annotations.XYShapeAnnotation(var55, var65, var74);
    var40.setAxisLineStroke(var65);
    double var80 = var40.getUpperBound();
    org.jfree.data.Range var81 = var2.getDataRange((org.jfree.chart.axis.ValueAxis)var40);
    
    // Checks the contract:  equals-hashcode on var6 and var64
    assertTrue("Contract failed: equals-hashcode on var6 and var64", var6.equals(var64) ? var6.hashCode() == var64.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var64 and var6
    assertTrue("Contract failed: equals-hashcode on var64 and var6", var64.equals(var6) ? var64.hashCode() == var6.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var10 and var67
    assertTrue("Contract failed: equals-hashcode on var10 and var67", var10.equals(var67) ? var10.hashCode() == var67.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var67 and var10
    assertTrue("Contract failed: equals-hashcode on var67 and var10", var67.equals(var10) ? var67.hashCode() == var10.hashCode() : true);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test457"); }


    org.jfree.data.time.Second var0 = new org.jfree.data.time.Second();
    org.jfree.data.time.TimeSeries var1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)var0);
    var1.setMaximumItemCount(0);
    boolean var4 = var1.getNotify();
    double var5 = var1.getMaxY();
    java.lang.Object var6 = var1.clone();
    var1.setRangeDescription("jfreechart-onetime-");
    java.lang.Object var9 = var1.clone();
    java.lang.String var10 = var1.getDomainDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Time"+ "'", var10.equals("Time"));

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test458"); }


    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var0 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem(1, 0);
    org.jfree.data.xy.XYIntervalSeriesCollection var4 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.Range var5 = var0.findRangeBounds((org.jfree.data.xy.XYDataset)var4);
    var0.setPlotLines(false);
    var0.setShapesFilled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test459"); }


    org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var4 = var1.getValue(2147483647, 20);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test460"); }


    org.jfree.chart.axis.CategoryLabelPositions var1 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(100.0d);
    org.jfree.chart.title.TextTitle var3 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var4 = var3.isVisible();
    java.lang.Object var5 = var3.clone();
    org.jfree.ui.RectangleEdge var6 = var3.getPosition();
    org.jfree.chart.axis.CategoryLabelPosition var7 = var1.getLabelPosition(var6);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var8 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    boolean var9 = var7.equals((java.lang.Object)var8);
    org.jfree.chart.axis.CategoryLabelWidthType var10 = var7.getWidthType();
    java.lang.String var11 = var10.toString();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "CategoryLabelWidthType.RANGE"+ "'", var11.equals("CategoryLabelWidthType.RANGE"));

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test461"); }


    org.jfree.chart.annotations.XYPointerAnnotation var4 = new org.jfree.chart.annotations.XYPointerAnnotation("", (-0.7853981633974483d), 1.0d, 0.2d);
    double var5 = var4.getArrowWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3.0d);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test462"); }


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
    var59.setShapeVisible(false);
    org.jfree.ui.GradientPaintTransformer var62 = var59.getFillPaintTransformer();
    org.jfree.chart.renderer.category.BarRenderer3D var65 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var66 = var65.getItemLabelFont();
    double var67 = var65.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var70 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var71 = var70.getItemLabelFont();
    java.awt.Shape var72 = var70.getBaseLegendShape();
    var65.setShape(var72);
    org.jfree.chart.StandardChartTheme var76 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var77 = var76.getLegendItemPaint();
    var65.setItemLabelPaint(var77);
    var59.setLinePaint(var77);
    
    // Checks the contract:  equals-hashcode on var56 and var76
    assertTrue("Contract failed: equals-hashcode on var56 and var76", var56.equals(var76) ? var56.hashCode() == var76.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var76 and var56
    assertTrue("Contract failed: equals-hashcode on var76 and var56", var76.equals(var56) ? var76.hashCode() == var56.hashCode() : true);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test463"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    org.jfree.data.time.TimePeriodValue var5 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var2, (java.lang.Number)10);
    var0.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    java.awt.Stroke var7 = var0.getRangeMinorGridlineStroke();
    boolean var8 = var0.isRangeMinorGridlinesVisible();
    double[] var11 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var12 = new org.jfree.chart.annotations.XYPolygonAnnotation(var11);
    double[] var15 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var16 = new org.jfree.chart.annotations.XYPolygonAnnotation(var15);
    org.jfree.chart.ClipPath var17 = new org.jfree.chart.ClipPath(var11, var15);
    double[][] var18 = new double[][] { var11};
    double[] var23 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var24 = new org.jfree.chart.annotations.XYPolygonAnnotation(var23);
    double[] var27 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var28 = new org.jfree.chart.annotations.XYPolygonAnnotation(var27);
    org.jfree.chart.ClipPath var29 = new org.jfree.chart.ClipPath(var23, var27);
    double[][] var30 = new double[][] { var23};
    org.jfree.data.category.CategoryDataset var31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", "jfreechart-onetime-", var30);
    org.jfree.data.category.DefaultIntervalCategoryDataset var32 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var18, var30);
    java.util.List var33 = var32.getColumnKeys();
    var0.setDataset((org.jfree.data.category.CategoryDataset)var32);
    org.jfree.data.general.DatasetGroup var36 = new org.jfree.data.general.DatasetGroup("Combined Range XYPlot");
    java.lang.String var37 = var36.getID();
    var32.setGroup(var36);
    org.jfree.data.general.DatasetGroup var40 = new org.jfree.data.general.DatasetGroup("d");
    var32.setGroup(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Combined Range XYPlot"+ "'", var37.equals("Combined Range XYPlot"));

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test464"); }


    org.jfree.data.statistics.HistogramBin var2 = new org.jfree.data.statistics.HistogramBin(1.0E-8d, 3.0d);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test465"); }


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
      int var24 = org.jfree.chart.renderer.RendererUtilities.findLiveItemsUpperBound((org.jfree.data.xy.XYDataset)var17, 2013, 100.0d, 0.02d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test466"); }


    org.jfree.data.general.WaferMapDataset var3 = new org.jfree.data.general.WaferMapDataset(2, 15, (java.lang.Number)5.0d);
    org.jfree.chart.renderer.WaferMapRenderer var6 = new org.jfree.chart.renderer.WaferMapRenderer(100, 2);
    org.jfree.chart.plot.WaferMapPlot var7 = new org.jfree.chart.plot.WaferMapPlot(var3, var6);
    org.jfree.data.time.TimeTableXYDataset var8 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var10 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var11 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var10);
    var8.remove((org.jfree.data.time.TimePeriod)var10, (java.lang.Comparable)100, false);
    org.jfree.data.xy.XYBarDataset var16 = new org.jfree.data.xy.XYBarDataset((org.jfree.data.xy.XYDataset)var8, Double.NaN);
    org.jfree.chart.event.RendererChangeEvent var17 = new org.jfree.chart.event.RendererChangeEvent((java.lang.Object)var16);
    var7.rendererChanged(var17);
    org.jfree.chart.LegendItemCollection var19 = var7.getLegendItems();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test467"); }


    org.jfree.chart.plot.CombinedRangeXYPlot var0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    org.jfree.chart.annotations.XYPointerAnnotation var5 = new org.jfree.chart.annotations.XYPointerAnnotation("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (-1.0d), 0.2d, 4.0d);
    double var6 = var5.getLabelOffset();
    org.jfree.ui.TextAnchor var7 = var5.getRotationAnchor();
    boolean var8 = var0.removeAnnotation((org.jfree.chart.annotations.XYAnnotation)var5);
    java.awt.Paint var9 = var0.getDomainGridlinePaint();
    org.jfree.chart.plot.CombinedRangeXYPlot var10 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var11 = var10.getRangeZeroBaselineStroke();
    java.lang.String var12 = var10.getPlotType();
    org.jfree.chart.plot.CategoryMarker var14 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var15 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var17 = var15.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var20 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var21 = var20.getTickLabelPaint();
    var15.setFillPaint(var21, true);
    var14.setLabelPaint(var21);
    boolean var25 = var10.removeRangeMarker((org.jfree.chart.plot.Marker)var14);
    org.jfree.chart.axis.AxisLocation var26 = var10.getDomainAxisLocation();
    org.jfree.data.time.Week var28 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var29 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var28);
    org.jfree.data.time.TimePeriodValue var31 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var28, (java.lang.Number)10);
    org.jfree.data.time.ohlc.OHLCItem var36 = new org.jfree.data.time.ohlc.OHLCItem((org.jfree.data.time.RegularTimePeriod)var28, 100.0d, 0.0d, 0.05d, 0.0d);
    org.jfree.chart.plot.XYPlot var37 = new org.jfree.chart.plot.XYPlot();
    java.lang.Object var38 = var37.clone();
    org.jfree.data.ComparableObjectItem var39 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable)var36, (java.lang.Object)var37);
    double var40 = var36.getLowValue();
    boolean var41 = var26.equals((java.lang.Object)var36);
    var0.setDomainAxisLocation(var26);
    
    // Checks the contract:  equals-hashcode on var0 and var10
    assertTrue("Contract failed: equals-hashcode on var0 and var10", var0.equals(var10) ? var0.hashCode() == var10.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var10 and var0
    assertTrue("Contract failed: equals-hashcode on var10 and var0", var10.equals(var0) ? var10.hashCode() == var0.hashCode() : true);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test468"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.plot.CategoryMarker var2 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var3 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var5 = var3.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var8 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var9 = var8.getTickLabelPaint();
    var3.setFillPaint(var9, true);
    var2.setLabelPaint(var9);
    var0.setDomainGridlinePaint(var9);
    var0.clearDomainMarkers();
    org.jfree.chart.axis.SubCategoryAxis var16 = new org.jfree.chart.axis.SubCategoryAxis("Compass Plot");
    var16.configure();
    double var18 = var16.getLowerMargin();
    org.jfree.chart.axis.CategoryAxis[] var19 = new org.jfree.chart.axis.CategoryAxis[] { var16};
    var0.setDomainAxes(var19);
    var0.clearRangeAxes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test469"); }


    org.jfree.chart.plot.CombinedDomainCategoryPlot var8 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    java.util.List var9 = var8.getSubplots();
    org.jfree.data.statistics.BoxAndWhiskerItem var10 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)100.0d, (java.lang.Number)0.3d, (java.lang.Number)2.0d, (java.lang.Number)2, (java.lang.Number)(short)10, (java.lang.Number)10.0f, (java.lang.Number)15, (java.lang.Number)2.0d, var9);
    java.lang.Number var11 = var10.getMinOutlier();
    java.lang.Number var12 = var10.getMedian();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 15+ "'", var11.equals(15));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 0.3d+ "'", var12.equals(0.3d));

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test470"); }


    org.jfree.chart.renderer.category.StackedBarRenderer3D var3 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(100.0d, 0.0d, true);
    org.jfree.chart.labels.ItemLabelPosition var4 = var3.getPositiveItemLabelPositionFallback();
    org.jfree.chart.plot.CategoryPlot var5 = var3.getPlot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test471"); }


    org.jfree.chart.block.LabelBlock var1 = new org.jfree.chart.block.LabelBlock("-4,-4,4,4");

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test472"); }


    org.jfree.chart.plot.dial.DialPlot var0 = new org.jfree.chart.plot.dial.DialPlot();
    float var1 = var0.getForegroundAlpha();
    org.jfree.chart.plot.dial.DialFrame var2 = var0.getDialFrame();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test473"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var1 = var0.getPreferredSize();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var0.setNextFocusableComponent((java.awt.Component)var2);
    java.util.Locale var4 = var2.getLocale();
    javax.swing.JPanel var5 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var6 = var5.getPreferredSize();
    java.awt.Dimension var7 = var2.getSize(var6);
    java.awt.event.ContainerListener[] var8 = var2.getContainerListeners();
    var2.removeNotify();
    boolean var10 = var2.requestFocusInWindow();
    javax.swing.JPopupMenu var11 = var2.getComponentPopupMenu();
    
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test474"); }


    org.jfree.chart.plot.ContourPlot var0 = new org.jfree.chart.plot.ContourPlot();
    org.jfree.chart.plot.CategoryMarker var2 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    var0.addRangeMarker((org.jfree.chart.plot.Marker)var2);
    boolean var4 = var0.isRangeZoomable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test475"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("PanelUI");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test476"); }


    org.jfree.data.DefaultKeyedValues var0 = new org.jfree.data.DefaultKeyedValues();
    int var1 = var0.getItemCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test477"); }


    org.jfree.chart.axis.CyclicNumberAxis var2 = new org.jfree.chart.axis.CyclicNumberAxis(0.04d, "jfreechart-onetime-");

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test478"); }


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
    org.jfree.data.time.Week var18 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var19 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var18);
    org.jfree.data.time.TimePeriodValue var21 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var18, (java.lang.Number)10);
    org.jfree.data.time.ohlc.OHLCItem var26 = new org.jfree.data.time.ohlc.OHLCItem((org.jfree.data.time.RegularTimePeriod)var18, 100.0d, 0.0d, 0.05d, 0.0d);
    org.jfree.chart.plot.XYPlot var27 = new org.jfree.chart.plot.XYPlot();
    java.lang.Object var28 = var27.clone();
    org.jfree.data.ComparableObjectItem var29 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable)var26, (java.lang.Object)var27);
    double var30 = var26.getLowValue();
    boolean var31 = var16.equals((java.lang.Object)var26);
    org.jfree.data.statistics.SimpleHistogramDataset var32 = new org.jfree.data.statistics.SimpleHistogramDataset((java.lang.Comparable)var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var35 = var32.getYValue(5, 80);
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test479"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    org.jfree.data.time.TimePeriodValue var5 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var2, (java.lang.Number)10);
    var0.setDomainCrosshairColumnKey((java.lang.Comparable)10);
    java.awt.Stroke var7 = var0.getRangeMinorGridlineStroke();
    boolean var8 = var0.isRangeMinorGridlinesVisible();
    double[] var11 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var12 = new org.jfree.chart.annotations.XYPolygonAnnotation(var11);
    double[] var15 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var16 = new org.jfree.chart.annotations.XYPolygonAnnotation(var15);
    org.jfree.chart.ClipPath var17 = new org.jfree.chart.ClipPath(var11, var15);
    double[][] var18 = new double[][] { var11};
    double[] var23 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var24 = new org.jfree.chart.annotations.XYPolygonAnnotation(var23);
    double[] var27 = new double[] { 1.0d, 0.0d};
    org.jfree.chart.annotations.XYPolygonAnnotation var28 = new org.jfree.chart.annotations.XYPolygonAnnotation(var27);
    org.jfree.chart.ClipPath var29 = new org.jfree.chart.ClipPath(var23, var27);
    double[][] var30 = new double[][] { var23};
    org.jfree.data.category.CategoryDataset var31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", "jfreechart-onetime-", var30);
    org.jfree.data.category.DefaultIntervalCategoryDataset var32 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var18, var30);
    java.util.List var33 = var32.getColumnKeys();
    var0.setDataset((org.jfree.data.category.CategoryDataset)var32);
    org.jfree.data.Range var36 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds((org.jfree.data.category.CategoryDataset)var32, 0.0d);
    org.jfree.data.time.DateRange var37 = new org.jfree.data.time.DateRange();
    long var38 = var37.getUpperMillis();
    org.jfree.data.general.DefaultKeyedValues2DDataset var39 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var39.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var44 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var39);
    org.jfree.data.Range var46 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds((org.jfree.data.category.CategoryDataset)var39, true);
    org.jfree.chart.block.RectangleConstraint var47 = new org.jfree.chart.block.RectangleConstraint((org.jfree.data.Range)var37, var46);
    org.jfree.data.time.DateRange var50 = new org.jfree.data.time.DateRange((-1.0d), 1.0d);
    org.jfree.chart.block.RectangleConstraint var51 = var47.toRangeHeight((org.jfree.data.Range)var50);
    org.jfree.chart.block.RectangleConstraint var52 = new org.jfree.chart.block.RectangleConstraint(var36, (org.jfree.data.Range)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test480"); }


    org.jfree.chart.renderer.xy.HighLowRenderer var0 = new org.jfree.chart.renderer.xy.HighLowRenderer();
    java.awt.Paint var1 = var0.getCloseTickPaint();
    var0.setDrawOpenTicks(true);
    org.jfree.chart.renderer.xy.XYSplineRenderer var5 = new org.jfree.chart.renderer.xy.XYSplineRenderer(2147483647);
    var5.setLinesVisible(true);
    boolean var8 = var5.getAutoPopulateSeriesShape();
    boolean var9 = var0.equals((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test481"); }


    org.jfree.chart.renderer.xy.StackedXYBarRenderer var0 = new org.jfree.chart.renderer.xy.StackedXYBarRenderer();
    javax.swing.JPanel var1 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var2 = var1.getPreferredSize();
    java.awt.image.ColorModel var3 = var1.getColorModel();
    var1.updateUI();
    java.lang.String var5 = var1.toString();
    var1.setFocusable(true);
    boolean var8 = var0.equals((java.lang.Object)var1);
    java.awt.Paint var10 = var0.lookupSeriesOutlinePaint((-1));
    org.jfree.chart.plot.PolarPlot var11 = new org.jfree.chart.plot.PolarPlot();
    boolean var12 = var11.isCounterClockwise();
    var11.setRadiusGridlinesVisible(false);
    int var15 = var11.getDatasetCount();
    boolean var16 = var11.isAngleGridlinesVisible();
    org.jfree.data.xy.CategoryTableXYDataset var18 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.general.DefaultKeyedValues2DDataset var19 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var19.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    boolean var24 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.category.CategoryDataset)var19);
    java.util.List var25 = var19.getColumnKeys();
    org.jfree.data.Range var27 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset)var18, var25, true);
    var11.setDataset(15, (org.jfree.data.xy.XYDataset)var18);
    var18.add((java.lang.Number)0.04d, (java.lang.Number)52, "hi!?hi!=100&amp;hi!=1", false);
    org.jfree.data.Range var34 = var0.findRangeBounds((org.jfree.data.xy.XYDataset)var18);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test482"); }


    org.jfree.chart.plot.dial.StandardDialFrame var0 = new org.jfree.chart.plot.dial.StandardDialFrame();
    boolean var1 = var0.isClippedToWindow();
    javax.swing.JPanel var2 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var3 = var2.getPreferredSize();
    javax.swing.JPanel var4 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    var2.setNextFocusableComponent((java.awt.Component)var4);
    var2.show();
    javax.swing.JPanel var7 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var8 = var7.getLocation();
    java.awt.Dimension var9 = var7.preferredSize();
    java.awt.Rectangle var10 = var7.bounds();
    var2.scrollRectToVisible(var10);
    java.awt.Shape var12 = var0.getWindow((java.awt.geom.Rectangle2D)var10);
    org.jfree.chart.plot.CombinedRangeXYPlot var13 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Paint var14 = var13.getRangeCrosshairPaint();
    var0.setForegroundPaint(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test483"); }


    org.jfree.chart.title.TextTitle var3 = new org.jfree.chart.title.TextTitle("hi!");
    boolean var4 = var3.isVisible();
    java.lang.Object var5 = var3.clone();
    var3.setMargin(4.0d, 100.0d, 4.0d, 10.0d);
    org.jfree.chart.annotations.XYTitleAnnotation var11 = new org.jfree.chart.annotations.XYTitleAnnotation(0.04d, (-90.0d), (org.jfree.chart.title.Title)var3);
    java.lang.Object var12 = var11.clone();
    var11.setMaxWidth((-0.4636476090008061d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test484"); }


    org.jfree.data.xml.RootHandler var0 = new org.jfree.data.xml.RootHandler();
    var0.endElement("", "hi!", "hi!");
    char[] var8 = new char[] { '#', ' ', ' '};
    var0.ignorableWhitespace(var8, 51, (-2));
    org.xml.sax.helpers.DefaultHandler var12 = var0.getCurrentHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test485"); }


    org.jfree.chart.axis.PeriodAxis var1 = new org.jfree.chart.axis.PeriodAxis("Compass Plot");
    org.jfree.data.general.DefaultKeyedValues2DDataset var2 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var2.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.category.CategoryDataset)var2);
    org.jfree.data.Range var9 = org.jfree.data.Range.shift(var7, (-1.0d));
    var1.setRange(var9, false, true);
    org.jfree.data.Range var15 = org.jfree.data.Range.shift(var9, 0.75d, false);
    org.jfree.chart.axis.TickUnitSource var16 = org.jfree.chart.axis.NumberAxis.createStandardTickUnits();
    boolean var17 = var9.equals((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test486"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    var0.setUseSeriesOffset(true);
    var0.setBaseSeriesVisible(true);
    var0.setAutoPopulateSeriesShape(false);
    org.jfree.chart.labels.ItemLabelPosition var7 = var0.getPositiveItemLabelPosition();
    org.jfree.chart.renderer.xy.XYBlockRenderer var8 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
    org.jfree.data.xy.CategoryTableXYDataset var9 = new org.jfree.data.xy.CategoryTableXYDataset();
    org.jfree.data.Range var10 = var8.findDomainBounds((org.jfree.data.xy.XYDataset)var9);
    org.jfree.chart.renderer.category.BarRenderer3D var13 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var14 = var13.getItemLabelFont();
    double var15 = var13.getItemLabelAnchorOffset();
    org.jfree.chart.labels.ItemLabelPosition var18 = var13.getNegativeItemLabelPosition(0, 0);
    double var19 = var18.getAngle();
    var8.setNegativeItemLabelPosition(var18);
    org.jfree.chart.labels.XYSeriesLabelGenerator var21 = var8.getLegendItemToolTipGenerator();
    org.jfree.chart.title.LegendTitle var22 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var8);
    org.jfree.chart.block.BlockContainer var23 = var22.getItemContainer();
    org.jfree.chart.block.CenterArrangement var24 = new org.jfree.chart.block.CenterArrangement();
    var23.setArrangement((org.jfree.chart.block.Arrangement)var24);
    org.jfree.chart.block.CenterArrangement var26 = new org.jfree.chart.block.CenterArrangement();
    org.jfree.chart.title.LegendTitle var27 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var0, (org.jfree.chart.block.Arrangement)var24, (org.jfree.chart.block.Arrangement)var26);
    
    // Checks the contract:  equals-hashcode on var24 and var26
    assertTrue("Contract failed: equals-hashcode on var24 and var26", var24.equals(var26) ? var24.hashCode() == var26.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var26 and var24
    assertTrue("Contract failed: equals-hashcode on var26 and var24", var26.equals(var24) ? var26.hashCode() == var24.hashCode() : true);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test487"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var1 = var0.getLocation();
    java.awt.Dimension var2 = var0.preferredSize();
    org.jfree.chart.plot.ContourPlot var3 = new org.jfree.chart.plot.ContourPlot();
    var0.addPropertyChangeListener((java.beans.PropertyChangeListener)var3);
    org.jfree.data.general.DatasetGroup var5 = var3.getDatasetGroup();
    java.lang.String[] var8 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var9 = new org.jfree.chart.axis.SymbolAxis("hi!", var8);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var10 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var12 = var10.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var15 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var16 = var15.getTickLabelPaint();
    var10.setFillPaint(var16, true);
    var9.setGridBandAlternatePaint(var16);
    var9.setFixedDimension(100.0d);
    var3.setDomainAxis((org.jfree.chart.axis.ValueAxis)var9);
    var3.setDataAreaRatio(0.04d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test488"); }


    org.jfree.chart.renderer.category.BarRenderer3D var0 = new org.jfree.chart.renderer.category.BarRenderer3D();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var3 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var6 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var7 = var6.getItemLabelFont();
    double var8 = var6.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var11 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var12 = var11.getItemLabelFont();
    java.awt.Shape var13 = var11.getBaseLegendShape();
    var6.setShape(var13);
    var3.setLegendBar(var13);
    org.jfree.data.general.DefaultKeyedValues2DDataset var18 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var21 = new org.jfree.chart.entity.CategoryItemEntity(var13, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var18, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    org.jfree.data.Range var23 = var0.findRangeBounds((org.jfree.data.category.CategoryDataset)var18, true);
    org.jfree.chart.labels.SymbolicXYItemLabelGenerator var25 = new org.jfree.chart.labels.SymbolicXYItemLabelGenerator();
    org.jfree.chart.urls.TimeSeriesURLGenerator var26 = new org.jfree.chart.urls.TimeSeriesURLGenerator();
    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var27 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer(100, (org.jfree.chart.labels.XYToolTipGenerator)var25, (org.jfree.chart.urls.XYURLGenerator)var26);
    boolean var28 = var27.getPlotShapes();
    boolean var29 = var18.equals((java.lang.Object)var27);
    java.awt.Paint var31 = var27.getSeriesOutlinePaint(10);
    var27.setUseFillPaint(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test489"); }


    org.jfree.data.xy.DefaultIntervalXYDataset var0 = new org.jfree.data.xy.DefaultIntervalXYDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var0.getItemCount(20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test490"); }


    org.jfree.data.xy.XYSeries var1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)10);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test491"); }


    javax.swing.JPanel var0 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Point var1 = var0.getLocation();
    java.awt.Dimension var2 = var0.preferredSize();
    java.awt.Rectangle var3 = var0.bounds();
    org.jfree.chart.renderer.xy.ClusteredXYBarRenderer var6 = new org.jfree.chart.renderer.xy.ClusteredXYBarRenderer(1.0d, false);
    org.jfree.chart.renderer.category.BarRenderer3D var9 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var10 = var9.getItemLabelFont();
    double var11 = var9.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var14 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var15 = var14.getItemLabelFont();
    java.awt.Shape var16 = var14.getBaseLegendShape();
    var9.setShape(var16);
    var6.setLegendBar(var16);
    org.jfree.data.general.DefaultKeyedValues2DDataset var21 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    org.jfree.chart.entity.CategoryItemEntity var24 = new org.jfree.chart.entity.CategoryItemEntity(var16, "hi!", "org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", (org.jfree.data.category.CategoryDataset)var21, (java.lang.Comparable)0.0f, (java.lang.Comparable)true);
    org.jfree.chart.plot.CombinedRangeXYPlot var25 = new org.jfree.chart.plot.CombinedRangeXYPlot();
    java.awt.Stroke var26 = var25.getRangeZeroBaselineStroke();
    org.jfree.chart.plot.CategoryMarker var28 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0f);
    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var29 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var31 = var29.getSeriesItemLabelGenerator(0);
    org.jfree.chart.axis.CyclicNumberAxis var34 = new org.jfree.chart.axis.CyclicNumberAxis(10.0d, 100.0d);
    java.awt.Paint var35 = var34.getTickLabelPaint();
    var29.setFillPaint(var35, true);
    var28.setLabelPaint(var35);
    org.jfree.chart.annotations.XYShapeAnnotation var39 = new org.jfree.chart.annotations.XYShapeAnnotation(var16, var26, var35);
    java.lang.String[] var42 = new java.lang.String[] { "hi!"};
    org.jfree.chart.axis.SymbolAxis var43 = new org.jfree.chart.axis.SymbolAxis("hi!", var42);
    org.jfree.chart.renderer.category.BarRenderer3D var46 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var47 = var46.getItemLabelFont();
    double var48 = var46.getItemLabelAnchorOffset();
    org.jfree.chart.renderer.category.BarRenderer3D var51 = new org.jfree.chart.renderer.category.BarRenderer3D(10.0d, 0.0d);
    java.awt.Font var52 = var51.getItemLabelFont();
    java.awt.Shape var53 = var51.getBaseLegendShape();
    var46.setShape(var53);
    var43.setDownArrow(var53);
    javax.swing.JPanel var56 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var57 = var56.getPreferredSize();
    java.awt.image.ColorModel var58 = var56.getColorModel();
    var56.updateUI();
    java.lang.String var60 = var56.toString();
    boolean var61 = var56.getInheritsPopupMenu();
    javax.swing.InputMap var62 = var56.getInputMap();
    var56.nextFocus();
    boolean var64 = var56.getInheritsPopupMenu();
    javax.swing.JPanel var65 = org.jfree.chart.demo.PieChartDemo1.createDemoPanel();
    java.awt.Dimension var66 = var65.getPreferredSize();
    java.awt.image.ColorModel var67 = var65.getColorModel();
    var65.firePropertyChange("", 0.0f, 0.0f);
    java.awt.Color var72 = var65.getForeground();
    var56.setForeground(var72);
    var43.setGridBandAlternatePaint((java.awt.Paint)var72);
    org.jfree.chart.annotations.XYShapeAnnotation var75 = new org.jfree.chart.annotations.XYShapeAnnotation((java.awt.Shape)var3, var26, (java.awt.Paint)var72);
    java.lang.Object var76 = var75.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var60,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var60.equals("org.jfree.chart.ChartPanel[,0,0,0var60,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test492"); }


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
    java.lang.Object var31 = var29.clone();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jfree.chart.ChartPanel[,0,0,0var13,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"+ "'", var13.equals("org.jfree.chart.ChartPanel[,0,0,0var13,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test493"); }


    org.jfree.chart.plot.MultiplePiePlot var1 = new org.jfree.chart.plot.MultiplePiePlot();
    org.jfree.chart.JFreeChart var2 = var1.getPieChart();
    var2.setBackgroundImageAlpha(1.0f);
    boolean var5 = var2.getAntiAlias();
    org.jfree.chart.ChartFrame var6 = new org.jfree.chart.ChartFrame("Range[0.0,0.0]", var2);
    org.jfree.chart.ChartPanel var8 = new org.jfree.chart.ChartPanel(var2, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.XYPlot var9 = var2.getXYPlot();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test494"); }


    org.jfree.chart.renderer.xy.CyclicXYItemRenderer var0 = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem(1, 0);
    org.jfree.data.xy.XYIntervalSeriesCollection var4 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    org.jfree.data.Range var5 = var0.findRangeBounds((org.jfree.data.xy.XYDataset)var4);
    var4.removeAllSeries();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var4.getEndYValue(2, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test495"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var3 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var2);
    org.jfree.data.time.TimePeriodValue var5 = new org.jfree.data.time.TimePeriodValue((org.jfree.data.time.TimePeriod)var2, (java.lang.Number)10);
    org.jfree.data.time.ohlc.OHLCItem var10 = new org.jfree.data.time.ohlc.OHLCItem((org.jfree.data.time.RegularTimePeriod)var2, 100.0d, 0.0d, 0.05d, 0.0d);
    org.jfree.chart.plot.XYPlot var11 = new org.jfree.chart.plot.XYPlot();
    java.lang.Object var12 = var11.clone();
    org.jfree.data.ComparableObjectItem var13 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable)var10, (java.lang.Object)var11);
    double var14 = var10.getLowValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var16 = var0.getValue((java.lang.Comparable)var14, (java.lang.Comparable)15);
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.05d);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test496"); }


    org.jfree.data.xy.VectorSeriesCollection var0 = new org.jfree.data.xy.VectorSeriesCollection();
    var0.removeAllSeries();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.Vector var4 = var0.getVector(15, 3);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test497"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    java.lang.Boolean var2 = var0.getSeriesLinesVisible(10);
    java.awt.Stroke var3 = var0.getErrorIndicatorStroke();
    org.jfree.data.general.DefaultKeyedValues2DDataset var4 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    var4.addValue((java.lang.Number)1.0f, (java.lang.Comparable)(-1.0f), (java.lang.Comparable)(-1.0f));
    var4.setValue((java.lang.Number)0.04d, (java.lang.Comparable)(short)(-1), (java.lang.Comparable)(-1.0f));
    org.jfree.data.Range var13 = var0.findRangeBounds((org.jfree.data.category.CategoryDataset)var4);
    org.jfree.data.time.Year var19 = new org.jfree.data.time.Year(100);
    org.jfree.data.time.Month var20 = new org.jfree.data.time.Month(1, var19);
    org.jfree.data.time.RegularTimePeriod var21 = var20.previous();
    long var22 = var20.getSerialIndex();
    org.jfree.data.time.TimeTableXYDataset var23 = new org.jfree.data.time.TimeTableXYDataset();
    org.jfree.data.time.Week var25 = new org.jfree.data.time.Week();
    org.jfree.data.gantt.Task var26 = new org.jfree.data.gantt.Task("hi!", (org.jfree.data.time.TimePeriod)var25);
    var23.remove((org.jfree.data.time.TimePeriod)var25, (java.lang.Comparable)100, false);
    org.jfree.chart.axis.PeriodAxis var30 = new org.jfree.chart.axis.PeriodAxis("Compass Plot", (org.jfree.data.time.RegularTimePeriod)var20, (org.jfree.data.time.RegularTimePeriod)var25);
    java.util.Date var31 = var25.getEnd();
    org.jfree.data.time.Quarter var32 = new org.jfree.data.time.Quarter(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.incrementValue((-90.0d), (java.lang.Comparable)"hi!?hi!=100&amp;amp;hi!=1", (java.lang.Comparable)var32);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1201L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test498"); }


    org.jfree.chart.StandardChartTheme var2 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    org.jfree.chart.plot.DrawingSupplier var3 = var2.getDrawingSupplier();
    org.jfree.chart.plot.dial.StandardDialScale var4 = new org.jfree.chart.plot.dial.StandardDialScale();
    var4.setMajorTickIncrement(10.0d);
    java.awt.Paint var7 = var4.getMinorTickPaint();
    var2.setTickLabelPaint(var7);
    java.awt.Font var9 = var2.getSmallFont();
    java.awt.Font var10 = var2.getExtraLargeFont();
    org.jfree.chart.StandardChartTheme var12 = new org.jfree.chart.StandardChartTheme("Compass Plot");
    java.awt.Paint var13 = var12.getTitlePaint();
    org.jfree.chart.plot.CategoryPlot var14 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.axis.CategoryAxis var15 = var14.getDomainAxis();
    boolean var16 = var14.isRangeMinorGridlinesVisible();
    org.jfree.chart.renderer.xy.StackedXYAreaRenderer var17 = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer();
    boolean var18 = var17.isOutline();
    var17.setUseFillPaint(true);
    org.jfree.chart.StandardChartTheme var23 = new org.jfree.chart.StandardChartTheme("org.jfree.chart.ChartPanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=680,height=420]]", true);
    java.awt.Paint var24 = var23.getLegendItemPaint();
    var17.setShapePaint(var24);
    var14.setRangeMinorGridlinePaint(var24);
    var12.setShadowPaint(var24);
    var2.setChartBackgroundPaint(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test499"); }


    org.jfree.chart.renderer.category.StackedAreaRenderer var1 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.LegendItem var4 = var1.getLegendItem((-1), (-1));
    org.jfree.chart.LegendItem var7 = var1.getLegendItem(100, 2147483647);
    java.lang.Number[][] var8 = new java.lang.Number[][] { };
    java.lang.Number[][] var9 = new java.lang.Number[][] { };
    org.jfree.data.category.DefaultIntervalCategoryDataset var10 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var8, var9);
    org.jfree.data.Range var11 = var1.findRangeBounds((org.jfree.data.category.CategoryDataset)var10);
    org.jfree.data.Range var13 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.category.CategoryDataset)var10, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test500"); }


    org.jfree.data.function.PowerFunction2D var2 = new org.jfree.data.function.PowerFunction2D(2.0d, 1.0d);
    double var3 = var2.getB();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);

  }

}
