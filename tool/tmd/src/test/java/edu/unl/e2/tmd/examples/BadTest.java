package edu.unl.e2.tmd.examples;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@Ignore
public class BadTest {

@Test()
public void testName() throws Exception {
	OneInferface mock=mock(OneInferface.class);
	
	when(mock.doSomething()).thenReturn(1);
	verify(mock).doSomething();
		
}

}
