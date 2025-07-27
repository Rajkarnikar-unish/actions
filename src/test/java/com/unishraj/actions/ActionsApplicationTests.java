package com.unishraj.actions;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ActionsApplicationTests {

	@Autowired
	private ActionsApplication actionsApplication;

	@Test
	void contextLoads() {
	}

	@Test
	public void healthCheckerReturnsOk() {
		assertEquals("OK", actionsApplication.healthChecker() );
	}

}
