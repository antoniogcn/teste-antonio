package com.testeantonio.senha.regrasenha.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.testeantonio.senha.regrasenha.MinimoUmCaracterEspecial;

public class MinimoUmCaracterEspecialTest {

	@Test
	public void minimoUmCaracterEspecialTrueTest() {

		String valor = "@";

		MinimoUmCaracterEspecial valida = new MinimoUmCaracterEspecial();
		boolean resultado = valida.valida(valor);

		assertTrue(resultado);

	}

	@Test
	public void minimoUmCaracterEspecialFalseTest() {

		String valor = "a";

		MinimoUmCaracterEspecial valida = new MinimoUmCaracterEspecial();
		boolean resultado = valida.valida(valor);

		assertFalse(resultado);

	}

}