package com.testeantonio.senha.microservice.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.testeantonio.senha.microservice.SenhaService;
import com.testeantonio.senha.regrasenha.MinimoNoveCaracteres;
import com.testeantonio.senha.regrasenha.MinimoUmCaracterEspecial;
import com.testeantonio.senha.regrasenha.MinimoUmDigito;
import com.testeantonio.senha.regrasenha.MinimoUmaLetraMaiuscula;
import com.testeantonio.senha.regrasenha.MinimoUmaLetraMinuscula;
import com.testeantonio.senha.regrasenha.RegraSenha;
import com.testeantonio.senha.regrasenha.SemRepeticao;

@RunWith(MockitoJUnitRunner.class)
public class SenhaServiceTest {

	@InjectMocks
	private SenhaService senhaService;

	@InjectMocks
	MinimoNoveCaracteres minimoNoveCaracteres;

	@InjectMocks
	MinimoUmaLetraMaiuscula MinimoUmaLetraMaiuscula;

	@InjectMocks
	MinimoUmaLetraMinuscula minimoUmaLetraMinuscula;

	@InjectMocks
	MinimoUmCaracterEspecial minimoUmCaracterEspecial;

	@InjectMocks
	MinimoUmDigito minimoUmDigito;

	@InjectMocks
	SemRepeticao semRepeticao;

	@Test
	public void senhaServiceTest() {

		boolean resultado;
		String senha;

		List<RegraSenha> listaRegras = new ArrayList<RegraSenha>();
		listaRegras.add(minimoNoveCaracteres);
		listaRegras.add(MinimoUmaLetraMaiuscula);
		listaRegras.add(minimoUmaLetraMinuscula);
		listaRegras.add(minimoUmCaracterEspecial);
		listaRegras.add(minimoUmDigito);
		listaRegras.add(semRepeticao);

		senha = "At!1bcdefg";
		senhaService = new SenhaService(listaRegras);
		resultado = senhaService.valida(senha);
		assertTrue(resultado);

		senha = "AA";
		senhaService = new SenhaService(listaRegras);
		resultado = senhaService.valida(senha);
		assertFalse(resultado);

	}

}