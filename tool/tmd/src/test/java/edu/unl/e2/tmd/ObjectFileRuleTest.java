package edu.unl.e2.tmd;

import net.sourceforge.pmd.testframework.SimpleAggregatorTst;

import org.junit.Ignore;
import org.junit.runner.RunWith;


@RunWith(net.sourceforge.pmd.testframework.PMDTestRunner.class)
public class ObjectFileRuleTest extends SimpleAggregatorTst {

    private static final String RULESET = "tmd-file";

    @Override
    public void setUp() {
       
        addRule(RULESET, "ObjectBasedFileRule");
       
    }	
}
