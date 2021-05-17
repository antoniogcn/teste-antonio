package com.testeantonio.senha.regrasenha.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.testeantonio.senha.regrasenha.MinimoNoveCaracteres;

public class MinimoNoveCaracteresTest {

	@Test
	public void minimoNoveCaracteresTrueTest() {

		String valor = "abcdefghi";

		MinimoNoveCaracteres valida = new MinimoNoveCaracteres();
		boolean resultado = valida.valida(valor);

		assertTrue(resultado);

	}

	@Test
	public void minimoNoveCaracteresFalseTest() {

		String valor = "abcd";

		MinimoNoveCaracteres valida = new MinimoNoveCaracteres();
		boolean resultado = valida.valida(valor);

		assertFalse(resultado);

	}

}