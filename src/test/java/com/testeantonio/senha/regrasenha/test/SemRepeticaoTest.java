package com.testeantonio.senha.regrasenha.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.testeantonio.senha.regrasenha.SemRepeticao;

public class SemRepeticaoTest {

	@Test
	public void semRepeticaoTrueTest() {

		String valor = "A";

		SemRepeticao valida = new SemRepeticao();
		boolean resultado = valida.valida(valor);

		assertTrue(resultado);

	}

	@Test
	public void semRepeticaoFalseTest() {

		String valor = "AA";

		SemRepeticao valida = new SemRepeticao();
		boolean resultado = valida.valida(valor);

		assertFalse(resultado);

	}

}