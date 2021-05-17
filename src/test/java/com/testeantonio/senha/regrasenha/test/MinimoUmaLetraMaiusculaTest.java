package com.testeantonio.senha.regrasenha.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.testeantonio.senha.regrasenha.MinimoUmaLetraMaiuscula;

public class MinimoUmaLetraMaiusculaTest {

	@Test
	public void minimoUmaLetraMaiusculaTrueTest() {

		String valor = "A";

		MinimoUmaLetraMaiuscula valida = new MinimoUmaLetraMaiuscula();
		boolean resultado = valida.valida(valor);

		assertTrue(resultado);

	}

	@Test
	public void minimoUmaLetraMaiusculaFalseTest() {

		String valor = "a";

		MinimoUmaLetraMaiuscula valida = new MinimoUmaLetraMaiuscula();
		boolean resultado = valida.valida(valor);

		assertFalse(resultado);

	}

}