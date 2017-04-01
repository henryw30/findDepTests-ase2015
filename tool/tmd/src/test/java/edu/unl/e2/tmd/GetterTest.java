package edu.unl.e2.tmd;

import net.sourceforge.pmd.testframework.SimpleAggregatorTst;

import org.junit.runner.RunWith;


@RunWith(net.sourceforge.pmd.testframework.PMDTestRunner.class)
public class GetterTest extends SimpleAggregatorTst {

    private static final String RULESET = "tmd-getters";

    @Override
    public void setUp() {
       
        addRule(RULESET, "AvoidUselessGetterCallsRule");
       
    }	
}
