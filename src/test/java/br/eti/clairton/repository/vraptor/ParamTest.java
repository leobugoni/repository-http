package br.eti.clairton.repository.vraptor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.eti.clairton.repository.vraptor.Param;

public class ParamTest {
	@Test
	public void testValue() {
		assertEquals("v[][name]", Param.value("name"));
	}

	@Test
	public void testOperation() {
		assertEquals("o[][name]", Param.operation("name"));
	}

	@Test
	public void testValueComplex() {
		assertEquals("o[][aplication.name]", Param.operation("aplication.name"));
	}

	@Test
	public void testOperationComplex() {
		assertEquals("v[][aplication[name]]", Param.value("aplication[name]"));
	}
}
