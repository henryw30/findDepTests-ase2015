org.jfree.chart.axis.ValueAxis.pan : r1 = virtualinvoke r0.<org.jfree.chart.axis.ValueAxis: org.jfree.data.Range getRange()>() >>>>>>>> org.jfree.chart.axis.ValueAxis.pan : d1 = virtualinvoke r1.<org.jfree.data.Range: double getLength()>()
org.jfree.chart.axis.ValueAxis.pan : d1 = virtualinvoke r1.<org.jfree.data.Range: double getLength()>() >>>>>>>> org.jfree.chart.axis.ValueAxis.pan : d2 = d1 * d0
org.jfree.chart.axis.ValueAxis.pan : d2 = d1 * d0 >>>>>>>> org.jfree.chart.axis.ValueAxis.pan : $d5 = virtualinvoke r1.<org.jfree.data.Range: double getLowerBound()>()
org.jfree.chart.axis.ValueAxis.pan : $d5 = virtualinvoke r1.<org.jfree.data.Range: double getLowerBound()>() >>>>>>>> org.jfree.chart.axis.ValueAxis.pan : d3 = $d5 + d2
org.jfree.chart.axis.ValueAxis.pan : d3 = $d5 + d2 >>>>>>>> org.jfree.chart.axis.ValueAxis.pan : $d6 = virtualinvoke r1.<org.jfree.data.Range: double getUpperBound()>()
org.jfree.chart.axis.ValueAxis.pan : $d6 = virtualinvoke r1.<org.jfree.data.Range: double getUpperBound()>() >>>>>>>> org.jfree.chart.axis.ValueAxis.pan : d4 = $d6 + d2
org.jfree.chart.axis.ValueAxis.pan : d4 = $d6 + d2 >>>>>>>> org.jfree.chart.axis.ValueAxis.pan : virtualinvoke r0.<org.jfree.chart.axis.ValueAxis: void setRange(double,double)>(d3, d4)
org.jfree.chart.axis.ValueAxis.pan : virtualinvoke r0.<org.jfree.chart.axis.ValueAxis: void setRange(double,double)>(d3, d4) >>>>>>>> org.jfree.chart.axis.ValueAxis.pan : return
