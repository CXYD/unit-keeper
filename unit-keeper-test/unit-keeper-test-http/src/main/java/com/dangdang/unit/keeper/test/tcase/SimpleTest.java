
package com.dangdang.unit.keeper.test.tcase;

import org.junit.Test;

import com.dangdang.unit.keeper.test.common.AbstractHttpTestCase;

/**
 * 示例测试程序
 * 
 * @author liubq
 */
public class SimpleTest extends AbstractHttpTestCase {

	@Test
	public void testHttp() throws Exception {
		AbstractHttpTestCase.clearAfterTestCaseEnd = false;
		String path = System.getProperty("user.dir") + "/src/main/resources/simple/simple_http.xml";
		testByFile(path);
	}
}
