package edu.unl.e2.tmd;

import net.sourceforge.pmd.testframework.SimpleAggregatorTst;

import org.junit.Ignore;
import org.junit.runner.RunWith;

@Ignore
@RunWith(net.sourceforge.pmd.testframework.PMDTestRunner.class)
public class FileRuleTest extends SimpleAggregatorTst {

    private static final String RULESET = "tmd-file";

    @Override
    public void setUp() {
       
        addRule(RULESET, "FileRule");
       
    }	
}
