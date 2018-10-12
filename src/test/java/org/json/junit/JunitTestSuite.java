package org.json.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//Run from JUnit class
@RunWith(Suite.class)
@Suite.SuiteClasses({
	//Here provide all the class names which you need to test
	//JSONArrayTest.class,....  ---example
	JSONReadExample.class
})

public class JunitTestSuite {

}
