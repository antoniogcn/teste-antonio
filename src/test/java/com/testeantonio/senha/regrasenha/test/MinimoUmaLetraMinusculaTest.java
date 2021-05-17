package com.testeantonio.senha.regrasenha.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.testeantonio.senha.regrasenha.MinimoUmaLetraMinuscula;

public class MinimoUmaLetraMinusculaTest {

	@Test
	public void minimoUmaLetraMinusculaTrueTest() {

		String valor = "a";

		MinimoUmaLetraMinuscula valida = new MinimoUmaLetraMinuscula();
		boolean resultado = valida.valida(valor);

		assertTrue(resultado);

	}

	@Test
	public void minimoUmaLetraMinusculaFalseTest() {

		String valor = "A";

		MinimoUmaLetraMinuscula valida = new MinimoUmaLetraMinuscula();
		boolean resultado = valida.valida(valor);

		assertFalse(resultado);

	}

}