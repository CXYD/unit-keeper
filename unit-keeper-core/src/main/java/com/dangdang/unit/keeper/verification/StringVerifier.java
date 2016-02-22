
package com.dangdang.unit.keeper.verification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringVerifier implements IVerifier {
	//日志
	private static final Logger logger = LoggerFactory.getLogger(StringVerifier.class);

	public void valid(String expJsonText, String actJsonText) throws Exception {
		String expectValueStr = expJsonText.trim();
		logger.info("expStringText:\r\n{}", expectValueStr);
		String actValueStr = actJsonText.trim();
		logger.info("actStringText:\r\n{}", actValueStr);
		org.junit.Assert.assertEquals(expectValueStr, actValueStr);
	}
}
