org.joda.time.Interval.gap : r2 = staticinvoke <org.joda.time.DateTimeUtils: org.joda.time.ReadableInterval getReadableInterval(org.joda.time.ReadableInterval)>(r1) >>>>>>>> org.joda.time.Interval.gap : l0 = interfaceinvoke r2.<org.joda.time.ReadableInterval: long getStartMillis()>()
org.joda.time.Interval.gap : l0 = interfaceinvoke r2.<org.joda.time.ReadableInterval: long getStartMillis()>() >>>>>>>> org.joda.time.Interval.gap : l1 = interfaceinvoke r2.<org.joda.time.ReadableInterval: long getEndMillis()>()
org.joda.time.Interval.gap : l1 = interfaceinvoke r2.<org.joda.time.ReadableInterval: long getEndMillis()>() >>>>>>>> org.joda.time.Interval.gap : l2 = virtualinvoke r0.<org.joda.time.Interval: long getStartMillis()>()
org.joda.time.Interval.gap : l2 = virtualinvoke r0.<org.joda.time.Interval: long getStartMillis()>() >>>>>>>> org.joda.time.Interval.gap : l3 = virtualinvoke r0.<org.joda.time.Interval: long getEndMillis()>()
org.joda.time.Interval.gap : l3 = virtualinvoke r0.<org.joda.time.Interval: long getEndMillis()>() >>>>>>>> org.joda.time.Interval.gap : $b4 = l2 cmp l1
org.joda.time.Interval.gap : $b4 = l2 cmp l1 >>>>>>>> org.joda.time.Interval.gap : if $b4 <= 0
org.joda.time.Interval.gap : if $b4 <= 0 >>>>>>>> org.joda.time.Interval.gap : $r3 = new org.joda.time.Interval
org.joda.time.Interval.gap : if $b4 <= 0 >>>>>>>> org.joda.time.Interval.gap : $b5 = l0 cmp l3
org.joda.time.Interval.gap : $b5 = l0 cmp l3 >>>>>>>> org.joda.time.Interval.gap : if $b5 <= 0
org.joda.time.Interval.gap : if $b5 <= 0 >>>>>>>> org.joda.time.Interval.gap : $r5 = new org.joda.time.Interval
org.joda.time.Interval.gap : if $b5 <= 0 >>>>>>>> org.joda.time.Interval.gap : return null
org.joda.time.Interval.gap : $r5 = new org.joda.time.Interval >>>>>>>> org.joda.time.Interval.gap : $r6 = virtualinvoke r0.<org.joda.time.Interval: org.joda.time.Chronology getChronology()>()
org.joda.time.Interval.gap : $r6 = virtualinvoke r0.<org.joda.time.Interval: org.joda.time.Chronology getChronology()>() >>>>>>>> org.joda.time.Interval.gap : specialinvoke $r5.<org.joda.time.Interval: void <init>(long,long,org.joda.time.Chronology)>(l3, l0, $r6)
org.joda.time.Interval.gap : specialinvoke $r5.<org.joda.time.Interval: void <init>(long,long,org.joda.time.Chronology)>(l3, l0, $r6) >>>>>>>> org.joda.time.Interval.gap : return $r5
org.joda.time.Interval.gap : $r3 = new org.joda.time.Interval >>>>>>>> org.joda.time.Interval.gap : $r4 = virtualinvoke r0.<org.joda.time.Interval: org.joda.time.Chronology getChronology()>()
org.joda.time.Interval.gap : $r4 = virtualinvoke r0.<org.joda.time.Interval: org.joda.time.Chronology getChronology()>() >>>>>>>> org.joda.time.Interval.gap : specialinvoke $r3.<org.joda.time.Interval: void <init>(long,long,org.joda.time.Chronology)>(l1, l2, $r4)
org.joda.time.Interval.gap : specialinvoke $r3.<org.joda.time.Interval: void <init>(long,long,org.joda.time.Chronology)>(l1, l2, $r4) >>>>>>>> org.joda.time.Interval.gap : return $r3
