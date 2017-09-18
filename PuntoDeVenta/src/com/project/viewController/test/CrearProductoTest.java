package com.project.viewController.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.project.viewController.view.CrearProducto;

public class CrearProductoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNuevoProducto() {
		int result = CrearProducto.nuevoProducto(1, 10, 5000);
		assertTrue(result == 50000);
	}

}
