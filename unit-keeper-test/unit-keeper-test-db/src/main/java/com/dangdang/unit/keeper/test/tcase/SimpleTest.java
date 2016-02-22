
package com.dangdang.unit.keeper.test.tcase;

import org.junit.Test;

import com.dangdang.unit.keeper.test.common.AbstractDBTestCase;

/**
 * 示例测试程序
 * 
 * @author liubq
 */
public class SimpleTest extends AbstractDBTestCase {

	@Test
	public void testFun() throws Exception {
		AbstractDBTestCase.clearAfterTestCaseEnd = false;
		String path = System.getProperty("user.dir") + "/src/main/resources/simple/simple.xml";
		testByFile(path);
	}
	
	@Test
	public void testDBUnitFunction() throws Exception {
		AbstractDBTestCase.clearAfterTestCaseEnd = false;
		String path = System.getProperty("user.dir") + "/src/main/resources/simple/simple_function.xml";
		testByFile(path);
	}

	@Test
	public void testFunEmptyTable() throws Exception {
		String path = System.getProperty("user.dir") + "/src/main/resources/simple/simple_emptyTable.xml";
		testByFile(path);
	}

}
