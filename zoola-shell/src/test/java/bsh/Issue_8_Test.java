package bsh;

import java.io.File;

//@RunWith(FilteredTestRunner.class)
public class Issue_8_Test {

	//@Test TODO test temporarily disabled
	//@Category(KnownIssue.class)
	public void run_script_class3() throws Exception {
		new OldScriptsTest.TestBshScript( new File("tests/test-scripts/class3.bsh")).runTest();
	}

}
