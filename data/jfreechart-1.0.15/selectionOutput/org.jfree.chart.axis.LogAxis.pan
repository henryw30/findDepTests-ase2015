org.jfree.chart.axis.LogAxis.pan : r1 = virtualinvoke r0.<org.jfree.chart.axis.LogAxis: org.jfree.data.Range getRange()>() >>>>>>>> org.jfree.chart.axis.LogAxis.pan : d1 = virtualinvoke r1.<org.jfree.data.Range: double getLowerBound()>()
org.jfree.chart.axis.LogAxis.pan : d1 = virtualinvoke r1.<org.jfree.data.Range: double getLowerBound()>() >>>>>>>> org.jfree.chart.axis.LogAxis.pan : d2 = virtualinvoke r1.<org.jfree.data.Range: double getUpperBound()>()
org.jfree.chart.axis.LogAxis.pan : d2 = virtualinvoke r1.<org.jfree.data.Range: double getUpperBound()>() >>>>>>>> org.jfree.chart.axis.LogAxis.pan : d3 = virtualinvoke r0.<org.jfree.chart.axis.LogAxis: double calculateLog(double)>(d1)
org.jfree.chart.axis.LogAxis.pan : d3 = virtualinvoke r0.<org.jfree.chart.axis.LogAxis: double calculateLog(double)>(d1) >>>>>>>> org.jfree.chart.axis.LogAxis.pan : d4 = virtualinvoke r0.<org.jfree.chart.axis.LogAxis: double calculateLog(double)>(d2)
org.jfree.chart.axis.LogAxis.pan : d4 = virtualinvoke r0.<org.jfree.chart.axis.LogAxis: double calculateLog(double)>(d2) >>>>>>>> org.jfree.chart.axis.LogAxis.pan : d5 = d4 - d3
org.jfree.chart.axis.LogAxis.pan : d5 = d4 - d3 >>>>>>>> org.jfree.chart.axis.LogAxis.pan : d6 = d5 * d0
org.jfree.chart.axis.LogAxis.pan : d6 = d5 * d0 >>>>>>>> org.jfree.chart.axis.LogAxis.pan : d7 = d3 + d6
org.jfree.chart.axis.LogAxis.pan : d7 = d3 + d6 >>>>>>>> org.jfree.chart.axis.LogAxis.pan : d8 = d4 + d6
org.jfree.chart.axis.LogAxis.pan : d8 = d4 + d6 >>>>>>>> org.jfree.chart.axis.LogAxis.pan : $d9 = virtualinvoke r0.<org.jfree.chart.axis.LogAxis: double calculateValue(double)>(d7)
org.jfree.chart.axis.LogAxis.pan : $d9 = virtualinvoke r0.<org.jfree.chart.axis.LogAxis: double calculateValue(double)>(d7) >>>>>>>> org.jfree.chart.axis.LogAxis.pan : $d10 = virtualinvoke r0.<org.jfree.chart.axis.LogAxis: double calculateValue(double)>(d8)
org.jfree.chart.axis.LogAxis.pan : $d10 = virtualinvoke r0.<org.jfree.chart.axis.LogAxis: double calculateValue(double)>(d8) >>>>>>>> org.jfree.chart.axis.LogAxis.pan : virtualinvoke r0.<org.jfree.chart.axis.LogAxis: void setRange(double,double)>($d9, $d10)
org.jfree.chart.axis.LogAxis.pan : virtualinvoke r0.<org.jfree.chart.axis.LogAxis: void setRange(double,double)>($d9, $d10) >>>>>>>> org.jfree.chart.axis.LogAxis.pan : return
