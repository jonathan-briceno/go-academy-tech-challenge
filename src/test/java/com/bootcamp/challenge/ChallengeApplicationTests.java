package com.bootcamp.challenge;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:./application.properties")
class ChallengeApplicationTests {

	@Test
	void contextLoads() {
	}

}
