
package com.dangdang.unit.keeper.test.tcase;

import java.io.File;

import org.junit.Test;

import com.dangdang.unit.keeper.test.common.AbstractRedisTestCase;

/**
 * 示例测试程序
 * 
 * @author liubq
 */
public class SimpleTest extends AbstractRedisTestCase {

	@Test
	public void testRedisXml() throws Exception {
		String path = System.getProperty("user.dir") + "/src/main/resources/simple/simple_redis.xml";
		testByFile(new File(path));
	}

}
