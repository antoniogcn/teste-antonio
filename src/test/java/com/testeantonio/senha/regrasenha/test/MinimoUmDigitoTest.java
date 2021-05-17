package com.testeantonio.senha.regrasenha.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.testeantonio.senha.regrasenha.MinimoUmDigito;

public class MinimoUmDigitoTest {

	@Test
	public void minimoUmDigitoTrueTest() {

		String valor = "1";

		MinimoUmDigito valida = new MinimoUmDigito();
		boolean resultado = valida.valida(valor);

		assertTrue(resultado);

	}

	@Test
	public void minimoUmDigitoFalseTest() {

		String valor = "a";

		MinimoUmDigito valida = new MinimoUmDigito();
		boolean resultado = valida.valida(valor);

		assertFalse(resultado);

	}

}