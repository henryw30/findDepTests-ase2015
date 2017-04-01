org.joda.time.chrono.gj.TestGJChronology.mod : $b2 = l1 cmp 0L >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : if $b2 >= 0
org.joda.time.chrono.gj.TestGJChronology.mod : if $b2 >= 0 >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : $r0 = new java.lang.IllegalArgumentException
org.joda.time.chrono.gj.TestGJChronology.mod : if $b2 >= 0 >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : $b3 = l0 cmp 0L
org.joda.time.chrono.gj.TestGJChronology.mod : $b3 = l0 cmp 0L >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : if $b3 < 0
org.joda.time.chrono.gj.TestGJChronology.mod : if $b3 < 0 >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : $l4 = l0 % l1
org.joda.time.chrono.gj.TestGJChronology.mod : if $b3 < 0 >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : $l5 = l0 + 1L
org.joda.time.chrono.gj.TestGJChronology.mod : $l5 = l0 + 1L >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : $l6 = $l5 % l1
org.joda.time.chrono.gj.TestGJChronology.mod : $l6 = $l5 % l1 >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : $l7 = $l6 - 1L
org.joda.time.chrono.gj.TestGJChronology.mod : $l7 = $l6 - 1L >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : $l8 = $l7 + l1
org.joda.time.chrono.gj.TestGJChronology.mod : $l8 = $l7 + l1 >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : return $l8
org.joda.time.chrono.gj.TestGJChronology.mod : $l4 = l0 % l1 >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : return $l4
org.joda.time.chrono.gj.TestGJChronology.mod : $r0 = new java.lang.IllegalArgumentException >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : $r1 = new java.lang.StringBuilder
org.joda.time.chrono.gj.TestGJChronology.mod : $r1 = new java.lang.StringBuilder >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : specialinvoke $r1.<java.lang.StringBuilder: void <init>()>()
org.joda.time.chrono.gj.TestGJChronology.mod : specialinvoke $r1.<java.lang.StringBuilder: void <init>()>() >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : $r2 = virtualinvoke $r1.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("divisor must be positive: ")
org.joda.time.chrono.gj.TestGJChronology.mod : $r2 = virtualinvoke $r1.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("divisor must be positive: ") >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : $r3 = virtualinvoke $r2.<java.lang.StringBuilder: java.lang.StringBuilder append(long)>(l1)
org.joda.time.chrono.gj.TestGJChronology.mod : $r3 = virtualinvoke $r2.<java.lang.StringBuilder: java.lang.StringBuilder append(long)>(l1) >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : $r4 = virtualinvoke $r3.<java.lang.StringBuilder: java.lang.String toString()>()
org.joda.time.chrono.gj.TestGJChronology.mod : $r4 = virtualinvoke $r3.<java.lang.StringBuilder: java.lang.String toString()>() >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : specialinvoke $r0.<java.lang.IllegalArgumentException: void <init>(java.lang.String)>($r4)
org.joda.time.chrono.gj.TestGJChronology.mod : specialinvoke $r0.<java.lang.IllegalArgumentException: void <init>(java.lang.String)>($r4) >>>>>>>> org.joda.time.chrono.gj.TestGJChronology.mod : throw $r0
