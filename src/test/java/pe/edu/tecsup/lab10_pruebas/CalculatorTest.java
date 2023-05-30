package pe.edu.tecsup.lab10_pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private static final Logger log =
				LogManager.getLogger(CalculatorTest.class);
	Calculator app = new Calculator();
	
	@BeforeAll
	static void initAll() {
		Configurator.setRootLevel(org.apache.logging.log4j.Level.INFO);
		log.info("initAll()...!");
	}
	
	@BeforeEach
	void init() {
		log.info("init()....!");
	}
	
	@Test
	public void testAdd() {
		log.info("testAdd()");
		int EXPECTED_VALUE=7;
		assertEquals(EXPECTED_VALUE, app.add(4, 3));
	}

	@Test
	public void testSub() {
		log.info("testSub()");
		int EXPECTED_VALUE=1;
		assertEquals(EXPECTED_VALUE, app.sub(4, 3));
	}
	@AfterEach
	void tearDown() {
		log.info("tearDown()....!");
	}
	
	@AfterAll
	static void tearDownAll() {
		log.info("tearDownAll()....!");
	}
}